package X;

import com.bytedance.android.live.uikit.reddot.RedDotStatusChangeEvent;
import com.bytedance.android.livesdk.livesetting.model.LiveMessagePlatformRedDotConfig;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Un6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.uikit.reddot.RedDotManager$decisionAfterPageInit$1$1", f = "RedDotManager.kt", l = {225}, m = "invokeSuspend")
public final class C782700Un6 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;

    public C782700Un6(InterfaceC1364105Vn<? super C782700Un6> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C782700Un6(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int i;
        String str;
        long jLongValue;
        Long lLJIILIIL;
        DataChannel dataChannel;
        C0UX6 c0ux6;
        C0UX6 c0ux62;
        LiveMessagePlatformRedDotConfig liveMessagePlatformRedDotConfig;
        C1C7U.LIZ("RedDotManager@1a7e.decisionAfterPageInit$1$1");
        Object objLJFF = C099R.LJFF();
        int i2 = this.LL;
        if (i2 != 0) {
            if (i2 == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(2000L, this) == objLJFF) {
                C1C7U.LIZIZ("RedDotManager@1a7e.decisionAfterPageInit$1$1");
                return objLJFF;
            }
        }
        HashSet<C0UX6> hashSet = C782710Un7.LJIILLIIL;
        ArrayList arrayList = new ArrayList(hashSet);
        hashSet.clear();
        if (arrayList.isEmpty()) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("RedDotManager@1a7e.decisionAfterPageInit$1$1");
            return unit;
        }
        C782710Un7.LIZ.getClass();
        HashSet<C0UX6> hashSet2 = C782710Un7.LJIILJJIL;
        String currentId = null;
        if (!hashSet2.isEmpty()) {
            if (C782710Un7.LJIIL) {
                StringBuilder sb = new StringBuilder();
                ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(hashSet2, 10));
                Iterator<C0UX6> it2 = hashSet2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(it2.next().getCurrentId());
                }
                sb.append(arrayList2);
                sb.append(" is showing");
                String string = sb.toString();
                ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(((C0UX6) it3.next()).getCurrentId());
                }
                C782710Un7.LJFF(null, string, "AFTER_DECISION", arrayList3.toString());
            }
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("RedDotManager@1a7e.decisionAfterPageInit$1$1");
            return unit2;
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : arrayList) {
            C0UX6 c0ux63 = (C0UX6) obj2;
            C782710Un7 c782710Un7 = C782710Un7.LIZ;
            if (c782710Un7.LIZIZ(c0ux63) && c782710Un7.LIZJ(c0ux63) && c782710Un7.LIZ(c0ux63) && c782710Un7.LIZLLL(c0ux63)) {
                arrayList4.add(obj2);
            }
        }
        if (arrayList4.isEmpty()) {
            Unit unit3 = Unit.LIZ;
            C1C7U.LIZIZ("RedDotManager@1a7e.decisionAfterPageInit$1$1");
            return unit3;
        }
        Iterator it4 = arrayList4.iterator();
        if (it4.hasNext()) {
            Object next = it4.next();
            if (it4.hasNext()) {
                int i3 = ((C0UX6) next).getLiveMessagePlatformRedDotConfig().priority;
                do {
                    Object next2 = it4.next();
                    int i4 = ((C0UX6) next2).getLiveMessagePlatformRedDotConfig().priority;
                    if (i3 > i4) {
                        next = next2;
                        i3 = i4;
                    }
                } while (it4.hasNext());
            }
            C0UX6 c0ux64 = (C0UX6) next;
            HashMap<C0UX8, C782780UnE> map = C782710Un7.LJIIIIZZ;
            C782780UnE c782780UnE = map.get(C782710Un7.LJFF);
            if (c782780UnE != null && (c0ux62 = c782780UnE.LIZLLL) != null && (liveMessagePlatformRedDotConfig = c0ux62.getLiveMessagePlatformRedDotConfig()) != null) {
                i = liveMessagePlatformRedDotConfig.priority;
            } else {
                i = Integer.MAX_VALUE;
            }
            C782780UnE c782780UnE2 = map.get(C782710Un7.LJFF);
            if (c782780UnE2 != null && c782780UnE2.LIZLLL != null && i <= c0ux64.getLiveMessagePlatformRedDotConfig().priority) {
                if (C782710Un7.LJIIL) {
                    C782710Un7 c782710Un72 = C782710Un7.LIZ;
                    StringBuilder sb2 = new StringBuilder("higher priority reddot ");
                    C782780UnE c782780UnE3 = map.get(C782710Un7.LJFF);
                    if (c782780UnE3 != null && (c0ux6 = c782780UnE3.LIZLLL) != null) {
                        currentId = c0ux6.getCurrentId();
                    }
                    sb2.append(currentId);
                    sb2.append(" has shown");
                    String string2 = sb2.toString();
                    c782710Un72.getClass();
                    C782710Un7.LJFF(c0ux64, string2, "AFTER_DECISION", null);
                }
                Unit unit4 = Unit.LIZ;
                C1C7U.LIZIZ("RedDotManager@1a7e.decisionAfterPageInit$1$1");
                return unit4;
            }
            C782710Un7 c782710Un73 = C782710Un7.LIZ;
            c782710Un73.getClass();
            if (!C782710Un7.LJIIL || !InterfaceC1106030et7.Y6.LIZIZ().closeFrequency) {
                Map<String, String> mapLIZIZ = InterfaceC1106030et7.X6.LIZIZ();
                C0UX8 c0ux8 = C782710Un7.LJFF;
                if (c0ux8 != null) {
                    str = c0ux8.page;
                } else {
                    str = null;
                }
                String str2 = mapLIZIZ.get(str);
                if (str2 != null && (lLJIILIIL = C2095008Iq.LJIILIIL(str2)) != null) {
                    jLongValue = lLJIILIIL.longValue();
                } else {
                    jLongValue = 0;
                }
                if (!(!C770620UKu.LIZ(jLongValue, System.currentTimeMillis()))) {
                    c782710Un73.getClass();
                    C782710Un7.LJFF(c0ux64, "frequency check", "AFTER_DECISION", null);
                    Unit unit5 = Unit.LIZ;
                    C1C7U.LIZIZ("RedDotManager@1a7e.decisionAfterPageInit$1$1");
                    return unit5;
                }
            }
            c782710Un73.getClass();
            C782710Un7.LJFF(c0ux64, "will show", "AFTER_DECISION", null);
            C782780UnE c782780UnE4 = map.get(C782710Un7.LJFF);
            if (c782780UnE4 != null && (dataChannel = c782780UnE4.LIZJ) != null) {
                C782710Un7.LJIILL = c0ux64;
                dataChannel.LC0(RedDotStatusChangeEvent.class, new C782820UnI(c0ux64, true));
                C0UX6[] c0ux6ArrValues = C0UX6.values();
                ArrayList<C0UX6> arrayList5 = new ArrayList();
                for (C0UX6 c0ux65 : c0ux6ArrValues) {
                    if (C13LQ.LJIILLIIL(C782710Un7.LJFF, c0ux65.getLivePage())) {
                        arrayList5.add(c0ux65);
                    }
                }
                for (C0UX6 c0ux66 : arrayList5) {
                    String[] ids = c0ux66.getIds();
                    int length = ids.length;
                    int i5 = 0;
                    while (true) {
                        if (i5 < length) {
                            String str3 = ids[i5];
                            List<String> list = c0ux64.getLiveMessagePlatformRedDotConfig().outLayerList;
                            if (list != null && list.contains(str3)) {
                                c0ux66.setCurrentId(str3);
                                dataChannel.LC0(RedDotStatusChangeEvent.class, new C782820UnI(c0ux66, true));
                                break;
                            }
                            i5++;
                        }
                    }
                }
            }
            Unit unit6 = Unit.LIZ;
            C1C7U.LIZIZ("RedDotManager@1a7e.decisionAfterPageInit$1$1");
            return unit6;
        }
        throw new NoSuchElementException();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C782700Un6(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}

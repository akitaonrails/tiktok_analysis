package X;

import com.bytedance.android.live.uikit.reddot.RedDotStatusChangeEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Un9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.uikit.reddot.RedDotManager$notifyRedDotShowStatus$2$1", f = "RedDotManager.kt", l = {}, m = "invokeSuspend")
public final class C782730Un9 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ DataChannel LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C782730Un9(DataChannel dataChannel, InterfaceC1364105Vn<? super C782730Un9> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = dataChannel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C782730Un9(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RedDotManager@1a7e.notifyRedDotShowStatus$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C782710Un7 c782710Un7 = C782710Un7.LIZ;
        if (C782710Un7.LJIIIIZZ(c782710Un7) != null && (!r0.isEmpty())) {
            HashSet hashSet = new HashSet();
            ConcurrentHashMap concurrentHashMapLJIIIIZZ = C782710Un7.LJIIIIZZ(c782710Un7);
            if (concurrentHashMapLJIIIIZZ != null) {
                DataChannel dataChannel = this.LL;
                for (Map.Entry entry : concurrentHashMapLJIIIIZZ.entrySet()) {
                    if (C782710Un7.LJ || ((C0UX6) entry.getValue()).isDynamic()) {
                        Object value = entry.getValue();
                        if (!hashSet.contains(value)) {
                            dataChannel.LC0(RedDotStatusChangeEvent.class, new C782820UnI((C0UX6) entry.getValue(), true));
                            hashSet.add(value);
                            C782710Un7 c782710Un72 = C782710Un7.LIZ;
                            C0UX6 c0ux6 = (C0UX6) entry.getValue();
                            c782710Un72.getClass();
                            C782710Un7.LJFF(c0ux6, "post event to show", "INTERCEPT", null);
                        }
                    }
                }
            }
            if (C782710Un7.LJ) {
                C0UX6[] c0ux6ArrValues = C0UX6.values();
                ArrayList<C0UX6> arrayList = new ArrayList();
                for (C0UX6 c0ux62 : c0ux6ArrValues) {
                    if (C13LQ.LJIILLIIL(C782710Un7.LJFF, c0ux62.getLivePage())) {
                        arrayList.add(c0ux62);
                    }
                }
                DataChannel dataChannel2 = this.LL;
                for (C0UX6 c0ux63 : arrayList) {
                    String[] ids = c0ux63.getIds();
                    int length = ids.length;
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            String str = ids[i];
                            HashSet hashSetLJII = C782710Un7.LJII(C782710Un7.LIZ);
                            if (hashSetLJII != null && hashSetLJII.contains(str)) {
                                if (!hashSet.contains(c0ux63)) {
                                    dataChannel2.LC0(RedDotStatusChangeEvent.class, new C782820UnI(c0ux63, true));
                                    hashSet.add(c0ux63);
                                }
                            } else {
                                i++;
                            }
                        }
                    }
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("RedDotManager@1a7e.notifyRedDotShowStatus$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

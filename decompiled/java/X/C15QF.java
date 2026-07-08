package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.pugc.PUgcSlotData;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.15QF, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.pugc.PUgcTemplateEditPreviewScene$initView$3$r2$1", f = "PUgcTemplateEditPreviewScene.kt", l = {}, m = "invokeSuspend")
public final class C15QF extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C15QK LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15QF(C15QK c15qk, InterfaceC1364105Vn<? super C15QF> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c15qk;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C15QF(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int i;
        int iIntValue;
        int iIntValue2;
        C1C7U.LIZ("PUgcTemplateEditPreviewScene@ba2a.initView$3$r2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C15QK c15qk = this.LL;
        C15QD c15qd = c15qk.LLLLII;
        if (c15qd == null) {
            c15qd = null;
        }
        List<PUgcSlotData> list = c15qk.LLJJIJIL;
        boolean zIsChecked = c15qk.LLLLLIL().isChecked();
        boolean zLLLLIIIILLL = this.LL.LLLLIIIILLL();
        VideoPublishEditModel videoPublishEditModel = this.LL.LLJJ;
        if (videoPublishEditModel == null) {
            videoPublishEditModel = null;
        }
        boolean z = videoPublishEditModel.creativeModel.publishModel.bindFreezeFrameSlot;
        ((ArrayList) c15qd.LLILLJJLI).clear();
        List<PUgcSlotData> list2 = c15qd.LLILLJJLI;
        Iterator<PUgcSlotData> it2 = list.iterator();
        while (true) {
            i = 0;
            if (!it2.hasNext()) {
                break;
            }
            PUgcSlotData next = it2.next();
            if (next.fd == null) {
                String str = next.reverseOriginPath;
                if (str == null || str.length() == 0) {
                    str = next.videoPath;
                }
                if (next.LIZ()) {
                    String str2 = next.freezeOriginPath;
                    if (str2 != null && str2.length() != 0) {
                        str = str2;
                    }
                    if (str == null) {
                        str = next.videoPath;
                    }
                } else {
                    String str3 = next.magicOriginPath;
                    if (str3 != null && str3.length() != 0) {
                        str = str3;
                    }
                    if (str == null) {
                        str = next.videoPath;
                    }
                }
                next.fd = C2471909mP.LIZ.LJI(str);
            }
        }
        ((ArrayList) list2).addAll(list);
        ((LinkedHashMap) C15QD.LLIZ).clear();
        ((LinkedHashMap) C15QD.LLIZLLLIL).clear();
        List<PUgcSlotData> list3 = c15qd.LLILLJJLI;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : (ArrayList) list3) {
            if (((PUgcSlotData) obj2).fd != null) {
                arrayList.add(obj2);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj3 : arrayList) {
            Pair<String, Long> pair = ((PUgcSlotData) obj3).fd;
            Object arrayList2 = linkedHashMap.get(pair);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(pair, arrayList2);
            }
            ((List) arrayList2).add(obj3);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (((List) entry.getValue()).size() > 1) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        for (Object obj4 : linkedHashMap2.entrySet()) {
            int i2 = i + 1;
            if (i >= 0) {
                Map.Entry entry2 = (Map.Entry) obj4;
                if (i < 10) {
                    Map<Pair<String, Long>, Integer> map = C15QD.LLIZ;
                    Object key = entry2.getKey();
                    if (key != null) {
                        Integer num = (Integer) C13LP.LJJJLZIJ(i, C15QD.LLJ);
                        if (num != null) {
                            iIntValue2 = num.intValue();
                        } else {
                            iIntValue2 = R.attr.a09;
                        }
                        map.put((Pair<String, Long>) key, Integer.valueOf(iIntValue2));
                    } else {
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                } else if (i < 20) {
                    Map<Pair<String, Long>, Integer> map2 = C15QD.LLIZLLLIL;
                    Object key2 = entry2.getKey();
                    if (key2 != null) {
                        Integer num2 = (Integer) C13LP.LJJJLZIJ(i - 10, C15QD.LLJI);
                        if (num2 != null) {
                            iIntValue = num2.intValue();
                        } else {
                            iIntValue = -19024;
                        }
                        map2.put((Pair<String, Long>) key2, Integer.valueOf(iIntValue));
                    } else {
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                } else {
                    continue;
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        c15qd.LLILLL = zLLLLIIIILLL;
        c15qd.LLILZ = zIsChecked;
        c15qd.LLILZIL = z;
        c15qd.notifyDataSetChanged();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PUgcTemplateEditPreviewScene@ba2a.initView$3$r2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

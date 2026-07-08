package X;

import android.content.Context;
import android.graphics.Typeface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Qum, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C685540Qum {
    public static C21419418s4 LIZ(C1860130yVP c1860130yVP, C685530Qul c685530Qul, boolean z, EnumC682700QqC enumC682700QqC) {
        Map<C14S3, Integer> map;
        C14S0 c14s0;
        float fFloatValue;
        int iIntValue;
        int iIntValue2;
        int iLIZIZ;
        int iLIZIZ2;
        int iIntValue3;
        C689240R1u c689240R1u = C689240R1u.LIZ;
        Context context = c1860130yVP.getContext();
        c689240R1u.getClass();
        int i = 0;
        C21419418s4 c21419418s4LIZ = C689240R1u.LIZ(c689240R1u, C689240R1u.LJ(context, null), z, c1860130yVP.getContext(), false, enumC682700QqC, 4);
        C689290R1z c689290R1z = c21419418s4LIZ.LJJIJL;
        if (c689290R1z == null || (map = c689290R1z.LIZIZ) == null) {
            map = c685530Qul.LLJILJIL;
        }
        Typeface typeface = c685530Qul.LLJI;
        if (typeface == null) {
            typeface = c21419418s4LIZ.LJIL;
        }
        List<Integer> list = c685530Qul.LLJIJIL;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<Integer> it2 = list.iterator();
        while (true) {
            C689290R1z c689290R1z2 = null;
            if (it2.hasNext()) {
                Integer next = it2.next();
                int i2 = i + 1;
                if (i >= 0) {
                    Integer num = next;
                    if (num != null) {
                        iIntValue3 = num.intValue();
                    } else {
                        Integer num2 = (Integer) C444200HbO.LIZ(i, c21419418s4LIZ.LJIJ);
                        if (num2 != null) {
                            iIntValue3 = num2.intValue();
                        } else {
                            iIntValue3 = 0;
                        }
                    }
                    arrayList.add(Integer.valueOf(iIntValue3));
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            } else {
                if (c21419418s4LIZ.LJIILL != null) {
                    Integer num3 = c685530Qul.LLILZLL;
                    if (num3 != null) {
                        iIntValue2 = num3.intValue();
                    } else {
                        iIntValue2 = 0;
                    }
                    Integer num4 = c685530Qul.LLIZ;
                    if (num4 != null) {
                        iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(num4));
                    } else {
                        iLIZIZ = 0;
                    }
                    Integer num5 = c685530Qul.LLIZLLLIL;
                    if (num5 != null) {
                        iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(num5));
                    } else {
                        iLIZIZ2 = 0;
                    }
                    c14s0 = new C14S0(iIntValue2, iLIZIZ2, iLIZIZ, !Intrinsics.LJFF(c685530Qul.LLJ, Boolean.FALSE), true);
                } else {
                    c14s0 = null;
                }
                boolean zLJFF = Intrinsics.LJFF(c685530Qul.LLJILJILJ, Boolean.TRUE);
                boolean zLIZ = C301280BrS.LIZ();
                Float f = c685530Qul.LLJJI;
                if (f != null) {
                    fFloatValue = f.floatValue();
                } else {
                    fFloatValue = c21419418s4LIZ.LJIIJJI;
                }
                C689290R1z c689290R1z3 = c21419418s4LIZ.LJJIJL;
                if (c689290R1z3 != null) {
                    Map<C14S3, Integer> map2 = c685530Qul.LLJILJIL;
                    ArrayList arrayList2 = new ArrayList(map2.size());
                    for (Map.Entry<C14S3, Integer> entry : map2.entrySet()) {
                        C14S3 key = entry.getKey();
                        Integer value = entry.getValue();
                        if (value != null) {
                            iIntValue = value.intValue();
                        } else {
                            Integer num6 = map.get(entry.getKey());
                            if (num6 != null) {
                                iIntValue = num6.intValue();
                            } else {
                                iIntValue = 0;
                            }
                        }
                        arrayList2.add(new Pair(key, Integer.valueOf(iIntValue)));
                    }
                    c689290R1z2 = new C689290R1z(c689290R1z3.LIZ, (Map<C14S3, Integer>) C2097608Jq.LJIILLIIL(arrayList2), c689290R1z3.LIZJ);
                }
                return C21419418s4.LIZ(c21419418s4LIZ, null, 0, false, fFloatValue, 0, 0, 0, c14s0, null, arrayList, null, null, typeface, false, null, 0, false, false, 0, false, null, null, false, c689290R1z2, null, null, zLIZ, zLJFF, false, null, null, null, null, c685530Qul.LLJJJIL, false, false, null, null, false, false, false, false, null, -4491265, 16760431);
            }
        }
    }
}

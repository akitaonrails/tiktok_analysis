package X;

import android.view.ViewGroup;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Kwt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC533970Kwt implements C0RG7 {
    public static final List<Float> LL = C1697810uHb.LJIILJJIL(Float.valueOf(0.15f), Float.valueOf(0.12f), Float.valueOf(0.1f), Float.valueOf(0.08f), Float.valueOf(0.06f), Float.valueOf(0.04f), Float.valueOf(0.02f));
    public static final Map<String, Float> LLILLJJLI = new LinkedHashMap();

    public abstract boolean LJFF(C533990Kwv c533990Kwv);

    public static C533990Kwv LJ(C533990Kwv c533990Kwv) {
        int i = c533990Kwv.LIZ;
        int i2 = c533990Kwv.LIZIZ;
        if (i > 0 && i2 > 0) {
            double d = ((double) i) / ((double) i2);
            int i3 = c533990Kwv.LIZJ;
            int i4 = c533990Kwv.LIZLLL;
            if (i3 > 0 && i4 > 0) {
                if (d > ((double) i3) / ((double) i4)) {
                    i4 = (i3 * i2) / i;
                } else {
                    i3 = (i4 * i) / i2;
                }
                return new C533990Kwv(i, i2, i3, i4);
            }
            return c533990Kwv;
        }
        return c533990Kwv;
    }

    @Override // X.C0RG7
    public final void LIZ(ViewGroup viewGroup, InterfaceC533950Kwr interfaceC533950Kwr) {
        C533960Kws c533960Kws = new C533960Kws(viewGroup.getContext());
        Iterator it2 = ((ArrayList) c533960Kws.LL).iterator();
        while (true) {
            if (it2.hasNext()) {
                if (Intrinsics.LJFF(((Reference) it2.next()).get(), interfaceC533950Kwr)) {
                    break;
                }
            } else {
                ((ArrayList) c533960Kws.LL).add(new WeakReference(interfaceC533950Kwr));
                break;
            }
        }
        viewGroup.addView(c533960Kws, new ViewGroup.LayoutParams(-1, -1));
    }

    @Override // X.C0RG7
    public final void LIZJ(String str, C533990Kwv c533990Kwv) {
        int iIntValue;
        Float next;
        float fFloatValue;
        int i;
        if (LJFF(c533990Kwv) && str != null) {
            Map<String, Float> map = LLILLJJLI;
            if (!map.containsKey(str)) {
                C533990Kwv c533990KwvLJ = LJ(c533990Kwv);
                if (c533990Kwv.LIZJ > 0 && (i = c533990Kwv.LIZLLL) > 0) {
                    float f = (c533990KwvLJ.LIZJ * c533990KwvLJ.LIZLLL) / (r4 * i);
                    if (f < 1.0f && f >= 0.8d) {
                        map.put(str, Float.valueOf(1 - f));
                    }
                }
            }
            if (map.size() >= 100) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
                    Iterator<Float> it2 = LL.iterator();
                    while (true) {
                        iIntValue = 0;
                        if (it2.hasNext()) {
                            next = it2.next();
                            if (((Number) entry.getValue()).floatValue() >= next.floatValue()) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    Float f2 = next;
                    if (f2 != null) {
                        fFloatValue = f2.floatValue();
                    } else {
                        fFloatValue = 0.0f;
                    }
                    Integer num = (Integer) linkedHashMap.get(Float.valueOf(fFloatValue));
                    if (num != null) {
                        iIntValue = num.intValue();
                    }
                    linkedHashMap.put(Float.valueOf(fFloatValue), Integer.valueOf(iIntValue + 1));
                }
                for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    c2344009Gk.LIZIZ(((Number) entry2.getKey()).floatValue(), "black_border_ratio_scope");
                    c2344009Gk.LIZJ(((Number) entry2.getValue()).intValue(), "frequency");
                    C20684815ws.LJIILLIIL("tablet_feed_resize_info", c2344009Gk.LIZ);
                }
                ((LinkedHashMap) LLILLJJLI).clear();
            }
        }
    }
}

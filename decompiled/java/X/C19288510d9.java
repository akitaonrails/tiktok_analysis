package X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.10d9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19288510d9 {
    public final HashMap<Integer, AbstractC19288610dA> LIZ = new HashMap<>();
    public boolean LIZIZ;
    public boolean LIZJ;

    public final void LIZ(String str) {
        if (this.LIZIZ) {
            return;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        TreeMap treeMap = new TreeMap(this.LIZ);
        AbstractC19288610dA abstractC19288610dA = (AbstractC19288610dA) treeMap.get(0);
        if (abstractC19288610dA != null) {
            float f = abstractC19288610dA.LIZIZ;
            Iterator it2 = treeMap.entrySet().iterator();
            String str2 = "scan_open_camera_duration";
            boolean z = true;
            while (it2.hasNext()) {
                AbstractC19288610dA abstractC19288610dA2 = (AbstractC19288610dA) ((Map.Entry) it2.next()).getValue();
                if (abstractC19288610dA2.LIZIZ < f) {
                    z = false;
                }
                if (abstractC19288610dA2 instanceof C19289010dE) {
                    c2344009Gk.LIZIZ(abstractC19288610dA2.LIZIZ - f, str2);
                } else if (abstractC19288610dA2 instanceof C19289110dF) {
                    c2344009Gk.LIZIZ(abstractC19288610dA2.LIZIZ - f, str2);
                } else if (abstractC19288610dA2 instanceof C19288710dB) {
                    C19288710dB c19288710dB = (C19288710dB) abstractC19288610dA2;
                    c2344009Gk.LIZIZ(c19288710dB.LIZIZ - f, str2);
                    c2344009Gk.LJFF("type", c19288710dB.LIZLLL.toString());
                } else if (abstractC19288610dA2 instanceof C19288410d8) {
                    C19288410d8 c19288410d8 = (C19288410d8) abstractC19288610dA2;
                    c2344009Gk.LIZIZ(c19288410d8.LIZIZ - f, str2);
                    EnumC041200Cs enumC041200Cs = c19288410d8.LIZLLL;
                    if (enumC041200Cs != null) {
                        c2344009Gk.LJFF("type", enumC041200Cs.toString());
                    }
                    Boolean bool = c19288410d8.LJ;
                    if (bool != null) {
                        boolean zBooleanValue = bool.booleanValue();
                        c2344009Gk.LJ(Boolean.valueOf(zBooleanValue), "invalid_qrcode");
                        this.LIZJ = zBooleanValue;
                    }
                }
                f = abstractC19288610dA2.LIZIZ;
                str2 = abstractC19288610dA2.LIZJ;
            }
            this.LIZ.clear();
            c2344009Gk.LJ(Boolean.valueOf(z), "isValid");
            C20684815ws.LJIILLIIL(str, c2344009Gk.LIZ);
            if (Intrinsics.LJFF(str, "scan_qrcode_success_with_performance_time") && !this.LIZJ) {
                this.LIZIZ = true;
            }
        }
    }

    public final void LIZIZ(AbstractC19288610dA abstractC19288610dA) {
        this.LIZ.put(Integer.valueOf(abstractC19288610dA.LIZ), abstractC19288610dA);
    }
}

package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import kotlin.Unit;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0ovt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1492150ovt {
    public final AbstractC1491750ovF LIZ;
    public final String LIZIZ;
    public final Map<String, Long> LIZJ;
    public final String LIZLLL;

    public final void LIZIZ() {
        String str = this.LIZLLL;
        if (!(!a0.LJJJIL(str)) || str == null) {
            str = "res_load_";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append("finish");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (this.LIZJ.containsKey(strLIZIZ)) {
            return;
        }
        try {
            this.LIZJ.put(strLIZIZ, Long.valueOf(System.currentTimeMillis()));
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        AbstractC1491750ovF abstractC1491750ovF = this.LIZ;
        if (abstractC1491750ovF != null) {
            abstractC1491750ovF.LIZ("end");
        }
    }

    public final void LJ() {
        String str = this.LIZLLL;
        if (!(!a0.LJJJIL(str)) || str == null) {
            str = "res_load_";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append("start");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (this.LIZJ.containsKey(strLIZIZ)) {
            return;
        }
        try {
            this.LIZJ.put(strLIZIZ, Long.valueOf(System.currentTimeMillis()));
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        AbstractC1491750ovF abstractC1491750ovF = this.LIZ;
        if (abstractC1491750ovF != null) {
            abstractC1491750ovF.LIZ("start");
        }
    }

    public final C1492150ovt LIZ(String str) {
        C1491740ovE c1491740ovELIZIZ;
        AbstractC1491750ovF abstractC1491750ovF = this.LIZ;
        if (abstractC1491750ovF != null) {
            c1491740ovELIZIZ = abstractC1491750ovF.LIZIZ(str);
        } else {
            c1491740ovELIZIZ = null;
        }
        String str2 = this.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(str);
        return new C1492150ovt(c1491740ovELIZIZ, str2, C2188811AlT.LIZIZ(sbLIZ), this.LIZJ);
    }

    public final void LIZJ(String... strArr) {
        C1491740ovE c1491740ovELIZIZ;
        long jCurrentTimeMillis = System.currentTimeMillis();
        for (String str : strArr) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.LIZLLL);
            sbLIZ.append(str);
            sbLIZ.append("_finish");
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            if (this.LIZJ.containsKey(strLIZIZ)) {
                return;
            }
            try {
                this.LIZJ.put(strLIZIZ, Long.valueOf(jCurrentTimeMillis));
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
            AbstractC1491750ovF abstractC1491750ovF = this.LIZ;
            if (abstractC1491750ovF != null && (c1491740ovELIZIZ = abstractC1491750ovF.LIZIZ(str)) != null) {
                c1491740ovELIZIZ.LIZ("end");
            }
        }
    }

    public final void LIZLLL(String... strArr) {
        C1491740ovE c1491740ovELIZIZ;
        long jCurrentTimeMillis = System.currentTimeMillis();
        for (String str : strArr) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.LIZLLL);
            sbLIZ.append(str);
            sbLIZ.append("_start");
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            if (this.LIZJ.containsKey(strLIZIZ)) {
                return;
            }
            try {
                this.LIZJ.put(strLIZIZ, Long.valueOf(jCurrentTimeMillis));
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
            AbstractC1491750ovF abstractC1491750ovF = this.LIZ;
            if (abstractC1491750ovF != null && (c1491740ovELIZIZ = abstractC1491750ovF.LIZIZ(str)) != null) {
                c1491740ovELIZIZ.LIZ("start");
            }
        }
    }

    public final void LJII(long j) {
        String str = this.LIZLLL;
        if (!(!a0.LJJJIL(str)) || str == null) {
            str = "res_load_";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append("start");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (this.LIZJ.containsKey(strLIZIZ)) {
            return;
        }
        try {
            this.LIZJ.put(strLIZIZ, Long.valueOf(j));
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        AbstractC1491750ovF abstractC1491750ovF = this.LIZ;
        if (abstractC1491750ovF != null) {
            abstractC1491750ovF.LIZJ(j, "start");
        }
    }

    public final void LJFF(long j, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (this.LIZJ.containsKey(strLIZIZ)) {
            return;
        }
        try {
            this.LIZJ.put(strLIZIZ, Long.valueOf(j));
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        AbstractC1491750ovF abstractC1491750ovF = this.LIZ;
        if (abstractC1491750ovF != null) {
            abstractC1491750ovF.LIZJ(j, str);
        }
    }

    public final void LJI(long j, String str) {
        C1491740ovE c1491740ovELIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(str);
        sbLIZ.append("_start");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (this.LIZJ.containsKey(strLIZIZ)) {
            return;
        }
        try {
            this.LIZJ.put(strLIZIZ, Long.valueOf(j));
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        AbstractC1491750ovF abstractC1491750ovF = this.LIZ;
        if (abstractC1491750ovF != null && (c1491740ovELIZIZ = abstractC1491750ovF.LIZIZ(str)) != null) {
            c1491740ovELIZIZ.LIZJ(j, "start");
        }
    }

    public C1492150ovt(AbstractC1491750ovF abstractC1491750ovF, String str, String str2, Map<String, Long> map) {
        this.LIZ = abstractC1491750ovF;
        this.LIZIZ = str;
        this.LIZJ = map;
        if (str2.length() != 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str2);
            sbLIZ.append('_');
            str2 = C2188811AlT.LIZIZ(sbLIZ);
        }
        this.LIZLLL = str2;
    }
}

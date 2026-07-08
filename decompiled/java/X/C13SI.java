package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.13SI, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13SI {
    public final String LIZ;
    public boolean LIZJ;
    public C13SK LIZLLL;
    public final /* synthetic */ C13SG LJI;
    public List<Long> LIZIZ = new ArrayList();
    public List<Long> LJ = new ArrayList();
    public String LJFF = "panel_";

    public final String LIZJ() {
        StringBuilder sb = new StringBuilder();
        Iterator<Long> it2 = this.LIZIZ.iterator();
        while (it2.hasNext()) {
            long jLongValue = it2.next().longValue();
            sb.append(' ');
            sb.append(jLongValue);
        }
        return sb.toString();
    }

    public final String LIZLLL() {
        StringBuilder sb = new StringBuilder();
        Iterator<Long> it2 = this.LJ.iterator();
        while (it2.hasNext()) {
            long jLongValue = it2.next().longValue();
            sb.append(' ');
            sb.append(jLongValue);
        }
        return sb.toString();
    }

    public static void LJ(String[] strArr) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("unexpected journal line: ");
        sbLIZ.append(strArr);
        throw new Exception(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final C13M9 LIZ(int i) {
        if (i == 0) {
            return new C13M9(this.LJI.LIZ).LIZ(this.LIZ);
        }
        C13M9 c13m9 = new C13M9(this.LJI.LIZ);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZ);
        sbLIZ.append('.');
        sbLIZ.append(i);
        return c13m9.LIZ(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final C13M9 LIZIZ(int i) {
        if (i == 0) {
            C13M9 c13m9 = new C13M9(this.LJI.LIZ);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.LIZ);
            sbLIZ.append(".tmp");
            return c13m9.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        }
        C13M9 c13m92 = new C13M9(this.LJI.LIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(this.LIZ);
        sbLIZ2.append('.');
        sbLIZ2.append(i);
        sbLIZ2.append(".tmp");
        return c13m92.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
    }

    public final void LJFF(String[] strArr) {
        if (strArr.length == this.LJI.LIZJ) {
            try {
                int length = strArr.length;
                for (int i = 0; i < length; i++) {
                    ListProtector.set(this.LIZIZ, i, Long.valueOf(CastLongProtector.parseLong(strArr[i])));
                }
                return;
            } catch (NumberFormatException e) {
                TryCatchGuardChecker.doCheck(e);
                LJ(strArr);
                throw null;
            }
        }
        LJ(strArr);
        throw null;
    }

    public C13SI(C13SG c13sg, String str) {
        this.LJI = c13sg;
        this.LIZ = str;
        int i = c13sg.LIZJ;
        for (int i2 = 0; i2 < i; i2++) {
            this.LIZIZ.add(0L);
            this.LJ.add(0L);
        }
    }
}

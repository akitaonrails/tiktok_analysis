package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.07WE, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07WE {
    public final boolean LIZ;
    public final List<String> LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;

    public final String LIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZJ);
        sbLIZ.append('-');
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append('-');
        sbLIZ.append(this.LJ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C07WE(String str) {
        boolean z;
        String str2;
        String str3;
        List<String> listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{"-"}, 0, 6);
        this.LIZIZ = listLJJLIIIJILLIZJL;
        if (listLJJLIIIJILLIZJL.size() >= 4) {
            z = true;
        } else {
            z = false;
        }
        this.LIZ = z;
        if (!z) {
            str2 = "";
        } else {
            str2 = (String) ListProtector.get(listLJJLIIIJILLIZJL, 0);
        }
        this.LIZJ = str2;
        if (!z) {
            str3 = "";
        } else {
            str3 = (String) ListProtector.get(listLJJLIIIJILLIZJL, 1);
        }
        this.LIZLLL = str3;
        this.LJ = z ? (String) ListProtector.get(listLJJLIIIJILLIZJL, 2) : "";
        if (z) {
            ListProtector.get(listLJJLIIIJILLIZJL, 3);
        }
    }
}

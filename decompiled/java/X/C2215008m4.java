package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* JADX INFO: renamed from: X.08m4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2215008m4 {
    public final List<InterfaceC2214908m3> LIZ;
    public final int LIZIZ;
    public final C2214808m2 LIZJ;
    public int LIZLLL;

    public final C2214808m2 LIZ(C2214808m2 c2214808m2) {
        String string;
        if (this.LIZIZ >= this.LIZ.size()) {
            if (c2214808m2.LIZ == null && c2214808m2.LIZJ != null) {
                String str = c2214808m2.LIZIZ;
                if (str != null && !str.isEmpty()) {
                    String strLIZIZ = c2214808m2.LIZIZ;
                    String strLIZIZ2 = c2214808m2.LIZJ;
                    if (!strLIZIZ2.isEmpty() && !strLIZIZ2.equals("/")) {
                        if (strLIZIZ2.charAt(0) == '/') {
                            if (!strLIZIZ.equals("/")) {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append(strLIZIZ);
                                sbLIZ.append(strLIZIZ2);
                                strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ);
                            }
                        } else if (strLIZIZ.equals("/")) {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append(strLIZIZ);
                            sbLIZ2.append(strLIZIZ2);
                            strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                        } else {
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append(strLIZIZ);
                            sbLIZ3.append('/');
                            sbLIZ3.append(strLIZIZ2);
                            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
                            strLIZIZ2 = strLIZIZ;
                        }
                        c2214808m2.LIZ = strLIZIZ2;
                    } else {
                        strLIZIZ2 = strLIZIZ;
                        c2214808m2.LIZ = strLIZIZ2;
                    }
                } else {
                    c2214808m2.LIZ = c2214808m2.LIZJ;
                    return c2214808m2;
                }
            }
            return c2214808m2;
        }
        int i = this.LIZLLL + 1;
        this.LIZLLL = i;
        if (i <= 1) {
            List<InterfaceC2214908m3> list = this.LIZ;
            int i2 = this.LIZIZ;
            C2215008m4 c2215008m4 = new C2215008m4(list, i2 + 1, c2214808m2);
            InterfaceC2214908m3 interfaceC2214908m3 = (InterfaceC2214908m3) ListProtector.get(list, i2);
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("FileResolver = ");
            if (interfaceC2214908m3 != null) {
                string = interfaceC2214908m3.toString();
            } else {
                string = "";
            }
            sbLIZ4.append(string);
            sbLIZ4.append(" file = ");
            sbLIZ4.append(c2214808m2.LIZ);
            C2188811AlT.LIZIZ(sbLIZ4);
            C2214808m2 c2214808m2LIZ = interfaceC2214908m3.LIZ(c2215008m4);
            if (c2214808m2LIZ != null) {
                if (c2214808m2LIZ.LIZ != null) {
                    return c2214808m2LIZ;
                }
                C2215408m8.LIZ.getClass();
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("resolver ");
                sbLIZ5.append(interfaceC2214908m3);
                sbLIZ5.append(" returned a file with no body");
                throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ5));
            }
            C2215408m8.LIZ.getClass();
            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
            sbLIZ6.append("resolver ");
            sbLIZ6.append(interfaceC2214908m3);
            sbLIZ6.append(" returned null");
            throw new NullPointerException(C2188811AlT.LIZIZ(sbLIZ6));
        }
        C2215408m8.LIZ.getClass();
        StringBuilder sbLIZ7 = C2188811AlT.LIZ();
        sbLIZ7.append("FileResolver ");
        sbLIZ7.append(ListProtector.get(this.LIZ, this.LIZIZ - 1));
        sbLIZ7.append(" must call handle() exactly once");
        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ7));
    }

    public C2215008m4(List<InterfaceC2214908m3> list, int i, C2214808m2 c2214808m2) {
        this.LIZ = list;
        this.LIZIZ = i;
        this.LIZJ = c2214808m2;
    }
}

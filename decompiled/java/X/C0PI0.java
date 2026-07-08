package X;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PI0, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PI0 {
    public static void LIZ(C0PHT c0pht, String str) {
        String str2;
        String str3;
        C0PHX c0phx;
        C0PHX c0phx2 = c0pht.LIZ;
        String str4 = c0pht.LIZJ;
        C0PHW c0phw = c0pht.LJ;
        if (c0phw != null && (c0phx = c0phw.LIZJ) != null) {
            c0phx.LJ();
            str2 = c0phx.LJIIIZ;
        } else {
            str2 = null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Stream State when ");
        sbLIZ.append(str);
        sbLIZ.append(": \r\n ... \r\n");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        int i = 0;
        int i2 = 0;
        while (c0phx2 != null) {
            i++;
            if (!c0phx2.LIZJ) {
                c0phx2 = c0phx2.LIZLLL;
            } else {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(strLIZIZ);
                sbLIZ2.append("id: ");
                c0phx2.LJ();
                sbLIZ2.append(c0phx2.LJIIIZ);
                sbLIZ2.append(' ');
                String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(strLIZIZ2);
                sbLIZ3.append("inner: [");
                String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ3);
                c0phx2.LJ();
                for (C0PHW c0phw2 : (ArrayList) c0phx2.LJIIJJI) {
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append(strLIZIZ3);
                    sbLIZ4.append(c0phw2.LIZ);
                    sbLIZ4.append(' ');
                    strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ4);
                    i2++;
                }
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append(strLIZIZ3);
                c0phx2.LJ();
                if (Intrinsics.LJFF(str2, c0phx2.LJIIIZ)) {
                    str3 = "] <--- backCursor \r\n";
                } else {
                    c0phx2.LJ();
                    if (Intrinsics.LJFF(str4, c0phx2.LJIIIZ)) {
                        str3 = "] <--- entryCursor \r\n";
                    } else {
                        str3 = "]\r\n";
                    }
                }
                sbLIZ5.append(str3);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ5);
                c0phx2 = c0phx2.LIZLLL;
            }
        }
        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
        sbLIZ6.append(strLIZIZ);
        sbLIZ6.append("out count: ");
        sbLIZ6.append(i);
        String strLIZIZ4 = C2188811AlT.LIZIZ(sbLIZ6);
        StringBuilder sbLIZ7 = C2188811AlT.LIZ();
        sbLIZ7.append(strLIZIZ4);
        sbLIZ7.append("expanded inner count: ");
        sbLIZ7.append(i2);
        C2188811AlT.LIZIZ(sbLIZ7);
    }

    public static void LIZIZ(C0PHT c0pht, String str) {
        C0PHX c0phx;
        String str2;
        C0PHW c0phwLJ;
        C0PHW c0phw = c0pht.LJ;
        String str3 = null;
        if (c0phw != null && (c0phwLJ = c0phw.LJ()) != null) {
            c0phx = c0phwLJ.LIZJ;
            if (c0phx != null) {
                c0phx.LJ();
                str3 = c0phx.LJIIIZ;
            }
        } else {
            c0phx = null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Stream inner when ");
        sbLIZ.append(str);
        sbLIZ.append(": \r\n ... \r\n");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        while (c0phx != null && c0phx.LJ != null) {
            c0phx = c0phx.LJ;
        }
        int i = 0;
        int i2 = 0;
        while (c0phx != null) {
            i++;
            if (!c0phx.LIZJ) {
                c0phx = c0phx.LIZLLL;
            } else {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(strLIZIZ);
                sbLIZ2.append("id: ");
                c0phx.LJ();
                sbLIZ2.append(c0phx.LJIIIZ);
                sbLIZ2.append(' ');
                String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(strLIZIZ2);
                sbLIZ3.append("inner: [");
                String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ3);
                c0phx.LJ();
                for (C0PHW c0phw2 : (ArrayList) c0phx.LJIIJJI) {
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append(strLIZIZ3);
                    sbLIZ4.append(c0phw2.LIZ);
                    sbLIZ4.append(' ');
                    strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ4);
                    i2++;
                }
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append(strLIZIZ3);
                c0phx.LJ();
                if (Intrinsics.LJFF(c0phx.LJIIIZ, str3)) {
                    str2 = "] <--- CurrentCursor \r\n";
                } else {
                    str2 = "]\r\n";
                }
                sbLIZ5.append(str2);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ5);
                c0phx = c0phx.LIZLLL;
            }
        }
        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
        sbLIZ6.append(strLIZIZ);
        sbLIZ6.append("out count: ");
        sbLIZ6.append(i);
        String strLIZIZ4 = C2188811AlT.LIZIZ(sbLIZ6);
        StringBuilder sbLIZ7 = C2188811AlT.LIZ();
        sbLIZ7.append(strLIZIZ4);
        sbLIZ7.append("expanded inner count: ");
        sbLIZ7.append(i2);
        C2188811AlT.LIZIZ(sbLIZ7);
    }
}

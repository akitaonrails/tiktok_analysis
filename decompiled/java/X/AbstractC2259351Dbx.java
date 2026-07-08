package X;

import java.util.HashSet;

/* JADX INFO: renamed from: X.1Dbx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public abstract class AbstractC2259351Dbx {
    public static void LIZ(StringBuilder sb, C2259331Dbv c2259331Dbv, InterfaceC2259401Dc2 interfaceC2259401Dc2) {
        sb.append("Grammar{id=0x");
        sb.append(Integer.toHexString(System.identityHashCode(interfaceC2259401Dc2)));
        sb.append(",name=\"");
        sb.append(interfaceC2259401Dc2.name());
        sb.append('\"');
        if (((HashSet) c2259331Dbv.LIZ).contains(Integer.valueOf(System.identityHashCode(interfaceC2259401Dc2)))) {
            sb.append(",[...]");
        } else {
            ((HashSet) c2259331Dbv.LIZ).add(Integer.valueOf(System.identityHashCode(interfaceC2259401Dc2)));
            sb.append(",tokens=[");
            boolean z = true;
            for (InterfaceC2259411Dc3 interfaceC2259411Dc3 : interfaceC2259401Dc2.LIZ()) {
                if (z) {
                    z = false;
                } else {
                    sb.append(',');
                }
                LIZJ(sb, c2259331Dbv, interfaceC2259411Dc3);
            }
            sb.append(']');
        }
        sb.append('}');
    }

    public static void LIZIZ(StringBuilder sb, C2259331Dbv c2259331Dbv, InterfaceC2259391Dc1 interfaceC2259391Dc1) {
        sb.append("Pattern{id=0x");
        sb.append(Integer.toHexString(System.identityHashCode(interfaceC2259391Dc1)));
        if (((HashSet) c2259331Dbv.LIZ).contains(Integer.valueOf(System.identityHashCode(interfaceC2259391Dc1)))) {
            sb.append(",[...]");
        } else {
            ((HashSet) c2259331Dbv.LIZ).add(Integer.valueOf(System.identityHashCode(interfaceC2259391Dc1)));
            sb.append(",regex=\"");
            sb.append(interfaceC2259391Dc1.LIZLLL());
            sb.append('\"');
            if (interfaceC2259391Dc1.LJ()) {
                sb.append(",lookbehind=true");
            }
            if (interfaceC2259391Dc1.LIZJ()) {
                sb.append(",greedy=true");
            }
            if (interfaceC2259391Dc1.LIZIZ() != null) {
                sb.append(",alias=\"");
                sb.append(interfaceC2259391Dc1.LIZIZ());
                sb.append('\"');
            }
            InterfaceC2259401Dc2 interfaceC2259401Dc2LJFF = interfaceC2259391Dc1.LJFF();
            if (interfaceC2259401Dc2LJFF != null) {
                sb.append(",inside=");
                LIZ(sb, c2259331Dbv, interfaceC2259401Dc2LJFF);
            }
        }
        sb.append('}');
    }

    public static void LIZJ(StringBuilder sb, C2259331Dbv c2259331Dbv, InterfaceC2259411Dc3 interfaceC2259411Dc3) {
        sb.append("Token{id=0x");
        sb.append(Integer.toHexString(System.identityHashCode(interfaceC2259411Dc3)));
        sb.append(",name=\"");
        sb.append(interfaceC2259411Dc3.name());
        sb.append('\"');
        if (((HashSet) c2259331Dbv.LIZ).contains(Integer.valueOf(System.identityHashCode(interfaceC2259411Dc3)))) {
            sb.append(",[...]");
        } else {
            ((HashSet) c2259331Dbv.LIZ).add(Integer.valueOf(System.identityHashCode(interfaceC2259411Dc3)));
            sb.append(",patterns=[");
            boolean z = true;
            for (InterfaceC2259391Dc1 interfaceC2259391Dc1 : interfaceC2259411Dc3.LIZ()) {
                if (z) {
                    z = false;
                } else {
                    sb.append(',');
                }
                LIZIZ(sb, c2259331Dbv, interfaceC2259391Dc1);
            }
            sb.append(']');
        }
        sb.append('}');
    }
}

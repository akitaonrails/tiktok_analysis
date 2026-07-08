package X;

/* JADX INFO: renamed from: X.19ka, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C21627819ka implements InterfaceC21628619ki {
    public int LIZJ() {
        return 1;
    }

    @Override // X.InterfaceC21628619ki
    public void LIZ(C21627619kY c21627619kY) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            if (!c21627619kY.LIZJ()) {
                break;
            }
            char cLIZIZ = c21627619kY.LIZIZ();
            c21627619kY.LJFF++;
            int iLIZIZ = LIZIZ(cLIZIZ, sb);
            int iLIZ = c21627619kY.LIZ() + ((sb.length() / 3) << 1);
            c21627619kY.LIZLLL(iLIZ);
            int i = c21627619kY.LJII.LIZIZ - iLIZ;
            if (!c21627619kY.LIZJ()) {
                StringBuilder sb2 = new StringBuilder();
                if (sb.length() % 3 == 2 && (i < 2 || i > 2)) {
                    int length = sb.length();
                    sb.delete(length - iLIZIZ, length);
                    c21627619kY.LJFF--;
                    iLIZIZ = LIZIZ(c21627619kY.LIZIZ(), sb2);
                    c21627619kY.LJII = null;
                }
                while (sb.length() % 3 == 1 && (iLIZIZ > 3 || i != 1)) {
                    int length2 = sb.length();
                    sb.delete(length2 - iLIZIZ, length2);
                    c21627619kY.LJFF--;
                    iLIZIZ = LIZIZ(c21627619kY.LIZIZ(), sb2);
                    c21627619kY.LJII = null;
                }
            } else if (sb.length() % 3 == 0) {
                if (C1284310jWf.LJ(c21627619kY.LJFF, LIZJ(), c21627619kY.LIZ) != LIZJ()) {
                    c21627619kY.LJI = 0;
                    break;
                }
            }
        }
        LIZLLL(c21627619kY, sb);
    }

    public static void LJ(C21627619kY c21627619kY, StringBuilder sb) {
        int iCharAt = (sb.charAt(0) * 1600) + (sb.charAt(1) * '(') + sb.charAt(2) + 1;
        c21627619kY.LJ.append(new String(new char[]{(char) (iCharAt / 256), (char) (iCharAt % 256)}));
        sb.delete(0, 3);
    }

    public int LIZIZ(char c, StringBuilder sb) {
        if (c == ' ') {
            sb.append((char) 3);
            return 1;
        }
        if (c >= '0') {
            if (c <= '9') {
                sb.append((char) ((c - '0') + 4));
                return 1;
            }
            if (c >= 'A' && c <= 'Z') {
                sb.append((char) ((c - 'A') + 14));
                return 1;
            }
        }
        if (c < ' ') {
            sb.append((char) 0);
            sb.append(c);
            return 2;
        }
        if (c >= '!') {
            if (c <= '/') {
                sb.append((char) 1);
                sb.append((char) (c - '!'));
                return 2;
            }
            if (c >= ':') {
                if (c <= '@') {
                    sb.append((char) 1);
                    sb.append((char) ((c - ':') + 15));
                    return 2;
                }
                if (c >= '[') {
                    if (c <= '_') {
                        sb.append((char) 1);
                        sb.append((char) ((c - '[') + 22));
                        return 2;
                    }
                    if (c >= '`' && c <= 127) {
                        sb.append((char) 2);
                        sb.append((char) (c - '`'));
                        return 2;
                    }
                }
            }
        }
        sb.append("\u0001\u001e");
        return LIZIZ((char) (c - 128), sb) + 2;
    }

    public void LIZLLL(C21627619kY c21627619kY, StringBuilder sb) {
        int length = (sb.length() / 3) << 1;
        int length2 = sb.length() % 3;
        int iLIZ = c21627619kY.LIZ() + length;
        c21627619kY.LIZLLL(iLIZ);
        int i = c21627619kY.LJII.LIZIZ - iLIZ;
        if (length2 == 2) {
            sb.append((char) 0);
            while (sb.length() >= 3) {
                LJ(c21627619kY, sb);
            }
            if (c21627619kY.LIZJ()) {
                c21627619kY.LJ((char) 254);
            }
        } else if (i == 1 && length2 == 1) {
            while (sb.length() >= 3) {
                LJ(c21627619kY, sb);
            }
            if (c21627619kY.LIZJ()) {
                c21627619kY.LJ((char) 254);
            }
            c21627619kY.LJFF--;
        } else {
            if (length2 != 0) {
                throw new IllegalStateException("Unexpected case. Please report!");
            }
            while (sb.length() >= 3) {
                LJ(c21627619kY, sb);
            }
            if (i > 0 || c21627619kY.LIZJ()) {
                c21627619kY.LJ((char) 254);
            }
        }
        c21627619kY.LJI = 0;
    }
}

package X;

import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0Wbh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C826590Wbh {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static void LIZ(String str, StringBuilder sb) {
        str.getClass();
        switch (str.hashCode()) {
            case -1374008726:
                if (str.equals("byte[]")) {
                    sb.append("[B");
                    return;
                }
                break;
            case -1361632968:
                if (str.equals("char[]")) {
                    sb.append("[C");
                    return;
                }
                break;
            case -1325958191:
                if (str.equals("double")) {
                    sb.append("D");
                    return;
                }
                break;
            case -1097129250:
                if (str.equals("long[]")) {
                    sb.append("[J");
                    return;
                }
                break;
            case -766441794:
                if (str.equals("float[]")) {
                    sb.append("[F");
                    return;
                }
                break;
            case 104431:
                if (str.equals("int")) {
                    sb.append("I");
                    return;
                }
                break;
            case 3039496:
                if (str.equals("byte")) {
                    sb.append("B");
                    return;
                }
                break;
            case 3052374:
                if (str.equals("char")) {
                    sb.append("C");
                    return;
                }
                break;
            case 3327612:
                if (str.equals("long")) {
                    sb.append("J");
                    return;
                }
                break;
            case 3625364:
                if (str.equals("void")) {
                    sb.append("V");
                    return;
                }
                break;
            case 64711720:
                if (str.equals("boolean")) {
                    sb.append("Z");
                    return;
                }
                break;
            case 97526364:
                if (str.equals("float")) {
                    sb.append("F");
                    return;
                }
                break;
            case 100361105:
                if (str.equals("int[]")) {
                    sb.append("[I");
                    return;
                }
                break;
            case 109413500:
                if (str.equals("short")) {
                    sb.append("S");
                    return;
                }
                break;
            case 1359468275:
                if (str.equals("double[]")) {
                    sb.append("[D");
                    return;
                }
                break;
            case 2058423690:
                if (str.equals("boolean[]")) {
                    sb.append("[Z");
                    return;
                }
                break;
            case 2067161310:
                if (str.equals("short[]")) {
                    sb.append("[S");
                    return;
                }
                break;
        }
        if (str.contains("[]")) {
            sb.append("[L");
            sb.append(str.replace("[]", "").replace(e3.d, "/"));
            sb.append(";");
        } else {
            sb.append("L");
            sb.append(str.replace(e3.d, "/"));
            sb.append(";");
        }
    }

    public static String LIZIZ(Class cls, Class[] clsArr) {
        StringBuilder sb = new StringBuilder(e3.h);
        for (Class cls2 : clsArr) {
            LIZ(cls2.getTypeName(), sb);
        }
        sb.append(")");
        LIZ(cls.getTypeName(), sb);
        return sb.toString();
    }
}

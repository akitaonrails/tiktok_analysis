package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.text.Regex;

/* JADX INFO: renamed from: X.0YNP, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YNP {
    public static C866530Xz1 LIZIZ(String str) {
        C0YNW c0ynw = (C0YNW) C0YUC.LIZ(C0YM2.TIKTOK_SOCIAL_IM);
        c0ynw.getClass();
        return new C866530Xz1(str, c0ynw.LIZ, c0ynw.LIZIZ);
    }

    public static String LIZLLL(Long l) {
        C0YM2 c0ym2 = C0YM2.TIKTOK_SOCIAL_IM;
        if (l != null) {
            long jLongValue = l.longValue();
            C0YUC.LIZ(c0ym2);
            String strLIZ = C0YNW.LIZ(0, String.valueOf(jLongValue));
            if (strLIZ != null) {
                return strLIZ;
            }
        }
        return "";
    }

    public static String LJ(String str) {
        C0YUC.LIZ(C0YM2.TIKTOK_SOCIAL_IM);
        String strLIZ = C0YNW.LIZ(0, str);
        if (strLIZ == null) {
            return "";
        }
        return strLIZ;
    }

    public static int LJI(String str) {
        List listLL;
        String str2;
        Integer numLJIIJJI;
        C0YUC.LIZ(C0YM2.TIKTOK_SOCIAL_IM).getClass();
        if (str != null && str.length() != 0) {
            List<String> listSplit = new Regex(":").split(str, 0);
            if (!listSplit.isEmpty()) {
                ListIterator<String> listIterator = listSplit.listIterator(listSplit.size());
                while (listIterator.hasPrevious()) {
                    if (listIterator.previous().length() != 0) {
                        listLL = C13LP.LL(listSplit, listIterator.nextIndex() + 1);
                        break;
                    }
                }
                listLL = C13BV.INSTANCE;
            } else {
                listLL = C13BV.INSTANCE;
            }
            String[] strArr = (String[]) listLL.toArray(new String[0]);
            if (strArr.length == 4 && (str2 = strArr[0]) != null && (numLJIIJJI = C2095008Iq.LJIIJJI(str2)) != null) {
                return numLJIIJJI.intValue();
            }
            return -1;
        }
        return -1;
    }

    public static long LJII(String str) {
        C0YUC.LIZ(C0YM2.TIKTOK_SOCIAL_IM).getClass();
        C882400YjW.LIZ.getClass();
        C882400YjW.LIZ();
        C883250Ykt c883250Ykt = C883250Ykt.LL;
        return C2124408Ty.LIZIZ(C461720I8s.LIZJ(), str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZ(String str, Map map) {
        C0Y6Q c0y6qLIZIZ;
        C0YNW c0ynw = (C0YNW) C0YUC.LIZ(C0YM2.TIKTOK_SOCIAL_IM);
        c0ynw.getClass();
        if (((Boolean) C0A36.LIZ.getValue()).booleanValue()) {
            try {
                c0y6qLIZIZ = (C0Y6Q) C23250099c.LJ(C23271099x.INSTANCE, new C865860Xxw(null, c0ynw, str, map));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                String message = th.getMessage();
                if (message == null) {
                    message = "Unknown error";
                }
                c0y6qLIZIZ = C865670Xxd.LIZIZ(new C0YPY(-1, message, th));
            }
            Boolean bool = (Boolean) c0y6qLIZIZ.LIZ;
            if (bool != null) {
                bool.booleanValue();
                return;
            }
            return;
        }
        c0ynw.LIZ.LJIIZILJ().LLLIIIIL(str, map);
    }

    public static String LIZJ(int i, String str) {
        C0YUC.LIZ(C0YM2.TIKTOK_SOCIAL_IM);
        String strLIZ = C0YNW.LIZ(i, str);
        if (strLIZ == null) {
            return "";
        }
        return strLIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static String LJFF(String str, String str2) {
        C0Y6Q c0y6qLIZIZ;
        C0YNW c0ynw = (C0YNW) C0YUC.LIZ(C0YM2.TIKTOK_SOCIAL_IM);
        c0ynw.getClass();
        if (((Boolean) C0A36.LIZ.getValue()).booleanValue()) {
            try {
                c0y6qLIZIZ = (C0Y6Q) C23250099c.LJ(C23271099x.INSTANCE, new C865880Xxy(null, c0ynw, str, str2));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                String message = th.getMessage();
                if (message == null) {
                    message = "Unknown error";
                }
                c0y6qLIZIZ = C865670Xxd.LIZIZ(new C0YPY(-1, message, th));
            }
            return (String) c0y6qLIZIZ.LIZ;
        }
        return c0ynw.LIZ.LJIIZILJ().LJFF(str, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean LJIIIIZZ(String str, String str2, String str3) {
        C0Y6Q c0y6qLIZIZ;
        C0YNW c0ynw = (C0YNW) C0YUC.LIZ(C0YM2.TIKTOK_SOCIAL_IM);
        c0ynw.getClass();
        if (((Boolean) C0A36.LIZ.getValue()).booleanValue()) {
            try {
                c0y6qLIZIZ = (C0Y6Q) C23250099c.LJ(C23271099x.INSTANCE, new C865870Xxx(null, c0ynw, str, str2, str3));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                String message = th.getMessage();
                if (message == null) {
                    message = "Unknown error";
                }
                c0y6qLIZIZ = C865670Xxd.LIZIZ(new C0YPY(-1, message, th));
            }
            Boolean bool = (Boolean) c0y6qLIZIZ.LIZ;
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        }
        return c0ynw.LIZ.LJIIZILJ().LLFZ(str, str2, str3);
    }
}

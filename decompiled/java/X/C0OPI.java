package X;

import com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0OPI, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OPI {
    public static final C0OPI LIZ = new C0OPI();
    public static final Map<Long, C0OPH> LIZIZ = new LinkedHashMap();

    public static void LIZ(BulletinBaseItem bulletinBaseItem, String str) {
        Long lLJJJ;
        if (bulletinBaseItem != null && (lLJJJ = bulletinBaseItem.LJJJ()) != null) {
            long jLongValue = lLJJJ.longValue();
            Map<Long, C0OPH> map = LIZIZ;
            LinkedHashMap linkedHashMap = (LinkedHashMap) map;
            if (linkedHashMap.get(Long.valueOf(jLongValue)) == null) {
                map.put(Long.valueOf(jLongValue), new C0OPH());
            }
            C0OPH c0oph = (C0OPH) linkedHashMap.get(Long.valueOf(jLongValue));
            if (c0oph != null) {
                c0oph.LJIIIIZZ();
                if (c0oph.LJFF()) {
                    c0oph.LJI.LIZJ();
                    c0oph.LJII.LIZJ();
                    c0oph.LJIIIIZZ = bulletinBaseItem;
                    c0oph.LJIIL = str;
                }
            }
        }
    }

    public static void LIZIZ(BulletinBaseItem bulletinBaseItem, int i, BulletinBaseItem bulletinBaseItem2, int i2) {
        Long lLJJJ;
        Map<Long, C0OPH> map = LIZIZ;
        if (bulletinBaseItem != null) {
            lLJJJ = bulletinBaseItem.LJJJ();
        } else {
            lLJJJ = null;
        }
        C0OPH c0oph = (C0OPH) ((LinkedHashMap) map).get(lLJJJ);
        if (c0oph != null && c0oph.LJ()) {
            c0oph.LJIIJJI = Integer.valueOf(i);
            c0oph.LJIIJ = Integer.valueOf(i2);
            if (i == 1) {
                c0oph.LJIIIZ = bulletinBaseItem2;
            }
            c0oph.LJI.LIZIZ();
            C0OPG c0opg = c0oph.LJII;
            if (c0opg.LIZIZ == 0) {
                c0opg.LIZIZ = System.currentTimeMillis();
            }
            c0oph.LJII();
        }
    }
}

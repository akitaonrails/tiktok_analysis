package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0Px7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C661510Px7 {
    public static final C661510Px7 LIZ = new C661510Px7();
    public static final boolean LIZIZ = C288510BSn.LIZ();

    public static void LIZ(C661490Px5 c661490Px5, boolean z, boolean z2) {
        String aid;
        C1483410ohn c1483410ohn;
        C661550PxB c661550PxBLJ = c661490Px5.LJ();
        if (c661550PxBLJ == null) {
            return;
        }
        C0N0Y c0n0yLIZ = c661490Px5.LJIILIIL;
        if (c0n0yLIZ == null) {
            if (z) {
                c0n0yLIZ = C640060P8q.LIZ.LIZ();
            } else {
                c0n0yLIZ = null;
            }
        }
        if (C1867080ygc.LIZ()) {
            if (!C301550Brt.LIZ()) {
                C661520Px8.LIZ(c0n0yLIZ);
                C661520Px8.LIZJ(c0n0yLIZ);
            }
            if (C1109604Vq.LIZ()) {
                C661520Px8.LIZLLL(c0n0yLIZ);
            }
        }
        if (C1823407Ce.LIZ() && C1109604Vq.LIZ()) {
            List list = (List) ((HashMap) C640060P8q.LIZ.LIZ).get(Integer.valueOf(c661490Px5.LIZJ()));
            if (list != null) {
                list.remove(c661490Px5);
            }
        }
        C0N0Y c0n0y = c661490Px5.LJIILIIL;
        Aweme aweme = c661490Px5.LIZJ;
        if (aweme == null || (aid = aweme.getAid()) == null) {
            aid = "";
        }
        C0Q0N.LIZ(c0n0y, aid);
        C1012040cRW c1012040cRWLIZIZ = C1012040cRW.LIZIZ();
        c1012040cRWLIZIZ.LIZ = c0n0yLIZ;
        c1012040cRWLIZIZ.LIZJ = c661550PxBLJ.LIZLLL;
        c1012040cRWLIZIZ.LJIIL = c661550PxBLJ.LJ;
        c1012040cRWLIZIZ.LJFF = true;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = c661490Px5.LJJIJ;
        if (j != -1) {
            c661490Px5.LJJIJIIJI += jCurrentTimeMillis - j;
        }
        C664430Q4j.LJIIIIZZ = System.currentTimeMillis();
        C664430Q4j.LJFF = true;
        if (c0n0yLIZ != null && c0n0yLIZ.isPlaying()) {
            C664430Q4j.LJIIIZ += c661490Px5.LJJIJIIJI;
            c661490Px5.LJJIJIIJI = 0L;
        }
        Aweme aweme2 = c661490Px5.LIZJ;
        if (aweme2 != null) {
            C0P9I.LIZ(aweme2);
        }
        c661490Px5.LJIILIIL = null;
        C661550PxB c661550PxBLJ2 = c661490Px5.LJ();
        if (c661550PxBLJ2 != null) {
            c661550PxBLJ2.LJFF = null;
        }
        C661550PxB c661550PxBLJ3 = c661490Px5.LJ();
        if (c661550PxBLJ3 != null) {
            c661550PxBLJ3.LJI = -1;
        }
        C661550PxB c661550PxBLJ4 = c661490Px5.LJ();
        if (c661550PxBLJ4 != null) {
            c661550PxBLJ4.LJII = false;
        }
        C661550PxB c661550PxBLJ5 = c661490Px5.LJ();
        if (c661550PxBLJ5 != null) {
            c661550PxBLJ5.LJ = -1;
        }
        C586970N0l c586970N0l = c661490Px5.LJFF;
        if (c586970N0l != null) {
            c586970N0l.LIZJ();
        }
        C586970N0l c586970N0l2 = c661490Px5.LJFF;
        if (c586970N0l2 != null) {
            c586970N0l2.LJIIJ(null);
        }
        c661490Px5.LJ = true;
        if ((c0n0yLIZ instanceof C1483410ohn) && (c1483410ohn = (C1483410ohn) c0n0yLIZ) != null) {
            c1483410ohn.LJIILIIL = z2;
        }
    }

    public static void LIZJ(long j, long j2, Aweme aweme, String str, boolean z) {
        C661550PxB c661550PxB;
        int i;
        C661830Pxd c661830Pxd = C661820Pxc.LIZ;
        if (((HashMap) c661830Pxd.LIZ).isEmpty() || (c661550PxB = (C661550PxB) ((HashMap) c661830Pxd.LIZ).get(str)) == null) {
            c661550PxB = new C661550PxB(aweme, new C662100Py4(), str);
        }
        aweme.getAid();
        if (C664430Q4j.LJIIIIZZ != -1) {
            C664430Q4j.LJII += System.currentTimeMillis() - C664430Q4j.LJIIIIZZ;
        }
        C664430Q4j.LJ = System.currentTimeMillis();
        C664430Q4j.LJI = true;
        c661550PxB.LIZ(j);
        boolean z2 = LIZIZ;
        if (z2) {
            c661550PxB.LJIIIIZZ = true;
        }
        if (C1012040cRW.LIZIZ().LIZ != null) {
            c661550PxB.LJFF = C1012040cRW.LIZIZ().LIZ;
            if (C1867080ygc.LIZ() && C1109604Vq.LIZ()) {
                Map<Integer, String> map = C661520Px8.LIZ;
                C661520Px8.LIZ(c661550PxB.LJFF);
            }
            C1012040cRW.LIZIZ().LIZ = null;
            c661550PxB.LJII = true;
            if (z2) {
                c661550PxB.LJI = (int) j2;
            }
        } else {
            c661550PxB.LJI = (int) j2;
        }
        c661550PxB.LJ = C1012040cRW.LIZIZ().LJIIL;
        C1012040cRW.LIZIZ().LJIIL = -1;
        if (z) {
            i = 3;
        } else {
            i = 4;
        }
        c661550PxB.LIZIZ = i;
        ((HashMap) c661830Pxd.LIZ).put(str, c661550PxB);
    }
}

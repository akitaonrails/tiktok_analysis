package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import defpackage.x0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0rlz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1601330rlz implements InterfaceC1601220rlo<FeedItemList> {
    public static final C590650NEp LJFF = new InterfaceC1604690rrP() { // from class: X.0NEp
        @Override // X.InterfaceC1604690rrP
        public final String LIZ() {
            C0TKF c0tkf = C0TKA.LIZ;
            if (((Boolean) C2275781E5w.LJFF.getValue()).booleanValue()) {
                C0NET.LIZ.getClass();
                if (!C0NET.LJI()) {
                    return "";
                }
            }
            C1150504el.LIZ().LIZLLL("feed_wait_feed_cache", false);
            C0NET.LIZ.getClass();
            if (!C0NET.LJII) {
                try {
                    C0NET.LIZIZ.await(500L, TimeUnit.MILLISECONDS);
                } catch (InterruptedException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            C1150504el.LIZ().LJI("feed_wait_feed_cache", false);
            C0NET.LIZ.getClass();
            return C590440NDu.LIZ;
        }

        @Override // X.InterfaceC1604690rrP
        public final String LIZIZ() {
            String str = "";
            if (!((Boolean) C0CD2.LJJJJL.getValue()).booleanValue()) {
                return "";
            }
            C0NET.LIZ.getClass();
            HashSet hashSet = new HashSet();
            if (!TextUtils.isEmpty(C590440NDu.LIZ)) {
                hashSet.addAll(C13LP.LLIIJI(a0.LJJLIIIJILLIZJL(C590440NDu.LIZ, new String[]{","}, 0, 6)));
            }
            C590420NDs.LIZ.getClass();
            if (!TextUtils.isEmpty(C590420NDs.LJIIJ())) {
                hashSet.addAll(C13LP.LLIIJI(a0.LJJLIIIJILLIZJL(C590420NDs.LJIIJ(), new String[]{","}, 0, 6)));
            }
            if (!TextUtils.isEmpty(C590420NDs.LJIILJJIL())) {
                hashSet.addAll(C13LP.LLIIJI(a0.LJJLIIIJILLIZJL(C590420NDs.LJIILJJIL(), new String[]{","}, 0, 6)));
            }
            if (!TextUtils.isEmpty(C590420NDs.LJIILIIL())) {
                hashSet.addAll(C13LP.LLIIJI(a0.LJJLIIIJILLIZJL(C590420NDs.LJIILIIL(), new String[]{","}, 0, 6)));
            }
            C590480NDy.LIZ.getClass();
            if (!TextUtils.isEmpty(C590480NDy.LJII())) {
                hashSet.addAll(C13LP.LLIIJI(a0.LJJLIIIJILLIZJL(C590480NDy.LJII(), new String[]{","}, 0, 6)));
            }
            x0.LIZ.getClass();
            x0.LJIIIZ();
            List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(C590420NDs.LIZIZ(), new String[]{x0.LIZIZ}, 0, 6);
            ArrayList arrayList = new ArrayList();
            Iterator it2 = listLJJLIIIJILLIZJL.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                List listLJJLIIIJILLIZJL2 = a0.LJJLIIIJILLIZJL((String) it2.next(), new String[]{x0.LIZJ}, 0, 6);
                Object objLJJJLZIJ = listLJJLIIIJILLIZJL2.size() == 2 ? C13LP.LJJJLZIJ(1, listLJJLIIIJILLIZJL2) : null;
                if (objLJJJLZIJ != null) {
                    arrayList.add(objLJJJLZIJ);
                }
            }
            String strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList, x0.LIZIZ, null, null, 0, null, null, 62);
            if (!TextUtils.isEmpty(strLJJLIIIJ)) {
                hashSet.addAll(C13LP.LLIIJI(a0.LJJLIIIJILLIZJL(strLJJLIIIJ, new String[]{","}, 0, 6)));
            }
            String strLJJLIIIJ2 = !C086I.LIZIZ(hashSet) ? C13LP.LJJLIIIJ(hashSet, ",", null, null, 0, null, null, 62) : "";
            if (C0NHD.LIZIZ()) {
                C0S4J c0s4j = C0NH6.LJIILLIIL;
                C0NH6 c0nh6LIZ = C591300NHc.LIZ();
                if (c0nh6LIZ.LJIIJ() != C0NHK.DISABLED && c0nh6LIZ.LJIIJ().compareTo(C0NHK.INIT_DONE) >= 0) {
                    try {
                        str = (String) C23250099c.LJ(C23271099x.INSTANCE, new C0NG7(c0nh6LIZ, null));
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
            }
            StringBuilder sb = new StringBuilder();
            if (C2105908Mv.LIZ(strLJJLIIIJ2)) {
                sb.append(str);
            } else {
                sb.append(strLJJLIIIJ2);
                if (!C2105908Mv.LIZ(str)) {
                    sb.append(",");
                    sb.append(str);
                }
            }
            return sb.toString();
        }
    };
    public FeedItemList LIZ;
    public FeedItemList LIZIZ;
    public volatile C15O7 LIZJ;
    public volatile boolean LIZLLL;
    public volatile boolean LJ;

    @Override // X.InterfaceC1601220rlo
    public final void LIZJ() {
        this.LJ = true;
    }

    @Override // X.InterfaceC1601220rlo
    public final boolean LIZ() {
        return this.LIZ != null || this.LIZJ == null || this.LIZJ.LJIILJJIL();
    }

    @Override // X.InterfaceC1601220rlo
    public final FeedItemList getData() {
        FeedItemList feedItemList = this.LIZ;
        if (feedItemList != null) {
            this.LIZJ = null;
            this.LIZ = null;
            C1150504el.LIZ().LJ(1L, "feed_response_from_nuj_preload");
            return feedItemList;
        }
        if (this.LIZJ == null) {
            return null;
        }
        if (!this.LIZJ.LJIILJJIL()) {
            try {
                this.LIZJ.LJIJJLI();
                C307420C3g.LIZIZ(0, "full_feed_thread_switch_cost_2");
            } catch (InterruptedException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        try {
            if (this.LIZJ.LJIILL()) {
                this.LIZJ.LJIIJJI();
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        FeedItemList feedItemList2 = this.LIZ;
        this.LIZJ = null;
        this.LIZ = null;
        return feedItemList2;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c3 A[PHI: r8 r9 r10 r11 r12 r13 r14 r15 r16
      0x00c3: PHI (r8v5 java.lang.String) = (r8v4 java.lang.String), (r8v8 java.lang.String), (r8v8 java.lang.String) binds: [B:61:0x00c0, B:39:0x008f, B:41:0x0095] A[DONT_GENERATE, DONT_INLINE]
      0x00c3: PHI (r9v5 java.lang.String) = (r9v4 java.lang.String), (r9v8 java.lang.String), (r9v8 java.lang.String) binds: [B:61:0x00c0, B:39:0x008f, B:41:0x0095] A[DONT_GENERATE, DONT_INLINE]
      0x00c3: PHI (r10v4 java.lang.String) = (r10v3 java.lang.String), (r10v7 java.lang.String), (r10v7 java.lang.String) binds: [B:61:0x00c0, B:39:0x008f, B:41:0x0095] A[DONT_GENERATE, DONT_INLINE]
      0x00c3: PHI (r11v3 java.lang.String) = (r11v2 java.lang.String), (r11v6 java.lang.String), (r11v6 java.lang.String) binds: [B:61:0x00c0, B:39:0x008f, B:41:0x0095] A[DONT_GENERATE, DONT_INLINE]
      0x00c3: PHI (r12v2 java.lang.String) = (r12v1 java.lang.String), (r12v5 java.lang.String), (r12v5 java.lang.String) binds: [B:61:0x00c0, B:39:0x008f, B:41:0x0095] A[DONT_GENERATE, DONT_INLINE]
      0x00c3: PHI (r13v2 int) = (r13v1 int), (r13v6 int), (r13v6 int) binds: [B:61:0x00c0, B:39:0x008f, B:41:0x0095] A[DONT_GENERATE, DONT_INLINE]
      0x00c3: PHI (r14v2 java.lang.String) = (r14v1 java.lang.String), (r14v6 java.lang.String), (r14v6 java.lang.String) binds: [B:61:0x00c0, B:39:0x008f, B:41:0x0095] A[DONT_GENERATE, DONT_INLINE]
      0x00c3: PHI (r15v2 boolean) = (r15v1 boolean), (r15v6 boolean), (r15v6 boolean) binds: [B:61:0x00c0, B:39:0x008f, B:41:0x0095] A[DONT_GENERATE, DONT_INLINE]
      0x00c3: PHI (r16v2 int) = (r16v1 int), (r16v8 int), (r16v8 int) binds: [B:61:0x00c0, B:39:0x008f, B:41:0x0095] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    @Override // X.InterfaceC1601220rlo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(java.lang.Object... r19) {
        /*
            Method dump skipped, instruction units count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1601330rlz.LIZIZ(java.lang.Object[]):void");
    }

    @Override // X.InterfaceC1601220rlo
    public final void LIZLLL(RunnableC1601150rlh runnableC1601150rlh) {
        if (this.LIZJ != null && !this.LIZJ.LJIILJJIL()) {
            this.LIZJ.LIZLLL(new C346480DiA(runnableC1601150rlh, 10));
        }
    }

    @Override // X.InterfaceC1601220rlo
    public final void LJ(FeedItemList feedItemList) {
        this.LIZJ = null;
        this.LIZ = null;
        this.LJ = false;
        this.LIZLLL = false;
        this.LIZLLL = true;
        this.LIZ = feedItemList;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ss.android.ugc.aweme.feed.model.FeedItemList LJFF(int r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, int r13, java.lang.String r14, boolean r15, int r16) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1601330rlz.LJFF(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, boolean, int):com.ss.android.ugc.aweme.feed.model.FeedItemList");
    }
}

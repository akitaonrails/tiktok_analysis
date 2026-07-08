package X;

import Y.ACallableS411S0100000_3;
import Y.ARunnableS45S0300000_12;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0T2l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C740370T2l {
    public static final C01GW<C740370T2l> LJIIL = C452501pT.LIZ(EnumC452301pR.SYNCHRONIZED, new C740420T2q());
    public volatile boolean LIZ;
    public final Map<String, C0T0O> LIZIZ = new ConcurrentHashMap();
    public final Map<String, Boolean> LIZJ = new ConcurrentHashMap();
    public volatile Aweme LIZLLL;
    public volatile String LJ;
    public volatile boolean LJFF;
    public volatile InterfaceC739770T0d LJI;
    public volatile boolean LJII;
    public volatile boolean LJIIIIZZ;
    public boolean LJIIIZ;
    public volatile boolean LJIIJ;
    public long LJIIJJI;

    public final void LIZIZ() {
        String aid;
        Aweme aweme;
        if (((Boolean) C260380AIi.LIZ.getValue()).booleanValue() && (aweme = this.LIZLLL) != null) {
            C2277881EDy.LIZIZ.removeCacheByUser(AwemeExtKt.getSecAuthorUid(aweme), AwemeExtKt.getAuthorUid(aweme));
        }
        this.LIZ = false;
        this.LJII = false;
        ((ConcurrentHashMap) this.LIZIZ).clear();
        ((ConcurrentHashMap) this.LIZJ).clear();
        Aweme aweme2 = this.LIZLLL;
        if (aweme2 != null && (aid = aweme2.getAid()) != null) {
            C740380T2m.LIZ.getClass();
            C740410T2p.LIZ.getClass();
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) C740410T2p.LIZIZ;
            C11NJ c11nj = (C11NJ) concurrentHashMap.get(aid);
            if (c11nj != null) {
                c11nj.LJ();
                concurrentHashMap.remove(aid);
            }
        }
        this.LIZLLL = null;
        C01GW<C740490T2x> c01gw = C740490T2x.LIZLLL;
        C739240SzC.LIZIZ().LIZIZ = false;
        C739240SzC.LIZIZ().LIZJ = false;
    }

    public final void LIZLLL() {
        if (true != this.LIZ && (!((ConcurrentHashMap) this.LIZIZ).isEmpty())) {
            for (Map.Entry entry : ((ConcurrentHashMap) this.LIZIZ).entrySet()) {
                LJFF(((C0T0O) entry.getValue()).LIZIZ, (String) entry.getKey(), true);
            }
            ((ConcurrentHashMap) this.LIZIZ).clear();
        }
        this.LIZ = true;
    }

    public static void LIZ() {
        if (C740020T1c.LIZJ() || (C740150T1p.LIZ() != null && C740150T1p.LIZ().groupId > 0)) {
            CommentService.LIZ.getClass();
            C523420Kfs.LIZ().removeAllCache();
            C2277881EDy.LIZIZ.removeAllCache();
        }
    }

    public final void LIZJ(C0T0O c0t0o) {
        if (Math.abs(System.currentTimeMillis() - this.LJIIJJI) > Mp4ScreenVideoLoadTimeout.CONTROL) {
            this.LJIIJJI = System.currentTimeMillis();
            C844470XAv.LIZ.getClass();
            this.LJIIJ = C0XF1.LJ(C844470XAv.LIZ());
        }
        if (!this.LJIIJ) {
            return;
        }
        String str = c0t0o.LIZ;
        String str2 = "homepage_hot";
        if (Intrinsics.LJFF(str, "comment_preload_task")) {
            CommentService.LIZ.getClass();
            CommentService commentServiceLIZ = C523420Kfs.LIZ();
            Aweme aweme = this.LIZLLL;
            int i = c0t0o.LIZIZ;
            String str3 = this.LJ;
            if (str3 != null) {
                str2 = str3;
            }
            commentServiceLIZ.LJIIJ(null, aweme, 300000, i, str2, "homepage_hot", null, 0, true, EnumC746780TRc.OTHER.getValue());
            return;
        }
        if (!Intrinsics.LJFF(str, "profile_preload_task")) {
            return;
        }
        C2277881EDy.LIZIZ.preloadProfileInfoAndAwemePost(this.LIZLLL, 300000, c0t0o.LIZIZ, "homepage_hot");
    }

    public final void LJ(int i) {
        if (this.LIZLLL == null) {
        }
        C0VTN.LIZJ().LIZLLL();
        switch (i) {
            case 1:
                LJFF(i, "comment_preload_task", false);
                LJFF(i, "profile_preload_task", false);
                break;
            case 2:
                LJFF(i, "comment_preload_task", false);
                LJFF(i, "profile_preload_task", false);
                break;
            case 3:
                LJFF(i, "comment_preload_task", false);
                LJFF(i, "profile_preload_task", false);
                break;
            case 4:
                LJFF(i, "profile_preload_task", false);
                break;
            case 5:
                LJFF(i, "comment_preload_task", false);
                LJFF(i, "profile_preload_task", false);
                break;
            case 6:
                LJFF(i, "comment_preload_task", false);
                break;
            case 7:
                LJFF(i, "profile_preload_task", false);
                break;
            case 8:
                LJFF(i, "comment_preload_task", false);
                LJFF(i, "profile_preload_task", false);
                break;
        }
    }

    public final void LJFF(int i, String str, boolean z) {
        InterfaceC740440T2s interfaceC740440T2s;
        String aid;
        try {
            if ((!((ConcurrentHashMap) this.LIZJ).isEmpty()) && ((ConcurrentHashMap) this.LIZJ).containsKey(str)) {
                return;
            }
            if (Intrinsics.LJFF("comment_preload_task", str)) {
                C01GW<C740490T2x> c01gw = C740490T2x.LIZLLL;
                if (C739240SzC.LIZIZ().LIZIZ) {
                    return;
                }
            }
            if (Intrinsics.LJFF("profile_preload_task", str)) {
                C01GW<C740490T2x> c01gw2 = C740490T2x.LIZLLL;
                if (C739240SzC.LIZIZ().LIZJ) {
                    return;
                }
            }
            if (Intrinsics.LJFF("profile_preload_task", str) && C0R93.LIZ(this.LJ) && C740010T1b.LIZ()) {
                return;
            }
            String str2 = this.LJ;
            InterfaceC742320T9y interfaceC742320T9yLIZ = null;
            if (Intrinsics.LJFF(str2, "homepage_friends") && Intrinsics.LJFF(str, "comment_preload_task") && this.LJFF) {
                return;
            }
            if (Intrinsics.LJFF(str2, "homepage_friends")) {
                interfaceC740440T2s = new InterfaceC740440T2s() { // from class: X.0T2u
                    /* JADX WARN: Removed duplicated region for block: B:32:0x0065  */
                    /* JADX WARN: Removed duplicated region for block: B:35:0x006a  */
                    /* JADX WARN: Removed duplicated region for block: B:6:0x0012  */
                    @Override // X.InterfaceC740440T2s
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final X.C740430T2r LIZ(int r9, com.ss.android.ugc.aweme.feed.model.Aweme r10, java.lang.String r11) {
                        /*
                            Method dump skipped, instruction units count: 215
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C740460T2u.LIZ(int, com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String):X.0T2r");
                    }
                };
            } else {
                interfaceC740440T2s = new InterfaceC740440T2s() { // from class: X.0T2t
                    /* JADX WARN: Removed duplicated region for block: B:27:0x0059 A[PHI: r5 r6
                      0x0059: PHI (r5v4 X.0T0O) = (r5v1 X.0T0O), (r5v1 X.0T0O), (r5v1 X.0T0O), (r5v0 X.0T0O), (r5v0 X.0T0O), (r5v0 X.0T0O), (r5v0 X.0T0O) binds: [B:68:0x00ef, B:65:0x00e8, B:64:0x00e6, B:39:0x0079, B:32:0x0069, B:34:0x006d, B:26:0x0057] A[DONT_GENERATE, DONT_INLINE]
                      0x0059: PHI (r6v5 boolean) = (r6v1 boolean), (r6v2 boolean), (r6v0 boolean), (r6v0 boolean), (r6v0 boolean), (r6v0 boolean), (r6v0 boolean) binds: [B:68:0x00ef, B:65:0x00e8, B:64:0x00e6, B:39:0x0079, B:32:0x0069, B:34:0x006d, B:26:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
                    /* JADX WARN: Removed duplicated region for block: B:57:0x00c6  */
                    /* JADX WARN: Removed duplicated region for block: B:65:0x00e8  */
                    /* JADX WARN: Removed duplicated region for block: B:76:0x0105 A[PHI: r5
                      0x0105: PHI (r5v2 X.0T0O) = 
                      (r5v0 X.0T0O)
                      (r5v0 X.0T0O)
                      (r5v0 X.0T0O)
                      (r5v0 X.0T0O)
                      (r5v1 X.0T0O)
                      (r5v1 X.0T0O)
                      (r5v1 X.0T0O)
                      (r5v0 X.0T0O)
                      (r5v0 X.0T0O)
                      (r5v0 X.0T0O)
                      (r5v0 X.0T0O)
                      (r5v0 X.0T0O)
                     binds: [B:73:0x00ff, B:74:0x0101, B:72:0x00fd, B:43:0x0082, B:45:0x008a, B:47:0x0090, B:49:0x0094, B:38:0x0077, B:39:0x0079, B:33:0x006b, B:34:0x006d, B:26:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
                    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
                    @Override // X.InterfaceC740440T2s
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final X.C740430T2r LIZ(int r12, com.ss.android.ugc.aweme.feed.model.Aweme r13, java.lang.String r14) {
                        /*
                            Method dump skipped, instruction units count: 265
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C740450T2t.LIZ(int, com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String):X.0T2r");
                    }
                };
            }
            C740430T2r c740430T2rLIZ = interfaceC740440T2s.LIZ(i, this.LIZLLL, str);
            if (c740430T2rLIZ != null && c740430T2rLIZ.LIZJ != null) {
                final C0T0O c0t0o = c740430T2rLIZ.LIZJ;
                if (!this.LIZ && !z) {
                    if (!((ConcurrentHashMap) this.LIZIZ).containsKey(str)) {
                        ((ConcurrentHashMap) this.LIZIZ).put(str, c0t0o);
                        return;
                    }
                    return;
                }
                Aweme aweme = this.LIZLLL;
                if (aweme != null && (aid = aweme.getAid()) != null) {
                    if (c740430T2rLIZ.LIZ) {
                        C740380T2m c740380T2m = C740380T2m.LIZ;
                        ARunnableS45S0300000_12 aRunnableS45S0300000_12 = new ARunnableS45S0300000_12(c0t0o, this, c740430T2rLIZ, 21);
                        final ARunnableS45S0300000_12 aRunnableS45S0300000_122 = new ARunnableS45S0300000_12(c740430T2rLIZ, this, c0t0o, aid, 22);
                        c740380T2m.getClass();
                        C11K6 c11k6LJJJJI = C11NZ.LJJJJI(new ACallableS411S0100000_3(aRunnableS45S0300000_12, 26));
                        if (c0t0o != null) {
                            interfaceC742320T9yLIZ = C740750T3x.LIZ(c0t0o);
                        }
                        C098D c098dLJIILIIL = c11k6LJJJJI.LJIILIIL(interfaceC742320T9yLIZ);
                        C589850NBn<Boolean> c589850NBn = new C589850NBn<Boolean>(c0t0o) { // from class: X.0NBp
                            @Override // X.C589850NBn, X.InterfaceC626120Oh8
                            public final void onComplete() {
                                aRunnableS45S0300000_122.run();
                                dispose();
                            }
                        };
                        c098dLJIILIIL.LIZIZ(c589850NBn);
                        C740380T2m.LIZ(aid, c589850NBn);
                    } else if (c740430T2rLIZ.LIZIZ) {
                        LIZJ(c0t0o);
                    }
                }
                ((ConcurrentHashMap) this.LIZJ).put(str, Boolean.TRUE);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}

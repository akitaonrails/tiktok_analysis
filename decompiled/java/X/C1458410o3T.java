package X;

import Y.AfS6S0000100_22;
import android.app.Activity;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.model.IMusicRequestParam;
import com.ss.android.ugc.aweme.music.model.MusicList;
import com.ss.android.ugc.aweme.network.spi.INetworkStateService;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.SuggestMusicList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0o3T, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1458410o3T implements InterfaceC1458900o4G {
    public static AbstractC2289508y5 LIZIZ;
    public static C11PQ<C204607154j> LIZLLL;
    public static AbstractC2289508y5 LJ;
    public static List<? extends MusicModel> LJFF;
    public static MusicList LJI;
    public static C1458600o3m LJII;
    public static AbstractC1921407fo LJIIIIZZ;
    public static String LJIIJ;
    public static final C1458410o3T LIZ = new C1458410o3T();
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(475));
    public static Pair<String, Boolean> LJIIIZ = new Pair<>("", Boolean.FALSE);

    public static String LJII() {
        C1458370o3P.LIZ.getClass();
        if (!C1458370o3P.LJIJI() || !C1458370o3P.LIZ()) {
            AbstractC2289508y5 abstractC2289508y5 = LJ;
            if (abstractC2289508y5 != null) {
                return abstractC2289508y5.LJIIIIZZ();
            }
            return null;
        }
        String strLJIILLIIL = C1458370o3P.LJIILLIIL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getPreloadFrameZipUrl finalResult:");
        sbLIZ.append(strLJIILLIIL);
        C201955140j.LJIILIIL("PreEmbTaskManager", C2188811AlT.LIZIZ(sbLIZ));
        if (strLJIILLIIL != null) {
            return strLJIILLIIL;
        }
        AbstractC2289508y5 abstractC2289508y52 = LJ;
        if (abstractC2289508y52 != null) {
            return abstractC2289508y52.LJIIIIZZ();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ss.android.ugc.aweme.shortvideo.model.SuggestMusicList LIZIZ(boolean r11) {
        /*
            X.0hkj r0 = X.C1216150hkj.LIZ
            r0.getClass()
            X.0o47 r0 = new X.0o47
            r0.<init>()
            java.lang.reflect.Type r4 = r0.getType()
            com.ss.android.ugc.aweme.utils.GsonProvider r0 = X.C7740030o.LIZ()     // Catch: com.google.gson.s -> L32
            com.google.gson.Gson r3 = r0.getGson()     // Catch: com.google.gson.s -> L32
            X.01GW r0 = X.C1216150hkj.LIZJ     // Catch: com.google.gson.s -> L32
            java.lang.Object r2 = r0.getValue()     // Catch: com.google.gson.s -> L32
            com.bytedance.keva.Keva r2 = (com.bytedance.keva.Keva) r2     // Catch: com.google.gson.s -> L32
            if (r11 == 0) goto L2f
            java.lang.String r1 = "unlimited_ai_music_list"
        L22:
            java.lang.String r0 = "[]"
            java.lang.String r0 = r2.getString(r1, r0)     // Catch: com.google.gson.s -> L32
            java.lang.Object r3 = com.bytedance.mt.protector.impl.GsonProtectorUtils.fromJson(r3, r0, r4)     // Catch: com.google.gson.s -> L32
            X.0o41 r3 = (X.C1458750o41) r3     // Catch: com.google.gson.s -> L32
            goto L44
        L2f:
            java.lang.String r1 = "ai_music_list"
            goto L22
        L32:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.0o41 r3 = new X.0o41
            r4 = 0
            r5 = 0
            r7 = 0
            r11 = 255(0xff, float:3.57E-43)
            r8 = r7
            r9 = r7
            r10 = r4
            r3.<init>(r4, r5, r7, r8, r9, r10, r11)
        L44:
            java.util.List<com.ss.android.ugc.aweme.shortvideo.model.MusicModel> r0 = r3.LIZ
            if (r0 == 0) goto L92
            boolean r0 = r0.isEmpty()
            r1 = 1
            r0 = r0 ^ 1
            if (r0 != r1) goto L92
        L51:
            r2 = 0
            if (r1 == 0) goto L8b
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "checkCache: return cache list, size="
            r1.append(r0)
            java.util.List<com.ss.android.ugc.aweme.shortvideo.model.MusicModel> r0 = r3.LIZ
            if (r0 == 0) goto L69
            int r0 = r0.size()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
        L69:
            r1.append(r2)
            X.C2188811AlT.LIZIZ(r1)
            com.ss.android.ugc.aweme.shortvideo.model.SuggestMusicList r2 = new com.ss.android.ugc.aweme.shortvideo.model.SuggestMusicList
            r2.<init>()
            int r1 = r3.LIZIZ
            r0 = 2
            if (r1 != r0) goto L8c
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L7d:
            r2.musicType = r0
            java.util.List<com.ss.android.ugc.aweme.shortvideo.model.MusicModel> r0 = r3.LIZ
            r2.musicList = r0
            int r0 = r3.LIZJ
            r2.cursor = r0
            boolean r0 = r3.LIZLLL
            r2.hasMore = r0
        L8b:
            return r2
        L8c:
            r0 = 3
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L7d
        L92:
            r1 = 0
            goto L51
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1458410o3T.LIZIZ(boolean):com.ss.android.ugc.aweme.shortvideo.model.SuggestMusicList");
    }

    public static boolean LIZJ(String str) {
        if (!C0L5K.LIZ()) {
            return false;
        }
        if ((!C0C64.LJIILLIIL().LJIIIZ(31744, "auto_music_use_cache_fallback", true, false) && !C291130Bb5.LIZ() && !C2535509wf.LIZ()) || !Intrinsics.LJFF(str, "request_from_album")) {
            return false;
        }
        return true;
    }

    public static void LJIIIIZZ(String str) {
        String str2;
        if (str != null && C2292008yU.LIZ() && (str2 = AbstractC2289508y5.LJJ.get(str)) != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("notifyZipFilePathReadyIfNeed-->tosUrl:");
            sbLIZ.append(str);
            sbLIZ.append(" zipPath:");
            sbLIZ.append(str2);
            sbLIZ.append(" creationId:");
            sbLIZ.append(C2275708vr.LJ);
            C201955140j.LJFF("PreEmbTaskManager", C2188811AlT.LIZIZ(sbLIZ));
            C2290208yC.LIZ(C2275708vr.LJ, str2);
        }
    }

    public static final void LJIIJ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BaseAIMusicUploadFrameTask removeZipFilePathObserver.creationId:");
        sbLIZ.append(str);
        C201955140j.LJIILIIL("AIMusicConfigHelper", C2188811AlT.LIZIZ(sbLIZ));
        ConcurrentHashMap<String, C11PQ<String>> concurrentHashMap = AbstractC2289508y5.LJIL;
        if (str == null) {
            str = "";
        }
        concurrentHashMap.remove(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJIIJJI(boolean r3) {
        /*
            X.08y5 r0 = X.C1458410o3T.LJ
            r2 = 1
            if (r0 == 0) goto Lac
            X.0956 r0 = r0.LJIIL
            if (r0 == 0) goto Lac
            boolean r0 = r0.isActive()
            if (r0 != r2) goto Lac
            X.01GW r0 = X.C265360Aac.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto Lac
            r0 = 1
        L1e:
            r1 = 0
            if (r0 != 0) goto L31
            if (r3 != 0) goto Laa
            X.08y5 r0 = X.C1458410o3T.LJ
            if (r0 == 0) goto La8
            java.lang.String r0 = r0.LJIIIIZZ()
        L2b:
            boolean r0 = X.C123100dR.LIZ(r0)
            if (r0 == 0) goto Laa
        L31:
            r0 = 1
        L32:
            X.C1458410o3T.LIZLLL = r1
            X.C1458410o3T.LJIIIIZZ = r1
            if (r0 != 0) goto L3d
            X.C1458410o3T.LJ = r1
            X.C2275708vr.LIZ()
        L3d:
            X.08y5 r0 = X.C1458410o3T.LIZIZ
            if (r0 == 0) goto L59
            X.0956 r0 = r0.LJIIL
            if (r0 == 0) goto L8b
            boolean r0 = r0.isActive()
            if (r0 != r2) goto L8b
            X.01GW r0 = X.C265350Aab.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L8b
        L59:
            X.0VSJ r1 = new X.0VSJ
            X.01GW r0 = X.C1458410o3T.LIZJ
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            r1.<init>(r0)
            X.C2286708xd.LJIILLIIL(r1)
            X.0LAB r2 = new X.0LAB
            r2.<init>()
            X.1Ds4 r0 = X.C0CHQ.LIZ()
            X.0o1f r0 = r0.getAccountService()
            boolean r0 = r0.isLogin()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "login"
            r2.LJ(r0, r1)
            java.util.Map<java.lang.String, java.lang.String> r1 = r2.LIZ
            java.lang.String r0 = "ai_music_reset"
            X.C20684815ws.LJIILLIIL(r0, r1)
            return
        L8b:
            if (r3 != 0) goto L9e
            X.08y5 r0 = X.C1458410o3T.LIZIZ
            if (r0 == 0) goto L9c
            java.lang.String r0 = r0.LJIIIIZZ()
        L95:
            boolean r0 = X.C123100dR.LIZ(r0)
            if (r0 == 0) goto L9e
            goto L59
        L9c:
            r0 = r1
            goto L95
        L9e:
            X.08y5 r0 = X.C1458410o3T.LIZIZ
            if (r0 == 0) goto La5
            r0.LIZIZ()
        La5:
            X.C1458410o3T.LIZIZ = r1
            goto L59
        La8:
            r0 = r1
            goto L2b
        Laa:
            r0 = 0
            goto L32
        Lac:
            r0 = 0
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1458410o3T.LJIIJJI(boolean):void");
    }

    public static final void LJIIL(String str) {
        if (!a0.LJJJIL(str)) {
            LJIIIZ = new Pair<>(str, Boolean.TRUE);
        }
    }

    public final void LJIIIZ(C1446210njn c1446210njn) {
        boolean zLJI = MethodIDManager.LJI(196703);
        if (LIZLLL != null) {
            if (zLJI) {
                MethodIDManager.LJ();
            }
        } else {
            LIZLLL = new C11PQ<>();
            long jCurrentTimeMillis = System.currentTimeMillis();
            LJ(this, 0, 30, jCurrentTimeMillis, c1446210njn).LJJLL(new AfS6S0000100_22(jCurrentTimeMillis, 0), new AfS6S0000100_22(jCurrentTimeMillis, 1));
            if (zLJI) {
                MethodIDManager.LJ();
            }
        }
    }

    public static boolean LIZLLL(String str, String str2) {
        if (!C0L5K.LIZ()) {
            return false;
        }
        if ((!C0C64.LJIILLIIL().LJIIIZ(31744, "auto_music_use_cache_fallback", true, false) && !C291130Bb5.LIZ() && !C2535509wf.LIZ()) || LJI == null || C123100dR.LIZ(str) || Intrinsics.LJFF(str2, "request_from_album")) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:159:0x0335, code lost:
    
        if (r4 != false) goto L149;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C11JN LJIILIIL(X.AbstractC1921407fo r13, X.C2288408xu r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 827
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1458410o3T.LJIILIIL(X.07fo, X.08xu):X.11JN");
    }

    public static C11NZ LJ(C1458410o3T c1458410o3T, final int i, final int i2, final long j, final IMusicRequestParam iMusicRequestParam) {
        C11NZ c11nzLJ;
        C11NZ c11nzLJ2;
        final boolean z = false;
        c1458410o3T.getClass();
        if (!C1452450ntr.LIZ()) {
            if (iMusicRequestParam.getNoWaitFrameResult()) {
                c11nzLJ2 = C2275708vr.LIZLLL();
                if (c11nzLJ2 == null) {
                    c11nzLJ2 = C11NZ.LJJJJZ("");
                }
            } else {
                c11nzLJ2 = C2275708vr.LJ();
                if (c11nzLJ2 == null) {
                    c11nzLJ2 = C11NZ.LJJJJZ("");
                }
            }
            return c11nzLJ2.LJJJ(new InterfaceC1487280oo2() { // from class: X.0o3q
                @Override // X.InterfaceC1487280oo2
                public final Object apply(Object obj) {
                    final long j2 = j;
                    final IMusicRequestParam iMusicRequestParam2 = iMusicRequestParam;
                    final boolean z2 = z;
                    final int i3 = i2;
                    final int i4 = i;
                    return C11NZ.LJIJJLI(new InterfaceC1478005qU() { // from class: X.0o3b
                        /* JADX WARN: Removed duplicated region for block: B:31:0x00a9  */
                        /* JADX WARN: Removed duplicated region for block: B:60:0x0150 A[PHI: r4
                          0x0150: PHI (r4v2 X.15O7<com.ss.android.ugc.aweme.shortvideo.model.SuggestMusicList>) = 
                          (r4v1 X.15O7<com.ss.android.ugc.aweme.shortvideo.model.SuggestMusicList>)
                          (r4v5 X.15O7<com.ss.android.ugc.aweme.shortvideo.model.SuggestMusicList>)
                         binds: [B:30:0x00a7, B:59:0x014e] A[DONT_GENERATE, DONT_INLINE]] */
                        /* JADX WARN: Removed duplicated region for block: B:83:0x01ef  */
                        @Override // X.InterfaceC1478005qU
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final void subscribe(X.C09AJ<com.ss.android.ugc.aweme.shortvideo.model.SuggestMusicList> r31) {
                            /*
                                Method dump skipped, instruction units count: 498
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C1458490o3b.subscribe(X.09AJ):void");
                        }
                    });
                }
            }, false);
        }
        final C259800zU c259800zU = new C259800zU();
        c259800zU.element = "tos_uri";
        if ((!C1452450ntr.LIZ() || !iMusicRequestParam.isEditPageImageMode()) && !C2292008yU.LIZ()) {
            if (iMusicRequestParam.getNoWaitFrameResult()) {
                c11nzLJ = C2275708vr.LIZLLL();
                if (c11nzLJ == null) {
                    c11nzLJ = C11NZ.LJJJJZ("");
                }
            } else {
                c11nzLJ = C2275708vr.LJ();
                if (c11nzLJ == null) {
                    c11nzLJ = C11NZ.LJJJJZ("");
                }
            }
        } else {
            c259800zU.element = "cloud_understanding_key";
            if (iMusicRequestParam.getNoWaitFrameResult()) {
                C2253508sH.LIZ.getClass();
                String strLJFF = C2253508sH.LJFF();
                if (!C123100dR.LIZ(strLJFF) || (c11nzLJ = C11NZ.LJJJJZ(strLJFF)) == null) {
                    c11nzLJ = C11NZ.LJJJJZ("");
                }
            } else {
                C2253508sH.LIZ.getClass();
                c11nzLJ = C2253508sH.LJIIIIZZ();
                if (c11nzLJ == null) {
                    c11nzLJ = C11NZ.LJJJJZ("");
                }
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getAIPanelMusicList start, isWeakNet=");
        sbLIZ.append(((INetworkStateService) ServiceManager.get().getService(INetworkStateService.class)).isWeakNetwork());
        C201955140j.LJIILIIL("AIChooseMusicManager", C2188811AlT.LIZIZ(sbLIZ));
        return c11nzLJ.LJJJ(new InterfaceC1487280oo2() { // from class: X.0n5I
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                final String str = (String) obj;
                final long j2 = j;
                final IMusicRequestParam iMusicRequestParam2 = iMusicRequestParam;
                final C259800zU<String> c259800zU2 = c259800zU;
                final int i3 = i;
                final int i4 = i2;
                return C11NZ.LJIJJLI(new InterfaceC1478005qU() { // from class: X.0o3a
                    /* JADX WARN: Removed duplicated region for block: B:102:0x0292  */
                    /* JADX WARN: Removed duplicated region for block: B:26:0x00a4  */
                    /* JADX WARN: Removed duplicated region for block: B:28:0x00a8 A[PHI: r27
                      0x00a8: PHI (r27v2 java.lang.String) = (r27v0 java.lang.String), (r27v3 java.lang.String) binds: [B:27:0x00a6, B:25:0x00a2] A[DONT_GENERATE, DONT_INLINE]] */
                    @Override // X.InterfaceC1478005qU
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void subscribe(X.C09AJ<com.ss.android.ugc.aweme.shortvideo.model.SuggestMusicList> r29) {
                        /*
                            Method dump skipped, instruction units count: 661
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C1458480o3a.subscribe(X.09AJ):void");
                    }
                });
            }
        }, false);
    }

    public static final C11NZ LJI(long j, String str, C1446210njn c1446210njn, C11NZ c11nz, boolean z, boolean z2, String str2, String str3, Activity activity, String str4) {
        return LJFF(30, j, false, str, c1446210njn, c11nz, z, z2, str2, str3, activity, str4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x018d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C11NZ LJFF(final int r28, final long r29, final boolean r31, final java.lang.String r32, final com.ss.android.ugc.aweme.music.model.IMusicRequestParam r33, final X.C11NZ r34, boolean r35, final boolean r36, final java.lang.String r37, final java.lang.String r38, final android.app.Activity r39, java.lang.String r40) {
        /*
            Method dump skipped, instruction units count: 469
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1458410o3T.LJFF(int, long, boolean, java.lang.String, com.ss.android.ugc.aweme.music.model.IMusicRequestParam, X.11NZ, boolean, boolean, java.lang.String, java.lang.String, android.app.Activity, java.lang.String):X.11NZ");
    }

    @Override // X.InterfaceC1458900o4G
    public final C11ON LIZ(int i, long j, boolean z, String str, IMusicRequestParam iMusicRequestParam, C11NZ c11nz, boolean z2, boolean z3, String str2, String str3, Activity activity, String str4) {
        return LJFF(i, j, z, str, iMusicRequestParam, c11nz, z2, z3, str2, str3, activity, str4).LJJJJZI(new InterfaceC1487280oo2() { // from class: X.0gQk
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                List<MusicModel> list = ((SuggestMusicList) obj).musicList;
                if (list == null) {
                    return C13BV.INSTANCE;
                }
                return list;
            }
        });
    }
}

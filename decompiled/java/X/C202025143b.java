package X;

import android.content.Context;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.service.IMusicService;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.external.ability.IAVInfoService;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: renamed from: X.143b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C202025143b implements InterfaceC20500115Jn {
    public final InterfaceC20499215Je LIZ;
    public final String LIZIZ;
    public final C202033143j LIZJ;
    public final Context LJ;
    public C1492320owA LJII;
    public int LIZLLL = -1;
    public final C201989141r LJFF = new C201989141r();
    public final C1492340owC LJI = new C1492340owC();

    @Override // X.InterfaceC20500115Jn
    public final void release() {
        this.LJFF.LIZIZ();
        C1492320owA c1492320owA = this.LJII;
        if (c1492320owA != null) {
            c1492320owA.destroy();
        }
    }

    public static String LJI(MusicModel musicModel) {
        if (musicModel.getMusicType() == 2) {
            return C1838950xxF.LIZIZ(musicModel.getReuseAudioPlayUrl());
        }
        return C1838950xxF.LIZIZ(musicModel.getUrl());
    }

    @Override // X.InterfaceC20500115Jn
    public final void LIZJ(int i) {
        this.LIZLLL = 1;
    }

    @Override // X.InterfaceC20500115Jn
    public final void LIZLLL(List<String> list) {
        Iterator<String> it2 = list.iterator();
        while (it2.hasNext()) {
            this.LJFF.LIZ(it2.next());
        }
        C1492320owA c1492320owA = this.LJII;
        if (c1492320owA != null) {
            c1492320owA.destroy();
        }
    }

    @Override // X.InterfaceC20500115Jn
    public final void LJJIIJ(String str) {
        this.LJFF.LIZ(str);
        C1492320owA c1492320owA = this.LJII;
        if (c1492320owA != null) {
            c1492320owA.destroy();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0063 A[PHI: r2
      0x0063: PHI (r2v3 java.util.List<java.lang.String>) = (r2v2 java.util.List<java.lang.String>), (r2v5 java.util.List<java.lang.String>) binds: [B:19:0x0062, B:10:0x002d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIIIZ(com.ss.android.ugc.aweme.shortvideo.model.MusicModel r12, X.InterfaceC202028143e r13) throws java.lang.Throwable {
        /*
            r11 = this;
            java.lang.String r0 = "SimPlayerMusicFetcher: using SimPlayerMusicFetcher download music"
            X.C201955140j.LIZ(r0)
            long r9 = java.lang.System.currentTimeMillis()
            X.0otG r0 = X.C1490520otG.LJFF()
            java.lang.String r1 = r0.LIZ()
            boolean r0 = X.C1487190ont.LIZ(r1)
            if (r0 != 0) goto L1a
            X.C1487190ont.LIZIZ(r1)
        L1a:
            r3 = r12
            int r2 = r3.getMusicType()
            r0 = 2
            r1 = 0
            if (r2 != r0) goto L57
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r3.getReuseAudioPlayUrl()
            if (r0 == 0) goto L62
            java.util.List r2 = r0.getUrlList()
        L2d:
            if (r2 == 0) goto L63
            java.lang.Object r8 = X.C13LP.LJJJLL(r2)
            java.lang.String r8 = (java.lang.String) r8
        L35:
            X.0otG r0 = X.C1490520otG.LJFF()
            if (r2 == 0) goto L41
            java.lang.Object r1 = X.C13LP.LJJJLL(r2)
            java.lang.String r1 = (java.lang.String) r1
        L41:
            java.lang.String r6 = r0.LIZLLL(r1)
            boolean r7 = X.C1487190ont.LIZ(r6)
            r5 = r11
            X.0owC r1 = r5.LJI
            r1.getClass()
            X.0owA r0 = new X.0owA
            r0.<init>(r1)
            r5.LJII = r0
            goto L65
        L57:
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r3.getUrl()
            if (r0 == 0) goto L62
            java.util.List r2 = r0.getUrlList()
            goto L2d
        L62:
            r2 = r1
        L63:
            r8 = r1
            goto L35
        L65:
            r0.LIZJ()     // Catch: java.lang.Throwable -> L6e
            r4 = r13
            boolean r0 = LJIIJ(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L6e
            return r0
        L6e:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            boolean r0 = r1 instanceof X.C202036143m
            if (r0 == 0) goto L7d
            X.143m r1 = (X.C202036143m) r1
            java.lang.Throwable r0 = r1.getRealThrowable()
            throw r0
        L7d:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C202025143b.LJIIIZ(com.ss.android.ugc.aweme.shortvideo.model.MusicModel, X.143e):boolean");
    }

    public C202025143b(InterfaceC20499215Je interfaceC20499215Je, Context context, String str) {
        this.LIZ = interfaceC20499215Je;
        this.LIZIZ = str;
        this.LIZJ = new C202033143j(context, true, true, true, str);
        this.LJ = C786410Ut5.N3(context);
    }

    public final boolean LJFF(final MusicModel musicModel, final InterfaceC202028143e interfaceC202028143e, boolean z) {
        return LJIIIZ(musicModel, new InterfaceC202028143e() { // from class: X.143d
            public final /* synthetic */ boolean LIZLLL = true;

            @Override // X.InterfaceC202028143e
            public final void LIZIZ(Map map, Map map2) {
            }

            @Override // X.InterfaceC202028143e
            public final void onCancel() {
                interfaceC202028143e.onCancel();
            }

            @Override // X.InterfaceC202028143e
            public final void onStart() {
                interfaceC202028143e.onStart();
            }

            @Override // X.InterfaceC202028143e
            public final void LIZJ(C202035143l c202035143l) {
                C201955140j.LIZ("SimPlayerMusicFetcher: download failed, use backupMusicFetcher");
                C202033143j c202033143j = this.LIZJ;
                c202033143j.LIZIZ.LIZIZ(musicModel, interfaceC202028143e, this.LIZLLL, false, false);
            }

            @Override // X.InterfaceC202028143e
            public final void onProgress(int i) {
                interfaceC202028143e.onProgress(i);
            }

            @Override // X.InterfaceC202028143e
            public final void LIZ(String str, MusicWaveBean musicWaveBean, Boolean bool) {
                interfaceC202028143e.LIZ(str, musicWaveBean, bool);
            }
        });
    }

    @Override // X.InterfaceC20500115Jn
    public final boolean LIZ(final List list, final InterfaceC202028143e interfaceC202028143e, boolean z, boolean z2) throws Throwable {
        final ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        final ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
        final ConcurrentHashMap concurrentHashMap3 = new ConcurrentHashMap();
        final ConcurrentHashMap concurrentHashMap4 = new ConcurrentHashMap();
        final C013C c013c = new C013C();
        final C013C c013c2 = new C013C();
        Iterator it2 = list.iterator();
        boolean z3 = true;
        while (it2.hasNext()) {
            final MusicModel musicModel = (MusicModel) it2.next();
            boolean zLJIIIZ = LJIIIZ(musicModel, new InterfaceC202028143e() { // from class: X.143f
                @Override // X.InterfaceC202028143e
                public final void LIZIZ(Map map, Map map2) {
                }

                @Override // X.InterfaceC202028143e
                public final void onProgress(int i) {
                }

                @Override // X.InterfaceC202028143e
                public final void onCancel() {
                    C013C c013c3 = c013c2;
                    if (c013c3.element) {
                        return;
                    }
                    c013c3.element = true;
                    interfaceC202028143e.onCancel();
                }

                @Override // X.InterfaceC202028143e
                public final void onStart() {
                    C013C c013c3 = c013c;
                    if (c013c3.element) {
                        return;
                    }
                    c013c3.element = true;
                    interfaceC202028143e.onStart();
                }

                @Override // X.InterfaceC202028143e
                public final void LIZJ(C202035143l c202035143l) {
                    concurrentHashMap4.putIfAbsent(musicModel.getMusicId(), c202035143l);
                    interfaceC202028143e.onProgress(((concurrentHashMap.size() + concurrentHashMap4.size()) * 100) / list.size());
                    if (concurrentHashMap.size() + concurrentHashMap4.size() == list.size()) {
                        interfaceC202028143e.LIZJ(c202035143l);
                    }
                }

                @Override // X.InterfaceC202028143e
                public final void LIZ(String str, MusicWaveBean musicWaveBean, Boolean bool) {
                    concurrentHashMap.putIfAbsent(musicModel.getMusicId(), str);
                    if (musicWaveBean != null) {
                        concurrentHashMap2.putIfAbsent(musicModel.getMusicId(), musicWaveBean);
                    }
                    if (bool != null) {
                        concurrentHashMap3.putIfAbsent(musicModel.getMusicId(), Boolean.valueOf(bool.booleanValue()));
                    }
                    interfaceC202028143e.onProgress(((concurrentHashMap.size() + concurrentHashMap4.size()) * 100) / list.size());
                    if (concurrentHashMap.size() + concurrentHashMap4.size() == list.size()) {
                        if (concurrentHashMap4.isEmpty()) {
                            interfaceC202028143e.LIZIZ(concurrentHashMap, concurrentHashMap2);
                        } else {
                            interfaceC202028143e.LIZJ((C202035143l) C13LP.LJJJJZ(concurrentHashMap4.values()));
                        }
                    }
                }
            });
            if (z3 && zLJIIIZ) {
                z3 = true;
            } else {
                z3 = false;
            }
        }
        return z3;
    }

    @Override // X.InterfaceC20500115Jn
    public final boolean LIZIZ(MusicModel musicModel, InterfaceC202028143e interfaceC202028143e, boolean z, boolean z2, boolean z3) {
        C201955140j.LIZ("SimPlayerMusicFetcher: start fetch");
        return LJFF(musicModel, interfaceC202028143e, true);
    }

    public static final boolean LJIIJ(final MusicModel musicModel, InterfaceC202028143e interfaceC202028143e, final C202025143b c202025143b, final String str, boolean z, final String str2, final long j) {
        final C202041143r c202041143rLIZ = C202034143k.LIZ(musicModel, interfaceC202028143e, c202025143b.LIZIZ, "simplayer");
        c202041143rLIZ.onStart();
        if (!C142I.LIZ(musicModel, c202025143b.LJ, true)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("SimPlayerMusicFetcher music id is invalid: ");
            sbLIZ.append(musicModel.getId());
            c202041143rLIZ.LIZJ(new C202035143l(5, C2188811AlT.LIZIZ(sbLIZ)));
            C201955140j.LJ("SimPlayerMusicFetcher download not online music");
            return false;
        }
        if (TextUtils.isEmpty(musicModel.getMusicId())) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("SimPlayerMusicFetcher music id is empty error, name: ");
            String name = musicModel.getName();
            String str3 = "";
            if (name == null) {
                name = "";
            }
            sbLIZ2.append(name);
            c202041143rLIZ.LIZJ(new C202035143l(4, C2188811AlT.LIZIZ(sbLIZ2)));
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("SimPlayerMusicFetcher music id is empty, name: ");
            String name2 = musicModel.getName();
            if (name2 == null) {
                name2 = "";
            }
            sbLIZ3.append(name2);
            sbLIZ3.append(", artist: ");
            String singer = musicModel.getSinger();
            if (singer != null) {
                str3 = singer;
            }
            sbLIZ3.append(str3);
            C201955140j.LJ(C2188811AlT.LIZIZ(sbLIZ3));
            return false;
        }
        if (musicModel.getMusicType() != 1 && musicModel.getMusicType() != 2) {
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("SimPlayerMusicFetcher music not support download: ");
            sbLIZ4.append(musicModel.getId());
            c202041143rLIZ.LIZJ(new C202035143l(6, C2188811AlT.LIZIZ(sbLIZ4)));
            C201955140j.LJ("SimPlayerMusicFetcher download not online music");
            return false;
        }
        String musicId = musicModel.getMusicId();
        String strLIZIZ = C1838950xxF.LIZIZ(musicModel.getUrl());
        String strLIZIZ2 = C1838950xxF.LIZIZ(musicModel.getStrongBeatUrl());
        C1492570owZ c1492570owZ = C1492570owZ.LIZ;
        String str4 = c202025143b.LIZIZ;
        c1492570owZ.getClass();
        C1492570owZ.LIZIZ(musicId, str4, strLIZIZ, strLIZIZ2);
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append(c202025143b.LIZIZ);
        sbLIZ5.append(", MusicDownloadStart: musicId=");
        sbLIZ5.append(musicId);
        sbLIZ5.append(", url=");
        sbLIZ5.append(strLIZIZ);
        sbLIZ5.append(',');
        C2344809Gs.LJ(C2188811AlT.LIZIZ(sbLIZ5));
        if (musicModel.getStrongBeatUrl() != null) {
            C201987141p c201987141p = new C201987141p(musicModel.getStrongBeatUrl(), ((IMusicService) ServiceManager.get().getService(IMusicService.class)).LIZ(musicModel), musicModel.getMusicId(), new CountDownLatch(0));
            c201987141p.LJI = c202025143b.LJFF;
            c201987141p.LIZ();
        }
        final C202043143t c202043143t = new C202043143t(c202041143rLIZ);
        final long jLIZ = C313220CPo.LIZ(str);
        if (z) {
            c202025143b.LJ(musicModel, str, str2, jLIZ, -1L, z, c202041143rLIZ, c202043143t);
            return true;
        }
        final boolean z2 = false;
        c202025143b.LIZ.LJFF(musicModel.getMusicId(), str, new InterfaceC1475840oVa() { // from class: X.143a
            @Override // X.InterfaceC1475840oVa
            public final /* synthetic */ void LIZ(long j2, long j3) {
            }

            @Override // X.InterfaceC1475840oVa
            public final void LIZIZ(int i) {
                long j2;
                c202025143b.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                long j3 = j;
                if (j3 < 0) {
                    j2 = -1;
                } else {
                    j2 = jCurrentTimeMillis - j3;
                }
                C202025143b c202025143b2 = c202025143b;
                Integer numValueOf = Integer.valueOf(i);
                String musicId2 = musicModel.getMusicId();
                C202025143b c202025143b3 = c202025143b;
                MusicModel musicModel2 = musicModel;
                c202025143b3.getClass();
                c202025143b2.LJII(numValueOf, "simPlayerMusicFetcher onCopyError", "", 0, 0L, "", musicId2, C202025143b.LJI(musicModel2), musicModel.isNeedSetCookie(), z2, j2);
                c202043143t.LIZJ(new C202035143l(-13, "reuse simplayer audition cache failed"));
            }

            @Override // X.InterfaceC1475840oVa
            public final void onCopyComplete(boolean z3, int i, String str5) {
                long j2;
                long jCurrentTimeMillis = System.currentTimeMillis();
                long j3 = j;
                if (j3 < 0) {
                    j2 = -1;
                } else {
                    j2 = jCurrentTimeMillis - j3;
                }
                if (!C2354709Kn.LIZIZ(str)) {
                    c202025143b.getClass();
                    C202025143b c202025143b2 = c202025143b;
                    String musicId2 = musicModel.getMusicId();
                    C202025143b c202025143b3 = c202025143b;
                    MusicModel musicModel2 = musicModel;
                    c202025143b3.getClass();
                    c202025143b2.LJII(1063, "file not exist", "", 0, 0L, "", musicId2, C202025143b.LJI(musicModel2), musicModel.isNeedSetCookie(), false, j2);
                    c202043143t.LIZJ(new C202035143l(-13, "reuse simplayer audition cache failed"));
                    return;
                }
                c202025143b.LJ(musicModel, str, str2, jLIZ, j2, z2, c202041143rLIZ, c202043143t);
            }
        });
        return true;
    }

    public final void LJ(final MusicModel musicModel, final String str, final String str2, final long j, final long j2, final boolean z, final InterfaceC202028143e interfaceC202028143e, final C202043143t c202043143t) {
        ((IExternalService) ServiceManager.get().getService(IExternalService.class)).abilityService().infoService().audioLegal(str, this.LIZLLL, new IAVInfoService.IGetInfoCallback<Integer>() { // from class: X.143Z
            @Override // com.ss.android.ugc.aweme.services.external.ability.IAVInfoService.IGetInfoCallback
            public final void finish(Integer num) throws Throwable {
                Boolean bool;
                int iIntValue = num.intValue();
                if (iIntValue < 0) {
                    this.getClass();
                    C202025143b c202025143b = this;
                    String str3 = str2;
                    long j3 = j;
                    String strLJIIIIZZ = C2137908Zd.LIZJ.LJIIIIZZ(str);
                    String musicId = musicModel.getMusicId();
                    C202025143b c202025143b2 = this;
                    MusicModel musicModel2 = musicModel;
                    c202025143b2.getClass();
                    c202025143b.LJII(-2, "", str3, iIntValue, j3, strLJIIIIZZ, musicId, C202025143b.LJI(musicModel2), musicModel.isNeedSetCookie(), z, j2);
                    interfaceC202028143e.LIZJ(new C202035143l(-13, "reuse simplayer audition cache failed"));
                    return;
                }
                C202025143b c202025143b3 = this;
                long j4 = j2;
                long j5 = j;
                String musicId2 = musicModel.getMusicId();
                C202025143b c202025143b4 = this;
                MusicModel musicModel3 = musicModel;
                c202025143b4.getClass();
                String strLJI = C202025143b.LJI(musicModel3);
                boolean zIsNeedSetCookie = musicModel.isNeedSetCookie();
                C202026143c.LIZIZ(strLJI, j4, j5, c202025143b3.LIZIZ, zIsNeedSetCookie, z);
                C1492570owZ c1492570owZ = C1492570owZ.LIZ;
                String str4 = c202025143b3.LIZIZ;
                Long lValueOf = Long.valueOf(j4);
                Long lValueOf2 = Long.valueOf(j5);
                c1492570owZ.getClass();
                C1492570owZ.LIZJ(musicId2, str4, strLJI, lValueOf, lValueOf2);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(c202025143b3.LIZIZ);
                sbLIZ.append(", MusicDownloadSuccess: musicId=");
                sbLIZ.append(musicId2);
                sbLIZ.append(", url=");
                sbLIZ.append(strLJI);
                sbLIZ.append(", curUrl=");
                sbLIZ.append("");
                sbLIZ.append(" isPrivate=");
                sbLIZ.append(zIsNeedSetCookie);
                C2344809Gs.LJ(C2188811AlT.LIZIZ(sbLIZ));
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("SimPlayerMusicFetcher: download success, duration = ");
                sbLIZ2.append(j2);
                sbLIZ2.append(", isHitCache = ");
                sbLIZ2.append(z);
                C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
                C202043143t c202043143t2 = c202043143t;
                String str5 = str;
                if (!z) {
                    bool = null;
                } else {
                    bool = Boolean.TRUE;
                }
                c202043143t2.LIZ(str5, null, bool);
            }
        });
    }

    public final void LJII(Integer num, String str, String str2, int i, long j, String str3, String str4, String str5, boolean z, boolean z2, long j2) {
        int iIntValue;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = -1;
        }
        C202026143c.LIZ(iIntValue, str, str4, str5, this.LIZIZ, str2, j, str3, i, z, z2);
        C1492570owZ c1492570owZ = C1492570owZ.LIZ;
        String str6 = this.LIZIZ;
        Long lValueOf = Long.valueOf(j2);
        c1492570owZ.getClass();
        C1492570owZ.LIZ(str4, str6, str5, str, lValueOf);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", MusicDownloadError: errocode=");
        sbLIZ.append(num);
        sbLIZ.append("errorMsg=");
        sbLIZ.append(str);
        sbLIZ.append("musicId=");
        sbLIZ.append(str4);
        sbLIZ.append(", url=");
        sbLIZ.append(str5);
        sbLIZ.append(", curUrl=");
        sbLIZ.append(str2);
        sbLIZ.append(" isPrivate=");
        sbLIZ.append(z);
        sbLIZ.append(" fileMagic=");
        sbLIZ.append(str3);
        sbLIZ.append(" fileSize=");
        sbLIZ.append(j);
        sbLIZ.append(" veErrorCode=");
        sbLIZ.append(i);
        C2344809Gs.LJ(C2188811AlT.LIZIZ(sbLIZ));
    }
}

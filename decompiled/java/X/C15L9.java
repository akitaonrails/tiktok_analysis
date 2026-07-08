package X;

import android.app.Activity;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.v2.assem.MusicShootAssem;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.Pair;
import kotlin.jvm.internal.AwS81S0301000_31;

/* JADX INFO: renamed from: X.15L9, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15L9 {
    public final C20498815Ja LIZ;
    public final C202033143j LIZIZ;
    public String LIZJ;
    public Activity LIZLLL;
    public C15LG LJ;
    public C15LD LJFF;
    public Effect LJI;
    public Effect LJII;
    public C1661100tKO LJIIIIZZ;
    public C1661100tKO LJIIIZ;
    public C1661130tKR LJIIJ;

    public C15L9() {
        throw null;
    }

    public final void LIZIZ() {
        this.LIZLLL = null;
        C202033143j c202033143j = this.LIZIZ;
        if (c202033143j != null) {
            c202033143j.release();
        }
        C1661100tKO c1661100tKO = this.LJIIIIZZ;
        if (c1661100tKO != null) {
            c1661100tKO.LIZJ();
        }
        if (this.LJ != null) {
            this.LJ = null;
        }
    }

    public final void LIZ(String str) {
        C202033143j c202033143j = this.LIZIZ;
        if (c202033143j != null && this.LJIIIIZZ == null) {
            c202033143j.LJJIIJ(str);
        }
        C1661100tKO c1661100tKO = this.LJIIIIZZ;
        if (c1661100tKO != null) {
            c1661100tKO.LIZ();
        }
    }

    public static void LJII(long j, String str) {
        double d;
        long length = new C0VSJ(str).length();
        if (j == 0) {
            d = 0.0d;
        } else {
            d = length / j;
        }
        C2241008qG c2241008qG = new C2241008qG();
        c2241008qG.LIZ.put("duration", Long.valueOf(j));
        c2241008qG.LIZ.put("speed", Double.valueOf(d));
        c2241008qG.LIZ.put("size", Long.valueOf(length));
        c2241008qG.LIZ.put("fileName", str);
        C794240VDq.LIZJ("aweme_music_detail_download_success_rate", c2241008qG.LJ());
    }

    public final C1661100tKO LJFF(MusicModel musicModel, String str) {
        if (musicModel.getMusicType() == 2) {
            if (this.LJIIIZ == null) {
                AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
                if (this.LIZLLL == null && abstractC1387200mCcLIZIZ != null && (abstractC1387200mCcLIZIZ.LIZIZ() instanceof Activity)) {
                    this.LIZLLL = abstractC1387200mCcLIZIZ.LIZIZ();
                }
                this.LJIIIZ = new C1661100tKO(this.LIZLLL, str, musicModel, this.LIZIZ, this.LIZJ);
            }
            return this.LJIIIZ;
        }
        if (this.LJIIIIZZ == null) {
            AbstractC1387200mCc abstractC1387200mCcLIZIZ2 = C1906580ziK.LIZIZ();
            if (this.LIZLLL == null && abstractC1387200mCcLIZIZ2 != null && (abstractC1387200mCcLIZIZ2.LIZIZ() instanceof Activity)) {
                this.LIZLLL = abstractC1387200mCcLIZIZ2.LIZIZ();
            }
            this.LJIIIIZZ = new C1661100tKO(this.LIZLLL, str, musicModel, this.LIZIZ, this.LIZJ);
        }
        return this.LJIIIIZZ;
    }

    public final C1661130tKR LJI(MusicModel musicModel, String str) {
        if (this.LJIIJ == null) {
            this.LJIIJ = new C1661130tKR(LJFF(musicModel, str));
        }
        return this.LJIIJ;
    }

    public C15L9(C19EG c19eg, MusicShootAssem musicShootAssem, boolean z) {
        this.LIZLLL = c19eg;
        this.LIZ = new C20498815Ja("music_detail_page");
        C202033143j c202033143j = new C202033143j(this.LIZLLL, "music_detail_page", false, true, true, z);
        this.LIZIZ = c202033143j;
        this.LIZJ = "music_detail_page";
        c202033143j.LIZIZ.LJ = 2;
        this.LJ = musicShootAssem;
    }

    public C15L9(Activity activity, C15LG c15lg, boolean z) {
        this.LIZLLL = activity;
        this.LIZ = new C20498815Ja("music_detail_page");
        C202033143j c202033143j = new C202033143j(this.LIZLLL, "music_detail_page", z, true);
        this.LIZIZ = c202033143j;
        this.LIZJ = "music_detail_page";
        c202033143j.LIZIZ.LJ = 2;
        this.LJ = c15lg;
    }

    public final void LJ(MusicModel musicModel, String str, boolean z, int i, boolean z2, boolean z3, boolean z4) {
        LIZLLL(i, musicModel, str, z, z2, z3, z4, false, false);
    }

    public final void LIZLLL(final int i, MusicModel musicModel, final String str, final boolean z, final boolean z2, final boolean z3, final boolean z4, final boolean z5, boolean z6) {
        String downloadUrlKey;
        C1661090tKN c1661090tKN;
        this.LIZ.pause();
        if (this.LIZLLL != null) {
            IExternalService iExternalService = (IExternalService) ServiceManager.get().getService(IExternalService.class);
            if (iExternalService != null && iExternalService.configService().avsettingsConfig().needLoginBeforeRecord()) {
                this.LJ.k8();
                return;
            }
            if (!z6) {
                try {
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (!C036E.LIZ.LIZIZ()) {
                    C1233040iBy c1233040iBy = new C1233040iBy(this.LIZLLL);
                    c1233040iBy.LIZIZ(2131837962);
                    c1233040iBy.LIZLLL();
                    return;
                }
            }
            if (C298080BmI.LIZ() && z6 && !z && !z3 && !z2 && this.LJ != null) {
                CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi(CreativeToolsPluginService.class);
                if (creativeToolsPluginService != null) {
                    creativeToolsPluginService.LIZ();
                }
                C15LG c15lg = this.LJ;
                Activity activity = this.LIZLLL;
                if (!C298080BmI.LIZ()) {
                    C201955140j.LIZLLL(C201962140q.LIZIZ, "tryUseSoundWithoutWaiting", "opt not open, go online logic");
                } else {
                    C1661100tKO c1661100tKOLJFF = LJFF(musicModel, str);
                    C1661180tKW c1661180tKW = C1661180tKW.LIZ;
                    String strLJFF = c1661100tKOLJFF.LJFF();
                    MusicModel musicModel2 = c1661100tKOLJFF.LIZJ;
                    if (musicModel2 != null) {
                        downloadUrlKey = musicModel2.getDownloadUrlKey();
                    } else {
                        downloadUrlKey = null;
                    }
                    c1661180tKW.getClass();
                    Pair pairLIZLLL = C1661180tKW.LIZLLL(musicModel, strLJFF, downloadUrlKey);
                    String str2 = (String) pairLIZLLL.getFirst();
                    boolean zBooleanValue = ((Boolean) pairLIZLLL.getSecond()).booleanValue();
                    C201962140q c201962140q = C201962140q.LIZIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("hitCache: ");
                    sbLIZ.append(zBooleanValue);
                    sbLIZ.append(", filePath: ");
                    sbLIZ.append(str2);
                    C201955140j.LIZLLL(c201962140q, "waitMusicLoading", C2188811AlT.LIZIZ(sbLIZ));
                    if (str2 != null && str2.length() != 0 && activity != null && !activity.isFinishing()) {
                        C15LA c15la = new C15LA(c1661100tKOLJFF, musicModel, str, z4, c15lg, str2, i);
                        boolean zLIZ = C123100dR.LIZ(str);
                        if (!((Boolean) C280840Aza.LIZ.getValue()).booleanValue()) {
                            if (zLIZ) {
                                C201955140j.LIZLLL(c201962140q, "tryUseSoundWithoutWaiting", "has effect but not enable, go online logic");
                            }
                        } else if (zLIZ) {
                            CreativeToolsPluginService creativeToolsPluginService2 = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null);
                            if (creativeToolsPluginService2 != null) {
                                creativeToolsPluginService2.LIZ();
                            }
                            if (((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
                                c15la.invoke();
                                return;
                            } else {
                                C0XPD.LIZIZ(activity, "music_detail", "click_shoot", null, new C20749316Hj(activity, c15la, 1));
                                return;
                            }
                        }
                        if (zBooleanValue) {
                            C371410EhH.LIZJ(new C15LB(musicModel, c15lg, str2, i));
                            return;
                        }
                        if (C1661270tKf.LIZ() && (c1661090tKN = c1661100tKOLJFF.LJII) != null && c1661090tKN.LJFF) {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("streaming download is ready, path: ");
                            sbLIZ2.append(c1661100tKOLJFF.LJFF());
                            C201955140j.LIZLLL(c201962140q, "waitMusicLoading", C2188811AlT.LIZIZ(sbLIZ2));
                            C371410EhH.LIZJ(new AwS81S0301000_31(musicModel, c15lg, c1661100tKOLJFF, i, 3));
                            return;
                        }
                        c15la.invoke();
                        return;
                    }
                    C201955140j.LIZLLL(c201962140q, "tryUseSoundWithoutWaiting", "meet unknown issue, go online logic");
                }
            }
            C0P0I.LIZ(musicModel, new C0P0F<MusicModel>() { // from class: X.0OvQ
                public final /* synthetic */ boolean LIZIZ = true;

                @Override // X.C0P0F
                public final void onStart() {
                }

                @Override // X.C0P0F
                public final void LIZ(MusicModel musicModel3) {
                    C15L9 c15l9 = this.LJIIIIZZ;
                    String str3 = str;
                    boolean z7 = this.LIZIZ;
                    boolean z8 = z;
                    c15l9.LIZJ(i, musicModel3, str3, false, z7, z8, z2, z3, z4, z5);
                }
            });
        }
    }

    public final void LIZJ(int i, MusicModel musicModel, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        C15LD c15ld;
        boolean zLJI = MethodIDManager.LJI(137918);
        if (z && ((Boolean) C255640A0c.LIZIZ.getValue()).booleanValue()) {
            if (zLJI) {
                MethodIDManager.LJ();
                return;
            }
            return;
        }
        if (!C19419010yC.LIZ(this.LIZLLL, "single_song", !z)) {
            if (zLJI) {
                MethodIDManager.LJ();
                return;
            }
            return;
        }
        if (musicModel != null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ID：");
            sbLIZ.append(musicModel.getId());
            C2344809Gs.LIZLLL(4, "Music Download", C2188811AlT.LIZIZ(sbLIZ));
            if (!z3 && !z5) {
                this.LJFF = new C15LD(this, musicModel, z4, str, i, jCurrentTimeMillis);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("doDownload-->music_id:");
                sbLIZ2.append(musicModel.getId());
                sbLIZ2.append(" effectId:");
                sbLIZ2.append(str);
                C201955140j.LJIILIIL("MusicDetailDownloadHelper", C2188811AlT.LIZIZ(sbLIZ2));
                C1661130tKR c1661130tKRLJI = LJI(musicModel, str);
                if (z) {
                    c15ld = null;
                } else {
                    c15ld = this.LJFF;
                }
                c1661130tKRLJI.LIZ(null, c15ld, z4, str, z6, z7);
            } else {
                this.LIZIZ.LIZIZ(musicModel, new C15LE(this, musicModel, i, jCurrentTimeMillis), z2, true, z6);
            }
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }
}

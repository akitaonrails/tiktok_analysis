package X;

import com.bytedance.als.h0;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.service.IMusicService;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0tKW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1661180tKW {
    public static AbstractC1661070tKL LIZIZ;
    public static volatile InterfaceC202028143e LIZLLL;
    public static boolean LJ;
    public static final C1661180tKW LIZ = new C1661180tKW();
    public static final h0<AbstractC1652550t6b> LIZJ = new h0<>(C1652600t6g.LIZ);
    public static final C1661030tKH LJFF = new InterfaceC1661080tKM() { // from class: X.0tKH
        @Override // X.InterfaceC1661080tKM
        public final void LJ(Effect effect) {
        }

        @Override // X.InterfaceC1661080tKM
        public final void onStart(Effect effect) {
        }

        @Override // X.InterfaceC1661080tKM
        public final void LIZ(C1661050tKJ c1661050tKJ) {
            C1661180tKW.LIZ.getClass();
            C1661180tKW.LJ("download onFailed");
            InterfaceC202028143e interfaceC202028143e = C1661180tKW.LIZLLL;
            if (interfaceC202028143e != null) {
                C202035143l c202035143l = c1661050tKJ.LIZLLL;
                if (c202035143l == null) {
                    c202035143l = new C202035143l(1002, "MDP music download failed");
                }
                interfaceC202028143e.LIZJ(c202035143l);
            }
            C1661180tKW.LIZIZ();
            C1661180tKW.LJFF(C1661000tKE.LIZ);
        }

        @Override // X.InterfaceC1661080tKM
        public final void LIZJ(C1661050tKJ c1661050tKJ) {
            Integer num;
            String str;
            if (C297990Bm9.LIZ() && (((num = c1661050tKJ.LIZJ) != null && num.intValue() == -103) || (str = c1661050tKJ.LIZ) == null || a0.LJJJIL(str))) {
                LIZ(c1661050tKJ);
                return;
            }
            C1661180tKW c1661180tKW = C1661180tKW.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("download onSuccess, file=");
            sbLIZ.append(c1661050tKJ.LIZ);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c1661180tKW.getClass();
            C1661180tKW.LJ(strLIZIZ);
            String str2 = c1661050tKJ.LIZ;
            if (str2 != null) {
                InterfaceC202028143e interfaceC202028143e = C1661180tKW.LIZLLL;
                if (interfaceC202028143e != null) {
                    interfaceC202028143e.LIZ(str2, c1661050tKJ.LIZIZ, Boolean.FALSE);
                }
                C1661180tKW.LIZIZ();
                C1661180tKW.LJFF(new C1652560t6c(str2));
                return;
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }

        @Override // X.InterfaceC1661080tKM
        public final void LIZIZ(Effect effect, String str) {
            C1661180tKW.LIZ.getClass();
            C1661180tKW.LJ("download onSkip");
            C1AF0.LIZJ("mdp_download_onSkip_call");
        }

        @Override // X.InterfaceC1661080tKM
        public final void LIZLLL(int i, Effect effect, Long l) {
            C1661180tKW c1661180tKW = C1661180tKW.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("download onProgress ");
            sbLIZ.append(i);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c1661180tKW.getClass();
            C1661180tKW.LJ(strLIZIZ);
            InterfaceC202028143e interfaceC202028143e = C1661180tKW.LIZLLL;
            if (interfaceC202028143e != null) {
                interfaceC202028143e.onProgress(i);
            }
            C1661180tKW.LJFF(new C1655250tAx(i));
        }
    };

    public static void LIZ() {
        LJ("cancel download");
        AbstractC1661070tKL abstractC1661070tKL = LIZIZ;
        if (abstractC1661070tKL != null) {
            abstractC1661070tKL.LIZ();
        }
        if (LIZJ.LIZJ() instanceof C1655250tAx) {
            LJFF(C1661010tKF.LIZ);
        }
        InterfaceC202028143e interfaceC202028143e = LIZLLL;
        if (interfaceC202028143e != null) {
            interfaceC202028143e.onCancel();
        }
        LJ("release listener");
        LIZLLL = null;
        LIZIZ();
    }

    public static void LIZIZ() {
        LJ("downloader destroy");
        AbstractC1661070tKL abstractC1661070tKL = LIZIZ;
        if (abstractC1661070tKL != null) {
            abstractC1661070tKL.LIZJ();
        }
        LIZIZ = null;
        LJ("release listener");
        LIZLLL = null;
    }

    public static void LJ(String str) {
        C201955140j.LIZLLL(C201962140q.LIZIZ, "waitMusicLoading", str);
    }

    public static void LJFF(AbstractC1652550t6b abstractC1652550t6b) {
        if (C12WP.LIZIZ()) {
            LIZJ.LJII(abstractC1652550t6b);
        } else {
            LIZJ.LJFF(abstractC1652550t6b);
        }
    }

    public static Pair LIZLLL(MusicModel musicModel, String str, String str2) {
        String strLJIIL;
        Map<String, String> creationMusicIdToLocalPathMap;
        IMusicService iMusicService = (IMusicService) ServiceManager.get().getService(IMusicService.class);
        int musicType = musicModel.getMusicType();
        String str3 = null;
        if (musicType != 1 && musicType != 2) {
            strLJIIL = null;
        } else {
            strLJIIL = ((IMusicService) ServiceManager.get().getService(IMusicService.class)).LJIIL(musicModel);
        }
        if (C123100dR.LIZ(strLJIIL) && C1487190ont.LIZ(strLJIIL)) {
            return new Pair(iMusicService.LJIIL(musicModel), Boolean.TRUE);
        }
        if (((Boolean) C280680AzK.LIZ.getValue()).booleanValue()) {
            com.ss.android.ugc.aweme.port.in.IMusicService iMusicService2 = (com.ss.android.ugc.aweme.port.in.IMusicService) PluggableExtentionKt.pluggableSpi$default(com.ss.android.ugc.aweme.port.in.IMusicService.class, false, false, false, 14, null);
            if (iMusicService2 != null && (creationMusicIdToLocalPathMap = iMusicService2.getCreationMusicIdToLocalPathMap()) != null) {
                str3 = creationMusicIdToLocalPathMap.get(musicModel.getMusicId());
            }
            if (C123100dR.LIZ(str3) && C1487190ont.LIZ(str3)) {
                return new Pair(str3, Boolean.TRUE);
            }
        }
        if (C1661270tKf.LIZ() || C1661280tKg.LIZ()) {
            if (str == null) {
                str = musicModel.getDownloadUrl();
            }
            if (str2 == null) {
                str2 = musicModel.getDownloadUrlKey();
            }
            String strLIZIZ = C202045143v.LIZIZ(str, musicModel.getMusicId(), str2);
            if (strLIZIZ != null) {
                return new Pair(strLIZIZ, Boolean.TRUE);
            }
        }
        return new Pair(iMusicService.LJIIL(musicModel), Boolean.FALSE);
    }

    public static void LIZJ(C1661180tKW c1661180tKW, final AbstractC1661070tKL abstractC1661070tKL, MusicModel musicModel, final String str, final boolean z, boolean z2) {
        AbstractC1661070tKL abstractC1661070tKL2;
        String musicId;
        final Map map = null;
        c1661180tKW.getClass();
        CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null);
        if (creativeToolsPluginService != null) {
            creativeToolsPluginService.LIZ();
        }
        LJFF(new C1655250tAx(0));
        if (C298090BmJ.LIZ() && (abstractC1661070tKL2 = LIZIZ) != null) {
            MusicModel musicModel2 = abstractC1661070tKL2.LIZJ;
            if (musicModel2 != null) {
                musicId = musicModel2.getMusicId();
            } else {
                musicId = null;
            }
            if (Intrinsics.LJFF(musicId, musicModel.getMusicId())) {
                LJ("reuse downloader");
                return;
            }
        }
        LJ("download start");
        if (z2) {
            C0P0I.LIZ(musicModel, new C0P0F<MusicModel>() { // from class: X.0tKU
                @Override // X.C0P0F
                public final void onStart() {
                }

                @Override // X.C0P0F
                public final void LIZ(MusicModel musicModel3) {
                    C1661180tKW.LIZ.getClass();
                    C1661180tKW.LJ("challenge check finish");
                    AbstractC1661070tKL abstractC1661070tKL3 = abstractC1661070tKL;
                    Map<String, String> map2 = map;
                    String str2 = str;
                    boolean z3 = z;
                    C1661180tKW.LIZIZ = abstractC1661070tKL3;
                    abstractC1661070tKL3.LJIIIIZZ(map2, C1661180tKW.LJFF, false, str2, z3, true);
                }
            });
        } else {
            LIZIZ = abstractC1661070tKL;
            abstractC1661070tKL.LJIIIIZZ(null, LJFF, false, str, z, true);
        }
    }
}

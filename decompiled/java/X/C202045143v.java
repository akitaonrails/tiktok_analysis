package X;

import android.content.Context;
import com.bytedance.scene.Scene;
import com.bytedance.ttnet.TTNetInit;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.music.model.FullSongDetail;
import com.ss.android.ugc.aweme.music.model.FullSongUrlStruct;
import com.ss.android.ugc.aweme.music.service.IMusicExternalService;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService;
import java.util.List;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.143v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C202045143v {
    public static final C202045143v LIZ = new C202045143v();

    public static boolean LIZ(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel.getVideoCount() > 0) {
            return ((Boolean) C0ATA.LIZ.getValue()).booleanValue();
        }
        return ((Boolean) C0AT7.LIZ.getValue()).booleanValue();
    }

    public static void LIZJ(String str) {
        C201955140j.LIZLLL(C201962140q.LIZIZ, "MusicStreamDownload", str);
    }

    public static final String LIZIZ(String str, String str2, String str3) {
        IMusicExternalService iMusicExternalService;
        InterfaceC1662290tMJ interfaceC1662290tMJLIZJ;
        C141Q.LIZ.getClass();
        if (!C141Q.LJII(str) || (iMusicExternalService = (IMusicExternalService) PluggableExtentionKt.pluggableSpi$default(IMusicExternalService.class, false, false, false, 14, null)) == null || (interfaceC1662290tMJLIZJ = iMusicExternalService.LIZJ()) == null) {
            return null;
        }
        return interfaceC1662290tMJLIZJ.LJFF(str, str2, str3);
    }

    public static final void LIZLLL(long j, String str, boolean z, boolean z2) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("resource_type", "music");
        c2344009Gk.LIZLLL(System.currentTimeMillis() - j, "duration");
        c2344009Gk.LIZJ(!z ? 1 : 0, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c2344009Gk.LIZJ(z2 ? 1 : 0, "hit_cache");
        c2344009Gk.LIZJ(z2 ? 1 : 0, "begin_status");
        c2344009Gk.LJIIIIZZ(Scene.SCENE_SERVICE, "music_stream");
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LJIIIIZZ("from", str);
        C20684815ws.LJIILLIIL("tool_performance_resource_download", c2344009Gk.LIZ);
    }

    public static final void LJ(final MusicModel musicModel, boolean z, boolean z2, AbstractC1661230tKb abstractC1661230tKb, InterfaceC202048143y interfaceC202048143y, final float f, int i) {
        InterfaceC1662290tMJ interfaceC1662290tMJLIZJ;
        FullSongUrlStruct fullSongUrl;
        List<String> urlList;
        C202045143v c202045143v = LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("streamDownloadMusic: musicId = ");
        sbLIZ.append(musicModel.getMusicId());
        sbLIZ.append(" successProgress = ");
        sbLIZ.append(f);
        sbLIZ.append(" netLevelThreshold = ");
        sbLIZ.append(i);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c202045143v.getClass();
        LIZJ(strLIZIZ);
        long jCurrentTimeMillis = System.currentTimeMillis();
        CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null);
        boolean z3 = false;
        if (creativeToolsPluginService != null) {
            C844470XAv.LIZ.getClass();
            if (creativeToolsPluginService.LJI(C844470XAv.LIZ())) {
                if (z2) {
                    String strLIZ = C1403010mc7.LIZ.getMusicService().LIZ(musicModel);
                    if (C2286708xd.LIZJ(strLIZ) && new C0VSJ(strLIZ).length() > 0) {
                        String name = new C0VSJ(strLIZ).getName();
                        boolean z4 = C13TD.LIZIZ;
                        C13TC.LIZ(name, musicModel.getMusicId());
                    } else if (!C298110BmL.LIZ()) {
                        strLIZ = LIZIZ(musicModel.getDownloadUrl(), musicModel.getMusicId(), null);
                    }
                    if (strLIZ != null) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("success by cache: ");
                        sbLIZ2.append(strLIZ);
                        LIZJ(C2188811AlT.LIZIZ(sbLIZ2));
                        LIZLLL(jCurrentTimeMillis, abstractC1661230tKb.LIZ, true, true);
                        interfaceC202048143y.LIZJ(strLIZ, true);
                        return;
                    }
                }
                if (z && musicModel.getFullSongDetail() != null && musicModel.getFullSongDetail().getFullSongUrl() != null) {
                    FullSongDetail fullSongDetail = musicModel.getFullSongDetail();
                    if (fullSongDetail != null && (fullSongUrl = fullSongDetail.getFullSongUrl()) != null && (urlList = fullSongUrl.getUrlList()) != null) {
                        UrlModel url = musicModel.getUrl();
                        if (url != null) {
                            url.setUrlList(urlList);
                        }
                        UrlModel url2 = musicModel.getUrl();
                        if (url2 != null) {
                            url2.setUrlKey(null);
                        }
                    }
                    musicModel.isFullSong = true;
                }
                String downloadUrl = musicModel.getDownloadUrl();
                String downloadUrlKey = musicModel.getDownloadUrlKey();
                IMusicExternalService iMusicExternalService = (IMusicExternalService) PluggableExtentionKt.pluggableSpi$default(IMusicExternalService.class, false, false, false, 14, null);
                if (iMusicExternalService != null && (interfaceC1662290tMJLIZJ = iMusicExternalService.LIZJ()) != null && downloadUrl != null && !a0.LJJJIL(downloadUrl)) {
                    C1519805xE c1519805xE = InterfaceC1519705xD.LIZ;
                    C844470XAv.LIZ.getClass();
                    Context contextLIZ = C844470XAv.LIZ();
                    c1519805xE.getClass();
                    if (!C0XF1.LIZLLL(contextLIZ)) {
                        LIZJ("onRetry by network is not available");
                        interfaceC202048143y.LIZIZ();
                        return;
                    }
                    if (i != 100) {
                        C1661300tKi.LIZ.getClass();
                        int effectiveConnectionType = TTNetInit.getEffectiveConnectionType();
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("net check, Retry: ");
                        if (effectiveConnectionType < i) {
                            z3 = true;
                        }
                        sbLIZ3.append(z3);
                        sbLIZ3.append(" netLevel = ");
                        sbLIZ3.append(effectiveConnectionType);
                        sbLIZ3.append(", netLevelThreshold = ");
                        sbLIZ3.append(i);
                        LIZJ(C2188811AlT.LIZIZ(sbLIZ3));
                        if (effectiveConnectionType < i) {
                            interfaceC202048143y.LIZIZ();
                            return;
                        }
                    }
                    final C202047143x c202047143x = new C202047143x(new C013C(), musicModel, interfaceC202048143y, jCurrentTimeMillis, abstractC1661230tKb);
                    interfaceC1662290tMJLIZJ.LJIIIZ(downloadUrl, musicModel.getMusicId(), new InterfaceC20187713yt() { // from class: X.143w
                        @Override // X.InterfaceC20187713yt
                        public final void LJJL() {
                        }

                        @Override // X.InterfaceC20187713yt
                        public final void onStart() {
                        }

                        @Override // X.InterfaceC20187713yt
                        public final void LJJJZ() {
                            c202047143x.LIZIZ();
                        }

                        @Override // X.InterfaceC20187713yt
                        public final void LJJJLIIL(String str) {
                            C202047143x c202047143x2 = c202047143x;
                            if (str == null) {
                                str = "";
                            }
                            c202047143x2.LJJJLIIL(str);
                        }

                        @Override // X.InterfaceC20187713yt
                        public final void LJJJLZIJ(String str) {
                            C202045143v c202045143v2 = C202045143v.LIZ;
                            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                            sbLIZ4.append("onOpenResult: musicId = ");
                            sbLIZ4.append(musicModel.getMusicId());
                            sbLIZ4.append(" url = ");
                            sbLIZ4.append(str);
                            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ4);
                            c202045143v2.getClass();
                            C202045143v.LIZJ(strLIZIZ2);
                            if (str != null && !a0.LJJJIL(str)) {
                                if (f == 1000.0f) {
                                    c202047143x.LIZJ(str, false);
                                    return;
                                }
                                return;
                            }
                            c202047143x.LIZ(-1, "onOpenResult url is null");
                        }

                        @Override // X.InterfaceC20187713yt
                        public final void LJJJLL(String str, float f2) {
                            C202045143v c202045143v2 = C202045143v.LIZ;
                            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                            sbLIZ4.append("onProgress musicId = ");
                            sbLIZ4.append(musicModel.getMusicId());
                            sbLIZ4.append(" url = ");
                            sbLIZ4.append(str);
                            sbLIZ4.append(" progress = ");
                            sbLIZ4.append(f2);
                            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ4);
                            c202045143v2.getClass();
                            C202045143v.LIZJ(strLIZIZ2);
                            if (str != null && !a0.LJJJIL(str)) {
                                if (f2 >= f) {
                                    c202047143x.LIZJ(str, false);
                                    return;
                                }
                                return;
                            }
                            c202047143x.LIZ(-1, "onOpenResult url is null");
                        }

                        @Override // X.InterfaceC20187713yt
                        public final void onError(int i2, String str) {
                            C202047143x c202047143x2 = c202047143x;
                            if (str == null) {
                                str = "";
                            }
                            c202047143x2.LIZ(i2, str);
                        }
                    }, downloadUrlKey);
                    return;
                }
                LIZJ("onRetry by music stream service is null or playUrl is null");
                interfaceC202048143y.LIZIZ();
                return;
            }
        }
        LIZJ("onRetry by ve plugin is not installed");
        interfaceC202048143y.LIZIZ();
    }
}

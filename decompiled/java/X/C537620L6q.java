package X;

import android.content.Context;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.port.in.IAnotherMusicService;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;

/* JADX INFO: renamed from: X.0L6q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C537620L6q {
    public static final /* synthetic */ int LIZ = 0;

    public static Object LIZ(final Context context, String str, final VideoPublishEditModel videoPublishEditModel, InterfaceC1364105Vn interfaceC1364105Vn) {
        final C23260099m c23260099m = new C23260099m(C099M.LIZLLL(interfaceC1364105Vn));
        C1403010mc7.LIZ.getMusicService().requestMusic(str, new InterfaceC1416890myV() { // from class: X.0L6r
            @Override // X.InterfaceC1416890myV
            public final void LIZIZ(Exception exc) {
                if (exc == null) {
                    C201955140j.LJII(C1429810nJL.LIZIZ, "download music failed");
                } else {
                    C201955140j.LJIIJ(C1429810nJL.LIZIZ, "download music failed", exc);
                }
                InterfaceC1364105Vn<Boolean> interfaceC1364105Vn2 = c23260099m;
                Boolean bool = Boolean.FALSE;
                C189200o6.m2constructorimpl(bool);
                interfaceC1364105Vn2.resumeWith(bool);
            }

            @Override // X.InterfaceC1416890myV
            public final void LIZLLL(final AVMusic aVMusic) {
                if (aVMusic == null) {
                    C201955140j.LJIILJJIL(C1429810nJL.LIZIZ, "down load music success but avmusic is null");
                    InterfaceC1364105Vn<Boolean> interfaceC1364105Vn2 = c23260099m;
                    Boolean bool = Boolean.FALSE;
                    C189200o6.m2constructorimpl(bool);
                    interfaceC1364105Vn2.resumeWith(bool);
                    return;
                }
                IAnotherMusicService musicService = C1403010mc7.LIZ.getMusicService();
                Context context2 = context;
                final VideoPublishEditModel videoPublishEditModel2 = videoPublishEditModel;
                final InterfaceC1364105Vn<Boolean> interfaceC1364105Vn3 = c23260099m;
                musicService.LJ("on_this_day", context2, aVMusic, 0, false, new InterfaceC1416880myU() { // from class: X.0L6s
                    @Override // X.InterfaceC1416880myU
                    public final void LIZJ(boolean z) {
                    }

                    @Override // X.InterfaceC1416880myU
                    public final void onProgress(int i) {
                    }

                    @Override // X.InterfaceC1416880myU
                    public final void onStart() {
                    }

                    @Override // X.InterfaceC1416880myU
                    public final void LIZ(Integer num, String str2) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("download music file failed, errCode: ");
                        sbLIZ.append(num);
                        sbLIZ.append(", errMsg: ");
                        sbLIZ.append(str2);
                        C201955140j.LJII(C1429810nJL.LIZIZ, C2188811AlT.LIZIZ(sbLIZ));
                        InterfaceC1364105Vn<Boolean> interfaceC1364105Vn4 = interfaceC1364105Vn3;
                        Boolean bool2 = Boolean.FALSE;
                        C189200o6.m2constructorimpl(bool2);
                        interfaceC1364105Vn4.resumeWith(bool2);
                    }

                    @Override // X.InterfaceC1416880myU
                    public final void LIZIZ(String str2, MusicWaveBean musicWaveBean) {
                        C201955140j.LJIILJJIL(C1429810nJL.LIZIZ, "download music file success");
                        AVMusic aVMusic2 = aVMusic;
                        aVMusic2.path = str2;
                        MusicBeanUtilKt.updateAVMusic(videoPublishEditModel2.creativeModel.musicBuzModel, aVMusic2);
                        InterfaceC1364105Vn<Boolean> interfaceC1364105Vn4 = interfaceC1364105Vn3;
                        Boolean bool2 = Boolean.TRUE;
                        C189200o6.m2constructorimpl(bool2);
                        interfaceC1364105Vn4.resumeWith(bool2);
                    }
                }, false);
            }
        });
        Object objLIZ = c23260099m.LIZ();
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLIZ;
    }
}

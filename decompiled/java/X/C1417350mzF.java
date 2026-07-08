package X;

import com.ss.android.ugc.aweme.creative.model.AutoCutMediaModel;
import com.ss.android.ugc.aweme.creative.model.AutoCutThemeData;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.port.in.IAnotherMusicService;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.AwS171S1100000_22;
import kotlin.jvm.internal.AwS388S0200000_22;
import kotlin.jvm.internal.AwS423S0200000_22;
import kotlin.jvm.internal.AwS566S0100000_22;

/* JADX INFO: renamed from: X.0mzF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1417350mzF {
    public final C1417500mzU LIZ;
    public final Function0<Unit> LIZIZ;
    public final Function1<C1417310mzB, Unit> LIZJ;
    public final VideoPublishEditModel LIZLLL;
    public String LJ;
    public AnonymousClass0956 LJFF;
    public InterfaceC1429290nIV LJI;
    public final C1417310mzB LJII;
    public EnumC1417510mzV LJIIIIZZ = EnumC1417510mzV.NONE;
    public long LJIIIZ = -1;
    public final C01GW LJIIJ = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(22));

    public final void LJ() {
        EnumC1417510mzV enumC1417510mzV = this.LJIIIIZZ;
        EnumC1417510mzV enumC1417510mzV2 = EnumC1417510mzV.SUCCESS;
        if (enumC1417510mzV == enumC1417510mzV2 || enumC1417510mzV == EnumC1417510mzV.CANCEL) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("handleSuccess: already result. status=");
            sbLIZ.append(this.LJIIIIZZ);
            C2188811AlT.LIZIZ(sbLIZ);
            return;
        }
        if (this.LJII.LIZIZ()) {
            long jLIZLLL = C1417710mzp.LIZLLL(this.LJIIIZ);
            C1417500mzU c1417500mzU = this.LIZ;
            List<AutoCutMediaModel> list = c1417500mzU.LJ;
            String str = c1417500mzU.LJIIIIZZ;
            String str2 = c1417500mzU.LJII;
            AutoCutThemeData autoCutThemeData = c1417500mzU.LIZIZ;
            int i = autoCutThemeData.templateType;
            String str3 = autoCutThemeData.templateId;
            String str4 = autoCutThemeData.templateGroupId;
            String str5 = autoCutThemeData.musicId;
            String str6 = autoCutThemeData.templateData;
            boolean z = false;
            if (str6 != null && str6.length() > 0) {
                z = true;
            }
            C1417710mzp.LJJIJIL(0, i, jLIZLLL, Integer.MIN_VALUE, null, str, str2, str3, str4, str5, list, true, z);
            this.LJIIIIZZ = enumC1417510mzV2;
            this.LIZJ.invoke(this.LJII);
        }
    }

    public final void LIZ(AVMusic aVMusic) {
        IAnotherMusicService musicService = C1403010mc7.LIZ.getMusicService();
        C1403010mc7.LIZ.getApplicationService().getClass();
        musicService.LJ("preload_auto_cut", C1BWL.LIZ(), aVMusic, 0, false, new InterfaceC1416880myU() { // from class: X.0mzX
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
            public final void LIZ(Integer num, String str) {
                C1417350mzF c1417350mzF = this.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("fetchAndDownloadMusic onFailed: downloadMusic code=");
                sbLIZ.append(num);
                sbLIZ.append(", msg=");
                sbLIZ.append(str);
                C2188811AlT.LIZIZ(sbLIZ);
                c1417350mzF.getClass();
                this.LIZ.LIZJ(1007, num, str);
            }

            @Override // X.InterfaceC1416880myU
            public final void LIZIZ(String str, MusicWaveBean musicWaveBean) {
                this.LIZ.getClass();
                C371410EhH.LIZJ(new AwS171S1100000_22(this.LIZ, str, 3));
            }
        }, false);
    }

    public final void LIZIZ(AutoCutThemeData autoCutThemeData) {
        AVMusic aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(autoCutThemeData.musicBuzModel);
        if (aVMusicExtractAVMusic != null) {
            this.LJII.LJ = aVMusicExtractAVMusic;
            LIZ(aVMusicExtractAVMusic);
        } else {
            String str = autoCutThemeData.musicId;
            if (str != null) {
                C1403010mc7.LIZ.getMusicService().requestMusic(str, new InterfaceC1416890myV() { // from class: X.0myg
                    @Override // X.InterfaceC1416890myV
                    public final void LIZIZ(Exception exc) {
                        String message;
                        C1417350mzF c1417350mzF = this.LIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("fetchAndDownloadMusic onFailed: onLoadMusicFail error msg=");
                        String strLIZIZ = null;
                        if (exc != null) {
                            message = exc.getMessage();
                        } else {
                            message = null;
                        }
                        sbLIZ.append(message);
                        C2188811AlT.LIZIZ(sbLIZ);
                        c1417350mzF.getClass();
                        C1417350mzF c1417350mzF2 = this.LIZ;
                        if (exc != null) {
                            strLIZIZ = C13SZ.LIZIZ(exc);
                        }
                        c1417350mzF2.LIZJ(1002, Integer.MIN_VALUE, strLIZIZ);
                    }

                    @Override // X.InterfaceC1416890myV
                    public final void LIZLLL(AVMusic aVMusic) {
                        if (aVMusic == null) {
                            return;
                        }
                        C1417350mzF c1417350mzF = this.LIZ;
                        c1417350mzF.LJII.LJ = aVMusic;
                        c1417350mzF.LIZ(aVMusic);
                    }
                });
            }
        }
    }

    public final void LIZJ(Integer num, Integer num2, String str) {
        int iIntValue;
        boolean z = false;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        long jLIZLLL = C1417710mzp.LIZLLL(this.LJIIIZ);
        C1417500mzU c1417500mzU = this.LIZ;
        List<AutoCutMediaModel> list = c1417500mzU.LJ;
        String str2 = c1417500mzU.LJIIIIZZ;
        String str3 = c1417500mzU.LJII;
        AutoCutThemeData autoCutThemeData = c1417500mzU.LIZIZ;
        int i = autoCutThemeData.templateType;
        String str4 = autoCutThemeData.templateId;
        String str5 = autoCutThemeData.templateGroupId;
        String str6 = autoCutThemeData.musicId;
        String str7 = autoCutThemeData.templateData;
        if (str7 != null && str7.length() > 0) {
            z = true;
        }
        C1417710mzp.LJJIJIL(iIntValue, i, jLIZLLL, num2, str, str2, str3, str4, str5, str6, list, false, z);
        C371410EhH.LIZJ(new AwS566S0100000_22(this, 2));
    }

    public C1417350mzF(C1417500mzU c1417500mzU, AwS423S0200000_22 awS423S0200000_22, AwS388S0200000_22 awS388S0200000_22, VideoPublishEditModel videoPublishEditModel) {
        this.LIZ = c1417500mzU;
        this.LIZIZ = awS423S0200000_22;
        this.LIZJ = awS388S0200000_22;
        this.LIZLLL = videoPublishEditModel;
        this.LJII = new C1417310mzB(c1417500mzU.LIZ.getSecond(), c1417500mzU.LIZ.getFirst().intValue(), 0, null, null, null, null, null, null, null, null, null, null, null, null, false, 16777212);
    }
}

package X;

import com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.ss.android.ugc.aweme.ftc.components.sticker.core.FTCEditStickerViewModel;
import com.ss.android.ugc.aweme.ftc.components.sticker.text.FTCEditTextStickerViewModel;
import com.ss.android.ugc.aweme.ftc.components.toolbar.FTCEditToolbarViewModel;
import com.ss.android.ugc.aweme.internal.AVCommerceServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS566S0100000_22;

/* JADX INFO: renamed from: X.0o8C, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1461340o8C implements InterfaceC572170McJ {
    public final AbstractC214814194y LL;
    public final Function0<C1DRG> LLILLJJLI;
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 885));
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS566S0100000_22(this, 886));
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 887));
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 889));
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS566S0100000_22(this, 890));

    @Override // X.InterfaceC572170McJ
    public final void refresh() {
    }

    public final FTCEditToolbarViewModel LIZIZ() {
        return (FTCEditToolbarViewModel) this.LLILZIL.getValue();
    }

    @Override // X.InterfaceC572170McJ
    public final void LIZ(C1456890o11 c1456890o11) {
        boolean z;
        boolean z2 = c1456890o11.LIZ;
        boolean z3 = c1456890o11.LIZIZ;
        boolean z4 = c1456890o11.LIZJ;
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) this.LLIZ.getValue();
        if (!z3) {
            Boolean value = ((FTCEditStickerViewModel) this.LLILZLL.getValue()).rb().getValue();
            if (value != null && value.booleanValue()) {
                ((FTCEditStickerViewModel) this.LLILLL.getValue()).zP1().setValue(Boolean.valueOf(z4));
            } else {
                Boolean value2 = ((FTCEditStickerViewModel) this.LLILZLL.getValue()).Mk0().getValue();
                if (value2 != null && value2.booleanValue()) {
                    ((FTCEditStickerViewModel) this.LLILLL.getValue()).CQ0().setValue(Boolean.valueOf(z4));
                } else {
                    ((FTCEditStickerViewModel) this.LLILLL.getValue()).fz0().setValue(Boolean.valueOf(z4));
                }
            }
        }
        if (!z2) {
            ((FTCEditTextStickerViewModel) this.LLILZ.getValue()).LJJJLZIJ();
        }
        LIZIZ().lR2().setValue(Boolean.valueOf(z2));
        LIZIZ().bo();
        LIZIZ().nf1(z2);
        if (videoPublishEditModel.mIsFromDraft) {
            FTCEditToolbarViewModel fTCEditToolbarViewModelLIZIZ = LIZIZ();
            if (z2 && !videoPublishEditModel.isUploadVideo()) {
                z = true;
            } else {
                z = false;
            }
            fTCEditToolbarViewModelLIZIZ.zz0(z);
        }
        if (C0CHQ.LIZ().getAccountService().LIZ() || AVCommerceServiceImpl.LJIIJ().LJ()) {
            if (!C1430550nKX.LIZIZ(videoPublishEditModel)) {
                LIZIZ().Uh1(8, C570830Ma9.LIZ(videoPublishEditModel.getCurMusicServerLength(), videoPublishEditModel, videoPublishEditModel.getMMusicPath()));
                if (((BaseShortVideoContext) this.LLIZ.getValue()).getVideoLength() > videoPublishEditModel.getMCurMusicLength()) {
                    LIZIZ().tR2(8, false);
                }
            }
            LIZIZ().rm(8, z2);
        }
        if (C1428520nHG.LJIIJJI(videoPublishEditModel)) {
            LIZIZ().rm(6, z2);
        }
        if (C1428520nHG.LJIIIIZZ(videoPublishEditModel)) {
            AudioRecorderParam veAudioRecorderParam = videoPublishEditModel.getVeAudioRecorderParam();
            if (veAudioRecorderParam != null && veAudioRecorderParam.hasRecord()) {
                LIZIZ().tR2(6, true);
            } else {
                LIZIZ().tR2(6, false);
            }
        }
        LIZIZ().Uh1(7, true);
        LIZIZ().rm(7, z2);
        LIZIZ().rm(5, z2);
        LIZIZ().rT(z2);
        LIZIZ().rm(1, z2);
        LIZIZ().rm(2, z2);
        if (!z2) {
            LIZIZ().Jj0(2, false);
        }
        LIZIZ().rm(3, z2);
    }

    public C1461340o8C(AbstractC214814194y abstractC214814194y, AwS566S0100000_22 awS566S0100000_22) {
        this.LL = abstractC214814194y;
        this.LLILLJJLI = awS566S0100000_22;
    }
}

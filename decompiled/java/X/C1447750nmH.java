package X;

import Y.ARunnableS113S0100000_13;
import android.content.Context;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.services.video.IAVPublishService;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.ui.publishprogress.PublishProgressDialogAddHelper;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS388S0200000_22;

/* JADX INFO: renamed from: X.0nmH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1447750nmH extends C09AY implements Function0<Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ C19EG LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ boolean LLILZLL;
    public final /* synthetic */ Function0<Boolean> LLIZ;
    public final /* synthetic */ boolean LLIZLLLIL;
    public final /* synthetic */ boolean LLJ;
    public final /* synthetic */ boolean LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1447750nmH(int i, int i2, C19EG c19eg, Function0 function0, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        super(0);
        this.LL = z;
        this.LLILLJJLI = c19eg;
        this.LLILLL = z2;
        this.LLILZ = i;
        this.LLILZIL = i2;
        this.LLILZLL = z3;
        this.LLIZ = function0;
        this.LLIZLLLIL = z4;
        this.LLJ = z5;
        this.LLJI = z6;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        PublishProgressDialogAddHelper.LIZ.getClass();
        PublishProgressDialogAddHelper.LJFF();
        if (PublishProgressDialogAddHelper.LIZIZ == null) {
            C844470XAv.LIZ.getClass();
            Context contextLIZ = C844470XAv.LIZ();
            C1447790nmL c1447790nmL = PublishProgressDialogAddHelper.LJ;
            if (c1447790nmL == null) {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
            PublishProgressDialogAddHelper.LIZIZ = new C1447770nmJ(contextLIZ, c1447790nmL);
        }
        if (this.LL) {
            PublishProgressDialogAddHelper.LJ();
        }
        final WeakReference weakReference = new WeakReference(this.LLILLJJLI);
        C1447770nmJ c1447770nmJ = PublishProgressDialogAddHelper.LIZIZ;
        if (c1447770nmJ != null) {
            c1447770nmJ.LJIJI = this.LL;
            c1447770nmJ.LJIILJJIL = this.LLILLL;
            c1447770nmJ.LJJIJL = new InterfaceC1447780nmK() { // from class: X.0nbD
                @Override // X.InterfaceC1447780nmK
                public final void LIZ() {
                }

                @Override // X.InterfaceC1447780nmK
                public final void LIZIZ() {
                    VideoPublishEditModel videoPublishEditModel;
                    C19EG c19eg = weakReference.get();
                    if (c19eg != null) {
                        PublishProgressDialogAddHelper.LIZ.getClass();
                        C1447790nmL c1447790nmL2 = PublishProgressDialogAddHelper.LJ;
                        if (c1447790nmL2 != null && c1447790nmL2.LLJILJIL && c1447790nmL2.LLJJIJI) {
                            c1447790nmL2.LLJJIJI = false;
                            HandlerHook.viewPostDelay(c1447790nmL2, new ARunnableS113S0100000_13(c1447790nmL2, 120), 500L);
                            BaseShortVideoContext baseShortVideoContext = c1447790nmL2.LLJIJIL;
                            if (baseShortVideoContext != null && (baseShortVideoContext instanceof VideoPublishEditModel) && (videoPublishEditModel = (VideoPublishEditModel) baseShortVideoContext) != null) {
                                C2344009Gk c2344009Gk = new C2344009Gk();
                                c2344009Gk.LJIIIIZZ("creation_id", videoPublishEditModel.getCreationId());
                                c2344009Gk.LJIIIIZZ("enter_from", videoPublishEditModel.getEnterFrom());
                                c2344009Gk.LJIIIIZZ("content_source", C1428470nHB.LJIILIIL(videoPublishEditModel));
                                c2344009Gk.LJ(c1447790nmL2.getState().LIZIZ.getValue(), "publishing_percentage");
                                c2344009Gk.LIZJ(C1433730nPf.LJIIL(), "publish_cnt");
                                C1609930rzr.LIZLLL(c2344009Gk, videoPublishEditModel);
                                C20684815ws.LJIILLIIL("click_publishing_toast", c2344009Gk.LIZ);
                            }
                            if ((!c1447790nmL2.LLJJI.isImageMode(c1447790nmL2.LLJ) || C0C64.LJIILLIIL().LJIIIZ(31744, "studio_image_album_publish_auto_retry", true, false)) && C1439650nZD.LIZIZ()) {
                                IAVPublishService iAVPublishService = c1447790nmL2.LLJJI;
                                BaseShortVideoContext baseShortVideoContext2 = c1447790nmL2.LLJIJIL;
                                iAVPublishService.reportQuitAutoUploadingShowEvent(baseShortVideoContext2 != null ? baseShortVideoContext2 : null);
                                C1397580mTM c1397580mTM = new C1397580mTM(c19eg);
                                c1397580mTM.LJFF(2131846539);
                                c1397580mTM.LIZ(2131846538);
                                C985403tE.LIZ(c1397580mTM, new AwS388S0200000_22(c1447790nmL2, c19eg, 43));
                                c1397580mTM.LJII = false;
                                C1397510mTF c1397510mTF = new C1397510mTF(c1397580mTM);
                                C1391850mK7.LIZIZ(c1397510mTF, "337");
                                c1397510mTF.LIZLLL();
                            }
                        }
                    }
                }

                @Override // X.InterfaceC1447780nmK
                public final void LIZJ() {
                    C201955140j.LIZ("PublishProgressDialogAddHelper -> publishProgressFloatingWindow -> onDoubleClick");
                }
            };
            C19EG c19eg = this.LLILLJJLI;
            C1447770nmJ.LIZ(c1447770nmJ, c19eg, this.LLILZ, this.LLILZIL, new C1447880nmU(c19eg, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI), false, PublishProgressDialogAddHelper.LJIIIIZZ, this.LLILZLL, 16);
        }
        return Unit.LIZ;
    }
}

package X;

import Y.ARunnableS1S3300000_8;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialogBuilder;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.tools.view.uikit.factory.CreativeDialogWrapper;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS239S0000000_8;
import kotlin.jvm.internal.AwS157S1100000_8;
import kotlin.jvm.internal.AwS30S0310000_8;
import kotlin.jvm.internal.AwS409S0200000_8;

/* JADX INFO: renamed from: X.0LHr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C540490LHr extends C09AY implements Function0<Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ C0M81 LLILLJJLI;
    public final /* synthetic */ Function0<Unit> LLILLL;
    public final /* synthetic */ Function0<Unit> LLILZ;
    public final /* synthetic */ boolean LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C540490LHr(C0M81 c0m81, Function0 function0, Function0 function02, boolean z, boolean z2) {
        super(0);
        this.LL = z;
        this.LLILLJJLI = c0m81;
        this.LLILLL = function0;
        this.LLILZ = function02;
        this.LLILZIL = z2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        if (this.LL) {
            C19576911iZ c19576911iZ = C19576911iZ.LIZ;
            C19GS c19gs = this.LLILLJJLI.LJIIIIZZ;
            CreativeLoadingDialogBuilder creativeLoadingDialogBuilder = new CreativeLoadingDialogBuilder();
            creativeLoadingDialogBuilder.showProgress(false);
            creativeLoadingDialogBuilder.backCanCancel(false);
            creativeLoadingDialogBuilder.loadingMessage(this.LLILLJJLI.LJIIIIZZ.getString(2131846827));
            CreativeDialogWrapper creativeDialogWrapper = (CreativeDialogWrapper) c19576911iZ.createLoadingDialog(c19gs, 1601, creativeLoadingDialogBuilder);
            creativeDialogWrapper.show();
            C0M81 c0m81 = this.LLILLJJLI;
            AFwS239S0000000_8 aFwS239S0000000_8 = AFwS239S0000000_8.get$arr$(200);
            AwS30S0310000_8 awS30S0310000_8 = new AwS30S0310000_8(creativeDialogWrapper, c0m81, this.LLILZIL, this.LLILLL, 0);
            AwS409S0200000_8 awS409S0200000_8 = new AwS409S0200000_8(creativeDialogWrapper, this.LLILLJJLI, 85);
            String creationId = c0m81.LIZJ.getCreationId();
            String strLIZ = C0DMI.LIZ();
            C0CNO.LIZLLL(0L, new AwS157S1100000_8(strLIZ, aFwS239S0000000_8, 5));
            c0m81.LIZJ.creativeModel.draftInfoModel.saveDraftScene = "clickPopupFromEdit";
            InterfaceC578380MmK interfaceC578380MmK = c0m81.LIZLLL;
            if (interfaceC578380MmK != null) {
                interfaceC578380MmK.ou(new ARunnableS1S3300000_8(c0m81, strLIZ, creationId, awS409S0200000_8, awS30S0310000_8, 1));
            }
        } else {
            final C0M81 c0m812 = this.LLILLJJLI;
            final Function0<Unit> function0 = this.LLILLL;
            final Function0<Unit> function02 = this.LLILZ;
            c0m812.getClass();
            C356610DyV c356610DyV = C1455260nyO.A;
            InterfaceC1446740nke interfaceC1446740nke = c0m812.LJ;
            VideoPublishEditModel videoPublishEditModel = c0m812.LIZJ;
            c356610DyV.getClass();
            C356610DyV.LIZIZ(videoPublishEditModel, interfaceC1446740nke);
            C1402520mbK.LIZLLL(c0m812.LIZJ, "video_edit_page", null, false, Boolean.FALSE, "", null, null, null);
            VideoPublishEditModel videoPublishEditModel2 = c0m812.LIZJ;
            videoPublishEditModel2.creativeModel.draftInfoModel.fromDraftPopup = true;
            C1428520nHG.LJLI(videoPublishEditModel2);
            C1428470nHB.LIZJ(c0m812.LIZJ.creativeModel.draftInfoModel);
            C19576911iZ c19576911iZ2 = C19576911iZ.LIZ;
            C19GS c19gs2 = c0m812.LJIIIIZZ;
            CreativeLoadingDialogBuilder creativeLoadingDialogBuilder2 = new CreativeLoadingDialogBuilder();
            creativeLoadingDialogBuilder2.showProgress(false);
            creativeLoadingDialogBuilder2.backCanCancel(false);
            creativeLoadingDialogBuilder2.loadingMessage(c0m812.LJIIIIZZ.getString(2131846827));
            final CreativeDialogWrapper creativeDialogWrapper2 = (CreativeDialogWrapper) c19576911iZ2.createLoadingDialog(c19gs2, 1601, creativeLoadingDialogBuilder2);
            creativeDialogWrapper2.show();
            C0CHQ.LIZ().getPublishService().LJJJLL();
            C1431870nMf.LJIIL(new C538590LAj(c0m812.LIZJ, new C0M2T(false, "VEVideoPublishEditActivity", null, 5, false, 28), false), new InterfaceC540360LHe() { // from class: X.0LHs
                @Override // X.InterfaceC540360LHe
                public final Function1<AwemeDraft, Unit> LIZ() {
                    return null;
                }

                @Override // X.InterfaceC540360LHe
                public final void LIZIZ(C540340LHc c540340LHc) {
                    creativeDialogWrapper2.dismiss();
                    C19GS c19gs3 = c0m812.LJIIIIZZ;
                    if (c19gs3 != null) {
                        CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                        creativeToastBuilder.messageRes(2131829844);
                        creativeToastBuilder.acrossActivities(true);
                        C1390380mHk.LIZ(c19gs3, 1008, creativeToastBuilder);
                    }
                    C1402520mbK.LJI(C1402520mbK.LIZ, c0m812.LIZJ, "video_edit_page", 0, true, 16);
                    function02.invoke();
                }

                @Override // X.InterfaceC540360LHe
                public final void LIZJ(C540340LHc c540340LHc) {
                    creativeDialogWrapper2.dismiss();
                    C1402520mbK.LJI(C1402520mbK.LIZ, c0m812.LIZJ, "video_edit_page", 1, true, 16);
                    function0.invoke();
                }
            });
        }
        return Unit.LIZ;
    }
}

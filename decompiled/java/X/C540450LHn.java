package X;

import com.ss.android.ugc.aweme.creative.model.draft.DraftInfoModel;
import com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialog;
import com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialogBuilder;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.tools.view.uikit.factory.CreativeDialogWrapper;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0LHn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C540450LHn extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C0M7N LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ Function0<Unit> LLILZLL;
    public final /* synthetic */ Function0<Unit> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C540450LHn(C0M7N c0m7n, boolean z, String str, String str2, String str3, Function0<Unit> function0, Function0<Unit> function02) {
        super(0);
        this.LL = c0m7n;
        this.LLILLJJLI = z;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = str3;
        this.LLILZLL = function0;
        this.LLIZ = function02;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C19576911iZ c19576911iZ = C19576911iZ.LIZ;
        C19GS c19gs = this.LL.LJIIL;
        CreativeLoadingDialogBuilder creativeLoadingDialogBuilder = new CreativeLoadingDialogBuilder();
        creativeLoadingDialogBuilder.showProgress(false);
        creativeLoadingDialogBuilder.backCanCancel(false);
        creativeLoadingDialogBuilder.loadingMessage(this.LL.LJIIL.getString(2131846827));
        CreativeLoadingDialog creativeLoadingDialogCreateLoadingDialog = c19576911iZ.createLoadingDialog(c19gs, 1601, creativeLoadingDialogBuilder);
        ((CreativeDialogWrapper) creativeLoadingDialogCreateLoadingDialog).show();
        C356610DyV c356610DyV = C1455260nyO.A;
        C0M7N c0m7n = this.LL;
        InterfaceC1446740nke interfaceC1446740nke = c0m7n.LJ;
        VideoPublishEditModel videoPublishEditModel = c0m7n.LIZJ;
        c356610DyV.getClass();
        C356610DyV.LIZIZ(videoPublishEditModel, interfaceC1446740nke);
        C1428520nHG.LJLI(this.LL.LIZJ);
        C1428470nHB.LIZJ(this.LL.LIZJ.creativeModel.draftInfoModel);
        VideoPublishEditModel videoPublishEditModelClone = this.LL.LIZJ.clone();
        DraftInfoModel draftInfoModel = videoPublishEditModelClone.creativeModel.draftInfoModel;
        draftInfoModel.fromDraftPopup = this.LLILLJJLI;
        draftInfoModel.saveDraftScene = this.LLILLL;
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C0LDA(this.LLILLL, videoPublishEditModelClone, this.LLILZ, this.LLILZIL, this.LLILLJJLI, this.LL, this.LLILZLL, creativeLoadingDialogCreateLoadingDialog, this.LLIZ, null), 3);
        return Unit.LIZ;
    }
}

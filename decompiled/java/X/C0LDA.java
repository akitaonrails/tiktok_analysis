package X;

import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialog;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS252S0300000_8;
import kotlin.jvm.internal.AwS409S0200000_8;
import njp.a;

/* JADX INFO: renamed from: X.0LDA, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.exit.EditExitController$checkLoginStateBeforeSaveDraftWithNewId$1$1$1$1", f = "EditExitController.kt", l = {746, 764}, m = "invokeSuspend")
public final class C0LDA extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ VideoPublishEditModel LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ boolean LLILZLL;
    public final /* synthetic */ C0M7N LLIZ;
    public final /* synthetic */ Function0<Unit> LLIZLLLIL;
    public final /* synthetic */ CreativeLoadingDialog LLJ;
    public final /* synthetic */ Function0<Unit> LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LDA(String str, VideoPublishEditModel videoPublishEditModel, String str2, String str3, boolean z, C0M7N c0m7n, Function0<Unit> function0, CreativeLoadingDialog creativeLoadingDialog, Function0<Unit> function02, InterfaceC1364105Vn<? super C0LDA> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = videoPublishEditModel;
        this.LLILZ = str2;
        this.LLILZIL = str3;
        this.LLILZLL = z;
        this.LLIZ = c0m7n;
        this.LLIZLLLIL = function0;
        this.LLJ = creativeLoadingDialog;
        this.LLJI = function02;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0LDA(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLJII = obj;
        C1C7U.LIZ("EditExitController@7e76.checkLoginStateBeforeSaveDraftWithNewId$1$1$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(objLJII);
                    C0CNO.LIZLLL(0L, new AwS252S0300000_8(this.LLJ, (CreativeLoadingDialog) this.LLIZ, (C0M7N) this.LLJI, (Function0<Unit>) 23));
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("EditExitController@7e76.checkLoginStateBeforeSaveDraftWithNewId$1$1$1$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(objLJII);
        } else {
            C155000ia.LIZIZ(objLJII);
            new C1438570nXT(this.LLILLJJLI);
            AwemeDraft awemeDraftLIZLLL = C1438570nXT.LIZLLL(this.LLILLL);
            String str = this.LLILLL.creativeModel.nleInfoModel.nleDataPath;
            if (C123100dR.LIZ(str) && C123100dR.LIZ(this.LLILLL.getNleData())) {
                String nleData = this.LLILLL.getNleData();
                if (nleData == null) {
                    nleData = "";
                }
                C2350209Iu.LIZ(str, nleData);
            }
            C0M6F c0m6fLJI = C0CHQ.LIZ().LJI();
            VideoPublishEditModel videoPublishEditModel = this.LLILLL;
            String str2 = this.LLILZ;
            String str3 = this.LLILLJJLI;
            this.LL = 1;
            objLJII = c0m6fLJI.LJII(videoPublishEditModel, awemeDraftLIZLLL, str2, str3, this);
            if (objLJII == objLJFF) {
                C1C7U.LIZIZ("EditExitController@7e76.checkLoginStateBeforeSaveDraftWithNewId$1$1$1$1");
                return objLJFF;
            }
        }
        AwemeDraft awemeDraft = (AwemeDraft) objLJII;
        if (awemeDraft == null) {
            C0CNO.LIZLLL(0L, new AwS409S0200000_8(this.LLJ, (CreativeLoadingDialog) this.LLIZLLLIL, (Function0<Unit>) 86));
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("EditExitController@7e76.checkLoginStateBeforeSaveDraftWithNewId$1$1$1$1");
            return unit2;
        }
        new C1438570nXT(this.LLILLJJLI);
        VideoPublishEditModel videoPublishEditModelLIZJ = C1438570nXT.LIZJ(awemeDraft, false);
        C1402520mbK.LIZLLL(videoPublishEditModelLIZJ, this.LLILZIL, null, false, Boolean.FALSE, "", null, null, null);
        C1402520mbK.LJI(C1402520mbK.LIZ, videoPublishEditModelLIZJ, this.LLILZIL, 1, this.LLILZLL, 16);
        if (C379370Eu7.LIZIZ(videoPublishEditModelLIZJ) || C357620E0i.LIZ()) {
            C0M7N c0m7n = this.LLIZ;
            String creationId = c0m7n.LIZJ.getCreationId();
            String str4 = this.LLILZ;
            this.LL = 2;
            if (c0m7n.LJIILL(creationId, str4, this) == objLJFF) {
                C1C7U.LIZIZ("EditExitController@7e76.checkLoginStateBeforeSaveDraftWithNewId$1$1$1$1");
                return objLJFF;
            }
        }
        C0CNO.LIZLLL(0L, new AwS252S0300000_8(this.LLJ, (CreativeLoadingDialog) this.LLIZ, (C0M7N) this.LLJI, (Function0<Unit>) 23));
        Unit unit22 = Unit.LIZ;
        C1C7U.LIZIZ("EditExitController@7e76.checkLoginStateBeforeSaveDraftWithNewId$1$1$1$1");
        return unit22;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

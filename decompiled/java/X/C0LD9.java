package X;

import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS409S0200000_8;
import kotlin.jvm.internal.AwS552S0100000_8;
import njp.a;

/* JADX INFO: renamed from: X.0LD9, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.exit.EditExitController$saveDraftWithNewCreationId$2$1$1", f = "EditExitController.kt", l = {370, 386}, m = "invokeSuspend")
public final class C0LD9 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public VideoPublishEditModel LL;
    public int LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ VideoPublishEditModel LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ Function0<Unit> LLIZ;
    public final /* synthetic */ Function1<VideoPublishEditModel, Unit> LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0LD9(String str, VideoPublishEditModel videoPublishEditModel, String str2, String str3, Function0<Unit> function0, Function1<? super VideoPublishEditModel, Unit> function1, InterfaceC1364105Vn<? super C0LD9> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = str;
        this.LLILZ = videoPublishEditModel;
        this.LLILZIL = str2;
        this.LLILZLL = str3;
        this.LLIZ = function0;
        this.LLIZLLLIL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0LD9(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        VideoPublishEditModel videoPublishEditModelLIZJ;
        Object objLJII = obj;
        C1C7U.LIZ("EditExitController@7e76.saveDraftWithNewCreationId$2$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    videoPublishEditModelLIZJ = this.LL;
                    C155000ia.LIZIZ(objLJII);
                    C1402520mbK.LIZLLL(videoPublishEditModelLIZJ, "video_edit_page", null, false, Boolean.FALSE, "", null, null, null);
                    C1402520mbK.LJI(C1402520mbK.LIZ, videoPublishEditModelLIZJ, "video_edit_page", 1, false, 16);
                    C0CNO.LIZLLL(0L, new AwS409S0200000_8(videoPublishEditModelLIZJ, this.LLIZLLLIL, 84));
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("EditExitController@7e76.saveDraftWithNewCreationId$2$1$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(objLJII);
        } else {
            C155000ia.LIZIZ(objLJII);
            new C1438570nXT(this.LLILLL);
            AwemeDraft awemeDraftLIZLLL = C1438570nXT.LIZLLL(this.LLILZ);
            String str = this.LLILZ.creativeModel.nleInfoModel.nleDataPath;
            if (C123100dR.LIZ(str) && C123100dR.LIZ(this.LLILZ.getNleData())) {
                String nleData = this.LLILZ.getNleData();
                if (nleData == null) {
                    nleData = "";
                }
                C2350209Iu.LIZ(str, nleData);
            }
            C0M6F c0m6fLJI = C0CHQ.LIZ().LJI();
            VideoPublishEditModel videoPublishEditModel = this.LLILZ;
            String str2 = this.LLILZIL;
            String str3 = this.LLILLL;
            this.LLILLJJLI = 1;
            objLJII = c0m6fLJI.LJII(videoPublishEditModel, awemeDraftLIZLLL, str2, str3, this);
            if (objLJII == objLJFF) {
                C1C7U.LIZIZ("EditExitController@7e76.saveDraftWithNewCreationId$2$1$1");
                return objLJFF;
            }
        }
        AwemeDraft awemeDraft = (AwemeDraft) objLJII;
        if (awemeDraft == null) {
            C1402520mbK.LIZLLL(this.LLILZ, "video_edit_page", null, false, Boolean.FALSE, "", null, null, null);
            C1402520mbK.LJI(C1402520mbK.LIZ, this.LLILZ, "video_edit_page", 0, false, 16);
            C0CNO.LIZLLL(0L, new AwS552S0100000_8(this.LLIZ, (Function0<Unit>) 623));
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("EditExitController@7e76.saveDraftWithNewCreationId$2$1$1");
            return unit2;
        }
        new C1438570nXT(this.LLILLL);
        videoPublishEditModelLIZJ = C1438570nXT.LIZJ(awemeDraft, false);
        C0LZZ c0lzz = C0LZZ.LIZ;
        String str4 = this.LLILZLL;
        String str5 = this.LLILZIL;
        this.LL = videoPublishEditModelLIZJ;
        this.LLILLJJLI = 2;
        if (c0lzz.LIZ(str4, str5, this) == objLJFF) {
            C1C7U.LIZIZ("EditExitController@7e76.saveDraftWithNewCreationId$2$1$1");
            return objLJFF;
        }
        C1402520mbK.LIZLLL(videoPublishEditModelLIZJ, "video_edit_page", null, false, Boolean.FALSE, "", null, null, null);
        C1402520mbK.LJI(C1402520mbK.LIZ, videoPublishEditModelLIZJ, "video_edit_page", 1, false, 16);
        C0CNO.LIZLLL(0L, new AwS409S0200000_8(videoPublishEditModelLIZJ, this.LLIZLLLIL, 84));
        Unit unit22 = Unit.LIZ;
        C1C7U.LIZIZ("EditExitController@7e76.saveDraftWithNewCreationId$2$1$1");
        return unit22;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

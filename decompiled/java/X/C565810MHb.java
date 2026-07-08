package X;

import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.shortvideo.CreateBaseAwemeResponse;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0MHb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.ShortVideoPublishCallback$handleTnsWhenPublishSuccess$2", f = "ShortVideoPublishCallback.kt", l = {}, m = "invokeSuspend")
public final class C565810MHb extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ CreateBaseAwemeResponse LL;
    public final /* synthetic */ VideoPublishEditModel LLILLJJLI;
    public final /* synthetic */ C1439630nZB LLILLL;
    public final /* synthetic */ AwemeDraft LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C565810MHb(AwemeDraft awemeDraft, CreateBaseAwemeResponse createBaseAwemeResponse, C1439630nZB c1439630nZB, VideoPublishEditModel videoPublishEditModel, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = createBaseAwemeResponse;
        this.LLILLJJLI = videoPublishEditModel;
        this.LLILLL = c1439630nZB;
        this.LLILZ = awemeDraft;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        CreateBaseAwemeResponse createBaseAwemeResponse = this.LL;
        VideoPublishEditModel videoPublishEditModel = this.LLILLJJLI;
        return new C565810MHb(this.LLILZ, createBaseAwemeResponse, this.LLILLL, videoPublishEditModel, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws InterruptedException {
        ExtractFramesModel extractFramesModel;
        String extractFramesDir;
        C1C7U.LIZ("ShortVideoPublishCallback@c2a7.handleTnsWhenPublishSuccess$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1403010mc7.LIZ.LJIIIZ();
        C1441380nc0.LIZJ(this.LL, this.LLILLJJLI, this.LLILLL.LLILLL);
        C01GW c01gw = C262660ARc.LIZ;
        if (!((Boolean) c01gw.getValue()).booleanValue()) {
            C1403010mc7.LIZ.LJIIIZ();
            C1441380nc0.LIZIZ(this.LL, this.LLILLJJLI, this.LLILLL.LLILLL);
        }
        if (((Boolean) C0ARA.LIZ.getValue()).booleanValue() && ((Boolean) c01gw.getValue()).booleanValue() && (extractFramesModel = this.LLILLJJLI.getExtractFramesModel()) != null && (extractFramesDir = extractFramesModel.getExtractFramesDir()) != null) {
            C20020913Vf c20020913Vf = C20020913Vf.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("clean extractFrames: Path：");
            sbLIZ.append(extractFramesDir);
            C201955140j.LIZJ(c20020913Vf, C2188811AlT.LIZIZ(sbLIZ));
            Boolean.valueOf(C08QA.LJIIZILJ(new C0VSJ(extractFramesDir)));
        }
        this.LLILLL.LLILLL.await();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ShortVideoPublishCallback@c2a7.handleTnsWhenPublishSuccess$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

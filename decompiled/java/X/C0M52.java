package X;

import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.shortvideo.CreateBaseAwemeResponse;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0M52, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.ShortVideoPublishCallback$handleDraftAndTnsOnPublishSuccess$1$7", f = "ShortVideoPublishCallback.kt", l = {193}, m = "invokeSuspend")
public final class C0M52 extends C09AX implements Function1<InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1439630nZB LLILLJJLI;
    public final /* synthetic */ VideoPublishEditModel LLILLL;
    public final /* synthetic */ CreateBaseAwemeResponse LLILZ;
    public final /* synthetic */ AwemeDraft LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0M52(AwemeDraft awemeDraft, CreateBaseAwemeResponse createBaseAwemeResponse, C1439630nZB c1439630nZB, VideoPublishEditModel videoPublishEditModel, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = c1439630nZB;
        this.LLILLL = videoPublishEditModel;
        this.LLILZ = createBaseAwemeResponse;
        this.LLILZIL = awemeDraft;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1439630nZB c1439630nZB = this.LLILLJJLI;
        VideoPublishEditModel videoPublishEditModel = this.LLILLL;
        return new C0M52(this.LLILZIL, this.LLILZ, c1439630nZB, videoPublishEditModel, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ShortVideoPublishCallback@c2a7.handleDraftAndTnsOnPublishSuccess$1$7");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C1439630nZB c1439630nZB = this.LLILLJJLI;
            VideoPublishEditModel videoPublishEditModel = this.LLILLL;
            CreateBaseAwemeResponse createBaseAwemeResponse = this.LLILZ;
            AwemeDraft awemeDraft = this.LLILZIL;
            this.LL = 1;
            if (c1439630nZB.LJII(videoPublishEditModel, createBaseAwemeResponse, awemeDraft, this) == objLJFF) {
                C1C7U.LIZIZ("ShortVideoPublishCallback@c2a7.handleDraftAndTnsOnPublishSuccess$1$7");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ShortVideoPublishCallback@c2a7.handleDraftAndTnsOnPublishSuccess$1$7");
        return unit;
    }
}

package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LOT, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.editpost.EditPostUtilsKt$internalStartEditPostPublishActivity$1", f = "EditPostUtils.kt", l = {111}, m = "invokeSuspend")
public final class C0LOT extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Activity LLILLJJLI;
    public final /* synthetic */ Aweme LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ boolean LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LOT(Activity activity, Aweme aweme, int i, String str, boolean z, InterfaceC1364105Vn<? super C0LOT> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = activity;
        this.LLILLL = aweme;
        this.LLILZ = i;
        this.LLILZIL = str;
        this.LLILZLL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0LOT(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("EditPostUtilsKt@87de.internalStartEditPostPublishActivity$1");
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
            C1DFB c1dfb = C0PEM.LIZJ;
            C0LOS c0los = new C0LOS(this.LLILLL, null);
            this.LL = 1;
            obj = C23250099c.LJI(this, c1dfb, c0los);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("EditPostUtilsKt@87de.internalStartEditPostPublishActivity$1");
                return objLJFF;
            }
        }
        AwemeDraft awemeDraft = (AwemeDraft) obj;
        VideoPublishEditModel videoPublishEditModel = new VideoPublishEditModel();
        if (awemeDraft != null) {
            videoPublishEditModel.setCreativeInfo(awemeDraft.LIZIZ());
            videoPublishEditModel.creativeModel.draftInfoModel.isPublishedDraft = awemeDraft.LJJJI;
        }
        C1443230nez.LJIIIZ(this.LLILLJJLI, videoPublishEditModel, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EditPostUtilsKt@87de.internalStartEditPostPublishActivity$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

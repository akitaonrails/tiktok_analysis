package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.tools.draft.IDraftEditService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09XA, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.texttoimage.TextImageInnerPushServiceImpl$onInnerPushClick$1$1$1", f = "TextImageInnerPushServiceImpl.kt", l = {}, m = "invokeSuspend")
public final class C09XA extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Activity LL;
    public final /* synthetic */ AwemeDraft LLILLJJLI;
    public final /* synthetic */ VideoPublishEditModel LLILLL;
    public final /* synthetic */ C0LCN LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C09XA(Activity activity, AwemeDraft awemeDraft, VideoPublishEditModel videoPublishEditModel, C0LCN c0lcn, InterfaceC1364105Vn<? super C09XA> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = activity;
        this.LLILLJJLI = awemeDraft;
        this.LLILLL = videoPublishEditModel;
        this.LLILZ = c0lcn;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C09XA(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TextImageInnerPushServiceImpl@5c6f.onInnerPushClick$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        IDraftEditService iDraftEditService = (IDraftEditService) PluggableExtentionKt.pluggableSpi$default(IDraftEditService.class, false, false, false, 14, null);
        if (iDraftEditService != null) {
            Activity activity = this.LL;
            AwemeDraft awemeDraft = this.LLILLJJLI;
            VideoPublishEditModel videoPublishEditModel = this.LLILLL;
            long jCurrentTimeMillis = System.currentTimeMillis();
            String str = this.LLILZ.LIZJ;
            if (str == null) {
                str = "ai_text_template_inner_push";
            }
            iDraftEditService.LIZJ(activity, awemeDraft, videoPublishEditModel, jCurrentTimeMillis, str);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TextImageInnerPushServiceImpl@5c6f.onInnerPushClick$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

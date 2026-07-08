package X;

import android.content.Context;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0KzY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.external.AVDraftServiceImpl$editPostedDraft$1", f = "AVDraftServiceImpl.kt", l = {111}, m = "invokeSuspend")
public final class C535620KzY extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C557080Lt4 LLILLJJLI;
    public final /* synthetic */ AwemeDraft LLILLL;
    public final /* synthetic */ Context LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C535620KzY(C557080Lt4 c557080Lt4, AwemeDraft awemeDraft, Context context, InterfaceC1364105Vn<? super C535620KzY> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c557080Lt4;
        this.LLILLL = awemeDraft;
        this.LLILZ = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C535620KzY(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AVDraftServiceImpl@86a4.editPostedDraft$1");
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
            C557080Lt4 c557080Lt4 = this.LLILLJJLI;
            AwemeDraft awemeDraft = this.LLILLL;
            Context context = this.LLILZ;
            this.LL = 1;
            if (c557080Lt4.LIZ(context, awemeDraft, this) == objLJFF) {
                C1C7U.LIZIZ("AVDraftServiceImpl@86a4.editPostedDraft$1");
                return objLJFF;
            }
        }
        C570560MZi.LJFF(C1388190mED.LIZIZ(this.LLILZ), this.LLILLL, 3, System.currentTimeMillis(), null);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AVDraftServiceImpl@86a4.editPostedDraft$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

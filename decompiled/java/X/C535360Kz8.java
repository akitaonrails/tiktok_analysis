package X;

import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Kz8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.newframework.task.DraftQueryTask$run$draft$1", f = "DraftQueryTask.kt", l = {}, m = "invokeSuspend")
public final class C535360Kz8 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super AwemeDraft>, Object> {
    public final /* synthetic */ String LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C535360Kz8(String str, InterfaceC1364105Vn<? super C535360Kz8> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C535360Kz8(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DraftQueryTask@a333.run$draft$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        AwemeDraft awemeDraftLJI = C0CHQ.LIZ().LJI().LJIILJJIL().LJI(new C558570LvT(new CreativeInfo(this.LL, 0, null, 6, null), false, false, false, 14));
        C1C7U.LIZIZ("DraftQueryTask@a333.run$draft$1");
        return awemeDraftLJI;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super AwemeDraft> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

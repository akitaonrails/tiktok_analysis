package X;

import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LtG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ailivephoto.AILivePhotoRestoreTaskHandler$onRestoreFinish$2", f = "AILivePhotoRestoreTaskHandler.kt", l = {}, m = "invokeSuspend")
public final class C557200LtG extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C557190LtF LL;
    public final /* synthetic */ AwemeDraft LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C557200LtG(C557190LtF c557190LtF, AwemeDraft awemeDraft, InterfaceC1364105Vn<? super C557200LtG> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c557190LtF;
        this.LLILLJJLI = awemeDraft;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C557200LtG(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AILivePhotoRestoreTaskHandler@7924.onRestoreFinish$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LIZLLL.onFinish(this.LLILLJJLI);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AILivePhotoRestoreTaskHandler@7924.onRestoreFinish$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

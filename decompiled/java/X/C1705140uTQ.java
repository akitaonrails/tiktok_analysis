package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0uTQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.comment.image.brush.download.CommentMattingResFetcherImpl$loadMattingModelInner$2$2$deferred$1", f = "CommentMattingResFetcherImpl.kt", l = {93}, m = "invokeSuspend")
public final class C1705140uTQ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C1704730uSl<Effect>>, Object> {
    public int LL;
    public final /* synthetic */ InterfaceC1705430uTt LLILLJJLI;
    public final /* synthetic */ C1705150uTR LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1705140uTQ(InterfaceC1705430uTt interfaceC1705430uTt, C1705150uTR c1705150uTR, InterfaceC1364105Vn<? super C1705140uTQ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC1705430uTt;
        this.LLILLL = c1705150uTR;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1705140uTQ(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CommentMattingResFetcherImpl@2fd7.loadMattingModelInner$2$2$deferred$1");
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
            InterfaceC1705430uTt interfaceC1705430uTt = this.LLILLJJLI;
            Effect effect = this.LLILLL.LIZ;
            this.LL = 1;
            obj = interfaceC1705430uTt.LJIILIIL(effect, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("CommentMattingResFetcherImpl@2fd7.loadMattingModelInner$2$2$deferred$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("CommentMattingResFetcherImpl@2fd7.loadMattingModelInner$2$2$deferred$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C1704730uSl<Effect>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

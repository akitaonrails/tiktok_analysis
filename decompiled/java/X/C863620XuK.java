package X;

import com.bytedance.im.core.proto.SendMessageResponseBody;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0XuK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.link.DefaultIMUseCaseCenter$retrySendMessages$1", f = "DefaultIMUseCaseCenter.kt", l = {390}, m = "invokeSuspend")
public final class C863620XuK extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C863650XuN LLILLJJLI;
    public final /* synthetic */ List<C869590Y9l> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C863620XuK(C863650XuN c863650XuN, List<? extends C869590Y9l> list, InterfaceC1364105Vn<? super C863620XuK> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c863650XuN;
        this.LLILLL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C863620XuK(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DefaultIMUseCaseCenter@568c.retrySendMessages$1");
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
            C863920Xuo c863920Xuo = C0YC5.LJ;
            C863650XuN c863650XuN = this.LLILLJJLI;
            InterfaceC864330XvT interfaceC864330XvT = c863650XuN.LLILLJJLI;
            C0YEM c0yem = c863650XuN.LL;
            List<C869590Y9l> list = this.LLILLL;
            C0D2S<SendMessageResponseBody> c0d2sLJIIL = c863650XuN.LLILZIL.LJIIL();
            this.LL = 1;
            if (c863920Xuo.LIZ(interfaceC864330XvT, c0yem, list, c0d2sLJIIL, this) == objLJFF) {
                C1C7U.LIZIZ("DefaultIMUseCaseCenter@568c.retrySendMessages$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DefaultIMUseCaseCenter@568c.retrySendMessages$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

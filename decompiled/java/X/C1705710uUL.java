package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0uUL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardsdisplay.batch.BoardItemRenderHandle$await$2", f = "BoardItemRenderHandle.kt", l = {82}, m = "invokeSuspend")
public final class C1705710uUL extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C07XT>, Object> {
    public int LL;
    public final /* synthetic */ C1705720uUM LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1705710uUL(C1705720uUM c1705720uUM, InterfaceC1364105Vn<? super C1705710uUL> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1705720uUM;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1705710uUL(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("BoardItemRenderHandle@6d61.await$2");
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
            C099F c099f = this.LLILLJJLI.LIZIZ;
            this.LL = 1;
            obj = c099f.LJLIIIL(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("BoardItemRenderHandle@6d61.await$2");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("BoardItemRenderHandle@6d61.await$2");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C07XT> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

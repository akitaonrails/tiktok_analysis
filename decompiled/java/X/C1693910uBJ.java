package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0uBJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "androidx.compose.foundation.text.ContextMenu_androidKt$ContextMenuArea$2$1$1", f = "ContextMenu.android.kt", l = {56}, m = "invokeSuspend")
public final class C1693910uBJ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C05P0 LL;
    public int LLILLJJLI;
    public final /* synthetic */ C05P0<C789320Uxm> LLILLL;
    public final /* synthetic */ C1692140u8S LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1693910uBJ(C05P0<C789320Uxm> c05p0, C1692140u8S c1692140u8S, InterfaceC1364105Vn<? super C1693910uBJ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c05p0;
        this.LLILZ = c1692140u8S;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1693910uBJ(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C05P0 c05p0;
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                c05p0 = this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            c05p0 = this.LLILLL;
            C1692140u8S c1692140u8S = this.LLILZ;
            this.LL = c05p0;
            this.LLILLJJLI = 1;
            obj = C1693900uBI.LIZIZ(c1692140u8S, this);
            if (obj == objLJFF) {
                return objLJFF;
            }
        }
        c05p0.setValue(obj);
        return Unit.LIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

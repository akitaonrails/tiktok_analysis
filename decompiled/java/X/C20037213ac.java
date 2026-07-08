package X;

import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.WrappedComposition;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.13ac, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
@C09DV(c = "androidx.compose.ui.platform.WrappedComposition$setContent$1$1$1$1", f = "Wrapper.android.kt", l = {136}, m = "invokeSuspend")
public final class C20037213ac extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ WrappedComposition LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20037213ac(WrappedComposition wrappedComposition, InterfaceC1364105Vn<? super C20037213ac> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = wrappedComposition;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C20037213ac(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
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
            AndroidComposeView androidComposeView = this.LLILLJJLI.LL;
            this.LL = 1;
            Object objLIZJ = androidComposeView.LLJJIJI.LIZJ(this);
            if (objLIZJ != C099R.LJFF()) {
                objLIZJ = Unit.LIZ;
            }
            if (objLIZJ == objLJFF) {
                return objLJFF;
            }
        }
        return Unit.LIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

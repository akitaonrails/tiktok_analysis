package X;

import androidx.lifecycle.Lifecycle;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Ehu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.preview.BaseTTEditPreviewComponent$onCreate$4$1$1", f = "TiktokEditPreviewComponent.kt", l = {}, m = "invokeSuspend")
public final class C371800Ehu extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1463670oBx LL;
    public final /* synthetic */ C1452090ntH<T> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C371800Ehu(C1463670oBx c1463670oBx, C1452090ntH<T> c1452090ntH, InterfaceC1364105Vn<? super C371800Ehu> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1463670oBx;
        this.LLILLJJLI = c1452090ntH;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C371800Ehu(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BaseTTEditPreviewComponent@89f0.onCreate$4$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LIZLLL().getClass();
        C1463670oBx c1463670oBx = this.LL;
        c1463670oBx.LJIJ = false;
        System.currentTimeMillis();
        if (c1463670oBx.LJIJI) {
            c1463670oBx.yc(c1463670oBx.LIZJ());
            c1463670oBx.LJIJI = false;
        }
        System.currentTimeMillis();
        this.LLILLJJLI.LLLLII.setValue(true);
        if (this.LLILLJJLI.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
            this.LLILLJJLI.y8();
        }
        if (this.LLILLJJLI.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.RESUMED)) {
            this.LLILLJJLI.u8();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BaseTTEditPreviewComponent@89f0.onCreate$4$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

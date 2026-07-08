package X;

import android.graphics.Bitmap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01Jg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.common.multicanvas.noticedialog.NoticeBoardDialogPresenter$saveDraft$2$1", f = "NoticeBoardDialogPresenter.kt", l = {}, m = "invokeSuspend")
public final class C313001Jg extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Function1<Bitmap, Unit> LL;
    public final /* synthetic */ C259800zU<Bitmap> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C313001Jg(InterfaceC1364105Vn interfaceC1364105Vn, Function1 function1, C259800zU c259800zU) {
        super(2, interfaceC1364105Vn);
        this.LL = function1;
        this.LLILLJJLI = c259800zU;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C313001Jg(interfaceC1364105Vn, this.LL, this.LLILLJJLI);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("NoticeBoardDialogPresenter@5c4e.saveDraft$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.invoke(this.LLILLJJLI.element);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("NoticeBoardDialogPresenter@5c4e.saveDraft$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Y8A, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.link.usecase.getmessagepreview.GetMessagePreviewUseCase$pullAndSave$2", f = "GetMessagePreviewUseCase.kt", l = {}, m = "invokeSuspend")
public final class C0Y8A extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0Y8C LL;
    public final /* synthetic */ C0Y8F LLILLJJLI;
    public final /* synthetic */ C0Y8B LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0Y8A(C0Y8C c0y8c, C0Y8F c0y8f, C0Y8B c0y8b, InterfaceC1364105Vn<? super C0Y8A> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0y8c;
        this.LLILLJJLI = c0y8f;
        this.LLILLL = c0y8b;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0Y8A(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        List<C869590Y9l> list;
        C1C7U.LIZ("GetMessagePreviewUseCase@412d.pullAndSave$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C868200Y4c c868200Y4c = this.LL.LIZIZ.LJIIZILJ().getDomain().LIZ;
        String str = this.LLILLJJLI.LIZ;
        C0Y8B c0y8b = this.LLILLL;
        if (c0y8b.LIZIZ == null) {
            list = c0y8b.LIZ;
        } else {
            list = null;
        }
        c868200Y4c.LJJI(str, list, c0y8b.LIZJ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("GetMessagePreviewUseCase@412d.pullAndSave$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

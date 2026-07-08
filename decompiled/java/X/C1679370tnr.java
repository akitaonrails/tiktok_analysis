package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0tnr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.aweme.portrait.customize.ui.CustomizePromptInputKt$CustomizePromptInput$1$1", f = "CustomizePromptInput.kt", l = {}, m = "invokeSuspend")
public final class C1679370tnr extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1686970u07 LL;
    public final /* synthetic */ C05P0<C1686970u07> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1679370tnr(C1686970u07 c1686970u07, C05P0<C1686970u07> c05p0, InterfaceC1364105Vn<? super C1679370tnr> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1686970u07;
        this.LLILLJJLI = c05p0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1679370tnr(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CustomizePromptInputKt@e97e.CustomizePromptInput$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (!Intrinsics.LJFF(this.LL.LIZ.LLILLJJLI, C1679360tnq.LIZIZ(this.LLILLJJLI).LIZ.LLILLJJLI)) {
            this.LLILLJJLI.setValue(this.LL);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CustomizePromptInputKt@e97e.CustomizePromptInput$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

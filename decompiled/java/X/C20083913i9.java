package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.13i9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
@C09DV(c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic$dispatchMouseWheelScroll$3", f = "MouseWheelScrollable.kt", l = {253, 266, 283}, m = "invokeSuspend")
public final class C20083913i9 extends C09AX implements Function2<C112R, InterfaceC1364105Vn<? super Unit>, Object> {
    public C013C LL;
    public C013C LLILLJJLI;
    public int LLILLL;
    public int LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ C817403Hg LLILZLL;
    public final /* synthetic */ C259800zU<C1677580tky<Float, C1677280tkU>> LLIZ;
    public final /* synthetic */ C259800zU<C20074813gg> LLIZLLLIL;
    public final /* synthetic */ float LLJ;
    public final /* synthetic */ C20083813i8 LLJI;
    public final /* synthetic */ float LLJIJIL;
    public final /* synthetic */ C20082713hx LLJILJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20083913i9(C817403Hg c817403Hg, C259800zU<C1677580tky<Float, C1677280tkU>> c259800zU, C259800zU<C20074813gg> c259800zU2, float f, C20083813i8 c20083813i8, float f2, C20082713hx c20082713hx, InterfaceC1364105Vn<? super C20083913i9> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZLL = c817403Hg;
        this.LLIZ = c259800zU;
        this.LLIZLLLIL = c259800zU2;
        this.LLJ = f;
        this.LLJI = c20083813i8;
        this.LLJIJIL = f2;
        this.LLJILJIL = c20082713hx;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C20083913i9 c20083913i9 = new C20083913i9(this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, interfaceC1364105Vn);
        c20083913i9.LLILZIL = obj;
        return c20083913i9;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0142  */
    /* JADX WARN: Type inference failed for: r2v24, types: [T, X.0tky] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0140 -> B:9:0x0029). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x015f -> B:8:0x0020). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            Method dump skipped, instruction units count: 403
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20083913i9.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C112R c112r, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c112r, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

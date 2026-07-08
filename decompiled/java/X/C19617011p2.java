package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.11p2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.liveeventsticker.view.LiveEventStickerView$handleStickerButtonClick$1$1", f = "LiveEventStickerView.kt", l = {}, m = "invokeSuspend")
public final class C19617011p2 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C19663611wY LL;
    public final /* synthetic */ C19662711wP LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19617011p2(C19663611wY c19663611wY, C19662711wP c19662711wP, InterfaceC1364105Vn<? super C19617011p2> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c19663611wY;
        this.LLILLJJLI = c19662711wP;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C19617011p2(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveEventStickerView@a7.handleStickerButtonClick$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C19663611wY c19663611wY = this.LL;
        boolean z = !c19663611wY.LJIIJ;
        c19663611wY.LJIIJ = z;
        this.LLILLJJLI.F0(z);
        Function0<Unit> function0 = this.LLILLJJLI.LLLFFI;
        if (function0 != null) {
            function0.invoke();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LiveEventStickerView@a7.handleStickerButtonClick$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

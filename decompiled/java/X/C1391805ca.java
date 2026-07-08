package X;

import com.bytedance.als.h0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05ca, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.lyric.component.LyricStickerEffectUIComponent$launchTrimPanel$2$loadJob$1$1", f = "LyricStickerEffectUIComponent.kt", l = {}, m = "invokeSuspend")
public final class C1391805ca extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C389110FNl LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1391805ca(C389110FNl c389110FNl, InterfaceC1364105Vn<? super C1391805ca> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c389110FNl;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1391805ca(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LyricStickerEffectUIComponent@df9c.launchTrimPanel$2$loadJob$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        h0<C375830EoP<Unit>> h0Var = this.LL.LLJLILLLLZIIL;
        Unit unit = Unit.LIZ;
        h0Var.LJII(new C375830EoP<>(unit));
        C1C7U.LIZIZ("LyricStickerEffectUIComponent@df9c.launchTrimPanel$2$loadJob$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: renamed from: X.05EA, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.slideslip.fullwidthhorizontal.FullWidthEffectCarouselComponent$observeExternalStickerChange$1$1", f = "FullWidthEffectCarouselComponent.kt", l = {}, m = "invokeSuspend")
public final class C05EA extends C09AX implements InterfaceC1631620sYq<Effect, Boolean, InterfaceC1364105Vn<? super Pair<? extends Effect, ? extends Boolean>>, Object> {
    public /* synthetic */ Effect LL;
    public /* synthetic */ Object LLILLJJLI;

    public C05EA(InterfaceC1364105Vn<? super C05EA> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FullWidthEffectCarouselComponent@e1ee.observeExternalStickerChange$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Pair pair = new Pair(this.LL, this.LLILLJJLI);
        C1C7U.LIZIZ("FullWidthEffectCarouselComponent@e1ee.observeExternalStickerChange$1$1");
        return pair;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(Effect effect, Boolean bool, InterfaceC1364105Vn<? super Pair<? extends Effect, ? extends Boolean>> interfaceC1364105Vn) {
        C05EA c05ea = new C05EA(interfaceC1364105Vn);
        c05ea.LL = effect;
        c05ea.LLILLJJLI = bool;
        return c05ea.invokeSuspend(Unit.LIZ);
    }
}

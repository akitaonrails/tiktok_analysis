package X;

import com.ss.android.ugc.aweme.effect.EditEffectVideoModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0EEh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.capabilities.effects.videoeffect.ui.EffectResourcePanelScene$initFavorite$1", f = "EffectResourcePanelScene.kt", l = {511}, m = "invokeSuspend")
public final class C361250EEh extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C361240EEg LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C361250EEh(C361240EEg c361240EEg, InterfaceC1364105Vn<? super C361250EEh> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c361240EEg;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C361250EEh(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objSS0;
        C1C7U.LIZ("EffectResourcePanelScene@1788.initFavorite$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
                objSS0 = ((C189200o6) obj).m10unboximpl();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            InterfaceC361290EEl interfaceC361290EEl = this.LLILLJJLI.LLJZIJLIL;
            if (interfaceC361290EEl != null) {
                this.LL = 1;
                objSS0 = interfaceC361290EEl.SS0("editingeffect", true, this);
                if (objSS0 == objLJFF) {
                    C1C7U.LIZIZ("EffectResourcePanelScene@1788.initFavorite$1");
                    return objLJFF;
                }
            }
            C560530Lyd c560530Lyd = (C560530Lyd) ((EditEffectVideoModel) this.LLILLJJLI.LLLF.getValue()).LLILZIL.getValue();
            Unit unit = Unit.LIZ;
            c560530Lyd.LJIIIZ(unit);
            C1C7U.LIZIZ("EffectResourcePanelScene@1788.initFavorite$1");
            return unit;
        }
        C189200o6.m1boximpl(objSS0);
        C560530Lyd c560530Lyd2 = (C560530Lyd) ((EditEffectVideoModel) this.LLILLJJLI.LLLF.getValue()).LLILZIL.getValue();
        Unit unit2 = Unit.LIZ;
        c560530Lyd2.LJIIIZ(unit2);
        C1C7U.LIZIZ("EffectResourcePanelScene@1788.initFavorite$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

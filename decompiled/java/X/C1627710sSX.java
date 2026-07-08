package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0sSX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.slideslip.fullwidthhorizontal.EffectPrefetcherComponentKt$downloadEffectPrefetch$2", f = "EffectPrefetcherComponent.kt", l = {290}, m = "invokeSuspend")
public final class C1627710sSX extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C1632580saO<C1629340sVA, Effect>>, Object> {
    public int LL;
    public final /* synthetic */ InterfaceC1624480sNK LLILLJJLI;
    public final /* synthetic */ Effect LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1627710sSX(InterfaceC1624480sNK interfaceC1624480sNK, Effect effect, InterfaceC1364105Vn<? super C1627710sSX> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC1624480sNK;
        this.LLILLL = effect;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1627710sSX(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EffectPrefetcherComponentKt@866d.downloadEffectPrefetch$2");
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
            C1698270uIL c1698270uIL = new C1698270uIL(C098C.LIZ(this.LLILLJJLI.getStickerRepository().LJIILLIIL().LIZIZ(new C1629340sVA(this.LLILLL, true, null), false)), 13);
            this.LL = 1;
            obj = C09IC.LJIJI(c1698270uIL, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("EffectPrefetcherComponentKt@866d.downloadEffectPrefetch$2");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("EffectPrefetcherComponentKt@866d.downloadEffectPrefetch$2");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C1632580saO<C1629340sVA, Effect>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

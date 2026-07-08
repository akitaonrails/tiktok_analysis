package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01qh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.sticker.presenter.DefaultStickerState$latestWantToUseStickerFlow$$inlined$transform$1", f = "DefaultStickerState.kt", l = {40}, m = "invokeSuspend")
public final class C460101qh extends C09AX implements Function2<InterfaceC346701Wf<? super Effect>, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ InterfaceC346201Wa LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C460101qh(InterfaceC346201Wa interfaceC346201Wa, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = interfaceC346201Wa;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C460101qh c460101qh = new C460101qh(this.LLILLL, interfaceC1364105Vn);
        c460101qh.LLILLJJLI = obj;
        return c460101qh;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC346701Wf<? super Effect> interfaceC346701Wf, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC346701Wf, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DefaultStickerState@7d1.latestWantToUseStickerFlow$$inlined$transform$1");
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
            InterfaceC346701Wf interfaceC346701Wf = (InterfaceC346701Wf) this.LLILLJJLI;
            InterfaceC346201Wa interfaceC346201Wa = this.LLILLL;
            C517001zs c517001zs = new C517001zs(interfaceC346701Wf, 12);
            this.LL = 1;
            if (interfaceC346201Wa.collect(c517001zs, this) == objLJFF) {
                C1C7U.LIZIZ("DefaultStickerState@7d1.latestWantToUseStickerFlow$$inlined$transform$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DefaultStickerState@7d1.latestWantToUseStickerFlow$$inlined$transform$1");
        return unit;
    }
}

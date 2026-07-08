package X;

import Y.AgS293S0100000_12;
import com.bytedance.android.live.effect.singleselector.SingleStickerEffectSelectorDialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01wM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.live.effect.singleselector.SingleStickerEffectSelectorDialog$observeViewModel$1", f = "SingleStickerEffectSelectorDialog.kt", l = {141}, m = "invokeSuspend")
public final class C495201wM extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ SingleStickerEffectSelectorDialog LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C495201wM(SingleStickerEffectSelectorDialog singleStickerEffectSelectorDialog, InterfaceC1364105Vn<? super C495201wM> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = singleStickerEffectSelectorDialog;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C495201wM(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SingleStickerEffectSelectorDialog@19d0.observeViewModel$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            SingleStickerEffectSelectorDialog singleStickerEffectSelectorDialog = this.LLILLJJLI;
            C2252331DDr c2252331DDr = singleStickerEffectSelectorDialog.LLILZLL.LLILLL;
            AgS293S0100000_12 agS293S0100000_12 = new AgS293S0100000_12(singleStickerEffectSelectorDialog, 49);
            this.LL = 1;
            c2252331DDr.getClass();
            if (C2252331DDr.LJIIJ(c2252331DDr, agS293S0100000_12, this) == objLJFF) {
                C1C7U.LIZIZ("SingleStickerEffectSelectorDialog@19d0.observeViewModel$1");
                return objLJFF;
            }
        }
        throw new C2197108jB();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01hc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.live.effect.sticker.page.LiveStickerDialogView$updateUiAfterEffectRemovedOrRestored$1", f = "LiveStickerDialogView.kt", l = {348, 349}, m = "invokeSuspend")
public final class C403801hc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C0UAO LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C403801hc(C0UAO c0uao, String str, InterfaceC1364105Vn<? super C403801hc> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0uao;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C403801hc(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveStickerDialogView@9284.updateUiAfterEffectRemovedOrRestored$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("LiveStickerDialogView@9284.updateUiAfterEffectRemovedOrRestored$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C1DEK c1dek = this.LLILLJJLI.LLJI.LLILLJJLI;
            C395501gH c395501gH = new C395501gH(this.LLILLL);
            this.LL = 1;
            if (c1dek.LJIJI(c395501gH, this) == objLJFF) {
                C1C7U.LIZIZ("LiveStickerDialogView@9284.updateUiAfterEffectRemovedOrRestored$1");
                return objLJFF;
            }
        }
        C1DEK c1dek2 = this.LLILLJJLI.LLJI.LLILLJJLI;
        C402701hR c402701hR = C402701hR.LIZ;
        this.LL = 2;
        if (c1dek2.LJIJI(c402701hR, this) == objLJFF) {
            C1C7U.LIZIZ("LiveStickerDialogView@9284.updateUiAfterEffectRemovedOrRestored$1");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("LiveStickerDialogView@9284.updateUiAfterEffectRemovedOrRestored$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

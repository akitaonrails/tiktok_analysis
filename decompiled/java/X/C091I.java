package X;

import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.PanelInfoModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import wuk.d0;

/* JADX INFO: renamed from: X.091I, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.sticker.repository.internals.main.DefaultStickerSource$postPanelInfoDataUpdate$4$1", f = "DefaultStickerSource.kt", l = {631}, m = "invokeSuspend")
public final class C091I extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AnonymousClass0957<CategoryEffectModel> LLILLJJLI;
    public final /* synthetic */ d0 LLILLL;
    public final /* synthetic */ PanelInfoModel LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ C1641640sp0<PanelInfoModel> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C091I(AnonymousClass0957<? extends CategoryEffectModel> anonymousClass0957, d0 d0Var, PanelInfoModel panelInfoModel, int i, C1641640sp0<PanelInfoModel> c1641640sp0, InterfaceC1364105Vn<? super C091I> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = anonymousClass0957;
        this.LLILLL = d0Var;
        this.LLILZ = panelInfoModel;
        this.LLILZIL = i;
        this.LLILZLL = c1641640sp0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C091I(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DefaultStickerSource@cf79.postPanelInfoDataUpdate$4$1");
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
            AnonymousClass0957<CategoryEffectModel> anonymousClass0957 = this.LLILLJJLI;
            this.LL = 1;
            if (anonymousClass0957.LJLIIIL(this) == objLJFF) {
                C1C7U.LIZIZ("DefaultStickerSource@cf79.postPanelInfoDataUpdate$4$1");
                return objLJFF;
            }
        }
        this.LLILLL.LJIIZILJ.setValue(this.LLILZ.getUrlPrefix());
        this.LLILLL.LJIIIZ.setValue(C2286608xc.LJ(this.LLILZIL));
        this.LLILLL.LJIJI.getValue().setValue(this.LLILZLL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DefaultStickerSource@cf79.postPanelInfoDataUpdate$4$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

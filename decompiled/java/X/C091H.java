package X;

import com.ss.android.ugc.effectmanager.effect.model.PanelInfoModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import wuk.d0;

/* JADX INFO: renamed from: X.091H, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.sticker.repository.internals.main.DefaultStickerSource$postPanelInfoDataUpdate$4", f = "DefaultStickerSource.kt", l = {630}, m = "invokeSuspend")
public final class C091H extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ PanelInfoModel LLILLL;
    public final /* synthetic */ d0 LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ C1641640sp0<PanelInfoModel> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C091H(PanelInfoModel panelInfoModel, d0 d0Var, int i, C1641640sp0<PanelInfoModel> c1641640sp0, InterfaceC1364105Vn<? super C091H> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = panelInfoModel;
        this.LLILZ = d0Var;
        this.LLILZIL = i;
        this.LLILZLL = c1641640sp0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C091H c091h = new C091H(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c091h.LLILLJJLI = obj;
        return c091h;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DefaultStickerSource@cf79.postPanelInfoDataUpdate$4");
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
            C099G c099gLIZIZ = C23250099c.LIZIZ((InterfaceC497601wk) this.LLILLJJLI, null, null, new C091G(this.LLILLL, this.LLILZ, this.LLILZIL, null), 3);
            C2238608ps c2238608ps = C2107708Nn.LIZ;
            C091I c091i = new C091I(c099gLIZIZ, this.LLILZ, this.LLILLL, this.LLILZIL, this.LLILZLL, null);
            this.LL = 1;
            if (C23250099c.LJI(this, c2238608ps, c091i) == objLJFF) {
                C1C7U.LIZIZ("DefaultStickerSource@cf79.postPanelInfoDataUpdate$4");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DefaultStickerSource@cf79.postPanelInfoDataUpdate$4");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0UAl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.sticker.list.NormalStickerListView$fetchStickerList$2", f = "NormalStickerListView.kt", l = {172}, m = "invokeSuspend")
public final class C767930UAl extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C767860UAe LLILLJJLI;
    public final /* synthetic */ C0UBH LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C767930UAl(C767860UAe c767860UAe, C0UBH c0ubh, InterfaceC1364105Vn<? super C767930UAl> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c767860UAe;
        this.LLILLL = c0ubh;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C767930UAl(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("NormalStickerListView@6e51.fetchStickerList$2");
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
            C1DEK c1dek = this.LLILLJJLI.LJIILLIIL.LLILLJJLI;
            C395501gH c395501gH = new C395501gH(this.LLILLL.LIZIZ);
            this.LL = 1;
            if (c1dek.LJIJI(c395501gH, this) == objLJFF) {
                C1C7U.LIZIZ("NormalStickerListView@6e51.fetchStickerList$2");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("NormalStickerListView@6e51.fetchStickerList$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

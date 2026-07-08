package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0UAy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.sticker.search.SearchStickerDialogView$initListener$1$onScrollStateChanged$1", f = "SearchStickerDialogView.kt", l = {139}, m = "invokeSuspend")
public final class C768060UAy extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C767880UAg LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C768060UAy(C767880UAg c767880UAg, InterfaceC1364105Vn<? super C768060UAy> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c767880UAg;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C768060UAy(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SearchStickerDialogView@2b0d.initListener$1$onScrollStateChanged$1");
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
            C1DEK c1dek = this.LLILLJJLI.LLJILJIL.LLILLJJLI;
            C400201h2 c400201h2 = C400201h2.LIZ;
            this.LL = 1;
            if (c1dek.LJIJI(c400201h2, this) == objLJFF) {
                C1C7U.LIZIZ("SearchStickerDialogView@2b0d.initListener$1$onScrollStateChanged$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SearchStickerDialogView@2b0d.initListener$1$onScrollStateChanged$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

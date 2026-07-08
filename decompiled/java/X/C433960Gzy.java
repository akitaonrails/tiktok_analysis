package X;

import com.ss.android.ugc.aweme.ecommercebase.promotion.data.PromotionSticker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Gzy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommercebase.promotion.sticker.StickerUtils$fillCouponStickerView$1", f = "StickerUtils.kt", l = {75}, m = "invokeSuspend")
public final class C433960Gzy extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ List<PromotionSticker> LLILLJJLI;
    public final /* synthetic */ InterfaceC497601wk LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ Integer LLILZLL;
    public final /* synthetic */ C0H0C LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C433960Gzy(List<PromotionSticker> list, InterfaceC497601wk interfaceC497601wk, int i, boolean z, Integer num, C0H0C c0h0c, InterfaceC1364105Vn<? super C433960Gzy> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = list;
        this.LLILLL = interfaceC497601wk;
        this.LLILZ = i;
        this.LLILZIL = z;
        this.LLILZLL = num;
        this.LLIZ = c0h0c;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C433960Gzy(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StickerUtils@7d5e.fillCouponStickerView$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        int i2 = 1;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            ArrayList arrayList = new ArrayList();
            List<PromotionSticker> list = this.LLILLJJLI;
            InterfaceC497601wk interfaceC497601wk = this.LLILLL;
            int i3 = this.LLILZ;
            boolean z = this.LLILZIL;
            Integer num = this.LLILZLL;
            Iterator<PromotionSticker> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(C23250099c.LIZIZ(interfaceC497601wk, null, null, new C0H08(it2.next(), i3, z, num, null), 3));
                i2 = 1;
            }
            this.LL = i2;
            obj = C1D9F.LIZ(arrayList, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("StickerUtils@7d5e.fillCouponStickerView$1");
                return objLJFF;
            }
        }
        C0H0C c0h0c = this.LLIZ;
        Iterable iterable = (Iterable) obj;
        if (c0h0c != null) {
            c0h0c.setDrawables(C13LP.LJJJJLI(iterable));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StickerUtils@7d5e.fillCouponStickerView$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

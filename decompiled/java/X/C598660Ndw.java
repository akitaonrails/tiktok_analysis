package X;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Ndw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommercelive.audience.common.shoppingbag.list.DefaultShopBagList$needUpdateTemplateData$1", f = "DefaultShopBagList.kt", l = {802}, m = "invokeSuspend")
public final class C598660Ndw extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C21208517z9 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C598660Ndw(C21208517z9 c21208517z9, InterfaceC1364105Vn<? super C598660Ndw> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c21208517z9;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C598660Ndw(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Long lLJFF;
        C1C7U.LIZ("DefaultShopBagList@b462.needUpdateTemplateData$1");
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
            C21208517z9 c21208517z9 = this.LLILLJJLI;
            C054G c054g = c21208517z9.LLJJJJLIIL;
            Room room = c21208517z9.LLILZ;
            Long lLJFF2 = null;
            if (room != null) {
                lLJFF = C2286608xc.LJFF(room.getId());
            } else {
                lLJFF = null;
            }
            String strValueOf = String.valueOf(lLJFF);
            Room room2 = this.LLILLJJLI.LLILZ;
            if (room2 != null) {
                lLJFF2 = C2286608xc.LJFF(room2.getOwnerUserId());
            }
            String strValueOf2 = String.valueOf(lLJFF2);
            this.LL = 1;
            if (C21190617wG.LIZ.LIZ(c054g, strValueOf, strValueOf2, true, false, 0L, EnumC598510Ndh.REQUEST_SCENE_DEFAULT, null, null, this) == objLJFF) {
                C1C7U.LIZIZ("DefaultShopBagList@b462.needUpdateTemplateData$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DefaultShopBagList@b462.needUpdateTemplateData$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

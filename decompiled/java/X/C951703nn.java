package X;

import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.shop.SeaShopProfileVH;
import kotlin.Unit;

/* JADX INFO: renamed from: X.03nn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.shop.SeaShopProfileVH$onBind$2", f = "SeaShopProfileVH.kt", l = {}, m = "invokeSuspend")
public final class C951703nn extends C09AX implements InterfaceC1631620sYq<InterfaceC497601wk, View, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ SeaShopProfileVH LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C951703nn(SeaShopProfileVH seaShopProfileVH, InterfaceC1364105Vn<? super C951703nn> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
        this.LL = seaShopProfileVH;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SeaShopProfileVH@4533.onBind$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        SeaShopProfileVH seaShopProfileVH = this.LL;
        int i = SeaShopProfileVH.LLLFFI;
        seaShopProfileVH.C6("other", "showcase_detail");
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SeaShopProfileVH@4533.onBind$2");
        return unit;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, View view, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C951703nn(this.LL, interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}

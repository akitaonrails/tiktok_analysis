package X;

import android.view.View;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS392S0200000_26;
import njp.a;

/* JADX INFO: renamed from: X.0ved, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.favorites.PdpSaveProductMgr$showAddToFavoritesResult$1", f = "PdpSaveProductMgr.kt", l = {306}, m = "invokeSuspend")
public final class C1750530ved extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ View LLILLJJLI;
    public final /* synthetic */ C1750810vf5 LLILLL;
    public final /* synthetic */ ExceptionUX LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1750530ved(View view, C1750810vf5 c1750810vf5, ExceptionUX exceptionUX, InterfaceC1364105Vn<? super C1750530ved> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = view;
        this.LLILLL = c1750810vf5;
        this.LLILZ = exceptionUX;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1750530ved(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PdpSaveProductMgr@bdf2.showAddToFavoritesResult$1");
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
            String string = this.LLILLJJLI.getContext().getString(2131832817);
            C1750810vf5 c1750810vf5 = this.LLILLL;
            View view = this.LLILLJJLI;
            c1750810vf5.getClass();
            C1750810vf5.LIZJ(R.raw.icon_bookmark_fill, view);
            C1750520vec c1750520vec = C1750520vec.LIZ;
            if (c1750520vec.LIZIZ()) {
                C450720Hlu c450720Hlu = new C450720Hlu(this.LLILLJJLI.getContext());
                View view2 = this.LLILLJJLI;
                C1391600mJi c1391600mJi = c450720Hlu.LLILLJJLI;
                c1391600mJi.LIZIZ = view2;
                c450720Hlu.LLILZ = string;
                c1391600mJi.LIZLLL = EnumC1235690iGF.BOTTOM;
                c1391600mJi.LJIIIZ = true;
                c1391600mJi.LJIIL = true;
                c1391600mJi.LJII = 1000L;
                c450720Hlu.LIZJ(new AwS392S0200000_26(this.LLILLL, view2, 113));
                c450720Hlu.LIZIZ().show();
                synchronized (c1750520vec) {
                    Keva keva = C1257480ipO.LIZ;
                    keva.storeInt("ecom_favorite_list_guide", keva.getInt("ecom_favorite_list_guide", 0) + 1);
                }
            } else {
                this.LLILLL.LIZLLL(this.LLILLJJLI, this.LLILZ);
            }
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(1000L, this) == objLJFF) {
                C1C7U.LIZIZ("PdpSaveProductMgr@bdf2.showAddToFavoritesResult$1");
                return objLJFF;
            }
        }
        C1750810vf5 c1750810vf52 = this.LLILLL;
        View view3 = this.LLILLJJLI;
        c1750810vf52.getClass();
        C1750810vf5.LIZJ(R.raw.icon_ellipsis_horizontal, view3);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PdpSaveProductMgr@bdf2.showAddToFavoritesResult$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

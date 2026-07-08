package X;

import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.AddToFavoriteData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0vee, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.favorites.PdpSaveProductMgr$handleProductSave$1", f = "PdpSaveProductMgr.kt", l = {273}, m = "invokeSuspend")
public final class C1750540vee extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1750810vf5 LLILLL;
    public final /* synthetic */ View LLILZ;
    public final /* synthetic */ AddToFavoriteData LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1750540vee(C1750810vf5 c1750810vf5, View view, AddToFavoriteData addToFavoriteData, InterfaceC1364105Vn<? super C1750540vee> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c1750810vf5;
        this.LLILZ = view;
        this.LLILZIL = addToFavoriteData;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1750540vee c1750540vee = new C1750540vee(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c1750540vee.LLILLJJLI = obj;
        return c1750540vee;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        View view;
        ExceptionUX exceptionUX;
        C1C7U.LIZ("PdpSaveProductMgr@bdf2.handleProductSave$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                view = (View) this.LLILLJJLI;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            C1750810vf5 c1750810vf5 = this.LLILLL;
            C04GX c04gx = c1750810vf5.LIZ.l;
            if (c04gx != null) {
                view = c04gx.LIZ.LLJLL;
            } else {
                view = null;
            }
            C099G c099gLIZIZ = C23250099c.LIZIZ(interfaceC497601wk, null, null, new C1750550vef(this.LLILZ, c1750810vf5, null), 3);
            this.LLILLJJLI = view;
            this.LL = 1;
            obj = c099gLIZIZ.LJLIIIL(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("PdpSaveProductMgr@bdf2.handleProductSave$1");
                return objLJFF;
            }
        }
        if (((Boolean) obj).booleanValue() && view != null) {
            C1750810vf5 c1750810vf52 = this.LLILLL;
            AddToFavoriteData addToFavoriteData = this.LLILZIL;
            view.getContext();
            if (addToFavoriteData != null) {
                exceptionUX = addToFavoriteData.exceptionUX;
            } else {
                exceptionUX = null;
            }
            C948503nH.LJFF(c1750810vf52.LIZ, C23271099x.INSTANCE, new C1750530ved(view, c1750810vf52, exceptionUX, null));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PdpSaveProductMgr@bdf2.handleProductSave$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

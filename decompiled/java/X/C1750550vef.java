package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS595S0100000_16;
import njp.a;

/* JADX INFO: renamed from: X.0vef, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.favorites.PdpSaveProductMgr$handleProductSave$1$animation$1", f = "PdpSaveProductMgr.kt", l = {258}, m = "invokeSuspend")
public final class C1750550vef extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ View LLILLL;
    public final /* synthetic */ C1750810vf5 LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1750550vef(View view, C1750810vf5 c1750810vf5, InterfaceC1364105Vn<? super C1750550vef> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = view;
        this.LLILZ = c1750810vf5;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1750550vef(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        boolean zCanScrollVertically;
        Integer numLJ;
        View view;
        ViewGroup viewGroupLIZIZ;
        ViewGroup viewGroupLIZIZ2;
        RecyclerView recyclerViewLIZLLL;
        List<String> urls;
        Object objLIZ = obj;
        C1C7U.LIZ("PdpSaveProductMgr@bdf2.handleProductSave$1$animation$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objLIZ);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLIZ);
            View view2 = this.LLILLL;
            C1750810vf5 c1750810vf5 = this.LLILZ;
            this.LL = view2;
            this.LLILLJJLI = 1;
            C23260099m c23260099m = new C23260099m(C099M.LIZLLL(this));
            Context context = view2.getContext();
            Image imageCR2 = c1750810vf5.LIZ.CR2();
            if (imageCR2 != null && (urls = imageCR2.getUrls()) != null) {
                str = (String) C13LP.LJJJLL(urls);
            } else {
                str = null;
            }
            C04GX c04gx = c1750810vf5.LIZ.l;
            if (c04gx != null && (recyclerViewLIZLLL = c04gx.LIZLLL()) != null) {
                zCanScrollVertically = recyclerViewLIZLLL.canScrollVertically(-1);
            } else {
                zCanScrollVertically = false;
            }
            C04GX c04gx2 = c1750810vf5.LIZ.l;
            if (c04gx2 != null) {
                numLJ = C2286608xc.LJ(c04gx2.LIZJ());
            } else {
                numLJ = null;
            }
            C04GX c04gx3 = c1750810vf5.LIZ.l;
            if (c04gx3 != null) {
                view = c04gx3.LIZ.LLJLL;
                viewGroupLIZIZ = c04gx3.LIZIZ();
            } else {
                view = null;
                viewGroupLIZIZ = null;
            }
            C04GX c04gx4 = c1750810vf5.LIZ.l;
            if (c04gx4 != null) {
                viewGroupLIZIZ2 = c04gx4.LIZIZ();
            } else {
                viewGroupLIZIZ2 = null;
            }
            C428070GqT.LIZ(context, null, str, zCanScrollVertically, numLJ, view, viewGroupLIZIZ, viewGroupLIZIZ2, new AwS595S0100000_16(c23260099m, 221));
            objLIZ = c23260099m.LIZ();
            if (objLIZ == C099R.LJFF()) {
                C099Q.LIZJ(this);
            }
            if (objLIZ == objLJFF) {
                C1C7U.LIZIZ("PdpSaveProductMgr@bdf2.handleProductSave$1$animation$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("PdpSaveProductMgr@bdf2.handleProductSave$1$animation$1");
        return objLIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

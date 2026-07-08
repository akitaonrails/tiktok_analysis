package X;

import com.ss.android.ugc.aweme.tools.mvtemplate.core.TemplateCategoryData;
import com.ss.android.ugc.aweme.tools.mvtemplate.favorite.TemplateFavoriteResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0n8k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.mvtemplate.core.TemplateCoreComponent$templateFavorite$2$1", f = "TemplateCoreComponent.kt", l = {}, m = "invokeSuspend")
public final class C1423240n8k extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ TemplateFavoriteResponse LL;
    public final /* synthetic */ C1423230n8j LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ C1419590n2r LLILZ;
    public final /* synthetic */ Function1<Boolean, Unit> LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ long LLIZ;
    public final /* synthetic */ int LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1423240n8k(TemplateFavoriteResponse templateFavoriteResponse, C1423230n8j c1423230n8j, boolean z, C1419590n2r c1419590n2r, Function1<? super Boolean, Unit> function1, String str, long j, int i, InterfaceC1364105Vn<? super C1423240n8k> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = templateFavoriteResponse;
        this.LLILLJJLI = c1423230n8j;
        this.LLILLL = z;
        this.LLILZ = c1419590n2r;
        this.LLILZIL = function1;
        this.LLILZLL = str;
        this.LLIZ = j;
        this.LLIZLLLIL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1423240n8k(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int i;
        int iIntValue;
        int i2;
        List<Pair<C1419590n2r, Boolean>> list;
        List<C1419590n2r> listOv;
        C1C7U.LIZ("TemplateCoreComponent@d4ef.templateFavorite$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Integer num = this.LL.status_code;
        if (num != null && num.intValue() == 0) {
            C1389880mGw c1389880mGw = new C1389880mGw(this.LLILLJJLI.LL);
            if (this.LLILLL) {
                i2 = 2131834028;
            } else {
                i2 = 2131834029;
            }
            c1389880mGw.LJIIIIZZ(i2);
            c1389880mGw.LJIIJ();
            this.LLILZ.LIZ.getBusiness_extra().set_favorite(Boolean.valueOf(this.LLILLL));
            List<TemplateCategoryData> listT = this.LLILLJJLI.t();
            C1423230n8j c1423230n8j = this.LLILLJJLI;
            int i3 = this.LLIZLLLIL;
            boolean z = this.LLILLL;
            String str = this.LLILZLL;
            for (TemplateCategoryData templateCategoryData : listT) {
                if (!C1423570n9H.LIZJ(templateCategoryData) && (listOv = c1423230n8j.LLILZIL.LIZ.Ov((CATEGORY) templateCategoryData)) != null) {
                    if (Intrinsics.LJFF(templateCategoryData, c1423230n8j.Y8())) {
                        C1419590n2r c1419590n2r = (C1419590n2r) C13LP.LJJJLZIJ(i3, listOv);
                        if (c1419590n2r != null) {
                            c1419590n2r.LIZ.getBusiness_extra().set_favorite(Boolean.valueOf(z));
                        }
                    } else {
                        for (C1419590n2r c1419590n2r2 : listOv) {
                            if (Intrinsics.LJFF(c1419590n2r2.LIZ.getResource_id(), str)) {
                                c1419590n2r2.LIZ.getBusiness_extra().set_favorite(Boolean.valueOf(z));
                            }
                        }
                    }
                }
            }
            Iterator<TemplateCategoryData> it2 = this.LLILLJJLI.t().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (C1423570n9H.LIZJ((TemplateCategoryData) next)) {
                    if (next != null) {
                        C1423230n8j c1423230n8j2 = this.LLILLJJLI;
                        C1419590n2r c1419590n2r3 = this.LLILZ;
                        boolean z2 = this.LLILLL;
                        if (c1423230n8j2.LLILZIL.LIZ.Ov((CATEGORY) next) != null) {
                            C1423350n8v c1423350n8vG2 = c1423230n8j2.G2();
                            if (c1423350n8vG2 != null && (list = c1423350n8vG2.LJI) != null) {
                                ((ArrayList) list).add(new Pair(c1419590n2r3, Boolean.valueOf(z2)));
                            }
                            if (!c1423230n8j2.LLJI) {
                                c1423230n8j2.iE0(null);
                            }
                        }
                    }
                }
            }
        } else {
            this.LLILZIL.invoke(Boolean.valueOf(!this.LLILLL));
            C1389880mGw c1389880mGw2 = new C1389880mGw(this.LLILLJJLI.LL);
            if (num != null && num.intValue() == 1) {
                i = 2131834040;
            } else {
                i = 2131834034;
            }
            c1389880mGw2.LJIIIIZZ(i);
            c1389880mGw2.LJIIJ();
        }
        this.LLILLJJLI.LLJ.remove(this.LLILZLL);
        C1419580n2q c1419580n2q = C1419580n2q.LIZ;
        String str2 = this.LLILZLL;
        boolean z3 = this.LLILLL;
        long jCurrentTimeMillis = System.currentTimeMillis() - this.LLIZ;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = -1;
        }
        c1419580n2q.getClass();
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("resource_id", str2);
        c0lab.LJ("enter_from", "template_tab");
        c0lab.LIZ(z3, "to_status");
        c0lab.LIZIZ(jCurrentTimeMillis, "duration");
        c0lab.LIZ(iIntValue, "status_code");
        C20684815ws.LJIILLIIL("template_favorite_api_performance", c0lab.LIZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TemplateCoreComponent@d4ef.templateFavorite$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

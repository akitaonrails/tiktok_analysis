package X;

import android.content.Context;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateItem;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0v4M, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.utils.TemplateDisplayHelper$doDisplayTemplate$imageFilepath$1", f = "TemplateDisplayHelper.kt", l = {163, 166}, m = "invokeSuspend")
public final class C1728040v4M extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super String>, Object> {
    public int LL;
    public final /* synthetic */ ViewGroup LLILLJJLI;
    public final /* synthetic */ TemplateItem LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ List<TemplateItem> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1728040v4M(ViewGroup viewGroup, TemplateItem templateItem, boolean z, boolean z2, List<TemplateItem> list, InterfaceC1364105Vn<? super C1728040v4M> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = viewGroup;
        this.LLILLL = templateItem;
        this.LLILZ = z;
        this.LLILZIL = z2;
        this.LLILZLL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1728040v4M(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("TemplateDisplayHelper@870b.doDisplayTemplate$imageFilepath$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    C1C7U.LIZIZ("TemplateDisplayHelper@870b.doDisplayTemplate$imageFilepath$1");
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C1731360v9i c1731360v9i = C1731360v9i.LIZ;
            ViewGroup viewGroup = this.LLILLJJLI;
            TemplateItem templateItem = this.LLILLL;
            this.LL = 1;
            obj = c1731360v9i.LJIIIIZZ(viewGroup, templateItem, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("TemplateDisplayHelper@870b.doDisplayTemplate$imageFilepath$1");
                return objLJFF;
            }
        }
        String str = (String) obj;
        if (!this.LLILZ && !this.LLILZIL) {
            obj = C1731360v9i.LIZ(str);
        } else {
            C1731360v9i c1731360v9i2 = C1731360v9i.LIZ;
            Context context = this.LLILLJJLI.getContext();
            List<TemplateItem> list = this.LLILZLL;
            this.LL = 2;
            obj = c1731360v9i2.LIZLLL(context, list, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("TemplateDisplayHelper@870b.doDisplayTemplate$imageFilepath$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("TemplateDisplayHelper@870b.doDisplayTemplate$imageFilepath$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super String> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

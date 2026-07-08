package X;

import com.bytedance.als.h0;
import com.ss.android.ugc.aweme.tools.mvtemplate.search.TemplateSearchTrendingItem;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0ViL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.mvtemplate.search.datasource.TemplateTrendingCacheManager$maybeStartLoad$1$1", f = "TemplateTrendingCacheManager.kt", l = {}, m = "invokeSuspend")
public final class C805230ViL extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ List<TemplateSearchTrendingItem> LL;
    public final /* synthetic */ C1422960n8I LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C805230ViL(List<TemplateSearchTrendingItem> list, C1422960n8I c1422960n8I, InterfaceC1364105Vn<? super C805230ViL> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = list;
        this.LLILLJJLI = c1422960n8I;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C805230ViL(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TemplateTrendingCacheManager@2c89.maybeStartLoad$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        List<TemplateSearchTrendingItem> list = this.LL;
        if (list != null && !list.isEmpty()) {
            this.LLILLJJLI.LIZIZ.LJII(new C788600Uwc(this.LL));
            this.LLILLJJLI.LIZJ(this.LL);
        } else {
            h0<AbstractC788620Uwe> h0Var = this.LLILLJJLI.LIZIZ;
            final IllegalStateException illegalStateException = new IllegalStateException("empty trending result");
            h0Var.LJII(new AbstractC788620Uwe(illegalStateException) { // from class: X.0Uwb
                public final Throwable LIZ;

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    return (obj2 instanceof C788590Uwb) && Intrinsics.LJFF(this.LIZ, ((C788590Uwb) obj2).LIZ);
                }

                public final int hashCode() {
                    return this.LIZ.hashCode();
                }

                public final String toString() {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Failed(throwable=");
                    sbLIZ.append(this.LIZ);
                    sbLIZ.append(')');
                    return C2188811AlT.LIZIZ(sbLIZ);
                }

                {
                    this.LIZ = illegalStateException;
                }
            });
            this.LLILLJJLI.LIZJ(C13BV.INSTANCE);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TemplateTrendingCacheManager@2c89.maybeStartLoad$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

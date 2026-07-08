package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0lht, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sharepanel.impl.relations.data.core.SupportSearchRelationModel$doRealSearchWithSDK$1$2", f = "SupportSearchRelationModel.kt", l = {}, m = "invokeSuspend")
public final class C1368150lht extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ AbstractC1368180lhw LL;
    public final /* synthetic */ List<IMContact> LLILLJJLI;
    public final /* synthetic */ C259800zU<String> LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ double LLILZIL;
    public final /* synthetic */ double LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1368150lht(AbstractC1368180lhw abstractC1368180lhw, List<IMContact> list, C259800zU<String> c259800zU, int i, double d, double d2, InterfaceC1364105Vn<? super C1368150lht> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = abstractC1368180lhw;
        this.LLILLJJLI = list;
        this.LLILLL = c259800zU;
        this.LLILZ = i;
        this.LLILZIL = d;
        this.LLILZLL = d2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1368150lht(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Unit unit;
        C1C7U.LIZ("SupportSearchRelationModel@b348.doRealSearchWithSDK$1$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC1368140lhs interfaceC1368140lhs = this.LL.LLJIJIL;
        if (interfaceC1368140lhs != null) {
            interfaceC1368140lhs.bK(this.LLILLJJLI, this.LLILLL.element, C2286608xc.LJ(this.LLILZ), C2286608xc.LIZJ(this.LLILZIL), C2286608xc.LIZJ(this.LLILZLL));
            unit = Unit.LIZ;
        } else {
            unit = null;
        }
        C1C7U.LIZIZ("SupportSearchRelationModel@b348.doRealSearchWithSDK$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

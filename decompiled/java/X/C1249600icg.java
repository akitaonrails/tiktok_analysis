package X;

import com.ss.android.ugc.profile.business.profile.menu.business.content.search.SearchActionComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0icg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.profile.menu.business.content.search.SearchActionComponent$initSearchEntrance$1$3$onTextChanged$1", f = "SearchActionComponent.kt", l = {197}, m = "invokeSuspend")
public final class C1249600icg extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C259800zU LL;
    public int LLILLJJLI;
    public final /* synthetic */ SearchActionComponent LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1249600icg(SearchActionComponent searchActionComponent, String str, InterfaceC1364105Vn<? super C1249600icg> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = searchActionComponent;
        this.LLILZ = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1249600icg(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C259800zU c259800zU;
        C1C7U.LIZ("SearchActionComponent@3a4.initSearchEntrance$1$3$onTextChanged$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                c259800zU = this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            c259800zU = new C259800zU();
            C1DFH c1dfh = C0PEM.LIZ;
            C1249590icf c1249590icf = new C1249590icf(c259800zU, this.LLILLL, this.LLILZ, null);
            this.LL = c259800zU;
            this.LLILLJJLI = 1;
            if (C23250099c.LJI(this, c1dfh, c1249590icf) == objLJFF) {
                C1C7U.LIZIZ("SearchActionComponent@3a4.initSearchEntrance$1$3$onTextChanged$1");
                return objLJFF;
            }
        }
        C1249660icm c1249660icm = (C1249660icm) c259800zU.element;
        if (c1249660icm != null) {
            this.LLILLL.Wp(c1249660icm);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SearchActionComponent@3a4.initSearchEntrance$1$3$onTextChanged$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

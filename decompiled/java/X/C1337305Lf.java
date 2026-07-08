package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.relation.fragment.muflist.MufListPageViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS133S1100000_19;
import njp.a;

/* JADX INFO: renamed from: X.05Lf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.fragment.muflist.MufListPageViewModel$onSearchTextChanged$2", f = "MufListPageViewModel.kt", l = {518}, m = "invokeSuspend")
public final class C1337305Lf extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ MufListPageViewModel LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1337305Lf(MufListPageViewModel mufListPageViewModel, String str, InterfaceC1364105Vn<? super C1337305Lf> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = mufListPageViewModel;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1337305Lf(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("MufListPageViewModel@1fa1.onSearchTextChanged$2");
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
            MufListPageViewModel mufListPageViewModel = this.LLILLJJLI;
            C2232408os c2232408os = mufListPageViewModel.LLILZLL;
            C1337205Le c1337205Le = new C1337205Le(mufListPageViewModel, this.LLILLL, null);
            this.LL = 1;
            obj = C23250099c.LJI(this, c2232408os, c1337205Le);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("MufListPageViewModel@1fa1.onSearchTextChanged$2");
                return objLJFF;
            }
        }
        List list = (List) obj;
        this.LLILLJJLI.setState(new AwS133S1100000_19(this.LLILLL, (String) list, (List<IMUser>) 9));
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("search:[");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append("] result(");
        sbLIZ.append(list.size());
        sbLIZ.append(')');
        C1720106oR.LJI("MUF-LIST VM", C2188811AlT.LIZIZ(sbLIZ));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MufListPageViewModel@1fa1.onSearchTextChanged$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

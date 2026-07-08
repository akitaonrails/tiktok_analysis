package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.relation.fragment.muflist.MufListPageViewModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Lb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.fragment.muflist.MufListPageViewModel$1$1", f = "MufListPageViewModel.kt", l = {}, m = "invokeSuspend")
public final class C1336905Lb extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ MufListPageViewModel LL;
    public final /* synthetic */ List<IMUser> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1336905Lb(MufListPageViewModel mufListPageViewModel, List<? extends IMUser> list, InterfaceC1364105Vn<? super C1336905Lb> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = mufListPageViewModel;
        this.LLILLJJLI = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1336905Lb(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MufListPageViewModel@1fa1.<init>$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        ((ArrayList) this.LL.LLILZIL).addAll(this.LLILLJJLI);
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("local friend list(");
        sbLIZ.append(((ArrayList) this.LL.LLILZIL).size());
        sbLIZ.append(')');
        C1720106oR.LJI("MUF-LIST VM", C2188811AlT.LIZIZ(sbLIZ));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MufListPageViewModel@1fa1.<init>$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

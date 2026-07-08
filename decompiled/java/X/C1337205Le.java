package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.relation.fragment.muflist.MufListPageViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Le, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.fragment.muflist.MufListPageViewModel$onSearchTextChanged$2$result$1", f = "MufListPageViewModel.kt", l = {}, m = "invokeSuspend")
public final class C1337205Le extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<IMUser>>, Object> {
    public final /* synthetic */ MufListPageViewModel LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1337205Le(MufListPageViewModel mufListPageViewModel, String str, InterfaceC1364105Vn<? super C1337205Le> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = mufListPageViewModel;
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1337205Le(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MufListPageViewModel@1fa1.onSearchTextChanged$2$result$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        List listLJIIJ = C1336205Ku.LIZ(false).getImUserService().LJIIJ(this.LLILLJJLI, this.LL.LLILZIL);
        C1C7U.LIZIZ("MufListPageViewModel@1fa1.onSearchTextChanged$2$result$1");
        return listLJIIJ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<IMUser>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

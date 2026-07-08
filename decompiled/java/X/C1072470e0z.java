package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.relation.usercard.vm.UserCardListViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0e0z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.usercard.vm.UserCardListViewModel$updateRequestParams$1", f = "UserCardListViewModel.kt", l = {538}, m = "invokeSuspend")
public final class C1072470e0z extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C1DEV LL;
    public UserCardListViewModel LLILLJJLI;
    public Object LLILLL;
    public Object LLILZ;
    public Object LLILZIL;
    public int LLILZLL;
    public final /* synthetic */ UserCardListViewModel LLIZ;
    public final /* synthetic */ List<EnumC1070410dxf> LLIZLLLIL;
    public final /* synthetic */ String LLJ;
    public final /* synthetic */ String LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1072470e0z(UserCardListViewModel userCardListViewModel, List<? extends EnumC1070410dxf> list, String str, String str2, InterfaceC1364105Vn<? super C1072470e0z> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLIZ = userCardListViewModel;
        this.LLIZLLLIL = list;
        this.LLJ = str;
        this.LLJI = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1072470e0z(this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        UserCardListViewModel userCardListViewModel;
        C1DEV c1dev;
        List<EnumC1070410dxf> list;
        String str;
        String str2;
        C1C7U.LIZ("UserCardListViewModel@982.updateRequestParams$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILZLL;
        if (i != 0) {
            if (i == 1) {
                str2 = (String) this.LLILZIL;
                str = (String) this.LLILZ;
                list = (List) this.LLILLL;
                userCardListViewModel = this.LLILLJJLI;
                c1dev = this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            userCardListViewModel = this.LLIZ;
            c1dev = userCardListViewModel.LLJILLL;
            list = this.LLIZLLLIL;
            str = this.LLJ;
            str2 = this.LLJI;
            this.LL = c1dev;
            this.LLILLJJLI = userCardListViewModel;
            this.LLILLL = list;
            this.LLILZ = str;
            this.LLILZIL = str2;
            this.LLILZLL = 1;
            if (c1dev.LIZLLL(null, this) == objLJFF) {
                C1C7U.LIZIZ("UserCardListViewModel@982.updateRequestParams$1");
                return objLJFF;
            }
        }
        try {
            userCardListViewModel.yQ2().LJJIFFI(str, str2, list);
            c1dev.LIZIZ(null);
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("UserCardListViewModel@982.updateRequestParams$1");
            return unit;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c1dev.LIZIZ(null);
            throw th;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

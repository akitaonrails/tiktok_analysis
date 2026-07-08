package X;

import android.content.Context;
import com.ss.android.ugc.aweme.authorize.viewmodel.AuthCommonViewModel;
import com.ss.android.ugc.aweme.openauthorize.entity.AuthCodeResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.19HD, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
@C09DV(c = "com.ss.android.ugc.aweme.authorize.viewmodel.AuthCommonViewModel$requestAuthCode$1", f = "AuthCommonViewModel.kt", l = {113}, m = "invokeSuspend")
public final class C19HD extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AuthCommonViewModel LLILLJJLI;
    public final /* synthetic */ C1B3S LLILLL;
    public final /* synthetic */ boolean LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19HD(AuthCommonViewModel authCommonViewModel, C1B3S c1b3s, boolean z, InterfaceC1364105Vn<? super C19HD> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = authCommonViewModel;
        this.LLILLL = c1b3s;
        this.LLILZ = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C19HD(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AuthCommonViewModel@f0d8.requestAuthCode$1");
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
            AuthCommonViewModel authCommonViewModel = this.LLILLJJLI;
            C1B38 c1b38 = authCommonViewModel.LLILLL;
            Context contextM3 = C786410Ut5.M3(authCommonViewModel.getApplication());
            C1B3S c1b3s = this.LLILLL;
            C1B3J c1b3j = this.LLILLJJLI.LLILLJJLI;
            boolean z = this.LLILZ;
            this.LL = 1;
            c1b38.getClass();
            obj = C1B3I.LIZ.LIZ(contextM3, c1b3s, c1b3j, z, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("AuthCommonViewModel@f0d8.requestAuthCode$1");
                return objLJFF;
            }
        }
        this.LLILLJJLI.LLJJI.postValue((AuthCodeResponse) obj);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AuthCommonViewModel@f0d8.requestAuthCode$1");
        return unit;
    }
}

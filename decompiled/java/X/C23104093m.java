package X;

import Y.AObserverS168S0200000_3;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.account.oneclicklogin.OneClickLoginService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS369S0200000_3;
import njp.a;

/* JADX INFO: renamed from: X.093m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.account.oneclicklogin.OneClickLoginService$waitForOclData$1$1", f = "OneClickLoginService.kt", l = {988}, m = "invokeSuspend")
public final class C23104093m extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C0XHP>, Object> {
    public int LL;
    public final /* synthetic */ OneClickLoginService LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23104093m(OneClickLoginService oneClickLoginService, InterfaceC1364105Vn<? super C23104093m> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = oneClickLoginService;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C23104093m(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("OneClickLoginService@601d.waitForOclData$1$1");
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
            OneClickLoginService oneClickLoginService = this.LLILLJJLI;
            this.LL = 1;
            C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(this));
            c2252611DEt.LJIJJ();
            MutableLiveData mutableLiveDataLJIIZILJ = oneClickLoginService.LJIIZILJ();
            AObserverS168S0200000_3 aObserverS168S0200000_3 = new AObserverS168S0200000_3(mutableLiveDataLJIIZILJ, c2252611DEt, 2);
            mutableLiveDataLJIIZILJ.observeForever(aObserverS168S0200000_3);
            c2252611DEt.LJJII(new AwS369S0200000_3(mutableLiveDataLJIIZILJ, aObserverS168S0200000_3, 3));
            obj = c2252611DEt.LJIJ();
            if (obj == C099R.LJFF()) {
                C099Q.LIZJ(this);
            }
            if (obj == objLJFF) {
                C1C7U.LIZIZ("OneClickLoginService@601d.waitForOclData$1$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("OneClickLoginService@601d.waitForOclData$1$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C0XHP> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

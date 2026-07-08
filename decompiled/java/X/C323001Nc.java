package X;

import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.privacy.cell.BlockedAccountsVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01Nc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.privacy.cell.BlockedAccountsVM$onStateChanged$1", f = "BlockedAccountsVM.kt", l = {29}, m = "invokeSuspend")
public final class C323001Nc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ BlockedAccountsVM LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C323001Nc(BlockedAccountsVM blockedAccountsVM, InterfaceC1364105Vn<? super C323001Nc> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = blockedAccountsVM;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C323001Nc(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objLJI;
        C1C7U.LIZ("BlockedAccountsVM@49ab.onStateChanged$1");
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
            BlockedAccountsVM blockedAccountsVM = this.LLILLJJLI;
            this.LL = 1;
            blockedAccountsVM.getClass();
            C01GW c01gw = C215900sP.LIZ;
            if (((Number) c01gw.getValue()).intValue() != 1 && ((Number) c01gw.getValue()).intValue() != 2) {
                objLJI = Unit.LIZ;
            } else {
                objLJI = C23250099c.LJI(this, C0PEM.LIZJ, new C323101Nd(blockedAccountsVM, null));
            }
            if (objLJI == objLJFF) {
                C1C7U.LIZIZ("BlockedAccountsVM@49ab.onStateChanged$1");
                return objLJFF;
            }
        }
        this.LLILLJJLI.LLILZ = false;
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BlockedAccountsVM@49ab.onStateChanged$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.setting.model.BlackList;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.privacy.cell.BlockedAccountsVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01Nd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.privacy.cell.BlockedAccountsVM$updateBlockedAccountRightLabel$2", f = "BlockedAccountsVM.kt", l = {}, m = "invokeSuspend")
public final class C323101Nd extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ BlockedAccountsVM LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C323101Nd(BlockedAccountsVM blockedAccountsVM, InterfaceC1364105Vn<? super C323101Nd> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = blockedAccountsVM;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C323101Nd c323101Nd = new C323101Nd(this.LLILLJJLI, interfaceC1364105Vn);
        c323101Nd.LL = obj;
        return c323101Nd;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C1C7U.LIZ("BlockedAccountsVM@49ab.updateBlockedAccountRightLabel$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            c098200Yq = C313180CPk.LIZ(0, 1);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Unit unit = null;
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        BlackList blackList = (BlackList) c098200Yq;
        if (blackList != null) {
            this.LLILLJJLI.setState(new C5183020f(blackList, 381));
            unit = Unit.LIZ;
        }
        C1C7U.LIZIZ("BlockedAccountsVM@49ab.updateBlockedAccountRightLabel$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

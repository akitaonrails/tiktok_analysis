package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS221S0000000_31;

/* JADX INFO: renamed from: X.15Ww, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20534815Ww implements InterfaceC586170Myt {
    public static final C20534815Ww LL;
    public static final C01GW LLILLJJLI;
    public static final C01GW LLILLL;

    static {
        IAccountService iAccountService;
        C20534815Ww c20534815Ww = new C20534815Ww();
        LL = c20534815Ww;
        if (C1159760gHm.LIZ().enable && (iAccountService = (IAccountService) PluggableExtentionKt.pluggableSpi$default(IAccountService.class, false, false, false, 14, null)) != null) {
            iAccountService.LJIILL(c20534815Ww);
        }
        LLILLJJLI = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(418));
        LLILLL = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(417));
    }

    public static AbstractC1511510pR7 LIZ() {
        C1510230pP3 c1510230pP3 = new C1510230pP3("enter_chat_predict");
        c1510230pP3.LIZIZ = C1159760gHm.LIZ();
        return C1511420pQy.LIZ().LIZ("enter_chat_predict", c1510230pP3);
    }

    @Override // X.InterfaceC586170Myt
    public final void onAccountResult(int i, boolean z, int i2, User user) {
        try {
            ((C823170WQx) LLILLJJLI.getValue()).clear();
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }
}

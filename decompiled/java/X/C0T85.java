package X;

import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0T85, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0T85 {
    public static void LIZ(final InterfaceC20658015sY interfaceC20658015sY, final String str, final Function2 function2) {
        Object c098200Yq;
        try {
            PopupManager.LJIJI(new AbstractC20660815t0(interfaceC20658015sY, str, function2) { // from class: X.0T86
                public static final /* synthetic */ int LLILZ = 0;
                public final int LL = 221;
                public final String LLILLJJLI;
                public final Function2<C688120Qyw, C20656615sK, Unit> LLILLL;

                @Override // X.AbstractC20656215sG
                public final C0T87 getPopupExtraParams() {
                    return new C0T87(this.LLILLJJLI);
                }

                @Override // X.InterfaceC20660515sx
                public final int getPriority() {
                    return this.LL;
                }

                @Override // X.InterfaceC20659015si
                public final void LJFF(C688120Qyw c688120Qyw, C20656615sK c20656615sK) {
                    this.LLILLL.invoke(c688120Qyw, c20656615sK);
                }

                {
                    this.LLILLJJLI = str;
                    this.LLILLL = function2;
                }
            }, true);
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            function2.invoke(null, null);
        }
    }
}

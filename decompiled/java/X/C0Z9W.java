package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Z9W, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Z9W extends C1619110sEf implements InterfaceC19330810jy {
    public final Function0<Unit> LL;
    public InterfaceC539120LCk LLILLJJLI;
    public final int[] LLILLL = {2436};

    @Override // X.InterfaceC19330810jy
    public final boolean LIZLLL(InnerPushMessage innerPushMessage) {
        return false;
    }

    @Override // X.InterfaceC19330810jy
    public final boolean LJFF(InnerPushMessage innerPushMessage) {
        return true;
    }

    @Override // X.InterfaceC19330810jy
    public final boolean LJI(InnerPushMessage innerPushMessage) {
        return true;
    }

    @Override // X.InterfaceC19330810jy
    public final int[] LIZJ() {
        return this.LLILLL;
    }

    public C0Z9W(Function0<Unit> function0) {
        this.LL = function0;
    }

    @Override // X.C1619110sEf, X.InterfaceC20643015q8
    public final void LIZIZ(InnerPushMessage innerPushMessage) {
        ILiveOuterService iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
        if (iLiveOuterService != null) {
            iLiveOuterService.qj();
        }
        ILiveOuterService iLiveOuterService2 = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
        if (iLiveOuterService2 != null) {
            iLiveOuterService2.Y3(null, null);
        }
    }

    @Override // X.InterfaceC19330810jy
    public final boolean LIZ(int i, InnerPushMessage innerPushMessage) {
        this.LL.invoke();
        InterfaceC539120LCk interfaceC539120LCk = this.LLILLJJLI;
        if (interfaceC539120LCk != null) {
            interfaceC539120LCk.LIZIZ("user click", null, false);
        }
        if (innerPushMessage != null) {
            C1908480zlO.LIZIZ.LJII(C18JY.CLICK, innerPushMessage, "click", i);
            return true;
        }
        return true;
    }

    @Override // X.InterfaceC19330810jy
    public final C20663815tU LJIIIZ(C20663515tR c20663515tR, InnerPushMessage innerPushMessage) {
        this.LLILLJJLI = c20663515tR;
        return null;
    }
}

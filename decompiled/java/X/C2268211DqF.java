package X;

import android.view.View;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1DqF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2268211DqF extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C2268141Dq8 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2268211DqF(C2268141Dq8 c2268141Dq8) {
        super(0);
        this.LL = c2268141Dq8;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        DataChannel dataChannel = this.LL.LIZ;
        C15CK c15ck = dataChannel != null ? (C15CK) dataChannel.gg0(C769520UGo.class) : null;
        boolean z = false;
        if (c15ck == null) {
            String str = this.LL.LJFF;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("removeFromParent, scene:");
            this.LL.getClass();
            sbLIZ.append("");
            sbLIZ.append(", isLinkMicLayoutStart:");
            sbLIZ.append(this.LL.LJI);
            sbLIZ.append(", startFlag: ");
            sbLIZ.append(this.LL.LJI);
            sbLIZ.append(", anchorRTCView: ");
            sbLIZ.append((String) null);
            sbLIZ.append(", result:");
            sbLIZ.append(false);
            C20441214yg.LIZIZ(str, C2188811AlT.LIZIZ(sbLIZ));
        } else {
            try {
                C2268141Dq8 c2268141Dq8 = this.LL;
                if (c2268141Dq8.LJI && c15ck.LIZIZ(c2268141Dq8)) {
                    C500260Jjc.LJJJLL(c15ck.LIZIZ);
                    z = true;
                }
                String str2 = this.LL.LJFF;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("removeFromParent, scene:");
                this.LL.getClass();
                sbLIZ2.append("");
                sbLIZ2.append(", isLinkMicLayoutStart:");
                sbLIZ2.append(this.LL.LJI);
                sbLIZ2.append(", startFlag: ");
                sbLIZ2.append(this.LL.LJI);
                sbLIZ2.append(", anchorRTCView: ");
                View view = c15ck.LIZIZ;
                sbLIZ2.append(view != null ? C500260Jjc.LJIIL(view) : null);
                sbLIZ2.append(", result:");
                sbLIZ2.append(z);
                C20441214yg.LIZIZ(str2, C2188811AlT.LIZIZ(sbLIZ2));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                String str3 = this.LL.LJFF;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("removeFromParent, scene:");
                this.LL.getClass();
                sbLIZ3.append("");
                sbLIZ3.append(", isLinkMicLayoutStart:");
                sbLIZ3.append(this.LL.LJI);
                sbLIZ3.append(", startFlag: ");
                sbLIZ3.append(this.LL.LJI);
                sbLIZ3.append(", anchorRTCView: ");
                View view2 = c15ck.LIZIZ;
                sbLIZ3.append(view2 != null ? C500260Jjc.LJIIL(view2) : null);
                sbLIZ3.append(", result:");
                sbLIZ3.append(false);
                C20441214yg.LIZIZ(str3, C2188811AlT.LIZIZ(sbLIZ3));
                throw th;
            }
        }
        return Unit.LIZ;
    }
}

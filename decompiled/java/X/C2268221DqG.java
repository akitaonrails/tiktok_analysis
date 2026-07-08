package X;

import android.view.View;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1DqG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2268221DqG extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C2268141Dq8 LL;
    public final /* synthetic */ boolean LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2268221DqG(C2268141Dq8 c2268141Dq8, boolean z) {
        super(0);
        this.LL = c2268141Dq8;
        this.LLILLJJLI = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        DataChannel dataChannel = this.LL.LIZ;
        C15CK c15ck = dataChannel != null ? (C15CK) dataChannel.gg0(C769520UGo.class) : null;
        if (c15ck == null) {
            String str = this.LL.LJFF;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("setVisible, scene:");
            this.LL.getClass();
            sbLIZ.append("");
            sbLIZ.append(", startFlag: ");
            sbLIZ.append(this.LL.LJI);
            sbLIZ.append(", visible:");
            sbLIZ.append(this.LLILLJJLI);
            sbLIZ.append(", anchorRTCView: ");
            sbLIZ.append((String) null);
            sbLIZ.append(", result:");
            sbLIZ.append(false);
            C20441214yg.LIZIZ(str, C2188811AlT.LIZIZ(sbLIZ));
        } else {
            try {
                C2268141Dq8 c2268141Dq8 = this.LL;
                boolean zLJ = c2268141Dq8.LJI ? c15ck.LJ(c2268141Dq8, this.LLILLJJLI) : false;
                String str2 = this.LL.LJFF;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("setVisible, scene:");
                this.LL.getClass();
                sbLIZ2.append("");
                sbLIZ2.append(", startFlag: ");
                sbLIZ2.append(this.LL.LJI);
                sbLIZ2.append(", visible:");
                sbLIZ2.append(this.LLILLJJLI);
                sbLIZ2.append(", anchorRTCView: ");
                View view = c15ck.LIZIZ;
                sbLIZ2.append(view != null ? C500260Jjc.LJIIL(view) : null);
                sbLIZ2.append(", result:");
                sbLIZ2.append(zLJ);
                C20441214yg.LIZIZ(str2, C2188811AlT.LIZIZ(sbLIZ2));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                String str3 = this.LL.LJFF;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("setVisible, scene:");
                this.LL.getClass();
                sbLIZ3.append("");
                sbLIZ3.append(", startFlag: ");
                sbLIZ3.append(this.LL.LJI);
                sbLIZ3.append(", visible:");
                sbLIZ3.append(this.LLILLJJLI);
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

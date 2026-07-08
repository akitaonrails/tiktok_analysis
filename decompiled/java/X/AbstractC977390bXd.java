package X;

import com.bytedance.android.live.liveinteract.multimatch.widget.MatchBaseWidget;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleInfoResponse;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0bXd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public abstract class AbstractC977390bXd implements InterfaceC977420bXg {
    public boolean LL;
    public C975960bVK LLILLJJLI;
    public MatchBaseWidget LLILLL;

    @Override // X.InterfaceC977420bXg
    public void LIZJ(AbstractC986700bme abstractC986700bme) {
    }

    public abstract void LJI(C975960bVK c975960bVK);

    @Override // X.InterfaceC977420bXg
    public final void LJII(BattleInfoResponse battleInfoResponse) {
    }

    @Override // X.InterfaceC977420bXg
    public void reset() {
        this.LL = false;
    }

    @Override // X.InterfaceC977430bXh
    public void onUnload() {
        List<AbstractC977390bXd> list;
        MatchBaseWidget matchBaseWidget = this.LLILLL;
        if (matchBaseWidget != null && (list = matchBaseWidget.LLILLL) != null) {
            ((ArrayList) list).remove(this);
        }
        this.LLILLL = null;
        this.LL = false;
    }

    @Override // X.InterfaceC977430bXh
    public void LIZLLL(MatchBaseWidget matchBaseWidget) {
        this.LLILLL = matchBaseWidget;
        ((ArrayList) matchBaseWidget.LLILLL).add(this);
    }

    @Override // X.InterfaceC977420bXg
    public final void LJFF(C975960bVK c975960bVK) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("start show, currentMatchModel = ");
        sbLIZ.append(c975960bVK);
        C20441214yg.LIZIZ("AfterAnimEndShowMatchComponent", C2188811AlT.LIZIZ(sbLIZ));
        this.LLILLJJLI = c975960bVK;
        if (this.LL) {
            LJI(c975960bVK);
        } else {
            dismiss();
        }
    }
}

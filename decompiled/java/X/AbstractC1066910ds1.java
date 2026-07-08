package X;

import android.app.Activity;
import android.app.Dialog;
import android.view.View;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import java.util.List;

/* JADX INFO: renamed from: X.0ds1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public abstract class AbstractC1066910ds1 implements InterfaceC1393560mMs {
    public InterfaceC1392640mLO LL;
    public int LLILLJJLI = 100;
    public String LLILLL = "";
    public boolean LLILZ;
    public boolean LLILZIL;
    public boolean LLILZLL;

    public boolean LJIIL() {
        return false;
    }

    @Override // X.InterfaceC1393560mMs
    public void LJJJIL(C712520RxC c712520RxC, InterfaceC705550Rlx interfaceC705550Rlx, InterfaceC1050330dRH interfaceC1050330dRH) {
    }

    @Override // X.InterfaceC1393560mMs
    public void LJJJJZ() {
    }

    @Override // X.InterfaceC1393560mMs
    public void LJJJLIIL(C712520RxC c712520RxC, Dialog dialog, boolean z, boolean z2, boolean z3) {
    }

    @Override // X.InterfaceC1393560mMs
    public void LJJJLL(View view, C2344009Gk c2344009Gk) {
    }

    @Override // X.InterfaceC1393560mMs
    public void LJJJLZIJ(C2344009Gk c2344009Gk, boolean z) {
    }

    @Override // X.InterfaceC1393560mMs
    public final void LJJL() {
    }

    @Override // X.InterfaceC1393560mMs
    public int LJJLI() {
        return (((AbstractC1066890drz) this).LLIZ == null ? 1 : 0) ^ 1;
    }

    @Override // X.InterfaceC1393560mMs
    public void LJJLIIIJ(C712520RxC c712520RxC, String str, boolean z) {
    }

    @Override // X.InterfaceC1393560mMs
    public void onBind() {
    }

    @Override // X.InterfaceC1393560mMs
    public void yg(Activity activity, Dialog dialog) {
    }

    @Override // X.InterfaceC1393560mMs
    public final InterfaceC1392640mLO LJII() {
        InterfaceC1392640mLO interfaceC1392640mLO = this.LL;
        if (interfaceC1392640mLO == null) {
            return null;
        }
        return interfaceC1392640mLO;
    }

    @Override // X.InterfaceC1393560mMs
    public InterfaceC1392590mLJ LJJJJJL() {
        return new C1065100dp6(this.LLILLL);
    }

    @Override // X.InterfaceC1393560mMs
    public final int priority() {
        if (LJIIL()) {
            return -1;
        }
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC1393560mMs
    public final boolean LJJJJL() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC1393560mMs
    public final boolean LJJLIIIIJ() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC1393560mMs
    public final boolean LJJLIIIJILLIZJL() {
        return this.LLILZIL;
    }

    public final void LJIILIIL(AnchorCommonStruct anchorCommonStruct) {
        InterfaceC1392640mLO interfaceC1392640mLO = this.LL;
        Integer numValueOf = null;
        if (interfaceC1392640mLO == null) {
            interfaceC1392640mLO = null;
        }
        List<AnchorCommonStruct> anchors = interfaceC1392640mLO.LJJLIIIJJIZ().getAnchors();
        if (anchors != null) {
            numValueOf = Integer.valueOf(anchors.indexOf(anchorCommonStruct));
        }
        String logExtra = anchorCommonStruct.getLogExtra();
        if (logExtra == null) {
            logExtra = "";
        }
        this.LLILLL = logExtra;
        if (numValueOf != null && numValueOf.intValue() != -1) {
            this.LLILLJJLI = numValueOf.intValue();
        } else {
            this.LLILLJJLI = 100;
        }
    }

    @Override // X.InterfaceC1393560mMs
    public void LJJJJ(C712520RxC c712520RxC) {
        this.LL = c712520RxC;
    }
}

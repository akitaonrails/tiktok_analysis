package X;

import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS254S0300000_10;
import kotlin.jvm.internal.AwS411S0200000_10;
import kotlin.jvm.internal.AwS554S0100000_10;

/* JADX INFO: renamed from: X.0PjF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC652910PjF extends AbstractC652340PiK implements InterfaceC652960PjK, InterfaceC645410PTf {
    public final InterfaceC652950PjJ LLILLL;
    public final C01GW LLILZ;
    public String LLILZIL;
    public List<? extends Aweme> LLILZLL;
    public final C01GW LLIZ;
    public final C01GW LLIZLLLIL;
    public final C01GW LLJ;

    @Override // X.InterfaceC648350Pbt
    public final boolean L0() {
        return true;
    }

    public boolean LJIIJ() {
        return true;
    }

    @Override // X.InterfaceC648270Pbl
    public final void LJJJJ() {
    }

    @Override // X.InterfaceC648350Pbt
    public final void LJJLIIIJLLLLLLLZ() {
    }

    @Override // X.InterfaceC648350Pbt
    public final boolean LLLLIIIILLL() {
        return true;
    }

    @Override // X.InterfaceC648350Pbt
    public final void LLZZZIL(C587060N0u c587060N0u) {
    }

    @Override // X.InterfaceC648350Pbt
    public final void Mu(C650630PfZ c650630PfZ) {
    }

    @Override // X.InterfaceC648350Pbt
    public final boolean N1() {
        return true;
    }

    @Override // X.InterfaceC648350Pbt
    public final View getDetectView() {
        return null;
    }

    @Override // X.InterfaceC648350Pbt
    public final InterfaceC584630MwP getPreload() {
        return null;
    }

    @Override // X.InterfaceC648350Pbt
    public final C0PCQ getPriority() {
        return null;
    }

    @Override // X.InterfaceC648350Pbt
    public final boolean l2() {
        return true;
    }

    @Override // X.InterfaceC648350Pbt
    public final void release() {
    }

    @Override // X.InterfaceC648350Pbt
    public final void setPlayMetrics(C664400Q4g c664400Q4g) {
    }

    @Override // X.InterfaceC648350Pbt
    public final void setPlayableLifecycleListener(InterfaceC659190PtN interfaceC659190PtN) {
    }

    @Override // X.InterfaceC648350Pbt
    public final void wp(C650630PfZ c650630PfZ) {
    }

    @Override // X.InterfaceC648350Pbt
    public final Boolean z3() {
        return null;
    }

    public final RecyclerView LJIIIIZZ() {
        return (RecyclerView) this.LLIZ.getValue();
    }

    public final C652920PjG LJIIIZ() {
        return (C652920PjG) this.LLJ.getValue();
    }

    @Override // X.InterfaceC648270Pbl
    public final View LJJIIJ() {
        return LJIIIZ().LL;
    }

    @Override // X.InterfaceC653050PjT
    public final boolean LLD() {
        return LJIIIZ().LLD();
    }

    @Override // X.InterfaceC648270Pbl
    public final void LLJJJ() {
        LJIIIZ().LLJJJ();
    }

    @Override // X.InterfaceC648270Pbl
    public final void LLLLLIL() {
        LJIIIZ().LLLLLIL();
    }

    @Override // X.InterfaceC648270Pbl
    public final void LLLLLILLIL() {
        LJIIIZ().LLLLLILLIL();
    }

    @Override // X.InterfaceC648270Pbl
    public final void O4() {
        LJIIIZ().O4();
    }

    @Override // X.InterfaceC648350Pbt
    public final String getDebugId() {
        return C655580PnY.LIZ(this);
    }

    @Override // X.InterfaceC648350Pbt
    public final boolean isPlaying() {
        return LJIIIZ().isPlaying();
    }

    @Override // X.InterfaceC648350Pbt
    @InterfaceC1294060jmO
    public final View p0() {
        return C655580PnY.LIZIZ(this);
    }

    @Override // X.InterfaceC648350Pbt
    public final void LJJJLIIL() {
        C655580PnY.LIZJ(this);
    }

    @Override // X.InterfaceC645410PTf
    public final void LLLJIL(String str) {
        this.LLILZIL = str;
    }

    @C14EU
    public void onVideoEvent(C737030Svd c737030Svd) {
        InterfaceViewOnAttachStateChangeListenerC652360PiM interfaceViewOnAttachStateChangeListenerC652360PiM;
        Aweme aweme;
        if (this.LL.itemView.isAttachedToWindow() && (interfaceViewOnAttachStateChangeListenerC652360PiM = LJIIIZ().LLJIJIL) != null && interfaceViewOnAttachStateChangeListenerC652360PiM.RA() && c737030Svd.LIZ == 21) {
            if (this.LL.itemView != null) {
                C666560QCo.LIZIZ(null);
            }
            Object obj = c737030Svd.LIZIZ;
            if (!(obj instanceof Aweme) || (aweme = (Aweme) obj) == null || TextUtils.equals(C658220Pro.LLJIJIL, aweme.getAid())) {
                return;
            }
            Iterator<? extends Aweme> it2 = this.LLILZLL.iterator();
            int i = 0;
            while (it2.hasNext()) {
                if (TextUtils.equals(it2.next().getAid(), aweme.getAid())) {
                    if (i != -1) {
                        ((LinearLayoutManager) this.LLIZLLLIL.getValue()).scrollToPositionWithOffset(i, 0);
                        return;
                    }
                    return;
                }
                i++;
            }
        }
    }

    @Override // X.InterfaceC648350Pbt
    public final void W0(long j, C587060N0u c587060N0u) {
        C655580PnY.LIZLLL(this, j);
    }

    public AbstractC652910PjF(C652390PiP c652390PiP, InterfaceC641090PCp interfaceC641090PCp, InterfaceC652950PjJ interfaceC652950PjJ) {
        super(c652390PiP);
        this.LLILLL = interfaceC652950PjJ;
        this.LLILZ = C452501pT.LIZIZ(new AwS254S0300000_10(interfaceC641090PCp, c652390PiP, this, 20));
        this.LLIZ = C452501pT.LIZIZ(new AwS411S0200000_10(this, c652390PiP, 101));
        this.LLIZLLLIL = C452501pT.LIZIZ(new AwS554S0100000_10(c652390PiP, 1219));
        this.LLJ = C452501pT.LIZIZ(new AwS411S0200000_10(this, interfaceC641090PCp, 102));
        c652390PiP.itemView.addOnAttachStateChangeListener(new C0R45(this, 42));
    }
}

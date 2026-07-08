package X;

import android.content.Context;
import android.widget.FrameLayout;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0Roa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public abstract class AbstractC707180Roa extends FrameLayout implements InterfaceC713230RyL {
    public float LL;
    public double LLILLJJLI;
    public boolean LLILLL;

    public boolean LIZJ(C2344009Gk c2344009Gk) {
        return this instanceof C1050120dQw;
    }

    public void LJI(int i) {
    }

    public void LJIIIZ() {
        this.LLILLL = true;
    }

    public String LJIIJ(C2344009Gk c2344009Gk) {
        return "click_list";
    }

    public boolean LJIIJJI() {
        return false;
    }

    @Override // X.InterfaceC1392510mLB
    public C1400390mXt getAnchorMobConfiguration() {
        return null;
    }

    public void setDarkMode(boolean z) {
    }

    public HashMap<String, String> getShowContentInfo() {
        return new HashMap<>();
    }

    public final double getMDuration() {
        return this.LLILLJJLI;
    }

    public final boolean getMHasFinished() {
        return this.LLILLL;
    }

    public final float getMProgress() {
        return this.LL;
    }

    public AbstractC707180Roa(Context context) {
        super(context);
    }

    public void LJIIL(double d) {
        this.LLILLJJLI = d;
    }

    public final void setMDuration(double d) {
        this.LLILLJJLI = d;
    }

    public final void setMHasFinished(boolean z) {
        this.LLILLL = z;
    }

    public final void setMProgress(float f) {
        this.LL = f;
    }
}

package X;

import android.view.MotionEvent;
import android.view.VelocityTracker;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS201S0000000_14;
import kotlin.jvm.internal.AwS558S0100000_14;

/* JADX INFO: renamed from: X.0ZYd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C901490ZYd extends AbstractC1585810rMx implements InterfaceC21676019sM {
    public final RecyclerView LL;
    public final int LLILLJJLI;
    public final int LLILLL;
    public final int LLILZ;
    public final Function0<Unit> LLILZIL;
    public final Function0<Unit> LLILZLL;
    public final Function0<Unit> LLIZ;
    public boolean LLIZLLLIL;
    public int LLJ;
    public boolean LLJI;
    public VelocityTracker LLJIJIL;
    public float LLJILJIL;

    public C901490ZYd() {
        throw null;
    }

    @Override // X.InterfaceC21676019sM
    public final void LJIIZILJ(boolean z) {
    }

    public final void LJJIJIIJIL(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        return;
                    }
                } else {
                    VelocityTracker velocityTracker = this.LLJIJIL;
                    if (velocityTracker == null) {
                        return;
                    }
                    velocityTracker.addMovement(motionEvent);
                    velocityTracker.computeCurrentVelocity(LSPassThroughRecordSizeConfig.DEFAULT);
                    this.LLJILJIL = velocityTracker.getYVelocity();
                    return;
                }
            }
            VelocityTracker velocityTracker2 = this.LLJIJIL;
            if (velocityTracker2 != null) {
                velocityTracker2.addMovement(motionEvent);
                velocityTracker2.computeCurrentVelocity(LSPassThroughRecordSizeConfig.DEFAULT);
                this.LLJILJIL = velocityTracker2.getYVelocity();
                velocityTracker2.recycle();
            }
            this.LLJIJIL = null;
            return;
        }
        VelocityTracker velocityTracker3 = this.LLJIJIL;
        if (velocityTracker3 == null) {
            this.LLJIJIL = VelocityTracker.obtain();
        } else {
            velocityTracker3.clear();
        }
        VelocityTracker velocityTracker4 = this.LLJIJIL;
        if (velocityTracker4 != null) {
            velocityTracker4.addMovement(motionEvent);
        }
        this.LLJILJIL = 0.0f;
    }

    @Override // X.InterfaceC21676019sM
    public final void LJIIJ(RecyclerView recyclerView, MotionEvent motionEvent) {
        LJJIJIIJIL(motionEvent);
    }

    @Override // X.InterfaceC21676019sM
    public final boolean LJJIFFI(RecyclerView recyclerView, MotionEvent motionEvent) {
        LJJIJIIJIL(motionEvent);
        return false;
    }

    @Override // X.AbstractC1585810rMx
    public final void LJJIIJ(RecyclerView recyclerView, int i) {
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    this.LLIZLLLIL = true;
                    this.LLJ = 0;
                    this.LLJI = false;
                    if (Math.abs(this.LLJILJIL) >= this.LLILZ) {
                        this.LLILZIL.invoke();
                        return;
                    }
                    return;
                }
                return;
            }
            this.LLIZLLLIL = false;
            this.LLJ = 0;
            this.LLJI = false;
            return;
        }
        this.LLIZ.invoke();
        this.LLIZLLLIL = false;
        this.LLJ = 0;
        this.LLJI = false;
        this.LLJILJIL = 0.0f;
    }

    @Override // X.AbstractC1585810rMx
    public final void LJJIIZI(RecyclerView recyclerView, int i, int i2) {
        if (!this.LLIZLLLIL) {
            return;
        }
        if (Math.abs(i2) <= this.LLILLJJLI) {
            int i3 = this.LLJ + 1;
            this.LLJ = i3;
            if (!this.LLJI && i3 >= this.LLILLL) {
                this.LLJI = true;
                this.LLILZLL.invoke();
                return;
            }
            return;
        }
        this.LLJ = 0;
    }

    public C901490ZYd(RecyclerView recyclerView, AFwS201S0000000_14 aFwS201S0000000_14, AwS558S0100000_14 awS558S0100000_14, AwS558S0100000_14 awS558S0100000_142) {
        this.LL = recyclerView;
        this.LLILLJJLI = 5;
        this.LLILLL = 3;
        this.LLILZ = 4000;
        this.LLILZIL = aFwS201S0000000_14;
        this.LLILZLL = awS558S0100000_14;
        this.LLIZ = awS558S0100000_142;
    }
}

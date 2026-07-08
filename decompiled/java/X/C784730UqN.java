package X;

import Y.ACListenerS147S0100000_12;
import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0UqN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C784730UqN extends ConstraintLayout {
    public static final /* synthetic */ int LLJI = 0;
    public ConstraintLayout LL;
    public LiveIconView LLILLJJLI;
    public C19748912Op LLILLL;
    public C19748912Op LLILZ;
    public LiveIconView LLILZIL;
    public LiveIconView LLILZLL;
    public InterfaceC784750UqP LLIZ;
    public boolean LLIZLLLIL;
    public boolean LLJ;

    public final LiveIconView getBackViewFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.bnq);
            this.LLILLJJLI = (LiveIconView) callbackFindViewById;
        }
        return (LiveIconView) callbackFindViewById;
    }

    public final C19748912Op getDeviceBarFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.fs9);
            this.LLILZ = (C19748912Op) callbackFindViewById;
        }
        return (C19748912Op) callbackFindViewById;
    }

    public final LiveIconView getDeviceIconFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.fs_);
            this.LLILZIL = (LiveIconView) callbackFindViewById;
        }
        return (LiveIconView) callbackFindViewById;
    }

    public final C19748912Op getMicBarFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.oar);
            this.LLILLL = (C19748912Op) callbackFindViewById;
        }
        return (C19748912Op) callbackFindViewById;
    }

    public final LiveIconView getMicIconFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.oau);
            this.LLILZLL = (LiveIconView) callbackFindViewById;
        }
        return (LiveIconView) callbackFindViewById;
    }

    public final ConstraintLayout getSoundViewFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.vqt);
            this.LL = (ConstraintLayout) callbackFindViewById;
        }
        return (ConstraintLayout) callbackFindViewById;
    }

    public final InterfaceC784750UqP getCallBack() {
        return this.LLIZ;
    }

    public final void e0(int i) {
        C20743516Fd c20743516Fd = null;
        if (i == 0) {
            LiveIconView deviceIconFromXml = getDeviceIconFromXml();
            C20743516Fd c20743516FdLIZLLL = C20736316Cj.LIZLLL(R.attr.eej, getContext());
            if (c20743516FdLIZLLL != null) {
                c20743516FdLIZLLL.setTint(-1711276033);
                c20743516Fd = c20743516FdLIZLLL;
            }
            deviceIconFromXml.setIcon(c20743516Fd);
            return;
        }
        LiveIconView deviceIconFromXml2 = getDeviceIconFromXml();
        C20743516Fd c20743516FdLIZLLL2 = C20736316Cj.LIZLLL(R.attr.eei, getContext());
        if (c20743516FdLIZLLL2 != null) {
            c20743516FdLIZLLL2.setTint(-1711276033);
            c20743516Fd = c20743516FdLIZLLL2;
        }
        deviceIconFromXml2.setIcon(c20743516Fd);
    }

    public final void h0(int i) {
        C20743516Fd c20743516Fd = null;
        if (i == 0) {
            LiveIconView micIconFromXml = getMicIconFromXml();
            C20743516Fd c20743516FdLIZLLL = C20736316Cj.LIZLLL(R.attr.e3x, getContext());
            if (c20743516FdLIZLLL != null) {
                c20743516FdLIZLLL.setTint(-1711276033);
                c20743516Fd = c20743516FdLIZLLL;
            }
            micIconFromXml.setIcon(c20743516Fd);
            return;
        }
        LiveIconView micIconFromXml2 = getMicIconFromXml();
        C20743516Fd c20743516FdLIZLLL2 = C20736316Cj.LIZLLL(R.attr.e3u, getContext());
        if (c20743516FdLIZLLL2 != null) {
            c20743516FdLIZLLL2.setTint(-1711276033);
            c20743516Fd = c20743516FdLIZLLL2;
        }
        micIconFromXml2.setIcon(c20743516Fd);
    }

    public final void setBackViewFromXml(LiveIconView liveIconView) {
        this.LLILLJJLI = liveIconView;
    }

    public final void setCallBack(InterfaceC784750UqP interfaceC784750UqP) {
        this.LLIZ = interfaceC784750UqP;
    }

    public final void setDeviceBarFromXml(C19748912Op c19748912Op) {
        this.LLILZ = c19748912Op;
    }

    public final void setDeviceIconFromXml(LiveIconView liveIconView) {
        this.LLILZIL = liveIconView;
    }

    public final void setMicBarFromXml(C19748912Op c19748912Op) {
        this.LLILLL = c19748912Op;
    }

    public final void setMicIconFromXml(LiveIconView liveIconView) {
        this.LLILZLL = liveIconView;
    }

    public final void setSoundViewFromXml(ConstraintLayout constraintLayout) {
        this.LL = constraintLayout;
    }

    public C784730UqN(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C784730UqN(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLJ = true;
        ViewGroup.inflate(getContext(), R.layout.hro, this);
        setBackgroundResource(R.drawable.ds7);
        C786410Ut5.Y7(getSoundViewFromXml(), new View.OnClickListener() { // from class: X.0UqO
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
            }
        });
        C786410Ut5.g8(getBackViewFromXml(), new ACListenerS147S0100000_12((Object) this, 69));
        int iLIZ = C784620UqC.LIZ(false);
        getMicBarFromXml().setCurrentProgress(iLIZ);
        h0(iLIZ);
        getMicBarFromXml().setSeekbarListener(new C786050UsV(this, 2));
        C19748912Op deviceBarFromXml = getDeviceBarFromXml();
        C20337914i1<Integer> c20337914i1 = InterfaceC772390URp.a0;
        deviceBarFromXml.setCurrentProgress(c20337914i1.LIZIZ().intValue());
        e0(c20337914i1.LIZIZ().intValue());
        getDeviceBarFromXml().setSeekbarListener(new C786050UsV(this, 3));
        C500260Jjc.LJJZZIII(-((int) C497740JfY.LIZIZ(6.5f)), getDeviceBarFromXml());
        C500260Jjc.LJJZZIII(-((int) C497740JfY.LIZIZ(6.5f)), getMicBarFromXml());
    }
}

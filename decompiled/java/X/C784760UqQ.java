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

/* JADX INFO: renamed from: X.0UqQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C784760UqQ extends ConstraintLayout {
    public LiveIconView LL;
    public ConstraintLayout LLILLJJLI;
    public C19748912Op LLILLL;
    public C16F5 LLILZ;
    public C16F5 LLILZIL;
    public C16F5 LLILZLL;
    public InterfaceC784750UqP LLIZ;

    public final LiveIconView getBackViewFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.bnq);
            this.LL = (LiveIconView) callbackFindViewById;
        }
        return (LiveIconView) callbackFindViewById;
    }

    public final C19748912Op getOpacityBarFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.pnl);
            this.LLILLL = (C19748912Op) callbackFindViewById;
        }
        return (C19748912Op) callbackFindViewById;
    }

    public final ConstraintLayout getOpacityViewFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.pnm);
            this.LLILLJJLI = (ConstraintLayout) callbackFindViewById;
        }
        return (ConstraintLayout) callbackFindViewById;
    }

    public final C16F5 getView100FromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.view_100);
            this.LLILZLL = (C16F5) callbackFindViewById;
        }
        return (C16F5) callbackFindViewById;
    }

    public final C16F5 getView20FromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.view_20);
            this.LLILZ = (C16F5) callbackFindViewById;
        }
        return (C16F5) callbackFindViewById;
    }

    public final C16F5 getView60FromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.view_60);
            this.LLILZIL = (C16F5) callbackFindViewById;
        }
        return (C16F5) callbackFindViewById;
    }

    public final InterfaceC784750UqP getCallBack() {
        return this.LLIZ;
    }

    public final void setBackViewFromXml(LiveIconView liveIconView) {
        this.LL = liveIconView;
    }

    public final void setCallBack(InterfaceC784750UqP interfaceC784750UqP) {
        this.LLIZ = interfaceC784750UqP;
    }

    public final void setOpacityBarFromXml(C19748912Op c19748912Op) {
        this.LLILLL = c19748912Op;
    }

    public final void setOpacityViewFromXml(ConstraintLayout constraintLayout) {
        this.LLILLJJLI = constraintLayout;
    }

    public final void setView100FromXml(C16F5 c16f5) {
        this.LLILZLL = c16f5;
    }

    public final void setView20FromXml(C16F5 c16f5) {
        this.LLILZ = c16f5;
    }

    public final void setView60FromXml(C16F5 c16f5) {
        this.LLILZIL = c16f5;
    }

    public C784760UqQ(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C784760UqQ(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ViewGroup.inflate(getContext(), R.layout.hrm, this);
        setBackgroundResource(R.drawable.ds7);
        C786410Ut5.g8(getBackViewFromXml(), new ACListenerS147S0100000_12((Object) this, 68));
        C786410Ut5.Y7(getOpacityViewFromXml(), new View.OnClickListener() { // from class: X.0UqR
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
            }
        });
        getOpacityBarFromXml().setCurrentProgress(InterfaceC772390URp.f130Y.LIZIZ().intValue());
        C500260Jjc.LJJZZIII(-((int) C497740JfY.LIZIZ(6.5f)), getOpacityBarFromXml());
        getOpacityBarFromXml().setSeekbarListener(new C786050UsV(this, 1));
        getView20FromXml().setText("20%");
        getView60FromXml().setText("60%");
        getView100FromXml().setText("100%");
    }
}

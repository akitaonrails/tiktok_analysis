package X;

import Y.ACListenerS147S0100000_12;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.livesetting.broadcast.LivePauseTimeSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS556S0100000_12;

/* JADX INFO: renamed from: X.0UqH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C784670UqH extends ConstraintLayout {
    public LiveIconView LL;
    public LinearLayout LLILLJJLI;
    public C16F5 LLILLL;
    public C16F5 LLILZ;
    public ConstraintLayout LLILZIL;
    public C16F5 LLILZLL;
    public C16F5 LLIZ;
    public DataChannel LLIZLLLIL;
    public final C01GW LLJ;

    private final C16F5 getCountDownContentView() {
        return (C16F5) this.LLJ.getValue();
    }

    public final LiveIconView getChangeIconFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.dnl);
            this.LL = (LiveIconView) callbackFindViewById;
        }
        return (LiveIconView) callbackFindViewById;
    }

    public final C16F5 getCountDownBigFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.eyw);
            this.LLILLL = (C16F5) callbackFindViewById;
        }
        return (C16F5) callbackFindViewById;
    }

    public final C16F5 getCountDownContentFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.ez3);
            this.LLIZ = (C16F5) callbackFindViewById;
        }
        return (C16F5) callbackFindViewById;
    }

    public final C16F5 getCountDownSmallFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.f00);
            this.LLILZ = (C16F5) callbackFindViewById;
        }
        return (C16F5) callbackFindViewById;
    }

    public final C16F5 getCountDownTitleFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.f0e);
            this.LLILZLL = (C16F5) callbackFindViewById;
        }
        return (C16F5) callbackFindViewById;
    }

    public final LinearLayout getCountDownViewFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.f0f);
            this.LLILLJJLI = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final ConstraintLayout getPauseViewFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.f786q4b);
            this.LLILZIL = (ConstraintLayout) callbackFindViewById;
        }
        return (ConstraintLayout) callbackFindViewById;
    }

    public final void setChangeIconFromXml(LiveIconView liveIconView) {
        this.LL = liveIconView;
    }

    public final void setCountDownBigFromXml(C16F5 c16f5) {
        this.LLILLL = c16f5;
    }

    public final void setCountDownContentFromXml(C16F5 c16f5) {
        this.LLIZ = c16f5;
    }

    public final void setCountDownSmallFromXml(C16F5 c16f5) {
        this.LLILZ = c16f5;
    }

    public final void setCountDownTitleFromXml(C16F5 c16f5) {
        this.LLILZLL = c16f5;
    }

    public final void setCountDownViewFromXml(LinearLayout linearLayout) {
        this.LLILLJJLI = linearLayout;
    }

    public final void setPauseViewFromXml(ConstraintLayout constraintLayout) {
        this.LLILZIL = constraintLayout;
    }

    public C784670UqH(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C784670UqH(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLJ = C292401Bi.LIZ(new AwS556S0100000_12(this, 77));
        ViewGroup.inflate(getContext(), R.layout.hrn, this);
        C786410Ut5.g8(getChangeIconFromXml(), new ACListenerS147S0100000_12((Object) this, 66));
        C786410Ut5.R7(getCountDownViewFromXml(), new ACListenerS147S0100000_12((Object) this, 67));
        Drawable drawableLJIIJ = C497740JfY.LJIIJ(R.drawable.exg);
        if (drawableLJIIJ != null) {
            drawableLJIIJ.setBounds(0, 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
        } else {
            drawableLJIIJ = null;
        }
        LivePauseTimeSetting livePauseTimeSetting = LivePauseTimeSetting.INSTANCE;
        C0TIR.LIZ(getCountDownContentView(), C497740JfY.LJIIL(2131755928, livePauseTimeSetting.getPauseTimes(), Integer.valueOf(livePauseTimeSetting.getPauseTimes())), drawableLJIIJ);
    }
}

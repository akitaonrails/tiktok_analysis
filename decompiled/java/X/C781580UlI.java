package X;

import Y.ATListenerS446S0100000_12;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0UlI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C781580UlI extends ConstraintLayout {
    public C1324720kZq LL;
    public ObjectAnimator LLILLJJLI;
    public ObjectAnimator LLILLL;
    public C1143920fsE LLILZ;

    public final C1324720kZq getGuideHandFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.jch);
            this.LL = (C1324720kZq) callbackFindViewById;
        }
        return (C1324720kZq) callbackFindViewById;
    }

    public final void setGuideHandFromXml(C1324720kZq c1324720kZq) {
        this.LL = c1324720kZq;
    }

    public C781580UlI(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ViewGroup.inflate(context, R.layout.hia, this);
        C1324720kZq guideHandFromXml = getGuideHandFromXml();
        if (guideHandFromXml != null) {
            C500260Jjc.LJLJL(C497740JfY.LJIILLIIL() / 4, guideHandFromXml);
        }
        setOnTouchListener(new ATListenerS446S0100000_12(this, 30));
    }
}

package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.KeyEvent;
import android.widget.FrameLayout;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0eNs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1086660eNs extends C21538719Qz {
    public C16F5 LLILZIL;
    public ValueAnimator LLILZLL;

    public final C16F5 getSelectPollTextFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.uld);
            this.LLILZIL = (C16F5) callbackFindViewById;
        }
        return (C16F5) callbackFindViewById;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.LLILZLL;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    public C1086660eNs(Context context) {
        super(context, null, 0);
        FrameLayout.inflate(context, R.layout.hum, this);
        setBackgroundColor(ColorProtector.parseColor("#33000000"));
    }

    public final void setBgVisible(boolean z) {
        if (z) {
            getSelectPollTextFromXml().setBackgroundResource(R.drawable.e6x);
        } else {
            getSelectPollTextFromXml().setBackground(null);
        }
    }

    public final void setPollText(String str) {
        getSelectPollTextFromXml().setText(str);
    }

    public final void setSelectPollTextFromXml(C16F5 c16f5) {
        this.LLILZIL = c16f5;
    }

    public final void setTextSize(float f) {
        getSelectPollTextFromXml().setTextSize(1, f);
    }
}

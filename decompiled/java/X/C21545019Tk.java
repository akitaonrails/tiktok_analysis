package X;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Checkable;
import android.widget.ImageButton;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.google.android.material.internal.CheckableImageButton$SavedState;
import u4.q0;

/* JADX INFO: renamed from: X.19Tk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C21545019Tk extends C21413718r9 implements Checkable {
    public static final int[] LLIZ = {R.attr.state_checked};
    public boolean LLILZ;
    public boolean LLILZIL;
    public boolean LLILZLL;

    public void toggle() {
        setChecked(!this.LLILZ);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        CheckableImageButton$SavedState checkableImageButton$SavedState = new CheckableImageButton$SavedState(super.onSaveInstanceState());
        checkableImageButton$SavedState.LL = this.LLILZ;
        return checkableImageButton$SavedState;
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.LLILZ;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        if (this.LLILZ) {
            return ImageButton.mergeDrawableStates(super.onCreateDrawableState(i + 1), LLIZ);
        }
        return super.onCreateDrawableState(i);
    }

    @Override // X.C21413718r9, android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            BitmapCrashChecker.doCheck(e, this);
            throw e;
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof CheckableImageButton$SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        CheckableImageButton$SavedState checkableImageButton$SavedState = (CheckableImageButton$SavedState) parcelable;
        super.onRestoreInstanceState(checkableImageButton$SavedState.mSuperState);
        setChecked(checkableImageButton$SavedState.LL);
    }

    public void setCheckable(boolean z) {
        if (this.LLILZIL != z) {
            this.LLILZIL = z;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (this.LLILZIL && this.LLILZ != z) {
            this.LLILZ = z;
            refreshDrawableState();
            sendAccessibilityEvent(SpeechEngineDefines.ASR_WORK_MODE_OFFLINE);
        }
    }

    public void setPressable(boolean z) {
        this.LLILZLL = z;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        if (this.LLILZLL) {
            super.setPressed(z);
        }
    }

    public C21545019Tk(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.zhiliaoapp.musically.R.attr.bxk);
    }

    public C21545019Tk(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLILZIL = true;
        this.LLILZLL = true;
        q0.LJIJ(this, new C20094213jo() { // from class: X.19Tj
            @Override // X.C20094213jo
            public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
                super.onInitializeAccessibilityEvent(view, accessibilityEvent);
                accessibilityEvent.setChecked(this.LIZ.isChecked());
            }

            @Override // X.C20094213jo
            public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.setCheckable(this.LIZ.LLILZIL);
                accessibilityNodeInfoCompat.setChecked(this.LIZ.isChecked());
            }
        });
    }
}

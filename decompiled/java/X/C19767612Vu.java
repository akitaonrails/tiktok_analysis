package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.ss.android.ugc.aweme.app.R$styleable;

/* JADX INFO: renamed from: X.12Vu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19767612Vu extends C21545019Tk {
    public Drawable LLIZLLLIL;
    public Drawable LLJ;
    public boolean LLJI;

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C20597815iq.LIZ(this);
    }

    @Override // X.C21545019Tk, android.widget.Checkable
    public final void toggle() {
        super.toggle();
        setImageDrawable(this.LLILZ ? this.LLIZLLLIL : this.LLJ);
    }

    @Override // X.C21545019Tk, X.C21413718r9, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            BitmapCrashChecker.doCheck(e, this);
            throw e;
        }
    }

    public C19767612Vu(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLJI = true;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.AVDmtView);
            typedArrayObtainStyledAttributes.getBoolean(R$styleable.AVDmtView_oldPanel, false);
            this.LLJI = typedArrayObtainStyledAttributes.getBoolean(R$styleable.AVDmtView_isChangeColor, true);
            this.LLIZLLLIL = typedArrayObtainStyledAttributes.getDrawable(R$styleable.AVDmtView_selectSrc);
            this.LLJ = typedArrayObtainStyledAttributes.getDrawable(R$styleable.AVDmtView_unSelectSrc);
            if (this.LLJI) {
                Context context2 = C19733712It.LIZ;
                this.LLIZLLLIL = C19733712It.LIZLLL(this.LLIZLLLIL);
                this.LLJ = C19733712It.LIZLLL(this.LLJ);
            }
            setImageDrawable(this.LLJ);
        }
    }
}

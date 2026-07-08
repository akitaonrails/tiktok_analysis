package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import androidx.appcompat.widget.m;
import androidx.appcompat.widget.t0;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.18r9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public class C21413718r9 extends ImageButton {
    public final C21411318ql LL;
    public final m LLILLJJLI;
    public boolean LLILLL;

    public ColorStateList getSupportBackgroundTintList() {
        C21411318ql c21411318ql = this.LL;
        if (c21411318ql != null) {
            return c21411318ql.LIZIZ();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C21411318ql c21411318ql = this.LL;
        if (c21411318ql != null) {
            return c21411318ql.LIZJ();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        C14MH c14mh;
        m mVar = this.LLILLJJLI;
        if (mVar == null || (c14mh = mVar.LIZIZ) == null) {
            return null;
        }
        return c14mh.LIZ;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        C14MH c14mh;
        m mVar = this.LLILLJJLI;
        if (mVar == null || (c14mh = mVar.LIZIZ) == null) {
            return null;
        }
        return c14mh.LIZIZ;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return ((this.LLILLJJLI.LIZ.getBackground() instanceof RippleDrawable) ^ true) && super.hasOverlappingRendering();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C21411318ql c21411318ql = this.LL;
        if (c21411318ql != null) {
            c21411318ql.LIZ();
        }
        m mVar = this.LLILLJJLI;
        if (mVar != null) {
            mVar.LIZ();
        }
    }

    @Override // android.widget.ImageView, android.view.View
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
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C21411318ql c21411318ql = this.LL;
        if (c21411318ql != null) {
            c21411318ql.LJ();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C21411318ql c21411318ql = this.LL;
        if (c21411318ql != null) {
            c21411318ql.LJFF(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        m mVar = this.LLILLJJLI;
        if (mVar != null) {
            mVar.LIZ();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        m mVar = this.LLILLJJLI;
        if (mVar != null && drawable != null && !this.LLILLL) {
            mVar.LIZJ = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        m mVar2 = this.LLILLJJLI;
        if (mVar2 != null) {
            mVar2.LIZ();
            if (!this.LLILLL) {
                m mVar3 = this.LLILLJJLI;
                if (mVar3.LIZ.getDrawable() != null) {
                    mVar3.LIZ.getDrawable().setLevel(mVar3.LIZJ);
                }
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.LLILLL = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        this.LLILLJJLI.LIZJ(i);
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        m mVar = this.LLILLJJLI;
        if (mVar != null) {
            mVar.LIZ();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C21411318ql c21411318ql = this.LL;
        if (c21411318ql != null) {
            c21411318ql.LJII(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C21411318ql c21411318ql = this.LL;
        if (c21411318ql != null) {
            c21411318ql.LJIIIIZZ(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        m mVar = this.LLILLJJLI;
        if (mVar != null) {
            if (mVar.LIZIZ == null) {
                mVar.LIZIZ = new C14MH();
            }
            C14MH c14mh = mVar.LIZIZ;
            c14mh.LIZ = colorStateList;
            c14mh.LIZLLL = true;
            mVar.LIZ();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        m mVar = this.LLILLJJLI;
        if (mVar != null) {
            if (mVar.LIZIZ == null) {
                mVar.LIZIZ = new C14MH();
            }
            C14MH c14mh = mVar.LIZIZ;
            c14mh.LIZIZ = mode;
            c14mh.LIZJ = true;
            mVar.LIZ();
        }
    }

    public C21413718r9(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.bxk);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21413718r9(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        t0.LIZ(context);
        this.LLILLL = false;
        C786410Ut5.t3(getContext());
        C21411318ql c21411318ql = new C21411318ql(this);
        this.LL = c21411318ql;
        c21411318ql.LIZLLL(attributeSet, i);
        m mVar = new m(this);
        this.LLILLJJLI = mVar;
        mVar.LIZIZ(attributeSet, i);
    }
}

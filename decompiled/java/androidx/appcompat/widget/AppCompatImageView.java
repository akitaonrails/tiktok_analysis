package androidx.appcompat.widget;

import X.C14MH;
import X.C21411318ql;
import X.C786410Ut5;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;

/* JADX INFO: loaded from: classes33.dex */
public class AppCompatImageView extends ImageView {
    public final C21411318ql mBackgroundTintHelper;
    public boolean mHasLevel;
    public final m mImageHelper;

    public void androidx_appcompat_widget_AppCompatImageView__onDraw$___twin___(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        androidx_appcompat_widget_AppCompatImageView_com_bytedance_tt_reliability_monitor_viewchecker_BitmapCrashChecker_onDraw(this, canvas);
    }

    public ColorStateList getSupportBackgroundTintList() {
        C21411318ql c21411318ql = this.mBackgroundTintHelper;
        if (c21411318ql != null) {
            return c21411318ql.LIZIZ();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C21411318ql c21411318ql = this.mBackgroundTintHelper;
        if (c21411318ql != null) {
            return c21411318ql.LIZJ();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        C14MH c14mh;
        m mVar = this.mImageHelper;
        if (mVar == null || (c14mh = mVar.LIZIZ) == null) {
            return null;
        }
        return c14mh.LIZ;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        C14MH c14mh;
        m mVar = this.mImageHelper;
        if (mVar == null || (c14mh = mVar.LIZIZ) == null) {
            return null;
        }
        return c14mh.LIZIZ;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return ((this.mImageHelper.LIZ.getBackground() instanceof RippleDrawable) ^ true) && super.hasOverlappingRendering();
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C21411318ql c21411318ql = this.mBackgroundTintHelper;
        if (c21411318ql != null) {
            c21411318ql.LIZ();
        }
        m mVar = this.mImageHelper;
        if (mVar != null) {
            mVar.LIZ();
        }
    }

    public AppCompatImageView(Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C21411318ql c21411318ql = this.mBackgroundTintHelper;
        if (c21411318ql != null) {
            c21411318ql.LJ();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C21411318ql c21411318ql = this.mBackgroundTintHelper;
        if (c21411318ql != null) {
            c21411318ql.LJFF(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        m mVar = this.mImageHelper;
        if (mVar != null) {
            mVar.LIZ();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        m mVar = this.mImageHelper;
        if (mVar != null && drawable != null && !this.mHasLevel) {
            mVar.LIZJ = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        m mVar2 = this.mImageHelper;
        if (mVar2 != null) {
            mVar2.LIZ();
            if (!this.mHasLevel) {
                m mVar3 = this.mImageHelper;
                if (mVar3.LIZ.getDrawable() != null) {
                    mVar3.LIZ.getDrawable().setLevel(mVar3.LIZJ);
                }
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.mHasLevel = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        m mVar = this.mImageHelper;
        if (mVar != null) {
            mVar.LIZJ(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        m mVar = this.mImageHelper;
        if (mVar != null) {
            mVar.LIZ();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C21411318ql c21411318ql = this.mBackgroundTintHelper;
        if (c21411318ql != null) {
            c21411318ql.LJII(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C21411318ql c21411318ql = this.mBackgroundTintHelper;
        if (c21411318ql != null) {
            c21411318ql.LJIIIIZZ(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        m mVar = this.mImageHelper;
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
        m mVar = this.mImageHelper;
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

    public AppCompatImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static void androidx_appcompat_widget_AppCompatImageView_com_bytedance_tt_reliability_monitor_viewchecker_BitmapCrashChecker_onDraw(AppCompatImageView appCompatImageView, Canvas canvas) {
        try {
            appCompatImageView.androidx_appcompat_widget_AppCompatImageView__onDraw$___twin___(canvas);
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            BitmapCrashChecker.doCheck(e, appCompatImageView);
            throw e;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        t0.LIZ(context);
        this.mHasLevel = false;
        C786410Ut5.t3(getContext());
        C21411318ql c21411318ql = new C21411318ql(this);
        this.mBackgroundTintHelper = c21411318ql;
        c21411318ql.LIZLLL(attributeSet, i);
        m mVar = new m(this);
        this.mImageHelper = mVar;
        mVar.LIZIZ(attributeSet, i);
    }
}

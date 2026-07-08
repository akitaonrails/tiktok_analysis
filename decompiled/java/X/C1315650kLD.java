package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.ui.image.GlobalImageLoadListener;
import java.util.List;

/* JADX INFO: renamed from: X.0kLD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1315650kLD extends C1315710kLJ {
    public int mBlurRadius;
    public int mShadowColor;
    public int mShadowOffsetX;
    public int mShadowOffsetY;
    public int mShadowRadius;

    public void com_lynx_tasm_ui_image_FrescoFilterImageView__onDetachedFromWindow$___twin___() {
        super.onDetachedFromWindow();
    }

    public void markShadowDirty() {
        this.mIsDirty = true;
    }

    @Override // X.C1315710kLJ, X.C1322090kVb, android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        com_lynx_tasm_ui_image_FrescoFilterImageView_com_ss_android_ugc_aweme_lancet_ImageStopLossLanect_imageViewOnDetachedFromWindow(this);
    }

    @Override // X.C1315710kLJ, X.C1322110kVd, X.C1322100kVc, X.C1322090kVb, android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        com_lynx_tasm_ui_image_FrescoFilterImageView_com_bytedance_tt_reliability_monitor_viewchecker_BitmapCrashChecker_onDraw(this, canvas);
    }

    private void configureBounds() {
        if (getTopLevelDrawable() == null || !isUseShadowProcessor()) {
            return;
        }
        getTopLevelDrawable().setBounds(new Rect(0, 0, getWidth(), getHeight()));
    }

    private boolean isUseShadowProcessor() {
        if (getWidth() == 0 || getHeight() == 0) {
            return false;
        }
        return (this.mShadowRadius == 0 && this.mShadowColor == 0 && this.mBlurRadius == 0) ? false : true;
    }

    @Override // X.C1315710kLJ
    public void maybeUpdateView() {
        super.maybeUpdateView();
    }

    @Override // X.C1315710kLJ
    public void onImageRequestLoaded() {
        configureBounds();
    }

    public static void com_lynx_tasm_ui_image_FrescoFilterImageView_com_ss_android_ugc_aweme_lancet_ImageStopLossLanect_imageViewOnDetachedFromWindow(C1315650kLD c1315650kLD) {
        c1315650kLD.com_lynx_tasm_ui_image_FrescoFilterImageView__onDetachedFromWindow$___twin___();
        C20597815iq.LIZ(c1315650kLD);
    }

    public void com_lynx_tasm_ui_image_FrescoFilterImageView__onDraw$___twin___(Canvas canvas) {
        if (getTopLevelDrawable() != null && isUseShadowProcessor()) {
            getTopLevelDrawable().draw(canvas);
        } else {
            super.onDraw(canvas);
        }
    }

    @Override // X.C1315710kLJ
    public void onPostprocessorPreparing(List<InterfaceC1291910jiv> list) {
        if (isUseShadowProcessor()) {
            list.add(new C1294000jmI(getWidth(), getHeight(), getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom(), getFrescoScaleType(), this.mShadowOffsetX, this.mShadowOffsetY, this.mShadowColor, this.mShadowRadius, this.mBlurRadius, getContext()));
        }
    }

    @Override // X.C1315710kLJ
    public void setBlurRadius(int i) {
        if (this.mBlurRadius != i) {
            this.mBlurRadius = i;
            markShadowDirty();
        }
    }

    @Override // X.C1315710kLJ
    public void setBorderRadius(C1313900kIO c1313900kIO) {
        super.setBorderRadius(c1313900kIO);
    }

    public void setShadowColor(int i) {
        if (this.mShadowColor != i) {
            this.mShadowColor = i;
            markShadowDirty();
        }
    }

    public void setShadowOffsetX(int i) {
        if (this.mShadowOffsetX != i) {
            this.mShadowOffsetX = i;
            markShadowDirty();
        }
    }

    public void setShadowOffsetY(int i) {
        if (this.mShadowOffsetY != i) {
            this.mShadowOffsetY = i;
            markShadowDirty();
        }
    }

    public void setShadowRadius(int i) {
        if (this.mShadowRadius != i) {
            this.mShadowRadius = i;
            markShadowDirty();
        }
    }

    public static void com_lynx_tasm_ui_image_FrescoFilterImageView_com_bytedance_tt_reliability_monitor_viewchecker_BitmapCrashChecker_onDraw(C1315650kLD c1315650kLD, Canvas canvas) {
        try {
            c1315650kLD.com_lynx_tasm_ui_image_FrescoFilterImageView__onDraw$___twin___(canvas);
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            BitmapCrashChecker.doCheck(e, c1315650kLD);
            throw e;
        }
    }

    @Override // android.widget.ImageView
    public boolean setFrame(int i, int i2, int i3, int i4) {
        boolean frame = super.setFrame(i, i2, i3, i4);
        configureBounds();
        return frame;
    }

    public C1315650kLD(Context context, AbstractC1320720kTO abstractC1320720kTO, GlobalImageLoadListener globalImageLoadListener, Object obj, LynxBaseUI lynxBaseUI) {
        super(context, abstractC1320720kTO, globalImageLoadListener, obj, lynxBaseUI);
    }
}

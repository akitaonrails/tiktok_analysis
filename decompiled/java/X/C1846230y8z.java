package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Shader;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;

/* JADX INFO: renamed from: X.0y8z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1846230y8z extends FrameLayout {
    public C1425810nCt LL;
    public TuxTextView LLILLJJLI;
    public TuxIconView LLILLL;
    public View LLILZ;
    public final /* synthetic */ C1846220y8y LLILZIL;

    public final int getContentHeight() {
        int i = 0;
        Object[] objArr = {this.LLILLJJLI, this.LLILLL};
        int bottom = 0;
        int top = 0;
        boolean z = false;
        do {
            View view = (View) objArr[i];
            if (view != null && view.getVisibility() == 0) {
                if (z) {
                    top = Math.min(top, view.getTop());
                    bottom = Math.max(bottom, view.getBottom());
                } else {
                    top = view.getTop();
                    bottom = view.getBottom();
                }
                z = true;
            }
            i++;
        } while (i < 2);
        return bottom - top;
    }

    public final int getContentWidth() {
        int i = 0;
        Object[] objArr = {this.LLILLJJLI, this.LLILLL};
        int right = 0;
        int left = 0;
        boolean z = false;
        do {
            View view = (View) objArr[i];
            if (view != null && view.getVisibility() == 0) {
                if (z) {
                    left = Math.min(left, view.getLeft());
                    right = Math.max(right, view.getRight());
                } else {
                    left = view.getLeft();
                    right = view.getRight();
                }
                z = true;
            }
            i++;
        } while (i < 2);
        return right - left;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0312  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ() {
        /*
            Method dump skipped, instruction units count: 798
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1846230y8z.LIZJ():void");
    }

    @Override // android.view.View
    public final boolean performClick() {
        boolean zPerformClick = super.performClick();
        C1425810nCt c1425810nCt = this.LL;
        if (c1425810nCt == null) {
            return zPerformClick;
        }
        if (!zPerformClick) {
            playSoundEffect(0);
        }
        C1846220y8y c1846220y8y = c1425810nCt.LJIIIIZZ;
        if (c1846220y8y != null) {
            c1846220y8y.LJIIL(c1425810nCt, true, false);
        }
        return true;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C1425810nCt c1425810nCt = this.LL;
        if (c1425810nCt == null) {
            return;
        }
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompatWrap = AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfo);
        accessibilityNodeInfoCompatWrap.setCollectionItemInfo(C20092913jb.LIZ(0, 1, c1425810nCt.LJI, 1, isSelected()));
        if (isSelected()) {
            accessibilityNodeInfoCompatWrap.setClickable(false);
            accessibilityNodeInfoCompatWrap.removeAction(C20092413jW.LJI);
        }
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        super.setSelected(z);
        TuxTextView tuxTextView = this.LLILLJJLI;
        if (tuxTextView != null) {
            tuxTextView.setSelected(z);
        }
        TuxIconView tuxIconView = this.LLILLL;
        if (tuxIconView != null) {
            tuxIconView.setSelected(z);
        }
    }

    public final void setTab(C1425810nCt c1425810nCt) {
        if (c1425810nCt != this.LL) {
            this.LL = c1425810nCt;
            LIZJ();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1846230y8z(C1846220y8y c1846220y8y, Context context) {
        super(context);
        this.LLILZIL = c1846220y8y;
        setClickable(true);
    }

    public static final void LIZ(TuxTextView tuxTextView, Bitmap bitmap) {
        float width = (tuxTextView.getWidth() - tuxTextView.getPaddingStart()) - tuxTextView.getPaddingEnd();
        float height = (tuxTextView.getHeight() - tuxTextView.getPaddingTop()) - tuxTextView.getPaddingBottom();
        if (width > 0.0f && height > 0.0f) {
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
            Matrix matrix = new Matrix();
            matrix.setScale(width / bitmap.getWidth(), height / bitmap.getHeight());
            bitmapShader.setLocalMatrix(matrix);
            tuxTextView.getPaint().setShader(bitmapShader);
            tuxTextView.invalidate();
        }
    }

    public static final void LIZIZ(TuxTextView tuxTextView, float[] fArr, int[] iArr, float[] fArr2) {
        float width = (tuxTextView.getWidth() - tuxTextView.getPaddingStart()) - tuxTextView.getPaddingEnd();
        float height = (tuxTextView.getHeight() - tuxTextView.getPaddingTop()) - tuxTextView.getPaddingBottom();
        if (width > 0.0f && height > 0.0f) {
            float f = height / 2.0f;
            tuxTextView.getPaint().setShader(new LinearGradient(0.0f, f * (1.0f - fArr[0]), width, f * (1.0f - fArr[1]), iArr, fArr2, Shader.TileMode.CLAMP));
            tuxTextView.invalidate();
        }
    }
}

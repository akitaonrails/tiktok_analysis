package X;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;

/* JADX INFO: renamed from: X.12Ua, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public class C19763012Ua extends LinearLayout {
    public int LL;

    public float getLeftX() {
        return super.getX();
    }

    public float getStartX() {
        return getLayoutDirection() == 1 ? (this.LL - super.getX()) - getMeasuredWidth() : super.getX();
    }

    public void setLeftX(float f) {
        super.setX(f);
    }

    public void setStartX(float f) {
        if (getLayoutDirection() == 1) {
            super.setX((this.LL - f) - getMeasuredWidth());
        } else {
            super.setX(f);
        }
    }

    public C19763012Ua(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Context context2 = getContext();
        while (context2 != null) {
            if (!(context2 instanceof Activity)) {
                if (!(context2 instanceof ContextWrapper)) {
                    break;
                } else {
                    context2 = ((ContextWrapper) context2).getBaseContext();
                }
            } else {
                break;
            }
        }
        context2 = null;
        this.LL = ScreenUtils.getScreenWidth(context2);
    }
}

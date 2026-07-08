package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0xrX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1835410xrX extends C197039127h {
    @Override // X.C197039127h
    public void setButtonVariant(int i) {
        if (i == EnumC1779710wPh.FIVE_LEVEL.getValue()) {
            Drawable drawable = getContext().getDrawable(R.drawable.bc1);
            setTextColorRes(R.attr.ej);
            setBackground(drawable);
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
            setAlpha(1.0f);
            super.setButtonVariant(i);
            return;
        }
        super.setButtonVariant(i);
    }

    public C1835410xrX(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.xj);
    }
}

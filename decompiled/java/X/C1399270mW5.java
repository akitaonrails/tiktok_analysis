package X;

import android.content.Context;
import android.util.AttributeSet;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0mW5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1399270mW5 extends C197039127h {
    public C1399270mW5(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public static void LJJLIIIIJ(C1399270mW5 c1399270mW5, EnumC1399260mW4 enumC1399260mW4) {
        c1399270mW5.getClass();
        String buttonText = enumC1399260mW4.getButtonText();
        Integer iconTint = enumC1399260mW4.getIconTint();
        Integer startIcon = enumC1399260mW4.getStartIcon();
        enumC1399260mW4.getStartIconUrl();
        Integer endIcon = enumC1399260mW4.getEndIcon();
        c1399270mW5.setText(buttonText);
        if (iconTint != null) {
            c1399270mW5.setIconTintColorRes(iconTint.intValue());
        }
        c1399270mW5.LJJJLZIJ(startIcon, endIcon);
    }

    public C1399270mW5(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.zg);
        c384050F3z.LIZJ = Float.valueOf(200.0f);
        setBackground(c384050F3z.LIZ(context));
        setMaxWidth((int) (((double) C1415610mwR.LIZIZ()) * 0.8d));
        setTextSize(16.0f);
        setTuxFont(103);
    }
}

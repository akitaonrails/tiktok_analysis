package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;
import u4.q0;

/* JADX INFO: renamed from: X.0mHL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1390130mHL extends FrameLayout {
    public final TuxTextView LL;
    public final C1390410mHn LLILLJJLI;
    public final boolean LLILLL;
    public final C1390140mHM LLILZ;

    public C1390130mHL(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public final void setAccessibilityClickActionLabel(CharSequence charSequence) {
        this.LLILZ.LIZ = charSequence;
    }

    public final void setAccessibilityClickActionRunnable(Runnable runnable) {
        this.LLILZ.LIZIZ = runnable;
    }

    public final void setMessage(int i) {
        String string = getResources().getString(i);
        this.LL.setText(string);
        TuxTextView tuxTextView = this.LL;
        int i2 = 0;
        if (string.length() <= 0) {
            i2 = 8;
        }
        C786410Ut5.LLLLZLL(tuxTextView, i2);
        setContentDescription(string);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (this.LLILLL) {
            if (i == 0) {
                this.LLILLJJLI.LIZJ();
            } else {
                this.LLILLJJLI.LIZLLL();
            }
        }
    }

    public final void setMessage(String str) {
        this.LL.setText(str);
        TuxTextView tuxTextView = this.LL;
        int i = 0;
        if (str == null || str.length() <= 0) {
            i = 8;
        }
        C786410Ut5.LLLLZLL(tuxTextView, i);
        setContentDescription(str);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1390130mHL(Context context, AttributeSet attributeSet, int i) {
        int i2;
        Drawable drawableLIZ;
        AttributeSet attributeSet2 = (i & 2) != 0 ? null : attributeSet;
        if ((i & 4) != 0) {
            i2 = R.attr.y8;
        } else {
            i2 = 0;
        }
        super(C1388190mED.LJ(C1388190mED.LIZJ(context, true), context), attributeSet2, i2);
        C1390140mHM c1390140mHM = new C1390140mHM();
        this.LLILZ = c1390140mHM;
        this.LLILLL = true;
        Context context2 = getContext();
        FrameLayout.inflate(context2, R.layout.gu, this);
        TuxTextView tuxTextView = (TuxTextView) findViewById(R.id.message_tv);
        this.LL = tuxTextView;
        View viewFindViewById = findViewById(R.id.o9n);
        C1390410mHn c1390410mHn = (C1390410mHn) findViewById(R.id.nle);
        this.LLILLJJLI = c1390410mHn;
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet2, R$styleable.TuxLoadingHUD, i2, 0);
        String strXd = C786410Ut5.Xd(typedArrayObtainStyledAttributes, R$styleable.TuxLoadingHUD_tux_loadingHUDMessage);
        int i3 = typedArrayObtainStyledAttributes.getInt(R$styleable.TuxLoadingHUD__tux_loadingHUDTextFont, 0);
        int color = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxLoadingHUD__tux_loadingHUDTextColor, 0);
        int color2 = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxLoadingHUD__tux_loadingHUDBackgroundColor, 0);
        float dimension = typedArrayObtainStyledAttributes.getDimension(R$styleable.TuxLoadingHUD__tux_loadingHUDBackgroundRadius, 0.0f);
        int color3 = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxLoadingHUD__tux_loadingHUDNewBackgroundColor, 0);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(R$styleable.TuxLoadingHUD__tux_loadingHUDNewBackgroundRadius, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        tuxTextView.setTuxFont(i3);
        tuxTextView.setTextColor(color);
        setMessage(strXd);
        if (C1389890mGx.LJFF >= 5) {
            C415490GQx c415490GQx = new C415490GQx();
            c415490GQx.LIZ(color3);
            c415490GQx.LIZIZ(dimension2);
            drawableLIZ = c415490GQx;
        } else {
            C384050F3z c384050F3z = new C384050F3z();
            if (C1389890mGx.LJFF >= 1) {
                c384050F3z.LIZ = Integer.valueOf(color3);
                c384050F3z.LIZJ = Float.valueOf(dimension2);
            } else {
                c384050F3z.LIZ = Integer.valueOf(color2);
                c384050F3z.LIZJ = Float.valueOf(dimension);
            }
            drawableLIZ = c384050F3z.LIZ(context2);
        }
        viewFindViewById.setBackground(drawableLIZ);
        if (getVisibility() == 0) {
            c1390410mHn.LIZJ();
        } else {
            c1390410mHn.LIZLLL();
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        int i4 = C20094413jq.LJIIZILJ;
        q0.LJIJ(this, (C20094213jo) c1390140mHM.LIZJ.getValue());
    }
}

package X;

import Y.ACListenerS124S0200000_21;
import android.content.Context;
import android.content.res.TypedArray;
import android.widget.LinearLayout;
import com.bytedance.tux.sheet.intro.internal.TuxIntroPanelFragment;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0mKK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1391980mKK extends LinearLayout {
    public final int LL;
    public final int LLILLJJLI;
    public final int LLILLL;

    public C1391980mKK(Context context) {
        super(context, null, R.attr.y4);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, R$styleable.TuxIntroPanelBottomView, R.attr.y4, 0);
        this.LL = typedArrayObtainStyledAttributes.getInt(R$styleable.TuxIntroPanelBottomView__tux_introPanelPrimaryButtonVariant, 0);
        this.LLILLJJLI = typedArrayObtainStyledAttributes.getInt(R$styleable.TuxIntroPanelBottomView__tux_introPanelSecondaryButtonVariant, 0);
        this.LLILLL = typedArrayObtainStyledAttributes.getInt(R$styleable.TuxIntroPanelBottomView__tux_introPanelButtonSize, 0);
        typedArrayObtainStyledAttributes.getColor(R$styleable.TuxIntroPanelBottomView__tux_introPanelCheckboxTextColor, 0);
        typedArrayObtainStyledAttributes.getInt(R$styleable.TuxIntroPanelBottomView__tux_introPanelCheckboxTextFont, 0);
        typedArrayObtainStyledAttributes.getInt(R$styleable.TuxIntroPanelBottomView_tux_checkBoxSize, 0);
        typedArrayObtainStyledAttributes.getColor(R$styleable.TuxIntroPanelBottomView__tux_introPanelBottomTextColor, 0);
        typedArrayObtainStyledAttributes.getInt(R$styleable.TuxIntroPanelBottomView__tux_introPanelBottomTextFont, 0);
        typedArrayObtainStyledAttributes.recycle();
        setOrientation(1);
        setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28)));
    }

    public static void LIZ(C197039127h c197039127h, C1391990mKL c1391990mKL, int i, TuxIntroPanelFragment tuxIntroPanelFragment) {
        if (c1391990mKL == null) {
            return;
        }
        c1391990mKL.LIZ = c197039127h;
        c197039127h.setText(c1391990mKL.LJ);
        c197039127h.setEnabled(c1391990mKL.LIZLLL);
        c197039127h.setLoading(false);
        c197039127h.setButtonVariant(i);
        C786410Ut5.U8(c197039127h, new ACListenerS124S0200000_21(tuxIntroPanelFragment, c1391990mKL, 102));
    }
}

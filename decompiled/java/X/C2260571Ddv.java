package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.widget.LinearLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS436S0200000_35;
import kotlin.jvm.internal.AwS579S0100000_35;

/* JADX INFO: renamed from: X.1Ddv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2260571Ddv extends LinearLayout {
    public EnumC2260581Ddw LL;
    public final C01GW LLILLJJLI;
    public final C01GW LLILLL;
    public final C01GW LLILZ;
    public final C01GW LLILZIL;

    private final LinearLayout.LayoutParams getIconLayoutParam() {
        return (LinearLayout.LayoutParams) this.LLILLL.getValue();
    }

    private final TuxIconView getIconView() {
        return (TuxIconView) this.LLILLJJLI.getValue();
    }

    private final LinearLayout.LayoutParams getTextLayoutParam() {
        return (LinearLayout.LayoutParams) this.LLILZIL.getValue();
    }

    private final TuxTextView getTextView() {
        return (TuxTextView) this.LLILZ.getValue();
    }

    public final void LIZ() {
        TypedArray typedArrayObtainStyledAttributes = new ContextThemeWrapper(getContext(), R.style.y0).obtainStyledAttributes(null, R$styleable.TextToImageEntryView, 0, 0);
        typedArrayObtainStyledAttributes.getInt(R$styleable.TextToImageEntryView_type, 0);
        typedArrayObtainStyledAttributes.recycle();
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(this.LL.getUiConfig$tools_camera_record_release().LIZJ.LIZIZ);
        c384050F3z.LIZJ = Float.valueOf(this.LL.getUiConfig$tools_camera_record_release().LIZJ.LIZJ);
        setBackground(c384050F3z.LIZ(getContext()));
        TuxIconView iconView = getIconView();
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZIZ = this.LL.getUiConfig$tools_camera_record_release().LIZ.LIZ;
        c419910GdJ.LIZJ = this.LL.getUiConfig$tools_camera_record_release().LIZ.LIZ;
        c419910GdJ.LIZ = R.raw.icon_pen_star;
        c419910GdJ.LJ = Integer.valueOf(this.LL.getUiConfig$tools_camera_record_release().LIZ.LIZJ);
        iconView.setTuxIcon(c419910GdJ);
        getTextView().setTextColorRes(this.LL.getUiConfig$tools_camera_record_release().LIZIZ.LIZIZ);
        invalidate();
    }

    private final void setTextToImageEntryType(EnumC2260581Ddw enumC2260581Ddw) {
        this.LL = enumC2260581Ddw;
    }

    public C2260571Ddv(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = EnumC2260581Ddw.TEXT_TO_IMAGE_CAMERA;
        this.LLILLJJLI = C452501pT.LIZIZ(new AwS436S0200000_35(context, this, 38));
        this.LLILLL = C452501pT.LIZIZ(new AwS579S0100000_35(this, 158));
        this.LLILZ = C452501pT.LIZIZ(new AwS436S0200000_35(context, this, 39));
        this.LLILZIL = C452501pT.LIZIZ(new AwS579S0100000_35(this, 159));
        setOrientation(0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.TextToImageEntryView, 0, 0);
        int i = typedArrayObtainStyledAttributes.getInt(R$styleable.TextToImageEntryView_type, 0);
        typedArrayObtainStyledAttributes.recycle();
        setTextToImageEntryType(EnumC2260581Ddw.values()[i]);
        setPaddingRelative(this.LL.getUiConfig$tools_camera_record_release().LIZJ.LIZ, getPaddingTop(), this.LL.getUiConfig$tools_camera_record_release().LIZJ.LIZ, getPaddingBottom());
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(this.LL.getUiConfig$tools_camera_record_release().LIZJ.LIZIZ);
        c384050F3z.LIZJ = Float.valueOf(this.LL.getUiConfig$tools_camera_record_release().LIZJ.LIZJ);
        setBackground(c384050F3z.LIZ(context));
        addView(getIconView(), getIconLayoutParam());
        addView(getTextView(), getTextLayoutParam());
    }
}

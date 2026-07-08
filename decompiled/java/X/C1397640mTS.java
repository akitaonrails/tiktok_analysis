package X;

import android.content.Context;
import android.content.res.ColorStateList;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0mTS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1397640mTS extends C197039127h {
    public boolean LLLIIIL;

    public C1397640mTS(Context context) {
        super(context, null, 6, 0);
    }

    @Override // X.C197039127h
    public void setButtonVariant(int i) {
        getContext();
        setIconTintColorRes(R.attr.a1h);
        setDefaultTintColorRes$tux_theme_release(R.attr.a1h);
        if (this.LLLIIIL) {
            C427690Gpr.LJ(this, 0.0f);
            setOnTouchListener(null);
        } else {
            C427690Gpr.LJI(this, null);
            setForeground(null);
        }
    }

    public final void setMaskPressed(boolean z) {
        this.LLLIIIL = z;
    }

    @Override // android.widget.TextView
    public void setTextColor(int i) {
        float f = C1397600mTO.LJJII;
        setTextColor(new ColorStateList(new int[][]{new int[]{-16842910}, new int[0]}, new int[]{new C1397600mTO(getContext()).LJIIZILJ, i}));
    }
}

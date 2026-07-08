package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0GfB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC421070GfB<T> extends LinearLayout {
    public View LL;
    public View LLILLJJLI;
    public TuxTextView LLILLL;
    public TuxIconView LLILZ;
    public boolean LLILZIL;

    private final Drawable getGradientStrokeDrawable() {
        int iLIZ = (int) C0DJ1.LIZ(2);
        float fLIZIZ = C418440Gaw.LIZIZ(16);
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TL_BR, new int[]{ColorProtector.parseColor("#A180FF"), ColorProtector.parseColor("#D167FB")});
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(fLIZIZ);
        gradientDrawable.setSize(200, 200);
        gradientDrawable.setColor(0);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(0);
        gradientDrawable2.setCornerRadius(fLIZIZ - iLIZ);
        gradientDrawable2.setColor(0);
        LayerDrawable layerDrawable = new LayerDrawable(new GradientDrawable[]{gradientDrawable, gradientDrawable2});
        layerDrawable.setLayerInset(1, iLIZ, iLIZ, iLIZ, iLIZ);
        return layerDrawable;
    }

    public final TuxIconView getIcon() {
        return this.LLILZ;
    }

    public final TuxTextView getName() {
        return this.LLILLL;
    }

    public final View getRoot() {
        return this.LLILLJJLI;
    }

    public final View getShadow() {
        return this.LL;
    }

    public final void setIcon(TuxIconView tuxIconView) {
        this.LLILZ = tuxIconView;
    }

    public final void setName(TuxTextView tuxTextView) {
        this.LLILLL = tuxTextView;
    }

    public final void setRoot(View view) {
        this.LLILLJJLI = view;
    }

    public final void setShadow(View view) {
        this.LL = view;
    }

    public final void setVisibleToUser(boolean z) {
        this.LLILZIL = z;
    }

    public AbstractC421070GfB(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LinearLayout.inflate(context, R.layout.ak_, this);
        this.LL = findViewById(R.id.a1e);
        this.LLILLJJLI = findViewById(R.id.a1h);
        this.LLILLL = (TuxTextView) findViewById(R.id.a1g);
        this.LLILZ = (TuxIconView) findViewById(R.id.a1c);
    }
}

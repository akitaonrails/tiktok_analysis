package X;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0GfS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C421240GfS extends FrameLayout implements InterfaceC438770HIl {
    public final TextView LL;
    public final FrameLayout LLILLJJLI;
    public final float LLILLL;

    @Override // X.InterfaceC438770HIl
    public final View LLLILZJ() {
        return this;
    }

    public final FrameLayout getFl() {
        return this.LLILLJJLI;
    }

    public final TextView getTv() {
        return this.LL;
    }

    public C421240GfS(Context context) {
        super(context, null, 0);
        this.LLILLL = C339190DRl.LIZ(20);
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.d1g, this, true);
        this.LLILLJJLI = (FrameLayout) findViewById(R.id.ibk);
        TextView textView = (TextView) findViewById(R.id.tv_watermark);
        this.LL = textView;
        if (textView != null) {
            textView.setShadowLayer(4.0f, C339190DRl.LIZ(0), C339190DRl.LIZ(1), Color.argb(C814420VxA.LIZIZ(102.0f), 0, 0, 0));
            textView.setTypeface(C1697580uHE.LIZIZ(0.0f, 500, 0.0f, 0.0f, null, 0.0f, 0, null, 253));
        }
    }

    @Override // X.InterfaceC438770HIl
    public final void LIZ(float f) {
        TextView textView = this.LL;
        if (textView != null) {
            textView.setTextSize(1, 24.0f * f);
        }
        int iLIZIZ = C814420VxA.LIZIZ(this.LLILLL * f);
        FrameLayout frameLayout = this.LLILLJJLI;
        if (frameLayout != null) {
            C426750GoL.LJIIL(frameLayout, Integer.valueOf(iLIZIZ), Integer.valueOf(iLIZIZ), Integer.valueOf(iLIZIZ), Integer.valueOf(iLIZIZ), 16);
        }
    }

    public final void setTvWatermarkText(CharSequence charSequence) {
        TextView textView = this.LL;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}

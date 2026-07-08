package X;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Ehj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C371690Ehj extends LinearLayout {
    public final float LL;
    public final TuxIconDrawable LLILLJJLI;

    @Override // android.widget.LinearLayout, android.view.View
    public final void onDraw(Canvas canvas) {
        float fLIZ;
        super.onDraw(canvas);
        float f = 2;
        canvas.rotate(350.0f, C11VU.LIZ(290.0f) / f, C11VU.LIZ(115.0f) / f);
        canvas.translate(-C11VU.LIZ(21.0f), -C11VU.LIZ(30.0f));
        int i = 0;
        do {
            float fLIZ2 = 0.0f;
            if (i % 2 == 0) {
                fLIZ = C11VU.LIZ(52.0f);
            } else {
                fLIZ = 0.0f;
            }
            if (i != 0) {
                fLIZ2 = (C11VU.LIZ(5.0f) + this.LL) * i;
            }
            int i2 = 0;
            do {
                float f2 = this.LL;
                this.LLILLJJLI.setBounds((int) fLIZ, (int) fLIZ2, (int) (fLIZ + f2), (int) (f2 + fLIZ2));
                this.LLILLJJLI.draw(canvas);
                fLIZ += this.LL + C11VU.LIZ(85.0f);
                i2++;
            } while (i2 < 3);
            i++;
        } while (i < 5);
    }

    public C371690Ehj(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        float fLIZ = C11VU.LIZ(19.0f);
        this.LL = fLIZ;
        C419910GdJ c419910GdJ = new C419910GdJ();
        int i = (int) fLIZ;
        c419910GdJ.LIZJ = i;
        c419910GdJ.LIZIZ = i;
        c419910GdJ.LIZ = R.raw.icon_color_tiktok_logo_light;
        this.LLILLJJLI = c419910GdJ.LIZ(context);
    }
}

package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0DXb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C340650DXb {
    public final C19GS LIZ;
    public final FrameLayout LIZIZ;
    public final int LIZJ = (int) C11VU.LIZ(60.0f);
    public final int LIZLLL = (int) C11VU.LIZ(80.0f);
    public final int LJ = (int) C11VU.LIZ(24.0f);
    public final int LJFF = (int) C11VU.LIZ(16.0f);
    public final int LJI = (int) C11VU.LIZ(40.0f);
    public final int LJII = (int) C11VU.LIZ(36.0f);
    public final int LJIIIIZZ = (int) C11VU.LIZ(8.0f);
    public final int LJIIIZ = (int) C11VU.LIZ(0.5f);
    public final int LJIIJ = (int) C11VU.LIZ(28.5f);

    public final void LIZ() {
        FrameLayout frameLayout = this.LIZIZ;
        LinearLayout linearLayout = new LinearLayout(this.LIZ);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        C786410Ut5.d6(linearLayout, new FrameLayout.LayoutParams(-1, -2));
        TuxIconView tuxIconView = new TuxIconView(this.LIZ, null, 0, 6, null);
        tuxIconView.setIconRes(R.raw.icon_tick_circle_fill);
        tuxIconView.setTintColorRes(R.attr.a0i);
        int i = this.LJI;
        C786410Ut5.M6(tuxIconView, new LinearLayout.LayoutParams(i, i));
        TuxTextView tuxTextView = new TuxTextView(this.LIZ, null, 6, 0);
        tuxTextView.setTuxFont(33);
        tuxTextView.setTextColor(C960203pA.LIZ(R.attr.a1h, this.LIZ));
        tuxTextView.setText(this.LIZ.getString(2131838248));
        tuxTextView.setGravity(1);
        C786410Ut5.R6(tuxTextView, new LinearLayout.LayoutParams(-1, -2));
        View view = new View(this.LIZ);
        view.setBackgroundColor(C960203pA.LIZ(R.attr.ng, this.LIZ));
        C786410Ut5.W5(view, new LinearLayout.LayoutParams(-1, this.LJIIIZ));
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) tuxIconView.getLayoutParams();
        layoutParams.topMargin = this.LJII;
        layoutParams.bottomMargin = this.LJIIIIZZ;
        C786410Ut5.M6(tuxIconView, layoutParams);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) tuxTextView.getLayoutParams();
        marginLayoutParams.setMarginStart(this.LJFF);
        marginLayoutParams.setMarginEnd(this.LJFF);
        C786410Ut5.R6(tuxTextView, marginLayoutParams);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) view.getLayoutParams();
        int i2 = this.LJFF;
        layoutParams2.topMargin = this.LJIIJ;
        layoutParams2.setMarginEnd(i2);
        layoutParams2.setMarginStart(i2);
        C786410Ut5.W5(view, layoutParams2);
        linearLayout.addView(tuxIconView);
        linearLayout.addView(tuxTextView);
        linearLayout.addView(view);
        frameLayout.addView(linearLayout);
    }

    public final void LIZIZ(String str) {
        FrameLayout frameLayout = this.LIZIZ;
        LinearLayout linearLayout = new LinearLayout(this.LIZ);
        linearLayout.setOrientation(1);
        C786410Ut5.d6(linearLayout, new FrameLayout.LayoutParams(-1, -2));
        final C19GS c19gs = this.LIZ;
        SmartImageView smartImageView = new SmartImageView(c19gs) { // from class: X.0F4h
            public final float LLIZLLLIL;
            public final Paint LLJ;
            public final Path LLJI;

            @Override // X.C1322090kVb, android.widget.ImageView, android.view.View
            public final void onDetachedFromWindow() {
                super.onDetachedFromWindow();
                C20597815iq.LIZ(this);
            }

            {
                super(c19gs);
                float fLIZ = C11VU.LIZ(0.5f);
                this.LLIZLLLIL = C11VU.LIZ(2.0f);
                int iLIZ = C960203pA.LIZ(R.attr.ng, c19gs);
                Paint paint = new Paint();
                paint.setAntiAlias(true);
                paint.setColor(iLIZ);
                paint.setStrokeWidth(fLIZ);
                paint.setStyle(Paint.Style.STROKE);
                this.LLJ = paint;
                this.LLJI = new Path();
            }

            @Override // com.bytedance.lighten.loader.SmartImageView, X.C1322110kVd, X.C1322100kVc, X.C1322090kVb, android.widget.ImageView, android.view.View
            public final void onDraw(Canvas canvas) {
                try {
                    Path path = this.LLJI;
                    float width = getWidth();
                    float height = getHeight();
                    float f = this.LLIZLLLIL;
                    path.addRoundRect(0.0f, 0.0f, width, height, f, f, Path.Direction.CW);
                    canvas.save();
                    canvas.clipPath(this.LLJI);
                    super.onDraw(canvas);
                    canvas.restore();
                    canvas.drawPath(this.LLJI, this.LLJ);
                } catch (RuntimeException e) {
                    TryCatchGuardChecker.doCheck(e);
                    BitmapCrashChecker.doCheck(e, this);
                    throw e;
                }
            }
        };
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.LIZJ, this.LIZLLL);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(smartImageView);
        smartImageView.setLayoutParams(layoutParams);
        C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str);
        c1331670kl3LJIIIZ.LJJIIZ(R.drawable.bbs);
        c1331670kl3LJIIIZ.LJJIL(this.LIZ);
        c1331670kl3LJIIIZ.LJJ(smartImageView);
        c1331670kl3LJIIIZ.LIZLLL("dislike reason");
        c1331670kl3LJIIIZ.LJIIJ(new C346170Dhf(1));
        TuxTextView tuxTextView = new TuxTextView(this.LIZ, null, 6, 0);
        tuxTextView.setTuxFont(23);
        tuxTextView.setTextColor(C960203pA.LIZ(R.attr.a1h, this.LIZ));
        tuxTextView.setText(this.LIZ.getString(2131838241));
        tuxTextView.setGravity(1);
        C786410Ut5.R6(tuxTextView, new LinearLayout.LayoutParams(-1, -2));
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) smartImageView.getLayoutParams();
        layoutParams2.gravity = 1;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(smartImageView);
        smartImageView.setLayoutParams(layoutParams2);
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) tuxTextView.getLayoutParams();
        layoutParams3.topMargin = this.LJ;
        layoutParams3.setMarginStart(this.LJFF);
        layoutParams3.setMarginEnd(this.LJFF);
        C786410Ut5.R6(tuxTextView, layoutParams3);
        linearLayout.addView(smartImageView);
        linearLayout.addView(tuxTextView);
        frameLayout.addView(linearLayout);
    }

    public C340650DXb(C19GS c19gs, FrameLayout frameLayout) {
        this.LIZ = c19gs;
        this.LIZIZ = frameLayout;
    }
}

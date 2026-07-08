package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Gpl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C427630Gpl extends FrameLayout {
    public final SmartImageView LL;
    public final TuxIconView LLILLJJLI;
    public final View LLILLL;
    public C428010GqN LLILZ;
    public final C1331730kl9 LLILZIL;
    public final Paint LLILZLL;
    public final Paint LLIZ;
    public final Path LLIZLLLIL;
    public final Path LLJ;
    public final Path LLJI;
    public Bitmap LLJIJIL;

    public C428010GqN getUiData() {
        return this.LLILZ;
    }

    public C427630Gpl(Context context) {
        super(context, null);
        Paint paint = new Paint();
        this.LLILZLL = paint;
        Paint paint2 = new Paint();
        this.LLIZ = paint2;
        Path path = new Path();
        this.LLIZLLLIL = path;
        Path path2 = new Path();
        this.LLJ = path2;
        Path path3 = new Path();
        this.LLJI = path3;
        SmartImageView smartImageView = new SmartImageView(getContext());
        this.LL = smartImageView;
        C786410Ut5.G6(this.LL, new FrameLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32))));
        ((FrameLayout.LayoutParams) smartImageView.getLayoutParams()).gravity = 17;
        addView(smartImageView);
        TuxIconView tuxIconView = new TuxIconView(getContext(), null, 0, 6, null);
        this.LLILLJJLI = tuxIconView;
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_image_slash;
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
        c419910GdJ.LJ = Integer.valueOf(R.attr.a1p);
        tuxIconView.setTuxIcon(c419910GdJ);
        C786410Ut5.M6(this.LLILLJJLI, new FrameLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20))));
        ((FrameLayout.LayoutParams) tuxIconView.getLayoutParams()).gravity = 17;
        C786410Ut5.LLLLLLZZ(tuxIconView, 8);
        addView(tuxIconView);
        View view = new View(getContext());
        this.LLILLL = view;
        C786410Ut5.W5(this.LLILLL, new FrameLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(38)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(38))));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = -C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3));
        layoutParams.setMarginStart(-C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3)));
        view.setBackgroundResource(R.drawable.b3f);
        C786410Ut5.LJLLLLLL(8, view);
        addView(view);
        ViewGroup.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)));
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(layoutParams2);
        C1331750klB c1331750klB = new C1331750klB();
        c1331750klB.LJ = C12ES.LIZJ(4.0f, context);
        c1331750klB.LIZJ = C960203pA.LIZ(R.attr.ng, context);
        c1331750klB.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(0.5d)));
        this.LLILZIL = new C1331730kl9(c1331750klB);
        setClipChildren(false);
        float fLIZIZ = C418440Gaw.LIZIZ(Float.valueOf(4.0f));
        float fLIZIZ2 = C418440Gaw.LIZIZ(32);
        paint2.setColor(-1);
        paint2.setStyle(Paint.Style.FILL);
        Float fValueOf = Float.valueOf(1.0f);
        paint2.setStrokeWidth(C418440Gaw.LIZIZ(fValueOf));
        float f = fLIZIZ / 4.0f;
        float f2 = fLIZIZ / 2.0f;
        path.moveTo(f, fLIZIZ2 - f2);
        float f3 = fLIZIZ2 - (fLIZIZ / 2);
        path.lineTo(f3, f);
        float f4 = fLIZIZ2 - f;
        path.lineTo(f4, f2);
        path.lineTo(f2, f4);
        path.close();
        paint.setColor(C960203pA.LIZ(R.attr.ng, getContext()));
        paint.setStrokeWidth(C418440Gaw.LIZIZ(fValueOf));
        path2.moveTo(f, f3);
        path2.lineTo(f3, f);
        path3.moveTo(f2, f4);
        path3.lineTo(f4, f2);
    }

    public void setUiData(C428010GqN c428010GqN) {
        this.LLILZ = c428010GqN;
    }
}

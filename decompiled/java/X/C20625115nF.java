package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.15nF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20625115nF extends LinearLayout implements InterfaceC1207430hWf {
    public static final /* synthetic */ int LLJI = 0;
    public final TuxTextView LL;
    public final FrameLayout LLILLJJLI;
    public final FrameLayout LLILLL;
    public final FrameLayout LLILZ;
    public final ImageView LLILZIL;
    public Bitmap LLILZLL;
    public int LLIZ;
    public int LLIZLLLIL;
    public Bitmap LLJ;

    /* JADX WARN: Removed duplicated region for block: B:37:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ() {
        /*
            Method dump skipped, instruction units count: 696
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20625115nF.LIZ():void");
    }

    public final void LIZJ() {
        this.LLILZIL.setImageBitmap(null);
        Bitmap bitmap = this.LLILZLL;
        if (bitmap != null) {
            bitmap.recycle();
            BitmapCrashChecker.recordBitmapRecyclePoint(bitmap);
        }
        this.LLILZLL = null;
        Bitmap bitmap2 = this.LLJ;
        if (bitmap2 != null) {
            bitmap2.recycle();
            BitmapCrashChecker.recordBitmapRecyclePoint(bitmap2);
        }
        this.LLJ = null;
        this.LLIZ = 0;
        this.LLIZLLLIL = 0;
    }

    public final void LIZLLL() {
        FrameLayout frameLayout = this.LLILLJJLI;
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setAnimationListener(new C16H6(this, 1));
        alphaAnimation.setDuration(250L);
        alphaAnimation.setStartOffset(0L);
        frameLayout.startAnimation(alphaAnimation);
        TuxTextView tuxTextView = this.LL;
        AnimationSet animationSet = new AnimationSet(true);
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation2.setDuration(400L);
        alphaAnimation2.setStartOffset(150L);
        animationSet.addAnimation(alphaAnimation2);
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 16.0f, 0.0f);
        translateAnimation.setDuration(400L);
        translateAnimation.setStartOffset(150L);
        translateAnimation.setInterpolator(new C21388418n4());
        animationSet.addAnimation(translateAnimation);
        animationSet.setAnimationListener(new C16H6(this, 2));
        tuxTextView.startAnimation(animationSet);
    }

    @Override // X.InterfaceC1207430hWf
    public final void hide() {
        ViewGroup viewGroup;
        Animation animation = this.LLILLJJLI.getAnimation();
        if (animation != null) {
            animation.cancel();
        }
        Animation animation2 = this.LL.getAnimation();
        if (animation2 != null) {
            animation2.cancel();
        }
        try {
            if (getParent() != null) {
                ViewParent parent = getParent();
                if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                    C786410Ut5.LJJJLZIJ(this, viewGroup);
                }
            }
            LIZJ();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LIZJ();
            throw th;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        LIZJ();
    }

    public C20625115nF(Context context) {
        super(context, null, 0);
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.dk1, this, true);
        TuxTextView tuxTextView = (TuxTextView) findViewById(R.id.zf0);
        this.LL = tuxTextView;
        C786410Ut5.LLLLZLL(tuxTextView, 4);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.nav);
        this.LLILLJJLI = frameLayout;
        this.LLILLL = (FrameLayout) findViewById(R.id.i3i);
        this.LLILZ = (FrameLayout) findViewById(R.id.eux);
        this.LLILZIL = (ImageView) findViewById(R.id.la4);
        C786410Ut5.LJZ(4, frameLayout);
        frameLayout.setOutlineProvider(new C0IDA(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), 4));
        frameLayout.setClipToOutline(true);
        frameLayout.addOnLayoutChangeListener(new C16HB(this, 4));
    }

    public final void LIZIZ(View view) {
        try {
            this.LLIZ = view.getWidth();
            int height = view.getHeight();
            this.LLIZLLLIL = height;
            int i = this.LLIZ / 4;
            int i2 = height / 4;
            if (i > 0 && i2 > 0) {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                canvas.scale(0.25f, 0.25f);
                C842150X1x.LIZIZ(canvas, view);
                this.LLILZLL = bitmapCreateBitmap;
                return;
            }
            this.LLIZ = 0;
            this.LLIZLLLIL = 0;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            this.LLIZ = 0;
            this.LLIZLLLIL = 0;
        }
    }
}

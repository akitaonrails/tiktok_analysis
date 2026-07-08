package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SalePropTag;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04HV, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C04HV extends FrameLayout {
    public static final int LLILZIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(46));
    public static final int LLILZLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1));
    public static final float LLIZ = C418440Gaw.LIZIZ(2);
    public static final float LLIZLLLIL = C418440Gaw.LIZIZ(2);
    public static final float LLJ = C418440Gaw.LIZIZ(8);
    public static final int LLJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
    public static final int LLJIJIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(42));
    public final SmartImageView LL;
    public final C04HZ LLILLJJLI;
    public final TuxTextView LLILLL;
    public Image LLILZ;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [X.04HZ, android.view.View, java.lang.Object] */
    public C04HV(final Context context) {
        super(context, null, 0);
        int i = LLILZIL;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(i, i);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(layoutParams);
        setClipChildren(false);
        setClipToOutline(false);
        setClipToPadding(false);
        SmartImageView smartImageView = new SmartImageView(context);
        int i2 = LLJI;
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i2, i2);
        layoutParams2.gravity = 17;
        C786410Ut5.G6(smartImageView, layoutParams2);
        this.LL = smartImageView;
        addView(smartImageView);
        ?? r3 = new View(context) { // from class: X.04HZ
            public final Paint LL;

            {
                super(context, null, 0);
                Paint paint = new Paint();
                this.LL = paint;
                paint.setStyle(Paint.Style.FILL);
                paint.setStrokeWidth(C0H9H.LIZ(1));
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a02, context);
                paint.setColor(numLIZJ != null ? numLIZJ.intValue() : 0);
            }

            @Override // android.view.View
            public final void onDraw(Canvas canvas) {
                super.onDraw(canvas);
                canvas.drawLine(getWidth(), 0.0f, 0.0f, getHeight(), this.LL);
            }
        };
        int i3 = LLJIJIL;
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(i3, i3);
        layoutParams3.gravity = 17;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(r3);
        r3.setLayoutParams(layoutParams3);
        this.LLILLJJLI = r3;
        addView(r3);
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams4.gravity = 8388613;
        C786410Ut5.R6(tuxTextView, layoutParams4);
        tuxTextView.setMaxLines(1);
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView.setMaxWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48)));
        C426750GoL.LJIIL(tuxTextView, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1))), 16);
        tuxTextView.setGravity(17);
        tuxTextView.setTextColorRes(R.attr.gp);
        tuxTextView.setTuxFont(92);
        C786410Ut5.LLLLZLL(tuxTextView, 8);
        this.LLILLL = tuxTextView;
        addView(tuxTextView);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(boolean r8, boolean r9, boolean r10) {
        /*
            r7 = this;
            r2 = 0
            if (r9 == 0) goto L9b
            android.content.Context r1 = r7.getContext()
            r0 = 2131100632(0x7f0603d8, float:1.781365E38)
            java.lang.Integer r0 = X.C1308910kAL.LIZJ(r0, r1)
            if (r0 == 0) goto Lae
            int r6 = r0.intValue()
        L14:
            if (r8 == 0) goto L89
            r0 = 0
            java.lang.Float r1 = java.lang.Float.valueOf(r0)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            kotlin.Pair r5 = new kotlin.Pair
            r5.<init>(r1, r0)
        L24:
            android.graphics.drawable.GradientDrawable r4 = new android.graphics.drawable.GradientDrawable
            r4.<init>()
            int r3 = X.C04HV.LLILZLL
            java.lang.Object r0 = r5.getFirst()
            java.lang.Number r0 = (java.lang.Number) r0
            float r1 = r0.floatValue()
            java.lang.Object r0 = r5.getSecond()
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            r4.setStroke(r3, r6, r1, r0)
            float r0 = X.C04HV.LLJ
            r4.setCornerRadius(r0)
            r7.setBackground(r4)
            r3 = 8
            if (r8 == 0) goto L6d
            com.bytedance.lighten.loader.SmartImageView r1 = r7.LL
            r0 = 1065353216(0x3f800000, float:1.0)
            X.C786410Ut5.u5(r1, r0)
            X.04HZ r1 = r7.LLILLJJLI
            int r0 = r1.getVisibility()
            r1.setVisibility(r3)
            X.C1602160rnK.LIZIZ(r0, r3, r1)
            com.bytedance.tux.input.TuxTextView r0 = r7.LLILLL
            if (r0 == 0) goto L6c
            if (r10 != 0) goto L69
            r2 = 8
        L69:
            X.C786410Ut5.LLLLZLL(r0, r2)
        L6c:
            return
        L6d:
            com.bytedance.lighten.loader.SmartImageView r1 = r7.LL
            r0 = 1050253722(0x3e99999a, float:0.3)
            X.C786410Ut5.u5(r1, r0)
            X.04HZ r1 = r7.LLILLJJLI
            int r0 = r1.getVisibility()
            r1.setVisibility(r2)
            X.C1602160rnK.LIZIZ(r0, r2, r1)
            com.bytedance.tux.input.TuxTextView r0 = r7.LLILLL
            if (r0 == 0) goto L6c
            X.C786410Ut5.LLLLZLL(r0, r3)
            return
        L89:
            float r0 = X.C04HV.LLIZ
            java.lang.Float r1 = java.lang.Float.valueOf(r0)
            float r0 = X.C04HV.LLIZLLLIL
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            kotlin.Pair r5 = new kotlin.Pair
            r5.<init>(r1, r0)
            goto L24
        L9b:
            android.content.Context r1 = r7.getContext()
            r0 = 2131100568(0x7f060398, float:1.7813521E38)
            java.lang.Integer r0 = X.C1308910kAL.LIZJ(r0, r1)
            if (r0 == 0) goto Lae
            int r6 = r0.intValue()
            goto L14
        Lae:
            r6 = 0
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C04HV.LIZIZ(boolean, boolean, boolean):void");
    }

    public final void LIZ(Image image, boolean z, boolean z2, SalePropTag salePropTag) {
        boolean z3;
        TuxTextView tuxTextView;
        if (!Intrinsics.LJFF(this.LLILZ, image)) {
            this.LLILZ = image;
            C1326790kdB.LIZ.getClass();
            C1331670kl3 c1331670kl3LJ = C1326790kdB.LJ(image);
            C1331750klB c1331750klB = new C1331750klB();
            c1331750klB.LJ = C418440Gaw.LIZIZ(4);
            c1331670kl3LJ.LJJI = new C1331730kl9(c1331750klB);
            c1331670kl3LJ.LJJIIZI(C1308910kAL.LJ(R.attr.a03, getContext()));
            c1331670kl3LJ.LJJ = EnumC1338240kve.CENTER_CROP;
            c1331670kl3LJ.LJJ(this.LL);
            c1331670kl3LJ.LJIIJJI();
        }
        if (salePropTag != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        LIZIZ(z, z2, z3);
        if (salePropTag != null && (tuxTextView = this.LLILLL) != null) {
            C1749180vcS c1749180vcS = C1749180vcS.LIZ;
            Context context = getContext();
            c1749180vcS.getClass();
            C1749180vcS.LIZIZ(context, tuxTextView, salePropTag, 0, 0);
        }
    }
}

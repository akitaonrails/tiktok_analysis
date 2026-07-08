package X;

import Y.ARunnableS108S0100000_8;
import Y.ARunnableS121S0100000_21;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Spanned;
import android.text.style.ReplacementSpan;
import android.view.View;
import android.widget.TextView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.agilelogger.ALog;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.AwS564S0100000_20;

/* JADX INFO: renamed from: X.0kaq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1325340kaq extends ReplacementSpan implements C0MG4 {
    public static final WeakHashMap<View, C0P0T> LLJILJIL = new WeakHashMap<>();
    public static final Executor LLJILJILJ = C786410Ut5.d4(2);
    public final C565460MFs LL;
    public Bitmap LLILLJJLI;
    public boolean LLILLL;
    public boolean LLILZ;
    public String LLJI;
    public final int LLILZIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
    public final int LLILZLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
    public final int LLIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(363));
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS552S0100000_8(this, 886));
    public final C01GW LLJIJIL = C452501pT.LIZ(EnumC452301pR.NONE, new AwS564S0100000_20(this, 24));

    public final C557390LtZ LIZIZ() {
        return C557390LtZ.LIZ(this.LL.LIZ, this.LLJI, null, 111);
    }

    public final void LIZLLL() {
        C565460MFs c565460MFs = this.LL;
        View view = c565460MFs.LIZIZ;
        if (!(view instanceof TextView)) {
            HandlerHook.viewPost(c565460MFs.LIZIZ, new ARunnableS108S0100000_8(this, 105));
        } else {
            TextView textView = (TextView) view;
            HandlerHook.viewPost(textView, new ARunnableS121S0100000_21(textView, 104));
        }
    }

    public final void LJ() {
        Context context = this.LL.LIZIZ.getContext();
        Drawable drawableMutate = ((Drawable) this.LLJ.getValue()).mutate();
        Drawable drawableMutate2 = ((C419910GdJ) this.LLIZLLLIL.getValue()).LIZ(context).mutate();
        int i = this.LLILZIL;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        int i2 = this.LLILZIL;
        drawableMutate.setBounds(0, 0, i2, i2);
        drawableMutate.draw(canvas);
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
        int i3 = this.LLILZIL;
        int i4 = (i3 - iLIZIZ) / 2;
        int i5 = (i3 - iLIZIZ) / 2;
        drawableMutate2.setBounds(i4, i5, i4 + iLIZIZ, iLIZIZ + i5);
        drawableMutate2.draw(canvas);
        this.LLILLJJLI = bitmapCreateBitmap;
        this.LLILZ = false;
        this.LLILLL = false;
        LIZLLL();
    }

    public C1325340kaq(C565460MFs c565460MFs) {
        this.LL = c565460MFs;
        this.LLJI = c565460MFs.LIZ.LJ;
    }

    public final int LIZJ(int i, CharSequence charSequence) {
        Spanned spanned;
        if (i <= 0) {
            return 0;
        }
        int i2 = i - 1;
        if (charSequence.charAt(i2) == '\n') {
            return 0;
        }
        if ((charSequence instanceof Spanned) && (spanned = (Spanned) charSequence) != null) {
            if (i2 < 0) {
                i2 = 0;
            }
            for (C1325340kaq c1325340kaq : (C1325340kaq[]) spanned.getSpans(i2, i, C1325340kaq.class)) {
                if (spanned.getSpanEnd(c1325340kaq) == i) {
                    return 0;
                }
            }
            return this.LLILZLL;
        }
        return this.LLILZLL;
    }

    public final void LJFF(final long j, final String str) {
        if (Build.VERSION.SDK_INT < 28) {
            LJ();
            return;
        }
        final Context contextN3 = C786410Ut5.N3(this.LL.LIZIZ.getContext());
        final int iMax = Math.max(this.LLILZIL * 4, 128);
        LLJILJILJ.execute(new Runnable() { // from class: X.0cGv
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("AITheaterImageSpan@792c.tryPlatformDecoderFallback$1");
                try {
                    final Bitmap bitmapLIZ = C2201308jr.LIZ(contextN3, iMax, str);
                    final C1325340kaq c1325340kaq = this;
                    View view = c1325340kaq.LL.LIZIZ;
                    final long j2 = j;
                    final String str2 = str;
                    HandlerHook.viewPost(view, new Runnable() { // from class: X.0cGw
                        public final void LIZ() {
                            if (bitmapLIZ == null) {
                                c1325340kaq.LJ();
                                return;
                            }
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("loadByLighten ImageDecoder cost ");
                            sbLIZ.append(System.currentTimeMillis() - j2);
                            sbLIZ.append(", url: ");
                            sbLIZ.append(str2);
                            ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI("AITheaterImageSpan", C2188811AlT.LIZIZ(sbLIZ));
                            C1325340kaq c1325340kaq2 = c1325340kaq;
                            Bitmap bitmap = bitmapLIZ;
                            int i = c1325340kaq2.LLILZIL;
                            c1325340kaq2.LLILLJJLI = C1325340kaq.LIZ(i, i, bitmap);
                            C1325340kaq c1325340kaq3 = c1325340kaq;
                            c1325340kaq3.LLILZ = true;
                            c1325340kaq3.LLILLL = false;
                            c1325340kaq3.LIZLLL();
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ2;
                            C1C7U.LIZ("AITheaterImageSpan@792c.tryPlatformDecoderFallback$1$1");
                            try {
                                LIZ();
                            } finally {
                                if (!zLIZ2) {
                                }
                            }
                            C1C7U.LIZIZ("AITheaterImageSpan@792c.tryPlatformDecoderFallback$1$1");
                        }
                    });
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("AITheaterImageSpan@792c.tryPlatformDecoderFallback$1");
            }
        });
    }

    public static Bitmap LIZ(int i, int i2, Bitmap bitmap) {
        if (bitmap == null || bitmap.getWidth() <= 0 || bitmap.getHeight() <= 0) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 26 && bitmap.getConfig() == Bitmap.Config.HARDWARE && (bitmap = bitmap.copy(Bitmap.Config.ARGB_8888, false)) == null) {
            return null;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        float f = i;
        float f2 = i2;
        float fMax = Math.max((f * 1.0f) / bitmap.getWidth(), (1.0f * f2) / bitmap.getHeight());
        Matrix matrix = new Matrix();
        matrix.setScale(fMax, fMax);
        matrix.postTranslate((f - (bitmap.getWidth() * fMax)) / 2.0f, (f2 - (bitmap.getHeight() * fMax)) / 2.0f);
        new Canvas(bitmapCreateBitmap).drawBitmap(bitmap, matrix, new Paint(2));
        return bitmapCreateBitmap;
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        int i3;
        int i4;
        int i5;
        int i6;
        int iLIZJ = LIZJ(i, charSequence);
        int i7 = this.LLILZLL;
        int i8 = this.LLILZIL;
        int i9 = iLIZJ + i8 + i7;
        if (fontMetricsInt != null && (i3 = i8 + (this.LLIZ * 2)) > (i6 = (i4 = fontMetricsInt.descent) - (i5 = fontMetricsInt.ascent))) {
            int i10 = (i3 - i6) / 2;
            int i11 = i5 - i10;
            fontMetricsInt.ascent = i11;
            fontMetricsInt.top = i11;
            int i12 = i4 + i10;
            fontMetricsInt.descent = i12;
            fontMetricsInt.bottom = i12;
        }
        return i9;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x01af A[PHI: r4
      0x01af: PHI (r4v5 java.lang.String) = (r4v4 java.lang.String), (r4v6 java.lang.String) binds: [B:47:0x01ad, B:70:0x0257] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01b5  */
    @Override // android.text.style.ReplacementSpan
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void draw(android.graphics.Canvas r13, java.lang.CharSequence r14, int r15, int r16, float r17, int r18, int r19, int r20, android.graphics.Paint r21) {
        /*
            Method dump skipped, instruction units count: 614
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1325340kaq.draw(android.graphics.Canvas, java.lang.CharSequence, int, int, float, int, int, int, android.graphics.Paint):void");
    }
}

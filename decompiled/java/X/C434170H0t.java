package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.text.Layout;
import android.text.TextPaint;
import android.text.style.LineHeightSpan;
import android.text.style.ReplacementSpan;
import android.view.View;
import androidx.lifecycle.LifecycleCoroutineScope;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.ss.android.ugc.aweme.tako.ccl.model.api.BaseImage;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoVideoItem;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: renamed from: X.0H0t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C434170H0t extends ReplacementSpan implements InterfaceC431020GvE, InterfaceC434190H0v, LineHeightSpan.WithDensity {
    public static final int LLJJIJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(22));
    public static final int LLJJIJIIJIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18));
    public static final int LLJJIJIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));
    public static final int LLJJJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3));
    public static final int LLJJJIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
    public static final float LLJJJJ = C418440Gaw.LIZIZ(Double.valueOf(0.3d));
    public static final float LLJJJJJIL = C418440Gaw.LIZIZ(4);
    public final /* synthetic */ C434230H0z LL = new C434230H0z(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)));
    public final C1860130yVP LLILLJJLI;
    public final String LLILLL;
    public final C603820NmG<String, AnonymousClass0957<Bitmap>> LLILZ;
    public final InterfaceC383701eN LLILZIL;
    public final InterfaceC434180H0u LLILZLL;
    public Bitmap LLIZ;
    public final Paint.FontMetricsInt LLIZLLLIL;
    public final Paint.FontMetricsInt LLJ;
    public final int LLJI;
    public final TakoVideoItem LLJIJIL;
    public final TuxIconDrawable LLJILJIL;
    public final C444890HcV LLJILJILJ;
    public final C01GW LLJILLL;
    public final C01GW LLJJ;
    public final C01GW LLJJI;
    public final C01GW LLJJIII;

    @Override // X.InterfaceC431020GvE
    public final void LIZJ() {
    }

    @Override // X.InterfaceC431020GvE
    public final void LIZLLL() {
    }

    @Override // X.InterfaceC431020GvE
    public final void LJ() {
    }

    @Override // X.InterfaceC431020GvE
    public final void LJFF(InterfaceC328600CuQ interfaceC328600CuQ) {
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        this.LL.getClass();
    }

    @Override // android.text.style.LineHeightSpan.WithDensity
    public final void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt, TextPaint textPaint) {
        this.LL.chooseHeight(charSequence, i, i2, i3, i4, fontMetricsInt, textPaint);
    }

    public final Context LIZ() {
        return this.LLILLJJLI.getContext();
    }

    public final int LIZIZ() {
        int iLJI;
        int iLIZIZ;
        if (this.LLJIJIL == null) {
            return LJI();
        }
        int i = this.LLJI;
        if (i == 0 || i == 1) {
            iLJI = LJI();
            iLIZIZ = LLJJIJIIJIL;
        } else {
            iLJI = LJI() + LLJJIJIIJIL + LLJJIJIL + LLJJJIL;
            C444890HcV c444890HcV = this.LLJILJILJ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('+');
            sbLIZ.append(this.LLJI - 1);
            iLIZIZ = C814420VxA.LIZIZ(c444890HcV.measureText(C2188811AlT.LIZIZ(sbLIZ)));
        }
        return iLJI + iLIZIZ;
    }

    public final int LJI() {
        return ((Number) this.LLJJIII.getValue()).intValue();
    }

    @Override // X.InterfaceC431020GvE
    public final void onClick(View view) {
        this.LLILZLL.b2(view, this.LLILLL);
    }

    public final void LJII(BaseImage baseImage, String str, AnonymousClass0957<Bitmap> anonymousClass0957, int i) {
        LifecycleCoroutineScope lifecycleCoroutineScopePa = this.LLILZLL.pa();
        Context contextLIZ = LIZ();
        C23250099c.LIZLLL(lifecycleCoroutineScopePa, C0PEM.LIZJ, null, new C434210H0x(anonymousClass0957, new WeakReference(this), str, contextLIZ, baseImage, i, null), 2);
    }

    public C434170H0t(C1860130yVP c1860130yVP, String str, C0H1N c0h1n, C1DEV c1dev, InterfaceC434180H0u interfaceC434180H0u) {
        int iIntValue;
        int iIntValue2;
        Object c098200Yq;
        this.LLILLJJLI = c1860130yVP;
        this.LLILLL = str;
        this.LLILZ = c0h1n;
        this.LLILZIL = c1dev;
        this.LLILZLL = interfaceC434180H0u;
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_play_fill;
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zi, LIZ());
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        c419910GdJ.LIZLLL = Integer.valueOf(Color.argb(C814420VxA.LIZ(229.5d), Color.red(iIntValue), Color.green(iIntValue), Color.blue(iIntValue)));
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
        this.LLIZLLLIL = new Paint.FontMetricsInt();
        this.LLJ = new Paint.FontMetricsInt();
        this.LLJILJIL = c419910GdJ.LIZ(LIZ());
        C444890HcV c444890HcV = new C444890HcV();
        this.LLJILJILJ = c444890HcV;
        this.LLJILLL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 1161));
        this.LLJJ = C452501pT.LIZIZ(new AwS550S0100000_6(this, 1162));
        this.LLJJI = C452501pT.LIZIZ(new AwS550S0100000_6(this, 1163));
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1k, LIZ());
        if (numLIZJ2 != null) {
            iIntValue2 = numLIZJ2.intValue();
        } else {
            iIntValue2 = 0;
        }
        c444890HcV.setColor(iIntValue2);
        c444890HcV.LIZ(72);
        List<TakoVideoItem> listP3 = interfaceC434180H0u.P3(str);
        if (!listP3.isEmpty()) {
            this.LLJI = listP3.size();
            TakoVideoItem takoVideoItem = (TakoVideoItem) C13LP.LJJJJZI(listP3);
            this.LLJIJIL = takoVideoItem;
            BaseImage baseImage = takoVideoItem.cover;
            String str2 = baseImage.uri;
            str2 = str2 == null ? baseImage.imageUuid : str2;
            AnonymousClass0957<Bitmap> anonymousClass0957 = (AnonymousClass0957) c0h1n.LIZJ(str2);
            if (anonymousClass0957 != null && anonymousClass0957.isCompleted()) {
                try {
                    Bitmap bitmapLIZLLL = anonymousClass0957.LIZLLL();
                    if (bitmapLIZLLL != null && !bitmapLIZLLL.isRecycled()) {
                        if (!C1E7C.LIZ()) {
                            Bitmap.Config config = bitmapLIZLLL.getConfig();
                            bitmapLIZLLL = bitmapLIZLLL.copy(config == null ? Bitmap.Config.ARGB_8888 : config, false);
                        }
                        this.LLIZ = bitmapLIZLLL;
                    } else {
                        LJII(baseImage, str2, null, 0);
                    }
                    c098200Yq = Unit.LIZ;
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                C189200o6.m1boximpl(c098200Yq);
            } else {
                LJII(baseImage, str2, anonymousClass0957, 0);
            }
        } else {
            this.LLJIJIL = null;
            this.LLJI = 1;
        }
        this.LLJJIII = C452501pT.LIZIZ(new AwS550S0100000_6(this, 1164));
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        return LIZIZ();
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        int iLJI;
        int iLJI2;
        if (this.LLJIJIL == null) {
            return;
        }
        Bitmap bitmap = this.LLIZ;
        paint.getFontMetricsInt(this.LLIZLLLIL);
        float f2 = LLJJIJIIJIL;
        float f3 = LLJJIJI;
        Paint.FontMetricsInt fontMetricsInt = this.LLIZLLLIL;
        float f4 = 2;
        float f5 = i4 + (((fontMetricsInt.descent + fontMetricsInt.ascent) - f3) / f4);
        boolean zLJ = C426750GoL.LJ(this.LLILLJJLI);
        Layout layout = this.LLILLJJLI.getLayout();
        if (layout != null) {
            if (layout.getLineStart(layout.getLineForOffset(i)) != i) {
                if (zLJ) {
                    iLJI2 = LJI();
                    f -= iLJI2;
                } else {
                    iLJI = LJI();
                    f += iLJI;
                }
            }
        } else if (zLJ) {
            iLJI2 = LJI();
            f -= iLJI2;
        } else if (f > LJI()) {
            iLJI = LJI();
            f += iLJI;
        }
        int iSave = canvas.save();
        canvas.translate(f, f5);
        try {
            if (this.LLJI > 1) {
                RectF rectF = new RectF(0.0f, 0.0f, LIZIZ() - LJI(), f3);
                float f6 = LLJJJJJIL;
                canvas.drawRoundRect(rectF, f6, f6, (Paint) this.LLJILLL.getValue());
            }
            float f7 = LLJJJJ;
            RectF rectF2 = new RectF(f7, f7, f2 - f7, f3 - f7);
            if (C1E7C.LIZ()) {
                if (bitmap != null && (!bitmap.isRecycled())) {
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                    Paint paint2 = new Paint(1);
                    paint2.setShader(bitmapShader);
                    float f8 = LLJJJJJIL;
                    canvas.drawRoundRect(rectF2, f8, f8, paint2);
                    canvas.drawRoundRect(rectF2, f8, f8, (Paint) this.LLJJ.getValue());
                } else {
                    float f9 = LLJJJJJIL;
                    canvas.drawRoundRect(rectF2, f9, f9, (Paint) this.LLJJI.getValue());
                }
            } else {
                if (bitmap != null) {
                    Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                    BitmapShader bitmapShader2 = new BitmapShader(bitmap, tileMode2, tileMode2);
                    Paint paint22 = new Paint(1);
                    paint22.setShader(bitmapShader2);
                    float f82 = LLJJJJJIL;
                    canvas.drawRoundRect(rectF2, f82, f82, paint22);
                    canvas.drawRoundRect(rectF2, f82, f82, (Paint) this.LLJJ.getValue());
                }
                float f92 = LLJJJJJIL;
                canvas.drawRoundRect(rectF2, f92, f92, (Paint) this.LLJJI.getValue());
            }
            iSave = canvas.save();
            canvas.translate(f2 / f4, f3 / f4);
            try {
                this.LLJILJIL.draw(canvas);
                canvas.restoreToCount(iSave);
                if (this.LLJI > 1) {
                    this.LLJILJILJ.getFontMetricsInt(this.LLJ);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append('+');
                    sbLIZ.append(this.LLJI - 1);
                    canvas.drawText(C2188811AlT.LIZIZ(sbLIZ), f2 + LLJJIJIL, LLJJJ - this.LLJ.ascent, this.LLJILJILJ);
                }
                canvas.restoreToCount(iSave);
            } finally {
                TryCatchGuardChecker.doCheck(th);
                canvas.restoreToCount(iSave);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}

package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.style.ReplacementSpan;
import android.view.View;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AFwS208S0000000_20;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0kUS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1321380kUS extends ReplacementSpan implements InterfaceC21337118en, InterfaceC1321130kU3 {
    public final String LL;
    public final int LLILLJJLI;
    public final int LLILLL;
    public final float LLILZ;
    public final C1321070kTx LLILZIL;
    public int LLILZLL;
    public WeakReference<AbstractC21333318eB<?>> LLIZ;

    @Override // X.InterfaceC1321130kU3
    public final void LJIIJ(C1325710kbR c1325710kbR) {
    }

    @Override // X.InterfaceC1321130kU3
    public final void onFailure(Throwable th) {
    }

    @Override // X.InterfaceC21337118en
    public final Drawable LIZ() {
        return this.LLILZIL.LJ();
    }

    @Override // X.InterfaceC21337118en
    public final void LJ() {
        this.LLILZIL.LJI();
    }

    @Override // X.InterfaceC21337118en
    public final void LJFF() {
        this.LLILZIL.LJII();
    }

    public final int LJI() {
        int i = this.LLILLJJLI;
        if (i >= 0) {
            return i;
        }
        int i2 = this.LLILLL;
        if (i2 > 0) {
            float f = this.LLILZ;
            if (f > 0.0f) {
                return (int) (i2 * f);
            }
        }
        return this.LLILZLL;
    }

    @Override // X.InterfaceC21337118en
    public final void LIZJ(View view) {
        C1325860kbg.LIZIZ(null, AFwS208S0000000_20.get$arr$(104), C2097608Jq.LJ());
    }

    @Override // X.InterfaceC21337118en
    public final void LIZIZ(AbstractC21333318eB<?> abstractC21333318eB, Drawable.Callback callback) {
        this.LLIZ = new WeakReference<>(abstractC21333318eB);
        C1321120kU2 c1321120kU2LJ = this.LLILZIL.LJ();
        if (c1321120kU2LJ != null) {
            c1321120kU2LJ.setBounds(0, 0, LJI(), this.LLILLL);
        }
        C1321120kU2 c1321120kU2LJ2 = this.LLILZIL.LJ();
        if (c1321120kU2LJ2 != null) {
            c1321120kU2LJ2.setCallback(callback);
        }
    }

    @Override // X.InterfaceC1321130kU3
    public final void LIZLLL(Drawable drawable, C1323050kX9 c1323050kX9) {
        int width;
        if (this.LLILLJJLI < 0 && this.LLILZLL == 0) {
            AbstractC1327750kej abstractC1327750kejLIZLLL = C1321060kTw.LIZLLL(c1323050kX9);
            if (abstractC1327750kejLIZLLL != null && abstractC1327750kejLIZLLL.getHeight() != 0) {
                width = (int) ((abstractC1327750kejLIZLLL.getWidth() / abstractC1327750kejLIZLLL.getHeight()) * this.LLILLL);
            } else {
                width = 0;
            }
            this.LLILZLL = width;
            C1321120kU2 c1321120kU2LJ = this.LLILZIL.LJ();
            if (c1321120kU2LJ != null) {
                c1321120kU2LJ.setBounds(0, 0, LJI(), this.LLILLL);
            }
            AbstractC21333318eB<?> abstractC21333318eB = this.LLIZ.get();
            if (abstractC21333318eB != null) {
                abstractC21333318eB.LJJLIIIJJIZ();
                return;
            }
            return;
        }
        AbstractC21333318eB<?> abstractC21333318eB2 = this.LLIZ.get();
        if (abstractC21333318eB2 == null) {
            return;
        }
        abstractC21333318eB2.LJJJJJL();
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        if (fontMetricsInt != null) {
            if (fontMetricsInt.ascent == 0 && fontMetricsInt.descent == 0 && fontMetricsInt.top == 0 && fontMetricsInt.bottom == 0) {
                paint.getFontMetricsInt(fontMetricsInt);
            }
            int i3 = fontMetricsInt.descent;
            int i4 = fontMetricsInt.ascent;
            int i5 = this.LLILLL;
            int i6 = (((i3 - i4) - i5) / 2) + i4;
            int i7 = i5 + i6;
            if (i6 < i4) {
                fontMetricsInt.ascent = i6;
            }
            if (i6 < fontMetricsInt.top) {
                fontMetricsInt.top = i6;
            }
            if (i7 > i3) {
                fontMetricsInt.descent = i7;
            }
            if (i7 > fontMetricsInt.bottom) {
                fontMetricsInt.bottom = i7;
            }
        }
        return LJI();
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        C1321120kU2 c1321120kU2LJ;
        float f2;
        if (!Intrinsics.LJFF(this.LL, "hidden") && (c1321120kU2LJ = this.LLILZIL.LJ()) != null) {
            canvas.save();
            if (i5 - i3 == this.LLILLL) {
                f2 = i3;
            } else {
                f2 = i4 + (((paint.getFontMetricsInt().ascent + paint.getFontMetricsInt().descent) - this.LLILLL) / 2.0f);
            }
            canvas.translate(f, Math.round(f2));
            c1321120kU2LJ.draw(canvas);
            canvas.restore();
        }
    }

    public C1321380kUS(Context context, boolean z, Object obj, InterfaceC1321110kU1 interfaceC1321110kU1, String str, String str2, int i, int i2, float f, Object obj2) {
        this.LL = str2;
        this.LLILLJJLI = i;
        this.LLILLL = i2;
        this.LLILZ = f;
        C1321070kTx c1321070kTxLIZIZ = C1321060kTw.LIZIZ(context, z, obj, interfaceC1321110kU1);
        C1320330kSl c1320330kSl = InterfaceC1320380kSq.LIZ;
        C1331070kk5 c1331070kk5LJFF = c1321070kTxLIZIZ.LJFF();
        if (c1331070kk5LJFF != null) {
            c1331070kk5LJFF.LJIIZILJ(c1320330kSl);
        }
        c1321070kTxLIZIZ.LLJILLL = this;
        c1321070kTxLIZIZ.LLJJI = obj2;
        c1321070kTxLIZIZ.LIZIZ(str);
        this.LLILZIL = c1321070kTxLIZIZ;
        this.LLIZ = new WeakReference<>(null);
    }
}

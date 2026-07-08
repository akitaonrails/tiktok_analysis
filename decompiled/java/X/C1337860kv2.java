package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS208S0000000_20;
import kotlin.jvm.internal.AwS564S0100000_20;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0kv2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1337860kv2 extends Drawable implements InterfaceC1321130kU3 {
    public static boolean LLJJI;
    public int LL;
    public Bitmap LLILLJJLI;
    public String LLILLL;
    public String LLILZ;
    public List<C1337880kv4> LLILZIL;
    public C1337920kv8 LLILZLL;
    public C1337870kv3 LLIZ;
    public Paint LLIZLLLIL;
    public Paint LLJ;
    public Paint LLJI;
    public Paint LLJIJIL;
    public Paint LLJILJIL;
    public C1321070kTx LLJILJILJ;
    public Rect LLJILLL;
    public boolean LLJJ;

    @Override // X.InterfaceC1321130kU3
    public final void LJIIJ(C1325710kbR c1325710kbR) {
    }

    @Override // X.InterfaceC1321130kU3
    public final void onFailure(Throwable th) {
    }

    public final C1337870kv3 LIZIZ() {
        C1337870kv3 c1337870kv3 = this.LLIZ;
        if (c1337870kv3 != null) {
            return c1337870kv3;
        }
        C1337870kv3 c1337870kv32 = new C1337870kv3();
        this.LLIZ = c1337870kv32;
        return c1337870kv32;
    }

    public final Paint LIZJ() {
        Paint paint = this.LLJ;
        if (paint != null) {
            return paint;
        }
        Paint paint2 = new Paint(1);
        this.LLJ = paint2;
        return paint2;
    }

    public final C1321120kU2 LJ() {
        C1321070kTx c1321070kTx = this.LLJILJILJ;
        if (c1321070kTx != null) {
            return c1321070kTx.LJ();
        }
        return null;
    }

    public final Paint LJFF() {
        Paint paint = this.LLIZLLLIL;
        if (paint != null) {
            return paint;
        }
        Paint paint2 = new Paint(6);
        this.LLIZLLLIL = paint2;
        return paint2;
    }

    public final Paint LJI() {
        Paint paint = this.LLJIJIL;
        if (paint != null) {
            return paint;
        }
        Paint paint2 = new Paint(1);
        paint2.setStyle(Paint.Style.STROKE);
        this.LLJIJIL = paint2;
        return paint2;
    }

    public final Paint LJII() {
        Paint paint = this.LLJI;
        if (paint != null) {
            return paint;
        }
        Paint paint2 = new Paint(1);
        this.LLJI = paint2;
        return paint2;
    }

    public final Paint LJIIIIZZ() {
        Paint paint = this.LLJILJIL;
        if (paint != null) {
            return paint;
        }
        Paint paint2 = new Paint(1);
        this.LLJILJIL = paint2;
        return paint2;
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x02d0 A[LOOP:4: B:119:0x02ca->B:121:0x02d0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02f9 A[LOOP:5: B:123:0x02f3->B:125:0x02f9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x025d A[LOOP:3: B:92:0x0257->B:94:0x025d, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILL() {
        /*
            Method dump skipped, instruction units count: 806
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1337860kv2.LJIILL():void");
    }

    @Override // android.graphics.drawable.Drawable
    @InterfaceC1294060jmO
    public final int getOpacity() {
        Bitmap bitmap;
        C1321120kU2 c1321120kU2LJ;
        Object objLJ = this.LLILLJJLI;
        if (objLJ == null) {
            objLJ = LJ();
        }
        return ((objLJ == null || ((bitmap = this.LLILLJJLI) == null ? !((c1321120kU2LJ = LJ()) == null || c1321120kU2LJ.getAlpha() >= 255) : bitmap.hasAlpha()) || LJFF().getAlpha() != 255 || !this.LLJJ) && Color.alpha(this.LL) != 255) ? -3 : -1;
    }

    public final void LIZ(Canvas canvas) {
        if (this.LL != 0) {
            canvas.drawRect(getBounds(), LIZJ());
        }
        Bitmap bitmap = this.LLILLJJLI;
        if (bitmap != null) {
            Rect rect = this.LLJILLL;
            if (rect == null) {
                rect = new Rect();
                this.LLJILLL = rect;
            }
            canvas.drawBitmap(bitmap, (Rect) null, rect, LJFF());
        }
        try {
            C1321120kU2 c1321120kU2LJ = LJ();
            if (c1321120kU2LJ != null) {
                c1321120kU2LJ.draw(canvas);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1325860kbg.LIZIZ(null, new AwS564S0100000_20(this, 45), C2097608Jq.LJ());
        }
        if (this.LLILZLL != null) {
            canvas.drawRect(getBounds(), LJII());
        }
    }

    public final void LJIIIZ(String str) {
        String strTrim;
        if (str != null) {
            strTrim = str.trim();
        } else {
            strTrim = null;
        }
        this.LLILLL = strTrim;
        if (!getBounds().isEmpty()) {
            LJIL(getBounds());
        }
        invalidateSelf();
    }

    public final void LJIIL(Bitmap bitmap) {
        this.LLILLJJLI = bitmap;
        if (!getBounds().isEmpty()) {
            LJIL(getBounds());
        }
        invalidateSelf();
    }

    public final void LJIILIIL(int i) {
        C1337870kv3 c1337870kv3LIZIZ = LIZIZ();
        c1337870kv3LIZIZ.LJIIJ = i;
        LJI().setColor(i);
        if (c1337870kv3LIZIZ.LJIIIZ > 0.0f) {
            invalidateSelf();
        }
    }

    public final void LJIILJJIL(float f) {
        C1337870kv3 c1337870kv3LIZIZ = LIZIZ();
        c1337870kv3LIZIZ.LJIIIZ = f;
        LJI().setStrokeWidth(f);
        if (!getBounds().isEmpty()) {
            c1337870kv3LIZIZ.LJIJI = true;
        }
        invalidateSelf();
    }

    public final void LJIIZILJ(float f) {
        LIZIZ().LIZ();
        if (f <= 0.0f) {
            LJIIIIZZ().setMaskFilter(null);
        } else {
            LJIIIIZZ().setMaskFilter(new BlurMaskFilter(f, BlurMaskFilter.Blur.NORMAL));
        }
        invalidateSelf();
    }

    public final void LJIJ(int i) {
        LIZIZ().LIZ();
        LJIIIIZZ().setColor(i);
        invalidateSelf();
    }

    public final void LJIJI(float f) {
        LIZIZ().LIZ().LIZ = f;
        invalidateSelf();
    }

    public final void LJIJJ(float f) {
        LIZIZ().LIZ().LIZIZ = f;
        invalidateSelf();
    }

    public final void LJIJJLI(float f) {
        C1337870kv3 c1337870kv3LIZIZ = LIZIZ();
        c1337870kv3LIZIZ.LIZ().LIZJ = f;
        c1337870kv3LIZIZ.LJJII = true;
        invalidateSelf();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIL(android.graphics.Rect r13) {
        /*
            Method dump skipped, instruction units count: 562
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1337860kv2.LJIL(android.graphics.Rect):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:150:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006d  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void draw(android.graphics.Canvas r18) {
        /*
            Method dump skipped, instruction units count: 568
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1337860kv2.draw(android.graphics.Canvas):void");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x0012. Please report as an issue. */
    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        int iWidth;
        int iHeight;
        int iHeight2;
        int i;
        C1337870kv3 c1337870kv3 = this.LLIZ;
        if (c1337870kv3 != null && c1337870kv3.LJII) {
            int i2 = c1337870kv3.LJFF;
            int i3 = c1337870kv3.LJI;
            Rect bounds = getBounds();
            int i4 = 0;
            switch (i2) {
                case 1:
                    iWidth = bounds.width() + i3;
                    iHeight = bounds.height();
                    i = i4;
                    break;
                case 2:
                    iWidth = bounds.width();
                    iHeight2 = bounds.height();
                    iHeight = iHeight2 + i3;
                    i = i4;
                    break;
                case 3:
                    i4 = -i3;
                    iWidth = bounds.width();
                    iHeight = bounds.height();
                    i = 0;
                    break;
                case 4:
                    i = -i3;
                    iWidth = bounds.width();
                    iHeight = bounds.height();
                    i4 = 0;
                    break;
                case 5:
                    iWidth = bounds.width() + i3;
                    iHeight2 = bounds.height();
                    iHeight = iHeight2 + i3;
                    i = i4;
                    break;
                case 6:
                    i = -i3;
                    iWidth = bounds.width() + i3;
                    iHeight = bounds.height();
                    i4 = 0;
                    break;
                case 7:
                    i4 = -i3;
                    iWidth = bounds.width();
                    iHeight = bounds.height() + i3;
                    i = 0;
                    break;
                case 8:
                    i4 = -i3;
                    iWidth = bounds.width();
                    iHeight = bounds.height();
                    i = i4;
                    break;
                default:
                    iWidth = bounds.width();
                    iHeight = bounds.height();
                    i = i4;
                    break;
            }
            float f = i3;
            float fWidth = bounds.width();
            if (f > fWidth) {
                f = fWidth;
            }
            float fHeight = bounds.height();
            if (f <= fHeight) {
                fHeight = f;
            }
            outline.setRoundRect(i4, i, iWidth, iHeight, fHeight);
            return;
        }
        super.getOutline(outline);
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        if (!rect.isEmpty()) {
            if (this.LLILLJJLI != null || LJ() != null) {
                LJIL(rect);
            }
            C1337870kv3 c1337870kv3 = this.LLIZ;
            if (c1337870kv3 != null) {
                c1337870kv3.LJJ = true;
                c1337870kv3.LJIILL = true;
                c1337870kv3.LJIJI = true;
                c1337870kv3.LJJII = true;
            }
        }
        if (this.LLILZLL != null) {
            LJIILL();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (i != LJFF().getAlpha()) {
            LJFF().setAlpha(i);
            LIZJ().setAlpha(i);
            LJII().setAlpha(i);
            LJI().setAlpha(i);
            C1321120kU2 c1321120kU2LJ = LJ();
            if (c1321120kU2LJ != null) {
                c1321120kU2LJ.setAlpha(i);
            }
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        C1331070kk5 c1331070kk5LJFF;
        LJFF().setColorFilter(colorFilter);
        LIZJ().setColorFilter(colorFilter);
        LJII().setColorFilter(colorFilter);
        LJI().setColorFilter(colorFilter);
        C1321070kTx c1321070kTx = this.LLJILJILJ;
        if (c1321070kTx != null && (c1331070kk5LJFF = c1321070kTx.LJFF()) != null) {
            c1331070kk5LJFF.LJI.setColorFilter(colorFilter);
        }
        invalidateSelf();
    }

    @Override // X.InterfaceC1321130kU3
    public final void LIZLLL(Drawable drawable, C1323050kX9 c1323050kX9) {
        AbstractC1327750kej abstractC1327750kejLIZLLL = C1321060kTw.LIZLLL(c1323050kX9);
        if (abstractC1327750kejLIZLLL != null) {
            C1321120kU2 c1321120kU2LJ = LJ();
            if (c1321120kU2LJ != null) {
                c1321120kU2LJ.setBounds(0, 0, abstractC1327750kejLIZLLL.getWidth(), abstractC1327750kejLIZLLL.getHeight());
            }
        } else {
            C1325860kbg.LIZIZ(null, AFwS208S0000000_20.get$arr$(87), C2097608Jq.LJ());
        }
        if (!getBounds().isEmpty()) {
            LJIL(getBounds());
        }
        invalidateSelf();
    }

    public final void LJIIJJI(C1168340gVc c1168340gVc, String str) {
        boolean z;
        C1337880kv4 c1337880kv4LIZJ;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            this.LLILZIL = null;
        } else {
            String strTrim = str.trim();
            if (Intrinsics.LJFF(strTrim, "cover")) {
                this.LLILZ = "cover";
                this.LLILZIL = null;
            } else if (Intrinsics.LJFF(strTrim, "contain")) {
                this.LLILZ = "contain";
                this.LLILZIL = null;
            } else {
                this.LLILZ = null;
                List listLJJLIIIJ = a0.LJJLIIIJ(strTrim, new char[]{' '}, false, 0, 6);
                ArrayList arrayList = new ArrayList();
                for (Object obj : listLJJLIIIJ) {
                    if (!a0.LJJJIL((String) obj)) {
                        arrayList.add(obj);
                    }
                }
                if (arrayList.isEmpty()) {
                    this.LLILZIL = null;
                } else {
                    C1337880kv4 c1337880kv4LIZJ2 = C1337960kvC.LIZJ(c1168340gVc, ListProtector.get(arrayList, 0));
                    if (c1337880kv4LIZJ2 == null) {
                        c1337880kv4LIZJ2 = C1337880kv4.LIZJ;
                    }
                    if (arrayList.size() <= 1) {
                        c1337880kv4LIZJ = new C1337880kv4(0.0f, 0);
                    } else {
                        c1337880kv4LIZJ = C1337960kvC.LIZJ(c1168340gVc, ListProtector.get(arrayList, 1));
                        if (c1337880kv4LIZJ == null) {
                            c1337880kv4LIZJ = C1337880kv4.LIZJ;
                        }
                    }
                    this.LLILZIL = C1697810uHb.LJIIJJI(c1337880kv4LIZJ2, c1337880kv4LIZJ);
                }
            }
        }
        if (!getBounds().isEmpty()) {
            LJIL(getBounds());
        }
        invalidateSelf();
    }

    public final C1321070kTx LJIILLIIL(Context context, boolean z, Object obj, InterfaceC1321110kU1 interfaceC1321110kU1) {
        boolean z2;
        if (this.LLJILJILJ == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        C1325860kbg.LIZLLL(z2, null, null, C2097608Jq.LJ());
        C1321070kTx c1321070kTxLIZIZ = C1321060kTw.LIZIZ(context, z, obj, interfaceC1321110kU1);
        this.LLJILJILJ = c1321070kTxLIZIZ;
        C1320330kSl c1320330kSl = InterfaceC1320380kSq.LIZ;
        C1331070kk5 c1331070kk5LJFF = c1321070kTxLIZIZ.LJFF();
        if (c1331070kk5LJFF != null) {
            c1331070kk5LJFF.LJIIZILJ(c1320330kSl);
        }
        C1331070kk5 c1331070kk5LJFF2 = c1321070kTxLIZIZ.LJFF();
        if (c1331070kk5LJFF2 != null) {
            c1331070kk5LJFF2.LJIJI(0);
        }
        c1321070kTxLIZIZ.LLJILLL = this;
        return c1321070kTxLIZIZ;
    }
}

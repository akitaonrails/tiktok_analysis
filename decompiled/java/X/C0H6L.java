package X;

import android.R;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.Property;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: renamed from: X.0H6L, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0H6L extends C0H6T {
    public final String LJIILJJIL;
    public final String LJIILL;
    public final String LJIILLIIL;
    public final Integer LJIIZILJ;
    public final boolean LJIJ;
    public final int LJIJI;
    public final C01GW LJIJJ;
    public long LJIJJLI;
    public C0H6N LJIL;
    public final C01GW LJJ;
    public final C01GW LJJI;
    public final List<Pair<Bitmap, Rect>> LJJIFFI;
    public Bitmap LJJII;
    public boolean LJJIII;
    public final C01GW LJJIIJ;
    public final Rect LJJIIJZLJL;
    public final Rect LJJIIZ;
    public final Path LJJIIZI;
    public final C0HGY LJJIJ;
    public final C0H7H LJJIJIIJI;
    public final String LJJIJIIJIL;

    @Override // X.C0H6M
    public final List<Pair<int[], PropertyValuesHolder[]>> LJI() {
        return C1697810uHb.LJIIJJI(new Pair(new int[]{R.attr.state_pressed}, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, 0.95f), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, 0.95f)}), new Pair(new int[0], new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, 1.0f), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, 1.0f)}));
    }

    @Override // X.C0H6M
    public final String LIZIZ() {
        return this.LJJIJIIJIL;
    }

    @Override // X.C0H6M
    public final Integer LIZJ() {
        return this.LJIIZILJ;
    }

    @Override // X.C0H6M
    public final C0H7H LIZLLL() {
        return this.LJJIJIIJI;
    }

    @Override // X.C0H6M
    public final C0HGY LJ() {
        return this.LJJIJ;
    }

    @Override // X.C0H6T, X.C0H6M
    public final void LJII(Canvas canvas) {
        float f;
        float f2;
        int iSave = canvas.save();
        try {
            int i = this.LIZIZ;
            if (this.LJIL == C0H6N.LL && this.LJJII != null) {
                this.LJIL = C0H6N.LLILLJJLI;
                this.LJIJJLI = SystemClock.uptimeMillis();
            }
            C0H6N c0h6n = this.LJIL;
            if (c0h6n == C0H6N.LLILLJJLI) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                float interpolation = ((DecelerateInterpolator) this.LJJ.getValue()).getInterpolation(C13LZ.LIZLLL((jUptimeMillis - this.LJIJJLI) / 2000, 0.0f, 1.0f));
                int iMin = Math.min((int) Math.floor(((double) interpolation) * ((double) 20)), 19);
                int iLJIIJ = C1697810uHb.LJIIJ(this.LJJIFFI);
                if (iLJIIJ < 0) {
                    iLJIIJ = 0;
                }
                Pair pair = (Pair) C13LP.LJJJLZIJ(C13LZ.LJ(iMin, 0, iLJIIJ), this.LJJIFFI);
                if (pair != null) {
                    float f3 = interpolation % 0.05f;
                    if (f3 != 0.0f && Math.signum(f3) != Math.signum(0.05f)) {
                        f3 += 0.05f;
                    }
                    float f4 = f3 * 20;
                    Bitmap bitmap = (Bitmap) pair.getFirst();
                    Rect rect = (Rect) pair.getSecond();
                    canvas.clipPath(this.LJJIIZI);
                    if (0.0f <= f4 && f4 <= 0.5f) {
                        f = f4 + 0.5f;
                    } else if (0.5f <= f4 && f4 <= 1.0f) {
                        f = f4 - 0.5f;
                    } else {
                        f = 0.5f;
                    }
                    if (0.0f <= f4 && f4 <= 0.5f) {
                        f2 = f4 - 0.5f;
                    } else if (0.5f <= f4 && f4 <= 1.0f) {
                        f2 = f4 - 1.5f;
                    } else {
                        f2 = -0.5f;
                    }
                    canvas.translate(0.0f, (f * i) + (f2 * this.LJJIIJZLJL.height()));
                    if (bitmap != null) {
                        canvas.drawBitmap(bitmap, rect, this.LJJIIJZLJL, (Paint) null);
                    } else {
                        ((Drawable) this.LJJIIJ.getValue()).draw(canvas);
                    }
                    if (jUptimeMillis >= this.LJIJJLI + 2000) {
                        this.LJIL = C0H6N.LLILLL;
                    }
                    LJIIIZ();
                }
            } else if (c0h6n == C0H6N.LLILLL) {
                if (this.LJJIII) {
                    ((Drawable) this.LJJIIJ.getValue()).draw(canvas);
                } else {
                    Bitmap bitmap2 = this.LJJII;
                    if (bitmap2 != null) {
                        iSave = canvas.save();
                        try {
                            canvas.clipPath(this.LJJIIZI);
                            canvas.drawBitmap(bitmap2, this.LJJIIZ, this.LJJIIJZLJL, (Paint) null);
                            canvas.restoreToCount(iSave);
                        } finally {
                            TryCatchGuardChecker.doCheck(th);
                            canvas.restoreToCount(iSave);
                        }
                    }
                }
            }
            canvas.restoreToCount(iSave);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // X.C0H6M
    public final Object LJIIJ(InterfaceC1364105Vn<? super Pair<C0HOC, ? extends EnumC440340HOm>> interfaceC1364105Vn) {
        return new Pair(new C0HOC(new C435750H6v(this.LJIILJJIL, this.LJIILL, this.LJIILLIIL, this.LJIJI), this.LJJIJIIJI, this.LJIIZILJ, false), null);
    }

    @Override // X.C0H6T, X.C0H6M
    public final void LJIIIIZZ(int i, int i2) {
        super.LJIIIIZZ(i, i2);
        float f = i;
        float f2 = i2;
        float f3 = 1 - 0.065f;
        this.LJJIIJZLJL.set((int) (f * 0.065f), (int) (f2 * 0.065f), (int) (f * f3), (int) (f2 * f3));
        Path path = this.LJJIIZI;
        path.reset();
        float f4 = f * 0.15f;
        path.addRoundRect(new RectF(this.LJJIIJZLJL), f4, f4, Path.Direction.CW);
        int i3 = this.LIZ;
        int i4 = i3 / 2;
        int i5 = this.LIZIZ / 2;
        int i6 = ((i3 * 7) / 9) / 2;
        ((Drawable) this.LJJIIJ.getValue()).setBounds(i4 - i6, i5 - i6, i4 + i6, i5 + i6);
    }

    public C0H6L(Context context, InterfaceC497601wk interfaceC497601wk, String str, String str2, String str3, Integer num, boolean z, int i) {
        C0H6N c0h6n;
        int size;
        super(context, interfaceC497601wk, str2);
        this.LJIILJJIL = str;
        this.LJIILL = str2;
        this.LJIILLIIL = str3;
        this.LJIIZILJ = num;
        this.LJIJ = z;
        this.LJIJI = i;
        this.LJIJJ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(441));
        if (z) {
            c0h6n = C0H6N.LL;
        } else {
            c0h6n = C0H6N.LLILLL;
        }
        this.LJIL = c0h6n;
        this.LJJ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(442));
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS550S0100000_6(this, 1117));
        this.LJJI = c01gwLIZIZ;
        this.LJJIFFI = new CopyOnWriteArrayList();
        this.LJJIIJ = C452501pT.LIZIZ(new AwS550S0100000_6(context, 1118));
        this.LJJIIJZLJL = new Rect();
        this.LJJIIZ = new Rect();
        this.LJJIIZI = new Path();
        this.LJJIJ = C0HGY.MEME;
        this.LJJIJIIJI = C0H7H.MEME_SUGGESTION;
        this.LJJIJIIJIL = str3;
        List list = (List) c01gwLIZIZ.getValue();
        if (list != null) {
            size = list.size();
        } else {
            size = 0;
        }
        int i2 = size + 1;
        for (int i3 = 0; i3 < i2; i3++) {
            ((CopyOnWriteArrayList) this.LJJIFFI).add(new Pair(null, new Rect()));
        }
        C23250099c.LIZLLL(interfaceC497601wk, null, null, new C0H02(this, context, null), 3);
        List list2 = (List) this.LJJI.getValue();
        if (list2 != null) {
            int i4 = 0;
            for (Object obj : list2) {
                int i5 = i4 + 1;
                if (i4 >= 0) {
                    C23250099c.LIZLLL(interfaceC497601wk, null, null, new C0H01(context, (String) obj, this, i4, null), 3);
                    i4 = i5;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
    }
}

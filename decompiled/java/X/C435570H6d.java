package X;

import android.R;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.SystemClock;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.Property;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.Emoji;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0H6d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C435570H6d extends C0H6M {
    public final Context LJFF;
    public final Emoji LJI;
    public final boolean LJII;
    public final Integer LJIIIIZZ;
    public final boolean LJIIIZ;
    public final C435590H6f LJIIJ;
    public final int LJIIJJI;
    public final boolean LJIIL;
    public final C01GW LJIILIIL;
    public final C01GW LJIILJJIL;
    public final C01GW LJIILL;
    public final C01GW LJIILLIIL;
    public final Path LJIIZILJ;
    public StaticLayout LJIJ;
    public final C0HGY LJIJI;
    public final C0H7H LJIJJ;
    public long LJIJJLI;
    public EnumC435580H6e LJIL;
    public final C01GW LJJ;
    public final C01GW LJJI;
    public List<? extends StaticLayout> LJJIFFI;
    public final int LJJII;
    public final int LJJIII;
    public final int LJJIIJ;
    public Bitmap LJJIIJZLJL;
    public Bitmap LJJIIZ;
    public Bitmap LJJIIZI;
    public final int LJJIJ;

    @Override // X.C0H6M
    public final /* bridge */ /* synthetic */ String LIZIZ() {
        return null;
    }

    @Override // X.C0H6M
    public final List<Pair<int[], PropertyValuesHolder[]>> LJI() {
        return C1697810uHb.LJIIJJI(new Pair(new int[]{R.attr.state_pressed}, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, 0.95f), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, 0.95f)}), new Pair(new int[0], new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, 1.0f), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, 1.0f)}));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C435570H6d)) {
            return false;
        }
        C435570H6d c435570H6d = (C435570H6d) obj;
        return Intrinsics.LJFF(this.LJFF, c435570H6d.LJFF) && Intrinsics.LJFF(this.LJI, c435570H6d.LJI) && this.LJII == c435570H6d.LJII && Intrinsics.LJFF(this.LJIIIIZZ, c435570H6d.LJIIIIZZ) && this.LJIIIZ == c435570H6d.LJIIIZ && Intrinsics.LJFF(this.LJIIJ, c435570H6d.LJIIJ) && this.LJIIJJI == c435570H6d.LJIIJJI;
    }

    public final int hashCode() {
        int iHashCode = ((((this.LJFF.hashCode() * 31) + this.LJI.hashCode()) * 31) + C786410Ut5.Z2(this.LJII)) * 31;
        Integer num = this.LJIIIIZZ;
        return ((((((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + C786410Ut5.Z2(this.LJIIIZ)) * 31) + this.LJIIJ.hashCode()) * 31) + this.LJIIJJI;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SuggestedEmojiElementDisplayStrategy(context=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", emoji=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", isSelected=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", elementPosition=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(", hasDisplayAnimation=");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append(", viewConfig=");
        sbLIZ.append(this.LJIIJ);
        sbLIZ.append(", idType=");
        sbLIZ.append(this.LJIIJJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C0H6M
    public final boolean LIZ() {
        return this.LJIIL;
    }

    @Override // X.C0H6M
    public final Integer LIZJ() {
        return this.LJIIIIZZ;
    }

    @Override // X.C0H6M
    public final C0H7H LIZLLL() {
        return this.LJIJJ;
    }

    @Override // X.C0H6M
    public final C0HGY LJ() {
        return this.LJIJI;
    }

    @Override // X.C0H6M
    public final void LJII(Canvas canvas) {
        Paint paint;
        StaticLayout staticLayout;
        float f;
        float f2;
        int iSave = canvas.save();
        try {
            int i = this.LIZ;
            int i2 = this.LIZIZ;
            if (this.LJIL == EnumC435580H6e.LL && this.LJIJ != null && this.LJJIFFI != null) {
                this.LJIL = EnumC435580H6e.LLILLJJLI;
                this.LJIJJLI = SystemClock.uptimeMillis();
            }
            EnumC435580H6e enumC435580H6e = this.LJIL;
            if (enumC435580H6e == EnumC435580H6e.LLILLJJLI) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                float interpolation = ((DecelerateInterpolator) this.LJJ.getValue()).getInterpolation(C13LZ.LIZLLL((jUptimeMillis - this.LJIJJLI) / 2000, 0.0f, 1.0f));
                int iMin = Math.min((int) Math.floor(((double) interpolation) * ((double) 20)), 19);
                if (iMin < 0) {
                    iMin = 0;
                }
                List<? extends StaticLayout> list = this.LJJIFFI;
                if (list != null) {
                    staticLayout = (StaticLayout) C13LP.LJJJLZIJ(iMin, list);
                } else {
                    staticLayout = null;
                }
                float f3 = interpolation % 0.05f;
                if (f3 != 0.0f && Math.signum(f3) != Math.signum(0.05f)) {
                    f3 += 0.05f;
                }
                float f4 = f3 * 20;
                if (staticLayout != null) {
                    canvas.clipPath(this.LJIIZILJ);
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
                    canvas.translate((i / 2) - (staticLayout.getWidth() / 2), (f * i2) + (f2 * staticLayout.getHeight()));
                    staticLayout.draw(canvas);
                }
                if (jUptimeMillis >= this.LJIJJLI + 2000) {
                    this.LJIL = EnumC435580H6e.LLILLL;
                }
                LJIIIZ();
            } else if (enumC435580H6e == EnumC435580H6e.LLILLL) {
                if (!this.LJIIL && C440480HPa.LIZJ()) {
                    Bitmap bitmap = this.LJJIIZI;
                    if (bitmap != null) {
                        paint = null;
                        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                    } else {
                        paint = null;
                    }
                    Bitmap bitmap2 = this.LJJIIZ;
                    if (bitmap2 != null) {
                        canvas.drawBitmap(bitmap2, 0.0f, 0.0f, paint);
                    }
                    Bitmap bitmap3 = this.LJJIIJZLJL;
                    if (bitmap3 != null) {
                        canvas.drawBitmap(bitmap3, 0.0f, 0.0f, paint);
                    }
                } else {
                    StaticLayout staticLayout2 = this.LJIJ;
                    if (staticLayout2 != null) {
                        float f5 = 2;
                        canvas.translate((i / f5) - (staticLayout2.getWidth() / 2), (i2 / f5) - (staticLayout2.getHeight() / 2));
                        staticLayout2.draw(canvas);
                    }
                }
            }
            canvas.restoreToCount(iSave);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            canvas.restoreToCount(iSave);
            throw th;
        }
    }

    @Override // X.C0H6M
    public final Object LJIIJ(InterfaceC1364105Vn<? super Pair<C0HOC, ? extends EnumC440340HOm>> interfaceC1364105Vn) {
        Function0<Unit> function0 = this.LJ;
        if (function0 != null) {
            function0.invoke();
        }
        return new Pair(new C0HOC(new C435610H6h(this.LJI, this.LJIIJJI), C0H7H.EMOJI_SUGGESTION, this.LJIIIIZZ, false), null);
    }

    public final StaticLayout LJIIJJI(CharSequence charSequence) {
        return new StaticLayout(charSequence, (TextPaint) this.LJIILL.getValue(), (int) Math.ceil(Layout.getDesiredWidth(charSequence, (TextPaint) this.LJIILL.getValue())), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
    }

    /* JADX WARN: Path cross not found for [B:18:0x004f, B:27:0x006a], limit reached: 54 */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x007c A[EDGE_INSN: B:50:0x007c->B:32:0x007c BREAK  A[LOOP:0: B:16:0x0045->B:51:?], SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x006a -> B:23:0x005f). Please report as a decompilation issue!!! */
    @Override // X.C0H6M
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIIZZ(int r13, int r14) {
        /*
            Method dump skipped, instruction units count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C435570H6d.LJIIIIZZ(int, int):void");
    }

    public C435570H6d(Context context, Emoji emoji, boolean z, Integer num, boolean z2, C435590H6f c435590H6f, int i, int i2) {
        boolean z3;
        EnumC435580H6e enumC435580H6e;
        int iIntValue;
        z2 = (i2 & 16) != 0 ? false : z2;
        c435590H6f = (i2 & 32) != 0 ? new C435590H6f(true) : c435590H6f;
        this.LJFF = context;
        this.LJI = emoji;
        this.LJII = z;
        this.LJIIIIZZ = num;
        this.LJIIIZ = z2;
        this.LJIIJ = c435590H6f;
        this.LJIIJJI = i;
        if (C440480HPa.LIZJ() && !z2 && !z) {
            z3 = false;
        } else {
            z3 = c435590H6f.LIZ;
        }
        this.LJIIL = z3;
        this.LJIILIIL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(437));
        this.LJIILJJIL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(436));
        this.LJIILL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(439));
        this.LJIILLIIL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 1114));
        this.LJIIZILJ = new Path();
        this.LJIJI = C0HGY.EMOJI;
        this.LJIJJ = C0H7H.EMOJI_SUGGESTION;
        if (z2) {
            enumC435580H6e = EnumC435580H6e.LL;
        } else {
            enumC435580H6e = EnumC435580H6e.LLILLL;
        }
        this.LJIL = enumC435580H6e;
        this.LJJ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(438));
        this.LJJI = C452501pT.LIZIZ(new AwS550S0100000_6(this, 1113));
        this.LJJII = 50;
        Integer numLIZJ = C1308910kAL.LIZJ(com.zhiliaoapp.musically.R.attr.a1d, context);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        this.LJJIII = iIntValue;
        this.LJJIIJ = 10;
        Integer numLIZJ2 = C1308910kAL.LIZJ(com.zhiliaoapp.musically.R.attr.cb, context);
        this.LJJIJ = C2441009hQ.LJIIL(numLIZJ2 != null ? numLIZJ2.intValue() : 0, 150);
    }
}

package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.SweepGradient;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0H6X, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0H6X extends View {
    public final int LL;
    public final int LLILLJJLI;
    public final float LLILLL;
    public final int LLILZ;
    public final int LLILZIL;
    public final int LLILZLL;
    public final int LLIZ;
    public final float LLIZLLLIL;
    public final float LLJ;
    public final float LLJI;
    public final float LLJIJIL;
    public final int LLJILJIL;
    public final int LLJILJILJ;
    public final int LLJILLL;
    public final float LLJJ;
    public final float LLJJI;
    public final float LLJJIII;
    public String LLJJIJI;
    public List<String> LLJJIJIIJIL;
    public Pair<Integer, Integer> LLJJIJIL;
    public final C0H6V<C1331070kk5> LLJJJ;
    public C1320770kTT<C1331070kk5> LLJJJIL;
    public final List<C0H6Y> LLJJJJ;
    public C0H6Y LLJJJJJIL;
    public final Paint LLJJJJLIIL;
    public final int[] LLJJL;
    public final float[] LLJJLIIIJLLLLLLLZ;
    public final Paint LLJL;
    public final Paint LLJLIL;
    public final Paint LLJLILLLLZIIL;
    public final Path LLJLL;

    public static float LJIIJJI(float f) {
        if (f > 180.0f) {
            f -= 360;
        }
        return f < -180.0f ? f + 360 : f;
    }

    public final C1320770kTT<C1331070kk5> LJFF() {
        C1331090kk7 c1331090kk7 = new C1331090kk7(getResources());
        c1331090kk7.LJIIZILJ = C1331100kk8.LIZ();
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_color_default_avatar;
        c1331090kk7.LJ = c419910GdJ.LIZ(getContext());
        C1331070kk5 c1331070kk5LIZ = c1331090kk7.LIZ();
        getContext();
        return new C1320770kTT<>(c1331070kk5LIZ);
    }

    public final void LJIIL() {
        if (this.LLJJIJIIJIL.size() >= 3) {
            String str = (String) ListProtector.get(this.LLJJIJIIJIL, 0);
            float fLIZIZ = this.LLJJIJIL != null ? (-r0.getFirst().intValue()) * 0.1f : C418440Gaw.LIZIZ(Float.valueOf(-50.0f));
            Pair<Integer, Integer> pair = this.LLJJIJIL;
            float fFloatValue = pair != null ? pair.getSecond().floatValue() * 0.02f : 0.0f;
            Pair<Integer, Integer> pair2 = this.LLJJIJIL;
            LIZIZ(str, new C0H6Z(fLIZIZ, fFloatValue, -4.0f, pair2 != null ? (int) (pair2.getSecond().floatValue() * this.LLJI) : this.LLIZ), null, false);
            String str2 = (String) ListProtector.get(this.LLJJIJIIJIL, 1);
            Pair<Integer, Integer> pair3 = this.LLJJIJIL;
            float fFloatValue2 = pair3 != null ? pair3.getFirst().floatValue() * 0.11f : C418440Gaw.LIZIZ(Float.valueOf(38.0f));
            Pair<Integer, Integer> pair4 = this.LLJJIJIL;
            float fFloatValue3 = pair4 != null ? pair4.getSecond().floatValue() * 0.2f : C418440Gaw.LIZIZ(Float.valueOf(45.0f));
            Pair<Integer, Integer> pair5 = this.LLJJIJIL;
            LIZIZ(str2, new C0H6Z(fFloatValue2, fFloatValue3, 4.0f, pair5 != null ? (int) (pair5.getSecond().floatValue() * this.LLJI) : this.LLIZ), null, false);
            String str3 = (String) ListProtector.get(this.LLJJIJIIJIL, 2);
            Pair<Integer, Integer> pair6 = this.LLJJIJIL;
            float fFloatValue4 = pair6 != null ? pair6.getFirst().floatValue() * 0.09f : C418440Gaw.LIZIZ(Float.valueOf(30.0f));
            float fLIZIZ2 = this.LLJJIJIL != null ? (-r0.getSecond().intValue()) * 0.21f : C418440Gaw.LIZIZ(Float.valueOf(-50.0f));
            Pair<Integer, Integer> pair7 = this.LLJJIJIL;
            LIZIZ(str3, new C0H6Z(fFloatValue4, fLIZIZ2, 16.0f, pair7 != null ? (int) (pair7.getSecond().floatValue() * this.LLJI) : this.LLIZ), null, false);
        }
    }

    public final void LJIILIIL() {
        if (this.LLJJIJIIJIL.size() >= 3) {
            String str = (String) ListProtector.get(this.LLJJIJIIJIL, 0);
            Pair<Integer, Integer> pair = this.LLJJIJIL;
            LIZIZ(str, pair != null ? new C0H6Z(0.0f, pair.getSecond().floatValue() * 0.18f, -8.0f, (int) (pair.getSecond().floatValue() * this.LLJJ)) : LJIIJ(130.0f, -8.0f, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(70)), this.LLJILJIL), null, false);
            String str2 = (String) ListProtector.get(this.LLJJIJIIJIL, 1);
            Pair<Integer, Integer> pair2 = this.LLJJIJIL;
            LIZIZ(str2, pair2 != null ? new C0H6Z(pair2.getFirst().floatValue() * 0.17f, (-pair2.getSecond().intValue()) * 0.02f, 11.0f, (int) (pair2.getSecond().floatValue() * this.LLJJI)) : LJIIJ(85.0f, 11.0f, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(115)), this.LLJILJILJ), null, false);
            String str3 = (String) ListProtector.get(this.LLJJIJIIJIL, 2);
            Pair<Integer, Integer> pair3 = this.LLJJIJIL;
            LIZIZ(str3, pair3 != null ? new C0H6Z(pair3.getFirst().floatValue() * 0.1f, (-pair3.getSecond().intValue()) * 0.26f, 15.0f, (int) (pair3.getSecond().floatValue() * this.LLJJIII)) : LJIIJ(55.0f, 15.0f, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(90)), this.LLJILLL), null, false);
        }
    }

    public final void LJIILJJIL() {
        C1320770kTT<C1331070kk5> c1320770kTT;
        float fFloatValue;
        this.LLJJJ.LIZIZ();
        ((ArrayList) this.LLJJJJ).clear();
        this.LLJJJJJIL = null;
        if ((this.LLJJIJI.length() > 0) && (c1320770kTT = this.LLJJJIL) != null) {
            float width = getWidth() / 2.0f;
            float height = getHeight() / 2.0f;
            float f = this.LLJJIJIIJIL.isEmpty() ^ true ? this.LLILLL : 0.0f;
            int size = this.LLJJIJIIJIL.size();
            if (size != 0) {
                if (size == 1) {
                    Pair<Integer, Integer> pair = this.LLJJIJIL;
                    if (pair != null) {
                        width -= pair.getFirst().floatValue() * 0.05f;
                    }
                } else if (size != 2) {
                    Pair<Integer, Integer> pair2 = this.LLJJIJIL;
                    if (pair2 != null) {
                        width -= pair2.getFirst().floatValue() * 0.11f;
                        fFloatValue = pair2.getSecond().floatValue() * 0.04f;
                        height -= fFloatValue;
                    }
                } else {
                    Pair<Integer, Integer> pair3 = this.LLJJIJIL;
                    if (pair3 != null) {
                        width -= pair3.getFirst().floatValue() * 0.11f;
                        fFloatValue = pair3.getSecond().floatValue() * 0.03f;
                        height -= fFloatValue;
                    }
                }
            }
            float fFloatValue2 = width - ((this.LLJJIJIL != null ? (int) (r0.getSecond().floatValue() * this.LLJIJIL) : this.LLILZ) / 2.0f);
            float fFloatValue3 = height - ((this.LLJJIJIL != null ? (int) (r0.getSecond().floatValue() * this.LLJIJIL) : this.LLILZ) / 2.0f);
            Pair<Integer, Integer> pair4 = this.LLJJIJIL;
            this.LLJJJJJIL = new C0H6Y(c1320770kTT, fFloatValue2, fFloatValue3, pair4 != null ? (int) (pair4.getSecond().floatValue() * this.LLJIJIL) : this.LLILZ, f, null, false);
        }
        if (this.LLJJIJI.length() == 0) {
            int size2 = this.LLJJIJIIJIL.size();
            if (size2 != 0) {
                if (size2 != 1) {
                    if (size2 != 2) {
                        if (size2 != 3) {
                            LJIIL();
                            if (this.LLJJIJIIJIL.size() > 3) {
                                int size3 = this.LLJJIJIIJIL.size() - 3;
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append('+');
                                sbLIZ.append(size3);
                                LIZIZ("", new C0H6Z(this.LLJJIJIL != null ? (-r0.getFirst().intValue()) * 0.09f : C418440Gaw.LIZIZ(Float.valueOf(-35.0f)), this.LLJJIJIL != null ? (-r0.getSecond().intValue()) * 0.31f : C418440Gaw.LIZIZ(Float.valueOf(-60.0f)), 0.0f, this.LL), C2188811AlT.LIZIZ(sbLIZ), true);
                            }
                        } else {
                            LJIIL();
                        }
                    } else if (this.LLJJIJIIJIL.size() >= 2) {
                        String str = (String) ListProtector.get(this.LLJJIJIIJIL, 0);
                        float fLIZIZ = this.LLJJIJIL != null ? (-r0.getFirst().intValue()) * 0.13f : C418440Gaw.LIZIZ(Float.valueOf(-57.0f));
                        float fLIZIZ2 = this.LLJJIJIL != null ? (-r0.getSecond().intValue()) * 0.096f : C418440Gaw.LIZIZ(Float.valueOf(-18.0f));
                        Pair<Integer, Integer> pair5 = this.LLJJIJIL;
                        LIZIZ(str, new C0H6Z(fLIZIZ, fLIZIZ2, -4.0f, pair5 != null ? (int) (pair5.getSecond().floatValue() * this.LLJ) : this.LLILZLL), null, false);
                        String str2 = (String) ListProtector.get(this.LLJJIJIIJIL, 1);
                        Pair<Integer, Integer> pair6 = this.LLJJIJIL;
                        float fFloatValue4 = pair6 != null ? pair6.getFirst().floatValue() * 0.13f : C418440Gaw.LIZIZ(Float.valueOf(57.0f));
                        Pair<Integer, Integer> pair7 = this.LLJJIJIL;
                        float fFloatValue5 = pair7 != null ? pair7.getSecond().floatValue() * 0.04f : C418440Gaw.LIZIZ(Float.valueOf(18.0f));
                        Pair<Integer, Integer> pair8 = this.LLJJIJIL;
                        LIZIZ(str2, new C0H6Z(fFloatValue4, fFloatValue5, 16.0f, pair8 != null ? (int) (pair8.getSecond().floatValue() * this.LLJ) : this.LLILZLL), null, false);
                    }
                } else if (!this.LLJJIJIIJIL.isEmpty()) {
                    String str3 = (String) ListProtector.get(this.LLJJIJIIJIL, 0);
                    Pair<Integer, Integer> pair9 = this.LLJJIJIL;
                    LIZIZ(str3, new C0H6Z(0.0f, 0.0f, 0.0f, pair9 != null ? (int) (pair9.getSecond().floatValue() * this.LLIZLLLIL) : this.LLILZIL), null, false);
                }
            }
        } else {
            int size4 = this.LLJJIJIIJIL.size();
            if (size4 != 0) {
                if (size4 != 1) {
                    if (size4 != 2) {
                        if (size4 != 3) {
                            LJIILIIL();
                            if (((ArrayList) this.LLJJJJ).size() >= 3) {
                                int size5 = ((ArrayList) this.LLJJJJ).size() - 1;
                                C0H6Y c0h6y = (C0H6Y) ListProtector.get(this.LLJJJJ, size5);
                                int size6 = this.LLJJIJIIJIL.size() - 3;
                                List<C0H6Y> list = this.LLJJJJ;
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append('+');
                                sbLIZ2.append(size6);
                                ListProtector.set(list, size5, new C0H6Y(c0h6y.LIZ, c0h6y.LIZIZ, c0h6y.LIZJ, c0h6y.LIZLLL, c0h6y.LJ, C2188811AlT.LIZIZ(sbLIZ2), c0h6y.LJI));
                            }
                        } else {
                            LJIILIIL();
                        }
                    } else if (this.LLJJIJIIJIL.size() >= 2) {
                        String str4 = (String) ListProtector.get(this.LLJJIJIIJIL, 0);
                        Pair<Integer, Integer> pair10 = this.LLJJIJIL;
                        LIZIZ(str4, pair10 != null ? new C0H6Z(pair10.getFirst().floatValue() * 0.01f, pair10.getSecond().floatValue() * 0.2f, 8.0f, (int) (pair10.getSecond().floatValue() * this.LLJJ)) : LJIIJ(130.0f, -8.0f, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(70)), this.LLJILJIL), null, false);
                        String str5 = (String) ListProtector.get(this.LLJJIJIIJIL, 1);
                        Pair<Integer, Integer> pair11 = this.LLJJIJIL;
                        LIZIZ(str5, pair11 != null ? new C0H6Z(pair11.getFirst().floatValue() * 0.16f, (-pair11.getSecond().intValue()) * 0.13f, 8.0f, (int) (pair11.getSecond().floatValue() * this.LLJJ)) : LJIIJ(80.0f, 8.0f, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(100)), this.LLJILJIL), null, false);
                    }
                } else if (!this.LLJJIJIIJIL.isEmpty()) {
                    String str6 = (String) ListProtector.get(this.LLJJIJIIJIL, 0);
                    Pair<Integer, Integer> pair12 = this.LLJJIJIL;
                    LIZIZ(str6, pair12 != null ? new C0H6Z(pair12.getFirst().floatValue() * 0.1f, pair12.getSecond().floatValue() * 0.12f, 8.0f, (int) (pair12.getSecond().floatValue() * this.LLJJ)) : LJIIJ(135.0f, 8.0f, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(70)), this.LLJILJIL), null, false);
                }
            }
        }
        Iterator it2 = ((ArrayList) this.LLJJJJ).iterator();
        while (it2.hasNext()) {
            this.LLJJJ.LIZ(((C0H6Y) it2.next()).LIZ);
        }
        C1320770kTT<C1331070kk5> c1320770kTT2 = this.LLJJJIL;
        if (c1320770kTT2 != null) {
            this.LLJJJ.LIZ(c1320770kTT2);
        }
    }

    public final Pair<Integer, Integer> LJ() {
        int width = (int) (getWidth() * 0.535f);
        int width2 = getWidth();
        if (width != 0 && width > getHeight()) {
            width = getHeight();
            width2 = (int) (getHeight() / 0.535f);
        }
        return new Pair<>(Integer.valueOf(Math.min(getWidth(), width2)), Integer.valueOf(Math.min(getHeight(), width)));
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.LLJJJ.LIZLLL();
        C1320770kTT<C1331070kk5> c1320770kTT = this.LLJJJIL;
        if (c1320770kTT != null) {
            c1320770kTT.LJFF();
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.LLJJJ.LJ();
        C1320770kTT<C1331070kk5> c1320770kTT = this.LLJJJIL;
        if (c1320770kTT != null) {
            c1320770kTT.LJI();
        }
    }

    public C0H6X(Context context) {
        super(context, null, 0);
        this.LL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36));
        this.LLILLJJLI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
        this.LLILLL = -6.0f;
        this.LLILZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(110));
        this.LLILZIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(90));
        this.LLILZLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(80));
        this.LLIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(70));
        this.LLIZLLLIL = 0.43f;
        this.LLJ = 0.38f;
        this.LLJI = 0.34f;
        this.LLJIJIL = 0.53f;
        this.LLJILJIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(70));
        this.LLJILJILJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56));
        this.LLJILLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
        this.LLJJ = 0.34f;
        this.LLJJI = 0.27f;
        this.LLJJIII = 0.15f;
        this.LLJJIJI = "";
        this.LLJJIJIIJIL = C13BV.INSTANCE;
        this.LLJJJ = new C0H6V<>();
        this.LLJJJJ = new ArrayList();
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)));
        this.LLJJJJLIIL = paint;
        this.LLJJL = new int[]{1728053247, 1392508927, 872415231, 570425343, 1392508927, 1728053247};
        this.LLJJLIIIJLLLLLLLZ = new float[]{0.0f, 0.25f, 0.375f, 0.625f, 0.75f, 1.0f};
        Paint paint2 = new Paint(1);
        int iLJIIL = C2441009hQ.LJIIL(-16777216, 127);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zc, context);
        paint2.setColor(numLIZJ != null ? numLIZJ.intValue() : iLJIIL);
        paint2.setStyle(Paint.Style.FILL);
        this.LLJL = paint2;
        Paint paint3 = new Paint(1);
        paint3.setColor(-1);
        paint3.setTypeface(Typeface.DEFAULT_BOLD);
        paint3.setTextSize(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14)));
        paint3.setTextAlign(Paint.Align.CENTER);
        this.LLJLIL = paint3;
        Paint paint4 = new Paint(1);
        int iLJIIL2 = C2441009hQ.LJIIL(-1, 81);
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.zk, context);
        paint4.setColor(numLIZJ2 != null ? numLIZJ2.intValue() : iLJIIL2);
        paint4.setStyle(Paint.Style.STROKE);
        paint4.setStrokeWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(1.5f))));
        paint4.setStrokeCap(Paint.Cap.ROUND);
        paint4.setStrokeJoin(Paint.Join.ROUND);
        this.LLJLILLLLZIIL = paint4;
        this.LLJLL = new Path();
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        super.onDraw(canvas);
        C0H6Y c0h6y = this.LLJJJJJIL;
        if (c0h6y != null) {
            LJIIIIZZ(canvas, c0h6y, true);
        }
        Iterator it2 = ((ArrayList) this.LLJJJJ).iterator();
        while (it2.hasNext()) {
            LJIIIIZZ(canvas, (C0H6Y) it2.next(), false);
        }
        if (this.LLJJIJI.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (this.LLJJIJIIJIL.size() == 2) {
                if (((ArrayList) this.LLJJJJ).size() >= 2) {
                    C0H6Y c0h6y2 = (C0H6Y) ListProtector.get(this.LLJJJJ, 0);
                    C0H6Y c0h6y3 = (C0H6Y) ListProtector.get(this.LLJJJJ, 1);
                    float fLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(30));
                    LJII(canvas, getWidth() / 2.0f, getHeight() / 2.0f, c0h6y2, c0h6y3, fLIZIZ, fLIZIZ, (c0h6y2.LIZLLL / 2.0f) - C418440Gaw.LIZIZ(4));
                    return;
                }
                return;
            }
            if (this.LLJJIJIIJIL.size() == 3) {
                if (((ArrayList) this.LLJJJJ).size() < 3) {
                    return;
                }
                C0H6Y c0h6y4 = (C0H6Y) ListProtector.get(this.LLJJJJ, 0);
                C0H6Y c0h6y5 = (C0H6Y) ListProtector.get(this.LLJJJJ, 1);
                C0H6Y c0h6y6 = (C0H6Y) ListProtector.get(this.LLJJJJ, 2);
                float f = c0h6y4.LIZLLL / 2.0f;
                float f2 = c0h6y5.LIZLLL / 2.0f;
                float f3 = c0h6y6.LIZLLL / 2.0f;
                float f4 = (((((c0h6y4.LIZIZ + f) + c0h6y5.LIZIZ) + f2) + c0h6y6.LIZIZ) + f3) / 3.0f;
                float f5 = (((((c0h6y4.LIZJ + f) + c0h6y5.LIZJ) + f2) + c0h6y6.LIZJ) + f3) / 3.0f;
                float fLJI = (((LJI(f4, f5, c0h6y4) + LJI(f4, f5, c0h6y5)) + LJI(f4, f5, c0h6y6)) / 3.0f) + ((((c0h6y4.LIZLLL + c0h6y5.LIZLLL) + c0h6y6.LIZLLL) / 3.0f) / 2.0f) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
                float fLIZJ = LIZJ(f4, f5, c0h6y4);
                float fLIZJ2 = LIZJ(f4, f5, c0h6y5);
                float fLIZJ3 = LIZJ(f4, f5, c0h6y6);
                float fLJIIJJI = LJIIJJI(fLIZJ2 - fLIZJ);
                float fLJIIJJI2 = LJIIJJI(fLIZJ3 - fLIZJ2);
                float fLJIIJJI3 = LJIIJJI(fLIZJ - fLIZJ3);
                float degrees = (float) Math.toDegrees(((c0h6y4.LIZLLL / 2.0f) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))) / fLJI);
                float degrees2 = (float) Math.toDegrees(((c0h6y5.LIZLLL / 2.0f) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))) / fLJI);
                float degrees3 = (float) Math.toDegrees(((c0h6y5.LIZLLL / 2.0f) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))) / fLJI);
                float degrees4 = (float) Math.toDegrees(((c0h6y6.LIZLLL / 2.0f) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))) / fLJI);
                float degrees5 = (float) Math.toDegrees(((c0h6y6.LIZLLL / 2.0f) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))) / fLJI);
                float degrees6 = (float) Math.toDegrees(((c0h6y4.LIZLLL / 2.0f) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))) / fLJI);
                float f6 = c0h6y4.LIZLLL;
                float f7 = f6 * 0.25f;
                float f8 = f6 * 0.6f;
                float f9 = f6 * 0.5f;
                if (fLJIIJJI > 0.0f) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                LJIIIZ(canvas, f4, f5, f8, f9, fLIZJ, fLIZJ2, degrees, degrees2, f7, z4);
                if (fLJIIJJI2 > 0.0f) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                LJIIIZ(canvas, f4, f5, f8, f9, fLIZJ2, fLIZJ3, degrees3, degrees4, f7, z5);
                if (fLJIIJJI3 > 0.0f) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                LJIIIZ(canvas, f4, f5, f8, f9, fLIZJ3, fLIZJ, degrees5, degrees6, f7, z6);
                return;
            }
            if (this.LLJJIJIIJIL.size() <= 3 || ((ArrayList) this.LLJJJJ).size() < 3) {
                return;
            }
            C0H6Y c0h6y7 = (C0H6Y) ListProtector.get(this.LLJJJJ, 0);
            C0H6Y c0h6y8 = (C0H6Y) ListProtector.get(this.LLJJJJ, 1);
            C0H6Y c0h6y9 = (C0H6Y) ListProtector.get(this.LLJJJJ, 2);
            float f10 = c0h6y7.LIZLLL / 2.0f;
            float f11 = c0h6y8.LIZLLL / 2.0f;
            float f12 = c0h6y9.LIZLLL / 2.0f;
            float f13 = (((((c0h6y7.LIZIZ + f10) + c0h6y8.LIZIZ) + f11) + c0h6y9.LIZIZ) + f12) / 3.0f;
            float f14 = (((((c0h6y7.LIZJ + f10) + c0h6y8.LIZJ) + f11) + c0h6y9.LIZJ) + f12) / 3.0f;
            float fLJI2 = ((LJI(f13, f14, c0h6y7) + LJI(f13, f14, c0h6y8)) + LJI(f13, f14, c0h6y9)) / 3.0f;
            float f15 = c0h6y7.LIZLLL;
            float f16 = f15 * 0.25f;
            float f18 = f15 * 0.6f;
            float f19 = f15 * 0.5f;
            float fLIZJ4 = LIZJ(f13, f14, c0h6y7);
            float fLIZJ5 = LIZJ(f13, f14, c0h6y8);
            float fLIZJ6 = LIZJ(f13, f14, c0h6y9);
            float fLIZIZ2 = fLJI2 + ((((c0h6y8.LIZLLL + r10) + c0h6y9.LIZLLL) / 3.0f) / 2.0f) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
            float degrees7 = (float) Math.toDegrees(((c0h6y7.LIZLLL / 2.0f) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))) / fLIZIZ2);
            float degrees8 = (float) Math.toDegrees(((c0h6y8.LIZLLL / 2.0f) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))) / fLIZIZ2);
            float fLJIIJJI4 = LJIIJJI(fLIZJ5 - fLIZJ4);
            float degrees9 = (float) Math.toDegrees(((c0h6y8.LIZLLL / 2.0f) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))) / fLIZIZ2);
            float degrees10 = (float) Math.toDegrees(((c0h6y9.LIZLLL / 2.0f) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))) / fLIZIZ2);
            float fLJIIJJI5 = LJIIJJI(fLIZJ6 - fLIZJ5);
            if (fLJIIJJI4 > 0.0f) {
                z2 = true;
            } else {
                z2 = false;
            }
            LJIIIZ(canvas, f13, f14, f18, f19, fLIZJ4, fLIZJ5, degrees7, degrees8, f16, z2);
            if (fLJIIJJI5 > 0.0f) {
                z3 = true;
            } else {
                z3 = false;
            }
            LJIIIZ(canvas, f13, f14, f18, f19, fLIZJ5, fLIZJ6, degrees9, degrees10, f16, z3);
            return;
        }
        if (this.LLJJIJIIJIL.size() != 2 || ((ArrayList) this.LLJJJJ).size() < 2) {
            return;
        }
        C0H6Y c0h6y10 = (C0H6Y) ListProtector.get(this.LLJJJJ, 0);
        C0H6Y c0h6y11 = (C0H6Y) ListProtector.get(this.LLJJJJ, 1);
        float fLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
        LJII(canvas, getWidth() / 2.0f, getHeight() / 2.0f, c0h6y10, c0h6y11, fLIZIZ3, fLIZIZ3, (c0h6y10.LIZLLL / 2.0f) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C0H6V<C1331070kk5> c0h6v = this.LLJJJ;
        int i = 0;
        while (true) {
            if (i < c0h6v.LIZIZ.size()) {
                if (((C1320770kTT) c0h6v.LIZIZ.get(i)).LJII(motionEvent)) {
                    break;
                }
                i++;
            } else {
                if (super.onTouchEvent(motionEvent)) {
                    break;
                }
                return false;
            }
        }
        return true;
    }

    public final void setAvatars(List<String> list) {
        this.LLJJIJIL = LJ();
        this.LLJJIJIIJIL = list;
        LJIILJJIL();
        invalidate();
    }

    public final void setMainImage(MediaModel mediaModel) {
        this.LLJJIJIL = LJ();
        String strLJFF = mediaModel.LJFF();
        if (strLJFF == null) {
            strLJFF = "";
        }
        this.LLJJIJI = strLJFF;
        if (strLJFF.length() > 0) {
            if (this.LLJJJIL == null) {
                C1320770kTT<C1331070kk5> c1320770kTTLJFF = LJFF();
                DH dh = c1320770kTTLJFF.LLILZ;
                dh.getClass();
                ((C1331070kk5) dh).LJJIII(C1331100kk8.LIZLLL(this.LLILLJJLI));
                this.LLJJJIL = c1320770kTTLJFF;
                c1320770kTTLJFF.LJFF();
            }
            C1320770kTT<C1331070kk5> c1320770kTT = this.LLJJJIL;
            if (c1320770kTT != null) {
                LIZLLL(c1320770kTT, this.LLJJIJI);
            }
        } else {
            C1320770kTT<C1331070kk5> c1320770kTT2 = this.LLJJJIL;
            if (c1320770kTT2 != null) {
                c1320770kTT2.LJI();
            }
            this.LLJJJIL = null;
        }
        LJIILJJIL();
        invalidate();
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        C1321120kU2 c1321120kU2;
        C1320770kTT<C1331070kk5> c1320770kTT = this.LLJJJIL;
        if (c1320770kTT != null) {
            DH dh = c1320770kTT.LLILZ;
            dh.getClass();
            c1321120kU2 = ((C1331070kk5) dh).LJ;
        } else {
            c1321120kU2 = null;
        }
        if (Intrinsics.LJFF(drawable, c1321120kU2) || this.LLJJJ.LJI(drawable) || super.verifyDrawable(drawable)) {
            return true;
        }
        return false;
    }

    public final void LIZLLL(C1320770kTT<C1331070kk5> c1320770kTT, String str) {
        Uri uriFromFile;
        if (u.LJJIIJZLJL(str, "/", false)) {
            uriFromFile = Uri.fromFile(new C0VSJ(str));
        } else {
            uriFromFile = UriProtector.parse(str);
        }
        C1320810kTX c1320810kTXLIZJ = C1322200kVm.LIZJ();
        c1320810kTXLIZJ.LJI(uriFromFile);
        c1320810kTXLIZJ.LJIILJJIL = c1320770kTT.LLILZIL;
        c1320810kTXLIZJ.LJIIIIZZ = new C0IE7(this, 6);
        c1320770kTT.LJIIIIZZ(c1320810kTXLIZJ.LIZ());
    }

    public static float LIZJ(float f, float f2, C0H6Y c0h6y) {
        float f3 = c0h6y.LIZIZ;
        float f4 = c0h6y.LIZLLL / 2.0f;
        return (float) Math.toDegrees(Math.atan2((c0h6y.LIZJ + f4) - f2, (f3 + f4) - f));
    }

    public static float LJI(float f, float f2, C0H6Y c0h6y) {
        float f3 = c0h6y.LIZLLL / 2.0f;
        float f4 = (c0h6y.LIZIZ + f3) - f;
        float f5 = (c0h6y.LIZJ + f3) - f2;
        return (float) Math.sqrt((f4 * f4) + (f5 * f5));
    }

    public final void LIZ(double d, float f, float f2) {
        float fLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3));
        double radians = Math.toRadians(45.0d);
        double d2 = d - radians;
        float fCos = f - (((float) Math.cos(d2)) * fLIZIZ);
        float fSin = f2 - (((float) Math.sin(d2)) * fLIZIZ);
        double d3 = d + radians;
        float fCos2 = f - (((float) Math.cos(d3)) * fLIZIZ);
        float fSin2 = f2 - (fLIZIZ * ((float) Math.sin(d3)));
        this.LLJLL.moveTo(fCos, fSin);
        this.LLJLL.lineTo(f, f2);
        this.LLJLL.lineTo(fCos2, fSin2);
    }

    public final void LJIIIIZZ(Canvas canvas, C0H6Y c0h6y, boolean z) {
        float f = c0h6y.LIZIZ;
        float f2 = c0h6y.LIZLLL / 2.0f;
        float f3 = c0h6y.LIZJ + f2;
        canvas.save();
        canvas.translate(f + f2, f3);
        canvas.rotate(c0h6y.LJ);
        if (c0h6y.LJI) {
            canvas.drawCircle(0.0f, 0.0f, f2, this.LLJL);
            canvas.save();
            canvas.rotate(-c0h6y.LJ);
            float f4 = (-(this.LLJLIL.descent() + this.LLJLIL.ascent())) / 2;
            String str = c0h6y.LJFF;
            if (str == null) {
                str = "";
            }
            canvas.drawText(str, 0.0f, f4, this.LLJLIL);
            canvas.restore();
            if (z) {
                float f5 = -f2;
                RectF rectF = new RectF(f5, f5, f2, f2);
                float f6 = this.LLILLJJLI;
                canvas.drawRoundRect(rectF, f6, f6, this.LLJJJJLIIL);
            } else {
                canvas.drawCircle(0.0f, 0.0f, f2, this.LLJJJJLIIL);
            }
        } else {
            DH dh = c0h6y.LIZ.LLILZ;
            dh.getClass();
            C1321120kU2 c1321120kU2 = ((C1331070kk5) dh).LJ;
            if (c1321120kU2 != null) {
                int i = (int) (-f2);
                int i2 = (int) f2;
                c1321120kU2.setBounds(i, i, i2, i2);
            }
            DH dh2 = c0h6y.LIZ.LLILZ;
            dh2.getClass();
            C1321120kU2 c1321120kU22 = ((C1331070kk5) dh2).LJ;
            if (c1321120kU22 != null) {
                c1321120kU22.draw(canvas);
            }
            String str2 = c0h6y.LJFF;
            if (str2 != null) {
                canvas.drawCircle(0.0f, 0.0f, f2, this.LLJL);
                canvas.save();
                canvas.rotate(-c0h6y.LJ);
                canvas.drawText(str2, 0.0f, (-(this.LLJLIL.descent() + this.LLJLIL.ascent())) / 2, this.LLJLIL);
                canvas.restore();
            }
            if (z) {
                float f7 = -f2;
                RectF rectF2 = new RectF(f7, f7, f2, f2);
                float f8 = this.LLILLJJLI;
                canvas.drawRoundRect(rectF2, f8, f8, this.LLJJJJLIIL);
            } else {
                canvas.drawCircle(0.0f, 0.0f, f2, this.LLJJJJLIIL);
            }
        }
        canvas.restore();
    }

    public static C0H6Z LJIIJ(float f, float f2, int i, int i2) {
        double radians = Math.toRadians(f - 90);
        double d = i;
        return new C0H6Z((float) (Math.cos(radians) * d), (float) (d * Math.sin(radians)), f2, i2);
    }

    public final void LIZIZ(String str, C0H6Z c0h6z, String str2, boolean z) {
        C1320770kTT<C1331070kk5> c1320770kTTLJFF = LJFF();
        if (!z) {
            LIZLLL(c1320770kTTLJFF, str);
        }
        float width = (getWidth() / 2.0f) + c0h6z.LIZ;
        int i = c0h6z.LIZJ;
        float f = i / 2.0f;
        ((ArrayList) this.LLJJJJ).add(new C0H6Y(c1320770kTTLJFF, width - f, ((getHeight() / 2.0f) + c0h6z.LIZIZ) - f, i, c0h6z.LIZLLL, str2, z));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.LLJJIJIL = LJ();
        if (this.LLJJJJLIIL.getShader() == null) {
            SweepGradient sweepGradient = new SweepGradient(0.0f, 0.0f, this.LLJJL, this.LLJJLIIIJLLLLLLLZ);
            Matrix matrix = new Matrix();
            matrix.preRotate(-90.0f);
            sweepGradient.setLocalMatrix(matrix);
            this.LLJJJJLIIL.setShader(sweepGradient);
        }
        LJIILJJIL();
    }

    public final void LJII(Canvas canvas, float f, float f2, C0H6Y c0h6y, C0H6Y c0h6y2, float f3, float f4, float f5) {
        Pair pair;
        double d;
        float f6 = c0h6y.LIZLLL / 2.0f;
        float f7 = (c0h6y.LIZIZ + f6) - f;
        float f8 = (c0h6y.LIZJ + f6) - f2;
        float f9 = c0h6y2.LIZLLL / 2.0f;
        float f10 = (c0h6y2.LIZIZ + f9) - f;
        float f11 = (c0h6y2.LIZJ + f9) - f2;
        float f12 = f10 - f7;
        float f13 = f11 - f8;
        float fSqrt = (float) Math.sqrt((f12 * f12) + (f13 * f13));
        if (fSqrt <= 0.0f) {
            return;
        }
        float f14 = f12 / fSqrt;
        float f15 = f13 / fSqrt;
        float f16 = 2;
        float f18 = 1.0f * f5;
        float f19 = (-f15) * f18;
        float f20 = f18 * f14;
        PointF pointF = new PointF(f7 + (f3 * f14) + f19, f8 + (f3 * f15) + f20);
        PointF pointF2 = new PointF((f10 - (f4 * f14)) + f19, (f11 - (f4 * f15)) + f20);
        float f21 = pointF2.x - pointF.x;
        float f22 = pointF2.y - pointF.y;
        float fSqrt2 = ((float) Math.sqrt((f21 * f21) + (f22 * f22))) * 0.65f;
        float f23 = pointF2.x - pointF.x;
        float f24 = pointF2.y - pointF.y;
        float fSqrt3 = (float) Math.sqrt((f23 * f23) + (f24 * f24));
        if (fSqrt3 > 0.0f) {
            float fMax = Math.max(fSqrt2, (fSqrt3 / 2.0f) + 0.1f);
            float f25 = (pointF.x + pointF2.x) / f16;
            float f26 = (pointF.y + pointF2.y) / f16;
            float f27 = fSqrt3 / f16;
            float fSqrt4 = (float) Math.sqrt((fMax * fMax) - (f27 * f27));
            float f28 = f24 / fSqrt3;
            float f29 = (-f23) / fSqrt3;
            float f30 = f25 + f28;
            float f31 = f26 + f29;
            float f32 = (f30 * f30) + (f31 * f31);
            float f33 = f25 - f28;
            float f34 = f26 - f29;
            if (f32 > (f33 * f33) + (f34 * f34)) {
                pair = new Pair(Float.valueOf(f28), Float.valueOf(f29));
            } else {
                pair = new Pair(Float.valueOf(-f28), Float.valueOf(-f29));
            }
            float f35 = f25 + ((-((Number) pair.getFirst()).floatValue()) * fSqrt4);
            float f36 = f26 + (fSqrt4 * (-((Number) pair.getSecond()).floatValue()));
            float fAtan2 = (float) Math.atan2(pointF.y - f36, pointF.x - f35);
            float fAtan22 = (float) Math.atan2(pointF2.y - f36, pointF2.x - f35);
            double d2 = fAtan2;
            float degrees = (float) Math.toDegrees(d2);
            float degrees2 = (float) Math.toDegrees(fAtan22 - fAtan2);
            if (degrees2 > 180.0f) {
                degrees2 -= 360;
            }
            if (degrees2 < -180.0f) {
                degrees2 += 360;
            }
            this.LLJLL.reset();
            RectF rectF = new RectF(f35 - fMax, f36 - fMax, f35 + fMax, f36 + fMax);
            boolean z = true;
            this.LLJLL.arcTo(rectF, degrees, degrees2, true);
            if (degrees2 <= 0.0f) {
                z = false;
            }
            double d3 = -1.5707963267948966d;
            if (z) {
                d = -1.5707963267948966d;
            } else {
                d = 1.5707963267948966d;
            }
            LIZ(d2 + d, pointF.x, pointF.y);
            double d4 = fAtan22;
            if (z) {
                d3 = 1.5707963267948966d;
            }
            LIZ(d4 + d3, pointF2.x, pointF2.y);
            this.LLJLL.offset(getWidth() / 2.0f, getHeight() / 2.0f);
            canvas.drawPath(this.LLJLL, this.LLJLILLLLZIIL);
        }
    }

    public final void LJIIIZ(Canvas canvas, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, boolean z) {
        float f10;
        float f11;
        double d;
        double d2;
        float f12 = f9;
        float fLJIIJJI = LJIIJJI(f6 - f5);
        float f13 = f7 + f8;
        if (Math.abs(fLJIIJJI) < f13) {
            return;
        }
        float fAbs = f7 + ((Math.abs(fLJIIJJI) - f13) / 2.0f);
        if (z) {
            f10 = f5 + fAbs;
        } else {
            f10 = f5 - fAbs;
        }
        double radians = Math.toRadians(f10);
        float f14 = f12 / 2.0f;
        if (z) {
            f11 = f10 - f14;
        } else {
            f11 = f10 + f14;
            f12 = -f12;
        }
        double d3 = f4;
        float fCos = f + ((float) (Math.cos(radians) * d3));
        float fSin = f2 + ((float) (d3 * Math.sin(radians)));
        RectF rectF = new RectF(fCos - f3, fSin - f3, fCos + f3, fSin + f3);
        this.LLJLL.reset();
        this.LLJLL.arcTo(rectF, f11, f12, true);
        double radians2 = Math.toRadians(f11);
        double radians3 = Math.toRadians(f11 + f12);
        if (z) {
            d = radians2 - 1.5707963267948966d;
            d2 = 1.5707963267948966d + radians3;
        } else {
            d = radians2 + 1.5707963267948966d;
            d2 = radians3 - 1.5707963267948966d;
        }
        double d4 = fCos;
        double d5 = f3;
        float fCos2 = (float) (d4 + (Math.cos(radians2) * d5));
        double d6 = fSin;
        float fSin2 = (float) ((Math.sin(radians2) * d5) + d6);
        float fCos3 = (float) (d4 + (Math.cos(radians3) * d5));
        float fSin3 = (float) (d6 + (d5 * Math.sin(radians3)));
        LIZ(d, fCos2, fSin2);
        LIZ(d2, fCos3, fSin3);
        canvas.drawPath(this.LLJLL, this.LLJLILLLLZIIL);
    }
}

package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.goda.v2.model.dto.GodaV2Style;
import com.bytedance.goda.v2.model.dto.GodaV2StyleColor;
import com.bytedance.goda.v2.model.dto.GodaV2StyleCorner;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0kwN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1338690kwN {
    public final ViewGroup LIZ;
    public final Context LIZIZ;
    public final float[] LIZJ;
    public final Path LIZLLL;
    public final RectF LJ;
    public final String LJFF;
    public int LJI;
    public String LJII;
    public Integer LJIIIIZZ;
    public String LJIIIZ;
    public Integer LJIIJ;
    public boolean LJIIJJI;
    public boolean LJIIL;

    public final void LJI() {
        ViewGroup viewGroup = this.LIZ;
        viewGroup.setClipChildren(true);
        viewGroup.setClipToPadding(false);
        if (Build.VERSION.SDK_INT < 28) {
            viewGroup.setLayerType(1, null);
        }
        viewGroup.setClipToOutline(false);
        viewGroup.setWillNotDraw(false);
        viewGroup.setBackground(null);
        viewGroup.setOverScrollMode(2);
    }

    public final void LJII() {
        this.LJ.set(0.0f, 0.0f, this.LIZ.getWidth(), this.LIZ.getHeight());
        this.LIZLLL.reset();
        this.LIZLLL.addRoundRect(this.LJ, this.LIZJ, Path.Direction.CW);
    }

    public final void LIZ(GodaV2StyleColor godaV2StyleColor) {
        String str;
        int color;
        if (C960203pA.LIZIZ(this.LIZIZ)) {
            if (godaV2StyleColor == null || ((str = godaV2StyleColor.darkColor) == null && (str = godaV2StyleColor.color) == null)) {
                str = this.LJFF;
            }
        } else if (godaV2StyleColor == null || (str = godaV2StyleColor.color) == null) {
            str = this.LJFF;
        }
        try {
            if (C960203pA.LIZIZ(this.LIZIZ)) {
                if (Intrinsics.LJFF(this.LJIIIZ, str)) {
                    Integer num = this.LJIIJ;
                    if (num != null) {
                        color = num.intValue();
                    } else {
                        color = Color.parseColor(str);
                        this.LJIIIZ = str;
                        this.LJIIJ = Integer.valueOf(color);
                    }
                } else {
                    color = Color.parseColor(str);
                    this.LJIIIZ = str;
                    this.LJIIJ = Integer.valueOf(color);
                }
            } else if (Intrinsics.LJFF(this.LJII, str)) {
                Integer num2 = this.LJIIIIZZ;
                if (num2 != null) {
                    color = num2.intValue();
                } else {
                    color = Color.parseColor(str);
                    this.LJII = str;
                    this.LJIIIIZZ = Integer.valueOf(color);
                }
            } else {
                color = Color.parseColor(str);
                this.LJII = str;
                this.LJIIIIZZ = Integer.valueOf(color);
            }
        } catch (IllegalArgumentException e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJ(e);
            color = ColorProtector.parseColor(this.LJFF);
        }
        if (this.LJI != color) {
            this.LJI = color;
            if (this.LJIIJJI) {
                this.LJIIL = true;
            } else {
                this.LIZ.invalidate();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0035 A[PHI: r10
      0x0035: PHI (r10v2 float) = (r10v0 float), (r10v3 float) binds: [B:15:0x0025, B:19:0x0033] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(com.bytedance.goda.v2.model.dto.GodaV2StyleCorner r13) {
        /*
            r12 = this;
            r11 = 0
            if (r13 == 0) goto L82
            java.lang.Float r0 = r13.radius
            if (r0 == 0) goto L82
            float r0 = r0.floatValue()
            int r0 = X.C1338790kwX.LIZ(r0)
            float r1 = (float) r0
        L10:
            java.util.ArrayList<java.lang.Integer> r3 = r13.position
        L12:
            r2 = 1
            r4 = 0
            if (r3 == 0) goto L24
            java.lang.Object r0 = X.C13LP.LJJJLZIJ(r4, r3)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto L80
            int r0 = r0.intValue()
            if (r0 != r2) goto L80
        L24:
            r10 = r1
            if (r3 == 0) goto L35
        L27:
            java.lang.Object r0 = X.C13LP.LJJJLZIJ(r2, r3)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto L7e
            int r0 = r0.intValue()
            if (r0 != r2) goto L7e
        L35:
            r9 = r1
        L36:
            r6 = 2
            if (r3 == 0) goto L47
            java.lang.Object r0 = X.C13LP.LJJJLZIJ(r6, r3)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto L7c
            int r0 = r0.intValue()
            if (r0 != r2) goto L7c
        L47:
            r8 = r1
        L48:
            r7 = 3
            if (r3 == 0) goto L59
            java.lang.Object r0 = X.C13LP.LJJJLZIJ(r7, r3)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto L5a
            int r0 = r0.intValue()
            if (r0 != r2) goto L5a
        L59:
            r11 = r1
        L5a:
            float[] r5 = r12.LIZJ
            r0 = r5[r4]
            int r0 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r0 != 0) goto L7a
            r0 = 1
        L63:
            r3 = 6
            r1 = 4
            if (r0 == 0) goto L87
            r0 = r5[r6]
            int r0 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r0 != 0) goto L87
            r0 = r5[r1]
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r0 != 0) goto L87
            r0 = r5[r3]
            int r0 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r0 != 0) goto L87
            return
        L7a:
            r0 = 0
            goto L63
        L7c:
            r8 = 0
            goto L48
        L7e:
            r9 = 0
            goto L36
        L80:
            r10 = 0
            goto L27
        L82:
            r1 = 0
            if (r13 != 0) goto L10
            r3 = 0
            goto L12
        L87:
            r5[r4] = r10
            r5[r2] = r10
            r5[r6] = r9
            r5[r7] = r9
            r5[r1] = r8
            r0 = 5
            r5[r0] = r8
            r5[r3] = r11
            r0 = 7
            r5[r0] = r11
            r12.LJII()
            boolean r0 = r12.LJIIJJI
            if (r0 == 0) goto La3
            r12.LJIIL = r2
            return
        La3:
            android.view.ViewGroup r0 = r12.LIZ
            r0.invalidate()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1338690kwN.LIZIZ(com.bytedance.goda.v2.model.dto.GodaV2StyleCorner):void");
    }

    public final void LIZJ(List<Float> list) {
        Float f;
        Float fValueOf = Float.valueOf(0.0f);
        List listLJIIJJI = C1697810uHb.LJIIJJI(fValueOf, fValueOf, fValueOf, fValueOf);
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJIIJJI, 10));
        int i = 0;
        for (Object obj : listLJIIJJI) {
            int i2 = i + 1;
            if (i >= 0) {
                float fFloatValue = ((Number) obj).floatValue();
                if (list != null && (f = (Float) C13LP.LJJJLZIJ(i, list)) != null) {
                    fFloatValue = f.floatValue();
                }
                arrayList.add(Float.valueOf(fFloatValue));
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        float fFloatValue2 = ((Number) ListProtector.get(arrayList, 0)).floatValue();
        float fFloatValue3 = ((Number) ListProtector.get(arrayList, 1)).floatValue();
        float fFloatValue4 = ((Number) ListProtector.get(arrayList, 2)).floatValue();
        int iLIZ = C1338790kwX.LIZ(((Number) ListProtector.get(arrayList, 3)).floatValue());
        int iLIZ2 = C1338790kwX.LIZ(fFloatValue2);
        int iLIZ3 = C1338790kwX.LIZ(fFloatValue3);
        int iLIZ4 = C1338790kwX.LIZ(fFloatValue4);
        if (this.LIZ.getPaddingLeft() != iLIZ || this.LIZ.getPaddingTop() != iLIZ2 || this.LIZ.getPaddingRight() != iLIZ3 || this.LIZ.getPaddingBottom() != iLIZ4) {
            this.LIZ.setPadding(iLIZ, iLIZ2, iLIZ3, iLIZ4);
            if (this.LJIIJJI) {
                this.LJIIL = true;
            } else {
                this.LIZ.invalidate();
            }
        }
    }

    public final void LIZLLL(GodaV2Style godaV2Style) {
        ArrayList<Float> arrayList;
        GodaV2StyleCorner godaV2StyleCorner;
        this.LJIIJJI = true;
        this.LJIIL = false;
        GodaV2StyleColor godaV2StyleColor = null;
        if (godaV2Style == null) {
            arrayList = null;
        } else {
            try {
                arrayList = godaV2Style.padding;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                this.LJIIJJI = false;
                if (this.LJIIL) {
                    this.LIZ.invalidate();
                    this.LJIIL = false;
                }
                throw th;
            }
        }
        LIZJ(arrayList);
        if (godaV2Style == null) {
            godaV2StyleCorner = null;
        } else {
            godaV2StyleCorner = godaV2Style.corner;
        }
        LIZIZ(godaV2StyleCorner);
        if (godaV2Style != null) {
            godaV2StyleColor = godaV2Style.bgColor;
        }
        LIZ(godaV2StyleColor);
        this.LJIIJJI = false;
        if (this.LJIIL) {
            this.LIZ.invalidate();
            this.LJIIL = false;
        }
    }

    public C1338690kwN(Context context, ViewGroup viewGroup) {
        this.LIZ = viewGroup;
        this.LIZIZ = context;
        float[] fArr = new float[8];
        int i = 0;
        do {
            fArr[i] = 0.0f;
            i++;
        } while (i < 8);
        this.LIZJ = fArr;
        this.LIZLLL = new Path();
        this.LJ = new RectF();
        this.LJFF = "#00000000";
        this.LJI = ColorProtector.parseColor("#00000000");
    }

    public static void LJFF(int i, int i2, View view) {
        Drawable background;
        if (view.getBackground() != null && i > 0 && i2 > 0 && (background = view.getBackground()) != null && (background.getBounds().width() != i || background.getBounds().height() != i2)) {
            background.setBounds(0, 0, i, i2);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (!viewGroup.getClipChildren()) {
                viewGroup.setClipChildren(true);
                viewGroup.setClipToPadding(false);
            }
        }
    }

    public final void LJ(Canvas canvas, int i, int i2, Function1<? super Canvas, Unit> function1) {
        if (i != 0 && i2 != 0) {
            for (float f : this.LIZJ) {
                if (f > 0.0f) {
                    canvas.save();
                    canvas.clipPath(this.LIZLLL);
                    function1.invoke(canvas);
                    canvas.restore();
                    return;
                }
            }
            function1.invoke(canvas);
        }
    }
}

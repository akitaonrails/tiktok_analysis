package X;

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

/* JADX INFO: renamed from: X.0kwO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1338700kwO {
    public final ViewGroup LIZ;
    public final float[] LIZIZ;
    public final Path LIZJ;
    public final RectF LIZLLL;
    public float LJ;
    public int LJFF;
    public String LJI;
    public Integer LJII;
    public String LJIIIIZZ;
    public Integer LJIIIZ;
    public boolean LJIIJ;
    public boolean LJIIJJI;

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
        this.LIZLLL.set(0.0f, 0.0f, this.LIZ.getWidth(), this.LIZ.getHeight());
        this.LIZJ.reset();
        this.LIZJ.addRoundRect(this.LIZLLL, this.LIZIZ, Path.Direction.CW);
    }

    public C1338700kwO(ViewGroup viewGroup) {
        this.LIZ = viewGroup;
        float[] fArr = new float[8];
        int i = 0;
        do {
            fArr[i] = 0.0f;
            i++;
        } while (i < 8);
        this.LIZIZ = fArr;
        this.LIZJ = new Path();
        this.LIZLLL = new RectF();
        this.LJFF = ColorProtector.parseColor("#00000000");
    }

    public final void LIZ(GodaV2StyleColor godaV2StyleColor) {
        String str;
        int color;
        if (!C960203pA.LIZIZ(this.LIZ.getContext()) ? godaV2StyleColor == null || (str = godaV2StyleColor.color) == null : godaV2StyleColor == null || (str = godaV2StyleColor.darkColor) == null) {
            str = "#00000000";
        }
        try {
            if (C960203pA.LIZIZ(this.LIZ.getContext())) {
                if (Intrinsics.LJFF(this.LJIIIIZZ, str)) {
                    Integer num = this.LJIIIZ;
                    if (num != null) {
                        color = num.intValue();
                    } else {
                        color = Color.parseColor(str);
                        this.LJIIIIZZ = str;
                        this.LJIIIZ = Integer.valueOf(color);
                    }
                } else {
                    color = Color.parseColor(str);
                    this.LJIIIIZZ = str;
                    this.LJIIIZ = Integer.valueOf(color);
                }
            } else if (Intrinsics.LJFF(this.LJI, str)) {
                Integer num2 = this.LJII;
                if (num2 != null) {
                    color = num2.intValue();
                } else {
                    color = Color.parseColor(str);
                    this.LJI = str;
                    this.LJII = Integer.valueOf(color);
                }
            } else {
                color = Color.parseColor(str);
                this.LJI = str;
                this.LJII = Integer.valueOf(color);
            }
        } catch (IllegalArgumentException e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJ(e);
            color = ColorProtector.parseColor("#00000000");
        }
        if (this.LJFF != color) {
            this.LJFF = color;
            if (this.LJIIJ) {
                this.LJIIJJI = true;
            } else {
                this.LIZ.invalidate();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(com.bytedance.goda.v2.model.dto.GodaV2StyleCorner r13) {
        /*
            Method dump skipped, instruction units count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1338700kwO.LIZIZ(com.bytedance.goda.v2.model.dto.GodaV2StyleCorner):void");
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
        int iLIZ = (int) C0H9H.LIZ(((Number) ListProtector.get(arrayList, 3)).floatValue());
        int iLIZ2 = (int) C0H9H.LIZ(fFloatValue2);
        int iLIZ3 = (int) C0H9H.LIZ(fFloatValue3);
        int iLIZ4 = (int) C0H9H.LIZ(fFloatValue4);
        if (this.LIZ.getPaddingLeft() != iLIZ || this.LIZ.getPaddingTop() != iLIZ2 || this.LIZ.getPaddingRight() != iLIZ3 || this.LIZ.getPaddingBottom() != iLIZ4) {
            this.LIZ.setPadding(iLIZ, iLIZ2, iLIZ3, iLIZ4);
            if (this.LJIIJ) {
                this.LJIIJJI = true;
            } else {
                this.LIZ.invalidate();
            }
        }
    }

    public final void LIZLLL(GodaV2Style godaV2Style, Function1<? super GodaV2Style, Unit> function1) {
        ArrayList<Float> arrayList;
        GodaV2StyleCorner godaV2StyleCorner;
        this.LJIIJ = true;
        this.LJIIJJI = false;
        if (function1 != null) {
            try {
                function1.invoke(godaV2Style);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                this.LJIIJ = false;
                if (this.LJIIJJI) {
                    this.LIZ.invalidate();
                    this.LJIIJJI = false;
                }
                throw th;
            }
        }
        GodaV2StyleColor godaV2StyleColor = null;
        if (godaV2Style == null) {
            arrayList = null;
        } else {
            arrayList = godaV2Style.padding;
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
        this.LJIIJ = false;
        if (this.LJIIJJI) {
            this.LIZ.invalidate();
            this.LJIIJJI = false;
        }
    }

    public static void LJFF(int i, int i2, View view) {
        if (view.getBackground() != null && i > 0 && i2 > 0) {
            Drawable background = view.getBackground();
            if (background.getBounds().width() != i || background.getBounds().height() != i2) {
                background.setBounds(0, 0, i, i2);
            }
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
            for (float f : this.LIZIZ) {
                if (f > 0.0f) {
                    canvas.save();
                    canvas.clipPath(this.LIZJ);
                    function1.invoke(canvas);
                    canvas.restore();
                    return;
                }
            }
            function1.invoke(canvas);
        }
    }
}

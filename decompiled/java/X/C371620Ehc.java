package X;

import Y.AComparatorS24S0000000_5;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0Ehc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C371620Ehc {
    public static final int LIZ(String str) {
        if (u.LJJIIJZLJL(str, "#", false)) {
            int length = str.length();
            if (length != 7) {
                if (length == 9) {
                    return ColorProtector.parseColor(str);
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Invalid color hex: ");
                sbLIZ.append(str);
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            return ColorProtector.parseColor(str) | (-16777216);
        }
        return ColorProtector.parseColor(str);
    }

    public static final Drawable LIZIZ(String str) {
        final float fFloatValue;
        float fFloatValue2;
        List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{";"}, 0, 6);
        if (listLJJLIIIJILLIZJL.size() >= 3) {
            String lowerCase = ((String) ListProtector.get(listLJJLIIIJILLIZJL, 0)).toLowerCase(Locale.ROOT);
            Float fLJIIIIZZ = C2327809Ae.LJIIIIZZ((String) ListProtector.get(listLJJLIIIJILLIZJL, 1));
            if (fLJIIIIZZ != null) {
                fFloatValue = fLJIIIIZZ.floatValue();
            } else {
                fFloatValue = 0.0f;
            }
            List listLJJLIIIJILLIZJL2 = a0.LJJLIIIJILLIZJL((String) ListProtector.get(listLJJLIIIJILLIZJL, 2), new String[]{"|"}, 0, 6);
            ArrayList arrayList = new ArrayList();
            Iterator it2 = listLJJLIIIJILLIZJL2.iterator();
            while (it2.hasNext()) {
                List listLJJLIIIJILLIZJL3 = a0.LJJLIIIJILLIZJL((String) it2.next(), new String[]{e3.g}, 0, 6);
                if (listLJJLIIIJILLIZJL3.size() == 2) {
                    int iLIZ = LIZ((String) ListProtector.get(listLJJLIIIJILLIZJL3, 0));
                    Float fLJIIIIZZ2 = C2327809Ae.LJIIIIZZ(a0.LJJJLL("%", (String) ListProtector.get(listLJJLIIIJILLIZJL3, 1)));
                    if (fLJIIIIZZ2 != null) {
                        fFloatValue2 = fLJIIIIZZ2.floatValue() / 100;
                    } else {
                        fFloatValue2 = 0.0f;
                    }
                    arrayList.add(new Pair(Float.valueOf(fFloatValue2), Integer.valueOf(iLIZ)));
                }
            }
            List listLJLLLL = C13LP.LJLLLL(new AComparatorS24S0000000_5(66), arrayList);
            if (listLJLLLL.size() >= 2) {
                ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(listLJLLLL, 10));
                Iterator it3 = listLJLLLL.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(Integer.valueOf(((Number) ((Pair) it3.next()).getSecond()).intValue()));
                }
                final int[] iArrLLII = C13LP.LLII(arrayList2);
                ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(listLJLLLL, 10));
                Iterator it4 = listLJLLLL.iterator();
                while (it4.hasNext()) {
                    arrayList3.add(Float.valueOf(((Number) ((Pair) it4.next()).getFirst()).floatValue()));
                }
                final float[] fArrLLI = C13LP.LLI(arrayList3);
                if (Intrinsics.LJFF(lowerCase, "linear")) {
                    return new Drawable(fFloatValue, iArrLLII, fArrLLI) { // from class: X.0Eah
                        public final float LIZ;
                        public final int[] LIZIZ;
                        public final float[] LIZJ;
                        public final Paint LIZLLL;

                        @Override // android.graphics.drawable.Drawable
                        public final int getOpacity() {
                            return -3;
                        }

                        @Override // android.graphics.drawable.Drawable
                        public final void draw(Canvas canvas) {
                            canvas.drawRect(getBounds(), this.LIZLLL);
                        }

                        @Override // android.graphics.drawable.Drawable
                        public final void onBoundsChange(Rect rect) {
                            double radians = Math.toRadians(this.LIZ);
                            float fCos = (float) Math.cos(radians);
                            float fSin = (float) Math.sin(radians);
                            float f = 2;
                            Pair pair = new Pair(Float.valueOf(rect.centerX() - ((rect.width() * fCos) / f)), Float.valueOf(rect.centerY() - ((rect.height() * fSin) / f)));
                            float fFloatValue3 = ((Number) pair.getFirst()).floatValue();
                            float fFloatValue4 = ((Number) pair.getSecond()).floatValue();
                            Pair pair2 = new Pair(Float.valueOf(rect.centerX() + ((fCos * rect.width()) / f)), Float.valueOf(rect.centerY() + ((fSin * rect.height()) / f)));
                            this.LIZLLL.setShader(new LinearGradient(fFloatValue3, fFloatValue4, ((Number) pair2.getFirst()).floatValue(), ((Number) pair2.getSecond()).floatValue(), this.LIZIZ, this.LIZJ, Shader.TileMode.CLAMP));
                        }

                        @Override // android.graphics.drawable.Drawable
                        public final void setAlpha(int i) {
                            this.LIZLLL.setAlpha(i);
                        }

                        @Override // android.graphics.drawable.Drawable
                        public final void setColorFilter(ColorFilter colorFilter) {
                            this.LIZLLL.setColorFilter(colorFilter);
                        }

                        {
                            this.LIZ = fFloatValue;
                            this.LIZIZ = iArrLLII;
                            this.LIZJ = fArrLLI;
                            Paint paint = new Paint(1);
                            paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, 0.0f, iArrLLII, fArrLLI, Shader.TileMode.CLAMP));
                            this.LIZLLL = paint;
                        }
                    };
                }
                if (Intrinsics.LJFF(lowerCase, "radial")) {
                    return new Drawable(fArrLLI, iArrLLII) { // from class: X.0Ehd
                        public final int[] LIZ;
                        public final float[] LIZIZ;
                        public final Paint LIZJ = new Paint(1);

                        @Override // android.graphics.drawable.Drawable
                        public final int getOpacity() {
                            return -3;
                        }

                        @Override // android.graphics.drawable.Drawable
                        public final void draw(Canvas canvas) {
                            canvas.drawRect(getBounds(), this.LIZJ);
                        }

                        @Override // android.graphics.drawable.Drawable
                        public final void onBoundsChange(Rect rect) {
                            this.LIZJ.setShader(new RadialGradient(rect.centerX(), rect.centerY(), Math.min(rect.width(), rect.height()) / 2.0f, this.LIZ, this.LIZIZ, Shader.TileMode.CLAMP));
                        }

                        @Override // android.graphics.drawable.Drawable
                        public final void setAlpha(int i) {
                            this.LIZJ.setAlpha(i);
                        }

                        @Override // android.graphics.drawable.Drawable
                        public final void setColorFilter(ColorFilter colorFilter) {
                            this.LIZJ.setColorFilter(colorFilter);
                        }

                        {
                            this.LIZ = iArrLLII;
                            this.LIZIZ = fArrLLI;
                        }
                    };
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Unsupported gradient type: ");
                sbLIZ.append(lowerCase);
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            "At least 2 color stops required".toString();
            throw new IllegalArgumentException("At least 2 color stops required");
        }
        "Invalid gradient format".toString();
        throw new IllegalArgumentException("Invalid gradient format");
    }

    public static final Drawable LIZJ(String str) {
        Object c098200Yq;
        try {
            if (a0.LJJIIZI(str, ";", false)) {
                c098200Yq = LIZIZ(str);
            } else if (a0.LJJIIZI(str, "|", false)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("linear;0;");
                sbLIZ.append(str);
                c098200Yq = LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
            } else {
                c098200Yq = new ColorDrawable(LIZ(str));
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        return (Drawable) c098200Yq;
    }
}

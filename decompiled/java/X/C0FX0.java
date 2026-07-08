package X;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.text.Layout;
import android.view.View;
import android.view.ViewTreeObserver;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Pair;
import kotlin.ranges.IntRange;

/* JADX INFO: renamed from: X.0FX0, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public class C0FX0 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int $t;
    public Object l0;

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.$t) {
            case 0:
                onGlobalLayout$0(this);
                break;
            case 1:
                onGlobalLayout$1(this);
                break;
            case 2:
                onGlobalLayout$2(this);
                break;
            case 3:
                onGlobalLayout$3(this);
                break;
        }
    }

    public static final void onGlobalLayout$0(C0FX0 c0fx0) {
        int lineCount;
        C786410Ut5.C3(((TuxTextView) c0fx0.l0).getViewTreeObserver(), c0fx0);
        Layout layout = ((TuxTextView) c0fx0.l0).getLayout();
        if (layout == null || (lineCount = layout.getLineCount() - 1) < 0) {
            return;
        }
        Iterator<Integer> it2 = new IntRange(0, lineCount).iterator();
        if (it2.hasNext()) {
            AbstractC2098408Jy abstractC2098408Jy = (AbstractC2098408Jy) it2;
            float lineLeft = layout.getLineLeft(abstractC2098408Jy.nextInt());
            while (it2.hasNext()) {
                lineLeft = Math.min(lineLeft, layout.getLineLeft(abstractC2098408Jy.nextInt()));
            }
            Iterator<Integer> it3 = new IntRange(0, lineCount).iterator();
            if (it3.hasNext()) {
                AbstractC2098408Jy abstractC2098408Jy2 = (AbstractC2098408Jy) it3;
                float lineRight = layout.getLineRight(abstractC2098408Jy2.nextInt());
                while (it3.hasNext()) {
                    lineRight = Math.max(lineRight, layout.getLineRight(abstractC2098408Jy2.nextInt()));
                }
                ((TuxTextView) c0fx0.l0).getPaint().setShader(new LinearGradient(lineLeft, 0.0f, lineRight, 0.0f, new int[]{ColorProtector.parseColor("#CF6DFF"), ColorProtector.parseColor("#FF8157"), ColorProtector.parseColor("#FFB536")}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
                ((TuxTextView) c0fx0.l0).invalidate();
                return;
            }
            throw new NoSuchElementException();
        }
        throw new NoSuchElementException();
    }

    public static final void onGlobalLayout$1(C0FX0 c0fx0) {
        Pair pair;
        int iLIZIZ;
        C383120F0k c383120F0k = (C383120F0k) c0fx0.l0;
        int itemCount = c383120F0k.LIZJ.getItemCount();
        int height = ((View) ((C383120F0k) c0fx0.l0).LIZIZ.getValue()).getHeight();
        int iLJIIIIZZ = C14KQ.LJIIIIZZ(c383120F0k.LIZ.getContext());
        C369780Eee.LIZ.getClass();
        if (!C369780Eee.LIZIZ()) {
            if (itemCount == 1 ? (iLIZIZ = ((iLJIIIIZZ - (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28)) * 2)) * 4) / 3) <= height : itemCount == 2 && (iLIZIZ = ((((iLJIIIIZZ - (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28)) * 2)) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))) / 2) * 4) / 3) <= height) {
                height = iLIZIZ;
            }
            pair = new Pair(Integer.valueOf((int) ((height * 3.0f) / 4.0f)), Integer.valueOf(height));
        } else {
            int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(88));
            int iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(66));
            if (itemCount == 1) {
                int iLIZIZ4 = iLJIIIIZZ - (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28)) * 2);
                String str = (String) C13LP.LJJJLL(c383120F0k.LIZLLL);
                if (str == null) {
                    str = "";
                }
                float fLIZ = c383120F0k.LIZ(str);
                int i = (int) (iLIZIZ4 / fLIZ);
                if (i > height) {
                    int i2 = (int) (height * fLIZ);
                    if (i2 >= iLIZIZ2) {
                        iLIZIZ2 = i2;
                    }
                    pair = new Pair(Integer.valueOf(iLIZIZ2), Integer.valueOf(height));
                } else {
                    if (i >= iLIZIZ3) {
                        iLIZIZ3 = i;
                    }
                    int i3 = (int) (iLIZIZ3 * fLIZ);
                    if (i3 <= iLIZIZ4) {
                        iLIZIZ4 = i3;
                    }
                    pair = new Pair(Integer.valueOf(iLIZIZ4), Integer.valueOf(iLIZIZ3));
                }
            } else {
                int iLIZIZ5 = ((((iLJIIIIZZ - (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28)) * 2)) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))) / 2) * 4) / 3;
                if (iLIZIZ5 <= height) {
                    height = iLIZIZ5;
                }
                pair = new Pair(Integer.valueOf((int) ((height * 3.0f) / 4.0f)), Integer.valueOf(height));
            }
        }
        int iIntValue = ((Number) pair.getFirst()).intValue();
        int iIntValue2 = ((Number) pair.getSecond()).intValue();
        if (iIntValue2 > 0) {
            C383120F0k c383120F0k2 = (C383120F0k) c0fx0.l0;
            if (iIntValue2 != c383120F0k2.LJI || iIntValue != c383120F0k2.LJFF) {
                c383120F0k2.LJI = iIntValue2;
                c383120F0k2.LJFF = iIntValue;
                C383610F2h c383610F2h = c383120F0k2.LIZJ;
                c383610F2h.LLILZ = iIntValue;
                c383610F2h.LLILZIL = iIntValue2;
                c383610F2h.notifyDataSetChanged();
            }
        }
    }

    public static final void onGlobalLayout$2(C0FX0 c0fx0) {
        C383080F0g c383080F0g = (C383080F0g) c0fx0.l0;
        int height = c383080F0g.LIZIZ.getHeight() - (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44)) - ((int) ((View) c383080F0g.LJI.getValue()).getTranslationY()));
        if (height > 0 && height != c383080F0g.LJIIIIZZ) {
            c383080F0g.LJIIIIZZ = height;
            ((View) c383080F0g.LJFF.getValue()).getLayoutParams().height = height;
            c383080F0g.LIZIZ();
            ((View) c383080F0g.LJFF.getValue()).requestLayout();
        }
    }

    public static final void onGlobalLayout$3(C0FX0 c0fx0) {
        if (((C388070FJl) c0fx0.l0).LLIZLLLIL.getWidth() > 0 && ((C388070FJl) c0fx0.l0).LLIZLLLIL.getHeight() > 0) {
            C786410Ut5.C3(((C388070FJl) c0fx0.l0).LLIZLLLIL.getViewTreeObserver(), c0fx0);
            C450720Hlu c450720Hlu = new C450720Hlu(((C388070FJl) c0fx0.l0).itemView.getContext());
            TuxIconView tuxIconView = ((C388070FJl) c0fx0.l0).LLIZLLLIL;
            C1391600mJi c1391600mJi = c450720Hlu.LLILLJJLI;
            c1391600mJi.LIZIZ = tuxIconView;
            c1391600mJi.LIZLLL = EnumC1235690iGF.BOTTOM;
            c1391600mJi.LJII = 3000L;
            c1391600mJi.LJIJJ = false;
            c450720Hlu.LJIIJ(2131850133);
            c450720Hlu.LIZIZ().show();
        }
    }

    public C0FX0(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}

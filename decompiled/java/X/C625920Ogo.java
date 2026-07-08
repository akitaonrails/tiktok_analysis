package X;

import Y.AComparatorS28S0000000_9;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.PaintDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Ogo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C625920Ogo {
    public static final void LIZ(View view, Function1<? super C625930Ogp, Unit> function1) {
        final C625930Ogp c625930Ogp = new C625930Ogp();
        function1.invoke(c625930Ogp);
        if (((ArrayList) c625930Ogp.LIZ).size() >= 2) {
            List listLJLLLL = C13LP.LJLLLL(new AComparatorS28S0000000_9(18), c625930Ogp.LIZ);
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJLLLL, 10));
            Iterator it2 = listLJLLLL.iterator();
            while (it2.hasNext()) {
                arrayList.add(Integer.valueOf(((C0NCD) it2.next()).LIZIZ));
            }
            final int[] iArrLLII = C13LP.LLII(arrayList);
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(listLJLLLL, 10));
            Iterator it3 = listLJLLLL.iterator();
            while (it3.hasNext()) {
                arrayList2.add(Float.valueOf(((C0NCD) it3.next()).LIZ));
            }
            final float[] fArrLLI = C13LP.LLI(arrayList2);
            PaintDrawable paintDrawable = new PaintDrawable();
            paintDrawable.setShape(new RectShape());
            paintDrawable.setShaderFactory(new ShapeDrawable.ShaderFactory() { // from class: X.14SK
                @Override // android.graphics.drawable.ShapeDrawable.ShaderFactory
                public final Shader resize(int i, int i2) {
                    float[] fArr;
                    int i3 = C14SJ.LIZ[c625930Ogp.LIZIZ.ordinal()];
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 != 3) {
                                if (i3 == 4) {
                                    fArr = new float[]{0.0f, i2, 0.0f, 0.0f};
                                } else {
                                    throw new C1954807lC();
                                }
                            } else {
                                fArr = new float[]{0.0f, 0.0f, 0.0f, i2};
                            }
                        } else {
                            fArr = new float[]{i, 0.0f, 0.0f, 0.0f};
                        }
                    } else {
                        fArr = new float[]{0.0f, 0.0f, i, 0.0f};
                    }
                    return new LinearGradient(fArr[0], fArr[1], fArr[2], fArr[3], iArrLLII, fArrLLI, Shader.TileMode.CLAMP);
                }
            });
            view.setBackground(paintDrawable);
            return;
        }
        "Failed requirement.".toString();
        throw new IllegalArgumentException("Failed requirement.");
    }
}

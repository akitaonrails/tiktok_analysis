package X;

import android.content.Context;
import com.ss.android.ugc.aweme.story.setting.ui.color.ColorConfig;
import com.ss.android.ugc.aweme.story.setting.ui.color.ShaderParam;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0RKx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C694210RKx {
    public static final C694200RKw LIZ(ColorConfig colorConfig, Context context) {
        List<Integer> list;
        float[] fArrLLI;
        List<Float> list2;
        ShaderParam shaderParam = colorConfig.shaderParam;
        if (shaderParam != null) {
            list = shaderParam.colorList;
        } else {
            list = null;
        }
        if (colorConfig.isShader) {
            if (list != null && !list.isEmpty()) {
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                Iterator<Integer> it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(Integer.valueOf(LIZIZ(context, Integer.valueOf(it2.next().intValue()))));
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : arrayList) {
                    if (((Number) obj).intValue() != 0) {
                        arrayList2.add(obj);
                    }
                }
                int[] iArrLLII = C13LP.LLII(arrayList2);
                ShaderParam shaderParam2 = colorConfig.shaderParam;
                if (shaderParam2 != null && (list2 = shaderParam2.positionList) != null && !list2.isEmpty()) {
                    fArrLLI = C13LP.LLI(list2);
                } else {
                    int length = iArrLLII.length;
                    fArrLLI = new float[length];
                    float f = 1 / (length - 1.0f);
                    for (int i = 0; i < length; i++) {
                        fArrLLI[i] = i * f;
                    }
                }
                return new C694200RKw(fArrLLI, iArrLLII);
            }
        }
        return null;
    }

    public static final int LIZIZ(Context context, Integer num) {
        Integer numLIZJ;
        if (num == null || (numLIZJ = C1308910kAL.LIZJ(num.intValue(), context)) == null) {
            return 0;
        }
        return numLIZJ.intValue();
    }
}

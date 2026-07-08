package X;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.mixmall.parse.dto.style.ECMixMallGradientColor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0Gja, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C423800Gja {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.util.List<java.lang.Float>] */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.util.ArrayList] */
    public static LinearGradient LIZ(ECMixMallGradientColor eCMixMallGradientColor, View view) {
        ?? arrayList;
        List<String> list = eCMixMallGradientColor.colors;
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<String> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Integer.valueOf(C1774710wHd.LIZ(it2.next())));
        }
        double radians = Math.toRadians(((double) eCMixMallGradientColor.angle) - 180.0d);
        List<Float> list2 = eCMixMallGradientColor.absolutePositions;
        if (list2 != null && !list2.isEmpty()) {
            List<Float> list3 = eCMixMallGradientColor.absolutePositions;
            arrayList = new ArrayList(C15438062q.LJIJJ(list3, 10));
            Iterator<Float> it3 = list3.iterator();
            while (it3.hasNext()) {
                arrayList.add(Float.valueOf(C13LZ.LIZLLL(C0H9H.LIZ(it3.next().floatValue()) / view.getHeight(), 0.0f, 1.0f)));
            }
        } else {
            arrayList = eCMixMallGradientColor.positions;
        }
        if (arrayList.size() != arrayList2.size()) {
            return null;
        }
        int width = view.getWidth() / 2;
        int height = view.getHeight() / 2;
        double dSin = Math.sin(radians);
        double dCos = Math.cos(radians);
        double d = width;
        double d2 = 1;
        double d3 = height;
        return new LinearGradient((float) ((d2 + dSin) * d), (float) (d3 * (d2 - dCos)), (float) (d * (d2 - dSin)), (float) (d3 * (d2 + dCos)), C13LP.LLII(arrayList2), C13LP.LLI(arrayList), Shader.TileMode.CLAMP);
    }
}

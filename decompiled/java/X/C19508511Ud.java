package X;

import android.animation.ArgbEvaluator;
import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.mixmall.parse.dto.style.ECMixMallBgColorDTO;
import com.ss.android.ugc.aweme.ecommerce.mixmall.parse.dto.style.ECMixMallGradientColor;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.11Ud, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19508511Ud {
    public final ArgbEvaluator LIZ = new ArgbEvaluator();

    public static C1868920yja LIZJ(ECMixMallBgColorDTO eCMixMallBgColorDTO, View view) {
        String str;
        Integer numValueOf;
        ECMixMallGradientColor eCMixMallGradientColor;
        if (C960203pA.LIZIZ(view.getContext())) {
            str = eCMixMallBgColorDTO.colorDark;
        } else {
            str = eCMixMallBgColorDTO.color;
        }
        if (str != null) {
            numValueOf = Integer.valueOf(C1774710wHd.LIZ(str));
        } else {
            numValueOf = null;
        }
        if (C960203pA.LIZIZ(view.getContext())) {
            eCMixMallGradientColor = eCMixMallBgColorDTO.gradientColorDark;
        } else {
            eCMixMallGradientColor = eCMixMallBgColorDTO.gradientColor;
        }
        return new C1868920yja(eCMixMallGradientColor, numValueOf);
    }

    public static boolean LIZ(View view, C1868920yja c1868920yja, C1868920yja c1868920yja2) {
        boolean z;
        boolean z2;
        Integer numValueOf;
        ECMixMallGradientColor eCMixMallGradientColor = c1868920yja.LIZIZ;
        if (eCMixMallGradientColor == null && c1868920yja2.LIZIZ == null) {
            return true;
        }
        if (eCMixMallGradientColor == null || c1868920yja2.LIZIZ == null || view.getWidth() == 0 || view.getHeight() == 0) {
            return false;
        }
        ECMixMallGradientColor eCMixMallGradientColor2 = c1868920yja.LIZIZ;
        ECMixMallGradientColor eCMixMallGradientColor3 = c1868920yja2.LIZIZ;
        if (eCMixMallGradientColor2.colors.size() == eCMixMallGradientColor3.colors.size() && eCMixMallGradientColor2.positions.size() == eCMixMallGradientColor3.positions.size()) {
            List<Float> list = eCMixMallGradientColor2.absolutePositions;
            List<Float> list2 = eCMixMallGradientColor3.absolutePositions;
            if (list != null && !list.isEmpty()) {
                z = false;
            } else {
                z = true;
            }
            boolean z3 = !z;
            if (list2 != null && !list2.isEmpty()) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z3 == (!z2)) {
                if (!z3) {
                    return true;
                }
                Integer numValueOf2 = null;
                if (list != null) {
                    numValueOf = Integer.valueOf(list.size());
                } else {
                    numValueOf = null;
                }
                if (list2 != null) {
                    numValueOf2 = Integer.valueOf(list2.size());
                }
                if (Intrinsics.LJFF(numValueOf, numValueOf2)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0177  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1868920yja LIZIZ(X.C1868920yja r16, X.C1868920yja r17, float r18) {
        /*
            Method dump skipped, instruction units count: 397
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19508511Ud.LIZIZ(X.0yja, X.0yja, float):X.0yja");
    }
}

package X;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.PaintDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.view.View;
import com.ss.android.ugc.aweme.ad.experiment.AdShadowMaskData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.feed.platform.cell.gradual.CellGradualComponent;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Go6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C426600Go6 {
    public static boolean LIZ = true;

    public static void LIZ(View view) {
        if (view == null) {
            return;
        }
        int[] iArr = CellGradualComponent.LLLFFI;
        if (Intrinsics.LJFF(view.getTag(R.id.x17), Boolean.TRUE)) {
            return;
        }
        view.setBackgroundDrawable(C420960Gf0.LIZ(0.18f));
    }

    public static void LIZIZ(View view, Aweme aweme) {
        if (view != null && aweme != null) {
            int[] iArr = CellGradualComponent.LLLFFI;
            if (Intrinsics.LJFF(view.getTag(R.id.x17), Boolean.TRUE)) {
                return;
            }
            if (aweme.isAd()) {
                LIZ = false;
                if (C1017070cZd.LJLIL(aweme)) {
                    PaintDrawable paintDrawable = new PaintDrawable();
                    paintDrawable.setShape(new RectShape());
                    paintDrawable.setShaderFactory(new ShapeDrawable.ShaderFactory() { // from class: X.0Go5
                        @Override // android.graphics.drawable.ShapeDrawable.ShaderFactory
                        public final Shader resize(int i, int i2) {
                            return new LinearGradient(0.0f, 0.0f, 0.0f, i2, 0, -436207616, Shader.TileMode.CLAMP);
                        }
                    });
                    view.setBackground(paintDrawable);
                }
                C426610Go7.LIZ.getClass();
                C01GW c01gw = C426610Go7.LIZJ;
                if (((AdShadowMaskData) c01gw.getValue()).enableModifyMaskAlpha) {
                    view.setBackgroundDrawable(C420960Gf0.LIZ(((AdShadowMaskData) c01gw.getValue()).normalBottomMaskAlpha));
                    return;
                }
                return;
            }
            if (!LIZ) {
                LIZ = true;
                LIZ(view);
            }
        }
    }
}

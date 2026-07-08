package X;

import android.content.Context;
import android.graphics.Paint;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.ss.android.ugc.aweme.editSticker.text.bean.InnerEffectTextShadowConfig;
import com.ss.android.ugc.aweme.editSticker.text.bean.InnerEffectTextStrokeConfig;
import com.ss.android.ugc.aweme.editSticker.text.bean.OuterEffectTextShadowConfig;
import com.ss.android.ugc.aweme.editSticker.text.bean.OuterEffectTextStrokeConfig;

/* JADX INFO: renamed from: X.12K9, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12K9 {
    public static final Paint.Style LIZJ(int i) {
        if (i == Paint.Style.FILL.ordinal()) {
            return Paint.Style.FILL;
        }
        if (i == Paint.Style.STROKE.ordinal()) {
            return Paint.Style.STROKE;
        }
        if (i == Paint.Style.FILL_AND_STROKE.ordinal()) {
            return Paint.Style.FILL_AND_STROKE;
        }
        return Paint.Style.FILL;
    }

    public static final InnerEffectTextShadowConfig LIZ(OuterEffectTextShadowConfig outerEffectTextShadowConfig, Context context) {
        return new InnerEffectTextShadowConfig(C11VU.LIZIZ(outerEffectTextShadowConfig.getRadius(), context), C11VU.LIZIZ(outerEffectTextShadowConfig.getOffsetX(), context), C11VU.LIZIZ(outerEffectTextShadowConfig.getOffsetY(), context), ColorProtector.parseColor(outerEffectTextShadowConfig.getColor()));
    }

    public static final InnerEffectTextStrokeConfig LIZIZ(OuterEffectTextStrokeConfig outerEffectTextStrokeConfig, Context context) {
        Paint.Join join;
        float fLIZIZ = C11VU.LIZIZ(outerEffectTextStrokeConfig.getStrokeWidth(), context);
        int color = ColorProtector.parseColor(outerEffectTextStrokeConfig.getStrokeColor());
        int strokeJoin = outerEffectTextStrokeConfig.getStrokeJoin();
        if (strokeJoin == Paint.Join.ROUND.ordinal()) {
            join = Paint.Join.ROUND;
        } else if (strokeJoin == Paint.Join.BEVEL.ordinal()) {
            join = Paint.Join.BEVEL;
        } else if (strokeJoin == Paint.Join.MITER.ordinal()) {
            join = Paint.Join.MITER;
        } else {
            join = Paint.Join.ROUND;
        }
        return new InnerEffectTextStrokeConfig(fLIZIZ, color, join);
    }
}

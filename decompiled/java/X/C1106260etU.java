package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import com.bytedance.android.livesdk.livesetting.other.ToolBarButtonWithTextExperiment;
import com.bytedance.android.livesdkapi.host.user.IHostPad;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0etU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1106260etU {
    public static final /* synthetic */ int LIZ = 0;

    public static Drawable LIZ(Context context) {
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.getPaint().setColor(C235100vV.LIZ(R.attr.exb, context));
        return shapeDrawable;
    }

    public static Drawable LIZIZ(Context context) {
        if (!C497740JfY.LJIL() && !((IHostPad) C1161920gLG.LIZJ(IHostPad.class)).isPad()) {
            return LIZ(context);
        }
        if (ToolBarButtonWithTextExperiment.hasText()) {
            return null;
        }
        return LIZ(context);
    }
}

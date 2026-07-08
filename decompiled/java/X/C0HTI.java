package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.renderscript.RSRuntimeException;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0HTI, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HTI {
    public int LIZ;

    public final Drawable LIZ(Context context) {
        boolean z;
        Integer numLIZ = C1308910kAL.LIZ(R.attr.g0d, context);
        if (numLIZ != null && numLIZ.intValue() == 0) {
            z = false;
        } else {
            z = true;
        }
        return LIZIZ(context, z);
    }

    public final Drawable LIZIZ(final Context context, final boolean z) {
        AbstractC415370GQl abstractC415370GQlLIZJ;
        Integer numValueOf = Integer.valueOf(this.LIZ);
        if (numValueOf != null && (abstractC415370GQlLIZJ = C413820GKm.LIZJ(numValueOf.intValue(), context)) != null) {
            return abstractC415370GQlLIZJ;
        }
        final int i = this.LIZ;
        return new BitmapDrawable(context, i, z) { // from class: X.0HVG
            /* JADX WARN: Illegal instructions before constructor call */
            {
                Resources resources = context.getResources();
                Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(context.getResources().openRawResource(i));
                if (!z) {
                    try {
                        bitmapDecodeStream = C1100090ejX.LIZ(context, bitmapDecodeStream);
                    } catch (RSRuntimeException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
                super(resources, bitmapDecodeStream);
            }
        };
    }
}

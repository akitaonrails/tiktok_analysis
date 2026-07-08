package X;

import Y.ARunnableS101S0100000_1;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.lighten.loader.SmartImageView;

/* JADX INFO: renamed from: X.04J2, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public class C04J2 extends AbstractC1335900krs {
    public final int $t;
    public Object l0;

    public static final void cm$0(C04J2 c04j2, Uri uri, View view, Throwable th) {
    }

    public static final void cm$1(C04J2 c04j2, Uri uri, View view, Throwable th) {
    }

    public static final void cm$2(C04J2 c04j2, Uri uri, View view, Throwable th) {
    }

    public static final void cm$3(C04J2 c04j2, Uri uri, View view, Throwable th) {
    }

    @Override // X.InterfaceC427850Gq7
    public final void Ad(Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
        switch (this.$t) {
            case 0:
                Ad$0(this, uri, view, c428600GrK, animatable);
                break;
            case 1:
                Ad$1(this, uri, view, c428600GrK, animatable);
                break;
            case 2:
                Ad$2(this, uri, view, c428600GrK, animatable);
                break;
            case 3:
                Ad$3(this, uri, view, c428600GrK, animatable);
                break;
            default:
                super.Ad(uri, view, c428600GrK, animatable);
                break;
        }
    }

    @Override // X.InterfaceC427850Gq7
    public final void cm(Uri uri, View view, Throwable th) {
        switch (this.$t) {
            case 0:
                cm$0(this, uri, view, th);
                break;
            case 1:
                cm$1(this, uri, view, th);
                break;
            case 2:
                cm$2(this, uri, view, th);
                break;
            case 3:
                cm$3(this, uri, view, th);
                break;
            default:
                super.cm(uri, view, th);
                break;
        }
    }

    public C04J2(SmartImageView smartImageView, int i) {
        this.$t = i;
        this.l0 = smartImageView;
    }

    public static final void Ad$0(C04J2 c04j2, Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
        SmartImageView smartImageView = (SmartImageView) c04j2.l0;
        HandlerHook.viewPost(smartImageView, new ARunnableS101S0100000_1((Object) smartImageView, 15));
    }

    public static final void Ad$1(C04J2 c04j2, Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
        int i;
        int iLIZIZ;
        Number numberValueOf;
        int i2 = 90;
        if (c428600GrK != null) {
            i2 = c428600GrK.LIZIZ;
        }
        if (c428600GrK != null) {
            i = c428600GrK.LIZ;
        } else {
            i = 64;
        }
        float f = i2 / i;
        double d = f;
        if (d > 1.7d) {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(50));
        } else if (d >= 1.4d) {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(54));
        } else if (d >= 1.2d) {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(58));
        } else {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(64));
        }
        float f2 = iLIZIZ * f;
        if (f2 > C814420VxA.LIZIZ(C418440Gaw.LIZIZ(90))) {
            numberValueOf = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(90)));
        } else {
            numberValueOf = Float.valueOf(f2);
        }
        ViewGroup.LayoutParams layoutParams = ((SmartImageView) c04j2.l0).getLayoutParams();
        layoutParams.width = iLIZIZ;
        layoutParams.height = numberValueOf.intValue();
        C786410Ut5.G6((SmartImageView) c04j2.l0, layoutParams);
    }

    public static final void Ad$2(C04J2 c04j2, Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
        if (c428600GrK == null) {
            return;
        }
        int i = c428600GrK.LIZ;
        int iLIZIZ = (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44)) * i) / c428600GrK.LIZIZ;
        ViewGroup.LayoutParams layoutParams = ((SmartImageView) c04j2.l0).getLayoutParams();
        layoutParams.width = iLIZIZ;
        C786410Ut5.G6((SmartImageView) c04j2.l0, layoutParams);
    }

    public static final void Ad$3(C04J2 c04j2, Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
        SmartImageView smartImageView = (SmartImageView) c04j2.l0;
        HandlerHook.viewPost(smartImageView, new ARunnableS101S0100000_1((Object) smartImageView, 70));
    }
}

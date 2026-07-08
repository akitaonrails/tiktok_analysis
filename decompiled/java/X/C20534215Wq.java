package X;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.util.Property;
import android.view.View;
import androidx.cardview.widget.CardView;
import java.util.Arrays;
import kotlin.jvm.internal.AFwS221S0000000_31;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.15Wq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20534215Wq {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(0));
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(1));
    public final C01GW LIZJ = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(2));
    public final C01GW LIZLLL = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(3));
    public final C01GW LJ = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(4));
    public final C01GW LJFF = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(5));

    public C20534215Wq(long j) {
    }

    public static ObjectAnimator LIZJ(CardView cardView, float... fArr) {
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(cardView, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_X, fArr[0], fArr[1]), PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, fArr[2], fArr[3]));
        objectAnimatorOfPropertyValuesHolder.setDuration(200L);
        objectAnimatorOfPropertyValuesHolder.setInterpolator(C20534415Ws.LIZJ);
        return objectAnimatorOfPropertyValuesHolder;
    }

    public static ObjectAnimator LIZIZ(Object obj, long j, float... fArr) {
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(obj, PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, Arrays.copyOf(fArr, fArr.length)), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, Arrays.copyOf(fArr, fArr.length)));
        objectAnimatorOfPropertyValuesHolder.setDuration(j);
        objectAnimatorOfPropertyValuesHolder.setInterpolator(C20534415Ws.LIZJ);
        return objectAnimatorOfPropertyValuesHolder;
    }

    public static ObjectAnimator LIZ(String str, Object obj, long j, float... fArr) {
        if (Intrinsics.LJFF(str, "alpha")) {
            ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(obj, PropertyValuesHolder.ofFloat((Property<?, Float>) View.ALPHA, Arrays.copyOf(fArr, fArr.length)));
            objectAnimatorOfPropertyValuesHolder.setDuration(j);
            objectAnimatorOfPropertyValuesHolder.setInterpolator(C20534415Ws.LIZJ);
            return objectAnimatorOfPropertyValuesHolder;
        }
        if (Intrinsics.LJFF(str, "rotation")) {
            ObjectAnimator objectAnimatorOfPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(obj, PropertyValuesHolder.ofFloat((Property<?, Float>) View.ROTATION, Arrays.copyOf(fArr, fArr.length)));
            objectAnimatorOfPropertyValuesHolder2.setDuration(j);
            objectAnimatorOfPropertyValuesHolder2.setInterpolator(C20534415Ws.LIZJ);
            return objectAnimatorOfPropertyValuesHolder2;
        }
        return null;
    }
}

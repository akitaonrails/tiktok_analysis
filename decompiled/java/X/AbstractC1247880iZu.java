package X;

import android.view.View;
import com.ss.android.ugc.profile.platform.base.data.ProfileUIData;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0iZu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public abstract class AbstractC1247880iZu {
    public final C1248700ibE LIZ;

    public abstract View LIZ();

    public abstract View LIZIZ();

    public AbstractC1247880iZu(C1248700ibE c1248700ibE) {
        this.LIZ = c1248700ibE;
    }

    public final View LIZJ(EnumC1248260iaW enumC1248260iaW, Function2<? super Integer, ? super View, ? extends View> function2) {
        Integer numValueOf;
        ProfileUIData profileUIData;
        C1248700ibE c1248700ibE = this.LIZ;
        if (c1248700ibE == null || (profileUIData = c1248700ibE.LIZJ) == null || (numValueOf = profileUIData.type) == null) {
            if (enumC1248260iaW != null) {
                numValueOf = Integer.valueOf(enumC1248260iaW.getType());
            } else {
                numValueOf = null;
            }
        }
        return function2.invoke(numValueOf, LIZIZ());
    }
}

package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.activitystack.IActivityStackDependencyService;
import kotlin.jvm.internal.AFwS185S0000000_1;

/* JADX INFO: renamed from: X.036A, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C036A {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS185S0000000_1.get$arr$(155));

    public static Activity LIZ() {
        return ((IActivityStackDependencyService) LIZ.getValue()).getTopActivity();
    }

    public static boolean LIZIZ() {
        return ((IActivityStackDependencyService) LIZ.getValue()).isAppBackGround();
    }
}

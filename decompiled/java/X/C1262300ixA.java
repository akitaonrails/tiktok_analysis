package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS204S0000000_16;

/* JADX INFO: renamed from: X.0ixA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1262300ixA implements Serializable {
    public final C1262590ixd apiConfig;
    public final Bundle arguments;
    public final C19EG hostActivity;
    public final Fragment hostFragment;
    public final C1262320ixC listConfig;
    public final Function0<Unit> onFail;
    public final C1261270ivV trackerConfig;
    public final C1262090iwp uiConfig;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public C1262300ixA() {
        String str = null;
        this(null, null, new C1262090iwp(0), new C1262320ixC(0), new C1261270ivV(str, str, str, str, false, str, str, str, 0 == true ? 1 : 0, 33554431), new C1262590ixd(null, 2097151), null, AFwS204S0000000_16.get$arr$(430));
    }

    public final C1262300ixA copy(C19EG c19eg, Fragment fragment, C1262090iwp c1262090iwp, C1262320ixC c1262320ixC, C1261270ivV c1261270ivV, C1262590ixd c1262590ixd, Bundle bundle, Function0<Unit> function0) {
        return new C1262300ixA(c19eg, fragment, c1262090iwp, c1262320ixC, c1261270ivV, c1262590ixd, bundle, function0);
    }

    public int hashCode() {
        C19EG c19eg = this.hostActivity;
        int iHashCode = (c19eg == null ? 0 : c19eg.hashCode()) * 31;
        Fragment fragment = this.hostFragment;
        int iHashCode2 = (((((((((iHashCode + (fragment == null ? 0 : fragment.hashCode())) * 31) + this.uiConfig.hashCode()) * 31) + this.listConfig.hashCode()) * 31) + this.trackerConfig.hashCode()) * 31) + this.apiConfig.hashCode()) * 31;
        Bundle bundle = this.arguments;
        return ((iHashCode2 + (bundle != null ? bundle.hashCode() : 0)) * 31) + this.onFail.hashCode();
    }

    public C1262300ixA(C19EG c19eg, Fragment fragment, C1262090iwp c1262090iwp, C1262320ixC c1262320ixC, C1261270ivV c1261270ivV, C1262590ixd c1262590ixd, Bundle bundle, Function0<Unit> function0) {
        this.hostActivity = c19eg;
        this.hostFragment = fragment;
        this.uiConfig = c1262090iwp;
        this.listConfig = c1262320ixC;
        this.trackerConfig = c1261270ivV;
        this.apiConfig = c1262590ixd;
        this.arguments = bundle;
        this.onFail = function0;
    }
}

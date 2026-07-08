package X;

import com.ss.android.ugc.aweme.internalshare.api.experiment.FuzzySearchControl;
import kotlin.jvm.internal.AFwS209S0000000_21;

/* JADX INFO: renamed from: X.0lir, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1368750lir {
    public static final FuzzySearchControl LIZ = new FuzzySearchControl(false, true, false, "", 250);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(601));

    public static FuzzySearchControl LIZ() {
        return (FuzzySearchControl) LIZIZ.getValue();
    }

    public static boolean LIZIZ() {
        return LIZ().optEnable && LIZ().aliasOptEnable;
    }

    public static boolean LIZJ() {
        return LIZ().optEnable;
    }
}

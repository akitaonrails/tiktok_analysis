package X;

import com.ss.android.ugc.nearby.settings.NearbyLocationChangeCardExpData;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hSV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1204850hSV {
    public static final NearbyLocationChangeCardExpData LIZ = new NearbyLocationChangeCardExpData(null, null);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(649));

    public static boolean LIZ() {
        C01GW c01gw = LIZIZ;
        return Intrinsics.LJFF(((NearbyLocationChangeCardExpData) c01gw.getValue()).canInsertCard, Boolean.TRUE) && ((NearbyLocationChangeCardExpData) c01gw.getValue()).cardIndex != null;
    }
}

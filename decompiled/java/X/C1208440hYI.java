package X;

import com.google.gson.n;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT;
import java.util.Iterator;
import java.util.Locale;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AFwS223S0000000_32;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hYI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1208440hYI {
    public static final C1208440hYI LIZ = new C1208440hYI();
    public static final C01GW LIZJ = C452501pT.LIZIZ(new C1237430iJ3());
    public static final C01GW LIZLLL = C452501pT.LIZIZ(new C1237440iJ4());
    public static final C01GW LJ = C452501pT.LIZIZ(new C12QC());
    public static final C01GW LJFF = C452501pT.LIZIZ(new C12QO());
    public static final C01GW LJI = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(794));
    public static final C01GW LJII = C452501pT.LIZIZ(AFwS223S0000000_32.get$arr$(283));
    public static final C01GW LJIIIIZZ = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(802));
    public static final C1208130hXn LIZIZ = LIZJ(C1798170wtT.LIZ(null), null);

    public static int LIZ() {
        Boolean boolValueOf = null;
        ILocationBaseServiceForMT iLocationBaseServiceForMT = (ILocationBaseServiceForMT) PluggableExtentionKt.pluggableSpi$default(ILocationBaseServiceForMT.class, false, false, false, 14, null);
        Boolean boolValueOf2 = null;
        if (iLocationBaseServiceForMT != null) {
            boolValueOf = Boolean.valueOf(iLocationBaseServiceForMT.LJJIJ());
            boolValueOf2 = Boolean.valueOf(iLocationBaseServiceForMT.LJIIJ());
        }
        if (Intrinsics.LJFF(boolValueOf, Boolean.TRUE)) {
            return 1;
        }
        return !Intrinsics.LJFF(boolValueOf2, Boolean.FALSE) ? 0 : 2;
    }

    public static C1208130hXn LIZJ(n nVar, Function0 function0) {
        String upperCase = C0X2A.LIZJ.toUpperCase(Locale.ROOT);
        Iterator<T> it2 = C1800120wwc.LIZ().blockedRegions.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (Intrinsics.LJFF(((String) next).toUpperCase(Locale.ROOT), upperCase)) {
                if (next != null) {
                    return LIZIZ(new n(), (C12QA) LJ.getValue(), (C12QE) LJFF.getValue(), (C1207920hXS) LJI.getValue(), function0);
                }
            }
        }
        return LIZIZ(nVar, (C12QA) LJ.getValue(), (C12QE) LJFF.getValue(), (C1207920hXS) LJI.getValue(), function0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0264, code lost:
    
        r7 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:139:0x04a0  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x04bf  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x04c4  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0513  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x051c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x035f  */
    /* JADX WARN: Type inference failed for: r34v0, types: [X.0wwl] */
    /* JADX WARN: Type inference failed for: r7v0, types: [X.0hXx, X.0iGA] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C1208130hXn LIZIZ(com.google.gson.n r44, X.C12QA r45, X.C12QE r46, X.C1207920hXS r47, kotlin.jvm.functions.Function0 r48) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 1376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1208440hYI.LIZIZ(com.google.gson.n, X.12QA, X.12QE, X.0hXS, kotlin.jvm.functions.Function0):X.0hXn");
    }
}

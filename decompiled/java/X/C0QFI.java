package X;

import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.s;
import com.ss.android.ugc.aweme.search.entry.searchbox.repo.SearchBoxTimeData;
import kotlin.jvm.internal.AFwS196S0000000_10;

/* JADX INFO: renamed from: X.0QFI, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QFI {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(422));
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(421));

    public static SearchBoxTimeData LIZ() {
        String string = ((Keva) LIZ.getValue()).getString("showed_time", "");
        if (string.length() == 0) {
            return new SearchBoxTimeData(null, 0L, 3, null);
        }
        try {
            return (SearchBoxTimeData) GsonProtectorUtils.fromJson((Gson) LIZIZ.getValue(), string, SearchBoxTimeData.class);
        } catch (s e) {
            TryCatchGuardChecker.doCheck(e);
            return new SearchBoxTimeData(null, 0L, 3, null);
        }
    }
}

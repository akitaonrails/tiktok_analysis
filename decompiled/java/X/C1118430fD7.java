package X;

import com.bytedance.android.livesdk.livesetting.gift.LiveGiftRankingExclusiveTabSetting;
import java.util.Set;
import kotlin.jvm.internal.AFwS205S0000000_17;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fD7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1118430fD7 {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS205S0000000_17.get$arr$(191));
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS205S0000000_17.get$arr$(190));

    public static boolean LIZ() {
        if (!LiveGiftRankingExclusiveTabSetting.isEnabled() || !Intrinsics.LJFF(C1130100fVw.LIZ.LIZJ, "fans_team_rank")) {
            return false;
        }
        Set set = (Set) ((C20337914i1) LIZ.getValue()).LIZIZ();
        return ((long) set.size()) < ((Number) LIZIZ.getValue()).longValue() && !set.contains(Long.valueOf(C1121650fIJ.LIZ()));
    }
}

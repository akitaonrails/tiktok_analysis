package X;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.feed.platform.cell.interact.hotspot.FeedUnifiedComponentSpacingConfig;
import java.util.Set;

/* JADX INFO: renamed from: X.0RR7, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RR7 {
    public static final C01GW LIZ = C452501pT.LIZIZ(new C0RR8());
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C0RR6());

    public static boolean LIZ() {
        return LIZ.getValue() != null;
    }

    public static final boolean LIZIZ(Context context, Aweme aweme, String str) {
        Set<String> set;
        String genreType;
        FeedUnifiedComponentSpacingConfig feedUnifiedComponentSpacingConfig = (FeedUnifiedComponentSpacingConfig) LIZ.getValue();
        if (feedUnifiedComponentSpacingConfig == null || aweme == null || C0SXF.LJIL(context) || (set = feedUnifiedComponentSpacingConfig.scenes) == null || !C13LP.LJJJJ(str, set)) {
            return false;
        }
        if (C2105908Mv.LIZ(AwemeExtKt.getGenreType(aweme))) {
            genreType = "video";
        } else {
            genreType = AwemeExtKt.getGenreType(aweme);
        }
        Set<String> set2 = feedUnifiedComponentSpacingConfig.genres;
        if (set2 == null || !set2.contains(genreType) || ((InterfaceC1616630sAf) LIZIZ.getValue()).LJIIJ().isPad() == 1) {
            return false;
        }
        return true;
    }
}

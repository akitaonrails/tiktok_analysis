package X;

import android.graphics.Paint;
import android.graphics.Typeface;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0P53, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0P53 {
    public static final Paint LIZ;
    public static final boolean LIZIZ;
    public static final boolean LIZJ;
    public static final boolean LIZLLL;
    public static final List<C0PG6> LJ;
    public static final List<Integer> LJFF;

    static {
        Paint paint = new Paint();
        paint.setTextSize(C418440Gaw.LIZIZ(16));
        paint.setTypeface(Typeface.DEFAULT);
        LIZ = paint;
        C0P5O.LIZ.getClass();
        boolean z = false;
        LIZIZ = C0P5O.LIZ().enableManualDiff == 1 && C0P5O.LIZ().includeAllCard == 1;
        LIZJ = C0P5O.LIZ().enableManualDiff == 1 && C0P5O.LIZ().addUserAndPhotoCard == 1;
        if (C0P5O.LIZ().enableManualDiff == 1 && C0P5O.LIZ().onlyVideoCard == 1) {
            z = true;
        }
        LIZLLL = z;
        LJ = new ArrayList();
        LJFF = new ArrayList();
    }

    public static C0PG6 LIZ(SearchMixFeed searchMixFeed) {
        int i = searchMixFeed.feedType;
        if (i != 1) {
            if (i != 4) {
                return C0PG6.OTHER;
            }
            return C0PG6.USER;
        }
        if (AwemeExtKt.isPhotoMode(searchMixFeed.getAweme())) {
            return C0PG6.PHOTO;
        }
        return C0PG6.VIDEO;
    }
}

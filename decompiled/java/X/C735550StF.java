package X;

import android.content.Context;
import android.content.res.Resources;
import com.ss.android.ugc.aweme.feed.assem.avatar.FeedAvatarDefaultAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0StF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C735550StF extends C09AY implements Function0<Integer> {
    public final /* synthetic */ FeedAvatarDefaultAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C735550StF(FeedAvatarDefaultAssem feedAvatarDefaultAssem) {
        super(0);
        this.LL = feedAvatarDefaultAssem;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        Resources resources;
        float dimension;
        int i;
        if (C302070Bsj.LIZJ()) {
            Float fLIZ = C343140Dcm.LIZ(R.dimen.oy);
            if (fLIZ != null) {
                dimension = fLIZ.floatValue();
                i = (int) dimension;
            }
            i = 0;
        } else {
            Context context = this.LL.getContext();
            if (context != null && (resources = context.getResources()) != null) {
                dimension = resources.getDimension(R.dimen.oy);
                i = (int) dimension;
            }
            i = 0;
        }
        return Integer.valueOf(i);
    }
}

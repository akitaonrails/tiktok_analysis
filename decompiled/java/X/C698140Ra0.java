package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;

/* JADX INFO: renamed from: X.0Ra0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C698140Ra0 {
    public static final boolean LIZ(Aweme aweme) {
        if (!((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId().equals(AwemeExtKt.getAuthorUid(aweme)) || !C746760TRa.LIZ().LJJLJLI(aweme.getAid()) || !C0RT2.LIZ().LIZJ(aweme)) {
            return false;
        }
        C20703515zt.LIZ.getClass();
        if (C20703515zt.LJJIJIIJIL(aweme, false)) {
            return false;
        }
        return true;
    }
}

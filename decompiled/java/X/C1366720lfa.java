package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.ur.school.mob.ISchoolPostMob;

/* JADX INFO: renamed from: X.0lfa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1366720lfa {
    public static final Object LIZ(Aweme aweme, Object obj) {
        ISchoolPostMob iSchoolPostMob = (ISchoolPostMob) PluggableExtentionKt.pluggableSpi$default(ISchoolPostMob.class, false, false, false, 14, null);
        if (iSchoolPostMob != null) {
            iSchoolPostMob.LIZIZ(aweme, obj);
        }
        return obj;
    }

    public static final Object LIZIZ(Aweme aweme, Object obj, String str, String str2) {
        ISchoolPostMob iSchoolPostMob = (ISchoolPostMob) PluggableExtentionKt.pluggableSpi$default(ISchoolPostMob.class, false, false, false, 14, null);
        if (iSchoolPostMob != null) {
            iSchoolPostMob.LIZ(aweme, obj, str, str2);
        }
        return obj;
    }
}

package X;

import com.ss.android.ugc.aweme.common.EventLiveData;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.friends.event.IFollowApiEventReporter;
import com.ss.android.ugc.aweme.friends.model.RelationDataSource;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: renamed from: X.0iha, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1252640iha {
    public final IFollowApiEventReporter LIZ = (IFollowApiEventReporter) PluggableExtentionKt.pluggableSpi$default(IFollowApiEventReporter.class, false, false, false, 14, null);

    public static void LIZ(C1252380ihA c1252380ihA, int i) {
        User userM307clone;
        EventLiveData<FollowStatus> eventLiveData = RelationDataSource.INSTANCE.get();
        String str = c1252380ihA.LIZ;
        int i2 = c1252380ihA.LJIIJJI;
        User user = c1252380ihA.LJIILL;
        if (user != null) {
            userM307clone = user.m307clone();
        } else {
            userM307clone = null;
        }
        eventLiveData.postValue(new FollowStatus(0, i, null, 0, str, null, true, true, Integer.valueOf(i2), 0, userM307clone, null, -1, false));
    }
}

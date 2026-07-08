package X;

import webcast.api.room.LivePodcastResponse;

/* JADX INFO: renamed from: X.01rQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C464601rQ {
    public static final /* synthetic */ int LIZ = 0;

    public static final void LIZ(LivePodcastResponse.ResponseData responseData) {
        if (responseData != null) {
            if (responseData.isFirstTimeHavingLivePermission) {
                new C464701rR().LIZ.storeBoolean("is_first_time_having_live_permission", true);
            }
            if (responseData.watchedLiveForThePastNDays) {
                new C464701rR().LIZ.storeBoolean("watched_live_for_the_past_n_days", true);
            }
        }
    }
}

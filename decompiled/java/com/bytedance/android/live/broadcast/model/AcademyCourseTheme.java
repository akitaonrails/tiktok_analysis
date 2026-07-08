package com.bytedance.android.live.broadcast.model;

import X.C054100Hr;
import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class AcademyCourseTheme {

    @C09CT("claimed_reward_time")
    public final long claimedRewardTime;

    @C09CT("completed_time")
    public final long completedTime;

    @C09CT("cover")
    public final String cover;

    @C09CT("description")
    public final String description;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final long id;

    @C09CT("name")
    public final String name;

    @C09CT("reward")
    public final C054100Hr reward;

    @C09CT("series_id")
    public final long seriesId;

    @C09CT("show_video_survey")
    public final boolean showVideoSurvey;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public final int status;

    @C09CT("tasks")
    public final List<Object> tasks;

    @C09CT("video_survey")
    public final AcademySurveyQuestion videoSurvey;

    public AcademyCourseTheme(long j, long j2, String str, String str2, int i, String str3, C054100Hr c054100Hr, long j3, long j4, List<Object> list, boolean z, AcademySurveyQuestion academySurveyQuestion) {
        this.id = j;
        this.seriesId = j2;
        this.name = str;
        this.cover = str2;
        this.status = i;
        this.description = str3;
        this.completedTime = j3;
        this.claimedRewardTime = j4;
        this.tasks = list;
        this.showVideoSurvey = z;
        this.videoSurvey = academySurveyQuestion;
    }
}

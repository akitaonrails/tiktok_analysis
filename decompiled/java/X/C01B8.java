package X;

import com.ss.android.ugc.aweme.story.api.StoryApi;

/* JADX INFO: renamed from: X.01B8, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01B8 {
    public static C11O8 LIZ(String str) {
        if (str.length() == 0) {
            return null;
        }
        StoryApi storyApi = StoryApi.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('[');
        sbLIZ.append(str);
        sbLIZ.append(']');
        return storyApi.queryBatchAwemeRx(C2188811AlT.LIZIZ(sbLIZ), "", "", 1).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ());
    }
}

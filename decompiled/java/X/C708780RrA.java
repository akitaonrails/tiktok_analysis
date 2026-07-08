package X;

import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.feed.immersive.component.toparea.centerrow2.p1.StoryWheeTagComponent;
import java.util.List;

/* JADX INFO: renamed from: X.0RrA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C708780RrA implements InterfaceC445610Hdf {
    @Override // X.InterfaceC445610Hdf
    public final C13IQ<? extends ReusedUIAssem<? extends C03H5>> getType() {
        return C13LE.LIZ(StoryWheeTagComponent.class);
    }

    @Override // X.InterfaceC445610Hdf
    public final boolean Fc(VideoItemParams videoItemParams, C690870R8b c690870R8b) {
        String str;
        C687802mK c687802mK;
        List<String> list;
        String str2;
        User curUser;
        Integer numValueOf;
        C1C1W c1c1w;
        C1C1T c1c1t = C2203191BKr.LIZ(videoItemParams.getAweme()).socialBlob;
        C1C5K c1c5k = null;
        if (c1c1t != null && (c1c1w = c1c1t.whee_info) != null) {
            c1c5k = c1c1w.story_detail_tag;
        }
        boolean z = false;
        if (c1c5k == null || (str = c1c5k.text) == null || str.length() == 0 || (c687802mK = c1c5k.icon_url) == null || (list = c687802mK.url_list) == null || (str2 = (String) C13LP.LJJJLL(list)) == null || str2.length() == 0 || C1336205Ku.LIZJ().LIZJ() || ((curUser = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser()) != null && (numValueOf = Integer.valueOf(curUser.getAccountType())) != null && numValueOf.intValue() == 3)) {
            return false;
        }
        C708790RrB.LIZ.getClass();
        int iIntValue = ((Number) C264030AWj.LIZ.getValue()).intValue();
        if (iIntValue > 0) {
            long jLIZ = C708790RrB.LIZ();
            if (jLIZ > 0 && System.currentTimeMillis() - jLIZ > ((long) iIntValue) * 86400000) {
                z = true;
            }
        }
        return !z;
    }
}

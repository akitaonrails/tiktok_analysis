package X;

import android.content.Context;
import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.now.NowPostInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.service.INowsTabService;
import com.ss.android.ugc.now.interaction.NowFeedMobHierarchyData;

/* JADX INFO: renamed from: X.0lJN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1352950lJN {
    public C427660Gpo LIZ;
    public TuxTextView LIZIZ;
    public TuxTextView LIZJ;
    public View LIZLLL;

    public final void LIZ(C1352960lJO c1352960lJO, boolean z) {
        C19EG c19egLIZIZ;
        String enterFrom;
        String uid;
        String str;
        NowPostInfo nowPostInfo;
        User author;
        Context context;
        NowFeedMobHierarchyData nowFeedMobHierarchyData = c1352960lJO.LLILLJJLI;
        INowsTabService iNowsTabService = (INowsTabService) ServiceManager.get().getService(INowsTabService.class);
        View view = this.LIZLLL;
        String str2 = null;
        if (view != null && (context = view.getContext()) != null) {
            c19egLIZIZ = C1388190mED.LIZIZ(context);
        } else {
            c19egLIZIZ = null;
        }
        int iLJ = iNowsTabService.LJ(c19egLIZIZ, c1352960lJO.LL, nowFeedMobHierarchyData, EnumC1352970lJP.CAPTION, null);
        if (nowFeedMobHierarchyData != null) {
            enterFrom = nowFeedMobHierarchyData.getEnterFrom();
        } else {
            enterFrom = null;
        }
        Aweme aweme = c1352960lJO.LL;
        if (aweme != null && (author = aweme.getAuthor()) != null) {
            uid = author.getUid();
        } else {
            uid = null;
        }
        Aweme aweme2 = c1352960lJO.LL;
        if (aweme2 != null && (nowPostInfo = aweme2.nowPostInfo) != null) {
            str2 = nowPostInfo.nowMediaType;
        }
        if (z) {
            str = "click_head";
        } else {
            str = "click_text";
        }
        C1350960lGA.LIZ(enterFrom, iLJ, 1, uid, str2, str, "caption");
    }
}

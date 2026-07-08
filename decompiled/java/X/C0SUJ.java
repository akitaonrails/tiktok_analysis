package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.feed.platform.panel.screenshot.ScreenShotPanelComponent;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0SUJ, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SUJ extends C09AY implements Function0<C0SUI> {
    public final /* synthetic */ ScreenShotPanelComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0SUJ(ScreenShotPanelComponent screenShotPanelComponent) {
        super(0);
        this.LL = screenShotPanelComponent;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [X.0SUI] */
    @Override // kotlin.jvm.functions.Function0
    public final C0SUI invoke() {
        Object obj;
        this.LL.getClass();
        AbstractC1387200mCc abstractC1387200mCcLJFF = C1906580ziK.LJFF();
        final String simpleName = (abstractC1387200mCcLJFF == null || (obj = abstractC1387200mCcLJFF.LIZ) == null) ? null : obj.getClass().getSimpleName();
        if (simpleName == null) {
            simpleName = "";
        }
        IFeedPanelPlatformAbility iFeedPanelPlatformAbilityM349do = this.LL.m349do();
        int iCl2 = iFeedPanelPlatformAbilityM349do != null ? iFeedPanelPlatformAbilityM349do.cl2() : 0;
        IFeedPanelPlatformAbility iFeedPanelPlatformAbilityM349do2 = this.LL.m349do();
        String strLIZ = C735610StL.LIZ(iCl2, iFeedPanelPlatformAbilityM349do2 != null ? iFeedPanelPlatformAbilityM349do2.cY1() : null, true);
        final String str = strLIZ != null ? strLIZ : "";
        final ScreenShotPanelComponent screenShotPanelComponent = this.LL;
        return new AbstractC2361009My() { // from class: X.0SUI
            @Override // X.AbstractC2361009My
            public final Map<String, String> mobExtraParams() {
                String aid;
                IViewPagerComponentAbility iViewPagerComponentAbilityMb;
                Object obj2;
                screenShotPanelComponent.getClass();
                AbstractC1387200mCc abstractC1387200mCcLJFF2 = C1906580ziK.LJFF();
                if (!TextUtils.equals((abstractC1387200mCcLJFF2 == null || (obj2 = abstractC1387200mCcLJFF2.LIZ) == null) ? null : obj2.getClass().getSimpleName(), simpleName)) {
                    return C2097608Jq.LJ();
                }
                IFeedPanelPlatformAbility iFeedPanelPlatformAbilityM349do3 = screenShotPanelComponent.m349do();
                Aweme awemeLJIIIIZZ = (iFeedPanelPlatformAbilityM349do3 == null || (iViewPagerComponentAbilityMb = iFeedPanelPlatformAbilityM349do3.Mb()) == null) ? null : iViewPagerComponentAbilityMb.LJIIIIZZ();
                Pair[] pairArr = new Pair[6];
                pairArr[0] = new Pair("enter_from", str);
                if (awemeLJIIIIZZ == null || (aid = awemeLJIIIIZZ.getAid()) == null) {
                    aid = "";
                }
                pairArr[1] = new Pair("group_id", aid);
                pairArr[2] = new Pair("aweme_type", String.valueOf(awemeLJIIIIZZ != null ? Integer.valueOf(awemeLJIIIIZZ.getAwemeType()) : null));
                pairArr[3] = new Pair("author_id", String.valueOf(awemeLJIIIIZZ != null ? AwemeExtKt.getAuthorUid(awemeLJIIIIZZ) : null));
                pairArr[4] = new Pair("log_pb", String.valueOf(awemeLJIIIIZZ != null ? awemeLJIIIIZZ.getLogPbString() : null));
                pairArr[5] = new Pair("pic_cnt", String.valueOf(C735370Ssx.LJIILL(awemeLJIIIIZZ)));
                Map<String, String> mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
                String str2 = str;
                CommentService.LIZ.getClass();
                Map<String, String> contentRecReasonParams = C523420Kfs.LIZ().getContentRecReasonParams(awemeLJIIIIZZ, str2);
                if (contentRecReasonParams != null) {
                    mapLJIIJ.putAll(contentRecReasonParams);
                }
                CommentService commentServiceLIZ = C523420Kfs.LIZ();
                AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
                String strLLIIZ = commentServiceLIZ.LLIIZ(abstractC1387200mCcLJ != null ? abstractC1387200mCcLJ.LIZIZ() : null);
                if (strLLIIZ != null) {
                    mapLJIIJ.put("comment_id", strLLIIZ);
                }
                if (C720360SNm.LJFF(awemeLJIIIIZZ)) {
                    mapLJIIJ.put("is_comment_to_post", "1");
                }
                return mapLJIIJ;
            }

            @Override // X.AbstractC2361009My
            public final boolean onShot(String str2) {
                C2276471E8n.LIZIZ.LIZIZ("common_feed", "ScreenShotPanelComponent", "screenshot, onShot on Feed");
                return false;
            }
        };
    }
}

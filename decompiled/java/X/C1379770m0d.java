package X;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.homepage.api.msadapt.IMSAdaptionService;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.IShortVideoConfig;
import com.ss.android.ugc.aweme.share.ShareDependService;
import com.ss.android.ugc.aweme.share.ShareDependServiceImpl;
import java.util.List;
import java.util.UUID;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0m0d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1379770m0d {
    public static final void LIZ(Context context, Aweme aweme, String str, String str2, String str3, String str4, boolean z, boolean z2) {
        String string;
        C19EG c19eg;
        FragmentManager supportFragmentManager;
        List<Fragment> listLJJLIIIJL;
        Fragment fragment;
        if (((IMSAdaptionService) ServiceManager.get().getService(IMSAdaptionService.class)).LIZLLL(context)) {
            C1233040iBy c1233040iBy = new C1233040iBy(context);
            c1233040iBy.LIZJ("Camera is only available in the single screen mod");
            c1233040iBy.LIZLLL();
            return;
        }
        String string2 = UUID.randomUUID().toString();
        if (!C10IT.LIZ(aweme)) {
            C15OK c15okLIZIZ = C10IT.LIZIZ(aweme);
            IShortVideoConfig iShortVideoConfigShortVideoConfig = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).configService().shortVideoConfig();
            if (c15okLIZIZ == C15OK.VIDEO_LENGTH_RESTRICT) {
                string = iShortVideoConfigShortVideoConfig.getErrorHintWhenDisableDuetOrStitch(1);
            } else {
                string = context.getString(2131832490);
            }
            if (string.length() > 0) {
                if (C299060Bns.LIZ()) {
                    Activity activityLIZ = C1388190mED.LIZ(context);
                    if ((activityLIZ instanceof C19EG) && (c19eg = (C19EG) activityLIZ) != null && (supportFragmentManager = c19eg.getSupportFragmentManager()) != null && (listLJJLIIIJL = supportFragmentManager.LJJLIIIJL()) != null && (fragment = (Fragment) C13LP.LJJLIIIJL(listLJJLIIIJL)) != null) {
                        C1389880mGw c1389880mGw = new C1389880mGw(fragment);
                        c1389880mGw.LJIIIZ(string);
                        c1389880mGw.LJIIJ();
                        return;
                    }
                    return;
                }
                C1233040iBy c1233040iBy2 = new C1233040iBy(context);
                c1233040iBy2.LIZJ(string);
                c1233040iBy2.LIZLLL();
                return;
            }
            return;
        }
        Activity activityLJII = C1375500ltk.LJII(context);
        if (activityLJII != null) {
            ShareDependService.LIZ.getClass();
            ShareDependService shareDependServiceLJJJJI = ShareDependServiceImpl.LJJJJI();
            Pair[] pairArr = new Pair[5];
            pairArr[0] = new Pair("group_id", aweme.getAid());
            String authorUid = AwemeExtKt.getAuthorUid(aweme);
            String str5 = "";
            if (authorUid == null) {
                authorUid = "";
            }
            pairArr[1] = new Pair("author_id", authorUid);
            pairArr[2] = new Pair("enter_from", str2);
            if (str != null) {
                str5 = str;
            }
            pairArr[3] = new Pair("panel_source", str5);
            pairArr[4] = new Pair("enter_method", "click_duet_button");
            shareDependServiceLJJJJI.LJFF(string2, aweme, activityLJII, str2, str3, str4, C2097608Jq.LJIIIIZZ(pairArr), z, z2);
        }
    }
}

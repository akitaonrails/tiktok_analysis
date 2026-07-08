package X;

import android.content.Context;
import android.view.View;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.base.ui.anchor.ICommonFeedApiService;
import com.ss.android.ugc.aweme.feed.assem.avatar.FeedAvatarDefaultAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: renamed from: X.0StD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class ViewOnClickListenerC735530StD implements View.OnClickListener {
    public final /* synthetic */ FeedAvatarDefaultAssem LL;

    public ViewOnClickListenerC735530StD(FeedAvatarDefaultAssem feedAvatarDefaultAssem) {
        this.LL = feedAvatarDefaultAssem;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object obj;
        String string;
        String nickname;
        boolean zLJI = MethodIDManager.LJI(72085);
        Aweme aweme = ((VideoItemParams) C631370Opb.LIZ(this.LL)).getAweme();
        if (aweme == null) {
            if (zLJI) {
                MethodIDManager.LJ();
                return;
            }
            return;
        }
        Context context = this.LL.getContext();
        if (context != null) {
            FeedAvatarDefaultAssem feedAvatarDefaultAssem = this.LL;
            C737030Svd c737030Svd = new C737030Svd(12, aweme);
            String str = feedAvatarDefaultAssem.LLLILZLLLI;
            if (str != null) {
                c737030Svd.LJIIJ = str;
                c737030Svd.LJIIJJI = true;
            }
            ((ICommonFeedApiService) ServiceManager.get().getService(ICommonFeedApiService.class)).LJI(c737030Svd.LIZJ, aweme);
            C724270Sb3 c724270Sb3 = feedAvatarDefaultAssem.LLJI;
            String nickname2 = null;
            if (c724270Sb3 != null) {
                obj = c724270Sb3.LL;
            } else {
                obj = null;
            }
            DataCenter dataCenter = ((VideoItemParams) obj).dataCenter;
            if (dataCenter != null) {
                c737030Svd.LIZLLL = "feed";
                C1440005kM.LIZ(c737030Svd);
                dataCenter.zQ2(c737030Svd, "feed_internal_event");
            }
            if (!((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
                if (zLJI) {
                    MethodIDManager.LJ();
                    return;
                }
                return;
            }
            C0OC0 c0oc0 = C0OC0.LIZ;
            aweme.getAuthor();
            c0oc0.getClass();
            if (C302070Bsj.LIZJ()) {
                Object[] objArr = new Object[1];
                User author = aweme.getAuthor();
                if (author == null || (nickname = author.getNickname()) == null) {
                    nickname = "";
                }
                objArr[0] = nickname;
                string = C343140Dcm.LIZLLL(2131835403, objArr);
            } else {
                Object[] objArr2 = new Object[1];
                User author2 = aweme.getAuthor();
                if (author2 != null) {
                    nickname2 = author2.getNickname();
                }
                objArr2[0] = nickname2;
                string = context.getString(2131835403, objArr2);
            }
            C20096413kA.LIZ(context, string);
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }
}

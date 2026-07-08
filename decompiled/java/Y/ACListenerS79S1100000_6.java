package Y;

import X.C0HFL;
import X.C0HWW;
import X.C13LP;
import X.C19EG;
import android.net.Uri;
import android.view.View;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.assem.pugc.VideoTemplateButtonAssem;
import com.ss.android.ugc.aweme.profile.model.AvatarSizeUrlStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.profile.business.ur.ui.MusProfileEditFragment;
import com.ss.android.ugc.profile.business.ur.ui.SocialAvatarBottomSheetActionFragment;
import com.ss.android.ugc.ur.socialavatar.ISocialAvatarService;
import com.ss.android.ugc.ur.socialavatar.SocialAvatarDownloadArg;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public class ACListenerS79S1100000_6 implements View.OnClickListener {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                break;
            case 1:
                onClick$1(this, view);
                break;
            case 2:
                onClick$2(this, view);
                break;
            case 3:
                onClick$3(this, view);
                break;
            case 4:
                onClick$4(this, view);
                break;
            case 5:
                onClick$5(this, view);
                break;
            case 6:
                onClick$6(this, view);
                break;
            case 7:
                onClick$7(this, view);
                break;
        }
    }

    public static final void onClick$0(ACListenerS79S1100000_6 aCListenerS79S1100000_6, View view) {
        C0HWW c0hww = C0HWW.LIZ;
        String str = aCListenerS79S1100000_6.s0;
        c0hww.getClass();
        C0HWW.LIZJ(str, "take_photo");
        MusProfileEditFragment musProfileEditFragment = (MusProfileEditFragment) aCListenerS79S1100000_6.l1;
        musProfileEditFragment.MR(0, musProfileEditFragment.getActivity());
    }

    public static final void onClick$1(ACListenerS79S1100000_6 aCListenerS79S1100000_6, View view) {
        C0HWW c0hww = C0HWW.LIZ;
        String str = aCListenerS79S1100000_6.s0;
        c0hww.getClass();
        C0HWW.LIZJ(str, "upload_photo");
        ((MusProfileEditFragment) aCListenerS79S1100000_6.l1).NR(0);
    }

    public static final void onClick$2(ACListenerS79S1100000_6 aCListenerS79S1100000_6, View view) {
        AvatarSizeUrlStruct staticAvatar;
        UrlModel urlModel;
        List<String> urlList;
        String str;
        AvatarSizeUrlStruct socialAvatarWithBackground;
        UrlModel urlModel2;
        List<String> urlList2;
        C0HWW c0hww = C0HWW.LIZ;
        String str2 = aCListenerS79S1100000_6.s0;
        c0hww.getClass();
        C0HWW.LIZJ(str2, "view_photo");
        MusProfileEditFragment musProfileEditFragment = (MusProfileEditFragment) aCListenerS79S1100000_6.l1;
        C19EG activity = musProfileEditFragment.getActivity();
        if (musProfileEditFragment.LLZZLLIL == 1) {
            User user = musProfileEditFragment.getUser();
            if (user != null && (socialAvatarWithBackground = user.getSocialAvatarWithBackground()) != null && (urlModel2 = socialAvatarWithBackground.avatarLarger) != null && (urlList2 = urlModel2.getUrlList()) != null) {
                str = (String) C13LP.LJJJLZIJ(0, urlList2);
            } else {
                return;
            }
        } else {
            User user2 = musProfileEditFragment.getUser();
            if (user2 == null || (staticAvatar = user2.getStaticAvatar()) == null || (urlModel = staticAvatar.avatarLarger) == null || (urlList = urlModel.getUrlList()) == null) {
                return;
            } else {
                str = (String) C13LP.LJJJLZIJ(0, urlList);
            }
        }
        if (str != null) {
            musProfileEditFragment.xT(activity, UriProtector.parse(str));
        }
    }

    public static final void onClick$3(ACListenerS79S1100000_6 aCListenerS79S1100000_6, View view) {
        String uniqueId;
        C19EG activity = ((SocialAvatarBottomSheetActionFragment) aCListenerS79S1100000_6.l1).getActivity();
        if (activity == null) {
            return;
        }
        C0HWW c0hww = C0HWW.LIZ;
        String str = aCListenerS79S1100000_6.s0;
        c0hww.getClass();
        C0HWW.LIZLLL(str, "download");
        ISocialAvatarService iSocialAvatarService = (ISocialAvatarService) ((SocialAvatarBottomSheetActionFragment) aCListenerS79S1100000_6.l1).LLJI.getValue();
        User user = ((SocialAvatarBottomSheetActionFragment) aCListenerS79S1100000_6.l1).LLILLJJLI;
        String uid = null;
        if (user != null) {
            uid = user.getUid();
        }
        String str2 = "";
        if (uid == null) {
            uid = "";
        }
        User user2 = ((SocialAvatarBottomSheetActionFragment) aCListenerS79S1100000_6.l1).LLILLJJLI;
        if (user2 != null && (uniqueId = user2.getUniqueId()) != null) {
            str2 = uniqueId;
        }
        iSocialAvatarService.LJIILL(activity, new SocialAvatarDownloadArg("edit_social_avatar_profile_display", uid, str2, System.currentTimeMillis()));
    }

    public static final void onClick$4(ACListenerS79S1100000_6 aCListenerS79S1100000_6, View view) {
        Function2<Integer, C19EG, Unit> function2;
        C0HWW c0hww = C0HWW.LIZ;
        String str = aCListenerS79S1100000_6.s0;
        c0hww.getClass();
        C0HWW.LIZJ(str, "take_photo");
        SocialAvatarBottomSheetActionFragment socialAvatarBottomSheetActionFragment = (SocialAvatarBottomSheetActionFragment) aCListenerS79S1100000_6.l1;
        C0HFL c0hfl = socialAvatarBottomSheetActionFragment.LLILLL;
        if (c0hfl != null && (function2 = c0hfl.LIZ) != null) {
            function2.invoke(0, socialAvatarBottomSheetActionFragment.getActivity());
        }
    }

    public static final void onClick$5(ACListenerS79S1100000_6 aCListenerS79S1100000_6, View view) {
        Function1<Integer, Unit> function1;
        C0HWW c0hww = C0HWW.LIZ;
        String str = aCListenerS79S1100000_6.s0;
        c0hww.getClass();
        C0HWW.LIZJ(str, "upload_photo");
        C0HFL c0hfl = ((SocialAvatarBottomSheetActionFragment) aCListenerS79S1100000_6.l1).LLILLL;
        if (c0hfl != null && (function1 = c0hfl.LIZIZ) != null) {
            function1.invoke(0);
        }
    }

    public static final void onClick$6(ACListenerS79S1100000_6 aCListenerS79S1100000_6, View view) {
        AvatarSizeUrlStruct staticAvatar;
        UrlModel urlModel;
        List<String> urlList;
        String str;
        C0HFL c0hfl;
        Function2<C19EG, Uri, Unit> function2;
        AvatarSizeUrlStruct socialAvatarWithBackground;
        UrlModel urlModel2;
        List<String> urlList2;
        C0HWW c0hww = C0HWW.LIZ;
        String str2 = aCListenerS79S1100000_6.s0;
        c0hww.getClass();
        C0HWW.LIZJ(str2, "view_photo");
        SocialAvatarBottomSheetActionFragment socialAvatarBottomSheetActionFragment = (SocialAvatarBottomSheetActionFragment) aCListenerS79S1100000_6.l1;
        C19EG activity = socialAvatarBottomSheetActionFragment.getActivity();
        if (socialAvatarBottomSheetActionFragment.LL == 1) {
            User user = socialAvatarBottomSheetActionFragment.LLILLJJLI;
            if (user != null && (socialAvatarWithBackground = user.getSocialAvatarWithBackground()) != null && (urlModel2 = socialAvatarWithBackground.avatarLarger) != null && (urlList2 = urlModel2.getUrlList()) != null) {
                str = (String) C13LP.LJJJLZIJ(0, urlList2);
            } else {
                return;
            }
        } else {
            User user2 = socialAvatarBottomSheetActionFragment.LLILLJJLI;
            if (user2 == null || (staticAvatar = user2.getStaticAvatar()) == null || (urlModel = staticAvatar.avatarLarger) == null || (urlList = urlModel.getUrlList()) == null) {
                return;
            } else {
                str = (String) C13LP.LJJJLZIJ(0, urlList);
            }
        }
        if (str != null && (c0hfl = socialAvatarBottomSheetActionFragment.LLILLL) != null && (function2 = c0hfl.LIZJ) != null) {
            function2.invoke(activity, UriProtector.parse(str));
        }
    }

    public static final void onClick$7(ACListenerS79S1100000_6 aCListenerS79S1100000_6, View view) {
        SmartRouter.buildRoute(((VideoTemplateButtonAssem) aCListenerS79S1100000_6.l1).getContext(), aCListenerS79S1100000_6.s0).open();
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public ACListenerS79S1100000_6(com.ss.android.ugc.profile.business.ur.ui.SocialAvatarBottomSheetActionFragment r2, java.lang.String r3, int r4) {
        /*
            r1 = this;
            r1.$t = r4
            int r4 = 3 - r4
            if (r4 == 0) goto Lf
            r0 = r1
            r0.s0 = r3
            r0.l1 = r2
        Lb:
            r0.<init>()
            return
        Lf:
            r0 = r1
            r0.l1 = r2
            r0.s0 = r3
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ACListenerS79S1100000_6.<init>(com.ss.android.ugc.profile.business.ur.ui.SocialAvatarBottomSheetActionFragment, java.lang.String, int):void");
    }

    public ACListenerS79S1100000_6(Object obj, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
    }
}

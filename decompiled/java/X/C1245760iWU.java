package X;

import android.content.DialogInterface;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.intro.TuxPanel;
import com.ss.android.ugc.aweme.avatar.AvatarComponentView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.friends.model.MutualUser;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.profile.business.ur.school.popup.CampusPopupPanelHelper$applyOnShownTweaks$1;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS633S0100000_19;

/* JADX INFO: renamed from: X.0iWU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1245760iWU {
    public static final C1245760iWU LIZ = new C1245760iWU();

    /* JADX WARN: Type inference failed for: r4v7, types: [T, androidx.fragment.app.Fragment, com.bytedance.tux.sheet.intro.TuxPanel] */
    public static TuxPanel LIZ(C19EG c19eg, LifecycleOwner lifecycleOwner, C1245770iWV c1245770iWV) {
        String str;
        String str2;
        View view;
        View view2;
        LinearLayout.LayoutParams layoutParams;
        User currentUser;
        String uid;
        List<MutualUser> list;
        List<String> urlList;
        C1391960mKI c1391960mKI = new C1391960mKI();
        c1391960mKI.LJIILLIIL = Integer.valueOf(R.style.hj);
        View viewSd = C786410Ut5.Sd(R.layout.ec2, C786410Ut5.ne(c19eg), null);
        C786410Ut5.W5(viewSd, new FrameLayout.LayoutParams(-1, -2));
        TuxTextView tuxTextView = (TuxTextView) viewSd.findViewById(R.id.dam);
        tuxTextView.setTuxFont(123);
        tuxTextView.setTextSize(1, 26.0f);
        C21382118m3.LJFF(tuxTextView, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(31)));
        tuxTextView.setText(c19eg.getString(2131828960));
        View viewFindViewById = viewSd.findViewById(R.id.dak);
        TuxTextView tuxTextView2 = (TuxTextView) viewSd.findViewById(R.id.dal);
        tuxTextView2.setTuxFont(51);
        if (c1245770iWV.LIZIZ > 0 && (list = c1245770iWV.LIZ) != null && !list.isEmpty()) {
            C786410Ut5.LJLLLLLL(0, viewFindViewById);
            tuxTextView2.setText(c19eg.getString(2131828961));
            List<MutualUser> list2 = c1245770iWV.LIZ;
            int i = c1245770iWV.LIZIZ;
            C427760Gpy c427760Gpy = (C427760Gpy) viewSd.findViewById(R.id.dah);
            c427760Gpy.setStacking(EnumC429060Gs4.LAST_ON_TOP);
            c427760Gpy.setTotalCount(i);
            c427760Gpy.setSize(EnumC428930Grr.X_SMALL);
            c427760Gpy.setMaxImageNum(2);
            if (list2 != null && !list2.isEmpty()) {
                C786410Ut5.LJLLLLLL(0, c427760Gpy);
                int i2 = 0;
                for (Object obj : C13LP.LL(list2, 2)) {
                    int i3 = i2 + 1;
                    if (i2 >= 0) {
                        UrlModel avatarMedium = ((MutualUser) obj).getAvatarMedium();
                        if (avatarMedium != null) {
                            urlList = avatarMedium.getUrlList();
                        } else {
                            urlList = null;
                        }
                        C427760Gpy.LIZ(c427760Gpy, i2, new C03IT(urlList), String.valueOf(i2), null, null, false, null, 2040);
                        i2 = i3;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
            } else {
                C786410Ut5.LJLLLLLL(8, c427760Gpy);
            }
        } else {
            C786410Ut5.LJLLLLLL(8, viewFindViewById);
        }
        ImageView imageView = (ImageView) viewSd.findViewById(R.id.dai);
        DisplayMetrics displayMetrics = c19eg.getResources().getDisplayMetrics();
        if (C960203pA.LIZIZ(c19eg)) {
            str = "_dark";
        } else {
            str = "_light";
        }
        int i4 = displayMetrics.densityDpi;
        String str3 = "@2x.png";
        if (i4 < 160) {
            str2 = "@1x.png";
        } else if (i4 < 640) {
            str2 = "@2x.png";
        } else {
            str2 = "@3x.png";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        C1246150iX7.LIZ.getClass();
        sbLIZ.append(C1246150iX7.LIZ().popupIllustrationBgUrl);
        sbLIZ.append(str);
        sbLIZ.append(str2);
        C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
        c1331670kl3LJIIIZ.LJJ = EnumC1338240kve.FIT_XY;
        c1331670kl3LJIIIZ.LJJI(imageView);
        C786410Ut5.h3(c1331670kl3LJIIIZ);
        C420510GeH c420510GeH = (C420510GeH) viewSd.findViewById(R.id.daf);
        AvatarComponentView avatarComponentView = c420510GeH.LLILLJJLI;
        avatarComponentView.getConfig().LIZ(AFwS264S0000000_24.get$arr$(696));
        avatarComponentView.LJFF(avatarComponentView.getConfig());
        IUserService iUserService = (IUserService) PluggableExtentionKt.pluggableSpi$default(IUserService.class, false, false, false, 14, null);
        if (iUserService != null && (currentUser = iUserService.getCurrentUser()) != null && (uid = currentUser.getUid()) != null) {
            C0S1B.LIZ(c420510GeH.LLILLJJLI, uid, currentUser, lifecycleOwner, false, null, 56);
        }
        int i5 = c420510GeH.getResources().getDisplayMetrics().densityDpi;
        if (i5 < 160) {
            str3 = "@1x.png";
        } else if (i5 >= 640) {
            str3 = "@3x.png";
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(C1246150iX7.LIZ().popupIllustrationBottomUrl);
        sbLIZ2.append(str3);
        C1331670kl3 c1331670kl3LJIIIZ2 = C1331660kl2.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ2));
        EnumC1338240kve enumC1338240kve = EnumC1338240kve.CENTER_CROP;
        c1331670kl3LJIIIZ2.LJJ = enumC1338240kve;
        c1331670kl3LJIIIZ2.LJJI(c420510GeH.LL);
        C786410Ut5.h3(c1331670kl3LJIIIZ2);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(C1246150iX7.LIZ().popupIllustrationTopUrl);
        sbLIZ3.append(str3);
        C1331670kl3 c1331670kl3LJIIIZ3 = C1331660kl2.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ3));
        c1331670kl3LJIIIZ3.LJJ = enumC1338240kve;
        c1331670kl3LJIIIZ3.LJJI(c420510GeH.LLILLL);
        C786410Ut5.h3(c1331670kl3LJIIIZ3);
        if (viewSd.isAttachedToWindow()) {
            Object parent = viewSd.getParent();
            if ((parent instanceof View) && (view = (View) parent) != null) {
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                if ((layoutParams2 instanceof LinearLayout.LayoutParams) && (layoutParams = (LinearLayout.LayoutParams) layoutParams2) != null) {
                    layoutParams.topMargin = 0;
                    C786410Ut5.W5(view, layoutParams);
                }
                Object parent2 = view.getParent();
                if ((parent2 instanceof ViewGroup) && (view2 = (View) parent2) != null) {
                    View viewFindViewById2 = view2.findViewById(R.id.bsc);
                    if (viewFindViewById2 != null) {
                        C786410Ut5.LJLLLLLL(8, viewFindViewById2);
                    }
                    View viewFindViewById3 = view2.findViewById(R.id.bs9);
                    if (viewFindViewById3 != null) {
                        C786410Ut5.LJLLLLLL(8, viewFindViewById3);
                    }
                }
            }
        } else {
            viewSd.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC346330Dhv(viewSd, 3));
        }
        c1391960mKI.LJFF = viewSd;
        c1391960mKI.LJI = -1;
        c1391960mKI.LJIIIZ = C13LQ.LJJLL(new C1391890mKB[]{new C1391890mKB(c19eg.getString(2131828957), Integer.valueOf(R.raw.icon_person_phd), null, 4), new C1391890mKB(c19eg.getString(2131828958), Integer.valueOf(R.raw.icon_live_two_person), null, 4)});
        c1391960mKI.LIZIZ(c19eg.getString(2131828959), new AwS633S0100000_19(c1245770iWV, 282));
        if (!c1245770iWV.LJII) {
            c1391960mKI.LIZJ(c19eg.getString(2131828955), new AwS633S0100000_19(c1245770iWV, 281));
        }
        c1391960mKI.LJIILJJIL = true;
        c1391960mKI.LIZ = c1245770iWV.LJII;
        final C259800zU c259800zU = new C259800zU();
        C439850HMp c439850HMpLIZ = c1391960mKI.LIZ();
        Integer numValueOf = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(600)));
        ?? r4 = c439850HMpLIZ.LIZ;
        r4.LLIZ = numValueOf;
        boolean z = c1245770iWV.LJII;
        r4.LLJI = z;
        r4.LLJIJIL = z;
        r4.LLJILJIL = z;
        Function1<TuxPanel, Unit> function1 = c1245770iWV.LJFF;
        if (function1 != null) {
            r4.LLILZLL = new DialogInterfaceOnCancelListenerC1265880j2w(function1, c259800zU, 0);
        }
        final Function1<TuxPanel, Unit> function12 = c1245770iWV.LJI;
        if (function12 != null) {
            r4.LLILZIL = new DialogInterface.OnDismissListener() { // from class: X.0iWW
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    TuxPanel tuxPanel = c259800zU.element;
                    if (tuxPanel != null) {
                        function12.invoke(tuxPanel);
                    }
                }
            };
        }
        c259800zU.element = r4;
        r4.getLifecycle().addObserver(new CampusPopupPanelHelper$applyOnShownTweaks$1());
        return r4;
    }

    public static TuxPanel LIZIZ(C19EG c19eg, LifecycleOwner lifecycleOwner, FragmentManager fragmentManager, C1245770iWV c1245770iWV) {
        if (!c19eg.isFinishing() && !c19eg.isDestroyed() && !fragmentManager.LJLJJI()) {
            TuxPanel tuxPanelLIZ = LIZ(c19eg, lifecycleOwner, c1245770iWV);
            tuxPanelLIZ.show(fragmentManager, "campus_popup");
            Function0<Unit> function0 = c1245770iWV.LJ;
            if (function0 != null) {
                function0.invoke();
            }
            return tuxPanelLIZ;
        }
        return null;
    }
}

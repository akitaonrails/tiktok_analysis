package X;

import Y.ACListenerS130S0200000_28;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.feed.guide.GalleryLayoutManager;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.friends.model.UserWithAweme;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.IMainService;
import com.ss.android.ugc.aweme.utils.UserVerify;
import com.ss.android.ugc.playerkit.videoview.VideoViewComponent;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.jvm.internal.AwS572S0100000_28;

/* JADX INFO: renamed from: X.10Lj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class ViewOnClickListenerC19230910Lj extends RecyclerView.ViewHolder implements InterfaceC19230410Le, View.OnClickListener, InterfaceC723190SYj {
    public final InterfaceC19231510Lp LL;
    public final InterfaceC19231610Lq LLILLJJLI;
    public final InterfaceC19231710Lr LLILLL;
    public final GalleryLayoutManager LLILZ;
    public int LLILZIL;
    public int LLILZLL;
    public C10LS LLIZ;
    public final C01GW LLIZLLLIL;
    public final C01GW LLJ;
    public final C01GW LLJI;
    public final C01GW LLJIJIL;
    public final C01GW LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C01GW LLJILLL;
    public VideoViewComponent LLJJ;
    public boolean LLJJI;
    public final C586920N0g LLJJIII;
    public boolean LLJJIJI;
    public Video LLJJIJIIJIL;
    public UserWithAweme LLJJIJIL;
    public Integer LLJJJ;
    public final C0SY1 LLJJJIL;
    public final C19231010Lk LLJJJJ;

    public final void b6() {
        this.LLJJIJI = false;
        if (this.LLJJIII.LIZ != 0) {
            S5().LJIIJJI();
            S5().release();
            S5().H1(this.LLJJJJ);
            this.LLJJIII.LIZ = 0;
            C786410Ut5.l(R5(), 0);
        }
    }

    public final Drawable N5() {
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36));
        c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18));
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(200));
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.zj);
        return c384050F3z.LIZ(this.itemView.getContext());
    }

    public final TextView P5() {
        return (TextView) this.LLJIJIL.getValue();
    }

    public final RemoteImageView R5() {
        return (RemoteImageView) this.LLJILJILJ.getValue();
    }

    public final VideoViewComponent S5() {
        VideoViewComponent videoViewComponent = this.LLJJ;
        if (videoViewComponent != null) {
            return videoViewComponent;
        }
        return null;
    }

    public final void T5() {
        if (this.LLJJI && R5().getVisibility() == 0) {
            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation.setDuration(500L);
            alphaAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: X.10Lm
                @Override // android.view.animation.Animation.AnimationListener
                public final void onAnimationRepeat(Animation animation) {
                }

                @Override // android.view.animation.Animation.AnimationListener
                public final void onAnimationStart(Animation animation) {
                }

                @Override // android.view.animation.Animation.AnimationListener
                public final void onAnimationEnd(Animation animation) {
                    C786410Ut5.l(this.LIZ.R5(), 8);
                }
            });
            R5().startAnimation(alphaAnimation);
        }
    }

    public final void U5() {
        UserWithAweme userWithAweme = this.LLJJIJIL;
        if (userWithAweme != null) {
            W5(userWithAweme.getUser().getFollowStatus(), userWithAweme.getUser().getFollowerStatus());
            ((C0HX6) this.LLJ.getValue()).setUserData(new UserVerify(userWithAweme.getUser().getAvatarThumb(), userWithAweme.getUser().getCustomVerify(), userWithAweme.getUser().getEnterpriseVerifyReason(), Integer.valueOf(userWithAweme.getUser().getVerificationType())));
            ((C0HX6) this.LLJ.getValue()).LIZ();
            I5(userWithAweme.getUser());
        }
    }

    public final boolean X5() {
        Aweme aweme;
        AwemeStatus statusSafety;
        AwemeStatus.VideoMuteInfo videoMuteInfo;
        Aweme aweme2;
        Music music;
        Aweme aweme3;
        Music music2;
        UrlModel playUrl;
        UserWithAweme userWithAweme = this.LLJJIJIL;
        Integer numValueOf = null;
        List<String> urlList = (userWithAweme == null || (aweme3 = userWithAweme.getAweme()) == null || (music2 = aweme3.getMusic()) == null || (playUrl = music2.getPlayUrl()) == null) ? null : playUrl.getUrlList();
        UserWithAweme userWithAweme2 = this.LLJJIJIL;
        if (userWithAweme2 != null && (aweme2 = userWithAweme2.getAweme()) != null && (music = aweme2.getMusic()) != null) {
            numValueOf = Integer.valueOf(music.getMusicStatus());
        }
        if (urlList == null || urlList.isEmpty() || (numValueOf != null && numValueOf.intValue() == 0)) {
            return true;
        }
        UserWithAweme userWithAweme3 = this.LLJJIJIL;
        return (userWithAweme3 == null || (aweme = userWithAweme3.getAweme()) == null || (statusSafety = AwemeExtKt.getStatusSafety(aweme)) == null || (videoMuteInfo = statusSafety.getVideoMuteInfo()) == null || !videoMuteInfo.isMute()) ? false : true;
    }

    public final void L5() {
        if (!((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().isLogin()) {
            C0XPD.LIZIZ(C2214201BlK.LJFF(), "homepage_follow", "click_follow_tab", new C627150Oin().LIZ, new C19335610kk(this, 3));
            return;
        }
        UserWithAweme userWithAweme = this.LLJJIJIL;
        if (userWithAweme != null) {
            if (userWithAweme.getUser().getFollowStatus() == 0) {
                this.LLILLJJLI.LLLF(getAdapterPosition());
            }
            Activity activityLIZ = C1388190mED.LIZ(this.itemView.getContext());
            int i = userWithAweme.getUser().getFollowStatus() != 0 ? 0 : userWithAweme.getUser().isSecret() ? 4 : userWithAweme.getUser().getFollowerStatus() == 1 ? 2 : 1;
            if (userWithAweme.getUser().getFollowStatus() == 4) {
                if (activityLIZ != null) {
                    V5(i);
                    return;
                }
                return;
            }
            if (i != 4) {
                V5(i);
                return;
            }
            if (activityLIZ != null) {
                C2230608oa<Integer> privacyAccountFollowCount = SharePrefCache.inst().getPrivacyAccountFollowCount();
                Integer numLIZ = privacyAccountFollowCount.LIZ();
                if (numLIZ == null || numLIZ.intValue() != 0) {
                    int iIntValue = numLIZ.intValue();
                    if (1 <= iIntValue && iIntValue < 4) {
                        C1233040iBy c1233040iBy = new C1233040iBy(activityLIZ);
                        c1233040iBy.LIZIZ(2131845227);
                        c1233040iBy.LIZLLL();
                    }
                } else {
                    C21566919al c21566919al = new C21566919al(activityLIZ);
                    c21566919al.LIZ(2131845226);
                    c21566919al.LJIIJ(2131835646, null, false);
                    new C21566519ah(c21566919al).LIZLLL();
                }
                privacyAccountFollowCount.LJ(Integer.valueOf(numLIZ.intValue() + 1));
                V5(i);
            }
        }
    }

    public final void a6() {
        if (!S5().LLILLL.Da() || this.LLJJIJIIJIL == null) {
            this.LLJJIJI = true;
            return;
        }
        int i = this.LLJJIII.LIZ;
        if (i == 0) {
            S5().LIZ(this.LLJJJJ);
            S5().LJII(this.LLJJIJIIJIL, C0C64.LJIILLIIL().LJIJ(31744, 0, "decoder_type", true));
            if (X5()) {
                S5().LJI();
            }
            this.LLJJIJI = false;
            this.LLJJIII.LIZ = 2;
            return;
        }
        if (i == 3) {
            T5();
            S5().LJIIL(this.LLJJIJIIJIL);
            if (X5()) {
                S5().LJI();
            }
            this.LLJJIII.LIZ = 4;
        }
    }

    @Override // X.InterfaceC19230410Le
    public final void M1() {
        U5();
    }

    public final void I5(User user) {
        ((TextView) this.LLJILJIL.getValue()).setText(user.getNickname());
        TextView textView = (TextView) this.LLIZLLLIL.getValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('@');
        sbLIZ.append(user.getUniqueId());
        textView.setText(C2188811AlT.LIZIZ(sbLIZ));
        C1908030zkf.LJI(this.itemView.getContext(), user.getCustomVerify(), user.getEnterpriseVerifyReason(), (TextView) this.LLJILJIL.getValue());
    }

    @Override // X.InterfaceC723190SYj
    public final void Uo(FollowStatus followStatus) {
        int iIntValue;
        UserWithAweme userWithAweme = this.LLJJIJIL;
        if (userWithAweme == null || !TextUtils.equals(followStatus.getUserId(), userWithAweme.getUser().getUid())) {
            return;
        }
        userWithAweme.getUser().setFollowStatus(followStatus.getFollowStatus());
        C1440005kM.LIZ(new C0PSR(followStatus.getFollowStatus(), this.LLJJIJIL));
        int followStatus2 = followStatus.getFollowStatus();
        Integer followerStatus = followStatus.getFollowerStatus();
        if (followerStatus != null) {
            iIntValue = followerStatus.intValue();
        } else {
            iIntValue = -1;
        }
        W5(followStatus2, iIntValue);
        if (followStatus.getFollowStatus() == 0 && !TextUtils.isEmpty(userWithAweme.getUser().getRemarkName())) {
            userWithAweme.getUser().setRemarkName("");
            I5(userWithAweme.getUser());
        }
    }

    public final void V5(int i) {
        Integer numValueOf;
        int i2;
        User user;
        W5(i, -1);
        UserWithAweme userWithAweme = this.LLJJIJIL;
        if (userWithAweme != null && (user = userWithAweme.getUser()) != null) {
            numValueOf = Integer.valueOf(user.getFollowStatus());
        } else {
            numValueOf = null;
        }
        this.LLJJJ = numValueOf;
        UserWithAweme userWithAweme2 = this.LLJJIJIL;
        if (userWithAweme2 != null) {
            boolean z = true;
            if (userWithAweme2.getUser().getFollowStatus() == 0) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            C0SY1 c0sy1 = this.LLJJJIL;
            C0OVM c0ovm = new C0OVM();
            c0ovm.LIZJ(userWithAweme2.getUser().getUid());
            c0ovm.LIZIZ(userWithAweme2.getUser().getSecUid());
            if (!userWithAweme2.getUser().isSecret() && !userWithAweme2.getUser().isPrivateAccount()) {
                z = false;
            }
            C1252380ihA c1252380ihA = c0ovm.LIZ;
            c1252380ihA.LJIILIIL = z;
            c1252380ihA.LIZLLL = i2;
            c1252380ihA.LJI = "homepage_follow";
            c1252380ihA.LJ = 12;
            c0ovm.LIZ.LJIIJJI = userWithAweme2.getUser().getFollowerStatus();
            c0ovm.LIZ.LJIILLIIL = userWithAweme2.getUser().getAccurateRecType();
            c0sy1.LJ(c0ovm.LIZ());
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        UserWithAweme userWithAweme;
        int id = view.getId();
        if (id == R.id.e1g) {
            UserWithAweme userWithAweme2 = this.LLJJIJIL;
            if (userWithAweme2 != null) {
                C10LS c10ls = this.LLIZ;
                if (c10ls != null) {
                    ((C10LY) c10ls).LIZIZ(getAdapterPosition(), userWithAweme2.getUser());
                }
                InterfaceC19231510Lp interfaceC19231510Lp = this.LL;
                userWithAweme2.getUser();
                interfaceC19231510Lp.LIZIZ(getAdapterPosition());
                return;
            }
            return;
        }
        if (id != R.id.idt || (userWithAweme = this.LLJJIJIL) == null) {
            return;
        }
        if (this.LLIZ != null) {
            User user = userWithAweme.getUser();
            getAdapterPosition();
            if (user.getFollowStatus() == 0) {
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("to_user_id", user.getUid());
                c2344009Gk.LJIIIIZZ("enter_from", "homepage_follow");
                c2344009Gk.LJIIIIZZ("enter_type", "card");
                c2344009Gk.LJIIIIZZ("trigger_reason", "cold_launch");
                user.getRecommendReason();
                c2344009Gk.LJIIIIZZ("rec_reason", "super_account");
                C20684815ws.LJIILLIIL("follow", c2344009Gk.LIZ);
            } else {
                C2344009Gk c2344009Gk2 = new C2344009Gk();
                c2344009Gk2.LJIIIIZZ("to_user_id", user.getUid());
                c2344009Gk2.LJIIIIZZ("enter_from", "homepage_follow");
                c2344009Gk2.LJIIIIZZ("enter_type", "card");
                c2344009Gk2.LJIIIIZZ("trigger_reason", "cold_launch");
                user.getRecommendReason();
                c2344009Gk2.LJIIIIZZ("rec_reason", "super_account");
                C20684815ws.LJIILLIIL("follow_cancel", c2344009Gk2.LIZ);
            }
        }
        if (userWithAweme.getUser().getFollowStatus() == 0) {
            C19218810Gs.LIZIZ(getAdapterPosition(), userWithAweme.getUser(), "follow");
        }
        L5();
    }

    @Override // X.InterfaceC723190SYj
    public final void th(Exception exc) {
        User user;
        int iIntValue;
        int followStatus;
        C0O3Q.LIZ(C1388190mED.LIZ(this.itemView.getContext()), exc);
        UserWithAweme userWithAweme = this.LLJJIJIL;
        if (userWithAweme != null) {
            Integer num = this.LLJJJ;
            if (num != null) {
                followStatus = num.intValue();
            } else {
                followStatus = userWithAweme.getUser().getFollowStatus();
            }
            W5(followStatus, userWithAweme.getUser().getFollowerStatus());
        }
        UserWithAweme userWithAweme2 = this.LLJJIJIL;
        if (userWithAweme2 != null && (user = userWithAweme2.getUser()) != null) {
            Integer num2 = this.LLJJJ;
            if (num2 != null) {
                iIntValue = num2.intValue();
            } else {
                iIntValue = 0;
            }
            user.setFollowStatus(iIntValue);
        }
    }

    @Override // X.InterfaceC723190SYj
    public final void u41(Exception exc) {
        C723180SYi.LIZ(this, exc);
    }

    @Override // X.InterfaceC723190SYj
    public final void uc1(FollowStatus followStatus) {
        Integer numValueOf;
        if (followStatus != null) {
            numValueOf = Integer.valueOf(followStatus.getFollowStatus());
        } else {
            numValueOf = null;
        }
        this.LLJJJ = numValueOf;
    }

    public final void W5(int i, int i2) {
        int i3;
        C786410Ut5.LLIL(P5(), 0);
        Resources resources = this.itemView.getContext().getResources();
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 4) {
                        P5().setTextColor(C960203pA.LIZ(R.attr.ef, P5().getContext()));
                        P5().setBackground(N5());
                        P5().setText(this.itemView.getContext().getString(R.string.jqb));
                        return;
                    }
                    return;
                }
                i3 = R.string.hz7;
            } else {
                i3 = R.string.jqm;
            }
            P5().setText(i3);
            P5().setTextColor(C960203pA.LIZ(R.attr.ef, P5().getContext()));
            P5().setBackground(N5());
            return;
        }
        if (i2 == 1) {
            P5().setText(resources.getText(2131834735));
        } else {
            P5().setText(resources.getText(R.string.jp2));
        }
        TextView textViewP5 = P5();
        float fLIZIZ = C418440Gaw.LIZIZ(200);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.a04);
        c384050F3z.LIZJ = Float.valueOf(fLIZIZ);
        Drawable drawableLIZ = c384050F3z.LIZ(this.itemView.getContext());
        C384050F3z c384050F3z2 = new C384050F3z();
        c384050F3z2.LIZIZ = Integer.valueOf(R.attr.a05);
        c384050F3z2.LIZJ = Float.valueOf(fLIZIZ);
        Drawable drawableLIZ2 = c384050F3z2.LIZ(this.itemView.getContext());
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_pressed}, drawableLIZ2);
        stateListDrawable.addState(new int[0], drawableLIZ);
        textViewP5.setBackground(stateListDrawable);
        P5().setTextColor(C960203pA.LIZ(R.attr.ee, P5().getContext()));
    }

    @Override // X.InterfaceC19230410Le
    public final void H2(int i, View view, RecyclerView recyclerView) {
        if (getAdapterPosition() != i) {
            b6();
            return;
        }
        if (recyclerView == null || recyclerView.getVisibility() != 0) {
            return;
        }
        Fragment fragmentLIZ = C946803n0.LIZ(recyclerView);
        GalleryLayoutManager galleryLayoutManager = this.LLILZ;
        WeakReference<Activity> weakReference = galleryLayoutManager.LLJILJIL;
        if (weakReference != null && weakReference.get() != null) {
            if (!((IMainService) ServiceManager.get().getService(IMainService.class)).isOnFollowPage(galleryLayoutManager.LLJILJIL.get(), fragmentLIZ)) {
                return;
            }
        }
        a6();
    }

    /* JADX WARN: Type inference failed for: r0v20, types: [X.10Lk] */
    public ViewOnClickListenerC19230910Lj(View view, InterfaceC19231510Lp interfaceC19231510Lp, InterfaceC19231610Lq interfaceC19231610Lq, InterfaceC19231710Lr interfaceC19231710Lr, GalleryLayoutManager galleryLayoutManager) {
        super(view);
        this.LL = interfaceC19231510Lp;
        this.LLILLJJLI = interfaceC19231610Lq;
        this.LLILLL = interfaceC19231710Lr;
        this.LLILZ = galleryLayoutManager;
        this.LLILZIL = (int) C12ES.LIZJ(279.0f, view.getContext());
        this.LLILZLL = (int) C12ES.LIZJ(372.0f, view.getContext());
        this.LLIZLLLIL = C452501pT.LIZIZ(new AwS572S0100000_28(view, 876));
        this.LLJ = C452501pT.LIZIZ(new AwS572S0100000_28(view, 871));
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS572S0100000_28(view, 872));
        this.LLJI = c01gwLIZIZ;
        this.LLJIJIL = C452501pT.LIZIZ(new AwS572S0100000_28(view, 873));
        this.LLJILJIL = C452501pT.LIZIZ(new AwS572S0100000_28(view, 877));
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS572S0100000_28(view, 874));
        C01GW c01gwLIZIZ2 = C452501pT.LIZIZ(new AwS572S0100000_28(view, 875));
        this.LLJILLL = c01gwLIZIZ2;
        this.LLJJIII = new C586920N0g();
        C0SY1 c0sy1LJIIIIZZ = C1076010e6h.LIZJ.LJIIIIZZ();
        this.LLJJJIL = c0sy1LJIIIIZZ;
        this.LLJJJJ = new C583590Muj() { // from class: X.10Lk
            @Override // X.C583590Muj, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onPlayFailed(C1481290oeN c1481290oeN) {
                C786410Ut5.l(this.LL.R5(), 0);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onRenderFirstFrame(C1480420ocy c1480420ocy) {
                ViewOnClickListenerC19230910Lj viewOnClickListenerC19230910Lj = this.LL;
                viewOnClickListenerC19230910Lj.LLJJI = true;
                viewOnClickListenerC19230910Lj.T5();
                int adapterPosition = this.LL.getAdapterPosition();
                ViewOnClickListenerC19230910Lj viewOnClickListenerC19230910Lj2 = this.LL;
                if (adapterPosition != viewOnClickListenerC19230910Lj2.LLILZ.LLILZ) {
                    viewOnClickListenerC19230910Lj2.S5().pause();
                }
            }
        };
        view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: X.10Lh
            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewAttachedToWindow(View view2) {
                ViewOnClickListenerC19230910Lj viewOnClickListenerC19230910Lj = this.LL;
                viewOnClickListenerC19230910Lj.LLILZ.LLJILLL.add(viewOnClickListenerC19230910Lj);
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewDetachedFromWindow(View view2) {
                this.LL.b6();
                ViewOnClickListenerC19230910Lj viewOnClickListenerC19230910Lj = this.LL;
                viewOnClickListenerC19230910Lj.LLILZ.LLJILLL.remove(viewOnClickListenerC19230910Lj);
            }
        });
        this.LLJJ = new VideoViewComponent(0);
        S5().LJIILJJIL((C1473870oSP) c01gwLIZIZ2.getValue());
        S5().LLILLL.Dn(new InterfaceC1473950oSX() { // from class: X.10Ln
            @Override // X.InterfaceC1473950oSX
            public final void LIZ() {
            }

            @Override // X.InterfaceC1473950oSX
            public final /* synthetic */ void LLF(int i, int i2) {
            }

            @Override // X.InterfaceC1473950oSX
            public final /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            }

            @Override // X.InterfaceC1473950oSX
            public final void LLILLIZIL(int i, int i2) {
                ViewOnClickListenerC19230910Lj viewOnClickListenerC19230910Lj = this.LL;
                if (viewOnClickListenerC19230910Lj.LLJJIJI) {
                    viewOnClickListenerC19230910Lj.LLJJIJI = false;
                    viewOnClickListenerC19230910Lj.a6();
                }
            }
        });
        C786410Ut5.I7(new ACListenerS130S0200000_28(this, view, 50), view);
        view.setOnLongClickListener(new ViewOnLongClickListenerC19332710kH(this, 2));
        P5().setOnLongClickListener(new ViewOnLongClickListenerC19332710kH(this, 3));
        ((View) c01gwLIZIZ.getValue()).setOnLongClickListener(new ViewOnLongClickListenerC19332710kH(this, 4));
        C786410Ut5.T7(P5(), this);
        C786410Ut5.Q7((ImageView) c01gwLIZIZ.getValue(), this);
        c0sy1LJIIIIZZ.LJII(this);
        Context context = view.getContext();
        if (C19252910Tv.LIZIZ.LIZLLL().LJIIJ().isPad() != 1) {
            int iLJIIJ = (int) (C12ES.LJIIJ(context) * 0.712f);
            this.LLILZIL = iLJIIJ;
            this.LLILZLL = (int) (iLJIIJ * 1.34f);
        }
    }
}

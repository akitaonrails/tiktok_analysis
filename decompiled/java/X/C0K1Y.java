package X;

import Y.ACListenerS142S0100000_7;
import Y.ARunnableS106S0100000_6;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.api.SubInfo;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.subscription.pgc.api.bridge.SubscriptionSceneContext;
import com.ss.android.ugc.aweme.subscription.pgc.api.widget.PgcNextLiveData;
import com.ss.android.ugc.aweme.subscription.pgc.business.foundation.privilegepage.fragment.SubscriptionPrivilegeDetailFragment;
import com.ss.android.ugc.aweme.subscription.pgc.business.foundation.privilegepage.viewmodel.PrivilegeDetailViewModel;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.pgc_sub.PGCGetSubPrivilegeDetailResponse;

/* JADX INFO: renamed from: X.0K1Y, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0K1Y extends C0K1I<C510640K0w> {
    public final TuxTextView LLILLJJLI;
    public final TuxTextView LLILLL;
    public final TuxIconView LLILZ;
    public final C427660Gpo LLILZIL;
    public final ViewGroup LLILZLL;
    public final ViewGroup LLIZ;

    public C0K1Y(View view) {
        super(view);
        this.LLILLJJLI = (TuxTextView) view.findViewById(R.id.tv_title);
        this.LLILLL = (TuxTextView) view.findViewById(R.id.tv_subscribers);
        view.findViewById(R.id.cq7);
        this.LLILZ = (TuxIconView) view.findViewById(R.id.cto);
        this.LLILZIL = (C427660Gpo) view.findViewById(R.id.f7v);
        this.LLILZLL = (ViewGroup) view.findViewById(R.id.rsf);
        view.findViewById(R.id.f82);
        this.LLIZ = (ViewGroup) view.findViewById(R.id.kmd);
    }

    @Override // X.AbstractC339560DSw
    public final void I5(InterfaceC339570DSx interfaceC339570DSx) {
        long j;
        PrivilegeDetailViewModel privilegeDetailViewModelZS;
        PgcNextLiveData<Boolean> pgcNextLiveData;
        SubInfo subInfo;
        int i;
        int i2;
        User user;
        ImageModel avatarMedium;
        C510640K0w c510640K0w = (C510640K0w) interfaceC339570DSx;
        P5(c510640K0w);
        SubscriptionPrivilegeDetailFragment subscriptionPrivilegeDetailFragment = c510640K0w.LJ;
        if (subscriptionPrivilegeDetailFragment != null) {
            PGCGetSubPrivilegeDetailResponse.Data data = c510640K0w.LIZLLL;
            if (Intrinsics.LJFF(subscriptionPrivilegeDetailFragment.LLJIJIL, EnumC510620K0u.SUB_ONLY_VIDEO.getSource())) {
                TuxIconView tuxIconView = this.LLILZ;
                if (tuxIconView != null) {
                    C0K0R.LIZ(tuxIconView);
                }
            } else {
                TuxIconView tuxIconView2 = this.LLILZ;
                if (tuxIconView2 != null) {
                    C0K0R.LIZJ(tuxIconView2);
                }
            }
            TuxIconView tuxIconView3 = this.LLILZ;
            if (tuxIconView3 != null) {
                C786410Ut5.a9(tuxIconView3, new ACListenerS142S0100000_7(subscriptionPrivilegeDetailFragment, 247));
            }
            C0K1Z.LIZ.getClass();
            C511970K5z c511970K5z = new C511970K5z("livesdk_subscribe_faq_entrance_show");
            User user2 = null;
            C0K61.LIZ(c511970K5z, null);
            c511970K5z.LIZIZ("privilege_page", "show_entrance");
            c511970K5z.LIZLLL();
            SubscriptionSceneContext subscriptionSceneContext = subscriptionPrivilegeDetailFragment.LLJJI;
            if (subscriptionSceneContext != null && subscriptionSceneContext.LIZ() && Intrinsics.LJFF(subscriptionPrivilegeDetailFragment.LLILLJJLI, Boolean.TRUE)) {
                ViewGroup viewGroup = this.LLILZLL;
                if (viewGroup != null) {
                    C0K0R.LIZJ(viewGroup);
                }
                ViewGroup viewGroup2 = this.LLILZLL;
                if (viewGroup2 != null) {
                    viewGroup2.setBackground(C510570K0p.LIZ((int) C511520K4g.LIZ(8.0f), C426930God.LIZ(R.attr.fa6, this.itemView.getContext()), 0, (int) C511520K4g.LIZ(0.0f)));
                }
            }
            SubscriptionSceneContext subscriptionSceneContext2 = subscriptionPrivilegeDetailFragment.LLJJI;
            if (subscriptionSceneContext2 != null) {
                j = subscriptionSceneContext2.roomId;
            } else {
                j = 0;
            }
            if (C0K7G.LIZLLL() && j <= 0) {
                C427660Gpo c427660Gpo = this.LLILZIL;
                if (c427660Gpo != null) {
                    C0K0R.LIZJ(c427660Gpo);
                }
                if (data != null && (user = data.anchorDetail) != null && (avatarMedium = user.getAvatarMedium()) != null) {
                    C511420K3w.LJIIJ.getClass();
                    C511420K3w c511420K3w = new C511420K3w();
                    c511420K3w.LIZ = avatarMedium;
                    c511420K3w.LJ = Boolean.TRUE;
                    c511420K3w.LIZ(this.LLILZIL);
                }
            }
            TuxTextView tuxTextView = this.LLILLJJLI;
            if (tuxTextView != null) {
                String str = c510640K0w.LJIIIIZZ;
                if (str != null && str.length() != 0) {
                    i2 = 2131839738;
                } else {
                    i2 = 2131839357;
                }
                Object[] objArr = new Object[1];
                if (data != null) {
                    user2 = data.anchorDetail;
                }
                objArr[0] = C0K7S.LIZ(user2);
                tuxTextView.setText(C511520K4g.LJIIIIZZ(i2, objArr));
            }
            if (data != null && (i = data.subscriberCount) >= 5) {
                C786410Ut5.LLLLZLL(this.LLILLL, 0);
                this.LLILLL.setText(C511520K4g.LJIIIIZZ(2131839739, Integer.valueOf(i)));
            } else {
                C786410Ut5.LLLLZLL(this.LLILLL, 8);
            }
            if (subscriptionPrivilegeDetailFragment.LLILZ == EnumC510710K1d.FULL_PAGE) {
                TuxIconView tuxIconView4 = this.LLILZ;
                if (tuxIconView4 != null) {
                    C0K0R.LIZ(tuxIconView4);
                }
                if (((data != null && (subInfo = data.subInfo) != null && Intrinsics.LJFF(subInfo.isSubscribing, Boolean.TRUE)) || ((privilegeDetailViewModelZS = subscriptionPrivilegeDetailFragment.zS()) != null && (pgcNextLiveData = privilegeDetailViewModelZS.LLJJIJIIJIL) != null && Intrinsics.LJFF(pgcNextLiveData.getValue(), Boolean.TRUE))) && !Intrinsics.LJFF(subscriptionPrivilegeDetailFragment.LLILLJJLI, Boolean.TRUE)) {
                    TuxTextView tuxTextView2 = this.LLILLJJLI;
                    if (tuxTextView2 != null) {
                        tuxTextView2.setText(C511520K4g.LJII(2131839507));
                    }
                    C0K0R.LIZ(this.LLILLL);
                }
            } else {
                View view = this.itemView;
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.topMargin = (int) C511520K4g.LIZ(16.0f);
                    C786410Ut5.W5(view, marginLayoutParams);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
            }
            ViewGroup viewGroup3 = this.LLIZ;
            if (viewGroup3 != null) {
                HandlerHook.viewPost(viewGroup3, new ARunnableS106S0100000_6(this, 215));
            }
        }
    }

    @Override // X.C0K1I
    public final Map N5(C510480K0g c510480K0g) {
        return C2097608Jq.LJ();
    }
}

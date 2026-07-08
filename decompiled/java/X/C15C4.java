package X;

import Y.ACListenerS133S0200000_31;
import Y.AfS200S0100000_31;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.multilive.model.GetShowRankResponse;
import com.bytedance.android.livesdk.event.UserProfileEvent;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: X.15C4, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15C4 extends C0J8P<GetShowRankResponse.ShowRankUser, C15C6> {
    public final Context LIZIZ;
    public final C11NJ LIZJ = new C11NJ();

    public C15C4(Context context) {
        this.LIZIZ = context;
    }

    @Override // X.C0J8P
    public final void LJI(RecyclerView.ViewHolder viewHolder) {
        this.LIZJ.LJ();
    }

    public final void LJIIIIZZ(GetShowRankResponse.ShowRankUser showRankUser) {
        C930480aJy c930480aJy = C930480aJy.LIZ;
        Context context = this.LIZIZ;
        C11NJ c11nj = this.LIZJ;
        c930480aJy.getClass();
        if (!C930480aJy.LJ("openUserProfile", context, c11nj)) {
            return;
        }
        UserProfileEvent userProfileEvent = new UserProfileEvent(showRankUser.userId, "live_show_guest");
        User.EnigmaInfo enigmaInfo = showRankUser.enigmaInfo;
        if (enigmaInfo != null) {
            userProfileEvent.setEnigmaOutside(enigmaInfo.isEnigmaMaskOn);
        }
        userProfileEvent.mReportType = "report_user";
        userProfileEvent.mSource = "guest_connection";
        userProfileEvent.mClickUserPosition = "profile_card";
        userProfileEvent.cardEnterFrom = "guest_ranking";
        userProfileEvent.enigmaEnterFrom = "active_user_rank";
        C784440Upu.LIZ().LIZIZ(userProfileEvent);
    }

    @Override // X.C0J8P
    public final void LIZJ(RecyclerView.ViewHolder viewHolder, GetShowRankResponse.ShowRankUser showRankUser) {
        List<String> listLIZ;
        int i;
        User.EnigmaInfo enigmaInfo;
        C15C6 c15c6 = (C15C6) viewHolder;
        GetShowRankResponse.ShowRankUser showRankUser2 = showRankUser;
        ((TextView) c15c6.LL.getValue()).setText(String.valueOf(showRankUser2.order));
        final boolean z = false;
        C786410Ut5.LLJJJJLIIL((C20743416Fc) c15c6.LL.getValue(), 0);
        C500260Jjc.LJLJLJ((View) c15c6.LLILLL.getValue(), false);
        C0JBN c0jbnLIZ = C1819620xS4.LIZ();
        ImageModel imageModel = showRankUser2.avatarThumb;
        if (imageModel != null) {
            listLIZ = C842240X2g.LIZ(imageModel);
        } else {
            listLIZ = null;
        }
        C1324610kZf c1324610kZfLIZJ = c0jbnLIZ.LIZJ(listLIZ);
        c1324610kZfLIZJ.LJIILIIL = Boolean.TRUE;
        c1324610kZfLIZJ.LJIIIZ = R.drawable.el_;
        c1324610kZfLIZJ.LJJI((View) c15c6.LLILLJJLI.getValue());
        C786410Ut5.Q7((ImageView) c15c6.LLILLJJLI.getValue(), new ACListenerS133S0200000_31(this, showRankUser2, 29));
        C1324720kZq c1324720kZq = (C1324720kZq) c15c6.LLILZLL.getValue();
        long j = showRankUser2.followStatus;
        if (j != 2 && j != 1 && ((enigmaInfo = showRankUser2.enigmaInfo) == null || !enigmaInfo.isEnigmaMaskOn)) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LLJJIII(c1324720kZq, i);
        C786410Ut5.e8(c1324720kZq, new ViewOnClickListenerC511801z2(showRankUser2, this, 16));
        C1320810kTX c1320810kTXLIZJ = C1322200kVm.LIZJ();
        c1320810kTXLIZJ.LJII(C1143780fs0.LJIIJ(C0IPN.LIZ("tiktok_live_interaction_resource", "tiktok_live_interaction_demand_1"), "ttlive_rank_follow_anim.webp"));
        c1320810kTXLIZJ.LJIIIIZZ = new C16I0(c15c6, 2);
        c1324720kZq.setController(c1320810kTXLIZJ.LIZ());
        ((TextView) c15c6.LLILZ.getValue()).setText(showRankUser2.nickname);
        C786410Ut5.n8((C20743416Fc) c15c6.LLILZ.getValue(), new ACListenerS133S0200000_31(this, showRankUser2, 28));
        if (showRankUser2.score >= 0) {
            ((TextView) c15c6.LLILZIL.getValue()).setText(C1850730yGF.LJFF(showRankUser2.score).toUpperCase(Locale.ROOT));
        } else {
            ((TextView) c15c6.LLILZIL.getValue()).setText("");
        }
        WeakReference weakReference = new WeakReference(c15c6);
        final long j2 = showRankUser2.userId;
        long j3 = showRankUser2.followStatus;
        if (j3 == 2 || j3 == 1) {
            z = true;
        }
        C19487311Lz.LIZ(new C11IW(C784440Upu.LIZ().LJ(C257100z3.class).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJIL(new InterfaceC19483011Ki() { // from class: X.0IzH
            @Override // X.InterfaceC19483011Ki
            public final boolean test(Object obj) {
                if (((C257100z3) obj).LIZ != null) {
                    return true;
                }
                return false;
            }
        }).LJJIL(new InterfaceC19483011Ki() { // from class: X.0IzM
            @Override // X.InterfaceC19483011Ki
            public final boolean test(Object obj) {
                if (((C257100z3) obj).LIZ.LIZ == j2) {
                    return true;
                }
                return false;
            }
        }).LJJIL(new InterfaceC19483011Ki() { // from class: X.0IzJ
            @Override // X.InterfaceC19483011Ki
            public final boolean test(Object obj) {
                if (((C257100z3) obj).LIZ.LIZIZ() != z) {
                    return true;
                }
                return false;
            }
        }).LJJIJIIJIL(new AfS200S0100000_31(weakReference, 40)).LJJIJIIJI(new C09JN() { // from class: X.00S2
            @Override // X.C09JN
            public final void accept(Object obj) {
                String message;
                String message2;
                C1C7U.LIZ("LiveShowRankListUserViewBinder@16cb.initFollowObserver$5");
                Throwable th = (Throwable) obj;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("throwable occurs: ");
                if (th != null) {
                    message = th.getMessage();
                } else {
                    message = null;
                }
                sbLIZ.append(message);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                if (th != null) {
                    message2 = th.getMessage();
                } else {
                    message2 = null;
                }
                C1AZW.LJFF("RankListUserViewBinder", strLIZIZ, message2, null);
                C1C7U.LIZIZ("LiveShowRankListUserViewBinder@16cb.initFollowObserver$5");
            }
        })).LJIILL(), this.LIZJ, null, null, 30);
    }

    @Override // X.C0J8P
    /* JADX INFO: renamed from: LJ */
    public final RecyclerView.ViewHolder LJIIJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return new C15C6(viewGroup);
    }
}

package X;

import Y.ACListenerS114S0200000_10;
import Y.AfS179S0100000_10;
import Y.AfS31S0210000_10;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.discover.model.SearchUser;
import com.ss.android.ugc.aweme.discover.model.SubscribeLiveStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.liveevent.ILiveEventOuterService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import webcast.api.room.NextLiveNoticeRegisterResponse;

/* JADX INFO: renamed from: X.0Q2G, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0Q2G implements InterfaceC1141530foN {
    public final ViewStub LL;
    public LinearLayout LLILLJJLI;
    public TuxTextView LLILLL;
    public TuxTextView LLILZ;
    public final C01GW LLILZIL = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(606));
    public volatile boolean LLILZLL;
    public SearchUser LLIZ;
    public C653660PkS LLIZLLLIL;
    public SubscribeLiveStruct LLJ;
    public boolean LLJI;
    public boolean LLJIJIL;
    public C11JF LLJILJIL;
    public boolean LLJILJILJ;

    public final boolean LIZ() {
        C653660PkS c653660PkS = this.LLIZLLLIL;
        boolean zEquals = TextUtils.equals(c653660PkS != null ? c653660PkS.LJIIIIZZ : null, "general_search");
        SubscribeLiveStruct subscribeLiveStruct = this.LLJ;
        if (subscribeLiveStruct == null || !zEquals) {
            return false;
        }
        String eventId = subscribeLiveStruct.getEventId();
        return ((eventId == null || a0.LJJJIL(eventId)) && subscribeLiveStruct.getHasSubscribedNextLive() == 0) ? false : true;
    }

    public final Map<String, String> LIZIZ() {
        String uid;
        User user;
        User user2;
        C2344009Gk c2344009Gk = new C2344009Gk();
        SearchUser searchUser = this.LLIZ;
        if (searchUser == null || (user2 = searchUser.user) == null || (uid = user2.getUid()) == null) {
            uid = "";
        }
        c2344009Gk.LJIIIIZZ("anchor_id", uid);
        SearchUser searchUser2 = this.LLIZ;
        c2344009Gk.LJ((searchUser2 == null || (user = searchUser2.user) == null) ? null : Integer.valueOf(user.getFollowStatus()), "follow_status");
        C653660PkS c653660PkS = this.LLIZLLLIL;
        c2344009Gk.LJIIIIZZ("search_id", c653660PkS != null ? c653660PkS.LJIIJ : null);
        C653660PkS c653660PkS2 = this.LLIZLLLIL;
        c2344009Gk.LJIIIIZZ("search_keyword", c653660PkS2 != null ? c653660PkS2.LJFF : null);
        c2344009Gk.LJIIIIZZ("search_page", "general_search");
        c2344009Gk.LJIIIIZZ("show_page", "search_result");
        SubscribeLiveStruct subscribeLiveStruct = this.LLJ;
        c2344009Gk.LJIIIIZZ("live_event_time", subscribeLiveStruct != null ? subscribeLiveStruct.getStartTime() : null);
        return c2344009Gk.LIZ;
    }

    public final void LIZJ() {
        if (this.LLILLJJLI != null) {
            return;
        }
        View viewLJLLLL = C786410Ut5.LJLLLL(this.LL);
        LinearLayout linearLayout = viewLJLLLL instanceof LinearLayout ? (LinearLayout) viewLJLLLL : null;
        this.LLILLJJLI = linearLayout;
        if (this.LLILLL == null) {
            this.LLILLL = linearLayout != null ? (TuxTextView) linearLayout.findViewById(R.id.zkx) : null;
        }
        if (this.LLILZ == null) {
            LinearLayout linearLayout2 = this.LLILLJJLI;
            this.LLILZ = linearLayout2 != null ? (TuxTextView) linearLayout2.findViewById(R.id.cq4) : null;
        }
    }

    public C0Q2G(ViewStub viewStub) {
        this.LL = viewStub;
    }

    public final void LIZLLL(String str) {
        HashMap map = (HashMap) LIZIZ();
        map.put("click_status", str);
        C20684815ws.LJIILLIIL("livesdk_notify_button_click", map);
    }

    public final void LJ(String str) {
        if (this.LLJILJILJ) {
            return;
        }
        this.LLJILJILJ = true;
        HashMap map = (HashMap) LIZIZ();
        map.put("notify_status", str);
        C20684815ws.LJIILLIIL("livesdk_notify_button_show", map);
    }

    public final void LJI(SubscribeLiveStruct subscribeLiveStruct) {
        Context context;
        LinearLayout linearLayout = this.LLILLJJLI;
        if (linearLayout != null && (context = linearLayout.getContext()) != null) {
            ((ILiveEventOuterService) this.LLILZIL.getValue()).openLiveEventSparkContainer(context, subscribeLiveStruct.getEventId(), "search");
        }
    }

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        InterfaceC1107590evd interfaceC1107590evd;
        InterfaceC1107590evd interfaceC1107590evdLJ;
        if (!Intrinsics.LJFF(c262100zr.LIZ, "live_event_update_result") || (interfaceC1107590evd = c262100zr.LIZIZ) == null || (interfaceC1107590evdLJ = C1871910yoP.LJ(interfaceC1107590evd, "live_event")) == null) {
            return;
        }
        String strLJFF = C1871910yoP.LJFF(interfaceC1107590evdLJ, FollowStatusChangeMethod.PARAM_UID, "");
        boolean zLIZIZ = C1871910yoP.LIZIZ(interfaceC1107590evdLJ, "has_subscribed", false);
        SubscribeLiveStruct subscribeLiveStruct = this.LLJ;
        if (subscribeLiveStruct != null && Intrinsics.LJFF(subscribeLiveStruct.getEventId(), strLJFF) && subscribeLiveStruct.getHasSubscribed() != zLIZIZ) {
            subscribeLiveStruct.setHasSubscribed(zLIZIZ);
            LJIIIIZZ(subscribeLiveStruct, false);
        }
    }

    public final void LJFF(SubscribeLiveStruct subscribeLiveStruct, boolean z) {
        User user;
        String uid;
        Long lLJIILIIL;
        InterfaceC420801kM interfaceC420801kMLJJLL;
        SearchUser searchUser = this.LLIZ;
        if (searchUser != null && (user = searchUser.user) != null && (uid = user.getUid()) != null && (lLJIILIIL = C2095008Iq.LJIILIIL(uid)) != null) {
            long jLongValue = lLJIILIIL.longValue();
            if (this.LLILZLL) {
                return;
            }
            this.LLILZLL = true;
            C11JF c11jf = this.LLJILJIL;
            if (c11jf != null) {
                c11jf.dispose();
            }
            C11NZ<NextLiveNoticeRegisterResponse> c11nzRegisterNextLiveNotice = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).k4().registerNextLiveNotice(false, jLongValue, z);
            if (c11nzRegisterNextLiveNotice != null) {
                interfaceC420801kMLJJLL = c11nzRegisterNextLiveNotice.LJJLL(new AfS31S0210000_10(subscribeLiveStruct, z, this, 1), new AfS179S0100000_10(this, 14));
            } else {
                interfaceC420801kMLJJLL = null;
            }
            this.LLJILJIL = (C11JF) interfaceC420801kMLJJLL;
        }
    }

    public final void LJII(SubscribeLiveStruct subscribeLiveStruct, boolean z) {
        String str;
        int hasSubscribedNextLive = subscribeLiveStruct.getHasSubscribedNextLive();
        if (hasSubscribedNextLive != 1) {
            if (hasSubscribedNextLive != 2) {
                C12ES.LJIILL(8, this.LLILLJJLI);
                return;
            }
            TuxTextView tuxTextView = this.LLILZ;
            if (tuxTextView != null) {
                tuxTextView.setTextColorRes(R.attr.wf);
            }
            TuxTextView tuxTextView2 = this.LLILZ;
            if (tuxTextView2 != null) {
                tuxTextView2.setText(2131854994);
            }
            TuxTextView tuxTextView3 = this.LLILZ;
            if (tuxTextView3 != null) {
                C786410Ut5.h9(tuxTextView3, new ACListenerS114S0200000_10(subscribeLiveStruct, this, 26));
            }
            C12ES.LJIILL(0, this.LLILLJJLI);
            str = "not_notify";
        } else {
            TuxTextView tuxTextView4 = this.LLILZ;
            if (tuxTextView4 != null) {
                tuxTextView4.setTextColorRes(R.attr.a1j);
            }
            TuxTextView tuxTextView5 = this.LLILZ;
            if (tuxTextView5 != null) {
                tuxTextView5.setText(2131854994);
            }
            TuxTextView tuxTextView6 = this.LLILZ;
            if (tuxTextView6 != null) {
                C786410Ut5.h9(tuxTextView6, new ACListenerS114S0200000_10(subscribeLiveStruct, this, 27));
            }
            C12ES.LJIILL(0, this.LLILLJJLI);
            str = "notifying";
        }
        if (z) {
            return;
        }
        this.LLJILJILJ = false;
        LJ(str);
    }

    public final void LJIIIIZZ(SubscribeLiveStruct subscribeLiveStruct, boolean z) {
        String str;
        if (subscribeLiveStruct.getHasSubscribed()) {
            TuxTextView tuxTextView = this.LLILZ;
            if (tuxTextView != null) {
                tuxTextView.setTextColorRes(R.attr.a1j);
            }
            TuxTextView tuxTextView2 = this.LLILZ;
            if (tuxTextView2 != null) {
                tuxTextView2.setText(2131834277);
            }
            TuxTextView tuxTextView3 = this.LLILZ;
            if (tuxTextView3 != null) {
                C786410Ut5.h9(tuxTextView3, new ACListenerS114S0200000_10(subscribeLiveStruct, this, 28));
            }
        } else {
            TuxTextView tuxTextView4 = this.LLILZ;
            if (tuxTextView4 != null) {
                tuxTextView4.setTextColorRes(R.attr.wf);
            }
            TuxTextView tuxTextView5 = this.LLILZ;
            if (tuxTextView5 != null) {
                tuxTextView5.setText(2131834276);
            }
            TuxTextView tuxTextView6 = this.LLILZ;
            if (tuxTextView6 != null) {
                C786410Ut5.h9(tuxTextView6, new ACListenerS114S0200000_10(subscribeLiveStruct, this, 29));
            }
        }
        C12ES.LJIILL(0, this.LLILLJJLI);
        if (!z) {
            this.LLJILJILJ = false;
            if (subscribeLiveStruct.getHasSubscribed()) {
                str = "registered";
            } else {
                str = "register";
            }
            LJ(str);
        }
    }
}

package X;

import Y.ACListenerS162S0100000_28;
import Y.AObserverS230S0100000_28;
import android.app.Activity;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.homepage.api.data.InboxFollowGuideViewModel;
import com.ss.android.ugc.aweme.inbox.response.InboxLiveNotice;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.notification.banner.vh.SkylightLiveGuideBannerItem;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0zde, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1903680zde extends RecyclerView.ViewHolder implements C0Z37<SkylightLiveGuideBannerItem>, InterfaceC1508640pMU {
    public final View LL;
    public final Fragment LLILLJJLI;
    public final TuxTextView LLILLL;
    public final C424620Gku LLILZ;
    public final C424620Gku LLILZIL;
    public final C424620Gku LLILZLL;
    public final C367310Eaf LLIZ;
    public final C367310Eaf LLIZLLLIL;
    public final C367310Eaf LLJ;
    public List<InboxLiveNotice> LLJI;
    public List<InboxLiveNotice> LLJIJIL;
    public final InboxFollowGuideViewModel LLJILJIL;
    public boolean LLJILJILJ;
    public SkylightLiveGuideBannerItem LLJILLL;
    public final C19335110kf LLJJ;

    @Override // X.InterfaceC1508640pMU
    public final String T() {
        return "SkylightLiveGuideVH";
    }

    public static final void N5() {
        String currentUserID = ((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUserID();
        C0J9A c0j9aV3 = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).v3();
        HashSet<String> hashSetLIZLLL = c0j9aV3.LIZLLL();
        hashSetLIZLLL.add(currentUserID);
        c0j9aV3.LJJ(hashSetLIZLLL);
    }

    public final void L5() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SkylightLiveGuideVH#reportShow anchor_num = ");
        List<InboxLiveNotice> list = this.LLJIJIL;
        sbLIZ.append(list != null ? Integer.valueOf(list.size()) : null);
        C2188811AlT.LIZIZ(sbLIZ);
        int i = C1720306oT.LIZ;
        List<InboxLiveNotice> list2 = this.LLJIJIL;
        C20684815ws.LJIILLIIL("livesdk_inbox_notice_board_show", C2097908Jt.LIZJ(new Pair("anchor_num", String.valueOf(list2 != null ? Integer.valueOf(list2.size()) : null))));
    }

    public final void I5(String str) {
        Integer numValueOf;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SkylightLiveGuideVH#reportClick anchor_num = ");
        List<InboxLiveNotice> list = this.LLJIJIL;
        Integer numValueOf2 = null;
        if (list != null) {
            numValueOf = Integer.valueOf(list.size());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append(", click_module = ");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        int i = C1720306oT.LIZ;
        Pair[] pairArr = new Pair[2];
        List<InboxLiveNotice> list2 = this.LLJIJIL;
        if (list2 != null) {
            numValueOf2 = Integer.valueOf(list2.size());
        }
        pairArr[0] = new Pair("anchor_num", String.valueOf(numValueOf2));
        pairArr[1] = new Pair("click_module", str);
        C20684815ws.LJIILLIIL("livesdk_inbox_notice_board_click", C2097608Jq.LJIIIIZZ(pairArr));
    }

    public C1903680zde(View view, Fragment fragment) {
        MutableLiveData<Boolean> mutableLiveData;
        super(view);
        this.LL = view;
        this.LLILLJJLI = fragment;
        RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(R.id.jc0);
        TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.k5b);
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.nx2);
        TuxTextView tuxTextView2 = (TuxTextView) view.findViewById(R.id.p_o);
        this.LLILLL = tuxTextView2;
        this.LLILZ = (C424620Gku) view.findViewById(R.id.user_avatar_1);
        this.LLILZIL = (C424620Gku) view.findViewById(R.id.user_avatar_2);
        this.LLILZLL = (C424620Gku) view.findViewById(R.id.user_avatar_3);
        this.LLIZ = (C367310Eaf) view.findViewById(R.id.user_avatar_ring_1);
        this.LLIZLLLIL = (C367310Eaf) view.findViewById(R.id.user_avatar_ring_2);
        this.LLJ = (C367310Eaf) view.findViewById(R.id.user_avatar_ring_3);
        this.LLJJ = new C19335110kf(this, 0);
        C19EG c19egLIZ = C724240Sb0.LIZ(fragment);
        if (c19egLIZ != null) {
            InboxFollowGuideViewModel inboxFollowGuideViewModelLIZ = C1572250r15.LIZ(c19egLIZ);
            this.LLJILJIL = inboxFollowGuideViewModelLIZ;
            if (inboxFollowGuideViewModelLIZ != null && (mutableLiveData = inboxFollowGuideViewModelLIZ.LLILLJJLI) != null) {
                mutableLiveData.observe(this.LLILLJJLI, new AObserverS230S0100000_28(this, 77));
            }
        }
        C786410Ut5.a9(tuxIconView, new ACListenerS162S0100000_28(this, 135));
        ACListenerS162S0100000_28 aCListenerS162S0100000_28 = new ACListenerS162S0100000_28(this, 136);
        C786410Ut5.S7(relativeLayout, aCListenerS162S0100000_28);
        C786410Ut5.h9(tuxTextView, aCListenerS162S0100000_28);
        C786410Ut5.h9(tuxTextView2, aCListenerS162S0100000_28);
        C1618770sE7.LJIIJ(view, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List, java.util.List<com.ss.android.ugc.aweme.inbox.response.InboxLiveNotice>] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List<com.ss.android.ugc.aweme.inbox.response.InboxLiveNotice>] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.ArrayList] */
    @Override // X.C0Z37
    public final void LJZI(int i, InterfaceC1891350zJl interfaceC1891350zJl) {
        ?? arrayList;
        int iIntValue;
        User user;
        User user2;
        User user3;
        Integer numLIZJ;
        Integer numLIZJ2;
        SkylightLiveGuideBannerItem skylightLiveGuideBannerItem = (SkylightLiveGuideBannerItem) interfaceC1891350zJl;
        this.LLJIJIL = skylightLiveGuideBannerItem.liveNotices;
        this.LLJILLL = skylightLiveGuideBannerItem;
        if (C296730Bk7.LIZ() == 2) {
            if (C295060BhQ.LIZ()) {
                List<InboxLiveNotice> list = skylightLiveGuideBannerItem.liveNotices;
                arrayList = new ArrayList();
                for (InboxLiveNotice inboxLiveNotice : list) {
                    User user4 = inboxLiveNotice.user;
                    if (user4 == null || user4.getFollowStatus() != 0) {
                        arrayList.add(inboxLiveNotice);
                    }
                }
            } else {
                arrayList = skylightLiveGuideBannerItem.liveNotices;
            }
        } else {
            List<InboxLiveNotice> list2 = skylightLiveGuideBannerItem.liveNotices;
            arrayList = new ArrayList();
            for (InboxLiveNotice inboxLiveNotice2 : list2) {
                InboxLiveNotice inboxLiveNotice3 = inboxLiveNotice2;
                if (C295060BhQ.LIZ()) {
                    User user5 = inboxLiveNotice3.user;
                    if (user5 != null && user5.getFollowStatus() == 1) {
                        arrayList.add(inboxLiveNotice2);
                    }
                } else {
                    User user6 = inboxLiveNotice3.user;
                    if (user6 == null || user6.getFollowStatus() != 2) {
                        arrayList.add(inboxLiveNotice2);
                    }
                }
            }
        }
        this.LLJI = arrayList;
        C786410Ut5.LLLLZLL(this.LLILLL, 8);
        C786410Ut5.k(this.LLILZ, 8);
        C786410Ut5.k(this.LLILZIL, 8);
        C786410Ut5.k(this.LLILZLL, 8);
        C786410Ut5.X(this.LLIZ, 8);
        C786410Ut5.X(this.LLIZLLLIL, 8);
        C786410Ut5.X(this.LLJ, 8);
        if (arrayList.isEmpty()) {
            C786410Ut5.LLLLZLL(this.LLILLL, 0);
        }
        Activity activityLIZ = C1388190mED.LIZ(this.LL.getContext());
        int iIntValue2 = -1;
        if (activityLIZ != null && (numLIZJ2 = C1308910kAL.LIZJ(R.attr.nn, activityLIZ)) != null) {
            iIntValue = numLIZJ2.intValue();
        } else {
            iIntValue = -1;
        }
        Activity activityLIZ2 = C1388190mED.LIZ(this.LL.getContext());
        if (activityLIZ2 != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.nm, activityLIZ2)) != null) {
            iIntValue2 = numLIZJ.intValue();
        }
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 100.0f, 100.0f, iIntValue, iIntValue2, Shader.TileMode.MIRROR);
        if ((!arrayList.isEmpty()) && (user3 = ((InboxLiveNotice) ListProtector.get(arrayList, 0)).user) != null) {
            P5(linearGradient, this.LLILZ, this.LLIZ, user3);
        }
        if (arrayList.size() > 1 && (user2 = ((InboxLiveNotice) ListProtector.get(arrayList, 1)).user) != null) {
            P5(linearGradient, this.LLILZIL, this.LLIZLLLIL, user2);
        }
        if (arrayList.size() > 2 && (user = ((InboxLiveNotice) ListProtector.get(arrayList, 2)).user) != null) {
            P5(linearGradient, this.LLILZLL, this.LLJ, user);
        }
        L5();
    }

    public final void P5(LinearGradient linearGradient, C424620Gku c424620Gku, C367310Eaf c367310Eaf, User user) {
        int iIntValue;
        Integer numLIZJ;
        C786410Ut5.k(c424620Gku, 0);
        C786410Ut5.X(c367310Eaf, 0);
        c367310Eaf.LL.add(new Pair<>(linearGradient, 0));
        Activity activityLIZ = C1388190mED.LIZ(this.LL.getContext());
        if (activityLIZ != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.bx, activityLIZ)) != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = -1;
        }
        c367310Eaf.LIZ(iIntValue, 1);
        C1324840ka2.LJFF(c424620Gku, user.getAvatarThumb());
    }
}

package X;

import Y.ACListenerS130S0200000_28;
import Y.ACListenerS162S0100000_28;
import Y.AObserverS230S0100000_28;
import android.app.Activity;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.homepage.api.data.InboxFollowGuideViewModel;
import com.ss.android.ugc.aweme.inbox.response.InboxLiveNotice;
import com.ss.android.ugc.aweme.inbox.widget.multi.SkylightLiveGuidePod;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0zdd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1903670zdd extends AbstractC1903430zdF<SkylightLiveGuidePod> implements C0Z37<SkylightLiveGuidePod>, InterfaceC1508640pMU {
    public final View LLJ;
    public final TuxTextView LLJI;
    public final C424620Gku LLJIJIL;
    public final C424620Gku LLJILJIL;
    public final C424620Gku LLJILJILJ;
    public final C367310Eaf LLJILLL;
    public final C367310Eaf LLJJ;
    public final C367310Eaf LLJJI;
    public List<InboxLiveNotice> LLJJIII;
    public List<InboxLiveNotice> LLJJIJI;
    public final InboxFollowGuideViewModel LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public final C19335110kf LLJJJ;

    @Override // X.InterfaceC1508640pMU
    public final String T() {
        return "SkylightLiveGuideVH";
    }

    public static final void V5() {
        String currentUserID = ((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUserID();
        C0J9A c0j9aV3 = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).v3();
        HashSet<String> hashSetLIZLLL = c0j9aV3.LIZLLL();
        hashSetLIZLLL.add(currentUserID);
        c0j9aV3.LJJ(hashSetLIZLLL);
    }

    public final void U5() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SkylightLiveGuideVH#reportShow anchor_num = ");
        List<InboxLiveNotice> list = this.LLJJIJI;
        sbLIZ.append(list != null ? Integer.valueOf(list.size()) : null);
        C2188811AlT.LIZIZ(sbLIZ);
        int i = C1720306oT.LIZ;
        List<InboxLiveNotice> list2 = this.LLJJIJI;
        C20684815ws.LJIILLIIL("livesdk_inbox_notice_board_show", C2097908Jt.LIZJ(new Pair("anchor_num", String.valueOf(list2 != null ? Integer.valueOf(list2.size()) : null))));
    }

    @Override // X.AbstractC1903430zdF, X.C0Z32
    public final void onAttach() {
        C19EG c19eg;
        MainActivityScope mainActivityScopeLIZJ;
        HomeTabAbility homeTabAbilityLIZ;
        MutableLiveData<Boolean> mutableLiveData;
        super.onAttach();
        InboxFollowGuideViewModel inboxFollowGuideViewModel = this.LLJJIJIIJIL;
        if (inboxFollowGuideViewModel != null && (mutableLiveData = inboxFollowGuideViewModel.LL) != null) {
            mutableLiveData.setValue(Boolean.TRUE);
        }
        Activity activityL5 = L5();
        if (!(activityL5 instanceof C19EG) || (c19eg = (C19EG) activityL5) == null || (mainActivityScopeLIZJ = C0S4U.LIZJ(c19eg)) == null || (homeTabAbilityLIZ = C0DMM.LIZ(mainActivityScopeLIZJ)) == null) {
            return;
        }
        homeTabAbilityLIZ.UC1(this.LLJJJ);
    }

    @Override // X.AbstractC1903430zdF, X.C0Z32
    public final void onDetach() {
        C19EG c19eg;
        MainActivityScope mainActivityScopeLIZJ;
        HomeTabAbility homeTabAbilityLIZ;
        super.onDetach();
        Activity activityL5 = L5();
        if (!(activityL5 instanceof C19EG) || (c19eg = (C19EG) activityL5) == null || (mainActivityScopeLIZJ = C0S4U.LIZJ(c19eg)) == null || (homeTabAbilityLIZ = C0DMM.LIZ(mainActivityScopeLIZJ)) == null) {
            return;
        }
        homeTabAbilityLIZ.Ik0(this.LLJJJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List, java.util.List<com.ss.android.ugc.aweme.inbox.response.InboxLiveNotice>] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List<com.ss.android.ugc.aweme.inbox.response.InboxLiveNotice>] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.ArrayList] */
    @Override // X.AbstractC1903430zdF
    public final void R5(AbstractC895380ZAq abstractC895380ZAq) {
        ?? arrayList;
        int iIntValue;
        User user;
        User user2;
        User user3;
        Integer numLIZJ;
        Integer numLIZJ2;
        SkylightLiveGuidePod skylightLiveGuidePod = (SkylightLiveGuidePod) abstractC895380ZAq;
        this.LLJJIJI = skylightLiveGuidePod.liveNotices;
        if (C296730Bk7.LIZ() == 2) {
            if (C295060BhQ.LIZ()) {
                List<InboxLiveNotice> list = skylightLiveGuidePod.liveNotices;
                arrayList = new ArrayList();
                for (InboxLiveNotice inboxLiveNotice : list) {
                    User user4 = inboxLiveNotice.user;
                    if (user4 == null || user4.getFollowStatus() != 0) {
                        arrayList.add(inboxLiveNotice);
                    }
                }
            } else {
                arrayList = skylightLiveGuidePod.liveNotices;
            }
        } else {
            List<InboxLiveNotice> list2 = skylightLiveGuidePod.liveNotices;
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
        this.LLJJIII = arrayList;
        C786410Ut5.LLLLZLL(this.LLJI, 8);
        C786410Ut5.k(this.LLJIJIL, 8);
        C786410Ut5.k(this.LLJILJIL, 8);
        C786410Ut5.k(this.LLJILJILJ, 8);
        C786410Ut5.X(this.LLJILLL, 8);
        C786410Ut5.X(this.LLJJ, 8);
        C786410Ut5.X(this.LLJJI, 8);
        if (arrayList.isEmpty()) {
            C786410Ut5.LLLLZLL(this.LLJI, 0);
        }
        Activity activityL5 = L5();
        int iIntValue2 = -1;
        if (activityL5 != null && (numLIZJ2 = C1308910kAL.LIZJ(R.attr.nn, activityL5)) != null) {
            iIntValue = numLIZJ2.intValue();
        } else {
            iIntValue = -1;
        }
        Activity activityL52 = L5();
        if (activityL52 != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.nm, activityL52)) != null) {
            iIntValue2 = numLIZJ.intValue();
        }
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 100.0f, 100.0f, iIntValue, iIntValue2, Shader.TileMode.MIRROR);
        if ((!arrayList.isEmpty()) && (user3 = ((InboxLiveNotice) ListProtector.get(arrayList, 0)).user) != null) {
            W5(linearGradient, this.LLJIJIL, this.LLJILLL, user3);
        }
        if (arrayList.size() > 1 && (user2 = ((InboxLiveNotice) ListProtector.get(arrayList, 1)).user) != null) {
            W5(linearGradient, this.LLJILJIL, this.LLJJ, user2);
        }
        if (arrayList.size() > 2 && (user = ((InboxLiveNotice) ListProtector.get(arrayList, 2)).user) != null) {
            W5(linearGradient, this.LLJILJILJ, this.LLJJI, user);
        }
        U5();
    }

    public final void T5(String str) {
        Integer numValueOf;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SkylightLiveGuideVH#reportClick anchor_num = ");
        List<InboxLiveNotice> list = this.LLJJIJI;
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
        List<InboxLiveNotice> list2 = this.LLJJIJI;
        if (list2 != null) {
            numValueOf2 = Integer.valueOf(list2.size());
        }
        pairArr[0] = new Pair("anchor_num", String.valueOf(numValueOf2));
        pairArr[1] = new Pair("click_module", str);
        C20684815ws.LJIILLIIL("livesdk_inbox_notice_board_click", C2097608Jq.LJIIIIZZ(pairArr));
    }

    public C1903670zdd(View view, Fragment fragment) {
        MutableLiveData<Boolean> mutableLiveData;
        super(view);
        this.LLJ = view;
        RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(R.id.jc0);
        TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.k5b);
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.nx2);
        TuxTextView tuxTextView2 = (TuxTextView) view.findViewById(R.id.p_o);
        this.LLJI = tuxTextView2;
        this.LLJIJIL = (C424620Gku) view.findViewById(R.id.user_avatar_1);
        this.LLJILJIL = (C424620Gku) view.findViewById(R.id.user_avatar_2);
        this.LLJILJILJ = (C424620Gku) view.findViewById(R.id.user_avatar_3);
        this.LLJILLL = (C367310Eaf) view.findViewById(R.id.user_avatar_ring_1);
        this.LLJJ = (C367310Eaf) view.findViewById(R.id.user_avatar_ring_2);
        this.LLJJI = (C367310Eaf) view.findViewById(R.id.user_avatar_ring_3);
        this.LLJJJ = new C19335110kf(this, 1);
        C19EG c19egLIZ = C724240Sb0.LIZ(fragment);
        if (c19egLIZ != null) {
            InboxFollowGuideViewModel inboxFollowGuideViewModelLIZ = C1572250r15.LIZ(c19egLIZ);
            this.LLJJIJIIJIL = inboxFollowGuideViewModelLIZ;
            if (inboxFollowGuideViewModelLIZ != null && (mutableLiveData = inboxFollowGuideViewModelLIZ.LLILLJJLI) != null) {
                mutableLiveData.observe(fragment, new AObserverS230S0100000_28(this, 96));
            }
        }
        C786410Ut5.a9(tuxIconView, new ACListenerS162S0100000_28(this, 162));
        ACListenerS130S0200000_28 aCListenerS130S0200000_28 = new ACListenerS130S0200000_28(this, fragment, 58);
        C786410Ut5.S7(relativeLayout, aCListenerS130S0200000_28);
        C786410Ut5.h9(tuxTextView, aCListenerS130S0200000_28);
        C786410Ut5.h9(tuxTextView2, aCListenerS130S0200000_28);
        C1618770sE7.LJIIJ(view, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))));
    }

    @Override // X.C0Z37
    public final void LJZI(int i, InterfaceC1891350zJl interfaceC1891350zJl) {
        I5(i, interfaceC1891350zJl);
    }

    public final void W5(LinearGradient linearGradient, C424620Gku c424620Gku, C367310Eaf c367310Eaf, User user) {
        int iIntValue;
        Integer numLIZJ;
        C786410Ut5.k(c424620Gku, 0);
        C786410Ut5.X(c367310Eaf, 0);
        c367310Eaf.LL.add(new Pair<>(linearGradient, 0));
        Activity activityL5 = L5();
        if (activityL5 != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.bx, activityL5)) != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = -1;
        }
        c367310Eaf.LIZ(iIntValue, 1);
        C1324840ka2.LJFF(c424620Gku, user.getAvatarThumb());
    }
}

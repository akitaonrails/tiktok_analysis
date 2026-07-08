package X;

import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.common.ConnectionResult;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.feed.model.story.highlights.HighlightSkylightUser;
import com.ss.android.ugc.aweme.inbox.skylight.plat.InboxSkylightListState;
import com.ss.android.ugc.aweme.inbox.skylight.plat.SkylightListViewModel;
import com.ss.android.ugc.aweme.inbox.widget.multi.InboxHorizontalTopListCombinePod;
import com.ss.android.ugc.aweme.inbox.widget.multi.horizontal.CustomBizData;
import com.ss.android.ugc.aweme.inbox.widget.multi.horizontal.EcLiveEvent;
import com.ss.android.ugc.aweme.inbox.widget.multi.horizontal.SkylightData;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.service.ISkylightMafService;
import com.ss.android.ugc.aweme.service.ISocPubStatusRepoService;
import com.ss.android.ugc.aweme.social.thought.api.model.ThoughtInfo;
import com.ss.android.ugc.aweme.story.inbox.IStoryInboxService;
import com.ss.android.ugc.aweme.story.inbox.StoryInboxItem;
import com.ss.android.ugc.aweme.story.reveal.IStoryRevealService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS603S0100000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rgk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1598080rgk implements InterfaceC1598040rgg {
    public final InterfaceC1598020rge LIZ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(686));
    public final C01GW LIZJ = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(683));
    public final SkylightListViewModel LIZLLL;
    public final C01GW LJ;
    public final C01GW LJFF;
    public final C01GW LJI;
    public List<? extends Aweme> LJII;
    public List<? extends Aweme> LJIIIIZZ;
    public List<HighlightSkylightUser> LJIIIZ;
    public Map<String, ThoughtInfo> LJIIJ;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:122:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x03ee  */
    @Override // X.InterfaceC1598040rgg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List LJ() {
        /*
            Method dump skipped, instruction units count: 1042
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1598080rgk.LJ():java.util.List");
    }

    @Override // X.InterfaceC1598040rgg
    public final void LJFF() {
        SkylightListViewModel skylightListViewModel = this.LIZLLL;
        if (skylightListViewModel != null) {
            AssemViewModel.asyncSubscribe$default(skylightListViewModel, new C2217381BqS() { // from class: X.0rgl
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((InboxSkylightListState) obj).getRefreshState();
                }
            }, C736820SvI.LIZLLL(), null, null, new AwS603S0100000_24(this, 691), 12, null);
        }
    }

    @Override // X.InterfaceC1598040rgg
    public final void LIZLLL() {
        ISocPubStatusRepoService iSocPubStatusRepoService;
        User author;
        List<Aweme> stories;
        ISkylightMafService iSkylightMafService;
        Object c098200Yq;
        boolean z;
        InboxHorizontalTopListCombinePod inboxHorizontalTopListCombinePodFQ2;
        if (C298500Bmy.LIZ() && !C1209404oG.LIZ()) {
            InterfaceC1598020rge interfaceC1598020rge = this.LIZ;
            if (C1599090riN.LIZ()) {
                try {
                    SkylightListViewModel skylightListViewModelVm = this.LIZ.vm();
                    c098200Yq = Boolean.valueOf((!(skylightListViewModelVm instanceof SkylightListViewModel) || skylightListViewModelVm == null || (inboxHorizontalTopListCombinePodFQ2 = skylightListViewModelVm.FQ2()) == null) ? false : inboxHorizontalTopListCombinePodFQ2.allMafStories());
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                Boolean bool = Boolean.FALSE;
                if (C189200o6.m7isFailureimpl(c098200Yq)) {
                    c098200Yq = bool;
                }
                z = !((Boolean) c098200Yq).booleanValue();
            } else {
                Iterator<? extends Aweme> it2 = this.LJII.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Aweme next = it2.next();
                    Aweme aweme = next;
                    if (!C729510SjV.LJIILJJIL(AwemeExtKt.getAuthorUid(aweme)) && !C10EU.LJIILJJIL(aweme.getAuthor())) {
                        if (next != null) {
                            z = true;
                        }
                    }
                }
                z = false;
            }
            interfaceC1598020rge.LJI(z);
        }
        if (C295190Bhd.LIZJ()) {
            this.LJIIIZ = C13BV.INSTANCE;
        }
        ISkylightMafService iSkylightMafService2 = (ISkylightMafService) this.LJFF.getValue();
        boolean z2 = (iSkylightMafService2 != null && iSkylightMafService2.LIZ(3)) || this.LJIIIZ.size() > 0;
        List<? extends Aweme> list = this.LJII;
        ArrayList arrayList = new ArrayList();
        for (Aweme aweme2 : list) {
            Aweme aweme3 = aweme2;
            String strLJIIIZ = C729510SjV.LJIIIZ(aweme3);
            boolean z3 = !C729510SjV.LJJII(aweme3);
            boolean z4 = (z2 && (iSkylightMafService = (ISkylightMafService) this.LJFF.getValue()) != null && iSkylightMafService.LIZLLL(aweme3.getAuthor())) ? false : true;
            InterfaceC1598020rge interfaceC1598020rge2 = this.LIZ;
            if (interfaceC1598020rge2.LIZJ(interfaceC1598020rge2.LIZLLL(5), strLJIIIZ) && !C729510SjV.LJIILJJIL(strLJIIIZ) && z3 && !C295190Bhd.LIZJ() && z4) {
                this.LIZ.LIZ().put(strLJIIIZ, Integer.valueOf(this.LIZ.LIZLLL(5)));
                arrayList.add(aweme2);
            }
        }
        this.LJII = arrayList;
        C01GW c01gw = C102500a7.LIZ;
        if (((Number) c01gw.getValue()).intValue() == 1 || ((Number) c01gw.getValue()).intValue() == 3) {
            List<? extends Aweme> list2 = this.LJII;
            ArrayList arrayList2 = new ArrayList();
            for (Aweme aweme4 : list2) {
                UserStory userStory = aweme4.getUserStory();
                if (userStory != null && (author = aweme4.getAuthor()) != null && ((stories = userStory.getStories()) == null || stories.isEmpty())) {
                    if (userStory.getHasMoreAfter() || userStory.getHasMoreBefore()) {
                        arrayList2.add(author);
                    }
                }
            }
            if (arrayList2.isEmpty() || (iSocPubStatusRepoService = (ISocPubStatusRepoService) this.LIZIZ.getValue()) == null) {
                return;
            }
            iSocPubStatusRepoService.LJIIL(arrayList2, EnumC1606080rte.INBOX_TOP_LIST, true);
        }
    }

    public C1598080rgk(InterfaceC1598020rge interfaceC1598020rge) {
        this.LIZ = interfaceC1598020rge;
        SkylightListViewModel skylightListViewModelVm = interfaceC1598020rge.vm();
        this.LIZLLL = skylightListViewModelVm instanceof SkylightListViewModel ? skylightListViewModelVm : null;
        this.LJ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1894));
        this.LJFF = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(684));
        this.LJI = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(685));
        C13BV c13bv = C13BV.INSTANCE;
        this.LJII = c13bv;
        this.LJIIIZ = c13bv;
        this.LJIIJ = C2097608Jq.LJ();
    }

    @Override // X.InterfaceC1598040rgg
    public final void LIZIZ(int i, List list) {
        AbstractC1598350rhB<?> abstractC1598350rhB;
        ConcurrentHashMap<Integer, List<T>> concurrentHashMap;
        List list2;
        User user;
        String uid;
        int iIntValue;
        String str;
        EcLiveEvent ecLiveEvent;
        EcLiveEvent ecLiveEvent2;
        User user2;
        AbstractC1598130rgp abstractC1598130rgp;
        User user3;
        String uid2;
        C1599330ril.LIZ.getClass();
        C1599330ril.LIZLLL.clear();
        C1599350rin.LIZ.getClass();
        if (C1599350rin.LIZ().adjustPriorityFc.enable && (abstractC1598350rhB = this.LIZ.LIZIZ().get(EnumC1598330rh9.GENERAL)) != null && (concurrentHashMap = abstractC1598350rhB.LIZJ) != 0 && (list2 = (List) concurrentHashMap.get(8)) != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list2) {
                if (obj instanceof C1598140rgq) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : arrayList) {
                C1598150rgr c1598150rgr = (C1598150rgr) obj2;
                CustomBizData customBizData = c1598150rgr.LL.customBizData;
                String uid3 = null;
                if (customBizData != null) {
                    ecLiveEvent2 = customBizData.event;
                    user2 = customBizData.user;
                } else {
                    ecLiveEvent2 = null;
                    user2 = null;
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    InterfaceC1891350zJl interfaceC1891350zJl = (InterfaceC1891350zJl) it2.next();
                    if ((interfaceC1891350zJl instanceof AbstractC1598130rgp) && (abstractC1598130rgp = (AbstractC1598130rgp) interfaceC1891350zJl) != null && (user3 = abstractC1598130rgp.getUser()) != null && (uid2 = user3.getUid()) != null) {
                        arrayList3.add(uid2);
                    }
                }
                Set setLLIIJI = C13LP.LLIIJI(arrayList3);
                if (c1598150rgr.LL.bizType == 8 && ecLiveEvent2 != null && Intrinsics.LJFF(ecLiveEvent2.needAdjustPriority, Boolean.TRUE)) {
                    C1599330ril c1599330ril = C1599330ril.LIZ;
                    String str2 = ecLiveEvent2.eventId;
                    c1599330ril.getClass();
                    if (C1599330ril.LJFF && str2 != null) {
                        long jLIZJ = C1599330ril.LIZJ(str2);
                        C1599350rin.LIZ.getClass();
                        if (jLIZJ >= C1599350rin.LIZ().adjustPriorityFc.displayLimit) {
                        }
                    }
                    if (user2 != null) {
                        uid3 = user2.getUid();
                    }
                    if (!C13LP.LJJJJ(uid3, setLLIIJI)) {
                        arrayList2.add(obj2);
                    }
                }
            }
            C1599350rin.LIZ.getClass();
            List listLL = C13LP.LL(arrayList2, C1599350rin.LIZ().adjustPriorityFc.count);
            if (listLL != null) {
                Iterator it3 = listLL.iterator();
                while (it3.hasNext()) {
                    SkylightData skylightData = ((C1598150rgr) it3.next()).LL;
                    CustomBizData customBizData2 = skylightData.customBizData;
                    if (customBizData2 != null && (user = customBizData2.user) != null && (uid = user.getUid()) != null) {
                        C1599350rin.LIZ.getClass();
                        if (i == 4) {
                            Integer num = C1599350rin.LIZ().adjustPriorityFc.extraPriorityMap.get("after_muf_live");
                            if (num != null) {
                                iIntValue = num.intValue();
                            } else {
                                iIntValue = 3300;
                            }
                        } else {
                            Integer num2 = C1599350rin.LIZ().adjustPriorityFc.extraPriorityMap.get("default");
                            if (num2 != null) {
                                iIntValue = num2.intValue();
                            } else {
                                iIntValue = 4250;
                            }
                        }
                        if (this.LIZ.LIZJ(iIntValue, uid)) {
                            SkylightData skylightDataCopy = skylightData.copy(skylightData.bizType, iIntValue, skylightData.subPriority, skylightData.templateData, skylightData.customBizData, skylightData.uid, skylightData.imprId);
                            this.LIZ.LIZ().put(uid, Integer.valueOf(skylightDataCopy.priority));
                            list.add(new C1598140rgq(skylightDataCopy));
                            C1599330ril.LIZ.getClass();
                            C823170WQx<String> c823170WQx = C1599330ril.LIZLLL;
                            CustomBizData customBizData3 = skylightData.customBizData;
                            if (customBizData3 == null || (ecLiveEvent = customBizData3.event) == null || (str = ecLiveEvent.eventId) == null) {
                                str = "";
                            }
                            c823170WQx.add(str);
                        }
                    }
                }
            }
        }
    }

    @Override // X.InterfaceC1598040rgg
    public final void LJI(List<InterfaceC1891350zJl> list, boolean z) {
        boolean z2;
        Aweme aweme;
        ThoughtInfo thoughtInfo;
        Aweme next;
        boolean z3 = !list.isEmpty();
        C1618440sDa c1618440sDa = C1618440sDa.LIZIZ;
        StoryInboxItem storyInboxItem = new StoryInboxItem(c1618440sDa.LJJLIIIJLJLI().LJIIIIZZ(), Integer.MAX_VALUE, true, null, null, true, 0, -1, null, 0, System.currentTimeMillis());
        boolean z4 = !C729510SjV.LJJII(storyInboxItem.getStoryCollection());
        IStoryInboxService iStoryInboxService = (IStoryInboxService) this.LIZJ.getValue();
        if (!z3 && !z4) {
            z2 = false;
        } else {
            z2 = true;
        }
        String str = null;
        if (iStoryInboxService.shouldShowShootingEntrance(z, z2)) {
            if ((c1618440sDa.LJJIFFI().LJIIIIZZ() || z4) && ((IStoryInboxService) this.LIZJ.getValue()).canShowStoryCell()) {
                List<? extends Aweme> list2 = this.LJIIIIZZ;
                if (list2 != null) {
                    Iterator<? extends Aweme> it2 = list2.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            next = it2.next();
                            if (Intrinsics.LJFF(AwemeExtKt.getAuthorUid(next), storyInboxItem.getStoryCollection().getAid())) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    aweme = next;
                } else {
                    aweme = null;
                }
                String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
                if (curUserId == null) {
                    curUserId = "";
                }
                if (curUserId.length() > 0) {
                    thoughtInfo = this.LJIIJ.get(curUserId);
                } else {
                    thoughtInfo = null;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("delegate.addStoryShootEntrance: selfUid=");
                sbLIZ.append(curUserId);
                sbLIZ.append(" mySelfThoughtId=");
                if (thoughtInfo != null) {
                    str = thoughtInfo.thoughtId;
                }
                sbLIZ.append(str);
                C2188811AlT.LIZIZ(sbLIZ);
                list.add(storyInboxItem.copy(storyInboxItem.storyCollection, ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED, storyInboxItem.isMe, aweme, thoughtInfo, storyInboxItem.concernUserAvatarChanged, storyInboxItem.reRankSequence, storyInboxItem.reRankType, storyInboxItem.revealInfo, storyInboxItem.dataFrom, storyInboxItem.receiveTime));
            }
        }
    }

    @Override // X.InterfaceC1598040rgg
    public final void LIZ(C1598410rhH c1598410rhH, List<InterfaceC1891350zJl> list, List<InterfaceC1891350zJl> list2) {
        Integer numLIZIZ;
        List list3;
        Object next;
        Object c098200Yq;
        StoryInboxItem storyInboxItem;
        C1598870ri1 c1598870ri1;
        int iLIZ;
        InterfaceC1597940rgW onThisDayService = C1618440sDa.LIZIZ.LJJIIZI().getOnThisDayService();
        if (onThisDayService == null || !onThisDayService.LIZLLL() || (numLIZIZ = onThisDayService.LIZIZ(list2)) == null) {
            return;
        }
        int iIntValue = numLIZIZ.intValue() + 1;
        AbstractC1598350rhB<?> abstractC1598350rhB = this.LIZ.LIZIZ().get(EnumC1598330rh9.GENERAL);
        if (abstractC1598350rhB != null) {
            list3 = abstractC1598350rhB.LIZIZ;
        } else {
            list3 = null;
        }
        if (C19719512Dh.LJI(list3) && list3 != null) {
            Iterator it2 = list3.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (next instanceof C1598870ri1) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            InterfaceC1891350zJl interfaceC1891350zJl = (InterfaceC1891350zJl) next;
            if (interfaceC1891350zJl != null) {
                try {
                    ((ArrayList) list).remove(interfaceC1891350zJl);
                    list3.remove(interfaceC1891350zJl);
                    Object objLJJJLZIJ = C13LP.LJJJLZIJ(numLIZIZ.intValue(), list2);
                    if (objLJJJLZIJ instanceof StoryInboxItem) {
                        storyInboxItem = (StoryInboxItem) objLJJJLZIJ;
                    } else {
                        storyInboxItem = null;
                    }
                    if ((interfaceC1891350zJl instanceof C1598870ri1) && (c1598870ri1 = (C1598870ri1) interfaceC1891350zJl) != null) {
                        if (storyInboxItem != null) {
                            iLIZ = storyInboxItem.getPriority();
                        } else {
                            iLIZ = c1598410rhH.LIZ(5);
                        }
                        c1598870ri1.LLILZIL = iLIZ;
                    }
                    list2.add(iIntValue, interfaceC1891350zJl);
                    c098200Yq = Unit.LIZ;
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                C189200o6.m5exceptionOrNullimpl(c098200Yq);
            }
        }
    }

    @Override // X.InterfaceC1598040rgg
    public final void LIZJ(List list, Map map, List list2, List list3) {
        this.LJII = list;
        this.LJIIIIZZ = list2;
        this.LJIIIZ = list3;
        this.LJIIJ = map;
        IStoryRevealService iStoryRevealService = (IStoryRevealService) this.LJI.getValue();
        if (iStoryRevealService != null) {
            iStoryRevealService.LJFF();
        }
    }
}

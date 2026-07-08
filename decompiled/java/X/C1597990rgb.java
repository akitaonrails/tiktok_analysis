package X;

import Y.AComparatorS521S0100000_24;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.depend.model.live.SlimRoom;
import com.ss.android.ugc.aweme.bean.MixRankSkylightItem;
import com.ss.android.ugc.aweme.bean.MixRankSkylightItemBizData;
import com.ss.android.ugc.aweme.inbox.IInboxLiveService;
import com.ss.android.ugc.aweme.inbox.response.InboxLiveNotice;
import com.ss.android.ugc.aweme.social.thought.api.model.ThoughtInfo;
import com.ss.android.ugc.aweme.story.inbox.ThoughtInboxItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AwS568S0100000_24;

/* JADX INFO: renamed from: X.0rgb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1597990rgb extends AbstractC1598350rhB<InterfaceC1891350zJl> {
    public final C01GW LIZLLL;
    public final C01GW LJ;
    public final List<InboxLiveNotice> LJFF;
    public final C01GW LJI;
    public final Map<String, String> LJII;
    public final Map<String, String> LJIIIIZZ;
    public final Map<String, String> LJIIIZ;
    public List<MixRankSkylightItem> LJIIJ;
    public List<String> LJIIJJI;
    public final Map<String, ThoughtInfo> LJIIL;
    public final List<C1598030rgf> LJIILIIL;
    public final Map<String, String> LJIILJJIL;
    public long LJIILL;
    public int LJIILLIIL;

    public final InterfaceC1598040rgg LJI() {
        return (InterfaceC1598040rgg) this.LJI.getValue();
    }

    @Override // X.AbstractC1598350rhB
    public final Unit LIZIZ() {
        LJI().LJFF();
        if (C296730Bk7.LIZ() != 0) {
            C1440005kM.LIZ(new C1599120riQ(this.LJFF, true));
        } else {
            C296840BkI.LIZ.getClass();
            if (C296840BkI.LIZ()) {
                C1440005kM.LIZ(new C1599120riQ(C13BV.INSTANCE, false));
            }
        }
        return Unit.LIZ;
    }

    public C1597990rgb(InterfaceC1598020rge interfaceC1598020rge) {
        super(interfaceC1598020rge);
        this.LIZLLL = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(668));
        this.LJ = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(667));
        this.LJFF = new ArrayList();
        this.LJI = C452501pT.LIZIZ(new AwS568S0100000_24(interfaceC1598020rge, 1874));
        this.LJII = new LinkedHashMap();
        this.LJIIIIZZ = new LinkedHashMap();
        this.LJIIIZ = new LinkedHashMap();
        this.LJIIJ = new ArrayList();
        this.LJIIJJI = C13BV.INSTANCE;
        this.LJIIL = new LinkedHashMap();
        this.LJIILIIL = new ArrayList();
        this.LJIILJJIL = new LinkedHashMap();
    }

    @Override // X.AbstractC1598350rhB
    public final Object LIZLLL(InterfaceC1364105Vn interfaceC1364105Vn) {
        SlimRoom slimRoom;
        String idStr;
        User user;
        boolean z;
        com.ss.android.ugc.aweme.profile.model.User user2;
        LJI().LIZLLL();
        int iLIZLLL = this.LIZ.LIZLLL(5);
        List<MixRankSkylightItem> list = this.LJIIJ;
        ArrayList arrayList = new ArrayList();
        for (MixRankSkylightItem mixRankSkylightItem : list) {
            MixRankSkylightItem mixRankSkylightItem2 = mixRankSkylightItem;
            MixRankSkylightItemBizData mixRankSkylightItemBizData = mixRankSkylightItem2.bizData;
            if ((mixRankSkylightItemBizData == null || (user2 = mixRankSkylightItemBizData.user) == null || (idStr = user2.getUid()) == null) && ((slimRoom = mixRankSkylightItem2.slimRoom) == null || (user = slimRoom.owner) == null || (idStr = user.getIdStr()) == null)) {
                idStr = "";
            }
            boolean zLIZJ = this.LIZ.LIZJ(iLIZLLL, idStr);
            if (zLIZJ) {
                this.LIZ.LIZ().put(idStr, C2286608xc.LJ(iLIZLLL));
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j = this.LJIILL;
            if (j == 0 || (j > 0 && jCurrentTimeMillis - j <= 900000)) {
                z = true;
            } else {
                z = false;
            }
            if (zLIZJ && z) {
                arrayList.add(mixRankSkylightItem);
            }
        }
        this.LJIIJ = C19719512Dh.LIZIZ(arrayList);
        int iLIZLLL2 = this.LIZ.LIZLLL(5);
        Iterator it2 = ((ArrayList) this.LJIILIIL).iterator();
        while (it2.hasNext()) {
            String uid = ((C1598030rgf) it2.next()).LIZ.getUid();
            if (uid != null && uid.length() > 0) {
                this.LIZ.LIZ().put(uid, C2286608xc.LJ(iLIZLLL2));
            }
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Iterable, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // X.AbstractC1598350rhB
    public final Object LJ(EnumC1155010gA7 enumC1155010gA7) {
        C13BV arrayList;
        MixRankSkylightItemBizData mixRankSkylightItemBizData;
        com.ss.android.ugc.aweme.profile.model.User user;
        boolean z;
        List listLJ = LJI().LJ();
        List<MixRankSkylightItem> list = this.LJIIJ;
        ArrayList arrayList2 = new ArrayList();
        for (MixRankSkylightItem mixRankSkylightItem : list) {
            SlimRoom slimRoom = mixRankSkylightItem.slimRoom;
            AbstractC1598130rgp abstractC1598130rgpMapLiveItem = null;
            if (slimRoom != null && (mixRankSkylightItemBizData = mixRankSkylightItem.bizData) != null && (user = mixRankSkylightItemBizData.user) != null) {
                InboxLiveNotice inboxLiveNotice = new InboxLiveNotice(user, 0, slimRoom, false, this.LIZ.LIZLLL(5), false, System.currentTimeMillis());
                ((ArrayList) this.LJFF).add(inboxLiveNotice);
                if (C296730Bk7.LIZ() != 2) {
                    boolean zLJIILJJIL = C10EU.LJIILJJIL(inboxLiveNotice.user);
                    if (C295060BhQ.LIZ() || !zLJIILJJIL) {
                        com.ss.android.ugc.aweme.profile.model.User user2 = inboxLiveNotice.user;
                        boolean z2 = false;
                        if (user2 != null && user2.getFollowStatus() == 2) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (C296730Bk7.LIZ() == 0) {
                            z2 = true;
                        }
                        if (z || z2) {
                            IInboxLiveService iInboxLiveService = (IInboxLiveService) this.LJ.getValue();
                            if (iInboxLiveService != null) {
                                abstractC1598130rgpMapLiveItem = iInboxLiveService.mapLiveItem(inboxLiveNotice, true, this.LJIILLIIL);
                            }
                            this.LJIILLIIL++;
                            if (abstractC1598130rgpMapLiveItem != null) {
                                arrayList2.add(abstractC1598130rgpMapLiveItem);
                            }
                        }
                    }
                }
            }
        }
        if (((ArrayList) this.LJIILIIL).isEmpty()) {
            arrayList = C13BV.INSTANCE;
        } else {
            int iLIZLLL = this.LIZ.LIZLLL(5);
            List<C1598030rgf> list2 = this.LJIILIIL;
            arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
            for (C1598030rgf c1598030rgf : (ArrayList) list2) {
                arrayList.add(new ThoughtInboxItem(c1598030rgf.LIZ, c1598030rgf.LIZIZ, iLIZLLL, 0, -1, 0));
            }
            arrayList.size();
            ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList3.add(((ThoughtInboxItem) it2.next()).getThoughtUser().getUid());
            }
        }
        this.LIZIZ.addAll(C13LP.LJLLLL(new AComparatorS521S0100000_24(this, 1), C13LP.LJLIL(arrayList, C13LP.LJLIL(arrayList2, listLJ))));
        if (!this.LIZ.LJ().isLoadMoreData()) {
            LJI().LJI(this.LIZIZ, !arrayList2.isEmpty());
        }
        return this;
    }

    @Override // X.AbstractC1598350rhB
    public final void LIZ(C1598410rhH c1598410rhH, List<InterfaceC1891350zJl> list) {
        LJI().LIZ(c1598410rhH, list, this.LIZIZ);
        LJI().LIZIZ(c1598410rhH.LIZIZ, this.LIZIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x027a A[PHI: r12
      0x027a: PHI (r12v11 java.util.List<com.ss.android.ugc.aweme.profile.model.User>) = 
      (r12v9 java.util.List<com.ss.android.ugc.aweme.profile.model.User>)
      (r12v8 java.util.List<com.ss.android.ugc.aweme.profile.model.User>)
     binds: [B:159:0x0332, B:119:0x0278] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.AbstractC1598350rhB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(X.EnumC1155010gA7 r29, X.InterfaceC1364105Vn<? super X.AbstractC1598350rhB<X.InterfaceC1891350zJl>> r30) {
        /*
            Method dump skipped, instruction units count: 1677
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1597990rgb.LIZJ(X.0gA7, X.05Vn):java.lang.Object");
    }
}

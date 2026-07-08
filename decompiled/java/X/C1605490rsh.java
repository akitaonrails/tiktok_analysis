package X;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdkapi.depend.model.live.RoomInfo;
import com.bytedance.android.livesdkapi.depend.model.live.SlimRoom;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.inbox.IInboxLiveService;
import com.ss.android.ugc.aweme.inbox.adapter.InboxLiveBaseCell;
import com.ss.android.ugc.aweme.inbox.adapter.InboxLiveDoubleRVCell;
import com.ss.android.ugc.aweme.inbox.adapter.InboxLiveRVCell;
import com.ss.android.ugc.aweme.inbox.response.InboxLiveNotice;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rsh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1605490rsh implements IInboxLiveService {
    public static final C1605490rsh LIZJ = C1605500rsi.LIZ;
    public int LIZ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(475));

    @Override // com.ss.android.ugc.aweme.inbox.IInboxLiveService
    public final Class<? extends PowerCell<? extends AbstractC1598130rgp>>[] getLiveCells() {
        return new Class[]{InboxLiveRVCell.class, InboxLiveDoubleRVCell.class};
    }

    @Override // com.ss.android.ugc.aweme.inbox.IInboxLiveService
    public final Set<Long> getInboxCellMobSet() {
        return (Set) this.LIZIZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.inbox.IInboxLiveService
    public final int getInboxSkyLightListScrollState() {
        return this.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.inbox.IInboxLiveService
    public final void compensateLiveShow(RecyclerView.ViewHolder viewHolder) {
        AbstractC1598130rgp abstractC1598130rgp;
        InboxLiveNotice inboxLiveNoticeLIZIZ;
        User user;
        if (viewHolder instanceof InboxLiveBaseCell) {
            InboxLiveBaseCell inboxLiveBaseCell = (InboxLiveBaseCell) viewHolder;
            inboxLiveBaseCell.getClass();
            if (C1152490g63.LIZ() && inboxLiveBaseCell.LLILLJJLI && (abstractC1598130rgp = (AbstractC1598130rgp) inboxLiveBaseCell.getItem()) != null && (inboxLiveNoticeLIZIZ = abstractC1598130rgp.LIZIZ()) != null && (user = inboxLiveNoticeLIZIZ.user) != null) {
                long j = user.roomId;
                Set<Long> inboxCellMobSet = ((IInboxLiveService) inboxLiveBaseCell.LLILZIL.getValue()).getInboxCellMobSet();
                if (inboxCellMobSet != null && !inboxCellMobSet.contains(Long.valueOf(j))) {
                    inboxLiveBaseCell.LLIZLLLIL = false;
                    inboxLiveBaseCell.c6();
                    inboxCellMobSet.add(Long.valueOf(j));
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.inbox.IInboxLiveService
    public final void realPauseAnimation(RecyclerView.ViewHolder viewHolder) {
        C21569819bE c21569819bE;
        C21569819bE c21569819bE2;
        if ((viewHolder instanceof InboxLiveRVCell) && (c21569819bE2 = ((InboxLiveBaseCell) viewHolder).LLILLL) != null) {
            c21569819bE2.LJ();
        }
        if ((viewHolder instanceof InboxLiveDoubleRVCell) && (c21569819bE = ((InboxLiveBaseCell) viewHolder).LLILLL) != null) {
            c21569819bE.LJ();
        }
    }

    @Override // com.ss.android.ugc.aweme.inbox.IInboxLiveService
    public final void recordRoomInfoList(List<InboxLiveNotice> list) {
        C0J5U c0j5u = C0J5U.LIZ;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (InboxLiveNotice inboxLiveNotice : list) {
            InboxLiveNotice inboxLiveNotice2 = inboxLiveNotice;
            if (inboxLiveNotice2.roomInfo != null && inboxLiveNotice2.user != null) {
                arrayList2.add(inboxLiveNotice);
            }
        }
        ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(Long.valueOf(((InboxLiveNotice) it2.next()).roomInfo.getId()));
        }
        arrayList.addAll(arrayList3);
        c0j5u.getClass();
        C0J5U c0j5u2 = C0J5U.LIZ;
        ArrayList<InboxLiveNotice> arrayList4 = new ArrayList();
        for (InboxLiveNotice inboxLiveNotice3 : list) {
            InboxLiveNotice inboxLiveNotice4 = inboxLiveNotice3;
            if (inboxLiveNotice4.roomInfo != null && inboxLiveNotice4.user != null) {
                arrayList4.add(inboxLiveNotice3);
            }
        }
        ArrayList arrayList5 = new ArrayList(C15438062q.LJIJJ(arrayList4, 10));
        for (InboxLiveNotice inboxLiveNotice5 : arrayList4) {
            long id = inboxLiveNotice5.roomInfo.getId();
            String uid = inboxLiveNotice5.user.getUid();
            uid.toString();
            arrayList5.add(new RoomInfo(id, uid));
        }
        GsonProtectorUtils.toJson(C19748512Ol.LIZIZ, arrayList5);
        c0j5u2.getClass();
        ArrayList arrayList6 = new ArrayList();
        for (InboxLiveNotice inboxLiveNotice6 : list) {
            InboxLiveNotice inboxLiveNotice7 = inboxLiveNotice6;
            if (inboxLiveNotice7.roomInfo != null && inboxLiveNotice7.user != null) {
                arrayList6.add(inboxLiveNotice6);
            }
        }
        Iterator it3 = arrayList6.iterator();
        while (it3.hasNext()) {
            ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).k4().T8(C0IVT.LIZ("message", "live_cover", ((InboxLiveNotice) it3.next()).roomInfo));
        }
    }

    @Override // com.ss.android.ugc.aweme.inbox.IInboxLiveService
    public final void updateInboxListScrollState(int i) {
        this.LIZ = i;
    }

    @Override // com.ss.android.ugc.aweme.inbox.IInboxLiveService
    public final void callPauseAnimation(RecyclerView.ViewHolder viewHolder, EnumC1598770rhr enumC1598770rhr) {
        C21569819bE c21569819bE;
        C21569819bE c21569819bE2;
        if ((viewHolder instanceof InboxLiveRVCell) && (c21569819bE2 = ((InboxLiveBaseCell) viewHolder).LLILLL) != null) {
            c21569819bE2.LJ();
        }
        if ((viewHolder instanceof InboxLiveDoubleRVCell) && (c21569819bE = ((InboxLiveBaseCell) viewHolder).LLILLL) != null) {
            c21569819bE.LJ();
        }
        LIZ(viewHolder, enumC1598770rhr, false);
    }

    @Override // com.ss.android.ugc.aweme.inbox.IInboxLiveService
    public final void callResumeAnimation(RecyclerView.ViewHolder viewHolder, EnumC1598770rhr enumC1598770rhr) {
        C21569819bE c21569819bE;
        C21569819bE c21569819bE2;
        if ((viewHolder instanceof InboxLiveRVCell) && (c21569819bE2 = ((InboxLiveBaseCell) viewHolder).LLILLL) != null) {
            c21569819bE2.LJFF();
        }
        if ((viewHolder instanceof InboxLiveDoubleRVCell) && (c21569819bE = ((InboxLiveBaseCell) viewHolder).LLILLL) != null) {
            c21569819bE.LJFF();
        }
        LIZ(viewHolder, enumC1598770rhr, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZ(RecyclerView.ViewHolder viewHolder, EnumC1598770rhr enumC1598770rhr, boolean z) {
        if (!(viewHolder instanceof InterfaceC1605510rsj)) {
            return;
        }
        int i = C1598960riA.LIZ[enumC1598770rhr.ordinal()];
        if (i != 1) {
            if (i == 2) {
                ((InterfaceC1605510rsj) viewHolder).Z1(z);
                return;
            }
            return;
        }
        ((InterfaceC1605510rsj) viewHolder).LLLLLZL(z);
    }

    @Override // com.ss.android.ugc.aweme.inbox.IInboxLiveService
    public final AbstractC1598130rgp mapLiveItem(InboxLiveNotice inboxLiveNotice, boolean z, int i) {
        AbstractC1598130rgp c1598180rgu;
        SlimRoom.LinkMic linkMic;
        List<com.bytedance.android.live.base.model.user.User> list;
        SlimRoom slimRoom = inboxLiveNotice.roomInfo;
        if (slimRoom != null && (linkMic = slimRoom.getLinkMic()) != null && (list = linkMic.followedList) != null && list.size() >= 2) {
            c1598180rgu = new C1598190rgv(inboxLiveNotice, z);
        } else {
            c1598180rgu = new C1598180rgu(inboxLiveNotice, z);
        }
        c1598180rgu.LL = i;
        return c1598180rgu;
    }

    @Override // com.ss.android.ugc.aweme.inbox.IInboxLiveService
    public final List<AbstractC1598130rgp> mapLiveItems(List<InboxLiveNotice> list, final boolean z, boolean z2) {
        if (z2) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            for (final InboxLiveNotice inboxLiveNotice : list) {
                arrayList.add(new AbstractC1598130rgp(inboxLiveNotice, z) { // from class: X.0Nx9
                    public final InboxLiveNotice LLILLL;
                    public final boolean LLILZ;

                    @Override // X.InterfaceC1596350rdx
                    public final boolean LIZ() {
                        return false;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof C610570Nx9)) {
                            return false;
                        }
                        C610570Nx9 c610570Nx9 = (C610570Nx9) obj;
                        return Intrinsics.LJFF(this.LLILLL, c610570Nx9.LLILLL) && this.LLILZ == c610570Nx9.LLILZ;
                    }

                    @Override // X.InterfaceC1595240rcA
                    public final String getCellType() {
                        return "live";
                    }

                    @Override // X.InterfaceC1595240rcA
                    public final User getUser() {
                        return null;
                    }

                    public final int hashCode() {
                        InboxLiveNotice inboxLiveNotice2 = this.LLILLL;
                        return ((inboxLiveNotice2 == null ? 0 : inboxLiveNotice2.hashCode()) * 31) + C786410Ut5.Z2(this.LLILZ);
                    }

                    @Override // X.InterfaceC1595240rcA
                    public final boolean isSingleUser() {
                        return false;
                    }

                    public final String toString() {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("MediaLiveItem(liveNotice=");
                        sbLIZ.append(this.LLILLL);
                        sbLIZ.append(", isWithBreathAV=");
                        sbLIZ.append(this.LLILZ);
                        sbLIZ.append(')');
                        return C2188811AlT.LIZIZ(sbLIZ);
                    }

                    @Override // X.AbstractC1598130rgp
                    public final InboxLiveNotice LIZIZ() {
                        return this.LLILLL;
                    }

                    @Override // X.AbstractC1598130rgp
                    public final boolean LIZLLL() {
                        return this.LLILZ;
                    }

                    @Override // X.AbstractC1598130rgp, X.InterfaceC1891350zJl
                    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
                        return interfaceC1891350zJl instanceof C610570Nx9;
                    }

                    {
                        this.LLILLL = inboxLiveNotice;
                        this.LLILZ = z;
                    }
                });
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list, 10));
        int i = 0;
        for (InboxLiveNotice inboxLiveNotice2 : list) {
            int i2 = i + 1;
            if (i >= 0) {
                arrayList2.add(mapLiveItem(inboxLiveNotice2, z, i));
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        return arrayList2;
    }

    @Override // com.ss.android.ugc.aweme.inbox.IInboxLiveService
    public final void watchLive(Context context, InboxLiveNotice inboxLiveNotice, int i) {
        C0J5U.LIZ.getClass();
        C0J5U.LIZIZ(context, inboxLiveNotice, i, null, null);
    }
}

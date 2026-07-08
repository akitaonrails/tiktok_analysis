package X;

import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdk.model.message.GuestApplyInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.NextLiveData;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0Inf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C477290Inf implements InterfaceC477320Ini {
    public final InterfaceC476860Imy LIZ;
    public final NextLiveData<Boolean> LIZIZ;
    public final NextLiveData<C477280Ine> LIZJ;
    public final NextLiveData<Pair<Integer, Pair<Integer, Integer>>> LIZLLL;
    public C11JF LJ;
    public final C11NJ LJFF;

    public final List<FeedItem> LIZLLL() {
        List<FeedItem> listLJIIIIZZ;
        InterfaceC476860Imy interfaceC476860Imy = this.LIZ;
        ArrayList arrayList = null;
        if (interfaceC476860Imy != null && (listLJIIIIZZ = interfaceC476860Imy.LJIIIIZZ()) != null) {
            arrayList = new ArrayList();
            for (FeedItem feedItem : listLJIIIIZZ) {
                GuestApplyInfo guestApplyInfo = feedItem.skylightMultiGuestApplyInfo;
                if (guestApplyInfo != null && guestApplyInfo.applyStatus == 1) {
                    arrayList.add(feedItem);
                }
            }
        }
        return arrayList;
    }

    public final List<FeedItem> LJ() {
        List<FeedItem> listLJIIIIZZ;
        InterfaceC476860Imy interfaceC476860Imy = this.LIZ;
        ArrayList arrayList = null;
        if (interfaceC476860Imy != null && (listLJIIIIZZ = interfaceC476860Imy.LJIIIIZZ()) != null) {
            arrayList = new ArrayList();
            for (FeedItem feedItem : listLJIIIIZZ) {
                GuestApplyInfo guestApplyInfo = feedItem.skylightMultiGuestApplyInfo;
                if (guestApplyInfo != null && guestApplyInfo.applyStatus == 0) {
                    arrayList.add(feedItem);
                }
            }
        }
        return arrayList;
    }

    public final List<FeedItem> LJFF() {
        List<FeedItem> listLJIIIIZZ;
        InterfaceC476860Imy interfaceC476860Imy = this.LIZ;
        ArrayList arrayList = null;
        if (interfaceC476860Imy != null && (listLJIIIIZZ = interfaceC476860Imy.LJIIIIZZ()) != null) {
            arrayList = new ArrayList();
            for (FeedItem feedItem : listLJIIIIZZ) {
                GuestApplyInfo guestApplyInfo = feedItem.skylightMultiGuestApplyInfo;
                if (guestApplyInfo != null && (guestApplyInfo.applyStatus == 0 || guestApplyInfo.applyStatus == 1 || guestApplyInfo.applyStatus == 2)) {
                    arrayList.add(feedItem);
                }
            }
        }
        return arrayList;
    }

    public final void LJII() {
        FeedItem feedItem;
        Room room;
        C20337914i1<Boolean> c20337914i1 = InterfaceC934710aQn.Pc;
        if (c20337914i1.LIZIZ().booleanValue()) {
            C20441214yg.LJIIIZ("SkylightMultiGuestApplyController", "tryShowGuideBanner: guide banner has been showed before, will not show again");
            return;
        }
        List<FeedItem> listLJ = LJ();
        if (listLJ != null && listLJ.isEmpty()) {
            C20441214yg.LJIIIZ("SkylightMultiGuestApplyController", "tryShowGuideBanner: no in progress item, will not show guide banner");
            return;
        }
        NextLiveData<C477280Ine> nextLiveData = this.LIZJ;
        EnumC477310Inh enumC477310Inh = EnumC477310Inh.GUIDE;
        List<FeedItem> listLJ2 = LJ();
        nextLiveData.setValue(new C477280Ine(true, enumC477310Inh, Long.valueOf((listLJ2 == null || (feedItem = (FeedItem) ListProtector.get(listLJ2, 0)) == null || (room = feedItem.getRoom()) == null) ? 0L : room.getId()), C497740JfY.LJIJI(2131854291), 16));
        c20337914i1.LJFF(Boolean.TRUE);
        C20441214yg.LJIIIZ("SkylightMultiGuestApplyController", "tryShowGuideBanner: successfully show guide banner");
        C477860Ioa.LIZJ(0L, "toplive_check_requested_room", "show");
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0205 A[PHI: r8
      0x0205: PHI (r8v2 com.bytedance.android.livesdk.model.FeedItem) = 
      (r8v0 com.bytedance.android.livesdk.model.FeedItem)
      (r8v6 com.bytedance.android.livesdk.model.FeedItem)
      (r8v6 com.bytedance.android.livesdk.model.FeedItem)
     binds: [B:66:0x010b, B:80:0x0141, B:82:0x0145] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIIZZ() {
        /*
            Method dump skipped, instruction units count: 527
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C477290Inf.LJIIIIZZ():void");
    }

    public final void LJI() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onSkylightDataUpdate, validItemsCnt = ");
        List<FeedItem> listLJFF = LJFF();
        sbLIZ.append(listLJFF != null ? Integer.valueOf(listLJFF.size()) : null);
        C20441214yg.LJIIIZ("SkylightMultiGuestApplyController", C2188811AlT.LIZIZ(sbLIZ));
        this.LIZIZ.setValue(LJFF() != null ? Boolean.valueOf(!r0.isEmpty()) : Boolean.FALSE);
        LJII();
        LJIIIIZZ();
    }

    public C477290Inf(InterfaceC476860Imy interfaceC476860Imy) {
        Integer numValueOf;
        Boolean boolValueOf;
        this.LIZ = interfaceC476860Imy;
        NextLiveData<Boolean> nextLiveData = new NextLiveData<>();
        this.LIZIZ = nextLiveData;
        this.LIZJ = new NextLiveData<>();
        this.LIZLLL = new NextLiveData<>();
        this.LJFF = new C11NJ();
        C477450Inv.LIZJ(this);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("triggered init, validItemsCnt = ");
        List<FeedItem> listLJFF = LJFF();
        if (listLJFF != null) {
            numValueOf = Integer.valueOf(listLJFF.size());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        C20441214yg.LJIIIZ("SkylightMultiGuestApplyController", C2188811AlT.LIZIZ(sbLIZ));
        if (LJFF() != null) {
            boolValueOf = Boolean.valueOf(!r0.isEmpty());
        } else {
            boolValueOf = Boolean.FALSE;
        }
        nextLiveData.setValue(boolValueOf);
        LJII();
        LJIIIIZZ();
    }

    public static GuestApplyInfo LIZIZ(GuestApplyInfo guestApplyInfo) {
        GuestApplyInfo guestApplyInfo2 = new GuestApplyInfo();
        guestApplyInfo2.applyStatus = guestApplyInfo.applyStatus;
        guestApplyInfo2.applyTime = guestApplyInfo.applyTime;
        guestApplyInfo2.permitTime = guestApplyInfo.permitTime;
        guestApplyInfo2.permitExpireTime = guestApplyInfo.permitExpireTime;
        guestApplyInfo2.channelId = guestApplyInfo.channelId;
        guestApplyInfo2.roomId = guestApplyInfo.roomId;
        guestApplyInfo2.preLinkmicId = guestApplyInfo.preLinkmicId;
        guestApplyInfo2.ownerNickName = guestApplyInfo.ownerNickName;
        return guestApplyInfo2;
    }

    public final void LIZJ(FeedItem feedItem) {
        Room room;
        int size;
        String strValueOf;
        ArrayList arrayList;
        Long lValueOf;
        if (feedItem == null || (room = feedItem.getRoom()) == null || room.getId() <= 0) {
            return;
        }
        List<FeedItem> listLJFF = LJFF();
        if (listLJFF != null) {
            size = listLJFF.size();
        } else {
            size = 0;
        }
        ArrayList arrayList2 = null;
        if (size >= 1) {
            List<FeedItem> listLJFF2 = LJFF();
            if (listLJFF2 != null) {
                arrayList = new ArrayList(C15438062q.LJIJJ(listLJFF2, 10));
                Iterator<FeedItem> it2 = listLJFF2.iterator();
                while (it2.hasNext()) {
                    Room room2 = it2.next().getRoom();
                    if (room2 != null) {
                        lValueOf = Long.valueOf(room2.getId());
                    } else {
                        lValueOf = null;
                    }
                    arrayList.add(lValueOf);
                }
            } else {
                arrayList = null;
            }
            strValueOf = String.valueOf(C09HN.LIZ(arrayList));
        } else {
            strValueOf = "";
        }
        List<FeedItem> listLJFF3 = LJFF();
        if (listLJFF3 != null) {
            ArrayList arrayList3 = new ArrayList();
            Iterator<FeedItem> it3 = listLJFF3.iterator();
            while (it3.hasNext()) {
                Room room3 = it3.next().getRoom();
                if (room3 != null) {
                    arrayList3.add(room3);
                }
            }
            arrayList2 = new ArrayList(arrayList3);
        }
        C477500Io0 c477500Io0 = C477500Io0.LIZ;
        long id = room.getId();
        String strRequestId = feedItem.requestId();
        c477500Io0.getClass();
        C477500Io0.LJIJI(c477500Io0, id, room, "toplive_live_cover", null, strRequestId, false, null, strValueOf, null, null, arrayList2, 1, C477500Io0.LJIIIZ(feedItem), null, null, 25448);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x008c  */
    @Override // X.InterfaceC477320Ini
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(int r7, com.bytedance.android.livesdk.model.message.MultiGuestUpdateSkylightMessage r8) {
        /*
            r6 = this;
            r2 = 1
            r4 = 0
            if (r7 == 0) goto L8c
            if (r7 == r2) goto L86
            r0 = 2
            if (r7 == r0) goto L81
            r1 = 3
            if (r7 == r1) goto L7c
            r0 = 4
            if (r7 != r0) goto L8c
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
        L13:
            java.lang.StringBuilder r5 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "onApplyStatusChanged: receive real apply status = "
            r5.append(r0)
            r5.append(r3)
            java.lang.String r0 = " from message = "
            r5.append(r0)
            r5.append(r8)
            java.lang.String r0 = ", roomId = "
            r5.append(r0)
            com.bytedance.android.livesdk.model.message.OutRoomApply r0 = r8.outRoomApplyStatus
            if (r0 == 0) goto L7a
            com.bytedance.android.livesdk.model.message.GuestApplyInfo r0 = r0.guestApplyInfo
            if (r0 == 0) goto L7a
            long r0 = r0.roomId
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
        L3a:
            r5.append(r0)
            java.lang.String r0 = ", rawStatus = "
            r5.append(r0)
            com.bytedance.android.livesdk.model.message.OutRoomApply r0 = r8.outRoomApplyStatus
            if (r0 == 0) goto L50
            com.bytedance.android.livesdk.model.message.GuestApplyInfo r0 = r0.guestApplyInfo
            if (r0 == 0) goto L50
            int r0 = r0.applyStatus
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
        L50:
            r5.append(r4)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r5)
            java.lang.String r0 = "SkylightMultiGuestApplyController"
            X.C20441214yg.LJIIIZ(r0, r1)
            if (r3 == 0) goto L79
            r3.intValue()
            com.bytedance.android.livesdk.model.message.OutRoomApply r0 = r8.outRoomApplyStatus
            if (r0 == 0) goto L76
            com.bytedance.android.livesdk.model.message.GuestApplyInfo r0 = r0.guestApplyInfo
            if (r0 == 0) goto L76
            com.bytedance.android.livesdk.model.message.GuestApplyInfo r1 = LIZIZ(r0)
            int r0 = r3.intValue()
            r1.applyStatus = r0
            r6.LJIIIZ(r1, r2)
        L76:
            r6.LJIIIIZZ()
        L79:
            return
        L7a:
            r0 = r4
            goto L3a
        L7c:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            goto L13
        L81:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            goto L13
        L86:
            r0 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            goto L13
        L8c:
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C477290Inf.LIZ(int, com.bytedance.android.livesdk.model.message.MultiGuestUpdateSkylightMessage):void");
    }

    public final void LJIIIZ(GuestApplyInfo guestApplyInfo, boolean z) {
        Pair<Integer, Pair<Integer, Integer>> pairLJIILLIIL;
        Boolean boolValueOf;
        InterfaceC476860Imy interfaceC476860Imy = this.LIZ;
        if (interfaceC476860Imy != null) {
            pairLJIILLIIL = interfaceC476860Imy.LJIILLIIL(guestApplyInfo, z);
        } else {
            pairLJIILLIIL = null;
        }
        this.LIZLLL.setValue(pairLJIILLIIL);
        NextLiveData<Boolean> nextLiveData = this.LIZIZ;
        if (LJFF() != null) {
            boolValueOf = Boolean.valueOf(!r0.isEmpty());
        } else {
            boolValueOf = Boolean.FALSE;
        }
        nextLiveData.setValue(boolValueOf);
    }
}

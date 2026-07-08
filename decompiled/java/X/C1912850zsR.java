package X;

import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ad.feed.reminder.AdNoticeApi;
import com.ss.android.ugc.aweme.ad.feed.reminder.NoticeUpdateApi;
import com.ss.android.ugc.aweme.feed.model.AdNoticeModel;
import com.ss.android.ugc.aweme.feed.model.live.LiveUser;
import com.ss.android.ugc.aweme.feed.model.live.NewLiveRoomStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0zsR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1912850zsR {
    public C11JF LIZ;
    public C11JF LIZIZ;
    public C11JF LIZJ;
    public final C01GW LIZLLL = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(509));

    public final void LIZ(String str, String str2, C09JN<NewLiveRoomStruct> c09jn, C09JN<Throwable> c09jn2) {
        long j;
        InterfaceC420801kM interfaceC420801kMLJJLL;
        InterfaceC20673515v3 interfaceC20673515v3K4;
        try {
            j = CastLongProtector.parseLong(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            j = 0;
        }
        C11JF c11jf = this.LIZIZ;
        if (c11jf != null) {
            c11jf.dispose();
        }
        ILiveOuterService iLiveOuterService = (ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class);
        if (iLiveOuterService != null && (interfaceC20673515v3K4 = iLiveOuterService.k4()) != null) {
            interfaceC420801kMLJJLL = interfaceC20673515v3K4.LJFF(j, str2).LJJLL(c09jn, c09jn2);
        } else {
            interfaceC420801kMLJJLL = null;
        }
        this.LIZIZ = (C11JF) interfaceC420801kMLJJLL;
    }

    public final void LIZIZ(int i, String str, C09JN<AdNoticeModel> c09jn, C09JN<Throwable> c09jn2) {
        C11JF c11jf = this.LIZJ;
        if (c11jf != null) {
            c11jf.dispose();
        }
        C0TPP c0tpp = C0TPP.LIZ;
        String str2 = C0D80.LIZ;
        c0tpp.getClass();
        this.LIZJ = (C11JF) ((AdNoticeApi) C0TPP.LIZIZ(AdNoticeApi.class, str2)).getAdNotice(i, str).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(c09jn, c09jn2);
    }

    public static void LIZJ(C19EG c19eg, String str, String str2, String str3, NewLiveRoomStruct newLiveRoomStruct) {
        Integer numValueOf;
        EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
        if (Intrinsics.LJFF(str, "message_ad")) {
            EnterRoomConfig.RoomsData roomsData = enterRoomConfig.mRoomsData;
            roomsData.enterFromMerge = "message";
            roomsData.enterMethod = "countdown_sticker";
        } else {
            EnterRoomConfig.RoomsData roomsData2 = enterRoomConfig.mRoomsData;
            roomsData2.enterFromMerge = "feed";
            roomsData2.enterMethod = "countdown_sticker";
        }
        EnterRoomConfig.RoomsData roomsData3 = enterRoomConfig.mRoomsData;
        roomsData3.userId = str2;
        LiveUser liveUser = newLiveRoomStruct.owner;
        if (liveUser != null) {
            numValueOf = Integer.valueOf(liveUser.secret);
        } else {
            numValueOf = null;
        }
        roomsData3.isSecret = numValueOf;
        enterRoomConfig.mRoomsData.secUid = str3;
        ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).z5().LIZIZ(c19eg, newLiveRoomStruct, enterRoomConfig);
    }

    public final void LIZLLL(int i, String str, String str2, Boolean bool, C09JN<AdNoticeModel> c09jn, C09JN<Throwable> c09jn2) {
        C11JF c11jf = this.LIZ;
        if (c11jf != null) {
            c11jf.dispose();
        }
        C0TPP.LIZ.getClass();
        this.LIZ = (C11JF) ((NoticeUpdateApi) C0TPP.LIZ(NoticeUpdateApi.class)).postAdNotice(i, str, bool, str2).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(c09jn, c09jn2);
    }
}

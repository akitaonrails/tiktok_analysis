package X;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.ies.ugc.aweme.rich.model.GMTBaseModel;
import com.bytedance.ies.ugc.aweme.rich.model.feed.model.AwemeSplashInfo;
import com.ss.android.ugc.aweme.commercialize.live.service.ICommercializeLiveService;
import com.ss.android.ugc.aweme.feed.api.FeedLiveRoomApi;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.AwemeSaaSExtKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.live.response.BaseResponse;
import com.ss.android.ugc.aweme.live.response.Extra;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.AwS560S0100000_16;

/* JADX INFO: renamed from: X.0chx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1022230chx extends AbstractC1026640cp4<C1022250chz> {
    public static final C1026670cp7 LJIJ = new C1026670cp7(1, "network_failed");
    public static final C1026670cp7 LJIJI = new C1026670cp7(-1, "live_status_changed");
    public final C1022250chz LJIILL;
    public final String LJIILLIIL = "live";
    public final C01GW LJIIZILJ = C452501pT.LIZIZ(new AwS560S0100000_16(this, 881));

    @Override // X.InterfaceC1026870cpR
    public final String getUrl() {
        return null;
    }

    public final Aweme LJIJJ() {
        return (Aweme) this.LJIIZILJ.getValue();
    }

    @Override // X.InterfaceC1026720cpC
    public final boolean LJ() {
        User author;
        AwemeRawAd awemeRawAdLJJIJLIJ;
        AwemeSplashInfo splashInfo;
        Aweme awemeLJIJJ;
        User author2;
        GMTBaseModel gMTBaseModel = LJIIIZ().LJ;
        if (gMTBaseModel != null && (splashInfo = gMTBaseModel.getSplashInfo()) != null && LJIJJLI() && (splashInfo.hasUpdateLiving || ((awemeLJIJJ = LJIJJ()) != null && (author2 = awemeLJIJJ.getAuthor()) != null && author2.isLive()))) {
            return true;
        }
        Aweme awemeLJIJJ2 = LJIJJ();
        if (awemeLJIJJ2 != null && AwemeSaaSExtKt.isLive(awemeLJIJJ2)) {
            return true;
        }
        Aweme awemeLJIJJ3 = LJIJJ();
        if (awemeLJIJJ3 == null || ((((author = awemeLJIJJ3.getAuthor()) == null || !author.isLive()) && !C1017070cZd.LIZLLL(awemeLJIJJ3)) || (awemeRawAdLJJIJLIJ = C1017070cZd.LJJIJLIJ(awemeLJIJJ3)) == null || awemeRawAdLJJIJLIJ.getAdLive() == null)) {
            return LJIJJ() != null && C1017070cZd.LJIIIIZZ(LJIJJ());
        }
        return true;
    }

    public final boolean LJIJJLI() {
        AwemeSplashInfo splashInfo;
        String awesomeSplashId;
        GMTBaseModel gMTBaseModel = LJIIIZ().LJ;
        return (gMTBaseModel == null || (splashInfo = gMTBaseModel.getSplashInfo()) == null || (awesomeSplashId = splashInfo.getAwesomeSplashId()) == null || awesomeSplashId.length() == 0 || splashInfo.getSplashFeedType() != 2) ? false : true;
    }

    @Override // X.AbstractC1026640cp4
    public final /* bridge */ /* synthetic */ AbstractC1026880cpS LJIILL() {
        return this.LJIILL;
    }

    @Override // X.AbstractC1026640cp4
    public final String LJIILLIIL() {
        return this.LJIILLIIL;
    }

    public C1022230chx(C1022250chz c1022250chz) {
        this.LJIILL = c1022250chz;
    }

    @Override // X.InterfaceC1026720cpC
    public final Object LIZLLL(C1026650cp5 c1026650cp5) {
        long jLongValue;
        AwemeSplashInfo splashInfo;
        String uid;
        Long lLJIILIIL;
        if (LJIJJLI()) {
            final Aweme awemeLJIJJ = LJIJJ();
            if (awemeLJIJJ == null) {
                return C1026670cp7.LJ;
            }
            final User author = awemeLJIJJ.getAuthor();
            if (author == null) {
                return C1026670cp7.LJ;
            }
            User author2 = awemeLJIJJ.getAuthor();
            if (author2 != null && (uid = author2.getUid()) != null && (lLJIILIIL = C2095008Iq.LJIILIIL(uid)) != null) {
                jLongValue = lLJIILIIL.longValue();
            } else {
                jLongValue = 0;
            }
            GMTBaseModel gMTBaseModel = LJIIIZ().LJ;
            if (gMTBaseModel != null && (splashInfo = gMTBaseModel.getSplashInfo()) != null && splashInfo.hasUpdateLiving) {
                ((ICommercializeLiveService) ServiceManager.get().getService(ICommercializeLiveService.class)).LJIIIZ(LJIIJ(), awemeLJIJJ, LJIIIIZZ(), null, false);
                return C1026670cp7.LIZLLL;
            }
            final C23260099m c23260099m = new C23260099m(C099M.LIZLLL(c1026650cp5));
            FeedLiveRoomApi.LIZ.queryTopViewLiveRoomInfo(jLongValue, author.getSecUid()).enqueue(new InterfaceC594300NSq<BaseResponse<Room, Extra>>() { // from class: X.0chw
                @Override // X.InterfaceC594300NSq
                public final void onFailure(C0X9S<BaseResponse<Room, Extra>> c0x9s, Throwable th) {
                    C2184171Adz.LIZLLL(this.LJIIZILJ(), "live_show_failed", C1017070cZd.LJJIJLIJ(awemeLJIJJ)).LJII();
                    InterfaceC1364105Vn<C1026670cp7> interfaceC1364105Vn = c23260099m;
                    C1026670cp7 c1026670cp7 = C1022230chx.LJIJ;
                    C189200o6.m2constructorimpl(c1026670cp7);
                    interfaceC1364105Vn.resumeWith(c1026670cp7);
                }

                @Override // X.InterfaceC594300NSq
                public final void onResponse(C0X9S<BaseResponse<Room, Extra>> c0x9s, C0X52<BaseResponse<Room, Extra>> c0x52) {
                    BaseResponse<Room, Extra> baseResponse;
                    Room room;
                    EnterRoomConfig enterRoomConfigLJJIZ;
                    if (c0x52.LIZJ() && (baseResponse = c0x52.LIZIZ) != null && (room = baseResponse.data) != null && room.getId() > 0 && room.getStatus() == 2) {
                        InterfaceC1364105Vn<C1026670cp7> interfaceC1364105Vn = c23260099m;
                        Aweme aweme = awemeLJIJJ;
                        C1022230chx c1022230chx = this;
                        User user = author;
                        InterfaceC20673515v3 interfaceC20673515v3K4 = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).k4();
                        if (interfaceC20673515v3K4 != null && (enterRoomConfigLJJIZ = interfaceC20673515v3K4.LJJIZ(room)) != null) {
                            ((ICommercializeLiveService) ServiceManager.get().getService(ICommercializeLiveService.class)).LJIILJJIL(aweme, enterRoomConfigLJJIZ, c1022230chx.LJIIIIZZ(), c1022230chx.LJIILL.LIZJ);
                            ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).z5().LJIIIIZZ(c1022230chx.LJIIJ(), user, enterRoomConfigLJJIZ);
                            ((ICommercializeLiveService) ServiceManager.get().getService(ICommercializeLiveService.class)).LJIIJ();
                        } else {
                            C1026670cp7 c1026670cp7 = C1026670cp7.LJ;
                            C189200o6.m2constructorimpl(c1026670cp7);
                            interfaceC1364105Vn.resumeWith(c1026670cp7);
                        }
                        C1026670cp7 c1026670cp72 = C1026670cp7.LIZLLL;
                        C189200o6.m2constructorimpl(c1026670cp72);
                        interfaceC1364105Vn.resumeWith(c1026670cp72);
                    }
                    InterfaceC1364105Vn<C1026670cp7> interfaceC1364105Vn2 = c23260099m;
                    C1026670cp7 c1026670cp73 = C1022230chx.LJIJI;
                    C189200o6.m2constructorimpl(c1026670cp73);
                    interfaceC1364105Vn2.resumeWith(c1026670cp73);
                }
            });
            Object objLIZ = c23260099m.LIZ();
            if (objLIZ != C099R.LJFF()) {
                return objLIZ;
            }
            C099Q.LIZJ(c1026650cp5);
            return objLIZ;
        }
        Aweme awemeLJIJJ2 = LJIJJ();
        if (awemeLJIJJ2 != null) {
            ((ICommercializeLiveService) ServiceManager.get().getService(ICommercializeLiveService.class)).LJIIIZ(LJIIJ(), awemeLJIJJ2, LJIIIIZZ(), null, false);
        }
        return C1026670cp7.LIZLLL;
    }
}

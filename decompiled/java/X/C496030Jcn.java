package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.network.combine.exp.LiveCombineRequestExp;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.model.Extra;
import com.bytedance.android.livesdk.model.UserAttr;
import com.bytedance.android.livesdk.profile.api.ProfileApi;
import com.bytedance.android.livesdk.profile.dao.LiveProfilePreloadViewModel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import webcast.api.room.BusinessDataFilter;
import webcast.api.room.GetRoomProfileCardRequest;
import webcast.api.room.GetRoomProfileCardResponse;

/* JADX INFO: renamed from: X.0Jcn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.bytedance.android.livesdk.profile.dao.LiveProfilePreloadViewModel$preloadAnchor$1", f = "LiveProfilePreloadViewModel.kt", l = {296}, m = "invokeSuspend")
public final class C496030Jcn extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ User LLILLJJLI;
    public final /* synthetic */ LiveProfilePreloadViewModel LLILLL;
    public final /* synthetic */ Room LLILZ;
    public final /* synthetic */ boolean LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C496030Jcn(User user, LiveProfilePreloadViewModel liveProfilePreloadViewModel, Room room, boolean z, InterfaceC1364105Vn<? super C496030Jcn> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = user;
        this.LLILLL = liveProfilePreloadViewModel;
        this.LLILZ = room;
        this.LLILZIL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C496030Jcn(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        boolean z2;
        int i;
        C11NZ<BaseResponse<GetRoomProfileCardResponse.ResponseData, Extra>> c11nzQueryProfileCardResponse;
        Object objLJJJJL = obj;
        C1C7U.LIZ("LiveProfilePreloadViewModel@f73e.preloadAnchor$1");
        Object objLJFF = C099R.LJFF();
        int i2 = this.LL;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(objLJJJJL);
            } else {
                C155000ia.LIZIZ(objLJJJJL);
                User user = this.LLILLJJLI;
                User.EnigmaInfo enigmaInfo = user.enigmaInfo;
                boolean z3 = false;
                if (enigmaInfo != null && enigmaInfo.isEnigmaMaskOn) {
                    z = true;
                } else {
                    z = false;
                }
                int i3 = 2;
                if (z) {
                    i = 32;
                } else {
                    UserAttr userAttr = user.getUserAttr();
                    if (userAttr != null && userAttr.isAdmin) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        i = 2;
                    } else {
                        i = 1;
                    }
                }
                if (LiveCombineRequestExp.INSTANCE.enableForRequest("/webcast/room/profile_card/")) {
                    c11nzQueryProfileCardResponse = C497120JeY.LJIIZILJ.LIZIZ("/webcast/room/profile_card/", new C496070Jcr(this.LLILZ, this.LLILLJJLI, i, this.LLILZIL));
                } else {
                    C480460Ism.LIZ().getClass();
                    ProfileApi profileApi = (ProfileApi) C480460Ism.LIZLLL(ProfileApi.class);
                    GetRoomProfileCardRequest getRoomProfileCardRequest = new GetRoomProfileCardRequest();
                    Room room = this.LLILZ;
                    User user2 = this.LLILLJJLI;
                    boolean z4 = this.LLILZIL;
                    getRoomProfileCardRequest.roomId = room.getId();
                    getRoomProfileCardRequest.anchorId = room.getOwnerUserId();
                    getRoomProfileCardRequest.targetUserId = room.getOwnerUserId();
                    getRoomProfileCardRequest.userRole = GsonProtectorUtils.toJson(C19748512Ol.LIZIZ, C2097608Jq.LJIIIIZZ(new Pair(C2286608xc.LJFF(user2.getId()), C2286608xc.LJ(i)), new Pair(C2286608xc.LJFF(getRoomProfileCardRequest.targetUserId), C2286608xc.LJ(4))));
                    IInteractService iInteractService = (IInteractService) C1161920gLG.LIZJ(IInteractService.class);
                    User user3 = new User();
                    user3.setId(user2.getId());
                    int i4 = C489100JGa.LIZ[iInteractService.ND(user3).ordinal()];
                    if (i4 != 1) {
                        if (i4 != 2) {
                            if (i4 != 3) {
                                i3 = 0;
                            }
                        } else {
                            i3 = 3;
                        }
                    } else {
                        i3 = 1;
                    }
                    getRoomProfileCardRequest.galleryEntranceScene = i3;
                    BusinessDataFilter businessDataFilter = new BusinessDataFilter();
                    businessDataFilter.needUser = true;
                    businessDataFilter.needGiftGalleryEntrance = z4;
                    getRoomProfileCardRequest.businessDataFilter = businessDataFilter;
                    if (i == 32) {
                        z3 = true;
                    }
                    getRoomProfileCardRequest.canRecognizeEnigmaRole = z3;
                    c11nzQueryProfileCardResponse = profileApi.queryProfileCardResponse(getRoomProfileCardRequest);
                }
                this.LL = 1;
                objLJJJJL = C500260Jjc.LJJJJL(c11nzQueryProfileCardResponse, this);
                if (objLJJJJL == objLJFF) {
                    C1C7U.LIZIZ("LiveProfilePreloadViewModel@f73e.preloadAnchor$1");
                    return objLJFF;
                }
            }
            this.LLILLL.LL = new C495930Jcd((BaseResponse) objLJJJJL, 6);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LiveProfilePreloadViewModel@f73e.preloadAnchor$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

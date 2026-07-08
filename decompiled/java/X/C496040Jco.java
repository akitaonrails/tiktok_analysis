package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.model.Extra;
import com.bytedance.android.livesdk.profile.api.ProfileApi;
import com.bytedance.android.livesdk.profile.dao.LiveProfilePreloadViewModel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;
import webcast.api.room.BusinessDataFilter;
import webcast.api.room.GetRoomProfileCardRequest;
import webcast.api.room.GetRoomProfileCardResponse;

/* JADX INFO: renamed from: X.0Jco, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.bytedance.android.livesdk.profile.dao.LiveProfilePreloadViewModel$preloadNext$1", f = "LiveProfilePreloadViewModel.kt", l = {176}, m = "invokeSuspend")
public final class C496040Jco extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C495950Jcf LLILLJJLI;
    public final /* synthetic */ LiveProfilePreloadViewModel LLILLL;
    public final /* synthetic */ Function1<BaseResponse<GetRoomProfileCardResponse.ResponseData, Extra>, Unit> LLILZ;
    public final /* synthetic */ long LLILZIL;
    public final /* synthetic */ Room LLILZLL;
    public final /* synthetic */ User LLIZ;
    public final /* synthetic */ boolean LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C496040Jco(C495950Jcf c495950Jcf, LiveProfilePreloadViewModel liveProfilePreloadViewModel, Function1<? super BaseResponse<GetRoomProfileCardResponse.ResponseData, Extra>, Unit> function1, long j, Room room, User user, boolean z, InterfaceC1364105Vn<? super C496040Jco> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c495950Jcf;
        this.LLILLL = liveProfilePreloadViewModel;
        this.LLILZ = function1;
        this.LLILZIL = j;
        this.LLILZLL = room;
        this.LLIZ = user;
        this.LLIZLLLIL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C496040Jco(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        int i;
        int i2;
        Object objLJJJJL = obj;
        C1C7U.LIZ("LiveProfilePreloadViewModel@f73e.preloadNext$1");
        Object objLJFF = C099R.LJFF();
        int i3 = this.LL;
        try {
            if (i3 != 0) {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(objLJJJJL);
            } else {
                C155000ia.LIZIZ(objLJJJJL);
                int iLIZIZ = this.LLILLJJLI.LIZIZ();
                C495950Jcf c495950Jcf = this.LLILLJJLI;
                boolean z2 = false;
                if (!c495950Jcf.LIZLLL && c495950Jcf.LIZIZ) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    i = 32;
                } else if (c495950Jcf.LJII) {
                    i = 4;
                } else {
                    i = 8;
                }
                C480460Ism.LIZ().getClass();
                ProfileApi profileApi = (ProfileApi) C480460Ism.LIZLLL(ProfileApi.class);
                GetRoomProfileCardRequest getRoomProfileCardRequest = new GetRoomProfileCardRequest();
                Room room = this.LLILZLL;
                long j = this.LLILZIL;
                User user = this.LLIZ;
                boolean z3 = this.LLIZLLLIL;
                getRoomProfileCardRequest.roomId = room.getId();
                getRoomProfileCardRequest.anchorId = room.getOwnerUserId();
                getRoomProfileCardRequest.targetUserId = j;
                getRoomProfileCardRequest.userRole = GsonProtectorUtils.toJson(C19748512Ol.LIZIZ, C2097608Jq.LJIIIIZZ(new Pair(C2286608xc.LJFF(user.getId()), C2286608xc.LJ(iLIZIZ)), new Pair(C2286608xc.LJFF(j), C2286608xc.LJ(i))));
                IInteractService iInteractService = (IInteractService) C1161920gLG.LIZJ(IInteractService.class);
                User user2 = new User();
                user2.setId(user.getId());
                int i4 = C0JGP.LIZ[iInteractService.ND(user2).ordinal()];
                if (i4 != 1) {
                    i2 = 3;
                    if (i4 != 2) {
                        if (i4 != 3) {
                            i2 = 0;
                        } else {
                            i2 = 2;
                        }
                    }
                } else {
                    i2 = 1;
                }
                getRoomProfileCardRequest.galleryEntranceScene = i2;
                BusinessDataFilter businessDataFilter = new BusinessDataFilter();
                businessDataFilter.needUser = true;
                businessDataFilter.needGiftGalleryEntrance = z3;
                getRoomProfileCardRequest.businessDataFilter = businessDataFilter;
                if (iLIZIZ == 32) {
                    z2 = true;
                }
                getRoomProfileCardRequest.canRecognizeEnigmaRole = z2;
                C11NZ<BaseResponse<GetRoomProfileCardResponse.ResponseData, Extra>> c11nzQueryProfileCardResponse = profileApi.queryProfileCardResponse(getRoomProfileCardRequest);
                this.LLILLL.LLILZ = this.LLILZ;
                this.LL = 1;
                objLJJJJL = C500260Jjc.LJJJJL(c11nzQueryProfileCardResponse, this);
                if (objLJJJJL == objLJFF) {
                    C1C7U.LIZIZ("LiveProfilePreloadViewModel@f73e.preloadNext$1");
                    return objLJFF;
                }
            }
            BaseResponse baseResponse = (BaseResponse) objLJJJJL;
            Function1<? super BaseResponse<GetRoomProfileCardResponse.ResponseData, Extra>, Unit> function1 = this.LLILLL.LLILZ;
            if (function1 != null) {
                function1.invoke(baseResponse);
            }
            if (this.LLILLJJLI.LJII) {
                this.LLILLL.LL = new C495930Jcd(baseResponse, 6);
            } else {
                this.LLILLL.LLILLJJLI.LIZLLL(C2286608xc.LJFF(this.LLILZIL), new C495930Jcd(baseResponse, 6));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LiveProfilePreloadViewModel@f73e.preloadNext$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

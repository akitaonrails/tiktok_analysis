package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.model.Extra;
import com.bytedance.android.livesdk.profile.api.ProfileApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import webcast.api.room.BusinessDataFilter;
import webcast.api.room.GetRoomProfileCardRequest;
import webcast.api.room.GetRoomProfileCardResponse;

/* JADX INFO: renamed from: X.0Jcm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.bytedance.android.livesdk.profile.dao.LiveProfileRepositoryForAudience$asyncRequest$profileCardDeferred$1", f = "LiveProfileRepositoryForAudience.kt", l = {73}, m = "invokeSuspend")
public final class C496020Jcm extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super BaseResponse<GetRoomProfileCardResponse.ResponseData, Extra>>, Object> {
    public int LL;
    public final /* synthetic */ C496050Jcp LLILLJJLI;
    public final /* synthetic */ BusinessDataFilter LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C496020Jcm(C496050Jcp c496050Jcp, BusinessDataFilter businessDataFilter, InterfaceC1364105Vn<? super C496020Jcm> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c496050Jcp;
        this.LLILLL = businessDataFilter;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C496020Jcm(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        long id;
        int i;
        C1C7U.LIZ("LiveProfileRepositoryForAudience@66ce.asyncRequest$profileCardDeferred$1");
        Object objLJFF = C099R.LJFF();
        int i2 = this.LL;
        if (i2 != 0) {
            if (i2 == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C480460Ism.LIZ().getClass();
            ProfileApi profileApi = (ProfileApi) C480460Ism.LIZLLL(ProfileApi.class);
            GetRoomProfileCardRequest getRoomProfileCardRequest = new GetRoomProfileCardRequest();
            C496050Jcp c496050Jcp = this.LLILLJJLI;
            BusinessDataFilter businessDataFilter = this.LLILLL;
            getRoomProfileCardRequest.roomId = c496050Jcp.LIZ.LJFF.getId();
            User owner = c496050Jcp.LIZ.LJFF.getOwner();
            if (owner != null) {
                id = owner.getId();
            } else {
                id = 0;
            }
            getRoomProfileCardRequest.anchorId = id;
            C495920Jcc c495920Jcc = c496050Jcp.LIZ;
            getRoomProfileCardRequest.targetUserId = c495920Jcc.LJII;
            getRoomProfileCardRequest.userRole = C2348809Ig.LJIIIIZZ(c495920Jcc.LIZIZ());
            IInteractService iInteractService = (IInteractService) C1161920gLG.LIZJ(IInteractService.class);
            User user = new User();
            user.setId(c496050Jcp.LIZ.LJI.getId());
            int i3 = C0JGQ.LIZ[iInteractService.ND(user).ordinal()];
            if (i3 != 1) {
                i = 3;
                if (i3 != 2) {
                    if (i3 != 3) {
                        i = 0;
                    } else {
                        i = 2;
                    }
                }
            } else {
                i = 1;
            }
            getRoomProfileCardRequest.galleryEntranceScene = i;
            getRoomProfileCardRequest.businessDataFilter = businessDataFilter;
            getRoomProfileCardRequest.canRecognizeEnigmaRole = c496050Jcp.LIZ.LJIIIIZZ.isCanRecognizeEnigma();
            C11NZ<BaseResponse<GetRoomProfileCardResponse.ResponseData, Extra>> c11nzQueryProfileCardResponse = profileApi.queryProfileCardResponse(getRoomProfileCardRequest);
            this.LL = 1;
            obj = C500260Jjc.LJJJJL(c11nzQueryProfileCardResponse, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("LiveProfileRepositoryForAudience@66ce.asyncRequest$profileCardDeferred$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("LiveProfileRepositoryForAudience@66ce.asyncRequest$profileCardDeferred$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super BaseResponse<GetRoomProfileCardResponse.ResponseData, Extra>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

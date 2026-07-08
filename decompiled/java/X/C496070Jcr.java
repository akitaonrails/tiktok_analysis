package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.model.Extra;
import com.bytedance.android.livesdk.profile.api.ProfileApi;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import webcast.api.room.BusinessDataFilter;
import webcast.api.room.GetRoomProfileCardRequest;
import webcast.api.room.GetRoomProfileCardResponse;

/* JADX INFO: renamed from: X.0Jcr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C496070Jcr extends C09AY implements Function0<C11NZ<BaseResponse<GetRoomProfileCardResponse.ResponseData, Extra>>> {
    public final /* synthetic */ Room LL;
    public final /* synthetic */ User LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ boolean LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C496070Jcr(Room room, User user, int i, boolean z) {
        super(0);
        this.LL = room;
        this.LLILLJJLI = user;
        this.LLILLL = i;
        this.LLILZ = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C11NZ<BaseResponse<GetRoomProfileCardResponse.ResponseData, Extra>> invoke() {
        C480460Ism.LIZ().getClass();
        ProfileApi profileApi = (ProfileApi) C480460Ism.LIZLLL(ProfileApi.class);
        GetRoomProfileCardRequest getRoomProfileCardRequest = new GetRoomProfileCardRequest();
        Room room = this.LL;
        User user = this.LLILLJJLI;
        int i = this.LLILLL;
        boolean z = this.LLILZ;
        getRoomProfileCardRequest.roomId = room.getId();
        getRoomProfileCardRequest.anchorId = room.getOwnerUserId();
        getRoomProfileCardRequest.targetUserId = room.getOwnerUserId();
        int i2 = 2;
        getRoomProfileCardRequest.userRole = GsonProtectorUtils.toJson(C19748512Ol.LIZIZ, C2097608Jq.LJIIIIZZ(new Pair(Long.valueOf(user.getId()), Integer.valueOf(i)), new Pair(Long.valueOf(getRoomProfileCardRequest.targetUserId), 4)));
        IInteractService iInteractService = (IInteractService) C1161920gLG.LIZJ(IInteractService.class);
        User user2 = new User();
        user2.setId(user.getId());
        int i3 = C0JGO.LIZ[iInteractService.ND(user2).ordinal()];
        if (i3 == 1) {
            i2 = 1;
        } else if (i3 == 2) {
            i2 = 3;
        } else if (i3 != 3) {
            i2 = 0;
        }
        getRoomProfileCardRequest.galleryEntranceScene = i2;
        BusinessDataFilter businessDataFilter = new BusinessDataFilter();
        businessDataFilter.needUser = true;
        businessDataFilter.needGiftGalleryEntrance = z;
        getRoomProfileCardRequest.businessDataFilter = businessDataFilter;
        getRoomProfileCardRequest.canRecognizeEnigmaRole = i == 32;
        return profileApi.queryProfileCardResponse(getRoomProfileCardRequest);
    }
}

package X;

import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.model.Extra;
import com.bytedance.android.livesdkapi.depend.model.follow.FollowPair;
import webcast.api.room.GetRoomProfileCardResponse;

/* JADX INFO: renamed from: X.0Jcd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C495930Jcd {
    public final BaseResponse<GetRoomProfileCardResponse.ResponseData, Extra> LIZ;
    public FollowPair LIZIZ;
    public Integer LIZJ;

    public C495930Jcd() {
        this(null, 7);
    }

    public C495930Jcd(BaseResponse baseResponse, int i) {
        this.LIZ = (i & 1) != 0 ? null : baseResponse;
        this.LIZIZ = null;
        this.LIZJ = null;
    }
}

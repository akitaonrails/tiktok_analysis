package X;

import android.content.Context;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.live.deeplink.UserIdResponse;
import com.ss.android.ugc.aweme.live.livehostimpl.LiveHostWatch;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0IQK, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IQK extends C09AY implements Function1<UserIdResponse, Unit> {
    public final /* synthetic */ EnterRoomConfig LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ LiveHostWatch LLILLL;
    public final /* synthetic */ Context LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0IQK(Context context, EnterRoomConfig enterRoomConfig, LiveHostWatch liveHostWatch, String str) {
        super(1);
        this.LL = enterRoomConfig;
        this.LLILLJJLI = str;
        this.LLILLL = liveHostWatch;
        this.LLILZ = context;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(UserIdResponse userIdResponse) {
        long jLongValue;
        Long lLJIILIIL;
        UserIdResponse userIdResponse2 = userIdResponse;
        if (userIdResponse2 != null) {
            EnterRoomConfig.RoomsData roomsData = this.LL.mRoomsData;
            String str = userIdResponse2.room_id;
            long jLongValue2 = 0;
            if (str != null && (lLJIILIIL = C2095008Iq.LJIILIIL(str)) != null) {
                jLongValue = lLJIILIIL.longValue();
            } else {
                jLongValue = 0;
            }
            roomsData.roomId = jLongValue;
            EnterRoomConfig.RoomsData roomsData2 = this.LL.mRoomsData;
            roomsData2.secUid = userIdResponse2.sec_uid;
            String str2 = userIdResponse2.user_id;
            roomsData2.userId = str2;
            EnterRoomConfig.GuestUser guestUser = roomsData2.guestUser;
            if (guestUser != null && guestUser.uid == 0) {
                if (str2 != null) {
                    try {
                        Long lLJIILIIL2 = C2095008Iq.LJIILIIL(str2);
                        if (lLJIILIIL2 != null) {
                            jLongValue2 = lLJIILIIL2.longValue();
                        }
                    } catch (NumberFormatException e) {
                        TryCatchGuardChecker.doCheck(e);
                        EnterRoomConfig.GuestUser guestUser2 = this.LL.mRoomsData.guestUser;
                        if (guestUser2 != null) {
                            guestUser2.uid = -1L;
                        }
                    }
                }
                guestUser.uid = jLongValue2;
                EnterRoomConfig.GuestUser guestUser3 = this.LL.mRoomsData.guestUser;
                if (guestUser3 != null) {
                    guestUser3.nickName = this.LLILLJJLI;
                }
            }
            this.LLILLL.watchLiveFromSchema(this.LLILZ, this.LL);
        } else {
            C766270U4b.LJIIIZ(this.LLILZ, C497740JfY.LJII().getString(2131853475));
            LiveHostWatch liveHostWatch = this.LLILLL;
            EnterRoomConfig enterRoomConfig = this.LL;
            liveHostWatch.getClass();
            LiveHostWatch.LIZIZ(enterRoomConfig, "network_error");
        }
        return Unit.LIZ;
    }
}

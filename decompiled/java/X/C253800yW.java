package X;

import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.livesdk.gift.model.GiftStrategyData;
import com.bytedance.android.livesdk.gift.model.GiftsInfo;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.00yW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C253800yW extends C09AY implements Function1<Function1<? super Boolean, ? extends Unit>, Unit> {
    public final /* synthetic */ long LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C253800yW(long j, String str) {
        super(1);
        this.LL = j;
        this.LLILLJJLI = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Function1<? super Boolean, ? extends Unit> function1) {
        long id;
        boolean z;
        final Function1<? super Boolean, ? extends Unit> function12 = function1;
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null) {
            id = room.getId();
        } else {
            id = 0;
        }
        if (room != null && UserService.getInstance().user().getCurrentUserId() == room.getOwnerUserId()) {
            z = true;
        } else {
            z = false;
        }
        IGiftService iGiftService = (IGiftService) C1161920gLG.LIZJ(IGiftService.class);
        final long j = this.LL;
        final String str = this.LLILLJJLI;
        iGiftService.syncGiftList(new AbstractC1132980faa() { // from class: X.00yX
            @Override // X.AbstractC1132980faa
            public final void LIZ(int i, String str2) {
                function12.invoke(Boolean.FALSE);
            }

            @Override // X.AbstractC1132980faa
            public final void LIZJ(List list, GiftsInfo giftsInfo, GiftStrategyData giftStrategyData, long j2, int i) {
                function12.invoke(Boolean.valueOf(C252800yM.LIZ(j, str, list)));
            }
        }, id, 26, z);
        return Unit.LIZ;
    }
}

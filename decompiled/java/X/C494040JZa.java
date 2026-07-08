package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subonlylive.setting.SubOnlyLiveSettingDialogNew;
import com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0JZa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C494040JZa extends C09AY implements Function0<Unit> {
    public final /* synthetic */ Room LL;
    public final /* synthetic */ DataChannel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C494040JZa(Room room, DataChannel dataChannel) {
        super(0);
        this.LL = room;
        this.LLILLJJLI = dataChannel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_sub_only_live_music_guide_capsule_click");
        c474500IjALIZ.LJIL();
        Room room = this.LL;
        c474500IjALIZ.LJJII(room != null ? Long.valueOf(room.getOwnerUserId()) : null, "anchor_id");
        Room room2 = this.LL;
        c474500IjALIZ.LJJII(room2 != null ? Long.valueOf(room2.getId()) : null, "room_id");
        c474500IjALIZ.LIZ();
        C493910JYn c493910JYn = SubOnlyLiveSettingDialogNew.LLJLL;
        DataChannel dataChannel = this.LLILLJJLI;
        boolean zKw0 = ((IFansClubService) C1161920gLG.LIZJ(IFansClubService.class)).Kw0(this.LLILLJJLI);
        c493910JYn.getClass();
        C493910JYn.LIZ(dataChannel, "sub_only_live_music_capsule", null, "", true, zKw0);
        return Unit.LIZ;
    }
}

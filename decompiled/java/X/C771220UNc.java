package X;

import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: renamed from: X.0UNc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C771220UNc {
    public static final C771220UNc LIZ = new C771220UNc();

    public static final void LIZ(DataChannel dataChannel) {
        if (C1086800eO6.LIZJ) {
            IBroadcastService iBroadcastService = (IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class);
            if (iBroadcastService != null) {
                iBroadcastService.notifyStartAbilityChange(EnumC773040UUc.LIGHTING_QUESTION, EnumC771230UNd.START_FAIL);
            }
            C766270U4b.LIZLLL(2131842939);
            return;
        }
        C0UNT c0unt = C0UNT.LIZ;
        C0UNT.LIZ.LIZIZ(1, 3, 0, new AwS591S0100000_12(dataChannel, 1246));
    }
}

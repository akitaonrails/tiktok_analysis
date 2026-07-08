package X;

import com.bytedance.android.livesdk.signaling.model.downlink.GameDualDeviceSignalData;
import com.bytedance.android.livesdk.signaling.model.downlink.GameDualDeviceSignalUploadData;
import com.ss.android.ugc.aweme.hangout.component.interact.model.MultiTopLiveRoomMatchScene;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: X.0J60, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0J60 extends C0J66<GameDualDeviceSignalUploadData, GameDualDeviceSignalData> {
    public C0J60() {
        super(new GameDualDeviceSignalUploadData(1, "", "", 123L, ""), "game", null);
    }

    @Override // X.C0J66
    public final Class<GameDualDeviceSignalData> LJIIIIZZ() {
        return GameDualDeviceSignalData.class;
    }

    @Override // X.C0J66
    public final boolean LJIIIZ() {
        return this instanceof MultiTopLiveRoomMatchScene;
    }

    @Override // X.C0J66
    public final List LJFF(GameDualDeviceSignalUploadData gameDualDeviceSignalUploadData) {
        return Collections.singletonList(C0J66.LIZIZ(this, "game", "rtc_info_sync", gameDualDeviceSignalUploadData));
    }
}

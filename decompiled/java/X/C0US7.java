package X;

import com.bytedance.android.live.room.OneTapGoLiveEvent;
import com.bytedance.android.livesdk.broadcast.preview.onetap.OneTapGoLiveManager;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0US7, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class C0US7 extends C2217421BqW implements Function1<Room, Unit> {
    public C0US7(Object obj) {
        super(1, obj, OneTapGoLiveManager.class, "handleCanLinkMic", "handleCanLinkMic(Lcom/bytedance/android/livesdkapi/depend/model/live/Room;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Room room) {
        OneTapGoLiveManager oneTapGoLiveManager = (OneTapGoLiveManager) this.receiver;
        oneTapGoLiveManager.LJIIJ();
        DataChannelGlobal.LLILZ.FQ2(OneTapGoLiveEvent.class, new C772560USg(oneTapGoLiveManager.LLILZIL, Integer.valueOf(oneTapGoLiveManager.LLILZLL), 12));
        return Unit.LIZ;
    }
}

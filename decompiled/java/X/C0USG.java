package X;

import com.bytedance.android.livesdk.broadcast.preview.onetap.OneTapGoLiveManager;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0USG, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class C0USG extends C2217421BqW implements Function1<Room, Unit> {
    public C0USG(Object obj) {
        super(1, obj, OneTapGoLiveManager.class, "jumpToLive", "jumpToLive(Lcom/bytedance/android/livesdkapi/depend/model/live/Room;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Room room) {
        ((OneTapGoLiveManager) this.receiver).LJIJI(room);
        return Unit.LIZ;
    }
}

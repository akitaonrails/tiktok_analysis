package X;

import com.bytedance.android.livesdk.broadcast.preview.widget.startlive.PreviewStartLiveWidget;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0URM, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class C0URM extends C2217421BqW implements Function1<Room, Unit> {
    public C0URM(PreviewStartLiveWidget previewStartLiveWidget) {
        super(1, previewStartLiveWidget, PreviewStartLiveWidget.class, "handleCreateRoomSuccess", "handleCreateRoomSuccess(Lcom/bytedance/android/livesdkapi/depend/model/live/Room;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Room room) throws JSONException {
        ((PreviewStartLiveWidget) this.receiver).M1(room);
        return Unit.LIZ;
    }
}

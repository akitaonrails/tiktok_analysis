package X;

import com.bytedance.android.livesdk.chatroom.detail.RoomPlayer2;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0It2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C480620It2 implements InterfaceC480660It6 {
    public final InterfaceC480660It6 LIZ;
    public final RoomPlayer2 LIZIZ;

    public C480620It2(InterfaceC480660It6 interfaceC480660It6, RoomPlayer2 roomPlayer2) {
        this.LIZ = interfaceC480660It6;
        this.LIZIZ = roomPlayer2;
    }

    @Override // X.InterfaceC480660It6
    public final void LIZ(String str, JSONObject jSONObject) {
        this.LIZIZ.onPlayerLog(jSONObject);
        this.LIZ.LIZ(str, jSONObject);
    }
}

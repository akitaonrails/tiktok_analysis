package X;

import com.bytedance.android.livesdk.chatroom.viewmodule.CommentWidget;
import com.bytedance.android.livesdk.dataChannel.PreShowKeyboardEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.0f6n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C1114510f6n implements InterfaceC1115260f80 {
    public final /* synthetic */ CommentWidget LIZ;

    @Override // X.InterfaceC1115260f80
    public final boolean fu() {
        DataChannel dataChannel = this.LIZ.dataChannel;
        if (dataChannel != null) {
            return ((Boolean) dataChannel.gg0(C0TZM.class)).booleanValue();
        }
        return true;
    }

    @Override // X.InterfaceC1115260f80
    public final void gu() {
        DataChannel dataChannel = this.LIZ.dataChannel;
        if (dataChannel != null) {
            dataChannel.LC0(PreShowKeyboardEvent.class, Boolean.FALSE);
        }
    }

    public C1114510f6n(CommentWidget commentWidget) {
        this.LIZ = commentWidget;
    }
}

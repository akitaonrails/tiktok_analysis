package X;

import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.data.IMessage;

/* JADX INFO: renamed from: X.0UgH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public interface InterfaceC778470UgH<T extends IMessage> {
    int LIZ();

    void LIZIZ(DataChannel dataChannel);

    void onMessage(IMessage iMessage);

    void onRelease();
}

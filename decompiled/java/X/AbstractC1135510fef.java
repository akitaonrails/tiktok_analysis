package X;

import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.0fef, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public abstract class AbstractC1135510fef<DATA> implements InterfaceC1135370feR<DATA> {
    public final InterfaceC1135560fek LIZ;
    public final DataChannel LIZIZ;
    public final boolean LIZJ;
    public final Room LIZLLL;

    public AbstractC1135510fef(C1135360feQ c1135360feQ) {
        DataChannel dataChannelO3;
        DataChannel dataChannelO32;
        DataChannel dataChannelO33;
        InterfaceC1135560fek interfaceC1135560fek = c1135360feQ.LIZ;
        this.LIZ = interfaceC1135560fek;
        InterfaceC1132530fZr interfaceC1132530fZrLIZ = interfaceC1135560fek.LIZ();
        Room room = null;
        if (interfaceC1132530fZrLIZ != null) {
            dataChannelO3 = interfaceC1132530fZrLIZ.o3();
        } else {
            dataChannelO3 = null;
        }
        this.LIZIZ = dataChannelO3;
        InterfaceC1132530fZr interfaceC1132530fZrLIZ2 = interfaceC1135560fek.LIZ();
        if (interfaceC1132530fZrLIZ2 != null) {
            interfaceC1132530fZrLIZ2.getAndroidContext();
        }
        InterfaceC1132530fZr interfaceC1132530fZrLIZ3 = interfaceC1135560fek.LIZ();
        if (interfaceC1132530fZrLIZ3 != null) {
            dataChannelO32 = interfaceC1132530fZrLIZ3.o3();
        } else {
            dataChannelO32 = null;
        }
        this.LIZJ = C500260Jjc.LJIIZILJ(dataChannelO32);
        InterfaceC1132530fZr interfaceC1132530fZrLIZ4 = interfaceC1135560fek.LIZ();
        if (interfaceC1132530fZrLIZ4 != null && (dataChannelO33 = interfaceC1132530fZrLIZ4.o3()) != null) {
            room = (Room) dataChannelO33.gg0(RoomChannel.class);
        }
        this.LIZLLL = room;
    }
}

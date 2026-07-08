package X;

import com.bytedance.android.livesdk.chatroom.model.interact.BattleGamePlayContent;
import com.bytedance.android.livesdk.model.message.LinkMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.0b59, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public interface InterfaceC959730b59 {
    void LIZ(LinkMessage linkMessage);

    void LIZIZ(C954640aww c954640aww);

    void LIZLLL();

    void LJ(Integer num, EnumC959580b4u enumC959580b4u, BattleGamePlayContent battleGamePlayContent, boolean z);

    void LJFF(String str);

    boolean LJI();

    void LJII(EnumC958840b3i enumC958840b3i);

    void LJIIIIZZ(LinkMessage linkMessage);

    InterfaceC960040b5e LJIIIZ();

    void LJIIJ(C954640aww c954640aww);

    boolean LJIIJJI(EnumC958900b3o enumC958900b3o, Object obj, EnumC959690b55 enumC959690b55);

    EnumC958900b3o Y2();

    C959600b4w c0();

    EnumC958840b3i d0();

    DataChannel getDataChannel();

    InterfaceC959930b5T getDelegate();

    Room getRoomInfo();

    String getSessionId();
}

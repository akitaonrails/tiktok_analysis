package X;

import android.content.Context;
import com.bytedance.android.livesdk.gift.model.SendGiftResult;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.0fYO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public interface InterfaceC1131620fYO {
    void LIZLLL(boolean z);

    boolean LJ();

    void LJFF(boolean z);

    C1131880fYo LJI();

    InterfaceC1132010fZ1 LJII();

    void LJIIIIZZ(SendGiftResult sendGiftResult, InterfaceC1131100fXY interfaceC1131100fXY, String str, Room room, boolean z, String str2);

    long LJIIIZ(InterfaceC1131100fXY interfaceC1131100fXY, SendGiftResult sendGiftResult);

    void LJIIJ(InterfaceC1131100fXY interfaceC1131100fXY, boolean z);

    void LJIIJJI();

    void LJIIL(SendGiftResult sendGiftResult);

    void LJIILIIL(InterfaceC1131100fXY interfaceC1131100fXY, SendGiftResult sendGiftResult);

    String LJIILJJIL(SendGiftResult sendGiftResult);

    void LJIILL();

    void LJIILLIIL(Room room);

    void LJIIZILJ(int i);

    void LJIJ(String str, SendGiftResult sendGiftResult);

    void LJIJI(Exception exc, InterfaceC1131100fXY interfaceC1131100fXY);

    void LJIJJ(InterfaceC1131100fXY interfaceC1131100fXY, Gift gift, Room room, String str, String str2);

    void LJIJJLI(InterfaceC1131100fXY interfaceC1131100fXY);

    Context getContext();

    DataChannel getDataChannel();

    int getRetryCount();
}

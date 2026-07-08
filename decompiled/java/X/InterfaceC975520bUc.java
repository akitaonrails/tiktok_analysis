package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.AbnormalDisconnectReason;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CustomLinkMessage;
import com.bytedance.android.livesdk.model.message.LinkMicBattleMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleInfoResponse;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0bUc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public interface InterfaceC975520bUc {
    void H0(C960280b62 c960280b62);

    void LIZ(EnumC962960bAM enumC962960bAM, String str);

    void LJ();

    void LJFF(long j, String str);

    void LJII(long j);

    void LJIIIIZZ(int i, int i2, AbnormalDisconnectReason abnormalDisconnectReason);

    EnumC919170a1j LJIIIZ();

    void X2(C974180bSS c974180bSS);

    EnumC964170bCJ Y2();

    void Z2(List<C954460awe> list, List<C954460awe> list2, CustomLinkMessage customLinkMessage);

    InterfaceC975710bUv a3();

    void b3(Function0<Unit> function0);

    void c3(boolean z);

    void d1();

    boolean d3();

    void e3(C975600bUk c975600bUk);

    void f3(int i, boolean z);

    void g3(C975960bVK c975960bVK);

    DataChannel getDataChannel();

    InterfaceC975700bUu getDelegate();

    Room getRoomInfo();

    String getUniqueId();

    void h3(String str);

    void i3(C974230bSX c974230bSX);

    boolean isAnchor();

    void j3();

    void k3(EnumC919170a1j enumC919170a1j);

    void l3(Room room);

    C975960bVK m3();

    boolean n3();

    boolean o3(BattleInfoResponse battleInfoResponse, EnumC970440bMQ enumC970440bMQ);

    List<C975960bVK> p3();

    void q3(AbstractC1136060ffY abstractC1136060ffY);

    boolean r3(EnumC964170bCJ enumC964170bCJ, EnumC975850bV9 enumC975850bV9, LinkMicBattleMessage linkMicBattleMessage, BattleInfoResponse battleInfoResponse);
}

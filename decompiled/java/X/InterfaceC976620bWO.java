package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.AbnormalDisconnectReason;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CustomLinkMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.List;
import kotlin.jvm.internal.AwS55S0310000_15;

/* JADX INFO: renamed from: X.0bWO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public interface InterfaceC976620bWO {
    void LIZ(EnumC962960bAM enumC962960bAM, String str);

    void LIZIZ(EnumC962960bAM enumC962960bAM, String str);

    void LIZLLL(AwS55S0310000_15 awS55S0310000_15);

    void LJ();

    void LJFF(long j, String str);

    C981480beE LJI();

    void LJII(long j);

    void LJIIIIZZ(int i, int i2, AbnormalDisconnectReason abnormalDisconnectReason);

    InterfaceC981660beW LJIIIZ();

    void LJIIJ(C945320ahu c945320ahu);

    boolean LJIIJJI(C982460bfo c982460bfo, EnumC970440bMQ enumC970440bMQ);

    void LJIIL(long j);

    void LJIILIIL(EnumC962960bAM enumC962960bAM, int i);

    void LJIILJJIL(boolean z);

    boolean LJIILL(EnumC974260bSa enumC974260bSa, EnumC975850bV9 enumC975850bV9, AbstractC982800bgM abstractC982800bgM, C982460bfo c982460bfo);

    C976840bWk LJIILLIIL();

    void LJIIZILJ(AbstractC963500bBE abstractC963500bBE);

    void LJIJ(EnumC962960bAM enumC962960bAM, String str);

    List<C981480beE> LJIJI();

    void LJIJJ(AbstractC982800bgM abstractC982800bgM);

    EnumC974260bSa Y2();

    void Z2(List<C954460awe> list, List<C954460awe> list2, CustomLinkMessage customLinkMessage);

    InterfaceC976810bWh a3();

    void c3(boolean z);

    boolean d3();

    EnumC962960bAM getBizType();

    DataChannel getDataChannel();

    InterfaceC976860bWm getDelegate();

    Room getRoomInfo();

    String getUniqueId();

    boolean isAnchor();
}

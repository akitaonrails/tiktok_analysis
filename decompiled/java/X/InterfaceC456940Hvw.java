package X;

import android.content.Context;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.common.model.StickerItem;
import com.ss.android.ugc.aweme.im.message.template.component.AvatarDuoTaskStatusComponent;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AwS380S0200000_14;

/* JADX INFO: renamed from: X.0Hvw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public interface InterfaceC456940Hvw {
    Object LIZ(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn);

    void LIZIZ(String str);

    C13IQ<? extends AbstractC738140SxQ> LIZJ();

    boolean LIZLLL(String str);

    void LJ(long j, String str);

    void LJFF(SessionInfo sessionInfo);

    String LJI();

    void LJII(String str, AvatarDuoTaskStatusComponent avatarDuoTaskStatusComponent);

    void LJIIIIZZ(String str);

    void LJIIIZ(Context context, SessionInfo sessionInfo, C06D2 c06d2);

    C05YD<AvatarDuoTaskStatusComponent> LJIIJ(String str);

    InterfaceC901690ZYx LJIIJJI(Context context, String str, String str2, AwS380S0200000_14 awS380S0200000_14, AwS380S0200000_14 awS380S0200000_142, Map map, SessionInfo sessionInfo);

    C05YD<Boolean> LJIIL(String str);

    C0IBF LJIILIIL(String str);

    void LJIILJJIL();

    boolean LJIILL(String str);

    void LJIILLIIL(String str);

    void LJIIZILJ();

    void LJIJ(String str, boolean z);

    long LJIJI(String str);

    C05YD<List<StickerItem>> LJIJJ(String str);

    boolean LJIJJLI();

    void LJIL();

    void LJJ(String str, boolean z);

    void LJJI();

    boolean isEnabled();
}

package X;

import com.bytedance.android.livesdk.model.message.LinkMicBattleMessage;
import com.bytedance.android.livesdkapi.depend.model.live.match.GiftMode;
import com.bytedance.android.livesdkapi.depend.model.live.match.TeamUser;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS381S0200000_15;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS594S0100000_15;

/* JADX INFO: renamed from: X.0bVq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public interface InterfaceC976280bVq extends InterfaceC975780bV2 {
    void LIZ(boolean z);

    void LIZIZ();

    void LIZLLL();

    void LJ();

    void LJIIIZ(LinkMicBattleMessage linkMicBattleMessage);

    void LJIIJ(boolean z);

    boolean LJIILIIL(LinkMicBattleMessage linkMicBattleMessage);

    void LJIJJ(EnumC975850bV9 enumC975850bV9, boolean z, boolean z2, boolean z3, String str, GiftMode giftMode, Function1<? super EnumC919170a1j, Unit> function1, InterfaceC1631620sYq<? super Long, ? super EnumC919170a1j, ? super List<TeamUser>, Unit> interfaceC1631620sYq, Function2<? super Boolean, ? super Boolean, Unit> function2, Function2<? super EnumC976510bWD, ? super Boolean, Unit> function22, Function1<? super Boolean, Unit> function12, Function1<? super Long, Unit> function13, Function0<Unit> function0, Function0<Unit> function02);

    void LJJIIJZLJL(LinkMicBattleMessage linkMicBattleMessage, boolean z);

    Pair LJJIJ(AwS559S0100000_15 awS559S0100000_15, AwS559S0100000_15 awS559S0100000_152, AwS559S0100000_15 awS559S0100000_153, AwS559S0100000_15 awS559S0100000_154, AwS559S0100000_15 awS559S0100000_155, AwS594S0100000_15 awS594S0100000_15, EnumC975850bV9 enumC975850bV9, LinkMicBattleMessage linkMicBattleMessage);

    boolean LJJIJIIJIL(LinkMicBattleMessage linkMicBattleMessage);

    void LJJIJLIJ(LinkMicBattleMessage linkMicBattleMessage, boolean z, AwS381S0200000_15 awS381S0200000_15);
}

package X;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS1S2100200_35;

/* JADX INFO: renamed from: X.1Dt8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2270001Dt8 extends AbstractC2270071DtF implements InterfaceC909580ZmG {
    public static String LJJII(String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("strategy_scene_request_ts_");
        sbLIZ.append(str);
        sbLIZ.append('_');
        sbLIZ.append(str2);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC909580ZmG
    public final void LIZJ(long j, String str) {
        AbstractC2270071DtF.LJJIFFI().LIZ(C1555980qaq.LIZ("light_interaction_send_ts", str)).LIZ(Long.valueOf(j));
    }

    @Override // X.InterfaceC909580ZmG
    public final void LJIIIZ(long j, String str) {
        AbstractC2270071DtF.LJJIFFI().LIZ(C1555980qaq.LIZ("preshown_sticker_click_ts", str)).LIZ(Long.valueOf(j));
    }

    @Override // X.InterfaceC909580ZmG
    public final void LJIIL(long j, String str) {
        AbstractC2270071DtF.LJJIFFI().LIZ(C1555980qaq.LIZ("action_bar_click_ts", str)).LIZ(Long.valueOf(j));
    }

    @Override // X.InterfaceC909580ZmG
    public final void LJJI(long j, String str) {
        AbstractC2270071DtF.LJJIFFI().LIZ(C1555980qaq.LIZ("last_enter_inbox_ts", str)).LIZ(Long.valueOf(j));
    }

    @Override // X.InterfaceC909580ZmG
    public final boolean LIZ(long j, String str, String str2) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return C1502690pCt.LIZ(new AwS1S2100200_35(this, str, str2, calendar.getTimeInMillis(), j, 1)).LIZ();
    }

    @Override // X.InterfaceC909580ZmG
    public final void LJ(long j, String str, List list) {
        Iterator it2 = ((ArrayList) list).iterator();
        while (it2.hasNext()) {
            AbstractC2270071DtF.LJJIFFI().LIZ(LJJII((String) it2.next(), str)).LIZ(Long.valueOf(j));
        }
    }

    @Override // X.InterfaceC909580ZmG
    public final boolean LJFF(long j, long j2, String str) {
        return LJJIII(j, j2, C1555980qaq.LIZ("light_interaction_send_ts", str));
    }

    @Override // X.InterfaceC909580ZmG
    public final boolean LJIIIIZZ(long j, long j2, String str) {
        return LJJIII(j, j2, C1555980qaq.LIZ("preshown_sticker_click_ts", str));
    }

    @Override // X.InterfaceC909580ZmG
    public final boolean LJIJ(long j, long j2, String str) {
        return LJJIII(j, j2, C1555980qaq.LIZ("last_enter_inbox_ts", str));
    }

    @Override // X.InterfaceC909580ZmG
    public final boolean LJIJJLI(long j, long j2, String str) {
        return LJJIII(j, j2, C1555980qaq.LIZ("action_bar_click_ts", str));
    }

    public final boolean LJJIII(long j, long j2, String str) {
        return C1502690pCt.LIZ(new C2270051DtD(this, str, j, j2)).LIZ();
    }

    @Override // X.InterfaceC909580ZmG
    public final boolean LIZLLL(long j, long j2, String str, String str2) {
        return C1502690pCt.LIZ(new AwS1S2100200_35(this, str, str2, j, j2, 0)).LIZ();
    }
}

package X;

import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.01Fo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C303401Fo {
    public final C01FV LIZ;
    public volatile Function1<? super List<? extends LinkPlayerInfo>, Unit> LIZJ;
    public volatile List<? extends LinkPlayerInfo> LIZIZ = C13BV.INSTANCE;
    public final C01GW LIZLLL = C452501pT.LIZIZ(new C5182020e(this, 276));

    public final void LIZIZ() {
        if (this.LIZ == C01FV.ANCHOR) {
            InterfaceC921620a5g interfaceC921620a5g = (InterfaceC921620a5g) C948450amx.LIZIZ.LJIIJJI("MULTI_GUEST_V3_ANCHOR_USER_MANAGER");
            if (interfaceC921620a5g != null) {
                interfaceC921620a5g.LJJIIJ((AbstractC303101Fl) this.LIZLLL.getValue());
            }
        } else {
            InterfaceC921620a5g interfaceC921620a5g2 = (InterfaceC921620a5g) C948450amx.LIZIZ.LJIIJJI("MULTI_GUEST_V3_GUEST_USER_MANAGER");
            if (interfaceC921620a5g2 != null) {
                interfaceC921620a5g2.LJJIIJ((AbstractC303101Fl) this.LIZLLL.getValue());
            }
        }
        this.LIZJ = null;
    }

    public C303401Fo(C01FV c01fv) {
        this.LIZ = c01fv;
    }

    public final void LIZ(Function1<? super List<? extends LinkPlayerInfo>, Unit> function1) {
        this.LIZJ = function1;
        if (this.LIZ == C01FV.ANCHOR) {
            InterfaceC921620a5g interfaceC921620a5g = (InterfaceC921620a5g) C948450amx.LIZIZ.LJIIJJI("MULTI_GUEST_V3_ANCHOR_USER_MANAGER");
            if (interfaceC921620a5g != null) {
                interfaceC921620a5g.LJJIJIL((AbstractC303101Fl) this.LIZLLL.getValue());
                return;
            }
            return;
        }
        InterfaceC921620a5g interfaceC921620a5g2 = (InterfaceC921620a5g) C948450amx.LIZIZ.LJIIJJI("MULTI_GUEST_V3_GUEST_USER_MANAGER");
        if (interfaceC921620a5g2 == null) {
            return;
        }
        interfaceC921620a5g2.LJJIJIL((AbstractC303101Fl) this.LIZLLL.getValue());
    }
}

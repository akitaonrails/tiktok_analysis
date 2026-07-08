package X;

import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AwS141S0110000_25;

/* JADX INFO: renamed from: X.0tHg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1659420tHg implements InterfaceC1654640t9y {
    public final C01GW LL;
    public final C01GW LLILLJJLI;
    public final C01GW LLILLL;

    public C1659420tHg() {
        this(false);
    }

    @Override // X.InterfaceC1654640t9y
    public final void H() {
    }

    @Override // X.InterfaceC1654640t9y
    public final void z0() {
    }

    public final InterfaceC1659430tHh LIZ() {
        return (InterfaceC1659430tHh) this.LL.getValue();
    }

    @Override // X.InterfaceC1654640t9y
    public final boolean LJJLIL() {
        return ((Boolean) this.LLILLL.getValue()).booleanValue();
    }

    @Override // X.InterfaceC1654640t9y
    public final EnumC1654620t9w LJJI() {
        return EnumC1654620t9w.AI_THEATER;
    }

    public C1659420tHg(boolean z) {
        this.LL = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(269));
        this.LLILLJJLI = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(268));
        this.LLILLL = C452501pT.LIZIZ(new AwS141S0110000_25(z, this, 1));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("forceShowBanner:");
        sbLIZ.append(z);
        C201955140j.LIZLLL(C542840LQs.LIZIZ, "RecordAITheaterTooltipController", C2188811AlT.LIZIZ(sbLIZ));
    }
}

package X;

import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.AwS52S0010000_8;

/* JADX INFO: renamed from: X.0MFJ, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MFJ implements InterfaceC1654640t9y {
    public final C01GW LL;
    public final C01GW LLILLJJLI;

    public C0MFJ() {
        this(false);
    }

    @Override // X.InterfaceC1654640t9y
    public final void H() {
    }

    @Override // X.InterfaceC1654640t9y
    public final void z0() {
    }

    @Override // X.InterfaceC1654640t9y
    public final boolean LJJLIL() {
        return ((Boolean) this.LL.getValue()).booleanValue() || ((Boolean) this.LLILLJJLI.getValue()).booleanValue();
    }

    @Override // X.InterfaceC1654640t9y
    public final EnumC1654620t9w LJJI() {
        return EnumC1654620t9w.AI_ALIVE;
    }

    public C0MFJ(boolean z) {
        this.LL = C452501pT.LIZIZ(new AwS52S0010000_8(z, 2));
        this.LLILLJJLI = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(306));
        C0L76 c0l76 = C0L76.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("forceShowBanner:");
        sbLIZ.append(z);
        C201955140j.LIZLLL(c0l76, "RecordAIAliveTooltipController", C2188811AlT.LIZIZ(sbLIZ));
    }
}

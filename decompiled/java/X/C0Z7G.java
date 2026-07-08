package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Z7G, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Z7G extends C890610Ywl implements InterfaceC887660Ys0<C0Z7G> {
    public final int LLIZ;
    public final long LLIZLLLIL;
    public final int LLJ;
    public final boolean LLJI;
    public final Object LLJIJIL;
    public final boolean LLJILJIL;
    public final boolean LLJILJILJ;
    public final boolean LLJILLL;
    public final Function1<InterfaceC887660Ys0<?>, Unit> LLJJ;
    public final boolean LLJJI;

    @Override // X.C890610Ywl
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0Z7G)) {
            return false;
        }
        C0Z7G c0z7g = (C0Z7G) obj;
        return this.LLIZ == c0z7g.LLIZ && this.LLIZLLLIL == c0z7g.LLIZLLLIL && this.LLJ == c0z7g.LLJ && this.LLJI == c0z7g.LLJI && Intrinsics.LJFF(this.LLJIJIL, c0z7g.LLJIJIL) && this.LLJILJIL == c0z7g.LLJILJIL && this.LLJILJILJ == c0z7g.LLJILJILJ && this.LLJILLL == c0z7g.LLJILLL && Intrinsics.LJFF(this.LLJJ, c0z7g.LLJJ) && this.LLJJI == c0z7g.LLJJI;
    }

    @Override // X.InterfaceC887660Ys0
    public final boolean getEnableSelect() {
        return false;
    }

    @Override // X.C890610Ywl
    public final int hashCode() {
        int iY2 = ((((((((((((((this.LLIZ * 31) + C786410Ut5.Y2(this.LLIZLLLIL)) * 31) + this.LLJ) * 31) + C786410Ut5.Z2(this.LLJI)) * 31) + this.LLJIJIL.hashCode()) * 31) + C786410Ut5.Z2(this.LLJILJIL)) * 31) + C786410Ut5.Z2(this.LLJILJILJ)) * 31) + C786410Ut5.Z2(this.LLJILLL)) * 31;
        Function1<InterfaceC887660Ys0<?>, Unit> function1 = this.LLJJ;
        return ((iY2 + (function1 == null ? 0 : function1.hashCode())) * 31) + C786410Ut5.Z2(this.LLJJI);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BotChatSessionVOEntranceWrapper(priority=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", timestamp=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(", type=");
        sbLIZ.append(this.LLJ);
        sbLIZ.append(", isUnread=");
        sbLIZ.append(this.LLJI);
        sbLIZ.append(", original=");
        sbLIZ.append(this.LLJIJIL);
        sbLIZ.append(", isInMultiSelectMode=");
        sbLIZ.append(this.LLJILJIL);
        sbLIZ.append(", isSelected=");
        sbLIZ.append(this.LLJILJILJ);
        sbLIZ.append(", isSwitchingMode=");
        sbLIZ.append(this.LLJILLL);
        sbLIZ.append(", onSelect=");
        sbLIZ.append(this.LLJJ);
        sbLIZ.append(", displayInMultiSelectMode=");
        sbLIZ.append(this.LLJJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C890610Ywl, X.InterfaceC1890700zIi
    public final String itemUniqueId() {
        return C0Z3N.LIZ(this.LLJIJIL);
    }

    @Override // X.C890610Ywl
    public final Object LIZ() {
        return this.LLJIJIL;
    }

    @Override // X.C890610Ywl
    public final int LIZIZ() {
        return this.LLIZ;
    }

    @Override // X.C890610Ywl
    public final long LIZLLL() {
        return this.LLIZLLLIL;
    }

    @Override // X.C890610Ywl
    public final boolean LJ() {
        return this.LLJI;
    }

    @Override // X.InterfaceC887660Ys0
    public final boolean getDisplayInMultiSelectMode() {
        return this.LLJJI;
    }

    @Override // X.InterfaceC887660Ys0
    public final Function1<InterfaceC887660Ys0<?>, Unit> getOnSelect() {
        return this.LLJJ;
    }

    @Override // X.C890610Ywl
    public final int getType() {
        return this.LLJ;
    }

    @Override // X.InterfaceC887660Ys0
    public final boolean isInMultiSelectMode() {
        return this.LLJILJIL;
    }

    @Override // X.InterfaceC887660Ys0
    public final boolean isSelected() {
        return this.LLJILJILJ;
    }

    @Override // X.InterfaceC887660Ys0
    public final boolean isSwitchingMode() {
        return this.LLJILLL;
    }

    @Override // X.C890610Ywl, X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        InterfaceC888500YtM interfaceC888500YtM;
        if (!(interfaceC1891350zJl instanceof C0Z7H)) {
            return false;
        }
        Object obj = this.LLJIJIL;
        if (!(obj instanceof InterfaceC888500YtM) || (interfaceC888500YtM = (InterfaceC888500YtM) obj) == null) {
            return false;
        }
        return C0Z3N.LIZIZ(interfaceC888500YtM, ((C0Z7H) interfaceC1891350zJl).LLJIJIL);
    }

    /* JADX WARN: Removed duplicated region for block: B:152:0x01a8  */
    @Override // X.C890610Ywl, X.InterfaceC1890700zIi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1600120rk2 isItemChanged(X.InterfaceC1891350zJl r6) {
        /*
            Method dump skipped, instruction units count: 470
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0Z7G.isItemChanged(X.0zJl):X.0rk2");
    }

    @Override // X.InterfaceC887660Ys0
    public final C0Z7G copyData(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, Function1 function1) {
        int i = this.LLIZ;
        long j = this.LLIZLLLIL;
        return new C0Z7G(i, this.LLJ, j, this.LLJIJIL, function1, this.LLJI, z, z3, z4, this.LLJJI);
    }

    public C0Z7G(int i, int i2, long j, Object obj, Function1 function1, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        super(i, j, i2, z, obj, null, 96);
        this.LLIZ = i;
        this.LLIZLLLIL = j;
        this.LLJ = i2;
        this.LLJI = z;
        this.LLJIJIL = obj;
        this.LLJILJIL = z2;
        this.LLJILJILJ = z3;
        this.LLJILLL = z4;
        this.LLJJ = function1;
        this.LLJJI = z5;
    }
}

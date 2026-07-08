package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Z3M, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Z3M extends C890610Ywl implements InterfaceC887660Ys0<C0Z3M> {
    public final int LLIZ;
    public final long LLIZLLLIL;
    public final int LLJ;
    public final boolean LLJI;
    public final Object LLJIJIL;
    public final boolean LLJILJIL;
    public final boolean LLJILJILJ;

    @Override // X.C890610Ywl
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0Z3M)) {
            return false;
        }
        C0Z3M c0z3m = (C0Z3M) obj;
        return this.LLIZ == c0z3m.LLIZ && this.LLIZLLLIL == c0z3m.LLIZLLLIL && this.LLJ == c0z3m.LLJ && this.LLJI == c0z3m.LLJI && Intrinsics.LJFF(this.LLJIJIL, c0z3m.LLJIJIL) && this.LLJILJIL == c0z3m.LLJILJIL && this.LLJILJILJ == c0z3m.LLJILJILJ;
    }

    @Override // X.InterfaceC887660Ys0
    public final boolean getDisplayInMultiSelectMode() {
        return true;
    }

    @Override // X.InterfaceC887660Ys0
    public final boolean getEnableSelect() {
        return false;
    }

    @Override // X.InterfaceC887660Ys0
    public final Function1<InterfaceC887660Ys0<?>, Unit> getOnSelect() {
        return null;
    }

    @Override // X.C890610Ywl
    public final int hashCode() {
        return (((((((((((this.LLIZ * 31) + C786410Ut5.Y2(this.LLIZLLLIL)) * 31) + this.LLJ) * 31) + C786410Ut5.Z2(this.LLJI)) * 31) + this.LLJIJIL.hashCode()) * 31) + C786410Ut5.Z2(this.LLJILJIL)) * 31) + C786410Ut5.Z2(this.LLJILJILJ);
    }

    @Override // X.InterfaceC887660Ys0
    public final boolean isSelected() {
        return false;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MessageRequestCellVOEntranceWrapper(priority=");
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
        sbLIZ.append(", isSwitchingMode=");
        sbLIZ.append(this.LLJILJILJ);
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

    @Override // X.C890610Ywl
    public final int getType() {
        return this.LLJ;
    }

    @Override // X.InterfaceC887660Ys0
    public final boolean isInMultiSelectMode() {
        return this.LLJILJIL;
    }

    @Override // X.InterfaceC887660Ys0
    public final boolean isSwitchingMode() {
        return this.LLJILJILJ;
    }

    @Override // X.C890610Ywl, X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        InterfaceC888500YtM interfaceC888500YtM;
        if (!(interfaceC1891350zJl instanceof C0Z3M)) {
            return false;
        }
        Object obj = this.LLJIJIL;
        if (!(obj instanceof InterfaceC888500YtM) || (interfaceC888500YtM = (InterfaceC888500YtM) obj) == null) {
            return false;
        }
        return C0Z3N.LIZIZ(interfaceC888500YtM, ((C0Z3M) interfaceC1891350zJl).LLJIJIL);
    }

    @Override // X.C890610Ywl, X.InterfaceC1890700zIi
    public final C1600120rk2 isItemChanged(InterfaceC1891350zJl interfaceC1891350zJl) {
        C0Z3S c0z3s;
        String name;
        String name2;
        CharSequence content;
        CharSequence content2;
        AbstractC884010Ym7 sessionUnreadViewState;
        if (interfaceC1891350zJl instanceof C0Z3M) {
            Object obj = ((C0Z3M) interfaceC1891350zJl).LLJIJIL;
            if (obj instanceof C0Z3S) {
                AbstractC884010Ym7 sessionUnreadViewState2 = null;
                C0Z3S c0z3s2 = (C0Z3S) obj;
                Object obj2 = this.LLJIJIL;
                if (obj2 instanceof C0Z3S) {
                    c0z3s = (C0Z3S) obj2;
                } else {
                    c0z3s = null;
                }
                if (c0z3s2 != null) {
                    name = c0z3s2.getName();
                } else {
                    name = null;
                }
                if (c0z3s != null) {
                    name2 = c0z3s.getName();
                } else {
                    name2 = null;
                }
                if (!Intrinsics.LJFF(name, name2)) {
                    return C1600110rk1.LIZ("name");
                }
                if (c0z3s2 != null) {
                    content = c0z3s2.getContent();
                } else {
                    content = null;
                }
                if (c0z3s != null) {
                    content2 = c0z3s.getContent();
                } else {
                    content2 = null;
                }
                if (!Intrinsics.LJFF(content, content2)) {
                    return C1600110rk1.LIZ("content");
                }
                if (c0z3s2 != null) {
                    sessionUnreadViewState = c0z3s2.getSessionUnreadViewState();
                } else {
                    sessionUnreadViewState = null;
                }
                if (c0z3s != null) {
                    sessionUnreadViewState2 = c0z3s.getSessionUnreadViewState();
                }
                if (!Intrinsics.LJFF(sessionUnreadViewState, sessionUnreadViewState2)) {
                    return C1600110rk1.LIZ("unread_state");
                }
                return C1600110rk1.LIZJ();
            }
        }
        return C1600110rk1.LIZ("unknown");
    }

    @Override // X.InterfaceC887660Ys0
    public final C0Z3M copyData(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, Function1 function1) {
        return new C0Z3M(this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, z, z4);
    }

    public C0Z3M(int i, long j, int i2, boolean z, Object obj, boolean z2, boolean z3) {
        super(i, j, i2, z, obj, null, 96);
        this.LLIZ = i;
        this.LLIZLLLIL = j;
        this.LLJ = i2;
        this.LLJI = z;
        this.LLJIJIL = obj;
        this.LLJILJIL = z2;
        this.LLJILJILJ = z3;
    }
}

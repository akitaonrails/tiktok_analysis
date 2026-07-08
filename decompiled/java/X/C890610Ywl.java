package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ywl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public class C890610Ywl implements InterfaceC1891350zJl, InterfaceC887560Yrq, InterfaceC895400ZAs, InterfaceC1890700zIi {
    public final int LL;
    public final long LLILLJJLI;
    public final int LLILLL;
    public final boolean LLILZ;
    public final Object LLILZIL;
    public final C0ZA7 LLILZLL;

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    @Override // X.InterfaceC1890700zIi
    public String itemUniqueId() {
        return "";
    }

    @Override // X.InterfaceC895400ZAs
    public final boolean getHasUnReadCountInInbox() {
        return LJ();
    }

    @Override // X.InterfaceC887560Yrq
    public final int getPriorityInInbox() {
        return LIZIZ();
    }

    @Override // X.InterfaceC887560Yrq
    public final long getTimestampInInbox() {
        return LIZLLL();
    }

    public int hashCode() {
        return (((((((((((((LIZIZ() * 31) + C786410Ut5.Y2(LIZLLL())) * 31) + getType()) * 31) + C786410Ut5.Z2(LJ())) * 31) + LIZ().hashCode()) * 31) + LIZIZ()) * 31) + C786410Ut5.Y2(LIZLLL())) * 31) + C786410Ut5.Z2(LJ());
    }

    public Object LIZ() {
        return this.LLILZIL;
    }

    public int LIZIZ() {
        return this.LL;
    }

    public long LIZLLL() {
        return this.LLILLJJLI;
    }

    public boolean LJ() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC1890700zIi
    public final C0ZB9 biz() {
        return C890710Ywv.LIZIZ;
    }

    public int getType() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C890610Ywl)) {
            return false;
        }
        C890610Ywl c890610Ywl = (C890610Ywl) obj;
        if (getType() != c890610Ywl.getType() || LJ() != c890610Ywl.LJ() || LIZIZ() != c890610Ywl.LIZIZ() || LIZLLL() != c890610Ywl.LIZLLL() || LIZIZ() != c890610Ywl.LIZIZ() || LIZLLL() != c890610Ywl.LIZLLL() || !Intrinsics.LJFF(LIZ(), c890610Ywl.LIZ())) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1890700zIi
    public C1600120rk2 isItemChanged(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (Intrinsics.LJFF(interfaceC1891350zJl, this)) {
            return C1600110rk1.LIZJ();
        }
        return C1600110rk1.LIZ("unknown");
    }

    public C890610Ywl(int i, long j, int i2, boolean z, Object obj, C0ZA7 c0za7, int i3) {
        i = (i3 & 1) != 0 ? 0 : i;
        z = (i3 & 8) != 0 ? false : z;
        c0za7 = (i3 & 32) != 0 ? null : c0za7;
        this.LL = i;
        this.LLILLJJLI = j;
        this.LLILLL = i2;
        this.LLILZ = z;
        this.LLILZIL = obj;
        this.LLILZLL = c0za7;
    }
}

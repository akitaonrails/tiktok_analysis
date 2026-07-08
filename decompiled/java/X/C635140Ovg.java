package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ovg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C635140Ovg implements InterfaceC1891350zJl {
    public final int LL;
    public final int LLILLJJLI;
    public final boolean LLILLL;
    public final String LLILZ;
    public final String LLILZIL;
    public final C11UN LLILZLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C635140Ovg)) {
            return false;
        }
        C635140Ovg c635140Ovg = (C635140Ovg) obj;
        return this.LL == c635140Ovg.LL && this.LLILLJJLI == c635140Ovg.LLILLJJLI && this.LLILLL == c635140Ovg.LLILLL && Intrinsics.LJFF(this.LLILZ, c635140Ovg.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c635140Ovg.LLILZIL) && this.LLILZLL == c635140Ovg.LLILZLL;
    }

    public final int hashCode() {
        return (((((((((this.LL * 31) + this.LLILLJJLI) * 31) + C786410Ut5.Z2(this.LLILLL)) * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL.hashCode()) * 31) + this.LLILZLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("WorkBenchSettingUnsubscribeSwitchItem(source=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", subSource=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", unsubscribeStatus=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", text=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", subSourceLabel=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", pos=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        C635140Ovg c635140Ovg;
        if (interfaceC1891350zJl instanceof C635140Ovg) {
            c635140Ovg = (C635140Ovg) interfaceC1891350zJl;
        } else {
            c635140Ovg = null;
        }
        if (c635140Ovg == null || this.LLILLL != c635140Ovg.LLILLL) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        C635140Ovg c635140Ovg;
        if (interfaceC1891350zJl instanceof C635140Ovg) {
            c635140Ovg = (C635140Ovg) interfaceC1891350zJl;
        } else {
            c635140Ovg = null;
        }
        if (c635140Ovg == null || this.LL != c635140Ovg.LL || this.LLILLJJLI != c635140Ovg.LLILLJJLI || !Intrinsics.LJFF(this.LLILZ, c635140Ovg.LLILZ)) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        C635140Ovg c635140Ovg;
        if (!(interfaceC1891350zJl instanceof C635140Ovg) || (c635140Ovg = (C635140Ovg) interfaceC1891350zJl) == null || this.LLILLL == c635140Ovg.LLILLL) {
            return null;
        }
        return new Object() { // from class: X.0Ovn
        };
    }

    public C635140Ovg(int i, int i2, boolean z, String str, String str2, C11UN c11un) {
        this.LL = i;
        this.LLILLJJLI = i2;
        this.LLILLL = z;
        this.LLILZ = str;
        this.LLILZIL = str2;
        this.LLILZLL = c11un;
    }
}

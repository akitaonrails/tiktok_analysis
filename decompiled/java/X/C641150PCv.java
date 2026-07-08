package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PCv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C641150PCv implements InterfaceC1891350zJl, InterfaceC1015900cXk, InterfaceC655050Pmh {
    public final String LL;
    public final InterfaceC682670Qq9 LLILLJJLI;
    public Float LLILLL = Float.valueOf(0.0f);
    public Float LLILZ = Float.valueOf(2.0f);

    @Override // X.InterfaceC1015900cXk
    public final Float LIZ(int i) {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C641150PCv)) {
            return false;
        }
        C641150PCv c641150PCv = (C641150PCv) obj;
        return Intrinsics.LJFF(this.LL, c641150PCv.LL) && Intrinsics.LJFF(this.LLILLJJLI, c641150PCv.LLILLJJLI);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        InterfaceC682670Qq9 interfaceC682670Qq9 = this.LLILLJJLI;
        return iHashCode + (interfaceC682670Qq9 == null ? 0 : interfaceC682670Qq9.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Top1CardLabelItem(title=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", fusionBlock=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1015900cXk
    public final Float LJIIIIZZ() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC1015900cXk
    public final Float LJIILIIL() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC1015900cXk
    public final void LIZIZ(Float f) {
        this.LLILZ = f;
    }

    @Override // X.InterfaceC1015900cXk
    public final void LJI(Float f) {
        this.LLILLL = f;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        Integer type;
        if (interfaceC1891350zJl instanceof C641150PCv) {
            C641150PCv c641150PCv = (C641150PCv) interfaceC1891350zJl;
            if (Intrinsics.LJFF(c641150PCv.LL, this.LL)) {
                InterfaceC682670Qq9 interfaceC682670Qq9 = c641150PCv.LLILLJJLI;
                Integer type2 = null;
                if (interfaceC682670Qq9 != null) {
                    type = interfaceC682670Qq9.getType();
                } else {
                    type = null;
                }
                InterfaceC682670Qq9 interfaceC682670Qq92 = this.LLILLJJLI;
                if (interfaceC682670Qq92 != null) {
                    type2 = interfaceC682670Qq92.getType();
                }
                if (Intrinsics.LJFF(type, type2)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return interfaceC1891350zJl instanceof C641150PCv;
    }

    public C641150PCv(String str, InterfaceC682670Qq9 interfaceC682670Qq9) {
        this.LL = str;
        this.LLILLJJLI = interfaceC682670Qq9;
    }
}

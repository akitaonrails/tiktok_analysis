package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ckx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C322730Ckx implements InterfaceC1891350zJl, InterfaceC1861810yY7 {
    public final String LL;
    public final C326880Cre LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final String LLILZIL;
    public final long LLILZLL;
    public final long LLIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C322730Ckx)) {
            return false;
        }
        C322730Ckx c322730Ckx = (C322730Ckx) obj;
        return Intrinsics.LJFF(this.LL, c322730Ckx.LL) && Intrinsics.LJFF(this.LLILLJJLI, c322730Ckx.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c322730Ckx.LLILLL) && Intrinsics.LJFF(this.LLILZ, c322730Ckx.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c322730Ckx.LLILZIL) && this.LLILZLL == c322730Ckx.LLILZLL && this.LLIZ == c322730Ckx.LLIZ;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        String str = this.LL;
        int iHashCode = (((((((str == null ? 0 : str.hashCode()) * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode()) * 31;
        String str2 = this.LLILZIL;
        return ((((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + C786410Ut5.Y2(this.LLILZLL)) * 31) + C786410Ut5.Y2(this.LLIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoInterceptorAssemItem(text=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", serverMessage=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", uuid=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", subProcessId=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", subConversationId=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", actionId=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", botId=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1861810yY7
    public final C326880Cre LJJJJZI() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C322730Ckx) {
            if (areItemTheSame(interfaceC1891350zJl) && Intrinsics.LJFF(this.LL, ((C322730Ckx) interfaceC1891350zJl).LL)) {
                return true;
            }
            return false;
        }
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C322730Ckx) {
            return Intrinsics.LJFF(this.LLILLL, ((C322730Ckx) interfaceC1891350zJl).LLILLL);
        }
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public C322730Ckx(String str, C326880Cre c326880Cre, String str2, String str3, String str4, long j, long j2) {
        this.LL = str;
        this.LLILLJJLI = c326880Cre;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = str4;
        this.LLILZLL = j;
        this.LLIZ = j2;
    }
}

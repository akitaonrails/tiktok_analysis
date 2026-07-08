package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ckq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C322660Ckq implements InterfaceC1891350zJl, InterfaceC321360Cik {
    public final String LL;
    public final C321490Cix LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final long LLILZIL;
    public final long LLILZLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C322660Ckq)) {
            return false;
        }
        C322660Ckq c322660Ckq = (C322660Ckq) obj;
        return Intrinsics.LJFF(this.LL, c322660Ckq.LL) && Intrinsics.LJFF(this.LLILLJJLI, c322660Ckq.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c322660Ckq.LLILLL) && Intrinsics.LJFF(this.LLILZ, c322660Ckq.LLILZ) && this.LLILZIL == c322660Ckq.LLILZIL && this.LLILZLL == c322660Ckq.LLILZLL;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        String str = this.LL;
        return ((((((((((str == null ? 0 : str.hashCode()) * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode()) * 31) + C786410Ut5.Y2(this.LLILZIL)) * 31) + C786410Ut5.Y2(this.LLILZLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CommerceAgentInterceptorAssemItem(text=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", serverMessage=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", uuid=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", subProcessId=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", actionId=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", botId=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C322660Ckq) {
            if (areItemTheSame(interfaceC1891350zJl) && Intrinsics.LJFF(this.LL, ((C322660Ckq) interfaceC1891350zJl).LL)) {
                return true;
            }
            return false;
        }
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C322660Ckq) {
            return Intrinsics.LJFF(this.LLILLL, ((C322660Ckq) interfaceC1891350zJl).LLILLL);
        }
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public C322660Ckq(String str, C321490Cix c321490Cix, String str2, String str3, long j, long j2) {
        this.LL = str;
        this.LLILLJJLI = c321490Cix;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = j;
        this.LLILZLL = j2;
    }
}

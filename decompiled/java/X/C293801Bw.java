package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.01Bw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C293801Bw implements InterfaceC1891350zJl {
    public final String LL;

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public C293801Bw(String str) {
        this.LL = str;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        C293801Bw c293801Bw;
        String str;
        if ((interfaceC1891350zJl instanceof C293801Bw) && (c293801Bw = (C293801Bw) interfaceC1891350zJl) != null && (str = c293801Bw.LL) != null) {
            return Intrinsics.LJFF(str, this.LL);
        }
        return false;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        C293801Bw c293801Bw;
        String str;
        if ((interfaceC1891350zJl instanceof C293801Bw) && (c293801Bw = (C293801Bw) interfaceC1891350zJl) != null && (str = c293801Bw.LL) != null) {
            return Intrinsics.LJFF(str, this.LL);
        }
        return false;
    }
}

package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0vSL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public class C1742910vSL implements InterfaceC1891350zJl {
    public final String LL;

    public int LIZ() {
        return 1;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public C1742910vSL(String str) {
        this.LL = str;
    }

    @Override // X.InterfaceC1891350zJl
    public boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C1742910vSL) {
            return Intrinsics.LJFF(this.LL, ((C1742910vSL) interfaceC1891350zJl).LL);
        }
        return false;
    }
}

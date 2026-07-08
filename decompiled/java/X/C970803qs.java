package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03qs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C970803qs implements InterfaceC1891350zJl {
    public final String LL;

    public C970803qs() {
        this(0);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        String str = this.LL;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public C970803qs(int i) {
        this.LL = "add";
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public final boolean equals(Object obj) {
        C970803qs c970803qs;
        String str = this.LL;
        String str2 = null;
        if ((obj instanceof C970803qs) && (c970803qs = (C970803qs) obj) != null) {
            str2 = c970803qs.LL;
        }
        return Intrinsics.LJFF(str, str2);
    }
}

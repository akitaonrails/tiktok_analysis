package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Cb2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C316580Cb2 implements InterfaceC1891350zJl {
    public final C20611915l7 LL;
    public final boolean LLILLJJLI;

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C316580Cb2) || ((C316580Cb2) interfaceC1891350zJl).LLILLJJLI != this.LLILLJJLI) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C316580Cb2)) {
            return false;
        }
        return Intrinsics.LJFF(((C316580Cb2) interfaceC1891350zJl).LL.LIZ, this.LL.LIZ);
    }

    public C316580Cb2(C20611915l7 c20611915l7, boolean z) {
        this.LL = c20611915l7;
        this.LLILLJJLI = z;
    }
}

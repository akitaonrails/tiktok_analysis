package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0YsR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C887930YsR implements InterfaceC1891350zJl {
    public final EnumC888150Ysn LL;

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public C887930YsR(EnumC888150Ysn enumC888150Ysn) {
        this.LL = enumC888150Ysn;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C887930YsR) || this.LL != ((C887930YsR) interfaceC1891350zJl).LL) {
            return false;
        }
        return true;
    }
}

package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gW7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public class C1168650gW7 implements InterfaceC1891350zJl {
    public boolean LL;
    public String LLILLJJLI;

    public C1168650gW7() {
        this(0);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public boolean LIZ() {
        return this.LL;
    }

    public C1168650gW7(int i) {
        this.LL = false;
        this.LLILLJJLI = null;
    }

    public void LIZIZ(boolean z) {
        this.LL = z;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }
}

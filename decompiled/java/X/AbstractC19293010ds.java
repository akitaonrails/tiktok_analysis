package X;

import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.10ds, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public abstract class AbstractC19293010ds implements InterfaceC1891350zJl {
    public final boolean LL;
    public final Object LLILLJJLI;
    public String LLILLL;
    public AbstractC19318610i0 LLILZ;

    public AbstractC19293010ds() {
        this(false, null, 15);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public boolean LIZ() {
        return this.LL;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public AbstractC19293010ds(boolean z, Object obj, int i) {
        z = (i & 2) != 0 ? true : z;
        obj = (i & 4) != 0 ? null : obj;
        String string = (i & 8) != 0 ? UUID.randomUUID().toString() : null;
        this.LL = z;
        this.LLILLJJLI = obj;
        this.LLILLL = string;
    }
}

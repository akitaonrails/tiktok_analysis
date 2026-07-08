package X;

import X.AbstractC885530YoZ;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Yoa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public abstract class AbstractC885540Yoa<VO extends AbstractC885530YoZ> implements InterfaceC1891350zJl {
    public abstract AbstractC885540Yoa<VO> LIZ(Boolean bool);

    public abstract VO LIZIZ();

    public abstract Boolean LIZLLL();

    @Override // X.InterfaceC1891350zJl
    public Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }
}

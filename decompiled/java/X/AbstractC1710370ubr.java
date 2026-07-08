package X;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ubr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public abstract class AbstractC1710370ubr implements InterfaceC1891350zJl {
    public final C1710320ubm LL;
    public final Function0<C1709570uaZ> LLILLJJLI;

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final EnumC1710490uc3 LIZIZ() {
        return LIZ().LIZIZ;
    }

    public C1710320ubm LIZ() {
        return this.LL;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof AbstractC1710370ubr) {
            return Intrinsics.LJFF(LIZ().LIZ, ((AbstractC1710370ubr) interfaceC1891350zJl).LIZ().LIZ);
        }
        return Intrinsics.LJFF(this, interfaceC1891350zJl);
    }

    public AbstractC1710370ubr(C1710320ubm c1710320ubm, Function0 function0) {
        this.LL = c1710320ubm;
        this.LLILLJJLI = function0;
    }
}

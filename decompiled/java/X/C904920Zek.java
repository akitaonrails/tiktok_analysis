package X;

import X.InterfaceC1891350zJl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Zek, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C904920Zek<T extends InterfaceC1891350zJl> implements InterfaceC904940Zem {
    public static final C904920Zek<T> LIZ = new C904920Zek<>();

    @Override // X.InterfaceC904940Zem
    public final InterfaceC1891350zJl LIZ(C898770ZNr c898770ZNr) {
        return new InterfaceC1891350zJl() { // from class: X.0Zen
            @Override // X.InterfaceC1891350zJl
            public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
                return null;
            }

            @Override // X.InterfaceC1891350zJl
            public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
                return Intrinsics.LJFF(interfaceC1891350zJl, this);
            }

            @Override // X.InterfaceC1891350zJl
            public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
                return interfaceC1891350zJl instanceof C904950Zen;
            }
        };
    }
}

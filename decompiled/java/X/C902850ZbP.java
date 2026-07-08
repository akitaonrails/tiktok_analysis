package X;

import X.InterfaceC1891350zJl;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZbP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C902850ZbP<T extends InterfaceC1891350zJl> implements InterfaceC607860Nsm {
    public static final C902850ZbP<T> LIZ = new C902850ZbP<>();

    @Override // X.InterfaceC607860Nsm
    public final InterfaceC1891350zJl LIZ(List list, C869590Y9l c869590Y9l, int i, String str) {
        return new InterfaceC1891350zJl() { // from class: X.0ZbQ
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
                return interfaceC1891350zJl instanceof C902860ZbQ;
            }
        };
    }
}

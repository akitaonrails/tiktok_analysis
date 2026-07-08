package X;

import X.InterfaceC1891350zJl;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZbS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C902880ZbS<T extends InterfaceC1891350zJl> implements InterfaceC607860Nsm {
    public static final C902880ZbS<T> LIZ = new C902880ZbS<>();

    @Override // X.InterfaceC607860Nsm
    public final InterfaceC1891350zJl LIZ(List list, C869590Y9l c869590Y9l, int i, String str) {
        final String uuid = c869590Y9l.getUuid();
        return new C910260ZnM(uuid) { // from class: X.0Ze9
            public final String LLILZLL;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C904550Ze9) && Intrinsics.LJFF(this.LLILZLL, ((C904550Ze9) obj).LLILZLL);
            }

            public final int hashCode() {
                return this.LLILZLL.hashCode();
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("LegalDisClaimersItem(uuid=");
                sbLIZ.append(this.LLILZLL);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            @Override // X.C910260ZnM
            public final String LJI() {
                return this.LLILZLL;
            }

            {
                super(uuid, C18VH.START, null, 12);
                this.LLILZLL = uuid;
            }

            @Override // X.C910260ZnM, X.InterfaceC1891350zJl
            public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
                return interfaceC1891350zJl instanceof C910260ZnM;
            }
        };
    }
}

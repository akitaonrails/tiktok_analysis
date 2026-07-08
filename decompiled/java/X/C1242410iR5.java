package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0iR5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1242410iR5 extends C1242250iQp {
    public final String LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;

    @Override // X.C1242250iQp, X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C1242410iR5) {
            C1242410iR5 c1242410iR5 = (C1242410iR5) interfaceC1891350zJl;
            if (Intrinsics.LJFF(this.LLILLJJLI, c1242410iR5.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1242410iR5.LLILLL)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.C1242250iQp, X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return interfaceC1891350zJl instanceof C1242410iR5;
    }

    public C1242410iR5(String str, String str2, String str3) {
        super(0);
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = str3;
    }
}

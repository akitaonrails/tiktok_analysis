package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0xvl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public abstract class AbstractC1838030xvl implements InterfaceC1891350zJl {
    public final long LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final long LLILZ;
    public final boolean LLILZIL;
    public final Function0<Unit> LLILZLL;

    public AbstractC1838030xvl() {
        throw null;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof AbstractC1838030xvl) {
            AbstractC1838030xvl abstractC1838030xvl = (AbstractC1838030xvl) interfaceC1891350zJl;
            if (this.LL == abstractC1838030xvl.LL && Intrinsics.LJFF(this.LLILLJJLI, abstractC1838030xvl.LLILLJJLI) && this.LLILZIL == abstractC1838030xvl.LLILZIL && Intrinsics.LJFF(this.LLILLL, abstractC1838030xvl.LLILLL)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if ((interfaceC1891350zJl instanceof AbstractC1838030xvl) && this.LL == ((AbstractC1838030xvl) interfaceC1891350zJl).LL) {
            return true;
        }
        return false;
    }

    public AbstractC1838030xvl(long j, String str, String str2, long j2, boolean z, Function0 function0) {
        this.LL = j;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = j2;
        this.LLILZIL = z;
        this.LLILZLL = function0;
    }
}

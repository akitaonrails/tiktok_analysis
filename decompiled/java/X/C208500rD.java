package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00rD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C208500rD implements InterfaceC1891350zJl {
    public final Aweme LL;

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DetailVideoItem(aweme=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return this.LL.getAid().hashCode();
    }

    public C208500rD(Aweme aweme) {
        this.LL = aweme;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C208500rD) {
            return Intrinsics.LJFF(((C208500rD) interfaceC1891350zJl).LL.getAid(), this.LL.getAid());
        }
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C208500rD) {
            return Intrinsics.LJFF(((C208500rD) interfaceC1891350zJl).LL.getAid(), this.LL.getAid());
        }
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C208500rD) {
            return Intrinsics.LJFF(((C208500rD) obj).LL.getAid(), this.LL.getAid());
        }
        return super.equals(obj);
    }
}

package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Nsd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C607770Nsd implements InterfaceC1891350zJl {
    public final Aweme LL;

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public int hashCode() {
        return getAweme().getAid().hashCode();
    }

    public Aweme getAweme() {
        return this.LL;
    }

    public C607770Nsd(Aweme aweme) {
        this.LL = aweme;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C607770Nsd) {
            return Intrinsics.LJFF(((C607770Nsd) interfaceC1891350zJl).getAweme().getAid(), getAweme().getAid());
        }
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C607770Nsd) {
            return Intrinsics.LJFF(((C607770Nsd) interfaceC1891350zJl).getAweme().getAid(), getAweme().getAid());
        }
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C607770Nsd) {
            return Intrinsics.LJFF(((C607770Nsd) obj).getAweme().getAid(), getAweme().getAid());
        }
        return super.equals(obj);
    }
}

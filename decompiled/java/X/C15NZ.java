package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.15NZ, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public class C15NZ implements InterfaceC1891350zJl {
    public final IMUser LL;

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public C15NZ(IMUser iMUser) {
        this.LL = iMUser;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C15NZ)) {
            return false;
        }
        return Intrinsics.LJFF(this.LL.getUniqueId(), ((C15NZ) obj).LL.getUniqueId());
    }
}

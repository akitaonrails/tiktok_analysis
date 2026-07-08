package X;

import com.ss.android.ugc.aweme.friends.model.MutualUser;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0I6B, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0I6B implements InterfaceC1891350zJl {
    public final MutualUser LL;

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public C0I6B(MutualUser mutualUser) {
        this.LL = mutualUser;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        C0I6B c0i6b;
        MutualUser mutualUser;
        if (interfaceC1891350zJl instanceof C0I6B) {
            c0i6b = (C0I6B) interfaceC1891350zJl;
        } else {
            c0i6b = null;
        }
        if (c0i6b == null || (mutualUser = c0i6b.LL) == null || !Intrinsics.LJFF(mutualUser.getUid(), this.LL.getUid()) || !Intrinsics.LJFF(mutualUser.getNickname(), this.LL.getNickname()) || !Intrinsics.LJFF(mutualUser.getUsername(), this.LL.getUsername()) || !Intrinsics.LJFF(mutualUser.getAvatarThumb(), this.LL.getAvatarThumb())) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        C0I6B c0i6b;
        MutualUser mutualUser;
        if ((interfaceC1891350zJl instanceof C0I6B) && (c0i6b = (C0I6B) interfaceC1891350zJl) != null && (mutualUser = c0i6b.LL) != null) {
            return Intrinsics.LJFF(mutualUser.getUid(), this.LL.getUid());
        }
        return false;
    }
}

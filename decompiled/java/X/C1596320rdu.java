package X;

import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rdu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1596320rdu implements InterfaceC1891350zJl, InterfaceC1596350rdx, InterfaceC1595240rcA {
    public final boolean LL;

    public C1596320rdu() {
        this(false);
    }

    @Override // X.InterfaceC1596350rdx
    public final boolean LIZ() {
        return false;
    }

    @Override // X.InterfaceC1595240rcA
    public final String getCellType() {
        return "live_widget";
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    @Override // X.InterfaceC1595240rcA
    public final int getReRankSequence() {
        return -1;
    }

    @Override // X.InterfaceC1595240rcA
    public final Integer getReRankType() {
        return -1;
    }

    @Override // X.InterfaceC1595240rcA
    public final User getUser() {
        return null;
    }

    @Override // X.InterfaceC1595240rcA
    public final boolean isSingleUser() {
        return false;
    }

    @Override // X.InterfaceC1595240rcA
    public final String getUid() {
        return C1595950rdJ.LIZ(this);
    }

    @Override // X.InterfaceC1595240rcA
    public final boolean isUnfollow() {
        return C1595950rdJ.LIZIZ(this);
    }

    public C1596320rdu(boolean z) {
        this.LL = z;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }
}

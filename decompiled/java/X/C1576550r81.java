package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0r81, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1576550r81 implements InterfaceC1891350zJl {
    public static final /* synthetic */ int LLILZIL = 0;
    public final Aweme LL;
    public final User LLILLJJLI;
    public final boolean LLILLL;
    public final boolean LLILZ;

    /* JADX WARN: Multi-variable type inference failed */
    public C1576550r81() {
        this((Aweme) null, (User) (0 == true ? 1 : 0), false, 15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1576550r81)) {
            return false;
        }
        C1576550r81 c1576550r81 = (C1576550r81) obj;
        return Intrinsics.LJFF(this.LL, c1576550r81.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1576550r81.LLILLJJLI) && this.LLILLL == c1576550r81.LLILLL && this.LLILZ == c1576550r81.LLILZ;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return (((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + C786410Ut5.Z2(this.LLILLL)) * 31) + C786410Ut5.Z2(this.LLILZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CollabFeedCreatorPostItem(aweme=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", user=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", isMorePostEntry=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", isDummyItem=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C1576550r81)) {
            return false;
        }
        if (this.LLILZ && ((C1576550r81) interfaceC1891350zJl).LLILZ) {
            return false;
        }
        return Intrinsics.LJFF(this.LL.getAid(), ((C1576550r81) interfaceC1891350zJl).LL.getAid());
    }

    public /* synthetic */ C1576550r81(Aweme aweme, User user, boolean z, int i) {
        this((i & 1) != 0 ? new Aweme() : aweme, (i & 2) != 0 ? new User() : user, (i & 4) != 0 ? false : z, false);
    }

    public C1576550r81(Aweme aweme, User user, boolean z, boolean z2) {
        this.LL = aweme;
        this.LLILLJJLI = user;
        this.LLILLL = z;
        this.LLILZ = z2;
    }
}

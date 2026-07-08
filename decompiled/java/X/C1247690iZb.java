package X;

import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.muflist.MufPageTrackInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0iZb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1247690iZb implements InterfaceC1891350zJl {
    public final User LL;
    public final EnumC1262450ixP LLILLJJLI;
    public final MufPageTrackInfo LLILLL;
    public final boolean LLILZ;
    public final String LLILZIL;
    public final EnumC1247010iYV LLILZLL;
    public final boolean LLIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1247690iZb)) {
            return false;
        }
        C1247690iZb c1247690iZb = (C1247690iZb) obj;
        return Intrinsics.LJFF(this.LL, c1247690iZb.LL) && this.LLILLJJLI == c1247690iZb.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c1247690iZb.LLILLL) && this.LLILZ == c1247690iZb.LLILZ && Intrinsics.LJFF(this.LLILZIL, c1247690iZb.LLILZIL) && this.LLILZLL == c1247690iZb.LLILZLL && this.LLIZ == c1247690iZb.LLIZ;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        int iHashCode = ((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31;
        MufPageTrackInfo mufPageTrackInfo = this.LLILLL;
        return ((((((((iHashCode + (mufPageTrackInfo == null ? 0 : mufPageTrackInfo.hashCode())) * 31) + C786410Ut5.Z2(this.LLILZ)) * 31) + this.LLILZIL.hashCode()) * 31) + this.LLILZLL.hashCode()) * 31) + C786410Ut5.Z2(this.LLIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MufUserItem(user=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", scene=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", trackInfo=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", isNewFriend=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", displayName=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", aliasPermissionType=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", isFromSearch=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        String uid;
        C1247690iZb c1247690iZb;
        User user;
        String uid2 = this.LL.getUid();
        if (!(interfaceC1891350zJl instanceof C1247690iZb) || (c1247690iZb = (C1247690iZb) interfaceC1891350zJl) == null || (user = c1247690iZb.LL) == null || (uid = user.getUid()) == null) {
            uid = "";
        }
        return Intrinsics.LJFF(uid2, uid);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        String uid;
        C1247690iZb c1247690iZb;
        User user;
        String uid2 = this.LL.getUid();
        if (!(interfaceC1891350zJl instanceof C1247690iZb) || (c1247690iZb = (C1247690iZb) interfaceC1891350zJl) == null || (user = c1247690iZb.LL) == null || (uid = user.getUid()) == null) {
            uid = "";
        }
        return Intrinsics.LJFF(uid2, uid);
    }

    public static C1247690iZb LIZ(C1247690iZb c1247690iZb, String str) {
        User user = c1247690iZb.LL;
        EnumC1262450ixP enumC1262450ixP = c1247690iZb.LLILLJJLI;
        MufPageTrackInfo mufPageTrackInfo = c1247690iZb.LLILLL;
        boolean z = c1247690iZb.LLILZ;
        EnumC1247010iYV enumC1247010iYV = c1247690iZb.LLILZLL;
        boolean z2 = c1247690iZb.LLIZ;
        c1247690iZb.getClass();
        return new C1247690iZb(user, enumC1262450ixP, mufPageTrackInfo, z, str, enumC1247010iYV, z2);
    }

    public C1247690iZb(User user, EnumC1262450ixP enumC1262450ixP, MufPageTrackInfo mufPageTrackInfo, boolean z, String str, EnumC1247010iYV enumC1247010iYV, boolean z2) {
        this.LL = user;
        this.LLILLJJLI = enumC1262450ixP;
        this.LLILLL = mufPageTrackInfo;
        this.LLILZ = z;
        this.LLILZIL = str;
        this.LLILZLL = enumC1247010iYV;
        this.LLIZ = z2;
    }

    public /* synthetic */ C1247690iZb(User user, EnumC1262450ixP enumC1262450ixP, MufPageTrackInfo mufPageTrackInfo, boolean z, String str, EnumC1247010iYV enumC1247010iYV, boolean z2, int i) {
        this(user, enumC1262450ixP, (i & 4) != 0 ? null : mufPageTrackInfo, (i & 8) != 0 ? false : z, str, (i & 32) != 0 ? EnumC1247010iYV.FOLLOWER : enumC1247010iYV, (i & 64) != 0 ? false : z2);
    }
}

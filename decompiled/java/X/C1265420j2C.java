package X;

import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0j2C, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1265420j2C implements InterfaceC1891350zJl {
    public final int LL;
    public final User LLILLJJLI;
    public int LLILLL;
    public final String LLILZ;
    public final EnumC1247010iYV LLILZIL;

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.LLILLJJLI.getUid(), this.LLILLJJLI.getNickname(), this.LLILLJJLI.getUniqueId(), Integer.valueOf(this.LLILLJJLI.getFollowStatus())});
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RelationUser(type=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", user=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", order=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", requestId=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", aliasPermission=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C1265420j2C) {
            C1265420j2C c1265420j2C = (C1265420j2C) interfaceC1891350zJl;
            if (c1265420j2C.LL == this.LL && Intrinsics.LJFF(c1265420j2C.LLILLJJLI.getUid(), this.LLILLJJLI.getUid()) && Intrinsics.LJFF(c1265420j2C.LLILLJJLI.getNickname(), this.LLILLJJLI.getNickname()) && Intrinsics.LJFF(c1265420j2C.LLILLJJLI.getUniqueId(), this.LLILLJJLI.getUniqueId()) && c1265420j2C.LLILLJJLI.getFollowStatus() == this.LLILLJJLI.getFollowStatus() && c1265420j2C.LLILLJJLI.roomId == this.LLILLJJLI.roomId) {
                return true;
            }
            return false;
        }
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C1265420j2C) {
            C1265420j2C c1265420j2C = (C1265420j2C) interfaceC1891350zJl;
            if (c1265420j2C.LL == this.LL && Intrinsics.LJFF(c1265420j2C.LLILLJJLI.getUid(), this.LLILLJJLI.getUid())) {
                return true;
            }
            return false;
        }
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1265420j2C)) {
            return false;
        }
        C1265420j2C c1265420j2C = (C1265420j2C) obj;
        if (Intrinsics.LJFF(this.LLILLJJLI.getUid(), c1265420j2C.LLILLJJLI.getUid()) && Intrinsics.LJFF(this.LLILLJJLI.getNickname(), c1265420j2C.LLILLJJLI.getNickname()) && Intrinsics.LJFF(this.LLILLJJLI.getUniqueId(), c1265420j2C.LLILLJJLI.getUniqueId()) && this.LLILLJJLI.getFollowStatus() == c1265420j2C.LLILLJJLI.getFollowStatus()) {
            return true;
        }
        return false;
    }

    public static C1265420j2C LIZ(C1265420j2C c1265420j2C, int i) {
        int i2 = c1265420j2C.LL;
        User user = c1265420j2C.LLILLJJLI;
        String str = c1265420j2C.LLILZ;
        EnumC1247010iYV enumC1247010iYV = c1265420j2C.LLILZIL;
        c1265420j2C.getClass();
        return new C1265420j2C(i2, user, i, str, enumC1247010iYV);
    }

    public /* synthetic */ C1265420j2C(int i, User user, String str, EnumC1247010iYV enumC1247010iYV, int i2) {
        this(i, user, 0, (i2 & 8) != 0 ? "" : str, (i2 & 16) != 0 ? EnumC1247010iYV.FOLLOWER : enumC1247010iYV);
    }

    public C1265420j2C(int i, User user, int i2, String str, EnumC1247010iYV enumC1247010iYV) {
        this.LL = i;
        this.LLILLJJLI = user;
        this.LLILLL = i2;
        this.LLILZ = str;
        this.LLILZIL = enumC1247010iYV;
    }
}

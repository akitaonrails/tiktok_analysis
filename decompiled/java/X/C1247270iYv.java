package X;

import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0iYv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1247270iYv implements InterfaceC1891350zJl {
    public final User LL;
    public final int LLILLJJLI;
    public final EnumC1247030iYX LLILLL;
    public final String LLILZ;
    public EnumC1247010iYV LLILZIL;
    public final int LLILZLL;
    public final int LLIZ;
    public final double LLIZLLLIL;
    public final double LLJ;
    public final double LLJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1247270iYv)) {
            return false;
        }
        C1247270iYv c1247270iYv = (C1247270iYv) obj;
        return Intrinsics.LJFF(this.LL, c1247270iYv.LL) && this.LLILLJJLI == c1247270iYv.LLILLJJLI && this.LLILLL == c1247270iYv.LLILLL && Intrinsics.LJFF(this.LLILZ, c1247270iYv.LLILZ) && this.LLILZIL == c1247270iYv.LLILZIL && this.LLILZLL == c1247270iYv.LLILZLL && this.LLIZ == c1247270iYv.LLIZ && Double.compare(this.LLIZLLLIL, c1247270iYv.LLIZLLLIL) == 0 && Double.compare(this.LLJ, c1247270iYv.LLJ) == 0 && Double.compare(this.LLJI, c1247270iYv.LLJI) == 0;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return (((((((((((((((((this.LL.hashCode() * 31) + this.LLILLJJLI) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL.hashCode()) * 31) + this.LLILZLL) * 31) + this.LLIZ) * 31) + C786410Ut5.X2(this.LLIZLLLIL)) * 31) + C786410Ut5.X2(this.LLJ)) * 31) + C786410Ut5.X2(this.LLJI);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RelationSearchItem(user=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", idx=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", matchBy=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", displayName=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", aliasPermissionType=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", chunk=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", matcher=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", score=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(", matchingDuration=");
        sbLIZ.append(this.LLJ);
        sbLIZ.append(", rankingDuration=");
        sbLIZ.append(this.LLJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        C1247270iYv c1247270iYv;
        User user;
        String uid = this.LL.getUid();
        String uid2 = null;
        if ((interfaceC1891350zJl instanceof C1247270iYv) && (c1247270iYv = (C1247270iYv) interfaceC1891350zJl) != null && (user = c1247270iYv.LL) != null) {
            uid2 = user.getUid();
        }
        return Intrinsics.LJFF(uid, uid2);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        C1247270iYv c1247270iYv;
        User user;
        String uid = this.LL.getUid();
        String uid2 = null;
        if ((interfaceC1891350zJl instanceof C1247270iYv) && (c1247270iYv = (C1247270iYv) interfaceC1891350zJl) != null && (user = c1247270iYv.LL) != null) {
            uid2 = user.getUid();
        }
        return Intrinsics.LJFF(uid, uid2);
    }

    public static C1247270iYv LIZ(C1247270iYv c1247270iYv, String str) {
        User user = c1247270iYv.LL;
        int i = c1247270iYv.LLILLJJLI;
        EnumC1247030iYX enumC1247030iYX = c1247270iYv.LLILLL;
        EnumC1247010iYV enumC1247010iYV = c1247270iYv.LLILZIL;
        int i2 = c1247270iYv.LLILZLL;
        int i3 = c1247270iYv.LLIZ;
        double d = c1247270iYv.LLIZLLLIL;
        double d2 = c1247270iYv.LLJ;
        double d3 = c1247270iYv.LLJI;
        c1247270iYv.getClass();
        return new C1247270iYv(user, i, enumC1247030iYX, str, enumC1247010iYV, i2, i3, d, d2, d3);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C1247270iYv(User user, int i, EnumC1247030iYX enumC1247030iYX, String str, EnumC1247010iYV enumC1247010iYV, int i2, int i3, double d, int i4) {
        double d2;
        double d3;
        double d4 = d;
        int i5 = i3;
        int i6 = (i4 & 32) != 0 ? 0 : i2;
        i5 = (i4 & 64) != 0 ? -1 : i5;
        d4 = (i4 & 128) != 0 ? 0.0d : d4;
        if ((i4 & 256) != 0) {
            d2 = -1.0d;
        } else {
            d2 = 0.0d;
        }
        if ((i4 & 512) != 0) {
            d3 = -1.0d;
        } else {
            d3 = 0.0d;
        }
        this(user, i, enumC1247030iYX, str, enumC1247010iYV, i6, i5, d4, d2, d3);
    }

    public C1247270iYv(User user, int i, EnumC1247030iYX enumC1247030iYX, String str, EnumC1247010iYV enumC1247010iYV, int i2, int i3, double d, double d2, double d3) {
        this.LL = user;
        this.LLILLJJLI = i;
        this.LLILLL = enumC1247030iYX;
        this.LLILZ = str;
        this.LLILZIL = enumC1247010iYV;
        this.LLILZLL = i2;
        this.LLIZ = i3;
        this.LLIZLLLIL = d;
        this.LLJ = d2;
        this.LLJI = d3;
    }
}

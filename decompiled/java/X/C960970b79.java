package X;

import com.bytedance.android.livesdk.livesetting.linkmic.cohost.CoHostInviteListPreloadSetting;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0b79, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C960970b79 implements InterfaceC961690b8J {
    public final long LIZIZ;
    public final int LIZJ;
    public final String LIZLLL;
    public final int LJ;
    public final long LJFF;
    public final boolean LJI;
    public final long LJII;
    public final long LJIIIIZZ;
    public final long LJIIIZ;
    public final String LJIIJ;
    public final int LJIIJJI;
    public final String LJIIL;
    public final int LJIILJJIL;
    public final String LJIILL;
    public final C961040b7G LJIILLIIL;
    public final int LIZ = 1;
    public final String LJIILIIL = "";

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C960970b79)) {
            return false;
        }
        C960970b79 c960970b79 = (C960970b79) obj;
        return this.LIZ == c960970b79.LIZ && this.LIZIZ == c960970b79.LIZIZ && this.LIZJ == c960970b79.LIZJ && Intrinsics.LJFF(this.LIZLLL, c960970b79.LIZLLL) && this.LJ == c960970b79.LJ && this.LJFF == c960970b79.LJFF && this.LJI == c960970b79.LJI && this.LJII == c960970b79.LJII && this.LJIIIIZZ == c960970b79.LJIIIIZZ && this.LJIIIZ == c960970b79.LJIIIZ && Intrinsics.LJFF(this.LJIIJ, c960970b79.LJIIJ) && this.LJIIJJI == c960970b79.LJIIJJI && Intrinsics.LJFF(this.LJIIL, c960970b79.LJIIL) && Intrinsics.LJFF(this.LJIILIIL, c960970b79.LJIILIIL) && this.LJIILJJIL == c960970b79.LJIILJJIL && Intrinsics.LJFF(this.LJIILL, c960970b79.LJIILL) && Intrinsics.LJFF(this.LJIILLIIL, c960970b79.LJIILLIIL);
    }

    public final int hashCode() {
        int iY2 = ((((this.LIZ * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + this.LIZJ) * 31;
        String str = this.LIZLLL;
        int iHashCode = (((((((((((((((((((iY2 + (str == null ? 0 : str.hashCode())) * 31) + this.LJ) * 31) + C786410Ut5.Y2(this.LJFF)) * 31) + C786410Ut5.Z2(this.LJI)) * 31) + C786410Ut5.Y2(this.LJII)) * 31) + C786410Ut5.Y2(this.LJIIIIZZ)) * 31) + C786410Ut5.Y2(this.LJIIIZ)) * 31) + this.LJIIJ.hashCode()) * 31) + this.LJIIJJI) * 31) + this.LJIIL.hashCode()) * 31;
        String str2 = this.LJIILIIL;
        int iHashCode2 = (((((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.LJIILJJIL) * 31) + this.LJIILL.hashCode()) * 31;
        C961040b7G c961040b7G = this.LJIILLIIL;
        return iHashCode2 + (c961040b7G != null ? c961040b7G.hashCode() : 0);
    }

    public final String toString() {
        return "CoHostInviteListRequestParam(rivalsType=" + this.LIZ + ", roomId=" + this.LIZIZ + ", scene=" + this.LIZJ + ", tzName=" + this.LIZLLL + ", tzOffset=" + this.LJ + ", topLivingFriendId=" + this.LJFF + ", isOfficialChannel=" + this.LJI + ", topLivingSuggestUid=" + this.LJII + ", topViewerSuggestedUid=" + this.LJIIIIZZ + ", panelStyleVersion=" + this.LJIIIZ + ", clientLogId=" + this.LJIIJ + ", entrance=" + this.LJIIJJI + ", invitingIds=" + this.LJIIL + ", simulatorDimensions=" + this.LJIILIIL + ", rivalSection=" + this.LJIILJJIL + ", offliveInvitationUids=" + this.LJIILL + ", preloadConfig=" + this.LJIILLIIL + ')';
    }

    @Override // X.InterfaceC961690b8J
    public final C961040b7G LIZ() {
        return this.LJIILLIIL;
    }

    @Override // X.InterfaceC961690b8J
    public final EnumC961110b7N LIZIZ(C960970b79 c960970b79) {
        if (CoHostInviteListPreloadSetting.INSTANCE.isExperienceOptEnabled()) {
            if (this.LJI != c960970b79.LJI) {
                return EnumC961110b7N.IS_OFFICIAL_CHANNEL;
            }
            if (this.LIZIZ != c960970b79.LIZIZ) {
                return EnumC961110b7N.OTHER;
            }
            if (this.LIZJ != c960970b79.LIZJ) {
                return EnumC961110b7N.OTHER;
            }
            int i = this.LJIILJJIL;
            if (i != c960970b79.LJIILJJIL) {
                return EnumC961110b7N.OTHER;
            }
            if (i == EnumC952640ati.FRIENDS.getValue()) {
                if (this.LJFF != c960970b79.LJFF) {
                    return EnumC961110b7N.TOP_LIVING_FRIEND_UID;
                }
                if (!Intrinsics.LJFF(this.LJIIL, c960970b79.LJIIL)) {
                    return EnumC961110b7N.INVITING_USER_IDS;
                }
            } else if (i == EnumC952640ati.RECOMMEND.getValue()) {
                if (this.LJII != c960970b79.LJII) {
                    return EnumC961110b7N.TOP_LIVING_SUGGEST_UID;
                }
                if (!Intrinsics.LJFF(this.LJIIL, c960970b79.LJIIL)) {
                    return EnumC961110b7N.INVITING_USER_IDS;
                }
            }
            return EnumC961110b7N.NONE;
        }
        if (this.LJFF != c960970b79.LJFF) {
            return EnumC961110b7N.TOP_LIVING_FRIEND_UID;
        }
        if (this.LJII != c960970b79.LJII) {
            return EnumC961110b7N.TOP_LIVING_SUGGEST_UID;
        }
        if (!Intrinsics.LJFF(this.LJIIL, c960970b79.LJIIL)) {
            return EnumC961110b7N.INVITING_USER_IDS;
        }
        if (this.LJI != c960970b79.LJI) {
            return EnumC961110b7N.IS_OFFICIAL_CHANNEL;
        }
        if (this.LIZIZ != c960970b79.LIZIZ) {
            return EnumC961110b7N.OTHER;
        }
        if (this.LIZJ != c960970b79.LIZJ) {
            return EnumC961110b7N.OTHER;
        }
        if (this.LJIILJJIL != c960970b79.LJIILJJIL) {
            return EnumC961110b7N.OTHER;
        }
        return EnumC961110b7N.NONE;
    }

    @Override // X.InterfaceC961690b8J
    public final boolean LIZJ(C960970b79 c960970b79) {
        if (LIZIZ(c960970b79) == EnumC961110b7N.NONE) {
            return true;
        }
        return false;
    }

    public C960970b79(long j, int i, String str, int i2, long j2, boolean z, long j3, long j4, long j5, String str2, int i3, String str3, int i4, String str4, C961040b7G c961040b7G) {
        this.LIZIZ = j;
        this.LIZJ = i;
        this.LIZLLL = str;
        this.LJ = i2;
        this.LJFF = j2;
        this.LJI = z;
        this.LJII = j3;
        this.LJIIIIZZ = j4;
        this.LJIIIZ = j5;
        this.LJIIJ = str2;
        this.LJIIJJI = i3;
        this.LJIIL = str3;
        this.LJIILJJIL = i4;
        this.LJIILL = str4;
        this.LJIILLIIL = c961040b7G;
    }
}

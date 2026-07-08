package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.15l2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20611415l2 {
    public static final /* synthetic */ int LJIJJLI = 0;
    public final String LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final UrlModel LJI;
    public final String LJII;
    public final String LJIIIIZZ;
    public final String LJIIIZ;
    public final String LJIIJ;
    public final int LJIIJJI;
    public final String LJIIL;
    public final String LJIILIIL;
    public final int LJIILJJIL;
    public final String LJIILL;
    public final String LJIILLIIL;
    public final String LJIIZILJ;
    public final String LJIJ;
    public final String LJIJI;
    public C317510CcX LJIJJ;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public C20611415l2() {
        int i = 0;
        this(null, i, i, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, i, 0 == true ? 1 : 0, 0 == true ? 1 : 0, i, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 2097151);
    }

    public final String toString() {
        return "MentionUser(uid=" + this.LIZ + ", followStatus=" + this.LIZIZ + ", followerStatus=" + this.LIZJ + ", initialLetter=" + this.LIZLLL + ", nickname=" + this.LJ + ", signature=" + this.LJFF + ", avatarThumb=" + this.LJI + ", uniqueId=" + this.LJII + ", shortId=" + this.LJIIIIZZ + ", customVerify=" + this.LJIIIZ + ", enterpriseVerifyReason=" + this.LJIIJ + ", verificationType=" + this.LJIIJJI + ", remarkName=" + this.LJIIL + ", contactName=" + this.LJIILIIL + ", commerceUserLevel=" + this.LJIILJJIL + ", nicknamePinYin=" + this.LJIILL + ", contactNamePinYin=" + this.LJIILLIIL + ", nicknameInitial=" + this.LJIIZILJ + ", contactNameInitial=" + this.LJIJ + ", secUid=" + this.LJIJI + ", extraInfo=" + this.LJIJJ + ')';
    }

    public final int hashCode() {
        return C0BVD.LIZ() ? (this.LIZ.hashCode() * 31) + this.LJIJJ.hashCode() : C20611715l5.LIZJ(this).hashCode();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C20611415l2)) {
            return false;
        }
        if (C0BVD.LIZ()) {
            C20611415l2 c20611415l2 = (C20611415l2) obj;
            if (!Intrinsics.LJFF(this.LIZ, c20611415l2.LIZ) || !Intrinsics.LJFF(this.LJIJJ, c20611415l2.LJIJJ)) {
                return false;
            }
            return true;
        }
        return Intrinsics.LJFF(this.LIZ, ((C20611415l2) obj).LIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C20611415l2(String str, int i, int i2, String str2, String str3, UrlModel urlModel, String str4, String str5, String str6, String str7, int i3, String str8, String str9, int i4, String str10, C317510CcX c317510CcX, int i5) {
        String str11;
        int i6 = i4;
        String str12 = str8;
        int i7 = i3;
        C317510CcX c317510CcX2 = c317510CcX;
        String str13 = str7;
        String str14 = str6;
        String str15 = str5;
        String str16 = str4;
        UrlModel urlModel2 = urlModel;
        String str17 = str3;
        String str18 = str2;
        int i8 = i2;
        int i9 = i;
        String str19 = (i5 & 1) != 0 ? "" : str;
        i9 = (i5 & 2) != 0 ? -1 : i9;
        i8 = (i5 & 4) != 0 ? -1 : i8;
        if ((i5 & 8) != 0) {
            str11 = "";
        } else {
            str11 = null;
        }
        this(str19, i9, i8, str11, (i5 & 16) != 0 ? "" : str18, (i5 & 32) != 0 ? "" : str17, (i5 & 64) != 0 ? null : urlModel2, (i5 & 128) != 0 ? "" : str16, (i5 & 256) != 0 ? "" : str15, (i5 & 512) != 0 ? null : str14, (i5 & 1024) != 0 ? null : str13, (i5 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? -1 : i7, (i5 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? "" : str12, (i5 & 8192) == 0 ? str9 : null, (i5 & 16384) != 0 ? -1 : i6, null, null, null, null, (524288 & i5) == 0 ? str10 : "", (i5 & 1048576) != 0 ? new C317510CcX(false, null, false, null, null, null, 0, null, null, null, null, 2047) : c317510CcX2);
    }

    public C20611415l2(String str, int i, int i2, String str2, String str3, String str4, UrlModel urlModel, String str5, String str6, String str7, String str8, int i3, String str9, String str10, int i4, String str11, String str12, String str13, String str14, String str15, C317510CcX c317510CcX) {
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = str2;
        this.LJ = str3;
        this.LJFF = str4;
        this.LJI = urlModel;
        this.LJII = str5;
        this.LJIIIIZZ = str6;
        this.LJIIIZ = str7;
        this.LJIIJ = str8;
        this.LJIIJJI = i3;
        this.LJIIL = str9;
        this.LJIILIIL = str10;
        this.LJIILJJIL = i4;
        this.LJIILL = str11;
        this.LJIILLIIL = str12;
        this.LJIIZILJ = str13;
        this.LJIJ = str14;
        this.LJIJI = str15;
        this.LJIJJ = c317510CcX;
    }
}

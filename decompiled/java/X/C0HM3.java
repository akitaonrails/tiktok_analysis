package X;

import com.ss.android.ugc.aweme.socialavatar.api.SocialAvatarAddFlashToCreationExperiment;

/* JADX INFO: renamed from: X.0HM3, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HM3 {
    public final C0HM5 LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;

    public C0HM3() {
        this(false, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0HM3)) {
            return false;
        }
        C0HM3 c0hm3 = (C0HM3) obj;
        return this.LIZ == c0hm3.LIZ && this.LIZIZ == c0hm3.LIZIZ && this.LIZJ == c0hm3.LIZJ;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C0HM3(boolean z, int i) {
        C0HM5 c0hm5;
        if ((i & 1) != 0) {
            SocialAvatarAddFlashToCreationExperiment.LIZ.getClass();
            if (((Boolean) SocialAvatarAddFlashToCreationExperiment.LJ.getValue()).booleanValue()) {
                c0hm5 = C0HM5.FLASH_AUTO;
            } else {
                c0hm5 = C0HM5.FLASH_OFF;
            }
        } else {
            c0hm5 = null;
        }
        this(c0hm5, (i & 2) != 0 ? false : z, false);
    }

    public C0HM3(C0HM5 c0hm5, boolean z, boolean z2) {
        this.LIZ = c0hm5;
        this.LIZIZ = z;
        this.LIZJ = z2;
    }
}

package X;

import com.bytedance.android.livesdk.livesetting.gift.HideGiftIconForUserSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveAnchorGiftDisableSetting;

/* JADX INFO: renamed from: X.0fCx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1118330fCx {
    public final EnumC1118320fCw LIZ;
    public final EnumC1118320fCw LIZIZ;
    public final EnumC1118320fCw LIZJ;
    public final EnumC1118320fCw LIZLLL;
    public final EnumC1118320fCw LJ;

    public final boolean LIZ(C1118330fCx c1118330fCx) {
        EnumC1118320fCw enumC1118320fCw;
        boolean z = !HideGiftIconForUserSetting.INSTANCE.getValue();
        boolean value = LiveAnchorGiftDisableSetting.INSTANCE.getValue();
        EnumC1118320fCw enumC1118320fCw2 = this.LIZ;
        EnumC1118320fCw enumC1118320fCw3 = EnumC1118320fCw.YES;
        if ((enumC1118320fCw2 == enumC1118320fCw3 && c1118330fCx.LIZ == EnumC1118320fCw.NO) || (enumC1118320fCw2 == (enumC1118320fCw = EnumC1118320fCw.NO) && c1118330fCx.LIZ == enumC1118320fCw3)) {
            return false;
        }
        EnumC1118320fCw enumC1118320fCw4 = this.LIZIZ;
        if ((enumC1118320fCw4 == enumC1118320fCw3 && c1118330fCx.LIZIZ == enumC1118320fCw) || (enumC1118320fCw4 == enumC1118320fCw && c1118330fCx.LIZIZ == enumC1118320fCw3)) {
            return false;
        }
        if (!z ? this.LIZJ == enumC1118320fCw3 : this.LIZJ == enumC1118320fCw) {
            return false;
        }
        EnumC1118320fCw enumC1118320fCw5 = this.LIZLLL;
        if (enumC1118320fCw5 != enumC1118320fCw3 || c1118330fCx.LIZLLL != enumC1118320fCw) {
            if (enumC1118320fCw5 == enumC1118320fCw && c1118330fCx.LIZLLL == enumC1118320fCw3) {
                return false;
            }
            if (value) {
                if (this.LJ != enumC1118320fCw) {
                    return true;
                }
                return false;
            }
            if (this.LJ != enumC1118320fCw3) {
                return true;
            }
            return false;
        }
        return false;
    }

    public C1118330fCx(EnumC1118320fCw enumC1118320fCw, EnumC1118320fCw enumC1118320fCw2, EnumC1118320fCw enumC1118320fCw3, EnumC1118320fCw enumC1118320fCw4, EnumC1118320fCw enumC1118320fCw5) {
        this.LIZ = enumC1118320fCw;
        this.LIZIZ = enumC1118320fCw2;
        this.LIZJ = enumC1118320fCw3;
        this.LIZLLL = enumC1118320fCw4;
        this.LJ = enumC1118320fCw5;
    }
}

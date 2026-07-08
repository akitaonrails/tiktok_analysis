package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMockAvatarConfigSetting;
import webcast.data.multi_guest_social_data.Avatar;

/* JADX INFO: renamed from: X.0UUf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C773070UUf {
    public final Avatar LIZ;
    public final boolean LIZIZ;
    public final LinkMicMockAvatarConfigSetting.Config LIZJ = LinkMicMockAvatarConfigSetting.INSTANCE.getValue();
    public C2247611Cy7 LIZLLL = new C2247611Cy7(this, 0, 0, 0, 31);

    public String LIZ() {
        return "";
    }

    public String LIZIZ() {
        return "";
    }

    public void LIZJ() {
    }

    public boolean LIZLLL() {
        return true;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isValid=");
        sbLIZ.append(LIZLLL());
        sbLIZ.append(" Status=");
        LIZJ();
        sbLIZ.append(0);
        sbLIZ.append(" quiteVideo=");
        sbLIZ.append(LIZ());
        sbLIZ.append(" speakVideo=");
        sbLIZ.append(LIZIZ());
        sbLIZ.append(" pushWidth=");
        sbLIZ.append(this.LIZLLL);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C773070UUf(Avatar avatar, boolean z) {
        this.LIZ = avatar;
        this.LIZIZ = z;
    }

    public final void LJ(int i, int i2, int i3) {
        Integer numValueOf;
        C2247611Cy7 c2247611Cy7;
        Number numberValueOf;
        if (i != 0 && i2 != 0) {
            float f = i2 / i;
            C2247611Cy7 c2247611Cy72 = this.LIZLLL;
            Integer numValueOf2 = null;
            if (c2247611Cy72 != null) {
                numValueOf = Integer.valueOf(c2247611Cy72.LIZ);
            } else {
                numValueOf = null;
            }
            C2247611Cy7 c2247611Cy73 = this.LIZLLL;
            if (c2247611Cy73 != null) {
                numValueOf2 = Integer.valueOf(c2247611Cy73.LIZIZ);
            }
            int iIntValue = 1024;
            int iIntValue2 = 540;
            if (f >= this.LIZJ.outputRatio) {
                if (numValueOf != null) {
                    iIntValue2 = numValueOf.intValue();
                }
                if (numValueOf2 != null) {
                    iIntValue = numValueOf2.intValue();
                }
                c2247611Cy7 = new C2247611Cy7(this, iIntValue2, iIntValue, i3, 3);
            } else {
                if (numValueOf != null) {
                    iIntValue2 = numValueOf.intValue();
                }
                if (numValueOf2 == null) {
                    numberValueOf = 1024;
                } else {
                    numberValueOf = Float.valueOf(numValueOf2.intValue() * this.LIZJ.outputRatio);
                }
                c2247611Cy7 = new C2247611Cy7(this, iIntValue2, numberValueOf.intValue(), i3, 3);
            }
            this.LIZLLL = c2247611Cy7;
        }
    }
}

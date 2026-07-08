package X;

import com.bytedance.effectcreatormobile.ckeapi.api.onboardingv2.OnBoardingV2LinkData;
import java.util.List;

/* JADX INFO: renamed from: X.003l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0171003l {
    public final boolean LIZ;
    public final List<OnBoardingV2LinkData> LIZIZ;

    public C0171003l() {
        this(0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OnBoardingV2AB(enable=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", linkDataList=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0171003l(int i) {
        this(false, C13BV.INSTANCE);
    }

    public C0171003l(boolean z, List<OnBoardingV2LinkData> list) {
        this.LIZ = z;
        this.LIZIZ = list;
    }
}

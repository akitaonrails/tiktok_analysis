package X;

import Y.AcS498S0100000_27;
import android.content.Context;
import android.text.SpannableStringBuilder;
import java.util.Map;

/* JADX INFO: renamed from: X.0UmT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C782310UmT extends AbstractC1802960x1C implements InterfaceC782330UmV {
    @Override // X.InterfaceC782330UmV
    public final C782320UmU getIcon() {
        return new C782320UmU(new C753520Th8("tiktok_live_wallet_resource", "ttlive_ic_kyc_shield_v2.webp"));
    }

    @Override // X.InterfaceC782330UmV
    public final C773790UWz LIZ(String str, AcS498S0100000_27 acS498S0100000_27, String str2, AcS498S0100000_27 acS498S0100000_272) {
        C773780UWy c773780UWy = new C773780UWy();
        C782180UmG c782180UmG = new C782180UmG();
        c782180UmG.LIZ = str;
        c782180UmG.LIZJ = acS498S0100000_27;
        c773780UWy.LIZ(new C782070Um5(c782180UmG));
        C782210UmJ c782210UmJ = new C782210UmJ();
        c782210UmJ.LIZ = str2;
        c782210UmJ.LIZJ = acS498S0100000_272;
        c773780UWy.LIZ(new C0UQI(c782210UmJ));
        return new C773790UWz(c773780UWy);
    }

    @Override // X.InterfaceC782330UmV
    public final SpannableStringBuilder LIZIZ(Context context, String str, Map map, C1802820x0y c1802820x0y) {
        return AbstractC1802960x1C.LIZJ(context, str, map, c1802820x0y);
    }
}

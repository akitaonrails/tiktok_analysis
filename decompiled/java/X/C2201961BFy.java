package X;

import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import kotlin.jvm.internal.AFwS225S0000000_34;

/* JADX INFO: renamed from: X.1BFy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2201961BFy {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(11));
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(10));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(12));

    public static final void LIZ(TuxIconView tuxIconView, IMUser iMUser) {
        String enterpriseVerifyReason;
        String enterpriseVerifyReason2;
        C786410Ut5.LLLLLLZZ(tuxIconView, 0);
        if (iMUser != null && (((enterpriseVerifyReason2 = iMUser.getEnterpriseVerifyReason()) == null || enterpriseVerifyReason2.length() == 0) && iMUser.getVerificationType() == 2)) {
            tuxIconView.setTuxIcon((C419910GdJ) LIZ.getValue());
            return;
        }
        String customVerify = null;
        if (iMUser != null) {
            enterpriseVerifyReason = iMUser.getEnterpriseVerifyReason();
        } else {
            enterpriseVerifyReason = null;
        }
        if (C123100dR.LIZ(enterpriseVerifyReason)) {
            tuxIconView.setTuxIcon((C419910GdJ) LIZIZ.getValue());
            return;
        }
        if (iMUser != null) {
            customVerify = iMUser.getCustomVerify();
        }
        if (C123100dR.LIZ(customVerify)) {
            tuxIconView.setTuxIcon((C419910GdJ) LIZJ.getValue());
        } else {
            C786410Ut5.LLLLLLZZ(tuxIconView, 8);
        }
    }
}

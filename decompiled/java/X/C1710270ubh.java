package X;

import com.ss.android.ugc.aweme.pipo.cashier.cashier.ab.PipoCashierElementVerifierSettings;
import com.ss.android.ugc.aweme.pipo.cashier.cashier.ccdc.CCDCAddCardViewModel;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.RawTextAndIcon;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0ubh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final /* synthetic */ class C1710270ubh extends C2217421BqW implements Function1<String, String> {
    public C1710270ubh(CCDCAddCardViewModel cCDCAddCardViewModel) {
        super(1, cCDCAddCardViewModel, CCDCAddCardViewModel.class, "verifyCardIfValid", "verifyCardIfValid(Ljava/lang/String;)Ljava/lang/String;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final String invoke(String str) {
        C1709640uag c1709640uag;
        C1709570uaZ c1709570uaZ;
        RawTextAndIcon rawTextAndIconLJJIIZI;
        String str2 = str;
        CCDCAddCardViewModel cCDCAddCardViewModel = (CCDCAddCardViewModel) this.receiver;
        cCDCAddCardViewModel.getClass();
        if (PipoCashierElementVerifierSettings.LIZ().luhnSwitch) {
            if ((str2 == null || !C904903gF.LIZ(str2)) && (c1709640uag = cCDCAddCardViewModel.LLILLJJLI) != null && (c1709570uaZ = c1709640uag.LJIIIIZZ) != null && (rawTextAndIconLJJIIZI = c1709570uaZ.LJJIIZI()) != null) {
                return rawTextAndIconLJJIIZI.ccdcCardNumInvalid;
            }
            return null;
        }
        return null;
    }
}

package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.pipo.cashier.cashier.ccdc.CCDCAddCardViewModel;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.RawTextAndIcon;
import java.time.LocalDate;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0ubz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final /* synthetic */ class C1710450ubz extends C2217421BqW implements Function1<String, String> {
    public C1710450ubz(CCDCAddCardViewModel cCDCAddCardViewModel) {
        super(1, cCDCAddCardViewModel, CCDCAddCardViewModel.class, "verifyDateHasBeenExpired", "verifyDateHasBeenExpired(Ljava/lang/String;)Ljava/lang/String;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final String invoke(String str) {
        boolean z;
        int iIntValue;
        C1709640uag c1709640uag;
        C1709570uaZ c1709570uaZ;
        RawTextAndIcon rawTextAndIconLJJIIZI;
        String str2 = str;
        CCDCAddCardViewModel cCDCAddCardViewModel = (CCDCAddCardViewModel) this.receiver;
        cCDCAddCardViewModel.getClass();
        if (str2 != null) {
            List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str2, new String[]{"/"}, 0, 6);
            String str3 = (String) C13LP.LJJJLZIJ(0, listLJJLIIIJILLIZJL);
            boolean z2 = true;
            String str4 = (String) C13LP.LJJJLZIJ(1, listLJJLIIIJILLIZJL);
            if (str4 != null && str4.length() == 2) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (str3 == null || str3.length() != 2) {
                    z2 = false;
                }
                if (z2) {
                    try {
                        int year = LocalDate.now().getYear();
                        int monthValue = LocalDate.now().getMonthValue();
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("00");
                        sbLIZ.append(year);
                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                        Integer numLJIIJJI = C2095008Iq.LJIIJJI(str3);
                        if (numLJIIJJI != null) {
                            iIntValue = numLJIIJJI.intValue();
                        } else {
                            iIntValue = Integer.MAX_VALUE;
                        }
                        if (u.LJIIZILJ(strLIZIZ, str4, false) && monthValue > iIntValue && (c1709640uag = cCDCAddCardViewModel.LLILLJJLI) != null && (c1709570uaZ = c1709640uag.LJIIIIZZ) != null && (rawTextAndIconLJJIIZI = c1709570uaZ.LJJIIZI()) != null) {
                            return rawTextAndIconLJJIIZI.ccdcCardExpired;
                        }
                        return null;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        return null;
                    }
                }
                return null;
            }
            return null;
        }
        return null;
    }
}

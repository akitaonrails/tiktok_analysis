package X;

import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.MessageAlert;

/* JADX INFO: renamed from: X.0YxS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C891040YxS {
    public static boolean LIZ() {
        IMContactApi.LIZ.getClass();
        InterfaceC15516065q interfaceC15516065qLIZJ = C069P.LIZ().LIZJ();
        EnumC1725606pK enumC1725606pK = EnumC1725606pK.MESSAGE_ALERT;
        MessageAlert messageAlert = (MessageAlert) interfaceC15516065qLIZJ.LJFF(enumC1725606pK, null, null, enumC1725606pK.getAllowUsingLocalStaleValue(), true);
        if (messageAlert == null) {
            return false;
        }
        Integer num = messageAlert.outAppAlertNewStatus;
        return num != null && num.intValue() == EnumC891030YxR.ENABLE.getValue();
    }
}

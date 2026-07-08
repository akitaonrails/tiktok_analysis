package X;

import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.account.login.v2.ui.experiment.AlternativeChannel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.Locale;

/* JADX INFO: renamed from: X.0iIo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1237280iIo {
    public static final String LIZ(AlternativeChannel alternativeChannel) {
        String strLJIIIIZZ;
        String lowerCase;
        String str;
        IAccountService iAccountService = (IAccountService) PluggableExtentionKt.pluggableSpi$default(IAccountService.class, false, false, false, 14, null);
        if (iAccountService == null || (strLJIIIIZZ = iAccountService.LJIIIIZZ()) == null || (lowerCase = strLJIIIIZZ.toLowerCase(Locale.getDefault())) == null || (str = alternativeChannel.alternativeSmsAppConfig.get(lowerCase)) == null) {
            return "";
        }
        return str;
    }
}

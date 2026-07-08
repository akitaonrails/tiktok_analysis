package X;

import android.text.BidiFormatter;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.service.service.IIMAnonymousService;

/* JADX INFO: renamed from: X.0YzD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C892130YzD {
    public static final String LIZ(IMUser iMUser, String str) {
        String strLIZIZ;
        if (str.length() == 0) {
            return iMUser.getDisplayUserName();
        }
        IIMAnonymousService iIMAnonymousService = (IIMAnonymousService) PluggableExtentionKt.pluggableSpiForReal(IIMAnonymousService.class);
        if (iIMAnonymousService != null) {
            String uid = iMUser.getUid();
            if (uid == null) {
                uid = "";
            }
            if (iIMAnonymousService.LIZLLL(str, uid, false)) {
                String displayUserName = iMUser.getDisplayUserName();
                Character chLJLLILLLL = C13LN.LJLLILLLL(displayUserName);
                if (chLJLLILLLL != null) {
                    char cCharValue = chLJLLILLLL.charValue();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(cCharValue);
                    sbLIZ.append("***");
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                } else {
                    strLIZIZ = null;
                }
                String strUnicodeWrap = BidiFormatter.getInstance().unicodeWrap(strLIZIZ);
                if (strUnicodeWrap != null) {
                    return strUnicodeWrap;
                }
                return displayUserName;
            }
        }
        return iMUser.getDisplayUserName();
    }
}

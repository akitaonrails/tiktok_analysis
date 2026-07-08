package X;

import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;

/* JADX INFO: renamed from: X.0W8J, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0W8J {
    public static String LIZ() {
        String strLJIIIIZZ;
        String storeRegionUpperCase;
        C844470XAv.LIZ.getClass();
        String strValueOf = String.valueOf(C844470XAv.LJIIJ);
        String string = C0W8I.LIZ().toString();
        if (string.length() == 0) {
            string = CardStruct.IStatusCode.DEFAULT;
        }
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        curUserId.toString();
        IAccountService iAccountService = (IAccountService) PluggableExtentionKt.pluggableSpi$default(IAccountService.class, false, false, false, 14, null);
        if (iAccountService != null) {
            strLJIIIIZZ = iAccountService.LJIIIIZZ();
            storeRegionUpperCase = iAccountService.getStoreRegionUpperCase();
        } else {
            strLJIIIIZZ = "";
            storeRegionUpperCase = "";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("appid=");
        sbLIZ.append(strValueOf);
        sbLIZ.append("&did=");
        sbLIZ.append(string);
        sbLIZ.append("&uid=");
        sbLIZ.append(curUserId);
        sbLIZ.append("&Region=");
        sbLIZ.append(strLJIIIIZZ);
        sbLIZ.append("&StoreRegion=");
        sbLIZ.append(storeRegionUpperCase);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}

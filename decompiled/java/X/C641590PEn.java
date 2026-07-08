package X;

import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.discover.model.SearchUser;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixCardProfile;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import java.util.List;

/* JADX INFO: renamed from: X.0PEn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C641590PEn {
    public static int LIZ(SearchMixFeed searchMixFeed) {
        boolean z;
        if (searchMixFeed == null) {
            return -1;
        }
        Aweme aweme = searchMixFeed.getAweme();
        if (aweme != null && AwemeExtKt.isPhotoMode(aweme)) {
            z = true;
        } else {
            z = false;
        }
        switch (searchMixFeed.getFeedType()) {
            case 35:
                break;
            case 61:
                break;
            case 70:
                break;
            case 202:
                break;
            case 555:
                break;
            case 996:
                break;
            case 65280:
                if (z) {
                }
                break;
            case 65458:
                break;
            case 65465:
                break;
            case 65467:
                break;
            case 65514:
                if (!C651850PhX.LIZ(searchMixFeed.getDynamicPatch())) {
                    int i = ViewOnAttachStateChangeListenerC648030PbN.LLJLILLLLZIIL;
                }
                break;
        }
        return -1;
    }

    public static String LIZIZ(SearchMixFeed searchMixFeed) {
        String str;
        String str2 = null;
        ISearchCardProtocol<InterfaceC594520NTm> iSearchCardProtocolLJFF = C0PH8.LJFF(searchMixFeed, C0NMY.GENERAL_SEARCH, C651290Pgd.LIZLLL(), false);
        if (iSearchCardProtocolLJFF != null) {
            String strZm1 = iSearchCardProtocolLJFF.Zm1();
            if (strZm1 == null) {
                return iSearchCardProtocolLJFF.getClass().getSimpleName();
            }
            return strZm1;
        }
        int iLIZ = LIZ(searchMixFeed);
        if (iLIZ == 2) {
            C662390PyX c662390PyX = C662390PyX.LIZ;
            List<SearchUser> users = searchMixFeed.getUsers();
            c662390PyX.getClass();
            if (C662390PyX.LIZ(users)) {
                return "user_with_video_card";
            }
            return "user_list_card";
        }
        if (!C649470Pdh.LJIJ(iLIZ) && iLIZ != 15 && !C649470Pdh.LJJII(iLIZ)) {
            return String.valueOf(iLIZ);
        }
        DynamicPatch dynamicPatch = searchMixFeed.getDynamicPatch();
        if (dynamicPatch != null) {
            str = dynamicPatch.schema;
        } else {
            str = null;
        }
        SearchMixCardProfile cardProfile = searchMixFeed.getCardProfile();
        if (cardProfile != null) {
            str2 = cardProfile.sceneType;
        }
        if (C123100dR.LIZ(str2)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("lynx:");
            sbLIZ.append(C649470Pdh.LJ(str));
            sbLIZ.append('_');
            sbLIZ.append(str2);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("lynx:");
        sbLIZ2.append(C649470Pdh.LJ(str));
        return C2188811AlT.LIZIZ(sbLIZ2);
    }
}

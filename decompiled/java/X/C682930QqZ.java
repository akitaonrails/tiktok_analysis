package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.entrycard.viewmodel.SearchEntranceVM;
import com.ss.android.ugc.aweme.search.pages.result.nimble.ui.pages.image.model.ImageData;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.commerce.searchbrand.autoplay.SearchAdBrandZoneNestedAutoplayCardHelper;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS589S0100000_10;

/* JADX INFO: renamed from: X.0QqZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C682930QqZ {
    public final int LIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10));
    public boolean LIZIZ;
    public int LIZJ;
    public SearchMixFeed LIZLLL;
    public SearchAdBrandZoneNestedAutoplayCardHelper LJ;

    public static List LIZ(User user) {
        String quantityString;
        int totalFavorited;
        ArrayList arrayList = new ArrayList();
        String quantityString2 = "";
        if (user == null) {
            quantityString = "";
        } else {
            CharSequence charSequenceLIZ = C820940WIi.LIZ(user.getFollowerCount());
            C844470XAv.LIZ.getClass();
            quantityString = C844470XAv.LIZ().getResources().getQuantityString(2131755688, user.getFollowerCount(), charSequenceLIZ);
        }
        arrayList.add(new C423840Gje(quantityString));
        arrayList.add(new C423840Gje("·"));
        if (user != null) {
            CharSequence charSequenceLIZ2 = C820940WIi.LIZ(user.getTotalFavorited());
            if (user.getTotalFavorited() > 2147483647L) {
                totalFavorited = Integer.MAX_VALUE;
            } else {
                totalFavorited = (int) user.getTotalFavorited();
            }
            C844470XAv.LIZ.getClass();
            quantityString2 = C844470XAv.LIZ().getResources().getQuantityString(2131755686, totalFavorited, charSequenceLIZ2);
        }
        arrayList.add(new C423840Gje(quantityString2));
        return arrayList;
    }

    public final void LIZIZ(User user, SearchEntranceVM searchEntranceVM, FollowStatus followStatus) {
        if (!TextUtils.equals(followStatus.getUserId(), user.getUid()) || searchEntranceVM == null || this.LIZJ == followStatus.getFollowStatus()) {
            return;
        }
        user.setFollowStatus(followStatus.getFollowStatus());
        this.LIZJ = followStatus.getFollowStatus();
        searchEntranceVM.setState(new AwS589S0100000_10(LIZ(user), (List<ImageData>) 424));
    }
}

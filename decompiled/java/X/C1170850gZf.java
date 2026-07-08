package X;

import Y.AfS45S1100000_12;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionListFragmentForMineProfile;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionManageRequest;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionManageResponse;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0gZf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1170850gZf extends C09AY implements InterfaceC1631630sYr<String, Integer, List<? extends String>, Boolean, Unit> {
    public final /* synthetic */ CollectionListFragmentForMineProfile LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ C19EG LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1170850gZf(CollectionListFragmentForMineProfile collectionListFragmentForMineProfile, String str, C19EG c19eg) {
        super(4);
        this.LL = collectionListFragmentForMineProfile;
        this.LLILLJJLI = str;
        this.LLILLL = c19eg;
    }

    @Override // X.InterfaceC1631630sYr
    public final Unit invoke(String str, Integer num, List<? extends String> list, Boolean bool) {
        final String str2 = str;
        final int iIntValue = num.intValue();
        final List<? extends String> list2 = list;
        final boolean zBooleanValue = bool.booleanValue();
        final CollectionManageRequest collectionManageRequest = new CollectionManageRequest(1, null, str2, null, null, null, null, null, Integer.valueOf(iIntValue), list2, null, null);
        C11O8 c11o8LJJJLZIJ = new C1171340gaS().LLILLL.LLZLLIL(collectionManageRequest, false).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ());
        final String str3 = this.LLILLJJLI;
        final C19EG c19eg = this.LLILLL;
        final CollectionListFragmentForMineProfile collectionListFragmentForMineProfile = this.LL;
        this.LL.WR().LIZ(c11o8LJJJLZIJ.LJJLL(new C09JN() { // from class: X.0gaL
            @Override // X.C09JN
            public final void accept(Object obj) {
                String[] strArr;
                C1C7U.LIZ("CollectionListFragmentForMineProfile@346.onClickViewHolderToCreateCollection$createCollection$1$1");
                CollectionManageResponse collectionManageResponse = (CollectionManageResponse) obj;
                C1609306Rv c1609306Rv = C1609306Rv.LIZ;
                List<String> list3 = list2;
                c1609306Rv.getClass();
                C1609306Rv.LIZIZ(list3);
                C1171330gaR c1171330gaR = new C1171330gaR();
                c1171330gaR.LIZLLL = str3;
                c1171330gaR.LJIIZILJ(1);
                c1171330gaR.LJIJ(iIntValue);
                c1171330gaR.LJIIZILJ = "click_profile_favorite";
                c1171330gaR.LJIJI = collectionManageResponse.collectionId;
                c1171330gaR.LJIJJLI = zBooleanValue ? 1 : 0;
                c1171330gaR.LJIILLIIL(Integer.valueOf(iIntValue));
                c1171330gaR.LJIL = "profile_add";
                c1171330gaR.LJIJI = collectionManageResponse.collectionId;
                c1171330gaR.LJJIFFI = str2;
                String str4 = collectionListFragmentForMineProfile.ZR().LLILZ;
                if (str4 != null) {
                    c1171330gaR.LJJ = str4;
                }
                c1171330gaR.LJIILJJIL();
                String str5 = collectionManageResponse.collectionId;
                if (str5 == null) {
                    str5 = "";
                }
                SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(c19eg, "aweme://favorite/videos/collections/add/video");
                smartRouteBuildRoute.withParam("collectionId", str5);
                smartRouteBuildRoute.withParam("collectionName", str2);
                smartRouteBuildRoute.withParam("favourite_enter_method", collectionListFragmentForMineProfile.ZR().LLILZ);
                smartRouteBuildRoute.withParam("enterMethod", "create_collection");
                smartRouteBuildRoute.withParam("enter_from", collectionListFragmentForMineProfile.ZR().LLILLL);
                smartRouteBuildRoute.withParam("collection_status", iIntValue);
                List<String> list4 = list2;
                if (list4 != null) {
                    strArr = (String[]) list4.toArray(new String[0]);
                } else {
                    strArr = null;
                }
                smartRouteBuildRoute.withParam("collaborative_uid", strArr);
                smartRouteBuildRoute.open();
                C1440005kM.LIZ(new C742510TAr(collectionManageRequest, "create_collection"));
                C1C7U.LIZIZ("CollectionListFragmentForMineProfile@346.onClickViewHolderToCreateCollection$createCollection$1$1");
            }
        }, new AfS45S1100000_12(c19eg, str3, 2)));
        return Unit.LIZ;
    }
}

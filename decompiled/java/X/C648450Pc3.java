package X;

import Y.AObserverS214S0100000_10;
import Y.ARunnableS110S0100000_10;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.bytedance.ies.sdk.widgets.NextLiveData;
import com.ss.android.ugc.aweme.common.EventLiveData;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.friends.service.IFriendsService;
import com.ss.android.ugc.aweme.friends.service.RelationService;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import com.ss.android.ugc.aweme.search.common.viewmodel.SearchGlobalViewModel;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Pc3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C648450Pc3 extends AbstractC648060PbQ implements Observer<FollowStatus> {
    public final C01GW LLILLJJLI;
    public final AObserverS214S0100000_10 LLILLL;
    public final C01GW LLILZ;

    @Override // X.AbstractC648060PbQ
    public final void LJ() {
        C19EG c19eg = this.LL.LIZJ;
        if (c19eg != null) {
            if (Intrinsics.LJFF(Looper.getMainLooper(), Looper.myLooper())) {
                LJII();
            } else {
                c19eg.runOnUiThread(new ARunnableS110S0100000_10(this, 139));
            }
        }
        C650300Pf2.LIZLLL.LIZ((InterfaceC650320Pf4) this.LLILZ.getValue());
    }

    public final void LJII() {
        RelationService relationServiceLIZIZ;
        EventLiveData<FollowStatus> relationObservable;
        C647830Pb3 c647830Pb3 = this.LL;
        C19EG c19eg = c647830Pb3.LIZJ;
        if (c19eg == null) {
            return;
        }
        SAFHelper sAFHelper = SAFHelper.LIZ;
        Fragment fragment = c647830Pb3.LIZ;
        sAFHelper.getClass();
        LifecycleOwner lifecycleOwnerLJIJJ = SAFHelper.LJIJJ(fragment, c19eg);
        if (lifecycleOwnerLJIJJ == null) {
            return;
        }
        IFriendsService iFriendsService = (IFriendsService) PluggableExtentionKt.pluggableSpi$default(IFriendsService.class, false, false, false, 14, null);
        if (iFriendsService != null && (relationServiceLIZIZ = iFriendsService.LIZIZ()) != null && (relationObservable = relationServiceLIZIZ.getRelationObservable()) != null) {
            relationObservable.removeObserver(this);
            relationObservable.observe(lifecycleOwnerLJIJJ, this);
        }
        NextLiveData nextLiveData = ((SearchGlobalViewModel) C679340Qkm.LIZIZ(this.LL.LIZ, c19eg).get(SearchGlobalViewModel.class)).LLILLJJLI;
        nextLiveData.removeObserver(this.LLILLL);
        nextLiveData.observe(lifecycleOwnerLJIJJ, this.LLILLL);
    }

    public C648450Pc3(C647830Pb3 c647830Pb3) {
        super(c647830Pb3);
        this.LLILLJJLI = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(559));
        this.LLILLL = new AObserverS214S0100000_10(this, 123);
        this.LLILZ = C452501pT.LIZIZ(new AwS554S0100000_10(this, 1050));
    }

    @Override // androidx.lifecycle.Observer
    /* JADX INFO: renamed from: LJIIIIZZ, reason: merged with bridge method [inline-methods] */
    public final void onChanged(FollowStatus followStatus) throws JSONException {
        String userId;
        String userId2 = followStatus.getUserId();
        if (userId2 != null) {
            int followStatus2 = followStatus.getFollowStatus();
            C647830Pb3 c647830Pb3 = this.LL;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("uid", userId2);
            jSONObject.put("follow_status", followStatus2);
            c647830Pb3.LIZ("changeFollowState", jSONObject);
        }
        if ((followStatus.getFollowStatus() == 1 || followStatus.getFollowStatus() == 2 || followStatus.getFollowStatus() == 4) && (userId = followStatus.getUserId()) != null) {
            C647830Pb3 c647830Pb32 = this.LL;
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("uid", userId);
            jSONObject2.put("block_status", 0);
            c647830Pb32.LIZ("changeBlockState", jSONObject2);
        }
    }
}

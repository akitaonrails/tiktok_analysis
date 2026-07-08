package Y;

import X.C1537720q7O;
import X.C1D6Q;
import X.C641860PFo;
import X.C648540PcC;
import X.C682930QqZ;
import android.widget.FrameLayout;
import androidx.lifecycle.Observer;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.entrycard.viewmodel.SearchEntranceVM;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.viewmodel.SearchRefreshPredictMobCanShowVM;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.hub.core.viewmodel.SearchHubHeaderVM;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.hub.core.viewmodel.SearchHubVM;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class AObserverS123S0300000_10 implements Observer {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.$t) {
            case 0:
                onChanged$0(this, obj);
                break;
            case 1:
                onChanged$1(this, obj);
                break;
            case 2:
                onChanged$2(this, obj);
                break;
            case 3:
                onChanged$3(this, obj);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0187  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onChanged$0(Y.AObserverS123S0300000_10 r16, java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 472
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AObserverS123S0300000_10.onChanged$0(Y.AObserverS123S0300000_10, java.lang.Object):void");
    }

    public static final void onChanged$1(AObserverS123S0300000_10 aObserverS123S0300000_10, Object obj) {
        if (((Boolean) obj).booleanValue() && !((C1D6Q) aObserverS123S0300000_10.l0).LIZ && Intrinsics.LJFF(((SearchRefreshPredictMobCanShowVM) aObserverS123S0300000_10.l1).LLILLL, Boolean.FALSE)) {
            ((C1D6Q) aObserverS123S0300000_10.l0).LIZ = true;
            C1537720q7O c1537720q7O = (C1537720q7O) aObserverS123S0300000_10.l2;
            if (c1537720q7O != null) {
                c1537720q7O.LIZ("cardShow", new JSONObject());
            }
        }
        if (((C1D6Q) aObserverS123S0300000_10.l0).LIZ) {
            ((SearchRefreshPredictMobCanShowVM) aObserverS123S0300000_10.l1).LLILLJJLI.removeObserver(aObserverS123S0300000_10);
        }
    }

    public static final void onChanged$2(AObserverS123S0300000_10 aObserverS123S0300000_10, Object obj) {
        DynamicPatch dynamicPatch = ((SearchHubHeaderVM) aObserverS123S0300000_10.l0).getState().LL.LIZ;
        if (dynamicPatch != null) {
            C641860PFo c641860PFo = C641860PFo.LIZ;
            SearchHubVM searchHubVM = (SearchHubVM) aObserverS123S0300000_10.l1;
            FrameLayout frameLayout = (FrameLayout) aObserverS123S0300000_10.l2;
            c641860PFo.getClass();
            C641860PFo.LJ(dynamicPatch, searchHubVM, frameLayout);
        }
    }

    public static final void onChanged$3(AObserverS123S0300000_10 aObserverS123S0300000_10, Object obj) {
        Map<String, Integer> map;
        Integer num;
        C648540PcC c648540PcC = (C648540PcC) obj;
        C682930QqZ c682930QqZ = (C682930QqZ) aObserverS123S0300000_10.l0;
        SearchEntranceVM searchEntranceVM = (SearchEntranceVM) aObserverS123S0300000_10.l1;
        User user = (User) aObserverS123S0300000_10.l2;
        c682930QqZ.getClass();
        if (c648540PcC != null && (map = c648540PcC.LIZIZ) != null && (num = map.get(user.getUid())) != null) {
            int iIntValue = num.intValue();
            if (Intrinsics.LJFF(user.getUid(), c648540PcC.LIZ)) {
                c682930QqZ.LIZIZ(user, searchEntranceVM, new FollowStatus(user.getUid(), iIntValue));
            }
        }
    }

    public AObserverS123S0300000_10(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj3;
        this.l1 = obj2;
        this.l2 = obj;
    }
}

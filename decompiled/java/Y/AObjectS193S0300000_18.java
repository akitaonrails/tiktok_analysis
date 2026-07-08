package Y;

import X.C1171300gaO;
import X.C1171340gaS;
import X.C1192640h8o;
import X.C11NZ;
import X.C11S5;
import X.C1397660mTU;
import X.C1701940uOG;
import X.C19EG;
import X.C516201zk;
import X.EnumC1192790h93;
import X.InterfaceC500500Jk0;
import com.bytedance.android.btm.api.model.PageFinder;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionContentFragment;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionManageRequest;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.poi.osp.repo.model.ButtonAction;
import java.util.Collections;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes19.dex */
public class AObjectS193S0300000_18 implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AObjectS193S0300000_18 aObjectS193S0300000_18, Object obj) {
        C11NZ<BaseResponse> c11nzLJIIJ;
        C1397660mTU c1397660mTU = (C1397660mTU) obj;
        C1171300gaO c1171300gaO = new C1171340gaS().LLILLL;
        String aid = ((Aweme) aObjectS193S0300000_18.l0).getAid();
        String str = ((CollectionContentFragment) aObjectS193S0300000_18.l1).qS().id;
        if (str != null) {
            c11nzLJIIJ = c1171300gaO.LL.LL.LJIIJ(aid, 0).LJLLL(c1171300gaO.LLZLLIL(new CollectionManageRequest(11, str, null, null, null, null, Collections.singletonList(aid), null, null, null, null, null), false), new InterfaceC500500Jk0() { // from class: X.0L57
                @Override // X.InterfaceC500500Jk0
                public final Object apply(Object obj2, Object obj3) {
                    return obj2;
                }
            });
        } else {
            c11nzLJIIJ = c1171300gaO.LL.LL.LJIIJ(aid, 0);
        }
        ((CollectionContentFragment) aObjectS193S0300000_18.l1).kS().LIZ(c11nzLJIIJ.LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS154S0200000_18((CollectionContentFragment) aObjectS193S0300000_18.l1, (Aweme) aObjectS193S0300000_18.l0, 3), new C516201zk((C19EG) aObjectS193S0300000_18.l2, 97)));
        c1397660mTU.LIZ().LIZIZ(null);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AObjectS193S0300000_18 aObjectS193S0300000_18, Object obj) throws JSONException {
        PageFinder pageFinderVia = PageFinder.via(((JSONObject) aObjectS193S0300000_18.l0).optString("btm_page_id"));
        Integer num = ((ButtonAction) aObjectS193S0300000_18.l1).type;
        int value = EnumC1192790h93.CLOSE_PAGE.getValue();
        if (num != null && num.intValue() == value) {
            ((Function0) aObjectS193S0300000_18.l2).invoke();
            C1192640h8o.LIZIZ(pageFinderVia, "leave", (JSONObject) aObjectS193S0300000_18.l0);
        } else {
            int value2 = EnumC1192790h93.NONE.getValue();
            if (num == null || num.intValue() == value2) {
                C1192640h8o.LIZIZ(pageFinderVia, "continue", (JSONObject) aObjectS193S0300000_18.l0);
            } else {
                C1192640h8o.LIZIZ(pageFinderVia, "continue", (JSONObject) aObjectS193S0300000_18.l0);
            }
        }
        return Unit.LIZ;
    }

    public AObjectS193S0300000_18(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}

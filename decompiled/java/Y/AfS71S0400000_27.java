package Y;

import X.C09JN;
import X.C1810070xCf;
import X.C1812020xFo;
import X.C1812030xFp;
import X.C1C7U;
import X.InterfaceC1810130xCl;
import X.InterfaceC594650NTz;
import android.content.Context;
import com.bytedance.android.live.rank.impl.list.viewmodel.RankRootViewModel;
import com.bytedance.android.livesdk.rank.api.RankTypeV2;
import com.bytedance.android.livesdkapi.depend.model.follow.FollowPair;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;

/* JADX INFO: loaded from: classes28.dex */
public class AfS71S0400000_27 implements C09JN {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
            case 2:
                accept$2(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS71S0400000_27 afS71S0400000_27, Object obj) {
        C1C7U.LIZ("LiveUserService@518d.handleFollow$1");
        ((C1812030xFp) afS71S0400000_27.l0).LIZIZ((Context) afS71S0400000_27.l1, (FollowPair) afS71S0400000_27.l2, (InterfaceC594650NTz) afS71S0400000_27.l3);
        C1C7U.LIZIZ("LiveUserService@518d.handleFollow$1");
    }

    public static final void accept$1(AfS71S0400000_27 afS71S0400000_27, Object obj) {
        C1C7U.LIZ("UserActionMethod@38d4.followFromWeb$1");
        ((C1812020xFo) afS71S0400000_27.l0).LIZJ((Context) afS71S0400000_27.l1, (FollowPair) afS71S0400000_27.l2, (CompletionBlock) afS71S0400000_27.l3);
        C1C7U.LIZIZ("UserActionMethod@38d4.followFromWeb$1");
    }

    public static final void accept$2(AfS71S0400000_27 afS71S0400000_27, Object obj) {
        C1C7U.LIZ("RankRootViewModel@6c76.requestListDataLeague$disposable$1");
        ((RankRootViewModel) afS71S0400000_27.l0).xQ2((String) obj, (RankTypeV2) afS71S0400000_27.l1, (InterfaceC1810130xCl) afS71S0400000_27.l2, (C1810070xCf) afS71S0400000_27.l3, false);
        C1C7U.LIZIZ("RankRootViewModel@6c76.requestListDataLeague$disposable$1");
    }

    public AfS71S0400000_27(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.l3 = obj4;
    }
}

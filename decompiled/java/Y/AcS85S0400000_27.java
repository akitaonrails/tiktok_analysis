package Y;

import X.C1797250wrz;
import X.C1802660x0i;
import X.C1802670x0j;
import X.C1812020xFo;
import X.EnumC1782240wTm;
import X.InterfaceC743640TFa;
import android.content.Context;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.iap.service.IapService;
import com.bytedance.android.livesdkapi.depend.model.follow.FollowPair;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;

/* JADX INFO: loaded from: classes28.dex */
public class AcS85S0400000_27 implements InterfaceC743640TFa {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // X.InterfaceC743640TFa
    public final void LIZ(LiveDialog liveDialog) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, liveDialog);
                break;
            case 1:
                LIZ$1(this, liveDialog);
                break;
            case 2:
                LIZ$2(this, liveDialog);
                break;
        }
    }

    public static final void LIZ$0(AcS85S0400000_27 acS85S0400000_27, LiveDialog liveDialog) {
        C1802660x0i.LIZJ((C1797250wrz) acS85S0400000_27.l1, "go_to_google_play_store");
        ((IapService) acS85S0400000_27.l2).LIZLLL(EnumC1782240wTm.MAIN_PAGE, (Context) acS85S0400000_27.l3);
    }

    public static final void LIZ$1(AcS85S0400000_27 acS85S0400000_27, LiveDialog liveDialog) {
        C1802670x0j.LIZJ((C1797250wrz) acS85S0400000_27.l1, "go_to_google_play_store");
        ((IapService) acS85S0400000_27.l2).LIZLLL(EnumC1782240wTm.ORDER_HISTORY, (Context) acS85S0400000_27.l3);
    }

    public static final void LIZ$2(AcS85S0400000_27 acS85S0400000_27, LiveDialog liveDialog) {
        FollowPair followPair = ((C1812020xFo) acS85S0400000_27.l0).LLILZ;
        if (followPair != null) {
            followPair.LJI = false;
        }
        liveDialog.dismiss();
        ((C1812020xFo) acS85S0400000_27.l0).LIZJ((Context) acS85S0400000_27.l1, (FollowPair) acS85S0400000_27.l2, (CompletionBlock) acS85S0400000_27.l3);
        FollowPair followPair2 = ((C1812020xFo) acS85S0400000_27.l0).LLILZ;
        if (followPair2 != null) {
            followPair2.LJI = true;
        }
    }

    public AcS85S0400000_27(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.l3 = obj4;
    }
}

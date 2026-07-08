package Y;

import X.C0SZ8;
import X.C1387280mCk;
import X.C1618440sDa;
import X.C281310B0v;
import X.C611350NyP;
import X.C729510SjV;
import X.C796490VMh;
import X.InterfaceC1364105Vn;
import com.ss.android.ugc.aweme.feed.controller.PlayerController;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes10.dex */
public class AObjectS190S0300000_9 implements Function1 {
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

    public static final Object invoke$0(AObjectS190S0300000_9 aObjectS190S0300000_9, Object obj) {
        PlayerController playerController = (PlayerController) aObjectS190S0300000_9.l0;
        Aweme aweme = (Aweme) aObjectS190S0300000_9.l1;
        C0SZ8 c0sz8 = (C0SZ8) aObjectS190S0300000_9.l2;
        C1387280mCk c1387280mCk = (C1387280mCk) obj;
        playerController.getClass();
        boolean zLJIJI = C1618440sDa.LIZIZ.LJJIIJ().LJIJI(c0sz8);
        if (!C729510SjV.LJJIJIL(aweme) && !zLJIJI) {
            return null;
        }
        if (C281310B0v.LIZ()) {
            c1387280mCk.LJJJ = 2;
        } else {
            c1387280mCk.LJJJ = 1;
        }
        if (zLJIJI) {
            c1387280mCk.LJJIZ = 1;
            return null;
        }
        c1387280mCk.LJJIZ = 0;
        return null;
    }

    public static final Object invoke$1(AObjectS190S0300000_9 aObjectS190S0300000_9, Object obj) {
        C796490VMh c796490VMh = (C796490VMh) aObjectS190S0300000_9.l0;
        c796490VMh.getClass();
        return C611350NyP.LIZ(c796490VMh, (List) aObjectS190S0300000_9.l1, (List) aObjectS190S0300000_9.l2, (InterfaceC1364105Vn) obj);
    }

    public AObjectS190S0300000_9(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}

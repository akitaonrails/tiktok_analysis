package Y;

import com.ss.android.ugc.aweme.feed.controller.PlayerController;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes10.dex */
public class AObjectS80S0201000_9 implements Function1 {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

    public static final Object invoke$0(AObjectS80S0201000_9 aObjectS80S0201000_9, Object obj) {
        return PlayerController.LLILLL((PlayerController) aObjectS80S0201000_9.l0, (Aweme) aObjectS80S0201000_9.l1, aObjectS80S0201000_9.i2, (Aweme) obj);
    }

    public static final Object invoke$1(AObjectS80S0201000_9 aObjectS80S0201000_9, Object obj) {
        return PlayerController.LLIIIZ((PlayerController) aObjectS80S0201000_9.l0, (Aweme) aObjectS80S0201000_9.l1, aObjectS80S0201000_9.i2, (Aweme) obj);
    }

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

    public AObjectS80S0201000_9(PlayerController playerController, Aweme aweme, int i, int i2) {
        this.$t = i2;
        this.l0 = playerController;
        this.l1 = aweme;
        this.i2 = i;
    }
}

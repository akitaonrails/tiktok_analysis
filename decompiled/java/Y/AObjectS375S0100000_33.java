package Y;

import X.C1AJO;
import X.C2177431AJp;
import com.ss.android.ugc.aweme.feed.adapter.FeedLiveViewHolderNewV2;
import com.ss.android.ugc.aweme.feed.adapter.widget.player.LivePreviewPlayerVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes34.dex */
public class AObjectS375S0100000_33 implements Function1 {
    public final int $t;
    public Object l0;

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

    public AObjectS375S0100000_33(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final Object invoke$0(AObjectS375S0100000_33 aObjectS375S0100000_33, Object obj) {
        C1AJO c1ajo = (C1AJO) aObjectS375S0100000_33.l0;
        c1ajo.getClass();
        c1ajo.LLLF = ((C2177431AJp) obj).LIZ;
        return Unit.LIZ;
    }

    public static final Object invoke$1(AObjectS375S0100000_33 aObjectS375S0100000_33, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        LivePreviewPlayerVM livePreviewPlayerVMA1 = ((FeedLiveViewHolderNewV2) aObjectS375S0100000_33.l0).A1();
        if (livePreviewPlayerVMA1 != null) {
            livePreviewPlayerVMA1.LLJLLIL.LJJIII(zBooleanValue);
        }
        return Unit.LIZ;
    }
}

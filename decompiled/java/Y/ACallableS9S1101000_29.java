package Y;

import X.C118I;
import X.C118O;
import X.C118V;
import X.C11EQ;
import X.C196925122x;
import X.C1C7U;
import X.C20684815ws;
import X.C384910F7h;
import com.ss.android.ugc.aweme.api.AnchorSearchResponse;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.discover.model.Banner;
import com.ss.android.ugc.aweme.editSticker.compile.TextStickerCompileResult;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import kotlin.Unit;

/* JADX INFO: loaded from: classes30.dex */
public class ACallableS9S1101000_29 implements Callable {
    public final int $t;
    public int i2;
    public Object l1;
    public String s0;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            case 2:
                return call$2(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS9S1101000_29 aCallableS9S1101000_29) {
        C1C7U.LIZ("EditTextStickerComponent@10da.compileWithoutPNG$task$1");
        TextStickerCompileResult textStickerCompileResult = new TextStickerCompileResult(((C196925122x) aCallableS9S1101000_29.l1).LJIIJ(), new C384910F7h(aCallableS9S1101000_29.s0, aCallableS9S1101000_29.i2, ((C196925122x) aCallableS9S1101000_29.l1).hashCode()));
        C1C7U.LIZIZ("EditTextStickerComponent@10da.compileWithoutPNG$task$1");
        return textStickerCompileResult;
    }

    public static final Object call$1(ACallableS9S1101000_29 aCallableS9S1101000_29) {
        C1C7U.LIZ("DiscoverBannerViewHolder@ba56.mobBannerShow$1");
        MobClick mobClickObtain = MobClick.obtain();
        mobClickObtain.setEventName("banner_show");
        mobClickObtain.setLabelName("discovery");
        mobClickObtain.setExtValueLong(aCallableS9S1101000_29.i2);
        mobClickObtain.setValue(String.valueOf(((Banner) aCallableS9S1101000_29.l1).getCreativeId()));
        C20684815ws.onEvent(mobClickObtain);
        C11EQ c11eq = new C11EQ();
        c11eq.setBannerId(((Banner) aCallableS9S1101000_29.l1).getBid());
        c11eq.setTagId(aCallableS9S1101000_29.s0);
        c11eq.setClientOrder(aCallableS9S1101000_29.i2);
        C20684815ws.LJIILLIIL("banner_show", c11eq.buildParams());
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DiscoverBannerViewHolder@ba56.mobBannerShow$1");
        return unit;
    }

    public static final Object call$2(ACallableS9S1101000_29 aCallableS9S1101000_29) throws ExecutionException, InterruptedException {
        C1C7U.LIZ("AnchorSearchModel@a8a2.fetchList$1");
        C118V c118v = C118V.LIZ;
        int i = ((C118I) aCallableS9S1101000_29.l1).LL;
        String str = aCallableS9S1101000_29.s0;
        int i2 = aCallableS9S1101000_29.i2;
        c118v.getClass();
        AnchorSearchResponse anchorSearchResponse = ((C118O) C118V.LIZIZ.create(C118O.class)).LIZ(i, str, i2, 20).get();
        C1C7U.LIZIZ("AnchorSearchModel@a8a2.fetchList$1");
        return anchorSearchResponse;
    }

    public ACallableS9S1101000_29(int i, Object obj, String str, int i2) {
        this.$t = i2;
        this.i2 = i;
        this.l1 = obj;
        this.s0 = str;
    }
}

package Y;

import X.C06W2;
import X.C1192870h9B;
import X.C1193630hAP;
import com.ss.android.ugc.aweme.app.PushCameraBlurActivity;
import com.ss.android.ugc.aweme.live.LiveDummyActivity;
import com.ss.android.ugc.aweme.prop.activity.StickerPropDetailActicity;
import com.ss.android.ugc.aweme.share.gif.ui.VideoShare2GifEditActivity;
import com.ss.android.ugc.aweme.share.gif.ui.VideoShare2GifPreviewActivity;
import java.util.Objects;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes22.dex */
public class AObjectS122S0000000_21 implements Function1 {
    public final int $t;

    public static final Object invoke$2(AObjectS122S0000000_21 aObjectS122S0000000_21, Object obj) {
        return null;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            default:
                return null;
        }
    }

    public AObjectS122S0000000_21(int i) {
        this.$t = i;
    }

    public static final Object invoke$0(AObjectS122S0000000_21 aObjectS122S0000000_21, Object obj) {
        String str = PushCameraBlurActivity._pnsPageId;
        ((C06W2) obj).Dw2(new AObjectS72S0000000_21(0));
        return null;
    }

    public static final Object invoke$1(AObjectS122S0000000_21 aObjectS122S0000000_21, Object obj) {
        String str = LiveDummyActivity._pnsPageId;
        ((C06W2) obj).Dw2(new AObjectS72S0000000_21(1));
        return null;
    }

    public static final Object invoke$3(AObjectS122S0000000_21 aObjectS122S0000000_21, Object obj) {
        String str = VideoShare2GifEditActivity._pnsPageId;
        C1193630hAP c1193630hAP = C1192870h9B.LIZ;
        Objects.requireNonNull(c1193630hAP);
        ((C06W2) obj).Dw2(new AObjectS395S0100000_21(c1193630hAP, 3));
        return null;
    }

    public static final Object invoke$4(AObjectS122S0000000_21 aObjectS122S0000000_21, Object obj) {
        String str = VideoShare2GifPreviewActivity._pnsPageId;
        C1193630hAP c1193630hAP = C1192870h9B.LIZ;
        Objects.requireNonNull(c1193630hAP);
        ((C06W2) obj).Dw2(new AObjectS395S0100000_21(c1193630hAP, 4));
        return null;
    }

    public static final Object invoke$5(AObjectS122S0000000_21 aObjectS122S0000000_21, Object obj) {
        C06W2 c06w2 = (C06W2) obj;
        String str = StickerPropDetailActicity._pnsPageId;
        C1193630hAP c1193630hAP = C1192870h9B.LIZ;
        Objects.requireNonNull(c1193630hAP);
        c06w2.Dw2(new AObjectS395S0100000_21(c1193630hAP, 5));
        c06w2.Dw2(new AObjectS72S0000000_21(2));
        return null;
    }
}

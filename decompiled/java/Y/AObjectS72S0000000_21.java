package Y;

import X.C06W5;
import X.C1239450iMJ;
import X.InterfaceC2217461Bqa;
import com.ss.android.ugc.aweme.app.PushCameraBlurActivity;
import com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.assem.BottomTakoEntranceAssem;
import com.ss.android.ugc.aweme.live.LiveDummyActivity;
import com.ss.android.ugc.aweme.prop.activity.StickerPropDetailActicity;
import com.ss.android.ugc.aweme.tako.otherpage.searchdetailfeed.bottombar.viewmodel.DetailTakoBottomEntranceViewModel;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes22.dex */
public class AObjectS72S0000000_21 implements Function0 {
    public final int $t;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            default:
                return null;
        }
    }

    public AObjectS72S0000000_21(int i) {
        this.$t = i;
    }

    public static final Object invoke$0(AObjectS72S0000000_21 aObjectS72S0000000_21) {
        String str = PushCameraBlurActivity._pnsPageId;
        return new C06W5(0);
    }

    public static final Object invoke$1(AObjectS72S0000000_21 aObjectS72S0000000_21) {
        String str = LiveDummyActivity._pnsPageId;
        return new C1239450iMJ();
    }

    public static final Object invoke$2(AObjectS72S0000000_21 aObjectS72S0000000_21) {
        String str = StickerPropDetailActicity._pnsPageId;
        return new C06W5(0);
    }

    public static final Object invoke$3(AObjectS72S0000000_21 aObjectS72S0000000_21) {
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = BottomTakoEntranceAssem.LLJILJIL;
        return new DetailTakoBottomEntranceViewModel();
    }

    public AObjectS72S0000000_21(BottomTakoEntranceAssem bottomTakoEntranceAssem, int i) {
        this.$t = i;
    }
}

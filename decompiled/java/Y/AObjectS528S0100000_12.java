package Y;

import X.C0UA2;
import X.C20355014km;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.broadcast.video.VideoWidget;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes13.dex */
public class AObjectS528S0100000_12 implements Function2 {
    public final int $t;
    public Object l0;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            default:
                return null;
        }
    }

    public AObjectS528S0100000_12(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final Object invoke$0(AObjectS528S0100000_12 aObjectS528S0100000_12, Object obj, Object obj2) {
        C20355014km c20355014km;
        C0UA2 c0ua2 = (C0UA2) aObjectS528S0100000_12.l0;
        String str = (String) obj;
        ImageModel imageModel = (ImageModel) obj2;
        if (c0ua2.LIZJ != null) {
            if (str != null && !str.equals(CardStruct.IStatusCode.DEFAULT) && !str.isEmpty() && imageModel != null) {
                c20355014km = new C20355014km(str, imageModel);
            } else {
                c20355014km = null;
            }
            c0ua2.LIZJ.LIZJ(c20355014km);
        }
        return null;
    }

    public static final Object invoke$1(AObjectS528S0100000_12 aObjectS528S0100000_12, Object obj, Object obj2) {
        return Integer.valueOf(((VideoWidget) aObjectS528S0100000_12.l0).LLLILZLLLI.LJIILLIIL((String) obj, (String) obj2));
    }
}

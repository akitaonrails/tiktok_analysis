package Y;

import X.AbstractC2253808sK;
import X.C189200o6;
import X.InterfaceC1364105Vn;
import com.bytedance.ies.cutsame.source.api.AfrData;
import com.bytedance.ies.cutsame.source.api.AfrResponse;
import com.bytedance.ies.cutsame.source.api.ImageResponse;
import com.bytedance.ies.cutsame.source.api.VideoItem;
import com.bytedance.ies.cutsame.source.api.VideoItemInfo;
import com.bytedance.ies.cutsame.source.api.VideoResponse;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public class AObjectS347S0100000_3 implements Function1 {
    public final int $t;
    public Object l0;

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
            default:
                return null;
        }
    }

    public AObjectS347S0100000_3(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final Object invoke$0(AObjectS347S0100000_3 aObjectS347S0100000_3, Object obj) {
        ((Function1) aObjectS347S0100000_3.l0).invoke(obj);
        return obj;
    }

    public static final Object invoke$1(AObjectS347S0100000_3 aObjectS347S0100000_3, Object obj) {
        IndexedValue indexedValue = (IndexedValue) obj;
        return Boolean.valueOf(((Boolean) ((Function2) aObjectS347S0100000_3.l0).invoke(Integer.valueOf(indexedValue.LIZ), indexedValue.LIZIZ)).booleanValue());
    }

    public static final Object invoke$2(AObjectS347S0100000_3 aObjectS347S0100000_3, Object obj) {
        if (obj == ((AbstractC2253808sK) aObjectS347S0100000_3.l0)) {
            return "(this Collection)";
        }
        return String.valueOf(obj);
    }

    public static final Object invoke$3(AObjectS347S0100000_3 aObjectS347S0100000_3, Object obj) {
        Pair pair;
        List<AfrData> afrData;
        ImageResponse imageResponse = (ImageResponse) obj;
        AfrResponse data = imageResponse.getData();
        if (data != null && (afrData = data.getAfrData()) != null && !afrData.isEmpty()) {
            pair = new Pair(((AfrData) ListProtector.get(afrData, 0)).getPic(), imageResponse.getMessage());
        } else {
            pair = new Pair(null, imageResponse.getMessage());
        }
        Object first = pair.getFirst();
        Object second = pair.getSecond();
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) aObjectS347S0100000_3.l0;
        Pair pair2 = new Pair(first, second);
        C189200o6.m2constructorimpl(pair2);
        interfaceC1364105Vn.resumeWith(pair2);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AObjectS347S0100000_3 aObjectS347S0100000_3, Object obj) {
        Pair pair;
        VideoItem videoItem;
        VideoResponse videoResponse = (VideoResponse) obj;
        VideoItemInfo data = videoResponse.getData();
        if (data != null && (videoItem = data.getVideoItem()) != null) {
            pair = new Pair(videoItem.getContent(), videoResponse.getMessage());
        } else {
            pair = new Pair(null, videoResponse.getMessage());
        }
        Object first = pair.getFirst();
        Object second = pair.getSecond();
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) aObjectS347S0100000_3.l0;
        Pair pair2 = new Pair(first, second);
        C189200o6.m2constructorimpl(pair2);
        interfaceC1364105Vn.resumeWith(pair2);
        return Unit.LIZ;
    }
}

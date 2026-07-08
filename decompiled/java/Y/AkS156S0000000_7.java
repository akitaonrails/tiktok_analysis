package Y;

import X.AbstractC19484711Kz;
import X.C09BC;
import X.C0IHH;
import X.C0ITM;
import X.C0ITP;
import X.C11NZ;
import X.InterfaceC1487280oo2;
import android.graphics.Bitmap;
import com.bytedance.android.live.base.model.feed.FeedExtra;
import com.bytedance.android.live.base.model.live.UgActivityResult;
import com.bytedance.android.live.network.response.BaseListResponse;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment;

/* JADX INFO: loaded from: classes8.dex */
public class AkS156S0000000_7 implements InterfaceC1487280oo2 {
    public final int $t;

    @Override // X.InterfaceC1487280oo2
    public final Object apply(Object obj) {
        switch (this.$t) {
            case 0:
                return apply$0(this, obj);
            case 1:
                return apply$1(this, obj);
            case 2:
                return apply$2(this, obj);
            case 3:
                return apply$3(this, obj);
            case 4:
                return apply$4(this, obj);
            case 5:
                return apply$5(this, obj);
            case 6:
                return apply$6(this, obj);
            case 7:
                return apply$7(this, obj);
            case 8:
                return apply$8(this, obj);
            default:
                return null;
        }
    }

    public AkS156S0000000_7(int i) {
        this.$t = i;
    }

    public static final Object apply$0(AkS156S0000000_7 akS156S0000000_7, Object obj) {
        return Integer.valueOf(obj.hashCode());
    }

    public static final Object apply$1(AkS156S0000000_7 akS156S0000000_7, Object obj) {
        return Integer.valueOf(obj.hashCode());
    }

    public static final Object apply$2(AkS156S0000000_7 akS156S0000000_7, Object obj) {
        return AbstractC19484711Kz.LJIJJLI(new C0IHH(C09BC.LIZ(0.5f, (Bitmap) obj)));
    }

    public static final Object apply$3(AkS156S0000000_7 akS156S0000000_7, Object obj) {
        String str = LivePlayFragment._pnsPageId;
        return new C0IHH(C09BC.LIZ(0.5f, (Bitmap) obj));
    }

    public static final Object apply$4(AkS156S0000000_7 akS156S0000000_7, Object obj) {
        return ((BaseListResponse) obj).data;
    }

    public static final Object apply$5(AkS156S0000000_7 akS156S0000000_7, Object obj) {
        return ((BaseListResponse) obj).data;
    }

    public static final Object apply$6(AkS156S0000000_7 akS156S0000000_7, Object obj) {
        BaseListResponse baseListResponse = (BaseListResponse) obj;
        return new C0ITM(new C0ITP(baseListResponse.data, (FeedExtra) baseListResponse.extra), baseListResponse.LIZIZ, baseListResponse.LIZJ, baseListResponse.LIZLLL, "click", "enter_hashtag_refresh");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object apply$7(AkS156S0000000_7 akS156S0000000_7, Object obj) {
        BaseResponse baseResponse = (BaseResponse) obj;
        int i = ((UgActivityResult) baseResponse.data).statusCode;
        if (i != 0 && i != 51) {
            return C11NZ.LJJIJLIJ(new Exception("retry"));
        }
        return C11NZ.LJJJJZ(baseResponse);
    }

    public static final Object apply$8(AkS156S0000000_7 akS156S0000000_7, Object obj) {
        BaseListResponse baseListResponse = (BaseListResponse) obj;
        return new C0ITM(new C0ITP(baseListResponse.data, (FeedExtra) baseListResponse.extra), baseListResponse.LIZIZ, baseListResponse.LIZJ, baseListResponse.LIZLLL, "click", "enter_hashtag_loadmore");
    }
}

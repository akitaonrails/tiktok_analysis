package Y;

import X.C09JN;
import X.C1087930ePv;
import X.C1144390fsz;
import X.C1C7U;
import X.C501520Jle;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.like.LikeHelper;
import java.util.HashMap;

/* JADX INFO: loaded from: classes18.dex */
public class AfS49S1100000_17 implements C09JN {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
            case 2:
                accept$2(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS49S1100000_17 afS49S1100000_17, Object obj) {
        LikeHelper likeHelper = (LikeHelper) afS49S1100000_17.l1;
        String str = afS49S1100000_17.s0;
        Throwable th = (Throwable) obj;
        int i = LikeHelper.LLLJL;
        likeHelper.getClass();
        C1C7U.LIZ("LikeHelper@13b2.queryLikeIcons$2L");
        ((HashMap) likeHelper.LLJLLL).remove(str);
        if (th instanceof C501520Jle) {
            C1087930ePv.LIZ(((C501520Jle) th).getErrorCode(), 0L);
        }
        C1C7U.LIZIZ("LikeHelper@13b2.queryLikeIcons$2L");
    }

    public static final void accept$1(AfS49S1100000_17 afS49S1100000_17, Object obj) {
        LikeHelper likeHelper = (LikeHelper) afS49S1100000_17.l1;
        String str = afS49S1100000_17.s0;
        int i = LikeHelper.LLLJL;
        likeHelper.getClass();
        C1C7U.LIZ("LikeHelper@13b2.getOthersLikeIcon$2L");
        ((HashMap) likeHelper.LLJLLL).remove(str);
        C1C7U.LIZIZ("LikeHelper@13b2.getOthersLikeIcon$2L");
    }

    public static final void accept$2(AfS49S1100000_17 afS49S1100000_17, Object obj) {
        String str;
        C1C7U.LIZ("MatchPowerupUseGuideController@f2ac.requestTriggerGuideApi$1");
        BaseResponse baseResponse = (BaseResponse) obj;
        if (baseResponse != null && (str = baseResponse.LIZIZ) != null) {
            ((C1144390fsz) afS49S1100000_17.l1).LIZJ = str;
        }
        ((C1144390fsz) afS49S1100000_17.l1).LIZLLL = afS49S1100000_17.s0;
        C1C7U.LIZIZ("MatchPowerupUseGuideController@f2ac.requestTriggerGuideApi$1");
    }

    public AfS49S1100000_17(Object obj, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
    }
}

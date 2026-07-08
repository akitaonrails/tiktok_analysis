package Y;

import X.C1087970ePz;
import X.C1088000eQ2;
import X.C1088040eQ6;
import X.C1088090eQB;
import X.C1088100eQC;
import X.C1088250eQR;
import X.C1114530f6p;
import X.C1114650f71;
import X.C1114680f74;
import X.C1150000g22;
import X.C1150020g24;
import X.C11NZ;
import X.C1494690ozz;
import X.C1811850xFX;
import X.C20441214yg;
import X.C2177041AIc;
import X.C2188811AlT;
import X.C501520Jle;
import X.C786410Ut5;
import X.InterfaceC1487280oo2;
import android.graphics.Bitmap;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.like.LikeHelper;
import com.bytedance.android.livesdk.wallet.CustomErrorExtra;
import com.bytedance.android.livesdkapi.depend.model.follow.FollowPair;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import org.json.JSONObject;
import webcast.api.game.GetRelatedEntranceResponse;

/* JADX INFO: loaded from: classes18.dex */
public class AkS479S0100000_17 implements InterfaceC1487280oo2 {
    public final int $t;
    public Object l0;

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
            case BdTuring.TYPE_ECAF /* 9 */:
                return apply$9(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return apply$10(this, obj);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return apply$11(this, obj);
            default:
                return null;
        }
    }

    public AkS479S0100000_17(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final Object apply$0(AkS479S0100000_17 akS479S0100000_17, Object obj) {
        C1114530f6p c1114530f6p = (C1114530f6p) akS479S0100000_17.l0;
        Throwable th = (Throwable) obj;
        c1114530f6p.getClass();
        if (th instanceof C1494690ozz) {
            C1494690ozz c1494690ozz = (C1494690ozz) th;
            if (c1494690ozz.getStatusCode() >= 500 && c1494690ozz.getStatusCode() <= 599) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("failed  error = ");
                sbLIZ.append(th.getMessage());
                sbLIZ.append(" code = ");
                sbLIZ.append(((C1494690ozz) th).getStatusCode());
                C1114680f74.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                return C11NZ.LJJIJLIJ(th);
            }
        }
        if (th instanceof C1811850xFX) {
            C1811850xFX c1811850xFX = (C1811850xFX) th;
            if (c1811850xFX.getStatusCode() >= 500 && c1811850xFX.getStatusCode() <= 599) {
                return C11NZ.LJJIJLIJ(th);
            }
        }
        if (th instanceof C501520Jle) {
            return C11NZ.LJJIJLIJ(th);
        }
        C1114650f71 c1114650f71 = c1114530f6p.LL;
        int i = c1114650f71.LIZ;
        if (i < 2) {
            c1114650f71.LIZ = i + 1;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("retry count = ");
            sbLIZ2.append(c1114530f6p.LL.LIZ);
            sbLIZ2.append(" error = ");
            sbLIZ2.append(th.getMessage());
            C1114680f74.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
            return C11NZ.LJLJJLL(500L, TimeUnit.MICROSECONDS);
        }
        return C11NZ.LJJIJLIJ(th);
    }

    public static final Object apply$1(AkS479S0100000_17 akS479S0100000_17, Object obj) {
        if (((FollowPair) obj).LIZIZ()) {
            ((C2177041AIc) akS479S0100000_17.l0).getClass();
            C2177041AIc.LJIL(1, "is_following");
        } else {
            ((C2177041AIc) akS479S0100000_17.l0).getClass();
            C2177041AIc.LJIL(0, "is_following");
        }
        return Unit.LIZ;
    }

    public static final Object apply$10(AkS479S0100000_17 akS479S0100000_17, Object obj) {
        ImageModel imageModel = (ImageModel) akS479S0100000_17.l0;
        int i = LikeHelper.LLLJL;
        C1088000eQ2 c1088000eQ2 = new C1088000eQ2();
        c1088000eQ2.LIZJ = (Bitmap) obj;
        c1088000eQ2.LIZ = true;
        c1088000eQ2.LIZIZ = imageModel.mUri;
        return c1088000eQ2;
    }

    public static final Object apply$11(AkS479S0100000_17 akS479S0100000_17, Object obj) {
        ImageModel imageModel = (ImageModel) akS479S0100000_17.l0;
        int i = LikeHelper.LLLJL;
        C1088000eQ2 c1088000eQ2 = new C1088000eQ2();
        c1088000eQ2.LIZJ = (Bitmap) obj;
        c1088000eQ2.LIZ = false;
        c1088000eQ2.LIZIZ = imageModel.mUri;
        return c1088000eQ2;
    }

    public static final Object apply$2(AkS479S0100000_17 akS479S0100000_17, Object obj) {
        Throwable th = (Throwable) obj;
        C1088090eQB c1088090eQB = (C1088090eQB) akS479S0100000_17.l0;
        int i = c1088090eQB.LL;
        c1088090eQB.LL = i + 1;
        if (i < 3) {
            return C11NZ.LJLJJLL(3000L, TimeUnit.MILLISECONDS);
        }
        return C11NZ.LJJIJLIJ(th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object apply$3(AkS479S0100000_17 akS479S0100000_17, Object obj) {
        GetRelatedEntranceResponse.RelatedLiveStruct relatedLiveStruct;
        String str;
        String str2;
        Map<Long, GetRelatedEntranceResponse.RelatedLiveStruct> map;
        GetRelatedEntranceResponse getRelatedEntranceResponse = (GetRelatedEntranceResponse) ((BaseResponse) obj).data;
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = (JSONObject) akS479S0100000_17.l0;
            String str3 = null;
            if (getRelatedEntranceResponse != null && (map = getRelatedEntranceResponse.relatedLiveEntrance) != null) {
                relatedLiveStruct = map.get(Long.valueOf(CastLongProtector.parseLong(JSONObjectProtectorUtils.getString(jSONObject2, "video_id"))));
            } else {
                relatedLiveStruct = null;
            }
            if (relatedLiveStruct != null) {
                str = relatedLiveStruct.relatedLiveTag;
            } else {
                str = null;
            }
            jSONObject.put("related_tag", str);
            if (relatedLiveStruct != null) {
                str2 = relatedLiveStruct.content;
            } else {
                str2 = null;
            }
            jSONObject.put("content", str2);
            if (relatedLiveStruct != null) {
                str3 = relatedLiveStruct.gameName;
            }
            jSONObject.put("tag_name", str3);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("requestRelatedEntranceContent ");
            sbLIZ.append(e);
            C20441214yg.LIZIZ("GameLiveOuterService", C2188811AlT.LIZIZ(sbLIZ));
        }
        return C786410Ut5.J3(jSONObject);
    }

    public static final Object apply$4(AkS479S0100000_17 akS479S0100000_17, Object obj) {
        Throwable th = (Throwable) obj;
        C1088100eQC c1088100eQC = (C1088100eQC) akS479S0100000_17.l0;
        int i = c1088100eQC.LL;
        c1088100eQC.LL = i + 1;
        if (i < 3) {
            return C11NZ.LJLJJLL(1500L, TimeUnit.MILLISECONDS);
        }
        return C11NZ.LJJIJLIJ(th);
    }

    public static final Object apply$5(AkS479S0100000_17 akS479S0100000_17, Object obj) {
        Throwable th = (Throwable) obj;
        C1088250eQR c1088250eQR = (C1088250eQR) akS479S0100000_17.l0;
        int i = c1088250eQR.LLILLJJLI;
        c1088250eQR.LLILLJJLI = i + 1;
        if (i < c1088250eQR.LL) {
            return C11NZ.LJLJJLL(500L, TimeUnit.MILLISECONDS);
        }
        return C11NZ.LJJIJLIJ(th);
    }

    public static final Object apply$6(AkS479S0100000_17 akS479S0100000_17, Object obj) {
        C1150000g22 c1150000g22 = new C1150000g22();
        ((C1150020g24) akS479S0100000_17.l0).LIZ = c1150000g22;
        return c1150000g22;
    }

    public static final Object apply$7(AkS479S0100000_17 akS479S0100000_17, Object obj) {
        Throwable th = (Throwable) obj;
        C1150000g22 c1150000g22 = new C1150000g22();
        c1150000g22.LIZ = th;
        if ((th instanceof C501520Jle) && CustomErrorExtra.getCustomErrorExtra((Exception) th) != null) {
            ((C1150020g24) akS479S0100000_17.l0).LIZ = c1150000g22;
        }
        return C11NZ.LJJJJZ(c1150000g22);
    }

    public static final Object apply$8(AkS479S0100000_17 akS479S0100000_17, Object obj) {
        C1088040eQ6 c1088040eQ6 = (C1088040eQ6) akS479S0100000_17.l0;
        Throwable th = (Throwable) obj;
        c1088040eQ6.getClass();
        if (th instanceof C1494690ozz) {
            C1494690ozz c1494690ozz = (C1494690ozz) th;
            if ((c1494690ozz.getStatusCode() >= 500 && c1494690ozz.getStatusCode() <= 599) || c1494690ozz.getStatusCode() == 31103 || c1494690ozz.getStatusCode() == 20003) {
                return C11NZ.LJJIJLIJ(th);
            }
        }
        if (th instanceof C1811850xFX) {
            C1811850xFX c1811850xFX = (C1811850xFX) th;
            if ((c1811850xFX.getStatusCode() >= 500 && c1811850xFX.getStatusCode() <= 599) || c1811850xFX.getStatusCode() == 31103 || c1811850xFX.getStatusCode() == 20003) {
                return C11NZ.LJJIJLIJ(th);
            }
        }
        if (th instanceof C501520Jle) {
            return C11NZ.LJJIJLIJ(th);
        }
        C1087970ePz c1087970ePz = c1088040eQ6.LL;
        int i = c1087970ePz.LIZ;
        if (i < 2) {
            int i2 = i + 1;
            c1087970ePz.LIZ = i2;
            return C11NZ.LJLJJLL(((long) i2) * 500, TimeUnit.MILLISECONDS);
        }
        return C11NZ.LJJIJLIJ(th);
    }

    public static final Object apply$9(AkS479S0100000_17 akS479S0100000_17, Object obj) {
        ImageModel imageModel = (ImageModel) akS479S0100000_17.l0;
        int i = LikeHelper.LLLJL;
        C1088000eQ2 c1088000eQ2 = new C1088000eQ2();
        c1088000eQ2.LIZJ = (Bitmap) obj;
        c1088000eQ2.LIZ = false;
        c1088000eQ2.LIZIZ = imageModel.mUri;
        return c1088000eQ2;
    }
}

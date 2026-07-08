package Y;

import X.C08HM;
import X.C1161920gLG;
import X.C1516320pYs;
import X.C158B;
import X.C1601460rmC;
import X.C196800pK;
import X.C1AF0;
import X.C20441214yg;
import X.C2188811AlT;
import X.C2276411E8h;
import X.C590380NDo;
import X.C592002So;
import X.C772400URq;
import X.C786410Ut5;
import X.InterfaceC1487280oo2;
import android.os.SystemClock;
import android.util.Base64;
import com.bytedance.android.live.network.response.StartLiveResponse;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.tiktok.ConvertHelper;
import java.nio.charset.Charset;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public class AkS484S0100000_23 implements InterfaceC1487280oo2 {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC1487280oo2
    public final Object apply(Object obj) {
        switch (this.$t) {
            case 0:
                return apply$0(this, obj);
            case 1:
                return apply$1(this, obj);
            default:
                return null;
        }
    }

    public AkS484S0100000_23(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final Object apply$0(AkS484S0100000_23 akS484S0100000_23, Object obj) {
        C1601460rmC c1601460rmC = (C1601460rmC) akS484S0100000_23.l0;
        C592002So c592002So = (C592002So) obj;
        SystemClock.elapsedRealtime();
        try {
            FeedItemList feedItemListCom$ss$ugc$tiktok$proto$aweme_v2_feed_response$$com$ss$android$ugc$aweme$feed$model$FeedItemList = ConvertHelper.com$ss$ugc$tiktok$proto$aweme_v2_feed_response$$com$ss$android$ugc$aweme$feed$model$FeedItemList(c592002So, null);
            Integer numValueOf = Integer.valueOf(c1601460rmC.LIZIZ);
            if (numValueOf != null) {
                if (numValueOf.intValue() == 8) {
                    if (feedItemListCom$ss$ugc$tiktok$proto$aweme_v2_feed_response$$com$ss$android$ugc$aweme$feed$model$FeedItemList != null) {
                        feedItemListCom$ss$ugc$tiktok$proto$aweme_v2_feed_response$$com$ss$android$ugc$aweme$feed$model$FeedItemList.pbData = c592002So;
                        if (C590380NDo.LIZLLL() && (numValueOf.intValue() == 2 || numValueOf.intValue() == 1 || numValueOf.intValue() == 0)) {
                            feedItemListCom$ss$ugc$tiktok$proto$aweme_v2_feed_response$$com$ss$android$ugc$aweme$feed$model$FeedItemList.pbData = c592002So;
                        }
                    }
                } else if (feedItemListCom$ss$ugc$tiktok$proto$aweme_v2_feed_response$$com$ss$android$ugc$aweme$feed$model$FeedItemList != null) {
                    if (C590380NDo.LIZLLL()) {
                        feedItemListCom$ss$ugc$tiktok$proto$aweme_v2_feed_response$$com$ss$android$ugc$aweme$feed$model$FeedItemList.pbData = c592002So;
                    }
                }
            }
            SystemClock.elapsedRealtime();
            return feedItemListCom$ss$ugc$tiktok$proto$aweme_v2_feed_response$$com$ss$android$ugc$aweme$feed$model$FeedItemList;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1516320pYs c1516320pYs = new C1516320pYs(th);
            C2276411E8h.LIZIZ.LIZLLL("common_feed", c1516320pYs);
            C1AF0.LJFF(c1516320pYs, "feedapi");
            throw c1516320pYs;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object apply$1(AkS484S0100000_23 akS484S0100000_23, Object obj) {
        StartLiveResponse startLiveResponse = (StartLiveResponse) obj;
        ((C772400URq) akS484S0100000_23.l0).getClass();
        if (startLiveResponse == null) {
            return null;
        }
        Room room = (Room) startLiveResponse.data;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("uid", String.valueOf(room.getOwnerUserId()));
            jSONObject.put("roomId", String.valueOf(room.getId()));
            jSONObject.put("aid", String.valueOf(((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).appId()));
            jSONObject.put("timestamp", String.valueOf(C158B.LIZ() / 1000));
            String strJ3 = C786410Ut5.J3(jSONObject);
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(1, new SecretKeySpec(C196800pK.LIZ(C08HM.LIZJ(String.valueOf(room.getId()))), "AES"), new IvParameterSpec(new byte[]{8, 9, 7, 5, 7, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}));
            byte[] bArrDoFinal = cipher.doFinal(strJ3.getBytes(Charset.forName("UTF-8")));
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("bytedmediasdkandroid:");
            sbLIZ.append(Base64.encodeToString(bArrDoFinal, 2));
            room.authenticationValue = C2188811AlT.LIZIZ(sbLIZ);
            return room;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LJI("AuthenticationCalculate", e);
            return room;
        }
    }
}

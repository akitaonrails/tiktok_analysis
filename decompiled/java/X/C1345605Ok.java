package X;

import com.ss.android.ugc.aweme.ecommerce.anchor.utils.ECVideoPitayaUtils$predictVideoSR$1;
import com.ss.android.ugc.aweme.ecommerce.anchor.utils.EcomVideoOptAB;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.Pair;
import org.json.JSONException;

/* JADX INFO: renamed from: X.05Ok, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1345605Ok {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(int i, boolean z) throws JSONException {
        C1421105hJ.LIZLLL("ec_video_sr_monitor", new Pair("predictStatus", Integer.valueOf(i)), new Pair("srOpen", Boolean.valueOf(z)));
    }

    public static void LIZIZ(Aweme aweme, String str) {
        List<String> list;
        if (aweme == null) {
            return;
        }
        C01GW c01gw = EcomVideoOptAB.LIZIZ;
        if (((EcomVideoOptAB.EcVideoOptConfig) c01gw.getValue()).ecVideoSRPredictEnable && (list = ((EcomVideoOptAB.EcVideoOptConfig) c01gw.getValue()).ecVideoSrEntrances) != null && C13LP.LJJJJ(str, list)) {
            String aid = aweme.getAid();
            if (aid == null) {
                aid = "";
            }
            if (!C1344705Ob.LIZ.containsKey(aid)) {
                C23250099c.LIZLLL(C2296808zG.LIZ(C2126308Ur.LIZ), null, null, new ECVideoPitayaUtils$predictVideoSR$1(aweme, aid, null), 3);
            }
        }
    }
}

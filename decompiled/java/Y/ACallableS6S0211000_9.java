package Y;

import X.C1720106oR;
import X.C1C7U;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C794240VDq;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.ImageUrlModel;
import com.ss.android.ugc.aweme.feed.model.Video;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class ACallableS6S0211000_9 implements Callable {
    public final int $t;
    public int i3;
    public Object l0;
    public Object l1;
    public boolean z2;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS6S0211000_9 aCallableS6S0211000_9) {
        C1C7U.LIZ("DynamicCoverHelper@bc54.showDynamicCoverInternal$2$1");
        if (aCallableS6S0211000_9.z2 && aCallableS6S0211000_9.i3 >= 6 && !((ImageUrlModel) aCallableS6S0211000_9.l0).isEmpty() && ((Video) aCallableS6S0211000_9.l1).getPlayAddr() != null && !TextUtils.isEmpty(((Video) aCallableS6S0211000_9.l1).getPlayAddr().getUri())) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("frames", aCallableS6S0211000_9.i3);
                jSONObject.put("vid", ((Video) aCallableS6S0211000_9.l1).getPlayAddr().getUri());
                jSONObject.put("url", ((ImageUrlModel) aCallableS6S0211000_9.l0).getUrls().get(0));
                C794240VDq.LIZJ("aweme_animated_image_frames_error", jSONObject);
                int i = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("animated frame error: ");
                sbLIZ.append(jSONObject);
                C1720106oR.LJI("DynamicCoverHelper", C2188811AlT.LIZIZ(sbLIZ));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        C1C7U.LIZIZ("DynamicCoverHelper@bc54.showDynamicCoverInternal$2$1");
        return null;
    }

    public static final Object call$1(ACallableS6S0211000_9 aCallableS6S0211000_9) {
        C1C7U.LIZ("DynamicCoverHelper@fd8b.showDynamicCoverInternal$2$1");
        if (aCallableS6S0211000_9.z2 && aCallableS6S0211000_9.i3 >= 6 && !((ImageUrlModel) aCallableS6S0211000_9.l0).isEmpty() && ((Video) aCallableS6S0211000_9.l1).getPlayAddr() != null && !TextUtils.isEmpty(((Video) aCallableS6S0211000_9.l1).getPlayAddr().getUri())) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("frames", aCallableS6S0211000_9.i3);
                jSONObject.put("vid", ((Video) aCallableS6S0211000_9.l1).getPlayAddr().getUri());
                jSONObject.put("url", ((ImageUrlModel) aCallableS6S0211000_9.l0).getUrls().get(0));
                C794240VDq.LIZJ("aweme_animated_image_frames_error", jSONObject);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("animated frame error: ");
                sbLIZ.append(jSONObject);
                C2188811AlT.LIZIZ(sbLIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        C1C7U.LIZIZ("DynamicCoverHelper@fd8b.showDynamicCoverInternal$2$1");
        return null;
    }

    public ACallableS6S0211000_9(boolean z, int i, ImageUrlModel imageUrlModel, Video video, int i2) {
        this.$t = i2;
        this.z2 = z;
        this.i3 = i;
        this.l0 = imageUrlModel;
        this.l1 = video;
    }
}

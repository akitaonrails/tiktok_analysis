package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.social.creation.mediapicker.data.SocMediaResource;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0L21, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0L21 {
    public static final ConcurrentHashMap<String, Pair<Integer, Integer>> LIZ = new ConcurrentHashMap<>();

    public static final Pair<Integer, Integer> LIZ(String str) {
        Pair<Integer, Integer> pair;
        if (C298380Bmm.LIZIZ && str != null) {
            C0L23 c0l23LIZIZ = C0L22.LIZIZ(str);
            if (c0l23LIZIZ == null || (pair = c0l23LIZIZ.LIZJ) == null) {
                return LIZ.get(str);
            }
            return pair;
        }
        return null;
    }

    public static final Pair<Integer, Integer> LIZIZ(SocMediaResource socMediaResource, Bitmap bitmap) {
        String strLIZ = socMediaResource.LIZ();
        Pair<Integer, Integer> pairLIZ = null;
        if (strLIZ == null) {
            return null;
        }
        if (socMediaResource.LIZJ() && C530950Ks1.LIZ(bitmap)) {
            C01GW c01gw = C0L22.LIZ;
            pairLIZ = C0L22.LIZ(socMediaResource.tiktokMediaModel, bitmap);
            if (C298380Bmm.LIZIZ) {
                LIZ.put(strLIZ, pairLIZ);
            }
        } else if (!socMediaResource.LIZJ() && C298380Bmm.LIZIZ) {
            C01GW c01gw2 = C0L22.LIZ;
            Pair<Integer, Integer> pairLIZ2 = C0L22.LIZ(socMediaResource.tiktokMediaModel, bitmap);
            LIZ.put(strLIZ, pairLIZ2);
            return pairLIZ2;
        }
        return pairLIZ;
    }
}

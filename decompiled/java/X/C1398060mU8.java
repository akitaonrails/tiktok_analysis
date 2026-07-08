package X;

import com.ss.android.ugc.effectmanager.effect.model.net.EffectListResponse;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0mU8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1398060mU8 {
    public static final ConcurrentHashMap<String, EffectListResponse> LIZ = new ConcurrentHashMap<>();

    public static EffectListResponse LIZ(String str) {
        if (str == null) {
            return null;
        }
        return LIZ.get(str);
    }

    public static void LIZIZ(String str, EffectListResponse effectListResponse) {
        if (str != null && effectListResponse != null) {
            LIZ.put(str, effectListResponse);
        }
    }
}

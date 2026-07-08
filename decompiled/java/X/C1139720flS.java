package X;

import com.bytedance.android.livesdk.livesetting.gift.GiftUseCompositionRenderConfig;
import java.util.Map;

/* JADX INFO: renamed from: X.0flS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1139720flS {
    public static final /* synthetic */ int LIZ = 0;

    public static C1140550fmn LIZ(int i, Long l, C0T6Z c0t6z, Map map) {
        long jLongValue;
        Class<?> cls;
        C1140550fmn c1140550fmn = new C1140550fmn();
        REQ req = c1140550fmn.LIZ;
        req.LJ = i;
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = -10241024;
        }
        req.LIZLLL = jLongValue;
        GiftUseCompositionRenderConfig giftUseCompositionRenderConfig = GiftUseCompositionRenderConfig.INSTANCE;
        c1140550fmn.LIZ.LIZIZ = giftUseCompositionRenderConfig.getCompositionTimeOutInMs();
        long compositionTimeOutInMs = giftUseCompositionRenderConfig.getCompositionTimeOutInMs();
        REQ req2 = c1140550fmn.LIZ;
        req2.LIZJ = compositionTimeOutInMs;
        if (c0t6z != null) {
            req2.LJI.putAll(c0t6z);
        }
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            if ((key instanceof Class) && (cls = (Class) key) != null && C500260Jjc.LJJJI(Boolean.valueOf(cls.isInstance(entry.getValue())))) {
                c1140550fmn.LIZ.LJFF.put(cls, entry.getValue());
            }
        }
        return c1140550fmn;
    }
}

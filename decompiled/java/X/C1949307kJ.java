package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.07kJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1949307kJ implements C0SAD {
    public static final C1949307kJ LIZ = new C1949307kJ();
    public static final ConcurrentHashMap<String, Long> LIZIZ = new ConcurrentHashMap<>();

    @Override // X.C0SAD
    public final void LIZ(Aweme aweme) {
        String aid;
        if (C079G.LIZ() && aweme != null && (aid = aweme.getAid()) != null) {
            ConcurrentHashMap<String, Long> concurrentHashMap = LIZIZ;
            if (!concurrentHashMap.containsKey(aid)) {
                concurrentHashMap.put(aid, Long.valueOf(System.currentTimeMillis()));
            }
        }
    }

    @Override // X.C0SAD
    public final long LIZIZ(Aweme aweme) {
        Long l;
        long jCurrentTimeMillis = -1;
        if (!C079G.LIZ()) {
            return -1L;
        }
        if (aweme != null) {
            String aid = aweme.getAid();
            if (aid != null && (l = LIZIZ.get(aid)) != null) {
                jCurrentTimeMillis = System.currentTimeMillis() - l.longValue();
            }
            String aid2 = aweme.getAid();
            if (aid2 != null) {
                LIZIZ.put(aid2, Long.valueOf(System.currentTimeMillis()));
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onPhotoManuallySwipe, ");
                sbLIZ.append(aid2);
                sbLIZ.append(", diff: ");
                sbLIZ.append(jCurrentTimeMillis);
                C2188811AlT.LIZIZ(sbLIZ);
            }
        }
        return jCurrentTimeMillis;
    }

    @Override // X.C0SAD
    public final void LIZJ(Aweme aweme) {
        String aid;
        if (C079G.LIZ() && aweme != null && (aid = aweme.getAid()) != null) {
            LIZIZ.put(aid, Long.valueOf(System.currentTimeMillis()));
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onPhotoContentBecomeVisible, ");
            sbLIZ.append(aid);
            C2188811AlT.LIZIZ(sbLIZ);
        }
    }
}

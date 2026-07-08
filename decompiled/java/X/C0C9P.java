package X;

import java.util.Map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0C9P, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0C9P {
    public static final C0C9P AI_ALIVE;
    public static final C0C9P AI_CAMEO_ID;
    public static final C0C9P AI_IMAGINE;
    public static final C0C9P AI_REMIX_SUBTITLE;
    public static final /* synthetic */ C0C9P[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public final String LL;
    public final Map<String, String> LLILLJJLI;

    public static InterfaceC2044707zh<C0C9P> getEntries() {
        return LLILZ;
    }

    static {
        C0C9P c0c9p = new C0C9P(0, "AI_ALIVE", "ai_alive_translations", (Map) C0C64.LJIILLIIL().LJJII(Map.class, C1129904bR.LIZ, "ai_alive_translations", true));
        AI_ALIVE = c0c9p;
        C0C9P c0c9p2 = new C0C9P(1, "AI_IMAGINE", "ai_imagine_translations", (Map) C0C9Q.LIZIZ.getValue());
        AI_IMAGINE = c0c9p2;
        C0C9P c0c9p3 = new C0C9P(2, "AI_REMIX_SUBTITLE", "ai_remix_subtile_translations", (Map) C0C64.LJIILLIIL().LJJII(Map.class, C1129804bQ.LIZ, "ai_remix_subtile_translations", true));
        AI_REMIX_SUBTITLE = c0c9p3;
        C0C9P c0c9p4 = new C0C9P(3, "AI_CAMEO_ID", "ai_cameo_id_translations", (Map) C0C9R.LIZIZ.getValue());
        AI_CAMEO_ID = c0c9p4;
        C0C9P[] c0c9pArr = {c0c9p, c0c9p2, c0c9p3, c0c9p4};
        LLILLL = c0c9pArr;
        LLILZ = new C2254308sP(c0c9pArr);
    }

    public static C0C9P[] values() {
        return (C0C9P[]) LLILLL.clone();
    }

    public final Map<String, String> getConfig() {
        return this.LLILLJJLI;
    }

    public final String getLibraKey() {
        return this.LL;
    }

    public static C0C9P valueOf(String str) {
        return (C0C9P) C08FF.LIZ(C0C9P.class, str);
    }

    public C0C9P(int i, String str, String str2, Map map) {
        this.LL = str2;
        this.LLILLJJLI = map;
    }
}

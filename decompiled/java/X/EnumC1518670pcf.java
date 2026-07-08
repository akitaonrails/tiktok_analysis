package X;

/* JADX INFO: renamed from: X.0pcf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public enum EnumC1518670pcf {
    SCENE_COLD_LAUNCH(0),
    SCENE_LOGIN(1),
    SCENE_POST_APP_LAUNCH(2),
    SCENE_DYNAMIC(3),
    SCENE_PULL_WITH_ID(4),
    SCENE_DEFERRED_POPUP(5),
    SCENE_GEO_BLOCK_TNC(555),
    SCENE_GEO_BLOCK_TLB(503),
    SCENE_ACCESS_BLOCK(56009);

    public final int LL;

    public static EnumC1518670pcf valueOf(String str) {
        return (EnumC1518670pcf) C08FF.LIZ(EnumC1518670pcf.class, str);
    }

    public final int getValue() {
        return this.LL;
    }

    EnumC1518670pcf(int i) {
        this.LL = i;
    }
}

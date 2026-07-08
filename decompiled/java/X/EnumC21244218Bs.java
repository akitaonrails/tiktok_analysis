package X;

/* JADX INFO: renamed from: X.18Bs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public enum EnumC21244218Bs {
    SAVED_INSTANCE_STATE("savedInstance"),
    SINGLETON_CACHE("singletonCache");

    public final String LL;

    public static EnumC21244218Bs valueOf(String str) {
        return (EnumC21244218Bs) C08FF.LIZ(EnumC21244218Bs.class, str);
    }

    public final String getValue() {
        return this.LL;
    }

    EnumC21244218Bs(String str) {
        this.LL = str;
    }
}

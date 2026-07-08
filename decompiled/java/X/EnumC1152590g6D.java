package X;

/* JADX INFO: renamed from: X.0g6D, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public enum EnumC1152590g6D {
    CONTAINER_CREATED("pbh_container_created"),
    URL_LOAD_FINISH("pbh_container_load_finish");

    public final String LL;

    public static EnumC1152590g6D valueOf(String str) {
        return (EnumC1152590g6D) C08FF.LIZ(EnumC1152590g6D.class, str);
    }

    public final String getEventName() {
        return this.LL;
    }

    EnumC1152590g6D(String str) {
        this.LL = str;
    }
}

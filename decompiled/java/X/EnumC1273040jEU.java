package X;

/* JADX INFO: renamed from: X.0jEU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public enum EnumC1273040jEU {
    STATUS_UNINIT,
    STATUS_INITIALIZING,
    STATUS_INIT_SUCCESS,
    STATUS_INIT_FAILED,
    STATUS_RUNNING,
    /* JADX INFO: Fake field, exist only in values array */
    STATUS_STOPPED;

    public static EnumC1273040jEU valueOf(String str) {
        return (EnumC1273040jEU) C08FF.LIZ(EnumC1273040jEU.class, str);
    }
}

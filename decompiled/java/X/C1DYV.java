package X;

/* JADX INFO: renamed from: X.1DYV, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public enum C1DYV {
    TTM_UNKNOW_TYPE(-1),
    TTM_MAP_TYPE(0),
    TTM_LIST_TYPE(1),
    TTM_LONG_TYPE(2),
    TTM_DOUBLE_TYPE(3),
    TTM_BOOL_TYPE(4),
    TTM_STR_TYPE(5);

    public static final C1DYY Companion = new Object() { // from class: X.1DYY
    };
    public final int LL;

    public static C1DYV valueOf(String str) {
        return (C1DYV) C08FF.LIZ(C1DYV.class, str);
    }

    public final int getValue() {
        return this.LL;
    }

    C1DYV(int i) {
        this.LL = i;
    }
}

package X;

/* JADX INFO: renamed from: X.0jUD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public enum EnumC1282790jUD {
    SUCCESS(1),
    FAILED(2),
    STOPPED_MANUALLY(3);

    public static final C1282860jUK Companion = new Object() { // from class: X.0jUK
    };
    public final int LL;

    public static EnumC1282790jUD valueOf(String str) {
        return (EnumC1282790jUD) C08FF.LIZ(EnumC1282790jUD.class, str);
    }

    public final int getCode() {
        return this.LL;
    }

    EnumC1282790jUD(int i) {
        this.LL = i;
    }
}

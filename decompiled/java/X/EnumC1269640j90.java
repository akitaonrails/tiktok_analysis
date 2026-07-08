package X;

/* JADX INFO: renamed from: X.0j90, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public enum EnumC1269640j90 {
    LOCAL_RENDER(0),
    PUSH(1),
    LOCAL_RENDER_AND_PUSH(2),
    LOCAL_RENDER_AND_REMOTE_MIX(3);

    public final int LL;

    public int getValue() {
        return this.LL;
    }

    public static EnumC1269640j90 valueOf(String str) {
        return (EnumC1269640j90) C08FF.LIZ(EnumC1269640j90.class, str);
    }

    EnumC1269640j90(int i) {
        this.LL = i;
    }
}

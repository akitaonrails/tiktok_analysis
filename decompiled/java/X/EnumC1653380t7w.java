package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0t7w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class EnumC1653380t7w {
    public static final EnumC1653380t7w CELEBRATION;
    public static final EnumC1653380t7w LANDING_CREATE;
    public static final EnumC1653380t7w LIVE;
    public static final /* synthetic */ EnumC1653380t7w[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1653380t7w> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1653380t7w enumC1653380t7w = new EnumC1653380t7w("LIVE", 0, 0);
        LIVE = enumC1653380t7w;
        EnumC1653380t7w enumC1653380t7w2 = new EnumC1653380t7w("LANDING_CREATE", 1, 1);
        LANDING_CREATE = enumC1653380t7w2;
        EnumC1653380t7w enumC1653380t7w3 = new EnumC1653380t7w("CELEBRATION", 2, 2);
        CELEBRATION = enumC1653380t7w3;
        EnumC1653380t7w[] enumC1653380t7wArr = {enumC1653380t7w, enumC1653380t7w2, enumC1653380t7w3};
        LLILLJJLI = enumC1653380t7wArr;
        LLILLL = new C2254308sP(enumC1653380t7wArr);
    }

    public static EnumC1653380t7w[] values() {
        return (EnumC1653380t7w[]) LLILLJJLI.clone();
    }

    public final int getPriority() {
        return this.LL;
    }

    public static EnumC1653380t7w valueOf(String str) {
        return (EnumC1653380t7w) C08FF.LIZ(EnumC1653380t7w.class, str);
    }

    public EnumC1653380t7w(String str, int i, int i2) {
        this.LL = i2;
    }
}

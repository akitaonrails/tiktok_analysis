package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0D9w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC334620D9w {
    public static final EnumC334620D9w FAILED;
    public static final /* synthetic */ EnumC334620D9w[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC334620D9w PREPARING;
    public static final EnumC334620D9w READY;

    public static InterfaceC2044707zh<EnumC334620D9w> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC334620D9w enumC334620D9w = new EnumC334620D9w("PREPARING", 0);
        PREPARING = enumC334620D9w;
        EnumC334620D9w enumC334620D9w2 = new EnumC334620D9w("READY", 1);
        READY = enumC334620D9w2;
        EnumC334620D9w enumC334620D9w3 = new EnumC334620D9w("FAILED", 2);
        FAILED = enumC334620D9w3;
        EnumC334620D9w[] enumC334620D9wArr = {enumC334620D9w, enumC334620D9w2, enumC334620D9w3};
        LL = enumC334620D9wArr;
        LLILLJJLI = new C2254308sP(enumC334620D9wArr);
    }

    public static EnumC334620D9w[] values() {
        return (EnumC334620D9w[]) LL.clone();
    }

    public static EnumC334620D9w valueOf(String str) {
        return (EnumC334620D9w) C08FF.LIZ(EnumC334620D9w.class, str);
    }

    public EnumC334620D9w(String str, int i) {
    }
}

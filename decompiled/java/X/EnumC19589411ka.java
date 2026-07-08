package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.11ka, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class EnumC19589411ka {
    public static final EnumC19589411ka INTERACT;
    public static final /* synthetic */ EnumC19589411ka[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC19589411ka PREVIEW;
    public final int LL;

    public static InterfaceC2044707zh<EnumC19589411ka> getEntries() {
        return LLILLL;
    }

    static {
        EnumC19589411ka enumC19589411ka = new EnumC19589411ka("PREVIEW", 0, 1);
        PREVIEW = enumC19589411ka;
        EnumC19589411ka enumC19589411ka2 = new EnumC19589411ka("INTERACT", 1, 2);
        INTERACT = enumC19589411ka2;
        EnumC19589411ka[] enumC19589411kaArr = {enumC19589411ka, enumC19589411ka2};
        LLILLJJLI = enumC19589411kaArr;
        LLILLL = new C2254308sP(enumC19589411kaArr);
    }

    public static EnumC19589411ka[] values() {
        return (EnumC19589411ka[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static EnumC19589411ka valueOf(String str) {
        return (EnumC19589411ka) C08FF.LIZ(EnumC19589411ka.class, str);
    }

    public EnumC19589411ka(String str, int i, int i2) {
        this.LL = i2;
    }
}

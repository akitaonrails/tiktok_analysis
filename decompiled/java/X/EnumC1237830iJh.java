package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0iJh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1237830iJh {
    public static final EnumC1237830iJh FORCE;
    public static final /* synthetic */ EnumC1237830iJh[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1237830iJh SKIPPABLE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1237830iJh> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1237830iJh enumC1237830iJh = new EnumC1237830iJh("FORCE", 0, "force");
        FORCE = enumC1237830iJh;
        EnumC1237830iJh enumC1237830iJh2 = new EnumC1237830iJh("SKIPPABLE", 1, "skippable");
        SKIPPABLE = enumC1237830iJh2;
        EnumC1237830iJh[] enumC1237830iJhArr = {enumC1237830iJh, enumC1237830iJh2};
        LLILLJJLI = enumC1237830iJhArr;
        LLILLL = new C2254308sP(enumC1237830iJhArr);
    }

    public static EnumC1237830iJh[] values() {
        return (EnumC1237830iJh[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1237830iJh valueOf(String str) {
        return (EnumC1237830iJh) C08FF.LIZ(EnumC1237830iJh.class, str);
    }

    public EnumC1237830iJh(String str, int i, String str2) {
        this.LL = str2;
    }
}

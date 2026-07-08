package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wO3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1778690wO3 {
    public static final EnumC1778690wO3 EDIT;
    public static final /* synthetic */ EnumC1778690wO3[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1778690wO3 NEW;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1778690wO3> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1778690wO3 enumC1778690wO3 = new EnumC1778690wO3("NEW", 0, "click_add");
        NEW = enumC1778690wO3;
        EnumC1778690wO3 enumC1778690wO32 = new EnumC1778690wO3("EDIT", 1, "click_edit");
        EDIT = enumC1778690wO32;
        EnumC1778690wO3[] enumC1778690wO3Arr = {enumC1778690wO3, enumC1778690wO32};
        LLILLJJLI = enumC1778690wO3Arr;
        LLILLL = new C2254308sP(enumC1778690wO3Arr);
    }

    public static EnumC1778690wO3[] values() {
        return (EnumC1778690wO3[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1778690wO3 valueOf(String str) {
        return (EnumC1778690wO3) C08FF.LIZ(EnumC1778690wO3.class, str);
    }

    public EnumC1778690wO3(String str, int i, String str2) {
        this.LL = str2;
    }
}

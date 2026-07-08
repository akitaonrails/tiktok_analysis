package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0g9R, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1154590g9R {
    public static final EnumC1154590g9R AVATAR_AND_NICKNAME_FLOW;
    public static final /* synthetic */ EnumC1154590g9R[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1154590g9R NICKNAME_ONLY_FLOW;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1154590g9R> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1154590g9R enumC1154590g9R = new EnumC1154590g9R("NICKNAME_ONLY_FLOW", 0, 1);
        NICKNAME_ONLY_FLOW = enumC1154590g9R;
        EnumC1154590g9R enumC1154590g9R2 = new EnumC1154590g9R("AVATAR_AND_NICKNAME_FLOW", 1, 0);
        AVATAR_AND_NICKNAME_FLOW = enumC1154590g9R2;
        EnumC1154590g9R[] enumC1154590g9RArr = {enumC1154590g9R, enumC1154590g9R2};
        LLILLJJLI = enumC1154590g9RArr;
        LLILLL = new C2254308sP(enumC1154590g9RArr);
    }

    public static EnumC1154590g9R[] values() {
        return (EnumC1154590g9R[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1154590g9R valueOf(String str) {
        return (EnumC1154590g9R) C08FF.LIZ(EnumC1154590g9R.class, str);
    }

    public EnumC1154590g9R(String str, int i, int i2) {
        this.LL = i2;
    }
}

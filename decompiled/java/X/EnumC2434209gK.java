package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.09gK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC2434209gK {
    public static final EnumC2434209gK DM;
    public static final /* synthetic */ EnumC2434209gK[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL = 0;

    public static InterfaceC2044707zh<EnumC2434209gK> getEntries() {
        return LLILLL;
    }

    static {
        EnumC2434209gK enumC2434209gK = new EnumC2434209gK();
        DM = enumC2434209gK;
        EnumC2434209gK[] enumC2434209gKArr = {enumC2434209gK};
        LLILLJJLI = enumC2434209gKArr;
        LLILLL = new C2254308sP(enumC2434209gKArr);
    }

    public static EnumC2434209gK[] values() {
        return (EnumC2434209gK[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static EnumC2434209gK valueOf(String str) {
        return (EnumC2434209gK) C08FF.LIZ(EnumC2434209gK.class, str);
    }
}

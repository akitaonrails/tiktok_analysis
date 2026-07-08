package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0hYE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1208400hYE {
    public static final C1216880hlu Companion;
    public static final EnumC1208400hYE InAppPromote;
    public static final /* synthetic */ EnumC1208400hYE[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1208400hYE System;
    public static final EnumC1208400hYE SystemPromote;
    public static final EnumC1208400hYE Unknown;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1208400hYE> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1208400hYE enumC1208400hYE = new EnumC1208400hYE("Unknown", 0, -1);
        Unknown = enumC1208400hYE;
        EnumC1208400hYE enumC1208400hYE2 = new EnumC1208400hYE("System", 1, 0);
        System = enumC1208400hYE2;
        EnumC1208400hYE enumC1208400hYE3 = new EnumC1208400hYE("SystemPromote", 2, 1);
        SystemPromote = enumC1208400hYE3;
        EnumC1208400hYE enumC1208400hYE4 = new EnumC1208400hYE("InAppPromote", 3, 2);
        InAppPromote = enumC1208400hYE4;
        EnumC1208400hYE[] enumC1208400hYEArr = {enumC1208400hYE, enumC1208400hYE2, enumC1208400hYE3, enumC1208400hYE4};
        LLILLJJLI = enumC1208400hYEArr;
        LLILLL = new C2254308sP(enumC1208400hYEArr);
        Companion = new C1216880hlu();
    }

    public static EnumC1208400hYE[] values() {
        return (EnumC1208400hYE[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1208400hYE valueOf(String str) {
        return (EnumC1208400hYE) C08FF.LIZ(EnumC1208400hYE.class, str);
    }

    public EnumC1208400hYE(String str, int i, int i2) {
        this.LL = i2;
    }
}

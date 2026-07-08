package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0vr4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1758240vr4 {
    public static final EnumC1758240vr4 INTERCEPTOR;
    public static final EnumC1758240vr4 LAUNCH;
    public static final /* synthetic */ EnumC1758240vr4[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1758240vr4> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1758240vr4 enumC1758240vr4 = new EnumC1758240vr4("INTERCEPTOR", 0, 6);
        INTERCEPTOR = enumC1758240vr4;
        EnumC1758240vr4 enumC1758240vr42 = new EnumC1758240vr4("LAUNCH", 1, 7);
        LAUNCH = enumC1758240vr42;
        EnumC1758240vr4[] enumC1758240vr4Arr = {enumC1758240vr4, enumC1758240vr42};
        LLILLJJLI = enumC1758240vr4Arr;
        LLILLL = new C2254308sP(enumC1758240vr4Arr);
    }

    public static EnumC1758240vr4[] values() {
        return (EnumC1758240vr4[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static EnumC1758240vr4 valueOf(String str) {
        return (EnumC1758240vr4) C08FF.LIZ(EnumC1758240vr4.class, str);
    }

    public EnumC1758240vr4(String str, int i, int i2) {
        this.LL = i2;
    }
}

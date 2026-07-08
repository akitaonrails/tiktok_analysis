package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0vO3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1740250vO3 {
    public static final EnumC1740250vO3 DISMISS;
    public static final /* synthetic */ EnumC1740250vO3[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1740250vO3 RENDER_COMPLETED;
    public static final EnumC1740250vO3 SHOW;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1740250vO3> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1740250vO3 enumC1740250vO3 = new EnumC1740250vO3("SHOW", 0, 1);
        SHOW = enumC1740250vO3;
        EnumC1740250vO3 enumC1740250vO32 = new EnumC1740250vO3("DISMISS", 1, 2);
        DISMISS = enumC1740250vO32;
        EnumC1740250vO3 enumC1740250vO33 = new EnumC1740250vO3("RENDER_COMPLETED", 2, 3);
        RENDER_COMPLETED = enumC1740250vO33;
        EnumC1740250vO3[] enumC1740250vO3Arr = {enumC1740250vO3, enumC1740250vO32, enumC1740250vO33};
        LLILLJJLI = enumC1740250vO3Arr;
        LLILLL = new C2254308sP(enumC1740250vO3Arr);
    }

    public static EnumC1740250vO3[] values() {
        return (EnumC1740250vO3[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1740250vO3 valueOf(String str) {
        return (EnumC1740250vO3) C08FF.LIZ(EnumC1740250vO3.class, str);
    }

    public EnumC1740250vO3(String str, int i, int i2) {
        this.LL = i2;
    }
}

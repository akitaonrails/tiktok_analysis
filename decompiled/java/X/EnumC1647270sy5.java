package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0sy5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class EnumC1647270sy5 {
    public static final /* synthetic */ EnumC1647270sy5[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final EnumC1647270sy5 RECORD_COMBINE_15;
    public static final EnumC1647270sy5 RECORD_COMBINE_60;
    public final int LL;
    public final int LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1647270sy5> getEntries() {
        return LLILZ;
    }

    static {
        EnumC1647270sy5 enumC1647270sy5 = new EnumC1647270sy5("RECORD_COMBINE_60", 0, 2131845838, 2131845848);
        RECORD_COMBINE_60 = enumC1647270sy5;
        EnumC1647270sy5 enumC1647270sy52 = new EnumC1647270sy5("RECORD_COMBINE_15", 1, 2131845837, 2131845845);
        RECORD_COMBINE_15 = enumC1647270sy52;
        EnumC1647270sy5[] enumC1647270sy5Arr = {enumC1647270sy5, enumC1647270sy52};
        LLILLL = enumC1647270sy5Arr;
        LLILZ = new C2254308sP(enumC1647270sy5Arr);
    }

    public static EnumC1647270sy5[] values() {
        return (EnumC1647270sy5[]) LLILLL.clone();
    }

    public final int getNameResId() {
        return this.LL;
    }

    public final int getTagResId() {
        return this.LLILLJJLI;
    }

    public static EnumC1647270sy5 valueOf(String str) {
        return (EnumC1647270sy5) C08FF.LIZ(EnumC1647270sy5.class, str);
    }

    public EnumC1647270sy5(String str, int i, int i2, int i3) {
        this.LL = i2;
        this.LLILLJJLI = i3;
    }
}

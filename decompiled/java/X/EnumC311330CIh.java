package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0CIh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC311330CIh {
    public static final EnumC311330CIh CONFLICT;
    public static final /* synthetic */ EnumC311330CIh[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC311330CIh NONE;

    public static InterfaceC2044707zh<EnumC311330CIh> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC311330CIh enumC311330CIh = new EnumC311330CIh("NONE", 0);
        NONE = enumC311330CIh;
        EnumC311330CIh enumC311330CIh2 = new EnumC311330CIh("CONFLICT", 1);
        CONFLICT = enumC311330CIh2;
        EnumC311330CIh[] enumC311330CIhArr = {enumC311330CIh, enumC311330CIh2};
        LL = enumC311330CIhArr;
        LLILLJJLI = new C2254308sP(enumC311330CIhArr);
    }

    public static EnumC311330CIh[] values() {
        return (EnumC311330CIh[]) LL.clone();
    }

    public static EnumC311330CIh valueOf(String str) {
        return (EnumC311330CIh) C08FF.LIZ(EnumC311330CIh.class, str);
    }

    public EnumC311330CIh(String str, int i) {
    }
}

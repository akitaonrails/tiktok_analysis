package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0CIy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC311500CIy {
    public static final /* synthetic */ EnumC311500CIy[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC311500CIy PDP_AND_GALLERY;
    public static final EnumC311500CIy PDP_ONLY;
    public final int LL;

    public static InterfaceC2044707zh<EnumC311500CIy> getEntries() {
        return LLILLL;
    }

    static {
        EnumC311500CIy enumC311500CIy = new EnumC311500CIy("PDP_ONLY", 0, 1);
        PDP_ONLY = enumC311500CIy;
        EnumC311500CIy enumC311500CIy2 = new EnumC311500CIy("PDP_AND_GALLERY", 1, 2);
        PDP_AND_GALLERY = enumC311500CIy2;
        EnumC311500CIy[] enumC311500CIyArr = {enumC311500CIy, enumC311500CIy2};
        LLILLJJLI = enumC311500CIyArr;
        LLILLL = new C2254308sP(enumC311500CIyArr);
    }

    public static EnumC311500CIy[] values() {
        return (EnumC311500CIy[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC311500CIy valueOf(String str) {
        return (EnumC311500CIy) C08FF.LIZ(EnumC311500CIy.class, str);
    }

    public EnumC311500CIy(String str, int i, int i2) {
        this.LL = i2;
    }
}

package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0N5u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC588360N5u {
    public static final EnumC588360N5u EFFECT_NOT_AVAILABLE;
    public static final /* synthetic */ EnumC588360N5u[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC588360N5u MISSION_DATA_INVALID;
    public static final EnumC588360N5u SOUND_NOT_AVAILABLE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC588360N5u> getEntries() {
        return LLILLL;
    }

    static {
        EnumC588360N5u enumC588360N5u = new EnumC588360N5u("EFFECT_NOT_AVAILABLE", 0, "effect_not_available");
        EFFECT_NOT_AVAILABLE = enumC588360N5u;
        EnumC588360N5u enumC588360N5u2 = new EnumC588360N5u("SOUND_NOT_AVAILABLE", 1, "sound_not_available");
        SOUND_NOT_AVAILABLE = enumC588360N5u2;
        EnumC588360N5u enumC588360N5u3 = new EnumC588360N5u("MISSION_DATA_INVALID", 2, "mission_data_invalid");
        MISSION_DATA_INVALID = enumC588360N5u3;
        EnumC588360N5u[] enumC588360N5uArr = {enumC588360N5u, enumC588360N5u2, enumC588360N5u3};
        LLILLJJLI = enumC588360N5uArr;
        LLILLL = new C2254308sP(enumC588360N5uArr);
    }

    public static EnumC588360N5u[] values() {
        return (EnumC588360N5u[]) LLILLJJLI.clone();
    }

    public final String getReason() {
        return this.LL;
    }

    public static EnumC588360N5u valueOf(String str) {
        return (EnumC588360N5u) C08FF.LIZ(EnumC588360N5u.class, str);
    }

    public EnumC588360N5u(String str, int i, String str2) {
        this.LL = str2;
    }
}

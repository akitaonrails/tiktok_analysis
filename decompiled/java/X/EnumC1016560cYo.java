package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0cYo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1016560cYo {
    public static final EnumC1016560cYo ANOLE_CDN_DATA_RESPONSE;
    public static final EnumC1016560cYo ANOLE_DATA_RESPONSE;
    public static final EnumC1016560cYo COLD_START_UP;
    public static final EnumC1016560cYo FEED_DATA_RESPONSE;
    public static final EnumC1016560cYo IMMEDIATELY_SHOW;
    public static final /* synthetic */ EnumC1016560cYo[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1016560cYo SWITCH_TO_PROFILE;

    public static InterfaceC2044707zh<EnumC1016560cYo> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1016560cYo enumC1016560cYo = new EnumC1016560cYo("FEED_DATA_RESPONSE", 0);
        FEED_DATA_RESPONSE = enumC1016560cYo;
        EnumC1016560cYo enumC1016560cYo2 = new EnumC1016560cYo("COLD_START_UP", 1);
        COLD_START_UP = enumC1016560cYo2;
        EnumC1016560cYo enumC1016560cYo3 = new EnumC1016560cYo("SWITCH_TO_PROFILE", 2);
        SWITCH_TO_PROFILE = enumC1016560cYo3;
        EnumC1016560cYo enumC1016560cYo4 = new EnumC1016560cYo("ANOLE_DATA_RESPONSE", 3);
        ANOLE_DATA_RESPONSE = enumC1016560cYo4;
        EnumC1016560cYo enumC1016560cYo5 = new EnumC1016560cYo("ANOLE_CDN_DATA_RESPONSE", 4);
        ANOLE_CDN_DATA_RESPONSE = enumC1016560cYo5;
        EnumC1016560cYo enumC1016560cYo6 = new EnumC1016560cYo("IMMEDIATELY_SHOW", 5);
        IMMEDIATELY_SHOW = enumC1016560cYo6;
        EnumC1016560cYo[] enumC1016560cYoArr = {enumC1016560cYo, enumC1016560cYo2, enumC1016560cYo3, enumC1016560cYo4, enumC1016560cYo5, enumC1016560cYo6};
        LL = enumC1016560cYoArr;
        LLILLJJLI = new C2254308sP(enumC1016560cYoArr);
    }

    public static EnumC1016560cYo[] values() {
        return (EnumC1016560cYo[]) LL.clone();
    }

    public static EnumC1016560cYo valueOf(String str) {
        return (EnumC1016560cYo) C08FF.LIZ(EnumC1016560cYo.class, str);
    }

    public EnumC1016560cYo(String str, int i) {
    }
}

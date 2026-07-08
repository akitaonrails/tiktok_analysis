package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.10ru, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class EnumC19380010ru {
    public static final /* synthetic */ EnumC19380010ru[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC19380010ru MUTE_AUDIO;
    public static final EnumC19380010ru WATER_MARK;
    public final String LL;

    public static InterfaceC2044707zh<EnumC19380010ru> getEntries() {
        return LLILLL;
    }

    static {
        EnumC19380010ru enumC19380010ru = new EnumC19380010ru("WATER_MARK", 0, "ve plugin error for water mark");
        WATER_MARK = enumC19380010ru;
        EnumC19380010ru enumC19380010ru2 = new EnumC19380010ru("MUTE_AUDIO", 1, "ve plugin error for mute audio");
        MUTE_AUDIO = enumC19380010ru2;
        EnumC19380010ru[] enumC19380010ruArr = {enumC19380010ru, enumC19380010ru2};
        LLILLJJLI = enumC19380010ruArr;
        LLILLL = new C2254308sP(enumC19380010ruArr);
    }

    public static EnumC19380010ru[] values() {
        return (EnumC19380010ru[]) LLILLJJLI.clone();
    }

    public final String getLogName() {
        return this.LL;
    }

    public static EnumC19380010ru valueOf(String str) {
        return (EnumC19380010ru) C08FF.LIZ(EnumC19380010ru.class, str);
    }

    public EnumC19380010ru(String str, int i, String str2) {
        this.LL = str2;
    }
}

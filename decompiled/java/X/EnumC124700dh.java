package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00dh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC124700dh {
    public static final /* synthetic */ EnumC124700dh[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC124700dh NONE;
    public static final EnumC124700dh REOPEN_TEXTHEADER_PAGE;

    public static InterfaceC2044707zh<EnumC124700dh> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC124700dh enumC124700dh = new EnumC124700dh("NONE", 0);
        NONE = enumC124700dh;
        EnumC124700dh enumC124700dh2 = new EnumC124700dh("REOPEN_TEXTHEADER_PAGE", 1);
        REOPEN_TEXTHEADER_PAGE = enumC124700dh2;
        EnumC124700dh[] enumC124700dhArr = {enumC124700dh, enumC124700dh2};
        LL = enumC124700dhArr;
        LLILLJJLI = new C2254308sP(enumC124700dhArr);
    }

    public static EnumC124700dh[] values() {
        return (EnumC124700dh[]) LL.clone();
    }

    public static EnumC124700dh valueOf(String str) {
        return (EnumC124700dh) C08FF.LIZ(EnumC124700dh.class, str);
    }

    public EnumC124700dh(String str, int i) {
    }
}

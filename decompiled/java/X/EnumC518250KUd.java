package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0KUd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class EnumC518250KUd {
    public static final EnumC518250KUd FETCH_AFTER_CACHE;
    public static final EnumC518250KUd FETCH_NO_CACHE;
    public static final /* synthetic */ EnumC518250KUd[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC518250KUd LOAD_DONE;
    public static final EnumC518250KUd LOAD_FROM_CACHE;
    public static final EnumC518250KUd UNSPECIFIED;

    public static InterfaceC2044707zh<EnumC518250KUd> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC518250KUd enumC518250KUd = new EnumC518250KUd("UNSPECIFIED", 0);
        UNSPECIFIED = enumC518250KUd;
        EnumC518250KUd enumC518250KUd2 = new EnumC518250KUd("LOAD_FROM_CACHE", 1);
        LOAD_FROM_CACHE = enumC518250KUd2;
        EnumC518250KUd enumC518250KUd3 = new EnumC518250KUd("FETCH_AFTER_CACHE", 2);
        FETCH_AFTER_CACHE = enumC518250KUd3;
        EnumC518250KUd enumC518250KUd4 = new EnumC518250KUd("FETCH_NO_CACHE", 3);
        FETCH_NO_CACHE = enumC518250KUd4;
        EnumC518250KUd enumC518250KUd5 = new EnumC518250KUd("LOAD_DONE", 4);
        LOAD_DONE = enumC518250KUd5;
        EnumC518250KUd[] enumC518250KUdArr = {enumC518250KUd, enumC518250KUd2, enumC518250KUd3, enumC518250KUd4, enumC518250KUd5};
        LL = enumC518250KUdArr;
        LLILLJJLI = new C2254308sP(enumC518250KUdArr);
    }

    public static EnumC518250KUd[] values() {
        return (EnumC518250KUd[]) LL.clone();
    }

    public static EnumC518250KUd valueOf(String str) {
        return (EnumC518250KUd) C08FF.LIZ(EnumC518250KUd.class, str);
    }

    public EnumC518250KUd(String str, int i) {
    }
}

package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.008c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0292008c {
    public static final /* synthetic */ EnumC0292008c[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC0292008c SEARCH_DETAIL;
    public static final EnumC0292008c SEARCH_RESULT;

    public static InterfaceC2044707zh<EnumC0292008c> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC0292008c enumC0292008c = new EnumC0292008c("SEARCH_RESULT", 0);
        SEARCH_RESULT = enumC0292008c;
        EnumC0292008c enumC0292008c2 = new EnumC0292008c("SEARCH_DETAIL", 1);
        SEARCH_DETAIL = enumC0292008c2;
        EnumC0292008c[] enumC0292008cArr = {enumC0292008c, enumC0292008c2};
        LL = enumC0292008cArr;
        LLILLJJLI = new C2254308sP(enumC0292008cArr);
    }

    public static EnumC0292008c[] values() {
        return (EnumC0292008c[]) LL.clone();
    }

    public static EnumC0292008c valueOf(String str) {
        return (EnumC0292008c) C08FF.LIZ(EnumC0292008c.class, str);
    }

    public EnumC0292008c(String str, int i) {
    }
}

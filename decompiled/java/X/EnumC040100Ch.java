package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00Ch, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC040100Ch {
    public static final EnumC040100Ch FIRST_PUBLISH;
    public static final /* synthetic */ EnumC040100Ch[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC040100Ch NORMAL;

    public static InterfaceC2044707zh<EnumC040100Ch> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC040100Ch enumC040100Ch = new EnumC040100Ch("NORMAL", 0);
        NORMAL = enumC040100Ch;
        EnumC040100Ch enumC040100Ch2 = new EnumC040100Ch("FIRST_PUBLISH", 1);
        FIRST_PUBLISH = enumC040100Ch2;
        EnumC040100Ch[] enumC040100ChArr = {enumC040100Ch, enumC040100Ch2};
        LL = enumC040100ChArr;
        LLILLJJLI = new C2254308sP(enumC040100ChArr);
    }

    public static EnumC040100Ch[] values() {
        return (EnumC040100Ch[]) LL.clone();
    }

    public static EnumC040100Ch valueOf(String str) {
        return (EnumC040100Ch) C08FF.LIZ(EnumC040100Ch.class, str);
    }

    public EnumC040100Ch(String str, int i) {
    }
}

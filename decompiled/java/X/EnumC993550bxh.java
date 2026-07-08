package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bxh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC993550bxh {
    public static final /* synthetic */ EnumC993550bxh[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC993550bxh RECENTLY_MISSED;
    public static final EnumC993550bxh RECENTLY_WATCHED;

    public static InterfaceC2044707zh<EnumC993550bxh> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC993550bxh enumC993550bxh = new EnumC993550bxh("RECENTLY_MISSED", 0);
        RECENTLY_MISSED = enumC993550bxh;
        EnumC993550bxh enumC993550bxh2 = new EnumC993550bxh("RECENTLY_WATCHED", 1);
        RECENTLY_WATCHED = enumC993550bxh2;
        EnumC993550bxh[] enumC993550bxhArr = {enumC993550bxh, enumC993550bxh2};
        LL = enumC993550bxhArr;
        LLILLJJLI = new C2254308sP(enumC993550bxhArr);
    }

    public static EnumC993550bxh[] values() {
        return (EnumC993550bxh[]) LL.clone();
    }

    public static EnumC993550bxh valueOf(String str) {
        return (EnumC993550bxh) C08FF.LIZ(EnumC993550bxh.class, str);
    }

    public EnumC993550bxh(String str, int i) {
    }
}

package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07tg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC2007407tg {
    public static final EnumC2007407tg CHECK_PHONE;
    public static final /* synthetic */ EnumC2007407tg[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC2007407tg NONE;

    public static InterfaceC2044707zh<EnumC2007407tg> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC2007407tg enumC2007407tg = new EnumC2007407tg("NONE", 0);
        NONE = enumC2007407tg;
        EnumC2007407tg enumC2007407tg2 = new EnumC2007407tg("CHECK_PHONE", 1);
        CHECK_PHONE = enumC2007407tg2;
        EnumC2007407tg[] enumC2007407tgArr = {enumC2007407tg, enumC2007407tg2};
        LL = enumC2007407tgArr;
        LLILLJJLI = new C2254308sP(enumC2007407tgArr);
    }

    public static EnumC2007407tg[] values() {
        return (EnumC2007407tg[]) LL.clone();
    }

    public static EnumC2007407tg valueOf(String str) {
        return (EnumC2007407tg) C08FF.LIZ(EnumC2007407tg.class, str);
    }

    public EnumC2007407tg(String str, int i) {
    }
}

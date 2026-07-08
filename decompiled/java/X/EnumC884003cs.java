package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.03cs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC884003cs {
    public static final EnumC884003cs CLICK_CLOSE;
    public static final EnumC884003cs CLICK_NO_THANKS;
    public static final EnumC884003cs CLICK_SAVE;
    public static final /* synthetic */ EnumC884003cs[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC884003cs> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC884003cs enumC884003cs = new EnumC884003cs("CLICK_SAVE", 0);
        CLICK_SAVE = enumC884003cs;
        EnumC884003cs enumC884003cs2 = new EnumC884003cs("CLICK_NO_THANKS", 1);
        CLICK_NO_THANKS = enumC884003cs2;
        EnumC884003cs enumC884003cs3 = new EnumC884003cs("CLICK_CLOSE", 2);
        CLICK_CLOSE = enumC884003cs3;
        EnumC884003cs[] enumC884003csArr = {enumC884003cs, enumC884003cs2, enumC884003cs3};
        LL = enumC884003csArr;
        LLILLJJLI = new C2254308sP(enumC884003csArr);
    }

    public static EnumC884003cs[] values() {
        return (EnumC884003cs[]) LL.clone();
    }

    public static EnumC884003cs valueOf(String str) {
        return (EnumC884003cs) C08FF.LIZ(EnumC884003cs.class, str);
    }

    public EnumC884003cs(String str, int i) {
    }
}

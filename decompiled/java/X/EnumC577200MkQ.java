package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0MkQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class EnumC577200MkQ {
    public static final EnumC577200MkQ GREEN_SCREEN_ON;
    public static final /* synthetic */ EnumC577200MkQ[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC577200MkQ NONE;
    public static final EnumC577200MkQ PROP_ON;
    public static final EnumC577200MkQ VOICE_CHANGE_ON;
    public final Integer LL;

    public static InterfaceC2044707zh<EnumC577200MkQ> getEntries() {
        return LLILLL;
    }

    static {
        EnumC577200MkQ enumC577200MkQ = new EnumC577200MkQ("NONE", 0, null);
        NONE = enumC577200MkQ;
        EnumC577200MkQ enumC577200MkQ2 = new EnumC577200MkQ("PROP_ON", 1, 2131828270);
        PROP_ON = enumC577200MkQ2;
        EnumC577200MkQ enumC577200MkQ3 = new EnumC577200MkQ("GREEN_SCREEN_ON", 2, 2131828272);
        GREEN_SCREEN_ON = enumC577200MkQ3;
        EnumC577200MkQ enumC577200MkQ4 = new EnumC577200MkQ("VOICE_CHANGE_ON", 3, null);
        VOICE_CHANGE_ON = enumC577200MkQ4;
        EnumC577200MkQ[] enumC577200MkQArr = {enumC577200MkQ, enumC577200MkQ2, enumC577200MkQ3, enumC577200MkQ4};
        LLILLJJLI = enumC577200MkQArr;
        LLILLL = new C2254308sP(enumC577200MkQArr);
    }

    public static EnumC577200MkQ[] values() {
        return (EnumC577200MkQ[]) LLILLJJLI.clone();
    }

    public final Integer getHintTextRes() {
        return this.LL;
    }

    public static EnumC577200MkQ valueOf(String str) {
        return (EnumC577200MkQ) C08FF.LIZ(EnumC577200MkQ.class, str);
    }

    public EnumC577200MkQ(String str, int i, Integer num) {
        this.LL = num;
    }
}

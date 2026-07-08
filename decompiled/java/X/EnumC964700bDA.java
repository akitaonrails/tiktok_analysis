package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bDA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC964700bDA {
    public static final EnumC964700bDA INVITE;
    public static final /* synthetic */ EnumC964700bDA[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC964700bDA> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC964700bDA enumC964700bDA = new EnumC964700bDA();
        INVITE = enumC964700bDA;
        EnumC964700bDA[] enumC964700bDAArr = {enumC964700bDA};
        LL = enumC964700bDAArr;
        LLILLJJLI = new C2254308sP(enumC964700bDAArr);
    }

    public static EnumC964700bDA[] values() {
        return (EnumC964700bDA[]) LL.clone();
    }

    public static EnumC964700bDA valueOf(String str) {
        return (EnumC964700bDA) C08FF.LIZ(EnumC964700bDA.class, str);
    }
}

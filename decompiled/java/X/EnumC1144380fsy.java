package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0fsy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1144380fsy {
    public static final EnumC1144380fsy LIVE_INCOME;
    public static final /* synthetic */ EnumC1144380fsy[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1144380fsy UG_INCOME;

    public static InterfaceC2044707zh<EnumC1144380fsy> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1144380fsy enumC1144380fsy = new EnumC1144380fsy("LIVE_INCOME", 0);
        LIVE_INCOME = enumC1144380fsy;
        EnumC1144380fsy enumC1144380fsy2 = new EnumC1144380fsy("UG_INCOME", 1);
        UG_INCOME = enumC1144380fsy2;
        EnumC1144380fsy[] enumC1144380fsyArr = {enumC1144380fsy, enumC1144380fsy2};
        LL = enumC1144380fsyArr;
        LLILLJJLI = new C2254308sP(enumC1144380fsyArr);
    }

    public static EnumC1144380fsy[] values() {
        return (EnumC1144380fsy[]) LL.clone();
    }

    public static EnumC1144380fsy valueOf(String str) {
        return (EnumC1144380fsy) C08FF.LIZ(EnumC1144380fsy.class, str);
    }

    public EnumC1144380fsy(String str, int i) {
    }
}

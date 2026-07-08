package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0gEN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1157650gEN {
    public static final EnumC1157650gEN BE;
    public static final EnumC1157650gEN HTC;
    public static final /* synthetic */ EnumC1157650gEN[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1157650gEN> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1157650gEN enumC1157650gEN = new EnumC1157650gEN("HTC", 0, "1");
        HTC = enumC1157650gEN;
        EnumC1157650gEN enumC1157650gEN2 = new EnumC1157650gEN("BE", 1, "2");
        BE = enumC1157650gEN2;
        EnumC1157650gEN[] enumC1157650gENArr = {enumC1157650gEN, enumC1157650gEN2};
        LLILLJJLI = enumC1157650gENArr;
        LLILLL = new C2254308sP(enumC1157650gENArr);
    }

    public static EnumC1157650gEN[] values() {
        return (EnumC1157650gEN[]) LLILLJJLI.clone();
    }

    public final String getMobValue() {
        return this.LL;
    }

    public static EnumC1157650gEN valueOf(String str) {
        return (EnumC1157650gEN) C08FF.LIZ(EnumC1157650gEN.class, str);
    }

    public EnumC1157650gEN(String str, int i, String str2) {
        this.LL = str2;
    }
}

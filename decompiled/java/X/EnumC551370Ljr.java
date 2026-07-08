package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Ljr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class EnumC551370Ljr {
    public static final EnumC551370Ljr DELETE;
    public static final /* synthetic */ EnumC551370Ljr[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC551370Ljr UPLOAD;

    public static InterfaceC2044707zh<EnumC551370Ljr> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC551370Ljr enumC551370Ljr = new EnumC551370Ljr("UPLOAD", 0);
        UPLOAD = enumC551370Ljr;
        EnumC551370Ljr enumC551370Ljr2 = new EnumC551370Ljr("DELETE", 1);
        DELETE = enumC551370Ljr2;
        EnumC551370Ljr[] enumC551370LjrArr = {enumC551370Ljr, enumC551370Ljr2};
        LL = enumC551370LjrArr;
        LLILLJJLI = new C2254308sP(enumC551370LjrArr);
    }

    public static EnumC551370Ljr[] values() {
        return (EnumC551370Ljr[]) LL.clone();
    }

    public static EnumC551370Ljr valueOf(String str) {
        return (EnumC551370Ljr) C08FF.LIZ(EnumC551370Ljr.class, str);
    }

    public EnumC551370Ljr(String str, int i) {
    }
}

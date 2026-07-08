package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Xfd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class EnumC854510Xfd {
    public static final EnumC854510Xfd EMAIL;
    public static final /* synthetic */ EnumC854510Xfd[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC854510Xfd PHONE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC854510Xfd> getEntries() {
        return LLILLL;
    }

    static {
        EnumC854510Xfd enumC854510Xfd = new EnumC854510Xfd("EMAIL", 0, "email");
        EMAIL = enumC854510Xfd;
        EnumC854510Xfd enumC854510Xfd2 = new EnumC854510Xfd("PHONE", 1, "phone");
        PHONE = enumC854510Xfd2;
        EnumC854510Xfd[] enumC854510XfdArr = {enumC854510Xfd, enumC854510Xfd2};
        LLILLJJLI = enumC854510XfdArr;
        LLILLL = new C2254308sP(enumC854510XfdArr);
    }

    public static EnumC854510Xfd[] values() {
        return (EnumC854510Xfd[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC854510Xfd valueOf(String str) {
        return (EnumC854510Xfd) C08FF.LIZ(EnumC854510Xfd.class, str);
    }

    public EnumC854510Xfd(String str, int i, String str2) {
        this.LL = str2;
    }
}

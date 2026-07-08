package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Rih, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class EnumC703530Rih {
    public static final EnumC703530Rih ASYNC;
    public static final EnumC703530Rih IMMEDIATE;
    public static final /* synthetic */ EnumC703530Rih[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC703530Rih> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC703530Rih enumC703530Rih = new EnumC703530Rih("ASYNC", 0);
        ASYNC = enumC703530Rih;
        EnumC703530Rih enumC703530Rih2 = new EnumC703530Rih("IMMEDIATE", 1);
        IMMEDIATE = enumC703530Rih2;
        EnumC703530Rih[] enumC703530RihArr = {enumC703530Rih, enumC703530Rih2};
        LL = enumC703530RihArr;
        LLILLJJLI = new C2254308sP(enumC703530RihArr);
    }

    public static EnumC703530Rih[] values() {
        return (EnumC703530Rih[]) LL.clone();
    }

    public static EnumC703530Rih valueOf(String str) {
        return (EnumC703530Rih) C08FF.LIZ(EnumC703530Rih.class, str);
    }

    public EnumC703530Rih(String str, int i) {
    }
}

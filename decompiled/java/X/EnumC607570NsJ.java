package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0NsJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC607570NsJ {
    public static final EnumC607570NsJ GLOBAL;
    public static final /* synthetic */ EnumC607570NsJ[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC607570NsJ ONLY_FOLLOW;

    public static InterfaceC2044707zh<EnumC607570NsJ> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC607570NsJ enumC607570NsJ = new EnumC607570NsJ("GLOBAL", 0);
        GLOBAL = enumC607570NsJ;
        EnumC607570NsJ enumC607570NsJ2 = new EnumC607570NsJ("ONLY_FOLLOW", 1);
        ONLY_FOLLOW = enumC607570NsJ2;
        EnumC607570NsJ[] enumC607570NsJArr = {enumC607570NsJ, enumC607570NsJ2};
        LL = enumC607570NsJArr;
        LLILLJJLI = new C2254308sP(enumC607570NsJArr);
    }

    public static EnumC607570NsJ[] values() {
        return (EnumC607570NsJ[]) LL.clone();
    }

    public static EnumC607570NsJ valueOf(String str) {
        return (EnumC607570NsJ) C08FF.LIZ(EnumC607570NsJ.class, str);
    }

    public EnumC607570NsJ(String str, int i) {
    }
}

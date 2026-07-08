package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Ien, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class EnumC471790Ien {
    public static final /* synthetic */ EnumC471790Ien[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC471790Ien NEARBY;
    public static final EnumC471790Ien ROOM;

    public static InterfaceC2044707zh<EnumC471790Ien> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC471790Ien enumC471790Ien = new EnumC471790Ien("ROOM", 0);
        ROOM = enumC471790Ien;
        EnumC471790Ien enumC471790Ien2 = new EnumC471790Ien("NEARBY", 1);
        NEARBY = enumC471790Ien2;
        EnumC471790Ien[] enumC471790IenArr = {enumC471790Ien, enumC471790Ien2};
        LL = enumC471790IenArr;
        LLILLJJLI = new C2254308sP(enumC471790IenArr);
    }

    public static EnumC471790Ien[] values() {
        return (EnumC471790Ien[]) LL.clone();
    }

    public static EnumC471790Ien valueOf(String str) {
        return (EnumC471790Ien) C08FF.LIZ(EnumC471790Ien.class, str);
    }

    public EnumC471790Ien(String str, int i) {
    }
}

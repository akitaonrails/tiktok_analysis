package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0idB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1249910idB {
    public static final /* synthetic */ EnumC1249910idB[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1249910idB PRIMARY;
    public static final EnumC1249910idB SECONDARY;
    public static final EnumC1249910idB UNABLE;

    public static InterfaceC2044707zh<EnumC1249910idB> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1249910idB enumC1249910idB = new EnumC1249910idB("PRIMARY", 0);
        PRIMARY = enumC1249910idB;
        EnumC1249910idB enumC1249910idB2 = new EnumC1249910idB("SECONDARY", 1);
        SECONDARY = enumC1249910idB2;
        EnumC1249910idB enumC1249910idB3 = new EnumC1249910idB("UNABLE", 2);
        UNABLE = enumC1249910idB3;
        EnumC1249910idB[] enumC1249910idBArr = {enumC1249910idB, enumC1249910idB2, enumC1249910idB3};
        LL = enumC1249910idBArr;
        LLILLJJLI = new C2254308sP(enumC1249910idBArr);
    }

    public static EnumC1249910idB[] values() {
        return (EnumC1249910idB[]) LL.clone();
    }

    public static EnumC1249910idB valueOf(String str) {
        return (EnumC1249910idB) C08FF.LIZ(EnumC1249910idB.class, str);
    }

    public EnumC1249910idB(String str, int i) {
    }
}

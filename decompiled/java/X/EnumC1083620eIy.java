package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0eIy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1083620eIy {
    public static final EnumC1083620eIy AUDIENCE;
    public static final /* synthetic */ EnumC1083620eIy[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1083620eIy PREVIEW_CARD;

    public static InterfaceC2044707zh<EnumC1083620eIy> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1083620eIy enumC1083620eIy = new EnumC1083620eIy("PREVIEW_CARD", 0);
        PREVIEW_CARD = enumC1083620eIy;
        EnumC1083620eIy enumC1083620eIy2 = new EnumC1083620eIy("AUDIENCE", 1);
        AUDIENCE = enumC1083620eIy2;
        EnumC1083620eIy[] enumC1083620eIyArr = {enumC1083620eIy, enumC1083620eIy2};
        LL = enumC1083620eIyArr;
        LLILLJJLI = new C2254308sP(enumC1083620eIyArr);
    }

    public static EnumC1083620eIy[] values() {
        return (EnumC1083620eIy[]) LL.clone();
    }

    public static EnumC1083620eIy valueOf(String str) {
        return (EnumC1083620eIy) C08FF.LIZ(EnumC1083620eIy.class, str);
    }

    public EnumC1083620eIy(String str, int i) {
    }
}

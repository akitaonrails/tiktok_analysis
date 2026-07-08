package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.15hB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class EnumC20587515hB {
    public static final EnumC20587515hB CACHE;
    public static final EnumC20587515hB DRAFT;
    public static final EnumC20587515hB IMAGE;
    public static final /* synthetic */ EnumC20587515hB[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC20587515hB RESOURCE;
    public static final EnumC20587515hB STORY;
    public final String LL;

    public static InterfaceC2044707zh<EnumC20587515hB> getEntries() {
        return LLILLL;
    }

    static {
        EnumC20587515hB enumC20587515hB = new EnumC20587515hB("CACHE", 0, "cache");
        CACHE = enumC20587515hB;
        EnumC20587515hB enumC20587515hB2 = new EnumC20587515hB("RESOURCE", 1, "resource");
        RESOURCE = enumC20587515hB2;
        EnumC20587515hB enumC20587515hB3 = new EnumC20587515hB("DRAFT", 2, "draft");
        DRAFT = enumC20587515hB3;
        EnumC20587515hB enumC20587515hB4 = new EnumC20587515hB("STORY", 3, "story");
        STORY = enumC20587515hB4;
        EnumC20587515hB enumC20587515hB5 = new EnumC20587515hB("IMAGE", 4, "image");
        IMAGE = enumC20587515hB5;
        EnumC20587515hB[] enumC20587515hBArr = {enumC20587515hB, enumC20587515hB2, enumC20587515hB3, enumC20587515hB4, enumC20587515hB5};
        LLILLJJLI = enumC20587515hBArr;
        LLILLL = new C2254308sP(enumC20587515hBArr);
    }

    public static EnumC20587515hB[] values() {
        return (EnumC20587515hB[]) LLILLJJLI.clone();
    }

    public final String getType() {
        return this.LL;
    }

    public static EnumC20587515hB valueOf(String str) {
        return (EnumC20587515hB) C08FF.LIZ(EnumC20587515hB.class, str);
    }

    public EnumC20587515hB(String str, int i, String str2) {
        this.LL = str2;
    }
}

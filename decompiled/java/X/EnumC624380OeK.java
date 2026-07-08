package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0OeK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC624380OeK {
    public static final EnumC624380OeK AfterClick;
    public static final /* synthetic */ EnumC624380OeK[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC624380OeK Normal;

    public static InterfaceC2044707zh<EnumC624380OeK> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC624380OeK enumC624380OeK = new EnumC624380OeK("Normal", 0);
        Normal = enumC624380OeK;
        EnumC624380OeK enumC624380OeK2 = new EnumC624380OeK("AfterClick", 1);
        AfterClick = enumC624380OeK2;
        EnumC624380OeK[] enumC624380OeKArr = {enumC624380OeK, enumC624380OeK2};
        LL = enumC624380OeKArr;
        LLILLJJLI = new C2254308sP(enumC624380OeKArr);
    }

    public static EnumC624380OeK[] values() {
        return (EnumC624380OeK[]) LL.clone();
    }

    public static EnumC624380OeK valueOf(String str) {
        return (EnumC624380OeK) C08FF.LIZ(EnumC624380OeK.class, str);
    }

    public EnumC624380OeK(String str, int i) {
    }
}

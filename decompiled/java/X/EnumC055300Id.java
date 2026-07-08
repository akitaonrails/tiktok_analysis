package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00Id, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC055300Id {
    public static final EnumC055300Id CACHE_EMPTY;
    public static final EnumC055300Id CACHE_UNUSED;
    public static final EnumC055300Id CACHE_USED;
    public static final /* synthetic */ EnumC055300Id[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC055300Id> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC055300Id enumC055300Id = new EnumC055300Id("CACHE_UNUSED", 0);
        CACHE_UNUSED = enumC055300Id;
        EnumC055300Id enumC055300Id2 = new EnumC055300Id("CACHE_EMPTY", 1);
        CACHE_EMPTY = enumC055300Id2;
        EnumC055300Id enumC055300Id3 = new EnumC055300Id("CACHE_USED", 2);
        CACHE_USED = enumC055300Id3;
        EnumC055300Id[] enumC055300IdArr = {enumC055300Id, enumC055300Id2, enumC055300Id3};
        LL = enumC055300IdArr;
        LLILLJJLI = new C2254308sP(enumC055300IdArr);
    }

    public static EnumC055300Id[] values() {
        return (EnumC055300Id[]) LL.clone();
    }

    public static EnumC055300Id valueOf(String str) {
        return (EnumC055300Id) C08FF.LIZ(EnumC055300Id.class, str);
    }

    public EnumC055300Id(String str, int i) {
    }
}

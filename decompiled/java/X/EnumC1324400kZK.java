package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0kZK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class EnumC1324400kZK {
    public static final EnumC1324400kZK CHANGED;
    public static final EnumC1324400kZK CREATED;
    public static final EnumC1324400kZK DESTROYED;
    public static final EnumC1324400kZK INIT;
    public static final /* synthetic */ EnumC1324400kZK[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1324400kZK> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1324400kZK enumC1324400kZK = new EnumC1324400kZK("INIT", 0);
        INIT = enumC1324400kZK;
        EnumC1324400kZK enumC1324400kZK2 = new EnumC1324400kZK("CREATED", 1);
        CREATED = enumC1324400kZK2;
        EnumC1324400kZK enumC1324400kZK3 = new EnumC1324400kZK("CHANGED", 2);
        CHANGED = enumC1324400kZK3;
        EnumC1324400kZK enumC1324400kZK4 = new EnumC1324400kZK("DESTROYED", 3);
        DESTROYED = enumC1324400kZK4;
        EnumC1324400kZK[] enumC1324400kZKArr = {enumC1324400kZK, enumC1324400kZK2, enumC1324400kZK3, enumC1324400kZK4};
        LL = enumC1324400kZKArr;
        LLILLJJLI = new C2254308sP(enumC1324400kZKArr);
    }

    public static EnumC1324400kZK[] values() {
        return (EnumC1324400kZK[]) LL.clone();
    }

    public static EnumC1324400kZK valueOf(String str) {
        return (EnumC1324400kZK) C08FF.LIZ(EnumC1324400kZK.class, str);
    }

    public EnumC1324400kZK(String str, int i) {
    }
}

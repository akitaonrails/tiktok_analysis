package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ify, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1251640ify {
    public static final EnumC1251640ify CAPSULE;
    public static final /* synthetic */ EnumC1251640ify[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1251640ify LOOP;
    public static final EnumC1251640ify NORMAL;

    public static InterfaceC2044707zh<EnumC1251640ify> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1251640ify enumC1251640ify = new EnumC1251640ify("NORMAL", 0);
        NORMAL = enumC1251640ify;
        EnumC1251640ify enumC1251640ify2 = new EnumC1251640ify("CAPSULE", 1);
        CAPSULE = enumC1251640ify2;
        EnumC1251640ify enumC1251640ify3 = new EnumC1251640ify("LOOP", 2);
        LOOP = enumC1251640ify3;
        EnumC1251640ify[] enumC1251640ifyArr = {enumC1251640ify, enumC1251640ify2, enumC1251640ify3};
        LL = enumC1251640ifyArr;
        LLILLJJLI = new C2254308sP(enumC1251640ifyArr);
    }

    public static EnumC1251640ify[] values() {
        return (EnumC1251640ify[]) LL.clone();
    }

    public static EnumC1251640ify valueOf(String str) {
        return (EnumC1251640ify) C08FF.LIZ(EnumC1251640ify.class, str);
    }

    public EnumC1251640ify(String str, int i) {
    }
}

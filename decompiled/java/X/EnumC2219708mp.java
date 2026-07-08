package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.08mp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC2219708mp {
    public static final EnumC2219708mp ALL;
    public static final /* synthetic */ EnumC2219708mp[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC2219708mp ONLY_FACE;

    public static InterfaceC2044707zh<EnumC2219708mp> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC2219708mp enumC2219708mp = new EnumC2219708mp("ALL", 0);
        ALL = enumC2219708mp;
        EnumC2219708mp enumC2219708mp2 = new EnumC2219708mp("ONLY_FACE", 1);
        ONLY_FACE = enumC2219708mp2;
        EnumC2219708mp[] enumC2219708mpArr = {enumC2219708mp, enumC2219708mp2};
        LL = enumC2219708mpArr;
        LLILLJJLI = new C2254308sP(enumC2219708mpArr);
    }

    public static EnumC2219708mp[] values() {
        return (EnumC2219708mp[]) LL.clone();
    }

    public static EnumC2219708mp valueOf(String str) {
        return (EnumC2219708mp) C08FF.LIZ(EnumC2219708mp.class, str);
    }

    public EnumC2219708mp(String str, int i) {
    }
}

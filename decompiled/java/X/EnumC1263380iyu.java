package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0iyu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1263380iyu {
    public static final EnumC1263380iyu API;
    public static final /* synthetic */ EnumC1263380iyu[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1263380iyu STORAGE;

    public static InterfaceC2044707zh<EnumC1263380iyu> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1263380iyu enumC1263380iyu = new EnumC1263380iyu("STORAGE", 0);
        STORAGE = enumC1263380iyu;
        EnumC1263380iyu enumC1263380iyu2 = new EnumC1263380iyu("API", 1);
        API = enumC1263380iyu2;
        EnumC1263380iyu[] enumC1263380iyuArr = {enumC1263380iyu, enumC1263380iyu2};
        LL = enumC1263380iyuArr;
        LLILLJJLI = new C2254308sP(enumC1263380iyuArr);
    }

    public static EnumC1263380iyu[] values() {
        return (EnumC1263380iyu[]) LL.clone();
    }

    public static EnumC1263380iyu valueOf(String str) {
        return (EnumC1263380iyu) C08FF.LIZ(EnumC1263380iyu.class, str);
    }

    public EnumC1263380iyu(String str, int i) {
    }
}

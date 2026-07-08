package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wV2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1783020wV2 {
    public static final EnumC1783020wV2 DEFERRED;
    public static final EnumC1783020wV2 IGNORED;
    public static final EnumC1783020wV2 IMMINENT;
    public static final /* synthetic */ EnumC1783020wV2[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1783020wV2 SCHEDULED;

    public static InterfaceC2044707zh<EnumC1783020wV2> getEntries() {
        return LLILLJJLI;
    }

    public static EnumC1783020wV2 valueOf(String str) {
        return (EnumC1783020wV2) C08FF.LIZ(EnumC1783020wV2.class, str);
    }

    public static EnumC1783020wV2[] values() {
        return (EnumC1783020wV2[]) LL.clone();
    }

    static {
        EnumC1783020wV2 enumC1783020wV2 = new EnumC1783020wV2("IGNORED", 0);
        IGNORED = enumC1783020wV2;
        EnumC1783020wV2 enumC1783020wV22 = new EnumC1783020wV2("SCHEDULED", 1);
        SCHEDULED = enumC1783020wV22;
        EnumC1783020wV2 enumC1783020wV23 = new EnumC1783020wV2("DEFERRED", 2);
        DEFERRED = enumC1783020wV23;
        EnumC1783020wV2 enumC1783020wV24 = new EnumC1783020wV2("IMMINENT", 3);
        IMMINENT = enumC1783020wV24;
        EnumC1783020wV2[] enumC1783020wV2Arr = {enumC1783020wV2, enumC1783020wV22, enumC1783020wV23, enumC1783020wV24};
        LL = enumC1783020wV2Arr;
        LLILLJJLI = new C2254308sP(enumC1783020wV2Arr);
    }

    public EnumC1783020wV2(String str, int i) {
    }
}

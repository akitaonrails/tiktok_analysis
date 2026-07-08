package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.10Fe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class EnumC19214810Fe {
    public static final EnumC19214810Fe END_TIME;
    public static final /* synthetic */ EnumC19214810Fe[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC19214810Fe START_TIME;

    public static InterfaceC2044707zh<EnumC19214810Fe> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC19214810Fe enumC19214810Fe = new EnumC19214810Fe("START_TIME", 0);
        START_TIME = enumC19214810Fe;
        EnumC19214810Fe enumC19214810Fe2 = new EnumC19214810Fe("END_TIME", 1);
        END_TIME = enumC19214810Fe2;
        EnumC19214810Fe[] enumC19214810FeArr = {enumC19214810Fe, enumC19214810Fe2};
        LL = enumC19214810FeArr;
        LLILLJJLI = new C2254308sP(enumC19214810FeArr);
    }

    public static EnumC19214810Fe[] values() {
        return (EnumC19214810Fe[]) LL.clone();
    }

    public static EnumC19214810Fe valueOf(String str) {
        return (EnumC19214810Fe) C08FF.LIZ(EnumC19214810Fe.class, str);
    }

    public EnumC19214810Fe(String str, int i) {
    }
}

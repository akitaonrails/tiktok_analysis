package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0uby, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1710440uby {
    public static final /* synthetic */ EnumC1710440uby[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1710440uby LOSE_FOCUS;
    public static final EnumC1710440uby REAL_TIME;
    public static final EnumC1710440uby SUBMIT;

    public static InterfaceC2044707zh<EnumC1710440uby> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1710440uby enumC1710440uby = new EnumC1710440uby("REAL_TIME", 0);
        REAL_TIME = enumC1710440uby;
        EnumC1710440uby enumC1710440uby2 = new EnumC1710440uby("LOSE_FOCUS", 1);
        LOSE_FOCUS = enumC1710440uby2;
        EnumC1710440uby enumC1710440uby3 = new EnumC1710440uby("SUBMIT", 2);
        SUBMIT = enumC1710440uby3;
        EnumC1710440uby[] enumC1710440ubyArr = {enumC1710440uby, enumC1710440uby2, enumC1710440uby3};
        LL = enumC1710440ubyArr;
        LLILLJJLI = new C2254308sP(enumC1710440ubyArr);
    }

    public static EnumC1710440uby[] values() {
        return (EnumC1710440uby[]) LL.clone();
    }

    public static EnumC1710440uby valueOf(String str) {
        return (EnumC1710440uby) C08FF.LIZ(EnumC1710440uby.class, str);
    }

    public EnumC1710440uby(String str, int i) {
    }
}

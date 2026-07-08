package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0iR1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1242370iR1 {
    public static final EnumC1242370iR1 DIRECTLY;
    public static final /* synthetic */ EnumC1242370iR1[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1242370iR1 PENDING_BY_COLLAPSE;

    public static InterfaceC2044707zh<EnumC1242370iR1> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1242370iR1 enumC1242370iR1 = new EnumC1242370iR1("DIRECTLY", 0);
        DIRECTLY = enumC1242370iR1;
        EnumC1242370iR1 enumC1242370iR12 = new EnumC1242370iR1("PENDING_BY_COLLAPSE", 1);
        PENDING_BY_COLLAPSE = enumC1242370iR12;
        EnumC1242370iR1[] enumC1242370iR1Arr = {enumC1242370iR1, enumC1242370iR12};
        LL = enumC1242370iR1Arr;
        LLILLJJLI = new C2254308sP(enumC1242370iR1Arr);
    }

    public static EnumC1242370iR1[] values() {
        return (EnumC1242370iR1[]) LL.clone();
    }

    public static EnumC1242370iR1 valueOf(String str) {
        return (EnumC1242370iR1) C08FF.LIZ(EnumC1242370iR1.class, str);
    }

    public EnumC1242370iR1(String str, int i) {
    }
}

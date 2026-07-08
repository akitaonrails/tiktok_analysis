package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0qv1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class EnumC1568490qv1 {
    public static final EnumC1568490qv1 INIT;
    public static final /* synthetic */ EnumC1568490qv1[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1568490qv1 LOCAL_COMPLETE;
    public static final EnumC1568490qv1 LOCAL_EMPTY;

    public static InterfaceC2044707zh<EnumC1568490qv1> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1568490qv1 enumC1568490qv1 = new EnumC1568490qv1("INIT", 0);
        INIT = enumC1568490qv1;
        EnumC1568490qv1 enumC1568490qv12 = new EnumC1568490qv1("LOCAL_COMPLETE", 1);
        LOCAL_COMPLETE = enumC1568490qv12;
        EnumC1568490qv1 enumC1568490qv13 = new EnumC1568490qv1("LOCAL_EMPTY", 2);
        LOCAL_EMPTY = enumC1568490qv13;
        EnumC1568490qv1[] enumC1568490qv1Arr = {enumC1568490qv1, enumC1568490qv12, enumC1568490qv13};
        LL = enumC1568490qv1Arr;
        LLILLJJLI = new C2254308sP(enumC1568490qv1Arr);
    }

    public static EnumC1568490qv1[] values() {
        return (EnumC1568490qv1[]) LL.clone();
    }

    public static EnumC1568490qv1 valueOf(String str) {
        return (EnumC1568490qv1) C08FF.LIZ(EnumC1568490qv1.class, str);
    }

    public EnumC1568490qv1(String str, int i) {
    }
}

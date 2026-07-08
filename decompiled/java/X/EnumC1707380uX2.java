package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0uX2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1707380uX2 {
    public static final EnumC1707380uX2 CLOSED;
    public static final /* synthetic */ EnumC1707380uX2[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL = "closed";

    public static InterfaceC2044707zh<EnumC1707380uX2> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1707380uX2 enumC1707380uX2 = new EnumC1707380uX2();
        CLOSED = enumC1707380uX2;
        EnumC1707380uX2[] enumC1707380uX2Arr = {enumC1707380uX2};
        LLILLJJLI = enumC1707380uX2Arr;
        LLILLL = new C2254308sP(enumC1707380uX2Arr);
    }

    public static EnumC1707380uX2[] values() {
        return (EnumC1707380uX2[]) LLILLJJLI.clone();
    }

    public final String getActionType() {
        return this.LL;
    }

    public static EnumC1707380uX2 valueOf(String str) {
        return (EnumC1707380uX2) C08FF.LIZ(EnumC1707380uX2.class, str);
    }
}

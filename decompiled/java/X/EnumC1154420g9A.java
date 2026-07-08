package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0g9A, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1154420g9A {
    public static final /* synthetic */ EnumC1154420g9A[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1154420g9A MEANINGFUL_RENDER;
    public static final EnumC1154420g9A TTI;

    public static InterfaceC2044707zh<EnumC1154420g9A> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1154420g9A enumC1154420g9A = new EnumC1154420g9A("MEANINGFUL_RENDER", 0);
        MEANINGFUL_RENDER = enumC1154420g9A;
        EnumC1154420g9A enumC1154420g9A2 = new EnumC1154420g9A("TTI", 1);
        TTI = enumC1154420g9A2;
        EnumC1154420g9A[] enumC1154420g9AArr = {enumC1154420g9A, enumC1154420g9A2};
        LL = enumC1154420g9AArr;
        LLILLJJLI = new C2254308sP(enumC1154420g9AArr);
    }

    public static EnumC1154420g9A[] values() {
        return (EnumC1154420g9A[]) LL.clone();
    }

    public static EnumC1154420g9A valueOf(String str) {
        return (EnumC1154420g9A) C08FF.LIZ(EnumC1154420g9A.class, str);
    }

    public EnumC1154420g9A(String str, int i) {
    }
}

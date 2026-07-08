package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ftH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1144570ftH {
    public static final EnumC1144570ftH ANCHOR;
    public static final EnumC1144570ftH AUDIENCE;
    public static final EnumC1144570ftH AUDIENCE_SENDER;
    public static final /* synthetic */ EnumC1144570ftH[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1144570ftH> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1144570ftH enumC1144570ftH = new EnumC1144570ftH("AUDIENCE", 0);
        AUDIENCE = enumC1144570ftH;
        EnumC1144570ftH enumC1144570ftH2 = new EnumC1144570ftH("AUDIENCE_SENDER", 1);
        AUDIENCE_SENDER = enumC1144570ftH2;
        EnumC1144570ftH enumC1144570ftH3 = new EnumC1144570ftH("ANCHOR", 2);
        ANCHOR = enumC1144570ftH3;
        EnumC1144570ftH[] enumC1144570ftHArr = {enumC1144570ftH, enumC1144570ftH2, enumC1144570ftH3};
        LL = enumC1144570ftHArr;
        LLILLJJLI = new C2254308sP(enumC1144570ftHArr);
    }

    public static EnumC1144570ftH[] values() {
        return (EnumC1144570ftH[]) LL.clone();
    }

    public static EnumC1144570ftH valueOf(String str) {
        return (EnumC1144570ftH) C08FF.LIZ(EnumC1144570ftH.class, str);
    }

    public EnumC1144570ftH(String str, int i) {
    }
}

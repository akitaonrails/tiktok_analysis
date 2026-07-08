package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0gqR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1181250gqR {
    public static final EnumC1181250gqR ATTACHED_DATA;
    public static final EnumC1181250gqR COMPONENT;
    public static final EnumC1181250gqR CONTAINER;
    public static final C1181310gqX Companion;
    public static final EnumC1181250gqR GROUP;
    public static final /* synthetic */ EnumC1181250gqR[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1181250gqR ROOT;
    public static final EnumC1181250gqR UNKNOWN;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1181250gqR> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [X.0gqX] */
    static {
        EnumC1181250gqR enumC1181250gqR = new EnumC1181250gqR("ROOT", 0, "root");
        ROOT = enumC1181250gqR;
        EnumC1181250gqR enumC1181250gqR2 = new EnumC1181250gqR("CONTAINER", 1, "container");
        CONTAINER = enumC1181250gqR2;
        EnumC1181250gqR enumC1181250gqR3 = new EnumC1181250gqR("GROUP", 2, "group");
        GROUP = enumC1181250gqR3;
        EnumC1181250gqR enumC1181250gqR4 = new EnumC1181250gqR("COMPONENT", 3, "component");
        COMPONENT = enumC1181250gqR4;
        EnumC1181250gqR enumC1181250gqR5 = new EnumC1181250gqR("ATTACHED_DATA", 4, "attached_data");
        ATTACHED_DATA = enumC1181250gqR5;
        EnumC1181250gqR enumC1181250gqR6 = new EnumC1181250gqR("UNKNOWN", 5, "unknown");
        UNKNOWN = enumC1181250gqR6;
        EnumC1181250gqR[] enumC1181250gqRArr = {enumC1181250gqR, enumC1181250gqR2, enumC1181250gqR3, enumC1181250gqR4, enumC1181250gqR5, enumC1181250gqR6};
        LLILLJJLI = enumC1181250gqRArr;
        LLILLL = new C2254308sP(enumC1181250gqRArr);
        Companion = new Object() { // from class: X.0gqX
        };
    }

    public static EnumC1181250gqR[] values() {
        return (EnumC1181250gqR[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1181250gqR valueOf(String str) {
        return (EnumC1181250gqR) C08FF.LIZ(EnumC1181250gqR.class, str);
    }

    public EnumC1181250gqR(String str, int i, String str2) {
        this.LL = str2;
    }
}

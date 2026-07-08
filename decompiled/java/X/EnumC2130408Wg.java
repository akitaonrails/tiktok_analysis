package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.08Wg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1294060jmO
public final class EnumC2130408Wg {
    public static final C2130708Wj Companion;
    public static final /* synthetic */ EnumC2130408Wg[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC2130408Wg PDP_BATCH_API;
    public final String LL = "pdp_batch";

    public static InterfaceC2044707zh<EnumC2130408Wg> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.08Wj] */
    static {
        EnumC2130408Wg enumC2130408Wg = new EnumC2130408Wg();
        PDP_BATCH_API = enumC2130408Wg;
        EnumC2130408Wg[] enumC2130408WgArr = {enumC2130408Wg};
        LLILLJJLI = enumC2130408WgArr;
        LLILLL = new C2254308sP(enumC2130408WgArr);
        Companion = new Object() { // from class: X.08Wj
        };
    }

    public static EnumC2130408Wg[] values() {
        return (EnumC2130408Wg[]) LLILLJJLI.clone();
    }

    public final String getValueStr() {
        return this.LL;
    }

    public static EnumC2130408Wg valueOf(String str) {
        return (EnumC2130408Wg) C08FF.LIZ(EnumC2130408Wg.class, str);
    }
}

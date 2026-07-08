package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0N4i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC587980N4i {
    public static final /* synthetic */ EnumC587980N4i[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC587980N4i STRATEGY_TASK;
    public final String LL = "strategy_task";

    public static InterfaceC2044707zh<EnumC587980N4i> getEntries() {
        return LLILLL;
    }

    static {
        EnumC587980N4i enumC587980N4i = new EnumC587980N4i();
        STRATEGY_TASK = enumC587980N4i;
        EnumC587980N4i[] enumC587980N4iArr = {enumC587980N4i};
        LLILLJJLI = enumC587980N4iArr;
        LLILLL = new C2254308sP(enumC587980N4iArr);
    }

    public static EnumC587980N4i[] values() {
        return (EnumC587980N4i[]) LLILLJJLI.clone();
    }

    public final String getBizline() {
        return this.LL;
    }

    public static EnumC587980N4i valueOf(String str) {
        return (EnumC587980N4i) C08FF.LIZ(EnumC587980N4i.class, str);
    }
}

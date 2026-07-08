package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Pan, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC647670Pan {
    public static final EnumC647670Pan FAILED;
    public static final EnumC647670Pan FINISHED;
    public static final EnumC647670Pan INIT;
    public static final /* synthetic */ EnumC647670Pan[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC647670Pan> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC647670Pan enumC647670Pan = new EnumC647670Pan("INIT", 0);
        INIT = enumC647670Pan;
        EnumC647670Pan enumC647670Pan2 = new EnumC647670Pan("FAILED", 1);
        FAILED = enumC647670Pan2;
        EnumC647670Pan enumC647670Pan3 = new EnumC647670Pan("FINISHED", 2);
        FINISHED = enumC647670Pan3;
        EnumC647670Pan[] enumC647670PanArr = {enumC647670Pan, enumC647670Pan2, enumC647670Pan3};
        LL = enumC647670PanArr;
        LLILLJJLI = new C2254308sP(enumC647670PanArr);
    }

    public static EnumC647670Pan[] values() {
        return (EnumC647670Pan[]) LL.clone();
    }

    public static EnumC647670Pan valueOf(String str) {
        return (EnumC647670Pan) C08FF.LIZ(EnumC647670Pan.class, str);
    }

    public EnumC647670Pan(String str, int i) {
    }
}

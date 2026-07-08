package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ja2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class EnumC1286400ja2 {
    public static final EnumC1286400ja2 HORIZONTAL;
    public static final /* synthetic */ EnumC1286400ja2[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1286400ja2 VERTICAL;

    public static InterfaceC2044707zh<EnumC1286400ja2> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1286400ja2 enumC1286400ja2 = new EnumC1286400ja2("VERTICAL", 0);
        VERTICAL = enumC1286400ja2;
        EnumC1286400ja2 enumC1286400ja22 = new EnumC1286400ja2("HORIZONTAL", 1);
        HORIZONTAL = enumC1286400ja22;
        EnumC1286400ja2[] enumC1286400ja2Arr = {enumC1286400ja2, enumC1286400ja22};
        LL = enumC1286400ja2Arr;
        LLILLJJLI = new C2254308sP(enumC1286400ja2Arr);
    }

    public static EnumC1286400ja2[] values() {
        return (EnumC1286400ja2[]) LL.clone();
    }

    public static EnumC1286400ja2 valueOf(String str) {
        return (EnumC1286400ja2) C08FF.LIZ(EnumC1286400ja2.class, str);
    }

    public EnumC1286400ja2(String str, int i) {
    }
}

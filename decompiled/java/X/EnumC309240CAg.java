package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0CAg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC309240CAg {
    public static final EnumC309240CAg AB;
    public static final EnumC309240CAg KV;
    public static final /* synthetic */ EnumC309240CAg[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC309240CAg> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC309240CAg enumC309240CAg = new EnumC309240CAg("AB", 0);
        AB = enumC309240CAg;
        EnumC309240CAg enumC309240CAg2 = new EnumC309240CAg("KV", 1);
        KV = enumC309240CAg2;
        EnumC309240CAg[] enumC309240CAgArr = {enumC309240CAg, enumC309240CAg2};
        LL = enumC309240CAgArr;
        LLILLJJLI = new C2254308sP(enumC309240CAgArr);
    }

    public static EnumC309240CAg[] values() {
        return (EnumC309240CAg[]) LL.clone();
    }

    public static EnumC309240CAg valueOf(String str) {
        return (EnumC309240CAg) C08FF.LIZ(EnumC309240CAg.class, str);
    }

    public EnumC309240CAg(String str, int i) {
    }
}

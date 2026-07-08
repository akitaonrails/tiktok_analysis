package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0CFg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC310540CFg {
    public static final EnumC310540CFg GET;
    public static final /* synthetic */ EnumC310540CFg[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC310540CFg POST;

    public static InterfaceC2044707zh<EnumC310540CFg> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC310540CFg enumC310540CFg = new EnumC310540CFg("POST", 0);
        POST = enumC310540CFg;
        EnumC310540CFg enumC310540CFg2 = new EnumC310540CFg("GET", 1);
        GET = enumC310540CFg2;
        EnumC310540CFg[] enumC310540CFgArr = {enumC310540CFg, enumC310540CFg2};
        LL = enumC310540CFgArr;
        LLILLJJLI = new C2254308sP(enumC310540CFgArr);
    }

    public static EnumC310540CFg[] values() {
        return (EnumC310540CFg[]) LL.clone();
    }

    public static EnumC310540CFg valueOf(String str) {
        return (EnumC310540CFg) C08FF.LIZ(EnumC310540CFg.class, str);
    }

    public EnumC310540CFg(String str, int i) {
    }
}

package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0UFg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class EnumC769180UFg {
    public static final EnumC769180UFg HORIZONTAL;
    public static final /* synthetic */ EnumC769180UFg[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC769180UFg VERTICAL;

    public static InterfaceC2044707zh<EnumC769180UFg> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC769180UFg enumC769180UFg = new EnumC769180UFg("VERTICAL", 0);
        VERTICAL = enumC769180UFg;
        EnumC769180UFg enumC769180UFg2 = new EnumC769180UFg("HORIZONTAL", 1);
        HORIZONTAL = enumC769180UFg2;
        EnumC769180UFg[] enumC769180UFgArr = {enumC769180UFg, enumC769180UFg2};
        LL = enumC769180UFgArr;
        LLILLJJLI = new C2254308sP(enumC769180UFgArr);
    }

    public static EnumC769180UFg[] values() {
        return (EnumC769180UFg[]) LL.clone();
    }

    public static EnumC769180UFg valueOf(String str) {
        return (EnumC769180UFg) C08FF.LIZ(EnumC769180UFg.class, str);
    }

    public EnumC769180UFg(String str, int i) {
    }
}

package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.17rz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class EnumC21164117rz {
    public static final EnumC21164117rz Finished;
    public static final /* synthetic */ EnumC21164117rz[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC21164117rz Running;
    public static final EnumC21164117rz Waiting;

    public static InterfaceC2044707zh<EnumC21164117rz> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC21164117rz enumC21164117rz = new EnumC21164117rz("Waiting", 0);
        Waiting = enumC21164117rz;
        EnumC21164117rz enumC21164117rz2 = new EnumC21164117rz("Running", 1);
        Running = enumC21164117rz2;
        EnumC21164117rz enumC21164117rz3 = new EnumC21164117rz("Finished", 2);
        Finished = enumC21164117rz3;
        EnumC21164117rz[] enumC21164117rzArr = {enumC21164117rz, enumC21164117rz2, enumC21164117rz3};
        LL = enumC21164117rzArr;
        LLILLJJLI = new C2254308sP(enumC21164117rzArr);
    }

    public static EnumC21164117rz[] values() {
        return (EnumC21164117rz[]) LL.clone();
    }

    public static EnumC21164117rz valueOf(String str) {
        return (EnumC21164117rz) C08FF.LIZ(EnumC21164117rz.class, str);
    }

    public EnumC21164117rz(String str, int i) {
    }
}

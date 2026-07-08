package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ZQy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC899620ZQy {
    public static final EnumC899620ZQy B2C;
    public static final /* synthetic */ EnumC899620ZQy[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC899620ZQy SMART_REPLY;

    public static InterfaceC2044707zh<EnumC899620ZQy> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC899620ZQy enumC899620ZQy = new EnumC899620ZQy("B2C", 0);
        B2C = enumC899620ZQy;
        EnumC899620ZQy enumC899620ZQy2 = new EnumC899620ZQy("SMART_REPLY", 1);
        SMART_REPLY = enumC899620ZQy2;
        EnumC899620ZQy[] enumC899620ZQyArr = {enumC899620ZQy, enumC899620ZQy2};
        LL = enumC899620ZQyArr;
        LLILLJJLI = new C2254308sP(enumC899620ZQyArr);
    }

    public static EnumC899620ZQy[] values() {
        return (EnumC899620ZQy[]) LL.clone();
    }

    public static EnumC899620ZQy valueOf(String str) {
        return (EnumC899620ZQy) C08FF.LIZ(EnumC899620ZQy.class, str);
    }

    public EnumC899620ZQy(String str, int i) {
    }
}

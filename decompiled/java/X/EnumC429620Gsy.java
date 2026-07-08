package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Gsy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC429620Gsy {
    public static final /* synthetic */ EnumC429620Gsy[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC429620Gsy NEVER_SEND_GIFT;
    public static final EnumC429620Gsy NORMAL;
    public static final EnumC429620Gsy SLEEPING;

    public static InterfaceC2044707zh<EnumC429620Gsy> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC429620Gsy enumC429620Gsy = new EnumC429620Gsy("NEVER_SEND_GIFT", 0);
        NEVER_SEND_GIFT = enumC429620Gsy;
        EnumC429620Gsy enumC429620Gsy2 = new EnumC429620Gsy("SLEEPING", 1);
        SLEEPING = enumC429620Gsy2;
        EnumC429620Gsy enumC429620Gsy3 = new EnumC429620Gsy("NORMAL", 2);
        NORMAL = enumC429620Gsy3;
        EnumC429620Gsy[] enumC429620GsyArr = {enumC429620Gsy, enumC429620Gsy2, enumC429620Gsy3};
        LL = enumC429620GsyArr;
        LLILLJJLI = new C2254308sP(enumC429620GsyArr);
    }

    public static EnumC429620Gsy[] values() {
        return (EnumC429620Gsy[]) LL.clone();
    }

    public static EnumC429620Gsy valueOf(String str) {
        return (EnumC429620Gsy) C08FF.LIZ(EnumC429620Gsy.class, str);
    }

    public EnumC429620Gsy(String str, int i) {
    }
}

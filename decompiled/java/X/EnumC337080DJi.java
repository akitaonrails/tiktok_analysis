package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0DJi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC337080DJi {
    public static final EnumC337080DJi APPLY;
    public static final EnumC337080DJi CANCEL;
    public static final /* synthetic */ EnumC337080DJi[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC337080DJi STOP;

    public static InterfaceC2044707zh<EnumC337080DJi> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC337080DJi enumC337080DJi = new EnumC337080DJi("APPLY", 0);
        APPLY = enumC337080DJi;
        EnumC337080DJi enumC337080DJi2 = new EnumC337080DJi("CANCEL", 1);
        CANCEL = enumC337080DJi2;
        EnumC337080DJi enumC337080DJi3 = new EnumC337080DJi("STOP", 2);
        STOP = enumC337080DJi3;
        EnumC337080DJi[] enumC337080DJiArr = {enumC337080DJi, enumC337080DJi2, enumC337080DJi3};
        LL = enumC337080DJiArr;
        LLILLJJLI = new C2254308sP(enumC337080DJiArr);
    }

    public static EnumC337080DJi[] values() {
        return (EnumC337080DJi[]) LL.clone();
    }

    public static EnumC337080DJi valueOf(String str) {
        return (EnumC337080DJi) C08FF.LIZ(EnumC337080DJi.class, str);
    }

    public EnumC337080DJi(String str, int i) {
    }
}

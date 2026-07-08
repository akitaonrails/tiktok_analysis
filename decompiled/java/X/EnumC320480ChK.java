package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ChK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC320480ChK {
    public static final EnumC320480ChK LAST;
    public static final /* synthetic */ EnumC320480ChK[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC320480ChK NEW;

    public static InterfaceC2044707zh<EnumC320480ChK> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC320480ChK enumC320480ChK = new EnumC320480ChK("NEW", 0);
        NEW = enumC320480ChK;
        EnumC320480ChK enumC320480ChK2 = new EnumC320480ChK("LAST", 1);
        LAST = enumC320480ChK2;
        EnumC320480ChK[] enumC320480ChKArr = {enumC320480ChK, enumC320480ChK2};
        LL = enumC320480ChKArr;
        LLILLJJLI = new C2254308sP(enumC320480ChKArr);
    }

    public static EnumC320480ChK[] values() {
        return (EnumC320480ChK[]) LL.clone();
    }

    public static EnumC320480ChK valueOf(String str) {
        return (EnumC320480ChK) C08FF.LIZ(EnumC320480ChK.class, str);
    }

    public EnumC320480ChK(String str, int i) {
    }
}

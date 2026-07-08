package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Je9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class EnumC496870Je9 {
    public static final EnumC496870Je9 ACTIVE;
    public static final EnumC496870Je9 DISCONNECTED;
    public static final EnumC496870Je9 GONE;
    public static final EnumC496870Je9 GRAYED;
    public static final /* synthetic */ EnumC496870Je9[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC496870Je9> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC496870Je9 enumC496870Je9 = new EnumC496870Je9("GONE", 0);
        GONE = enumC496870Je9;
        EnumC496870Je9 enumC496870Je92 = new EnumC496870Je9("GRAYED", 1);
        GRAYED = enumC496870Je92;
        EnumC496870Je9 enumC496870Je93 = new EnumC496870Je9("ACTIVE", 2);
        ACTIVE = enumC496870Je93;
        EnumC496870Je9 enumC496870Je94 = new EnumC496870Je9("DISCONNECTED", 3);
        DISCONNECTED = enumC496870Je94;
        EnumC496870Je9[] enumC496870Je9Arr = {enumC496870Je9, enumC496870Je92, enumC496870Je93, enumC496870Je94};
        LL = enumC496870Je9Arr;
        LLILLJJLI = new C2254308sP(enumC496870Je9Arr);
    }

    public static EnumC496870Je9[] values() {
        return (EnumC496870Je9[]) LL.clone();
    }

    public static EnumC496870Je9 valueOf(String str) {
        return (EnumC496870Je9) C08FF.LIZ(EnumC496870Je9.class, str);
    }

    public EnumC496870Je9(String str, int i) {
    }
}

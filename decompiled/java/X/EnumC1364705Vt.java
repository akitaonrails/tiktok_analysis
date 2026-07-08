package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.05Vt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC1364705Vt {
    public static final /* synthetic */ EnumC1364705Vt[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1364705Vt START_LOAD;
    public static final EnumC1364705Vt START_LOAD_WITHOUT_NOTIFY;

    public static InterfaceC2044707zh<EnumC1364705Vt> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1364705Vt enumC1364705Vt = new EnumC1364705Vt("START_LOAD", 0);
        START_LOAD = enumC1364705Vt;
        EnumC1364705Vt enumC1364705Vt2 = new EnumC1364705Vt("START_LOAD_WITHOUT_NOTIFY", 1);
        START_LOAD_WITHOUT_NOTIFY = enumC1364705Vt2;
        EnumC1364705Vt[] enumC1364705VtArr = {enumC1364705Vt, enumC1364705Vt2};
        LL = enumC1364705VtArr;
        LLILLJJLI = new C2254308sP(enumC1364705VtArr);
    }

    public static EnumC1364705Vt[] values() {
        return (EnumC1364705Vt[]) LL.clone();
    }

    public static EnumC1364705Vt valueOf(String str) {
        return (EnumC1364705Vt) C08FF.LIZ(EnumC1364705Vt.class, str);
    }

    public EnumC1364705Vt(String str, int i) {
    }
}

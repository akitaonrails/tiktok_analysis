package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0jcu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class EnumC1288180jcu {
    public static final EnumC1288180jcu CANCEL;
    public static final EnumC1288180jcu FAILED;
    public static final /* synthetic */ EnumC1288180jcu[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1288180jcu SUCCESS;

    public static InterfaceC2044707zh<EnumC1288180jcu> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1288180jcu enumC1288180jcu = new EnumC1288180jcu("SUCCESS", 0);
        SUCCESS = enumC1288180jcu;
        EnumC1288180jcu enumC1288180jcu2 = new EnumC1288180jcu("FAILED", 1);
        FAILED = enumC1288180jcu2;
        EnumC1288180jcu enumC1288180jcu3 = new EnumC1288180jcu("CANCEL", 2);
        CANCEL = enumC1288180jcu3;
        EnumC1288180jcu[] enumC1288180jcuArr = {enumC1288180jcu, enumC1288180jcu2, enumC1288180jcu3};
        LL = enumC1288180jcuArr;
        LLILLJJLI = new C2254308sP(enumC1288180jcuArr);
    }

    public static EnumC1288180jcu[] values() {
        return (EnumC1288180jcu[]) LL.clone();
    }

    public static EnumC1288180jcu valueOf(String str) {
        return (EnumC1288180jcu) C08FF.LIZ(EnumC1288180jcu.class, str);
    }

    public EnumC1288180jcu(String str, int i) {
    }
}

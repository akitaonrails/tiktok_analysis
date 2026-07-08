package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Izq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class EnumC484840Izq {
    public static final EnumC484840Izq FEEDBACK;
    public static final /* synthetic */ EnumC484840Izq[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC484840Izq NULL;
    public static final EnumC484840Izq QUESTION;
    public static final EnumC484840Izq ROUTE;

    public static InterfaceC2044707zh<EnumC484840Izq> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC484840Izq enumC484840Izq = new EnumC484840Izq("NULL", 0);
        NULL = enumC484840Izq;
        EnumC484840Izq enumC484840Izq2 = new EnumC484840Izq("QUESTION", 1);
        QUESTION = enumC484840Izq2;
        EnumC484840Izq enumC484840Izq3 = new EnumC484840Izq("ROUTE", 2);
        ROUTE = enumC484840Izq3;
        EnumC484840Izq enumC484840Izq4 = new EnumC484840Izq("FEEDBACK", 3);
        FEEDBACK = enumC484840Izq4;
        EnumC484840Izq[] enumC484840IzqArr = {enumC484840Izq, enumC484840Izq2, enumC484840Izq3, enumC484840Izq4};
        LL = enumC484840IzqArr;
        LLILLJJLI = new C2254308sP(enumC484840IzqArr);
    }

    public static EnumC484840Izq[] values() {
        return (EnumC484840Izq[]) LL.clone();
    }

    public static EnumC484840Izq valueOf(String str) {
        return (EnumC484840Izq) C08FF.LIZ(EnumC484840Izq.class, str);
    }

    public EnumC484840Izq(String str, int i) {
    }
}

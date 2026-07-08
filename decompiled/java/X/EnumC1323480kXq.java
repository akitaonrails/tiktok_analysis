package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0kXq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class EnumC1323480kXq {
    public static final EnumC1323480kXq Array;
    public static final EnumC1323480kXq Boolean;
    public static final EnumC1323480kXq ByteArray;
    public static final EnumC1323480kXq Int;
    public static final /* synthetic */ EnumC1323480kXq[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1323480kXq Long;
    public static final EnumC1323480kXq Map;
    public static final EnumC1323480kXq Null;
    public static final EnumC1323480kXq Number;
    public static final EnumC1323480kXq String;

    public static InterfaceC2044707zh<EnumC1323480kXq> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1323480kXq enumC1323480kXq = new EnumC1323480kXq("Null", 0);
        Null = enumC1323480kXq;
        EnumC1323480kXq enumC1323480kXq2 = new EnumC1323480kXq("Boolean", 1);
        Boolean = enumC1323480kXq2;
        EnumC1323480kXq enumC1323480kXq3 = new EnumC1323480kXq("Number", 2);
        Number = enumC1323480kXq3;
        EnumC1323480kXq enumC1323480kXq4 = new EnumC1323480kXq("Int", 3);
        Int = enumC1323480kXq4;
        EnumC1323480kXq enumC1323480kXq5 = new EnumC1323480kXq("Long", 4);
        Long = enumC1323480kXq5;
        EnumC1323480kXq enumC1323480kXq6 = new EnumC1323480kXq("String", 5);
        String = enumC1323480kXq6;
        EnumC1323480kXq enumC1323480kXq7 = new EnumC1323480kXq("Map", 6);
        Map = enumC1323480kXq7;
        EnumC1323480kXq enumC1323480kXq8 = new EnumC1323480kXq("Array", 7);
        Array = enumC1323480kXq8;
        EnumC1323480kXq enumC1323480kXq9 = new EnumC1323480kXq("ByteArray", 8);
        ByteArray = enumC1323480kXq9;
        EnumC1323480kXq[] enumC1323480kXqArr = {enumC1323480kXq, enumC1323480kXq2, enumC1323480kXq3, enumC1323480kXq4, enumC1323480kXq5, enumC1323480kXq6, enumC1323480kXq7, enumC1323480kXq8, enumC1323480kXq9};
        LL = enumC1323480kXqArr;
        LLILLJJLI = new C2254308sP(enumC1323480kXqArr);
    }

    public static EnumC1323480kXq[] values() {
        return (EnumC1323480kXq[]) LL.clone();
    }

    public static EnumC1323480kXq valueOf(String str) {
        return (EnumC1323480kXq) C08FF.LIZ(EnumC1323480kXq.class, str);
    }

    public EnumC1323480kXq(String str, int i) {
    }
}

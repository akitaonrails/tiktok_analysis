package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bx2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC993140bx2 {
    public static final EnumC993140bx2 CALL_METHOD;
    public static final /* synthetic */ EnumC993140bx2[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC993140bx2 PUBLISH_EVENT;
    public static final EnumC993140bx2 REGISTER_METHOD;
    public static final EnumC993140bx2 SUBSCRIBE_EVENT;
    public static final EnumC993140bx2 UNREGISTER_METHOD;
    public static final EnumC993140bx2 UNSUBSCRIBE_EVENT;
    public final int LL;

    public static InterfaceC2044707zh<EnumC993140bx2> getEntries() {
        return LLILLL;
    }

    static {
        EnumC993140bx2 enumC993140bx2 = new EnumC993140bx2("PUBLISH_EVENT", 0, 1);
        PUBLISH_EVENT = enumC993140bx2;
        EnumC993140bx2 enumC993140bx22 = new EnumC993140bx2("SUBSCRIBE_EVENT", 1, 2);
        SUBSCRIBE_EVENT = enumC993140bx22;
        EnumC993140bx2 enumC993140bx23 = new EnumC993140bx2("UNSUBSCRIBE_EVENT", 2, 3);
        UNSUBSCRIBE_EVENT = enumC993140bx23;
        EnumC993140bx2 enumC993140bx24 = new EnumC993140bx2("REGISTER_METHOD", 3, 4);
        REGISTER_METHOD = enumC993140bx24;
        EnumC993140bx2 enumC993140bx25 = new EnumC993140bx2("UNREGISTER_METHOD", 4, 5);
        UNREGISTER_METHOD = enumC993140bx25;
        EnumC993140bx2 enumC993140bx26 = new EnumC993140bx2("CALL_METHOD", 5, 6);
        CALL_METHOD = enumC993140bx26;
        EnumC993140bx2[] enumC993140bx2Arr = {enumC993140bx2, enumC993140bx22, enumC993140bx23, enumC993140bx24, enumC993140bx25, enumC993140bx26};
        LLILLJJLI = enumC993140bx2Arr;
        LLILLL = new C2254308sP(enumC993140bx2Arr);
    }

    public static EnumC993140bx2[] values() {
        return (EnumC993140bx2[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC993140bx2 valueOf(String str) {
        return (EnumC993140bx2) C08FF.LIZ(EnumC993140bx2.class, str);
    }

    public EnumC993140bx2(String str, int i, int i2) {
        this.LL = i2;
    }
}

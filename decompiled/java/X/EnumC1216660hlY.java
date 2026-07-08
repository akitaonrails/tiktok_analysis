package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0hlY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1216660hlY {
    public static final EnumC1216660hlY ADDED;
    public static final EnumC1216660hlY CANCELED;
    public static final /* synthetic */ EnumC1216660hlY[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1216660hlY REMOVED;
    public static final EnumC1216660hlY UPDATED;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1216660hlY> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1216660hlY enumC1216660hlY = new EnumC1216660hlY("ADDED", 0, 1);
        ADDED = enumC1216660hlY;
        EnumC1216660hlY enumC1216660hlY2 = new EnumC1216660hlY("UPDATED", 1, 2);
        UPDATED = enumC1216660hlY2;
        EnumC1216660hlY enumC1216660hlY3 = new EnumC1216660hlY("REMOVED", 2, 3);
        REMOVED = enumC1216660hlY3;
        EnumC1216660hlY enumC1216660hlY4 = new EnumC1216660hlY("CANCELED", 3, 4);
        CANCELED = enumC1216660hlY4;
        EnumC1216660hlY[] enumC1216660hlYArr = {enumC1216660hlY, enumC1216660hlY2, enumC1216660hlY3, enumC1216660hlY4};
        LLILLJJLI = enumC1216660hlYArr;
        LLILLL = new C2254308sP(enumC1216660hlYArr);
    }

    public static EnumC1216660hlY[] values() {
        return (EnumC1216660hlY[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1216660hlY valueOf(String str) {
        return (EnumC1216660hlY) C08FF.LIZ(EnumC1216660hlY.class, str);
    }

    public EnumC1216660hlY(String str, int i, int i2) {
        this.LL = i2;
    }
}

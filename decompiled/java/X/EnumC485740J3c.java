package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0J3c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class EnumC485740J3c {
    public static final EnumC485740J3c ASYNC_INFLATER;
    public static final /* synthetic */ EnumC485740J3c[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC485740J3c SYSTEM_LAYOUT_INFLATER;
    public static final EnumC485740J3c ULTIMATE_INFLATER;
    public static final EnumC485740J3c X2C;
    public final int LL;

    public static InterfaceC2044707zh<EnumC485740J3c> getEntries() {
        return LLILLL;
    }

    static {
        EnumC485740J3c enumC485740J3c = new EnumC485740J3c("SYSTEM_LAYOUT_INFLATER", 0, 1);
        SYSTEM_LAYOUT_INFLATER = enumC485740J3c;
        EnumC485740J3c enumC485740J3c2 = new EnumC485740J3c("X2C", 1, 2);
        X2C = enumC485740J3c2;
        EnumC485740J3c enumC485740J3c3 = new EnumC485740J3c("ASYNC_INFLATER", 2, 3);
        ASYNC_INFLATER = enumC485740J3c3;
        EnumC485740J3c enumC485740J3c4 = new EnumC485740J3c("ULTIMATE_INFLATER", 3, 4);
        ULTIMATE_INFLATER = enumC485740J3c4;
        EnumC485740J3c[] enumC485740J3cArr = {enumC485740J3c, enumC485740J3c2, enumC485740J3c3, enumC485740J3c4};
        LLILLJJLI = enumC485740J3cArr;
        LLILLL = new C2254308sP(enumC485740J3cArr);
    }

    public static EnumC485740J3c[] values() {
        return (EnumC485740J3c[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static EnumC485740J3c valueOf(String str) {
        return (EnumC485740J3c) C08FF.LIZ(EnumC485740J3c.class, str);
    }

    public EnumC485740J3c(String str, int i, int i2) {
        this.LL = i2;
    }
}

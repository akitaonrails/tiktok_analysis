package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0cJb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1007130cJb {
    public static final EnumC1007130cJb DATA;
    public static final EnumC1007130cJb FINISHED;
    public static final EnumC1007130cJb FIRST_PAINT;
    public static final /* synthetic */ EnumC1007130cJb[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1007130cJb NONE;
    public static final EnumC1007130cJb PRE_RENDER;
    public static final EnumC1007130cJb RUNTIME;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1007130cJb> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1007130cJb enumC1007130cJb = new EnumC1007130cJb("NONE", 0, 0);
        NONE = enumC1007130cJb;
        EnumC1007130cJb enumC1007130cJb2 = new EnumC1007130cJb("DATA", 1, 20);
        DATA = enumC1007130cJb2;
        EnumC1007130cJb enumC1007130cJb3 = new EnumC1007130cJb("RUNTIME", 2, 40);
        RUNTIME = enumC1007130cJb3;
        EnumC1007130cJb enumC1007130cJb4 = new EnumC1007130cJb("PRE_RENDER", 3, 60);
        PRE_RENDER = enumC1007130cJb4;
        EnumC1007130cJb enumC1007130cJb5 = new EnumC1007130cJb("FIRST_PAINT", 4, 80);
        FIRST_PAINT = enumC1007130cJb5;
        EnumC1007130cJb enumC1007130cJb6 = new EnumC1007130cJb("FINISHED", 5, 100);
        FINISHED = enumC1007130cJb6;
        EnumC1007130cJb[] enumC1007130cJbArr = {enumC1007130cJb, enumC1007130cJb2, enumC1007130cJb3, enumC1007130cJb4, enumC1007130cJb5, enumC1007130cJb6};
        LLILLJJLI = enumC1007130cJbArr;
        LLILLL = new C2254308sP(enumC1007130cJbArr);
    }

    public static EnumC1007130cJb[] values() {
        return (EnumC1007130cJb[]) LLILLJJLI.clone();
    }

    public final int getProgress() {
        return this.LL;
    }

    public static EnumC1007130cJb valueOf(String str) {
        return (EnumC1007130cJb) C08FF.LIZ(EnumC1007130cJb.class, str);
    }

    public EnumC1007130cJb(String str, int i, int i2) {
        this.LL = i2;
    }
}

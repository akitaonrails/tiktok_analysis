package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0gTE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1166860gTE {
    public static final EnumC1166860gTE CAPSULE;
    public static final /* synthetic */ EnumC1166860gTE[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1166860gTE RECTANGLE;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1166860gTE> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1166860gTE enumC1166860gTE = new EnumC1166860gTE("CAPSULE", 0, 16);
        CAPSULE = enumC1166860gTE;
        EnumC1166860gTE enumC1166860gTE2 = new EnumC1166860gTE("RECTANGLE", 1, 5);
        RECTANGLE = enumC1166860gTE2;
        EnumC1166860gTE[] enumC1166860gTEArr = {enumC1166860gTE, enumC1166860gTE2};
        LLILLJJLI = enumC1166860gTEArr;
        LLILLL = new C2254308sP(enumC1166860gTEArr);
    }

    public static EnumC1166860gTE[] values() {
        return (EnumC1166860gTE[]) LLILLJJLI.clone();
    }

    public final int getCornerRadiusDp() {
        return this.LL;
    }

    public static EnumC1166860gTE valueOf(String str) {
        return (EnumC1166860gTE) C08FF.LIZ(EnumC1166860gTE.class, str);
    }

    public EnumC1166860gTE(String str, int i, int i2) {
        this.LL = i2;
    }
}

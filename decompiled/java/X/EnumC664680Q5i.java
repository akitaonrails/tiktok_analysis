package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Q5i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC664680Q5i {
    public static final EnumC664680Q5i CLOSED;
    public static final /* synthetic */ EnumC664680Q5i[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC664680Q5i SHOW;
    public final int LL;

    public static InterfaceC2044707zh<EnumC664680Q5i> getEntries() {
        return LLILLL;
    }

    static {
        EnumC664680Q5i enumC664680Q5i = new EnumC664680Q5i("CLOSED", 0, 0);
        CLOSED = enumC664680Q5i;
        EnumC664680Q5i enumC664680Q5i2 = new EnumC664680Q5i("SHOW", 1, 1);
        SHOW = enumC664680Q5i2;
        EnumC664680Q5i[] enumC664680Q5iArr = {enumC664680Q5i, enumC664680Q5i2};
        LLILLJJLI = enumC664680Q5iArr;
        LLILLL = new C2254308sP(enumC664680Q5iArr);
    }

    public static EnumC664680Q5i[] values() {
        return (EnumC664680Q5i[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC664680Q5i valueOf(String str) {
        return (EnumC664680Q5i) C08FF.LIZ(EnumC664680Q5i.class, str);
    }

    public EnumC664680Q5i(String str, int i, int i2) {
        this.LL = i2;
    }
}

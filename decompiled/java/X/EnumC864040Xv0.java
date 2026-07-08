package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Xv0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC864040Xv0 {
    public static final EnumC864040Xv0 COMPLETE;
    public static final EnumC864040Xv0 EMPTY_BODY;
    public static final /* synthetic */ EnumC864040Xv0[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC864040Xv0 REQUEST_TOO_OLD;
    public final int LL;

    public static InterfaceC2044707zh<EnumC864040Xv0> getEntries() {
        return LLILLL;
    }

    static {
        EnumC864040Xv0 enumC864040Xv0 = new EnumC864040Xv0("COMPLETE", 0, 0);
        COMPLETE = enumC864040Xv0;
        EnumC864040Xv0 enumC864040Xv02 = new EnumC864040Xv0("REQUEST_TOO_OLD", 1, 1);
        REQUEST_TOO_OLD = enumC864040Xv02;
        EnumC864040Xv0 enumC864040Xv03 = new EnumC864040Xv0("EMPTY_BODY", 2, 2);
        EMPTY_BODY = enumC864040Xv03;
        EnumC864040Xv0[] enumC864040Xv0Arr = {enumC864040Xv0, enumC864040Xv02, enumC864040Xv03};
        LLILLJJLI = enumC864040Xv0Arr;
        LLILLL = new C2254308sP(enumC864040Xv0Arr);
    }

    public static EnumC864040Xv0[] values() {
        return (EnumC864040Xv0[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC864040Xv0 valueOf(String str) {
        return (EnumC864040Xv0) C08FF.LIZ(EnumC864040Xv0.class, str);
    }

    public EnumC864040Xv0(String str, int i, int i2) {
        this.LL = i2;
    }
}

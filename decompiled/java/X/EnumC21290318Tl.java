package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.18Tl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class EnumC21290318Tl {
    public static final EnumC21290318Tl CANCELLED;
    public static final EnumC21290318Tl CREATED;
    public static final EnumC21290318Tl FAILED;
    public static final /* synthetic */ EnumC21290318Tl[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC21290318Tl RUNNING;
    public static final EnumC21290318Tl SUCCESS;
    public final int LL;

    public static InterfaceC2044707zh<EnumC21290318Tl> getEntries() {
        return LLILLL;
    }

    static {
        EnumC21290318Tl enumC21290318Tl = new EnumC21290318Tl("CREATED", 0, 0);
        CREATED = enumC21290318Tl;
        EnumC21290318Tl enumC21290318Tl2 = new EnumC21290318Tl("RUNNING", 1, 1);
        RUNNING = enumC21290318Tl2;
        EnumC21290318Tl enumC21290318Tl3 = new EnumC21290318Tl("SUCCESS", 2, 2);
        SUCCESS = enumC21290318Tl3;
        EnumC21290318Tl enumC21290318Tl4 = new EnumC21290318Tl("FAILED", 3, 3);
        FAILED = enumC21290318Tl4;
        EnumC21290318Tl enumC21290318Tl5 = new EnumC21290318Tl("CANCELLED", 4, 4);
        CANCELLED = enumC21290318Tl5;
        EnumC21290318Tl[] enumC21290318TlArr = {enumC21290318Tl, enumC21290318Tl2, enumC21290318Tl3, enumC21290318Tl4, enumC21290318Tl5};
        LLILLJJLI = enumC21290318TlArr;
        LLILLL = new C2254308sP(enumC21290318TlArr);
    }

    public static EnumC21290318Tl[] values() {
        return (EnumC21290318Tl[]) LLILLJJLI.clone();
    }

    public final int getStatus() {
        return this.LL;
    }

    public static EnumC21290318Tl valueOf(String str) {
        return (EnumC21290318Tl) C08FF.LIZ(EnumC21290318Tl.class, str);
    }

    public EnumC21290318Tl(String str, int i, int i2) {
        this.LL = i2;
    }
}

package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0EFr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC361610EFr {
    public static final EnumC361610EFr IN;
    public static final /* synthetic */ EnumC361610EFr[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC361610EFr OUT;
    public final boolean LL;

    public static InterfaceC2044707zh<EnumC361610EFr> getEntries() {
        return LLILLL;
    }

    static {
        EnumC361610EFr enumC361610EFr = new EnumC361610EFr("IN", 0, true);
        IN = enumC361610EFr;
        EnumC361610EFr enumC361610EFr2 = new EnumC361610EFr("OUT", 1, false);
        OUT = enumC361610EFr2;
        EnumC361610EFr[] enumC361610EFrArr = {enumC361610EFr, enumC361610EFr2};
        LLILLJJLI = enumC361610EFrArr;
        LLILLL = new C2254308sP(enumC361610EFrArr);
    }

    public static EnumC361610EFr[] values() {
        return (EnumC361610EFr[]) LLILLJJLI.clone();
    }

    public final boolean isFadeIn() {
        return this.LL;
    }

    public static EnumC361610EFr valueOf(String str) {
        return (EnumC361610EFr) C08FF.LIZ(EnumC361610EFr.class, str);
    }

    public EnumC361610EFr(String str, int i, boolean z) {
        this.LL = z;
    }
}

package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0DLb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC337530DLb {
    public static final C337540DLc Companion;
    public static final EnumC337530DLb FIXED;
    public static final /* synthetic */ EnumC337530DLb[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC337530DLb PARAM_BASED;

    public static InterfaceC2044707zh<EnumC337530DLb> getEntries() {
        return LLILLJJLI;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0DLc] */
    static {
        EnumC337530DLb enumC337530DLb = new EnumC337530DLb("FIXED", 0);
        FIXED = enumC337530DLb;
        EnumC337530DLb enumC337530DLb2 = new EnumC337530DLb("PARAM_BASED", 1);
        PARAM_BASED = enumC337530DLb2;
        EnumC337530DLb[] enumC337530DLbArr = {enumC337530DLb, enumC337530DLb2};
        LL = enumC337530DLbArr;
        LLILLJJLI = new C2254308sP(enumC337530DLbArr);
        Companion = new Object() { // from class: X.0DLc
        };
    }

    public static EnumC337530DLb[] values() {
        return (EnumC337530DLb[]) LL.clone();
    }

    public static EnumC337530DLb valueOf(String str) {
        return (EnumC337530DLb) C08FF.LIZ(EnumC337530DLb.class, str);
    }

    public EnumC337530DLb(String str, int i) {
    }
}

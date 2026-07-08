package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0axr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC955210axr {
    public static final EnumC955210axr CLIENT_DRIVEN;
    public static final /* synthetic */ EnumC955210axr[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC955210axr SERVER_DRIVEN;

    public static InterfaceC2044707zh<EnumC955210axr> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC955210axr enumC955210axr = new EnumC955210axr("CLIENT_DRIVEN", 0);
        CLIENT_DRIVEN = enumC955210axr;
        EnumC955210axr enumC955210axr2 = new EnumC955210axr("SERVER_DRIVEN", 1);
        SERVER_DRIVEN = enumC955210axr2;
        EnumC955210axr[] enumC955210axrArr = {enumC955210axr, enumC955210axr2};
        LL = enumC955210axrArr;
        LLILLJJLI = new C2254308sP(enumC955210axrArr);
    }

    public static EnumC955210axr[] values() {
        return (EnumC955210axr[]) LL.clone();
    }

    public static EnumC955210axr valueOf(String str) {
        return (EnumC955210axr) C08FF.LIZ(EnumC955210axr.class, str);
    }

    public EnumC955210axr(String str, int i) {
    }
}

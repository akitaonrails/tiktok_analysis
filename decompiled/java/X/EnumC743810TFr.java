package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0TFr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class EnumC743810TFr {
    public static final EnumC743810TFr CANCEL;
    public static final /* synthetic */ EnumC743810TFr[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC743810TFr SAVE;

    public static InterfaceC2044707zh<EnumC743810TFr> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC743810TFr enumC743810TFr = new EnumC743810TFr("SAVE", 0);
        SAVE = enumC743810TFr;
        EnumC743810TFr enumC743810TFr2 = new EnumC743810TFr("CANCEL", 1);
        CANCEL = enumC743810TFr2;
        EnumC743810TFr[] enumC743810TFrArr = {enumC743810TFr, enumC743810TFr2};
        LL = enumC743810TFrArr;
        LLILLJJLI = new C2254308sP(enumC743810TFrArr);
    }

    public static EnumC743810TFr[] values() {
        return (EnumC743810TFr[]) LL.clone();
    }

    public static EnumC743810TFr valueOf(String str) {
        return (EnumC743810TFr) C08FF.LIZ(EnumC743810TFr.class, str);
    }

    public EnumC743810TFr(String str, int i) {
    }
}

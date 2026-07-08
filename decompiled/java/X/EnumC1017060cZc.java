package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0cZc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1017060cZc {
    public static final EnumC1017060cZc LEFT;
    public static final /* synthetic */ EnumC1017060cZc[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1017060cZc RIGHT;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1017060cZc> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1017060cZc enumC1017060cZc = new EnumC1017060cZc("LEFT", 0, "left");
        LEFT = enumC1017060cZc;
        EnumC1017060cZc enumC1017060cZc2 = new EnumC1017060cZc("RIGHT", 1, "right");
        RIGHT = enumC1017060cZc2;
        EnumC1017060cZc[] enumC1017060cZcArr = {enumC1017060cZc, enumC1017060cZc2};
        LLILLJJLI = enumC1017060cZcArr;
        LLILLL = new C2254308sP(enumC1017060cZcArr);
    }

    public static EnumC1017060cZc[] values() {
        return (EnumC1017060cZc[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1017060cZc valueOf(String str) {
        return (EnumC1017060cZc) C08FF.LIZ(EnumC1017060cZc.class, str);
    }

    public EnumC1017060cZc(String str, int i, String str2) {
        this.LL = str2;
    }
}

package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.115f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class EnumC194437115f {
    public static final EnumC194437115f CONTINUE;
    public static final /* synthetic */ EnumC194437115f[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC194437115f PAUSE;

    public static InterfaceC2044707zh<EnumC194437115f> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC194437115f enumC194437115f = new EnumC194437115f("PAUSE", 0);
        PAUSE = enumC194437115f;
        EnumC194437115f enumC194437115f2 = new EnumC194437115f("CONTINUE", 1);
        CONTINUE = enumC194437115f2;
        EnumC194437115f[] enumC194437115fArr = {enumC194437115f, enumC194437115f2};
        LL = enumC194437115fArr;
        LLILLJJLI = new C2254308sP(enumC194437115fArr);
    }

    public static EnumC194437115f[] values() {
        return (EnumC194437115f[]) LL.clone();
    }

    public static EnumC194437115f valueOf(String str) {
        return (EnumC194437115f) C08FF.LIZ(EnumC194437115f.class, str);
    }

    public EnumC194437115f(String str, int i) {
    }
}

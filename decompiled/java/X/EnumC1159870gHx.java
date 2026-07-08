package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0gHx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1159870gHx {
    public static final EnumC1159870gHx LL;
    public static final EnumC1159870gHx LLILLJJLI;
    public static final EnumC1159870gHx LLILLL;
    public static final /* synthetic */ EnumC1159870gHx[] LLILZ;

    static {
        EnumC1159870gHx enumC1159870gHx = new EnumC1159870gHx("UNKNOWN", 0);
        LL = enumC1159870gHx;
        EnumC1159870gHx enumC1159870gHx2 = new EnumC1159870gHx("SHOWN", 1);
        LLILLJJLI = enumC1159870gHx2;
        EnumC1159870gHx enumC1159870gHx3 = new EnumC1159870gHx("HIDDEN", 2);
        LLILLL = enumC1159870gHx3;
        EnumC1159870gHx[] enumC1159870gHxArr = {enumC1159870gHx, enumC1159870gHx2, enumC1159870gHx3};
        LLILZ = enumC1159870gHxArr;
        new C2254308sP(enumC1159870gHxArr);
    }

    public static EnumC1159870gHx[] values() {
        return (EnumC1159870gHx[]) LLILZ.clone();
    }

    public static EnumC1159870gHx valueOf(String str) {
        return (EnumC1159870gHx) C08FF.LIZ(EnumC1159870gHx.class, str);
    }

    public EnumC1159870gHx(String str, int i) {
    }
}

package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0sov, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class EnumC1641590sov {
    public static final EnumC1641590sov LLILLJJLI;
    public static final EnumC1641590sov LLILLL;
    public static final /* synthetic */ EnumC1641590sov[] LLILZ;
    public final int LL;

    static {
        EnumC1641590sov enumC1641590sov = new EnumC1641590sov("INSERT", 0, 1);
        LLILLJJLI = enumC1641590sov;
        EnumC1641590sov enumC1641590sov2 = new EnumC1641590sov("REMOVE", 1, 0);
        LLILLL = enumC1641590sov2;
        EnumC1641590sov[] enumC1641590sovArr = {enumC1641590sov, enumC1641590sov2};
        LLILZ = enumC1641590sovArr;
        new C2254308sP(enumC1641590sovArr);
    }

    public static EnumC1641590sov[] values() {
        return (EnumC1641590sov[]) LLILZ.clone();
    }

    public static EnumC1641590sov valueOf(String str) {
        return (EnumC1641590sov) C08FF.LIZ(EnumC1641590sov.class, str);
    }

    public EnumC1641590sov(String str, int i, int i2) {
        this.LL = i2;
    }
}

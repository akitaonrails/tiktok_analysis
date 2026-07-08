package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07qj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC1989107qj {
    public static final /* synthetic */ EnumC1989107qj[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1989107qj PHOTO;
    public static final EnumC1989107qj VIDEO;

    public static InterfaceC2044707zh<EnumC1989107qj> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1989107qj enumC1989107qj = new EnumC1989107qj("PHOTO", 0);
        PHOTO = enumC1989107qj;
        EnumC1989107qj enumC1989107qj2 = new EnumC1989107qj("VIDEO", 1);
        VIDEO = enumC1989107qj2;
        EnumC1989107qj[] enumC1989107qjArr = {enumC1989107qj, enumC1989107qj2};
        LL = enumC1989107qjArr;
        LLILLJJLI = new C2254308sP(enumC1989107qjArr);
    }

    public static EnumC1989107qj[] values() {
        return (EnumC1989107qj[]) LL.clone();
    }

    public static EnumC1989107qj valueOf(String str) {
        return (EnumC1989107qj) C08FF.LIZ(EnumC1989107qj.class, str);
    }

    public EnumC1989107qj(String str, int i) {
    }
}

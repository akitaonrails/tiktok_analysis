package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0tVd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class EnumC1668070tVd {
    public static final EnumC1668070tVd Center;
    public static final /* synthetic */ EnumC1668070tVd[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1668070tVd Start;

    public static InterfaceC2044707zh<EnumC1668070tVd> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1668070tVd enumC1668070tVd = new EnumC1668070tVd("Center", 0);
        Center = enumC1668070tVd;
        EnumC1668070tVd enumC1668070tVd2 = new EnumC1668070tVd("Start", 1);
        Start = enumC1668070tVd2;
        EnumC1668070tVd[] enumC1668070tVdArr = {enumC1668070tVd, enumC1668070tVd2};
        LL = enumC1668070tVdArr;
        LLILLJJLI = new C2254308sP(enumC1668070tVdArr);
    }

    public static EnumC1668070tVd[] values() {
        return (EnumC1668070tVd[]) LL.clone();
    }

    public static EnumC1668070tVd valueOf(String str) {
        return (EnumC1668070tVd) C08FF.LIZ(EnumC1668070tVd.class, str);
    }

    public EnumC1668070tVd(String str, int i) {
    }
}

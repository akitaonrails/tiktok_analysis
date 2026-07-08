package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ZLd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC898110ZLd {
    public static final EnumC898110ZLd Copy;
    public static final EnumC898110ZLd Delete;
    public static final EnumC898110ZLd Drag;
    public static final EnumC898110ZLd Edit;
    public static final /* synthetic */ EnumC898110ZLd[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC898110ZLd Mirror;

    public static InterfaceC2044707zh<EnumC898110ZLd> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC898110ZLd enumC898110ZLd = new EnumC898110ZLd("Delete", 0);
        Delete = enumC898110ZLd;
        EnumC898110ZLd enumC898110ZLd2 = new EnumC898110ZLd("Edit", 1);
        Edit = enumC898110ZLd2;
        EnumC898110ZLd enumC898110ZLd3 = new EnumC898110ZLd("Mirror", 2);
        Mirror = enumC898110ZLd3;
        EnumC898110ZLd enumC898110ZLd4 = new EnumC898110ZLd("Drag", 3);
        Drag = enumC898110ZLd4;
        EnumC898110ZLd enumC898110ZLd5 = new EnumC898110ZLd("Copy", 4);
        Copy = enumC898110ZLd5;
        EnumC898110ZLd[] enumC898110ZLdArr = {enumC898110ZLd, enumC898110ZLd2, enumC898110ZLd3, enumC898110ZLd4, enumC898110ZLd5};
        LL = enumC898110ZLdArr;
        LLILLJJLI = new C2254308sP(enumC898110ZLdArr);
    }

    public static EnumC898110ZLd[] values() {
        return (EnumC898110ZLd[]) LL.clone();
    }

    public static EnumC898110ZLd valueOf(String str) {
        return (EnumC898110ZLd) C08FF.LIZ(EnumC898110ZLd.class, str);
    }

    public EnumC898110ZLd(String str, int i) {
    }
}

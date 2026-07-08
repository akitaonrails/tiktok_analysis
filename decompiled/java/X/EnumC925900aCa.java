package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0aCa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC925900aCa {
    public static final EnumC925900aCa LEGACY_AUTO_PERMIT;
    public static final EnumC925900aCa LEGACY_OUT_ROOM;
    public static final /* synthetic */ EnumC925900aCa[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC925900aCa NEW_AUTO_PERMIT;
    public static final EnumC925900aCa NEW_OUT_ROOM;

    public static InterfaceC2044707zh<EnumC925900aCa> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC925900aCa enumC925900aCa = new EnumC925900aCa("LEGACY_OUT_ROOM", 0);
        LEGACY_OUT_ROOM = enumC925900aCa;
        EnumC925900aCa enumC925900aCa2 = new EnumC925900aCa("NEW_OUT_ROOM", 1);
        NEW_OUT_ROOM = enumC925900aCa2;
        EnumC925900aCa enumC925900aCa3 = new EnumC925900aCa("LEGACY_AUTO_PERMIT", 2);
        LEGACY_AUTO_PERMIT = enumC925900aCa3;
        EnumC925900aCa enumC925900aCa4 = new EnumC925900aCa("NEW_AUTO_PERMIT", 3);
        NEW_AUTO_PERMIT = enumC925900aCa4;
        EnumC925900aCa[] enumC925900aCaArr = {enumC925900aCa, enumC925900aCa2, enumC925900aCa3, enumC925900aCa4};
        LL = enumC925900aCaArr;
        LLILLJJLI = new C2254308sP(enumC925900aCaArr);
    }

    public static EnumC925900aCa[] values() {
        return (EnumC925900aCa[]) LL.clone();
    }

    public static EnumC925900aCa valueOf(String str) {
        return (EnumC925900aCa) C08FF.LIZ(EnumC925900aCa.class, str);
    }

    public EnumC925900aCa(String str, int i) {
    }
}

package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0CgC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC319780CgC {
    public static final EnumC319780CgC IDLE;
    public static final /* synthetic */ EnumC319780CgC[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC319780CgC SAVING;

    public static InterfaceC2044707zh<EnumC319780CgC> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC319780CgC enumC319780CgC = new EnumC319780CgC("IDLE", 0);
        IDLE = enumC319780CgC;
        EnumC319780CgC enumC319780CgC2 = new EnumC319780CgC("SAVING", 1);
        SAVING = enumC319780CgC2;
        EnumC319780CgC[] enumC319780CgCArr = {enumC319780CgC, enumC319780CgC2};
        LL = enumC319780CgCArr;
        LLILLJJLI = new C2254308sP(enumC319780CgCArr);
    }

    public static EnumC319780CgC[] values() {
        return (EnumC319780CgC[]) LL.clone();
    }

    public static EnumC319780CgC valueOf(String str) {
        return (EnumC319780CgC) C08FF.LIZ(EnumC319780CgC.class, str);
    }

    public EnumC319780CgC(String str, int i) {
    }
}

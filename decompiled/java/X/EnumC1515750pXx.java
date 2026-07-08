package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0pXx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class EnumC1515750pXx {
    public static final EnumC1515750pXx FAST_CHUNK;
    public static final /* synthetic */ EnumC1515750pXx[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1515750pXx NORMAL;

    public static InterfaceC2044707zh<EnumC1515750pXx> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1515750pXx enumC1515750pXx = new EnumC1515750pXx("NORMAL", 0);
        NORMAL = enumC1515750pXx;
        EnumC1515750pXx enumC1515750pXx2 = new EnumC1515750pXx("FAST_CHUNK", 1);
        FAST_CHUNK = enumC1515750pXx2;
        EnumC1515750pXx[] enumC1515750pXxArr = {enumC1515750pXx, enumC1515750pXx2};
        LL = enumC1515750pXxArr;
        LLILLJJLI = new C2254308sP(enumC1515750pXxArr);
    }

    public static EnumC1515750pXx[] values() {
        return (EnumC1515750pXx[]) LL.clone();
    }

    public static EnumC1515750pXx valueOf(String str) {
        return (EnumC1515750pXx) C08FF.LIZ(EnumC1515750pXx.class, str);
    }

    public EnumC1515750pXx(String str, int i) {
    }
}

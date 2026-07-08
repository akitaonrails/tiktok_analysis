package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0PNn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC643930PNn {
    public static final EnumC643930PNn ALL_VIDEO_CHUNKS;
    public static final EnumC643930PNn FIRST_VIDEO_CHUNK;
    public static final /* synthetic */ EnumC643930PNn[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC643930PNn OFF;

    public static InterfaceC2044707zh<EnumC643930PNn> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC643930PNn enumC643930PNn = new EnumC643930PNn("OFF", 0);
        OFF = enumC643930PNn;
        EnumC643930PNn enumC643930PNn2 = new EnumC643930PNn("FIRST_VIDEO_CHUNK", 1);
        FIRST_VIDEO_CHUNK = enumC643930PNn2;
        EnumC643930PNn enumC643930PNn3 = new EnumC643930PNn("ALL_VIDEO_CHUNKS", 2);
        ALL_VIDEO_CHUNKS = enumC643930PNn3;
        EnumC643930PNn[] enumC643930PNnArr = {enumC643930PNn, enumC643930PNn2, enumC643930PNn3};
        LL = enumC643930PNnArr;
        LLILLJJLI = new C2254308sP(enumC643930PNnArr);
    }

    public static EnumC643930PNn[] values() {
        return (EnumC643930PNn[]) LL.clone();
    }

    public static EnumC643930PNn valueOf(String str) {
        return (EnumC643930PNn) C08FF.LIZ(EnumC643930PNn.class, str);
    }

    public EnumC643930PNn(String str, int i) {
    }
}

package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0sop, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class EnumC1641530sop implements InterfaceC1623140sLA {
    public static final EnumC1641530sop DISTURBING;
    public static final EnumC1641530sop GAME;
    public static final /* synthetic */ EnumC1641530sop[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1641530sop PHOTOSENSITIVE;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1641530sop> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1641530sop enumC1641530sop = new EnumC1641530sop("PHOTOSENSITIVE", 0, 1);
        PHOTOSENSITIVE = enumC1641530sop;
        EnumC1641530sop enumC1641530sop2 = new EnumC1641530sop("DISTURBING", 1, 0);
        DISTURBING = enumC1641530sop2;
        EnumC1641530sop enumC1641530sop3 = new EnumC1641530sop("GAME", 2, 0);
        GAME = enumC1641530sop3;
        EnumC1641530sop[] enumC1641530sopArr = {enumC1641530sop, enumC1641530sop2, enumC1641530sop3};
        LLILLJJLI = enumC1641530sopArr;
        LLILLL = new C2254308sP(enumC1641530sopArr);
    }

    public static EnumC1641530sop[] values() {
        return (EnumC1641530sop[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static EnumC1641530sop valueOf(String str) {
        return (EnumC1641530sop) C08FF.LIZ(EnumC1641530sop.class, str);
    }

    public EnumC1641530sop(String str, int i, int i2) {
        this.LL = i2;
    }
}

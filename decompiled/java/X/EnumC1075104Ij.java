package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.04Ij, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC1075104Ij {
    public static final /* synthetic */ EnumC1075104Ij[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1075104Ij TOKO;
    public static final EnumC1075104Ij TTS;
    public static final EnumC1075104Ij YOTPO;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1075104Ij> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1075104Ij enumC1075104Ij = new EnumC1075104Ij("TTS", 0, 0);
        TTS = enumC1075104Ij;
        EnumC1075104Ij enumC1075104Ij2 = new EnumC1075104Ij("YOTPO", 1, 1);
        YOTPO = enumC1075104Ij2;
        EnumC1075104Ij enumC1075104Ij3 = new EnumC1075104Ij("TOKO", 2, 2);
        TOKO = enumC1075104Ij3;
        EnumC1075104Ij[] enumC1075104IjArr = {enumC1075104Ij, enumC1075104Ij2, enumC1075104Ij3};
        LLILLJJLI = enumC1075104IjArr;
        LLILLL = new C2254308sP(enumC1075104IjArr);
    }

    public static EnumC1075104Ij[] values() {
        return (EnumC1075104Ij[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static EnumC1075104Ij valueOf(String str) {
        return (EnumC1075104Ij) C08FF.LIZ(EnumC1075104Ij.class, str);
    }

    public EnumC1075104Ij(String str, int i, int i2) {
        this.LL = i2;
    }
}

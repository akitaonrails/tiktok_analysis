package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0acy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC942260acy {
    public static final C942250acx Companion;
    public static final EnumC942260acy IDLE;
    public static final EnumC942260acy JOINED;
    public static final /* synthetic */ EnumC942260acy[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC942260acy NONE;
    public static final EnumC942260acy READY;
    public final int LL;

    public static InterfaceC2044707zh<EnumC942260acy> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.0acx] */
    static {
        EnumC942260acy enumC942260acy = new EnumC942260acy("NONE", 0, -1);
        NONE = enumC942260acy;
        EnumC942260acy enumC942260acy2 = new EnumC942260acy("IDLE", 1, 0);
        IDLE = enumC942260acy2;
        EnumC942260acy enumC942260acy3 = new EnumC942260acy("JOINED", 2, 1);
        JOINED = enumC942260acy3;
        EnumC942260acy enumC942260acy4 = new EnumC942260acy("READY", 3, 2);
        READY = enumC942260acy4;
        EnumC942260acy[] enumC942260acyArr = {enumC942260acy, enumC942260acy2, enumC942260acy3, enumC942260acy4};
        LLILLJJLI = enumC942260acyArr;
        LLILLL = new C2254308sP(enumC942260acyArr);
        Companion = new Object() { // from class: X.0acx
        };
    }

    public static EnumC942260acy[] values() {
        return (EnumC942260acy[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC942260acy valueOf(String str) {
        return (EnumC942260acy) C08FF.LIZ(EnumC942260acy.class, str);
    }

    public EnumC942260acy(String str, int i, int i2) {
        this.LL = i2;
    }
}

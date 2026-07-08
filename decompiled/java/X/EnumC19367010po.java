package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.10po, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class EnumC19367010po {
    public static final /* synthetic */ EnumC19367010po[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC19367010po PLAY_COMPLETE;
    public static final EnumC19367010po RESUME;
    public final int LL;

    public static InterfaceC2044707zh<EnumC19367010po> getEntries() {
        return LLILLL;
    }

    static {
        EnumC19367010po enumC19367010po = new EnumC19367010po("RESUME", 0, 0);
        RESUME = enumC19367010po;
        EnumC19367010po enumC19367010po2 = new EnumC19367010po("PLAY_COMPLETE", 1, 1);
        PLAY_COMPLETE = enumC19367010po2;
        EnumC19367010po[] enumC19367010poArr = {enumC19367010po, enumC19367010po2};
        LLILLJJLI = enumC19367010poArr;
        LLILLL = new C2254308sP(enumC19367010poArr);
    }

    public static EnumC19367010po[] values() {
        return (EnumC19367010po[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC19367010po valueOf(String str) {
        return (EnumC19367010po) C08FF.LIZ(EnumC19367010po.class, str);
    }

    public EnumC19367010po(String str, int i, int i2) {
        this.LL = i2;
    }
}

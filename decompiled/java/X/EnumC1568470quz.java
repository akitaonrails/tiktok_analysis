package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0quz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class EnumC1568470quz {
    public static final EnumC1568470quz CHUNK_COMPLETE;
    public static final EnumC1568470quz CHUNK_INIT;
    public static final EnumC1568470quz CHUNK_PROCESSING;
    public static final EnumC1568470quz COMPLETE;
    public static final EnumC1568470quz INIT;
    public static final /* synthetic */ EnumC1568470quz[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1568470quz> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1568470quz enumC1568470quz = new EnumC1568470quz("INIT", 0);
        INIT = enumC1568470quz;
        EnumC1568470quz enumC1568470quz2 = new EnumC1568470quz("CHUNK_INIT", 1);
        CHUNK_INIT = enumC1568470quz2;
        EnumC1568470quz enumC1568470quz3 = new EnumC1568470quz("CHUNK_PROCESSING", 2);
        CHUNK_PROCESSING = enumC1568470quz3;
        EnumC1568470quz enumC1568470quz4 = new EnumC1568470quz("CHUNK_COMPLETE", 3);
        CHUNK_COMPLETE = enumC1568470quz4;
        EnumC1568470quz enumC1568470quz5 = new EnumC1568470quz("COMPLETE", 4);
        COMPLETE = enumC1568470quz5;
        EnumC1568470quz[] enumC1568470quzArr = {enumC1568470quz, enumC1568470quz2, enumC1568470quz3, enumC1568470quz4, enumC1568470quz5};
        LL = enumC1568470quzArr;
        LLILLJJLI = new C2254308sP(enumC1568470quzArr);
    }

    public static EnumC1568470quz[] values() {
        return (EnumC1568470quz[]) LL.clone();
    }

    public static EnumC1568470quz valueOf(String str) {
        return (EnumC1568470quz) C08FF.LIZ(EnumC1568470quz.class, str);
    }

    public EnumC1568470quz(String str, int i) {
    }
}

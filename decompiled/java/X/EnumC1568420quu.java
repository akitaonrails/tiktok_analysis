package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0quu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class EnumC1568420quu {
    public static final EnumC1568420quu CHUNK_COMPLETE;
    public static final EnumC1568420quu CHUNK_INIT;
    public static final EnumC1568420quu CHUNK_PROCESSING;
    public static final EnumC1568420quu CHUNK_PROCESSING_LIGHT_WEIGHT;
    public static final EnumC1568420quu COMPLETE;
    public static final EnumC1568420quu INIT;
    public static final /* synthetic */ EnumC1568420quu[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1568420quu> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1568420quu enumC1568420quu = new EnumC1568420quu("INIT", 0);
        INIT = enumC1568420quu;
        EnumC1568420quu enumC1568420quu2 = new EnumC1568420quu("CHUNK_INIT", 1);
        CHUNK_INIT = enumC1568420quu2;
        EnumC1568420quu enumC1568420quu3 = new EnumC1568420quu("CHUNK_PROCESSING", 2);
        CHUNK_PROCESSING = enumC1568420quu3;
        EnumC1568420quu enumC1568420quu4 = new EnumC1568420quu("CHUNK_PROCESSING_LIGHT_WEIGHT", 3);
        CHUNK_PROCESSING_LIGHT_WEIGHT = enumC1568420quu4;
        EnumC1568420quu enumC1568420quu5 = new EnumC1568420quu("CHUNK_COMPLETE", 4);
        CHUNK_COMPLETE = enumC1568420quu5;
        EnumC1568420quu enumC1568420quu6 = new EnumC1568420quu("COMPLETE", 5);
        COMPLETE = enumC1568420quu6;
        EnumC1568420quu[] enumC1568420quuArr = {enumC1568420quu, enumC1568420quu2, enumC1568420quu3, enumC1568420quu4, enumC1568420quu5, enumC1568420quu6};
        LL = enumC1568420quuArr;
        LLILLJJLI = new C2254308sP(enumC1568420quuArr);
    }

    public static EnumC1568420quu[] values() {
        return (EnumC1568420quu[]) LL.clone();
    }

    public static EnumC1568420quu valueOf(String str) {
        return (EnumC1568420quu) C08FF.LIZ(EnumC1568420quu.class, str);
    }

    public EnumC1568420quu(String str, int i) {
    }
}

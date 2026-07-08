package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0LRg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class EnumC542980LRg {
    public static final EnumC542980LRg IDLE;
    public static final EnumC542980LRg IN_PROCESSING;
    public static final /* synthetic */ EnumC542980LRg[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC542980LRg POST_PROCESSING;
    public static final EnumC542980LRg PRE_PROCESSING;

    public static InterfaceC2044707zh<EnumC542980LRg> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC542980LRg enumC542980LRg = new EnumC542980LRg("IDLE", 0);
        IDLE = enumC542980LRg;
        EnumC542980LRg enumC542980LRg2 = new EnumC542980LRg("PRE_PROCESSING", 1);
        PRE_PROCESSING = enumC542980LRg2;
        EnumC542980LRg enumC542980LRg3 = new EnumC542980LRg("IN_PROCESSING", 2);
        IN_PROCESSING = enumC542980LRg3;
        EnumC542980LRg enumC542980LRg4 = new EnumC542980LRg("POST_PROCESSING", 3);
        POST_PROCESSING = enumC542980LRg4;
        EnumC542980LRg[] enumC542980LRgArr = {enumC542980LRg, enumC542980LRg2, enumC542980LRg3, enumC542980LRg4};
        LL = enumC542980LRgArr;
        LLILLJJLI = new C2254308sP(enumC542980LRgArr);
    }

    public static EnumC542980LRg[] values() {
        return (EnumC542980LRg[]) LL.clone();
    }

    public static EnumC542980LRg valueOf(String str) {
        return (EnumC542980LRg) C08FF.LIZ(EnumC542980LRg.class, str);
    }

    public EnumC542980LRg(String str, int i) {
    }
}

package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.19vs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class EnumC21697819vs {
    public static final EnumC21697819vs FINISHED;
    public static final /* synthetic */ EnumC21697819vs[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC21697819vs NORMAL;
    public static final EnumC21697819vs PAUSED;

    public static InterfaceC2044707zh<EnumC21697819vs> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC21697819vs enumC21697819vs = new EnumC21697819vs("NORMAL", 0);
        NORMAL = enumC21697819vs;
        EnumC21697819vs enumC21697819vs2 = new EnumC21697819vs("PAUSED", 1);
        PAUSED = enumC21697819vs2;
        EnumC21697819vs enumC21697819vs3 = new EnumC21697819vs("FINISHED", 2);
        FINISHED = enumC21697819vs3;
        EnumC21697819vs[] enumC21697819vsArr = {enumC21697819vs, enumC21697819vs2, enumC21697819vs3};
        LL = enumC21697819vsArr;
        LLILLJJLI = new C2254308sP(enumC21697819vsArr);
    }

    public static EnumC21697819vs[] values() {
        return (EnumC21697819vs[]) LL.clone();
    }

    public static EnumC21697819vs valueOf(String str) {
        return (EnumC21697819vs) C08FF.LIZ(EnumC21697819vs.class, str);
    }

    public EnumC21697819vs(String str, int i) {
    }
}

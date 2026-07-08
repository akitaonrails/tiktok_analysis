package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.1AbJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class EnumC2182511AbJ {
    public static final C2182531AbL Companion;
    public static final /* synthetic */ EnumC2182511AbJ[] LL;
    public static final EnumC2182511AbJ PullStream;

    public static EnumC2182511AbJ valueOf(String str) {
        return (EnumC2182511AbJ) C08FF.LIZ(EnumC2182511AbJ.class, str);
    }

    public static EnumC2182511AbJ[] values() {
        return (EnumC2182511AbJ[]) LL.clone();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.1AbL] */
    static {
        EnumC2182511AbJ enumC2182511AbJ = new EnumC2182511AbJ();
        PullStream = enumC2182511AbJ;
        LL = new EnumC2182511AbJ[]{enumC2182511AbJ};
        Companion = new Object() { // from class: X.1AbL
        };
    }

    public final EnumC2183431Acn into() {
        if (C2182521AbK.LIZ[ordinal()] == 1) {
            return EnumC2183431Acn.VAR_LINK_MIC_LAYOUT_QOS_MONITOR_KEY_PULL_STREAM;
        }
        throw new C1954807lC();
    }

    public final int intoInt() {
        if (C2182521AbK.LIZ[ordinal()] == 1) {
            return 0;
        }
        throw new C1954807lC();
    }
}

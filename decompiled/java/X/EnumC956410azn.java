package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0azn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC956410azn {
    public static final EnumC956410azn FORWARD_STREAM_FAILED;
    public static final /* synthetic */ EnumC956410azn[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC956410azn NORMAL;
    public static final EnumC956410azn PAUSE;
    public static final EnumC956410azn PULLING_STREAM;
    public static final EnumC956410azn RECONNECTING;
    public int LL;

    public static InterfaceC2044707zh<EnumC956410azn> getEntries() {
        return LLILLL;
    }

    static {
        EnumC956410azn enumC956410azn = new EnumC956410azn("PULLING_STREAM", 0, 0);
        PULLING_STREAM = enumC956410azn;
        EnumC956410azn enumC956410azn2 = new EnumC956410azn("NORMAL", 1, 1);
        NORMAL = enumC956410azn2;
        EnumC956410azn enumC956410azn3 = new EnumC956410azn("FORWARD_STREAM_FAILED", 2, 2);
        FORWARD_STREAM_FAILED = enumC956410azn3;
        EnumC956410azn enumC956410azn4 = new EnumC956410azn("RECONNECTING", 3, 3);
        RECONNECTING = enumC956410azn4;
        EnumC956410azn enumC956410azn5 = new EnumC956410azn("PAUSE", 4, 4);
        PAUSE = enumC956410azn5;
        EnumC956410azn[] enumC956410aznArr = {enumC956410azn, enumC956410azn2, enumC956410azn3, enumC956410azn4, enumC956410azn5};
        LLILLJJLI = enumC956410aznArr;
        LLILLL = new C2254308sP(enumC956410aznArr);
    }

    public static EnumC956410azn[] values() {
        return (EnumC956410azn[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static EnumC956410azn valueOf(String str) {
        return (EnumC956410azn) C08FF.LIZ(EnumC956410azn.class, str);
    }

    public final void setType(int i) {
        this.LL = i;
    }

    public EnumC956410azn(String str, int i, int i2) {
        this.LL = i2;
    }
}

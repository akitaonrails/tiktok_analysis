package X;

/* JADX INFO: renamed from: X.0jPo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public enum EnumC1280060jPo {
    Verbose(2),
    Debug(3),
    Info(4),
    Warn(5),
    Error(6),
    None(8);

    public final int LL;

    public static EnumC1280060jPo valueOf(String str) {
        return (EnumC1280060jPo) C08FF.LIZ(EnumC1280060jPo.class, str);
    }

    public final int getLevel() {
        return this.LL;
    }

    EnumC1280060jPo(int i) {
        this.LL = i;
    }
}

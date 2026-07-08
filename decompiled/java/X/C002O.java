package X;

/* JADX INFO: renamed from: X.002O, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public enum C002O {
    CHANNEL_SELF(1),
    CHANNEL_OK(2);

    public final int LL;

    @Override // java.lang.Enum
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ChannelType{Type=");
        sbLIZ.append(this.LL);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public int getVal() {
        return this.LL;
    }

    public static C002O of(int i) {
        if (i == 1) {
            return CHANNEL_SELF;
        }
        return CHANNEL_OK;
    }

    public static C002O valueOf(String str) {
        return (C002O) C08FF.LIZ(C002O.class, str);
    }

    C002O(int i) {
        this.LL = i;
    }
}

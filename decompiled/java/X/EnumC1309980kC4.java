package X;

/* JADX INFO: renamed from: X.0kC4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public enum EnumC1309980kC4 {
    NORMAL(0),
    PRE_PAINTING(1),
    PRE_PAINTING_DRAW(2),
    RENDER_SSR(3),
    HYDRATE_SSR(4);

    public final int LL;

    public int id() {
        return this.LL;
    }

    public static EnumC1309980kC4 valueOf(String str) {
        return (EnumC1309980kC4) C08FF.LIZ(EnumC1309980kC4.class, str);
    }

    EnumC1309980kC4(int i) {
        this.LL = i;
    }
}

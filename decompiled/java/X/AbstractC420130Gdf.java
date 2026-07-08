package X;

/* JADX INFO: renamed from: X.0Gdf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC420130Gdf extends AbstractC1652980t7I {
    public final Integer LIZ;
    public final C420150Gdh LIZIZ;

    public C420150Gdh LIZ() {
        return this.LIZIZ;
    }

    public AbstractC420130Gdf(Integer num, C420150Gdh c420150Gdh, int i) {
        num = (i & 1) != 0 ? null : num;
        c420150Gdh = (i & 2) != 0 ? null : c420150Gdh;
        this.LIZ = num;
        this.LIZIZ = c420150Gdh;
    }
}

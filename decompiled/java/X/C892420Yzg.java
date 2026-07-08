package X;

/* JADX INFO: renamed from: X.0Yzg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C892420Yzg extends AbstractC624280OeA<C892420Yzg> {
    public long LJI;
    public long LJII;
    public int LJIIIIZZ;
    public String LJIIIZ;
    public boolean LJIIJ;

    public C892420Yzg() {
        super("edit_mode_loading_time");
    }

    @Override // X.AbstractC624280OeA
    public final void LJII() {
        if (this.LJIIJ) {
            return;
        }
        this.LJIIJ = true;
        super.LJII();
    }

    @Override // X.AbstractC624280OeA
    public final void LIZLLL() {
        super.LIZLLL();
        long j = this.LJII;
        if (j > 0) {
            LIZIZ("duration", String.valueOf(j));
        }
        int i = this.LJIIIIZZ;
        if (i >= 0) {
            LIZ(i, "selected_count");
        }
        String str = this.LJIIIZ;
        if (str != null) {
            LIZIZ("action", str);
        }
    }
}

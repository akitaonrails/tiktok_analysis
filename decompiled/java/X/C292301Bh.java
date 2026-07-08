package X;

import com.bytedance.android.live.base.model.ImageModel;

/* JADX INFO: renamed from: X.01Bh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C292301Bh extends AbstractC1126600fQI<C292001Be> {
    public final ImageModel LJJI;
    public final C01GW LJJIFFI;
    public ImageModel LJJII;
    public String LJJIII;
    public long LJJIIJ;
    public boolean LJJIIJZLJL;

    @Override // X.AbstractC1126600fQI
    public final String LIZJ() {
        return "";
    }

    @Override // X.AbstractC1126600fQI
    public final long LJI() {
        long j = this.LJJIIJ;
        return j != -1 ? (j * 31) + ((long) ((C292001Be) this.LIZIZ).LIZ.hashCode()) : ((Number) this.LJJIFFI.getValue()).longValue();
    }

    @Override // X.AbstractC1126600fQI
    public final String LJIIIZ() {
        return ((C292001Be) this.LIZIZ).LIZ;
    }

    @Override // X.AbstractC1126600fQI
    public final ImageModel LJII() {
        return this.LJJI;
    }

    public C292301Bh(C292001Be c292001Be) {
        super(15, c292001Be);
        this.LJJI = new ImageModel();
        this.LJJIFFI = C452501pT.LIZ(EnumC452301pR.NONE, AnonymousClass0206.get$arr$(270));
        this.LJJIII = "";
        this.LJJIIJ = -1L;
    }
}

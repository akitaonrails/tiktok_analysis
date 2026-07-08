package X;

import com.squareup.wire.Message;
import com.ss.android.ugc.aweme.im.common.model.BulletinInfo;

/* JADX INFO: renamed from: X.1DxS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2272681DxS extends Message.Builder<BulletinInfo, C2272681DxS> {
    public Long LIZLLL;
    public String LJ;
    public String LJFF;
    public Long LJI;
    public String LJII;
    public EnumC2236881Cgo LJIIIIZZ;
    public Long LJIIIZ;
    public Long LJIIJ;
    public String LJIIJJI;
    public Long LJIIL;
    public String LJIILIIL;
    public Long LJIILJJIL;
    public EnumC19362310p3 LJIILL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final BulletinInfo build() {
        return new BulletinInfo(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, this.LJIIJJI, this.LJIIL, this.LJIILIIL, this.LJIILJJIL, this.LJIILL, buildUnknownFields());
    }
}

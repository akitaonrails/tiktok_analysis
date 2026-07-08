package X;

import com.squareup.wire.Message;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiManager;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiProducerItem;

/* JADX INFO: renamed from: X.1CiA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2237721CiA extends Message.Builder<CaiProducerItem, C2237721CiA> {
    public String LIZLLL;
    public String LJ;
    public Integer LJFF;
    public Integer LJI;
    public String LJII;
    public Boolean LJIIIIZZ;
    public CaiManager LJIIIZ;
    public Long LJIIJ;
    public Long LJIIJJI;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final CaiProducerItem build() {
        String str = this.LIZLLL;
        if (str != null && this.LJ != null && this.LJFF != null && this.LJI != null && this.LJII != null && this.LJIIIIZZ != null && this.LJIIJ != null && this.LJIIJJI != null) {
            return new CaiProducerItem(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, this.LJIIJJI, buildUnknownFields());
        }
        C1516540pZE.LJII(str, "producer_key", this.LJ, "producer_name", this.LJFF, "source_type", this.LJI, "producer_status", this.LJII, "description", this.LJIIIIZZ, "is_sync", this.LJIIJ, "created_timestamp", this.LJIIJJI, "updated_timestamp");
        throw null;
    }
}

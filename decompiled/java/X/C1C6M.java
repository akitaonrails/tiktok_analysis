package X;

import com.squareup.wire.Message;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiHippoFeature;

/* JADX INFO: renamed from: X.1C6M, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1C6M extends Message.Builder<CaiHippoFeature, C1C6M> {
    public String LIZLLL;
    public String LJ;
    public Integer LJFF;
    public String LJI;
    public Integer LJII;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final CaiHippoFeature build() {
        String str = this.LIZLLL;
        if (str != null && this.LJ != null && this.LJFF != null && this.LJII != null) {
            return new CaiHippoFeature(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, buildUnknownFields());
        }
        C1516540pZE.LJII(str, "feature_key", this.LJ, "group_key", this.LJFF, "platform", this.LJII, "group_id");
        throw null;
    }
}

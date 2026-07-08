package X;

import com.squareup.wire.Message;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiTag;

/* JADX INFO: renamed from: X.1Ci4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2237661Ci4 extends Message.Builder<CaiTag, C2237661Ci4> {
    public String LIZLLL;
    public String LJ;
    public Integer LJFF;
    public String LJI;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final CaiTag build() {
        String str = this.LIZLLL;
        if (str != null && this.LJ != null && this.LJFF != null && this.LJI != null) {
            return new CaiTag(this.LIZLLL, this.LJ, this.LJFF, this.LJI, buildUnknownFields());
        }
        C1516540pZE.LJII(str, "tag_key", this.LJ, "tag_name", this.LJFF, "res_type", this.LJI, "description");
        throw null;
    }
}

package X;

import com.squareup.wire.Message;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiAppVersion;

/* JADX INFO: renamed from: X.1Ci0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2237621Ci0 extends Message.Builder<CaiAppVersion, C2237621Ci0> {
    public Integer LIZLLL;
    public Integer LJ;
    public Integer LJFF;
    public Integer LJI;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final CaiAppVersion build() {
        Integer num = this.LIZLLL;
        if (num != null && this.LJ != null && this.LJFF != null) {
            return new CaiAppVersion(this.LIZLLL, this.LJ, this.LJFF, this.LJI, buildUnknownFields());
        }
        C1516540pZE.LJII(num, "app_id", this.LJ, "platform", this.LJFF, "min_app_version_code");
        throw null;
    }
}

package X;

import com.squareup.wire.Message;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: renamed from: X.1CSR, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CSR extends Message.Builder<C1CSP, C1CSR> {
    public Long LIZLLL;
    public Double LJ;
    public Double LJFF;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1CSP build() {
        Long l = this.LIZLLL;
        if (l != null && this.LJ != null && this.LJFF != null) {
            return new C1CSP(this.LIZLLL, this.LJ, this.LJFF, buildUnknownFields());
        }
        C1516540pZE.LJII(l, FollowStatusChangeMethod.PARAM_UID, this.LJ, "width", this.LJFF, "height");
        throw null;
    }
}

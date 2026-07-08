package X;

import com.squareup.wire.Message;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: renamed from: X.1CQR, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CQR extends Message.Builder<C1CQP, C1CQR> {
    public Long LIZLLL;
    public Long LJ;
    public Long LJFF;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1CQP build() {
        Long l = this.LIZLLL;
        if (l != null && this.LJ != null && this.LJFF != null) {
            return new C1CQP(this.LIZLLL, this.LJ, this.LJFF, buildUnknownFields());
        }
        C1516540pZE.LJII(l, FollowStatusChangeMethod.PARAM_UID, this.LJ, "start_at", this.LJFF, "end_at");
        throw null;
    }
}

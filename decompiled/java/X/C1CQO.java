package X;

import com.squareup.wire.Message;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: renamed from: X.1CQO, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CQO extends Message.Builder<C1CQM, C1CQO> {
    public Long LIZLLL;
    public String LJ;
    public C1CQV LJFF;
    public C1CQZ LJI;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1CQM build() {
        Long l = this.LIZLLL;
        if (l != null && this.LJ != null) {
            return new C1CQM(this.LIZLLL, this.LJ, this.LJFF, this.LJI, buildUnknownFields());
        }
        C1516540pZE.LJII(l, FollowStatusChangeMethod.PARAM_UID, this.LJ, "state_type");
        throw null;
    }
}

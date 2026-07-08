package X;

import com.squareup.wire.Message;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: renamed from: X.1CJu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2228441CJu extends Message.Builder<C2228421CJs, C2228441CJu> {
    public Long LIZLLL;
    public C2232561CZq LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2228421CJs build() {
        Long l = this.LIZLLL;
        if (l != null && this.LJ != null) {
            return new C2228421CJs(this.LIZLLL, this.LJ, buildUnknownFields());
        }
        C1516540pZE.LJII(l, FollowStatusChangeMethod.PARAM_UID, this.LJ, "frame");
        throw null;
    }
}

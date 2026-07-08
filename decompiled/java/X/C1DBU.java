package X;

import com.bytedance.im.core.proto.AckMessageRequestBody;
import com.squareup.wire.Message;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: renamed from: X.1DBU, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DBU extends Message.Builder<AckMessageRequestBody, C1DBU> {
    public Long LIZLLL;
    public String LJ;
    public EnumC869400Y8s LJFF;
    public EnumC868450Y5b LJI;
    public EnumC19365610pa LJII;
    public C0YMR LJIIIIZZ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final AckMessageRequestBody build() {
        Long l = this.LIZLLL;
        if (l != null && this.LJ != null) {
            return new AckMessageRequestBody(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, buildUnknownFields());
        }
        C1516540pZE.LJII(l, "start_timestamp", this.LJ, FollowStatusChangeMethod.PARAM_UID);
        throw null;
    }
}

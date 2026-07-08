package X;

import com.bytedance.im.core.proto.ClientACKRequestBody;
import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CiM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2237841CiM extends Message.Builder<ClientACKRequestBody, C2237841CiM> {
    public Long LIZLLL;
    public Integer LJ;
    public EnumC2220201Bv0 LJFF;
    public String LJI;
    public Long LJII;
    public Long LJIIIIZZ;
    public EnumC19365410pY LJIIIZ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final ClientACKRequestBody build() {
        Long l = this.LIZLLL;
        if (l != null && this.LJ != null && this.LJIIIZ != null) {
            return new ClientACKRequestBody(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, buildUnknownFields());
        }
        C1516540pZE.LJII(l, "start_time_stamp", this.LJ, "cmd", this.LJIIIZ, "type");
        throw null;
    }
}

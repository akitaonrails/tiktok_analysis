package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.0Zhg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C906740Zhg extends Message.Builder<C906720Zhe, C906740Zhg> {
    public String LIZLLL;
    public Long LJ;
    public String LJFF;
    public Long LJI;
    public Boolean LJII;
    public Integer LJIIIIZZ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C906720Zhe build() {
        String str = this.LJFF;
        if (str != null && this.LJI != null && this.LJII != null && this.LJIIIIZZ != null) {
            return new C906720Zhe(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, buildUnknownFields());
        }
        C1516540pZE.LJII(str, "reply_client_message_id", this.LJI, "reply_server_message_id", this.LJII, "interrupted", this.LJIIIIZZ, "final_seq_id");
        throw null;
    }
}

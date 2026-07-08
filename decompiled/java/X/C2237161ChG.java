package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1ChG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2237161ChG extends Message.Builder<C2237141ChE, C2237161ChG> {
    public Long LIZLLL;
    public Boolean LJ;
    public C2236901Cgq LJFF;
    public C2237171ChH LJI;
    public C1CIG LJII;
    public C1CIG LJIIIIZZ;
    public C1CIG LJIIIZ;
    public C1CIG LJIIJ;
    public C1CIG LJIIJJI;
    public C1CIG LJIIL;
    public C1CIG LJIILIIL;
    public C1CIG LJIILJJIL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2237141ChE build() {
        Long l = this.LIZLLL;
        if (l != null && this.LJ != null && this.LJFF != null && this.LJI != null && this.LJII != null && this.LJIIIIZZ != null && this.LJIIIZ != null && this.LJIIJ != null && this.LJIIJJI != null && this.LJIIL != null) {
            return new C2237141ChE(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, this.LJIIJJI, this.LJIIL, this.LJIILIIL, this.LJIILJJIL, buildUnknownFields());
        }
        C1516540pZE.LJII(l, "self_uid", this.LJ, "is_anchor", this.LJFF, "room_model", this.LJI, "app_info", this.LJII, "log_handler", this.LJIIIIZZ, "timer", this.LJIIIZ, "http_client", this.LJIIJ, "message_center", this.LJIIJJI, "rtc_provider", this.LJIIL, "biz_provider");
        throw null;
    }
}

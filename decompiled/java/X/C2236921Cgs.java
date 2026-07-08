package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1Cgs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2236921Cgs extends Message.Builder<C2236901Cgq, C2236921Cgs> {
    public Long LIZLLL;
    public Long LJ;
    public EnumC972770bQB LJFF;
    public Long LJI;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2236901Cgq build() {
        Long l = this.LIZLLL;
        if (l != null && this.LJ != null && this.LJFF != null && this.LJI != null) {
            return new C2236901Cgq(this.LIZLLL, this.LJ, this.LJFF, this.LJI, buildUnknownFields());
        }
        C1516540pZE.LJII(l, "room_id", this.LJ, "owner_uid", this.LJFF, "live_room_mode", this.LJI, "net_mode");
        throw null;
    }
}

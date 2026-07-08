package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1Cgj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2236831Cgj extends Message.Builder<C2236811Cgh, C2236831Cgj> {
    public Boolean LIZLLL;
    public Boolean LJ;
    public Boolean LJFF;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2236811Cgh build() {
        Boolean bool = this.LIZLLL;
        if (bool != null && this.LJ != null && this.LJFF != null) {
            return new C2236811Cgh(this.LIZLLL, this.LJ, this.LJFF, buildUnknownFields());
        }
        C1516540pZE.LJII(bool, "force_join_channel", this.LJ, "pre_push_data_after_join_rtc", this.LJFF, "should_force_pre_push_data");
        throw null;
    }
}

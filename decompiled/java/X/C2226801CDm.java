package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CDm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2226801CDm extends Message.Builder<C2226781CDk, C2226801CDm> {
    public String LIZLLL;
    public Boolean LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2226781CDk build() {
        String str = this.LIZLLL;
        if (str != null && this.LJ != null) {
            return new C2226781CDk(this.LIZLLL, this.LJ, buildUnknownFields());
        }
        C1516540pZE.LJII(str, "link_mic_id", this.LJ, "is_mute");
        throw null;
    }
}

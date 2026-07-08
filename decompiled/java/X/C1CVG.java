package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CVG, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CVG extends Message.Builder<C1CVF, C1CVG> {
    public C1CWW LIZLLL;
    public String LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1CVF build() {
        C1CWW c1cww = this.LIZLLL;
        if (c1cww != null && this.LJ != null) {
            return new C1CVF(this.LIZLLL, this.LJ, buildUnknownFields());
        }
        C1516540pZE.LJII(c1cww, "online_user_state", this.LJ, "link_mic_id");
        throw null;
    }
}

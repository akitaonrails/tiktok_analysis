package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CLI, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CLI extends Message.Builder<C1CLH, C1CLI> {
    public String LIZLLL;
    public EnumC1282300jTQ LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1CLH build() {
        String str = this.LIZLLL;
        if (str != null && this.LJ != null) {
            return new C1CLH(this.LIZLLL, this.LJ, buildUnknownFields());
        }
        C1516540pZE.LJII(str, "stream_id", this.LJ, "stream_type");
        throw null;
    }
}

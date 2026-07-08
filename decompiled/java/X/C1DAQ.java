package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1DAQ, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DAQ extends Message.Builder<C1DAP, C1DAQ> {
    public String LIZLLL;
    public C1DAG LJ;
    public String LJFF;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1DAP build() {
        return new C1DAP(this.LIZLLL, this.LJ, this.LJFF, buildUnknownFields());
    }
}

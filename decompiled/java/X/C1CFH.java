package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CFH, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CFH extends Message.Builder<C1CFG, C1CFH> {
    public String LIZLLL;
    public EnumC1282210jTH LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1CFG build() {
        String str = this.LIZLLL;
        if (str != null && this.LJ != null) {
            return new C1CFG(this.LIZLLL, this.LJ, buildUnknownFields());
        }
        C1516540pZE.LJII(str, "link_mic_id", this.LJ, "reason");
        throw null;
    }
}

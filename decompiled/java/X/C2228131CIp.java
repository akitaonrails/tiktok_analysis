package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CIp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2228131CIp extends Message.Builder<C2228121CIo, C2228131CIp> {
    public String LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2228121CIo build() {
        String str = this.LIZLLL;
        if (str != null) {
            return new C2228121CIo(this.LIZLLL, buildUnknownFields());
        }
        C1516540pZE.LJII(str, "layout_id");
        throw null;
    }
}

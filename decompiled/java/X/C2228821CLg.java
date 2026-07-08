package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CLg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2228821CLg extends Message.Builder<C2228801CLe, C2228821CLg> {
    public String LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2228801CLe build() {
        String str = this.LIZLLL;
        if (str != null) {
            return new C2228801CLe(this.LIZLLL, buildUnknownFields());
        }
        C1516540pZE.LJII(str, "link_mic_id");
        throw null;
    }
}

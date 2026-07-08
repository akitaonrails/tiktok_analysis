package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CUt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2231291CUt extends Message.Builder<C2231271CUr, C2231291CUt> {
    public Boolean LIZLLL;
    public Boolean LJ;
    public String LJFF;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2231271CUr build() {
        Boolean bool = this.LIZLLL;
        if (bool != null && this.LJ != null && this.LJFF != null) {
            return new C2231271CUr(this.LIZLLL, this.LJ, this.LJFF, buildUnknownFields());
        }
        C1516540pZE.LJII(bool, "is_audio_muted", this.LJ, "audio_muted_by_channel", this.LJFF, "link_mic_id");
        throw null;
    }
}

package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CLy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2229001CLy extends Message.Builder<C2228991CLx, C2229001CLy> {
    public String LIZLLL;
    public String LJ;
    public EnumC1282300jTQ LJFF;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2228991CLx build() {
        String str = this.LIZLLL;
        if (str != null && this.LJ != null && this.LJFF != null) {
            return new C2228991CLx(this.LIZLLL, this.LJ, this.LJFF, buildUnknownFields());
        }
        C1516540pZE.LJII(str, "origin_stream_id", this.LJ, "replace_stream_id", this.LJFF, "replace_stream_type");
        throw null;
    }
}

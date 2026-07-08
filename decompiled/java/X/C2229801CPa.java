package X;

import com.squareup.wire.Message;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CPa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2229801CPa extends Message.Builder<C1CPY, C2229801CPa> {
    public ByteString LIZLLL;
    public String LJ;
    public Long LJFF;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1CPY build() {
        return new C1CPY(this.LIZLLL, this.LJ, this.LJFF, buildUnknownFields());
    }
}

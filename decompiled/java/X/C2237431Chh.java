package X;

import com.squareup.wire.Message;
import okio.ByteString;

/* JADX INFO: renamed from: X.1Chh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2237431Chh extends Message.Builder<C2237411Chf, C2237431Chh> {
    public ByteString LIZLLL;
    public String LJ;
    public Long LJFF;
    public Boolean LJI;
    public String LJII;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2237411Chf build() {
        return new C2237411Chf(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, buildUnknownFields());
    }
}

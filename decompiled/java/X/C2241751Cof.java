package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1Cof, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2241751Cof extends Message.Builder<C2241761Cog, C2241751Cof> {
    public String LIZLLL;
    public C2241841Coo LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2241761Cog build() {
        return new C2241761Cog(this.LIZLLL, this.LJ, buildUnknownFields());
    }
}

package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1ChA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2237101ChA extends Message.Builder<C2237081Ch8, C2237101ChA> {
    public C2237061Ch6 LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2237081Ch8 build() {
        C2237061Ch6 c2237061Ch6 = this.LIZLLL;
        if (c2237061Ch6 != null) {
            return new C2237081Ch8(this.LIZLLL, buildUnknownFields());
        }
        C1516540pZE.LJII(c2237061Ch6, "message");
        throw null;
    }
}

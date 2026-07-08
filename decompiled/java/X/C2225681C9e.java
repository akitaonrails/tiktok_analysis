package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1C9e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2225681C9e extends Message.Builder<C2225661C9c, C2225681C9e> {
    public Boolean LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2225661C9c build() {
        Boolean bool = this.LIZLLL;
        if (bool != null) {
            return new C2225661C9c(this.LIZLLL, buildUnknownFields());
        }
        C1516540pZE.LJII(bool, "should_change");
        throw null;
    }
}

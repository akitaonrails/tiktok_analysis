package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CDj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2226771CDj extends Message.Builder<C2226751CDh, C2226771CDj> {
    public Boolean LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2226751CDh build() {
        Boolean bool = this.LIZLLL;
        if (bool != null) {
            return new C2226751CDh(this.LIZLLL, buildUnknownFields());
        }
        C1516540pZE.LJII(bool, "is_mute");
        throw null;
    }
}

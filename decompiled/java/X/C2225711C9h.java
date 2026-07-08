package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1C9h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2225711C9h extends Message.Builder<C2225691C9f, C2225711C9h> {
    public Boolean LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2225691C9f build() {
        Boolean bool = this.LIZLLL;
        if (bool != null) {
            return new C2225691C9f(this.LIZLLL, buildUnknownFields());
        }
        C1516540pZE.LJII(bool, "need_render");
        throw null;
    }
}

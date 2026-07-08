package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1C4N, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1C4N extends Message.Builder<C1C4L, C1C4N> {
    public String LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1C4L build() {
        String str = this.LIZLLL;
        if (str != null) {
            return new C1C4L(this.LIZLLL, buildUnknownFields());
        }
        C1516540pZE.LJII(str, "timer_id");
        throw null;
    }
}

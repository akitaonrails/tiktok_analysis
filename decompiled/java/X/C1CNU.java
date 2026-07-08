package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CNU, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CNU extends Message.Builder<C1CNT, C1CNU> {
    public String LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1CNT build() {
        String str = this.LIZLLL;
        if (str != null) {
            return new C1CNT(this.LIZLLL, buildUnknownFields());
        }
        C1516540pZE.LJII(str, "source");
        throw null;
    }
}

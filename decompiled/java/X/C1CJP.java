package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CJP, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CJP extends Message.Builder<C1CJO, C1CJP> {
    public Long LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1CJO build() {
        Long l = this.LIZLLL;
        if (l != null) {
            return new C1CJO(this.LIZLLL, buildUnknownFields());
        }
        C1516540pZE.LJII(l, "list_change_type");
        throw null;
    }
}

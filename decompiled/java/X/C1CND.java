package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CND, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CND extends Message.Builder<C1CNB, C1CND> {
    public String LIZLLL;
    public Long LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1CNB build() {
        return new C1CNB(this.LIZLLL, this.LJ, buildUnknownFields());
    }
}

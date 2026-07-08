package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.0rmf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1601750rmf extends Message.Builder<C1601740rme, C1601750rmf> {
    public String LIZLLL;
    public Integer LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1601740rme build() {
        return new C1601740rme(this.LIZLLL, this.LJ, buildUnknownFields());
    }
}

package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.0rAq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1578300rAq extends Message.Builder<C1578280rAo, C1578300rAq> {
    public Integer LIZLLL;
    public String LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1578280rAo build() {
        return new C1578280rAo(this.LIZLLL, this.LJ, buildUnknownFields());
    }
}

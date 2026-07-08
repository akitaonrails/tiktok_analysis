package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.0r94, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1577200r94 extends Message.Builder<C1577190r93, C1577200r94> {
    public String LIZLLL;
    public String LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1577190r93 build() {
        return new C1577190r93(this.LIZLLL, this.LJ, buildUnknownFields());
    }
}

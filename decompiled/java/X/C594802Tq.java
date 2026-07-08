package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.02Tq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C594802Tq extends Message.Builder<C594602To, C594802Tq> {
    public String LIZLLL;
    public String LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C594602To build() {
        return new C594602To(this.LIZLLL, this.LJ, buildUnknownFields());
    }
}

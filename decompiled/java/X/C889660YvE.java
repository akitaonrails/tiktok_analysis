package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.0YvE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C889660YvE extends Message.Builder<C889670YvF, C889660YvE> {
    public C891130Yxb LIZLLL;
    public C892030Yz3 LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C889670YvF build() {
        return new C889670YvF(this.LIZLLL, this.LJ, buildUnknownFields());
    }
}

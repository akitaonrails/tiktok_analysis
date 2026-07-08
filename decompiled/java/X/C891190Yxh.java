package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.0Yxh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C891190Yxh extends Message.Builder<C891130Yxb, C891190Yxh> {
    public C891160Yxe LIZLLL;
    public C891170Yxf LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C891130Yxb build() {
        return new C891130Yxb(this.LIZLLL, this.LJ, buildUnknownFields());
    }
}

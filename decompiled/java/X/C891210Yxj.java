package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.0Yxj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C891210Yxj extends Message.Builder<C891170Yxf, C891210Yxj> {
    public Integer LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C891170Yxf build() {
        return new C891170Yxf(this.LIZLLL, buildUnknownFields());
    }
}

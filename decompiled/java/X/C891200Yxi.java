package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.0Yxi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C891200Yxi extends Message.Builder<C891160Yxe, C891200Yxi> {
    public Integer LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C891160Yxe build() {
        return new C891160Yxe(this.LIZLLL, buildUnknownFields());
    }
}

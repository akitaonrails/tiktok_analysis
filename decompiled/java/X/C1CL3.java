package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CL3, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CL3 extends Message.Builder<C1CL1, C1CL3> {
    public C2228751CKz LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1CL1 build() {
        C2228751CKz c2228751CKz = this.LIZLLL;
        if (c2228751CKz != null) {
            return new C1CL1(this.LIZLLL, buildUnknownFields());
        }
        C1516540pZE.LJII(c2228751CKz, "media_info");
        throw null;
    }
}

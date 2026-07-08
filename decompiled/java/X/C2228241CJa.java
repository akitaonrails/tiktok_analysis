package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CJa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2228241CJa extends Message.Builder<C1CJY, C2228241CJa> {
    public C2228361CJm LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1CJY build() {
        C2228361CJm c2228361CJm = this.LIZLLL;
        if (c2228361CJm != null) {
            return new C1CJY(this.LIZLLL, buildUnknownFields());
        }
        C1516540pZE.LJII(c2228361CJm, "key");
        throw null;
    }
}

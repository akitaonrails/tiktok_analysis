package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CNN, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CNN extends Message.Builder<C1CNM, C1CNN> {
    public String LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1CNM build() {
        return new C1CNM(this.LIZLLL, buildUnknownFields());
    }
}

package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CA1, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CA1 extends Message.Builder<C1CA0, C1CA1> {
    public EnumC15548066w LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1CA0 build() {
        return new C1CA0(this.LIZLLL, buildUnknownFields());
    }
}

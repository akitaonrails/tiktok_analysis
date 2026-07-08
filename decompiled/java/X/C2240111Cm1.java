package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1Cm1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2240111Cm1 extends Message.Builder<C2240101Cm0, C2240111Cm1> {
    public String LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2240101Cm0 build() {
        return new C2240101Cm0(this.LIZLLL, buildUnknownFields());
    }
}

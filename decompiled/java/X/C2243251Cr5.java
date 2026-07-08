package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1Cr5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2243251Cr5 extends Message.Builder<C2243211Cr1, C2243251Cr5> {
    public String LIZLLL;
    public Boolean LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2243211Cr1 build() {
        return new C2243211Cr1(this.LIZLLL, this.LJ, buildUnknownFields());
    }
}

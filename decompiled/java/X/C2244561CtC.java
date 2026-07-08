package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CtC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2244561CtC extends Message.Builder<C2244541CtA, C2244561CtC> {
    public C06BD LIZLLL;
    public C2272741DxY LJ;
    public EnumC1567006Bo LJFF;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2244541CtA build() {
        return new C2244541CtA(this.LIZLLL, this.LJ, this.LJFF, buildUnknownFields());
    }
}

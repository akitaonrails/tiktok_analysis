package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CrV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2243511CrV extends Message.Builder<C2243521CrW, C2243511CrV> {
    public String LIZLLL;
    public String LJ;
    public String LJFF;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2243521CrW build() {
        return new C2243521CrW(this.LIZLLL, this.LJ, this.LJFF, buildUnknownFields());
    }
}

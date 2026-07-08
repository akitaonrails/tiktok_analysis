package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CrP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2243451CrP extends Message.Builder<C2243361CrG, C2243451CrP> {
    public C2243521CrW LIZLLL;
    public C2244091CsR LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2243361CrG build() {
        return new C2243361CrG(this.LIZLLL, this.LJ, buildUnknownFields());
    }
}

package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.02cG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C625402cG extends Message.Builder<C625202cE, C625402cG> {
    public Long LIZLLL;
    public Long LJ;
    public Long LJFF;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C625202cE build() {
        return new C625202cE(this.LIZLLL, this.LJ, this.LJFF, buildUnknownFields());
    }
}

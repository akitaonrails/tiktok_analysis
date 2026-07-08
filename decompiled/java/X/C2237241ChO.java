package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1ChO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2237241ChO extends Message.Builder<C2237221ChM, C2237241ChO> {
    public Double LIZLLL;
    public Double LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2237221ChM build() {
        return new C2237221ChM(this.LIZLLL, this.LJ, buildUnknownFields());
    }
}

package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1Co2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2241361Co2 extends Message.Builder<C2241321Cny, C2241361Co2> {
    public Integer LIZLLL;
    public Integer LJ;
    public Integer LJFF;
    public Integer LJI;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2241321Cny build() {
        return new C2241321Cny(this.LIZLLL, this.LJ, this.LJFF, this.LJI, buildUnknownFields());
    }
}

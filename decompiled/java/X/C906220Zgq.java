package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.0Zgq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C906220Zgq extends Message.Builder<C906230Zgr, C906220Zgq> {
    public Boolean LIZLLL;
    public EnumC906330Zh1 LJ;
    public Long LJFF;
    public Integer LJI;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C906230Zgr build() {
        return new C906230Zgr(this.LIZLLL, this.LJ, this.LJFF, this.LJI, buildUnknownFields());
    }
}

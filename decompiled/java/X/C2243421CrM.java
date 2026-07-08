package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CrM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2243421CrM extends Message.Builder<C2243341CrE, C2243421CrM> {
    public C2243521CrW LIZLLL;
    public C2243521CrW LJ;
    public C2244321Cso LJFF;
    public EnumC2243411CrL LJI;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2243341CrE build() {
        return new C2243341CrE(this.LIZLLL, this.LJ, this.LJFF, this.LJI, buildUnknownFields());
    }
}

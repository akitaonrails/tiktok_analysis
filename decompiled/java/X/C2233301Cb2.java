package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1Cb2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2233301Cb2 extends Message.Builder<C2233281Cb0, C2233301Cb2> {
    public String LIZLLL;
    public EnumC1288040jcg LJ;
    public C1CXT LJFF;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2233281Cb0 build() {
        String str = this.LIZLLL;
        if (str != null && this.LJ != null && this.LJFF != null) {
            return new C2233281Cb0(this.LIZLLL, this.LJ, this.LJFF, buildUnknownFields());
        }
        C1516540pZE.LJII(str, "room_id", this.LJ, "state", this.LJFF, "error");
        throw null;
    }
}

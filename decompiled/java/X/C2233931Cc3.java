package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1Cc3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2233931Cc3 extends Message.Builder<C2233911Cc1, C2233931Cc3> {
    public EnumC2182321Ab0 LIZLLL;
    public C2233611CbX LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2233911Cc1 build() {
        EnumC2182321Ab0 enumC2182321Ab0 = this.LIZLLL;
        if (enumC2182321Ab0 != null && this.LJ != null) {
            return new C2233911Cc1(this.LIZLLL, this.LJ, buildUnknownFields());
        }
        C1516540pZE.LJII(enumC2182321Ab0, "source", this.LJ, "biz_source");
        throw null;
    }
}

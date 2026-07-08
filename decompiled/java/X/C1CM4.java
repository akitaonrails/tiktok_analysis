package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CM4, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CM4 extends Message.Builder<C1CM2, C1CM4> {
    public String LIZLLL;
    public String LJ;
    public Boolean LJFF;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1CM2 build() {
        String str = this.LIZLLL;
        if (str != null && this.LJFF != null) {
            return new C1CM2(this.LIZLLL, this.LJ, this.LJFF, buildUnknownFields());
        }
        C1516540pZE.LJII(str, "str_uid", this.LJFF, "is_audio");
        throw null;
    }
}

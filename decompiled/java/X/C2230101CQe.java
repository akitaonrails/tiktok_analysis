package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CQe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2230101CQe extends Message.Builder<C2230081CQc, C2230101CQe> {
    public String LIZLLL;
    public String LJ;
    public String LJFF;
    public String LJI;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2230081CQc build() {
        return new C2230081CQc(this.LIZLLL, this.LJ, this.LJFF, this.LJI, buildUnknownFields());
    }
}

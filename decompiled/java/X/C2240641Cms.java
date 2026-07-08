package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1Cms, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2240641Cms extends Message.Builder<C2240621Cmq, C2240641Cms> {
    public String LIZLLL;
    public Integer LJ;
    public Integer LJFF;
    public String LJI;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2240621Cmq build() {
        return new C2240621Cmq(this.LIZLLL, this.LJ, this.LJFF, this.LJI, buildUnknownFields());
    }
}

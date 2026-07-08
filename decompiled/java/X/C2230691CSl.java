package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CSl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2230691CSl extends Message.Builder<C2230671CSj, C2230691CSl> {
    public Integer LIZLLL;
    public Integer LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2230671CSj build() {
        return new C2230671CSj(this.LIZLLL, this.LJ, buildUnknownFields());
    }
}

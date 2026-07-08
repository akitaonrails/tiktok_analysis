package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.0ZhK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C906520ZhK extends Message.Builder<C906380Zh6, C906520ZhK> {
    public C906410Zh9 LIZLLL;
    public C906370Zh5 LJ;
    public C906400Zh8 LJFF;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C906380Zh6 build() {
        return new C906380Zh6(this.LIZLLL, this.LJ, this.LJFF, buildUnknownFields());
    }
}

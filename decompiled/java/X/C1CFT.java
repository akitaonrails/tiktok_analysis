package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CFT, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CFT extends Message.Builder<C1CFR, C1CFT> {
    public String LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1CFR build() {
        String str = this.LIZLLL;
        if (str != null) {
            return new C1CFR(this.LIZLLL, buildUnknownFields());
        }
        C1516540pZE.LJII(str, "group_channel_id");
        throw null;
    }
}

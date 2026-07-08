package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CVY, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CVY extends Message.Builder<C1CVW, C1CVY> {
    public C1CZY LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1CVW build() {
        C1CZY c1czy = this.LIZLLL;
        if (c1czy != null) {
            return new C1CVW(this.LIZLLL, buildUnknownFields());
        }
        C1516540pZE.LJII(c1czy, "link_rtc_state_change_context");
        throw null;
    }
}

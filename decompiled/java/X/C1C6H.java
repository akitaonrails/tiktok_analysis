package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1C6H, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1C6H extends Message.Builder<C1C6G, C1C6H> {
    public EnumC1282190jTF LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1C6G build() {
        EnumC1282190jTF enumC1282190jTF = this.LIZLLL;
        if (enumC1282190jTF != null) {
            return new C1C6G(this.LIZLLL, buildUnknownFields());
        }
        C1516540pZE.LJII(enumC1282190jTF, "rtc_link_mic_type");
        throw null;
    }
}

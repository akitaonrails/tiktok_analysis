package X;

import com.squareup.wire.Message;
import tt_c2pa_sdk.proto.FuncParamsX25f7600164bf39ed;

/* JADX INFO: renamed from: X.1C4H, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1C4H extends Message.Builder<FuncParamsX25f7600164bf39ed, C1C4H> {
    public String LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final FuncParamsX25f7600164bf39ed build() {
        String str = this.LIZLLL;
        if (str != null) {
            return new FuncParamsX25f7600164bf39ed(this.LIZLLL, buildUnknownFields());
        }
        C1516540pZE.LJII(str, "path");
        throw null;
    }
}

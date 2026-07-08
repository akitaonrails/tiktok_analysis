package X;

import com.squareup.wire.Message;
import tt_c2pa_sdk.proto.FuncReturnX0bf8b5c665c57f35;

/* JADX INFO: renamed from: X.1CBp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2226311CBp extends Message.Builder<FuncReturnX0bf8b5c665c57f35, C2226311CBp> {
    public String LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final FuncReturnX0bf8b5c665c57f35 build() {
        String str = this.LIZLLL;
        if (str != null) {
            return new FuncReturnX0bf8b5c665c57f35(this.LIZLLL, buildUnknownFields());
        }
        C1516540pZE.LJII(str, "ret");
        throw null;
    }
}

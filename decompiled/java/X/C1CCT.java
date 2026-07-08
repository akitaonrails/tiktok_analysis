package X;

import com.squareup.wire.Message;
import tt_c2pa_sdk.proto.FuncParamsX913809d0daa224e7;

/* JADX INFO: renamed from: X.1CCT, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CCT extends Message.Builder<FuncParamsX913809d0daa224e7, C1CCT> {
    public String LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final FuncParamsX913809d0daa224e7 build() {
        String str = this.LIZLLL;
        if (str != null) {
            return new FuncParamsX913809d0daa224e7(this.LIZLLL, buildUnknownFields());
        }
        C1516540pZE.LJII(str, "tmp_dir_path");
        throw null;
    }
}

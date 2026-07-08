package X;

import com.bytedance.otis.protos.PerfDataResponse;
import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1C9b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2225651C9b extends Message.Builder<PerfDataResponse, C2225651C9b> {
    public Integer LIZLLL;
    public String LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final PerfDataResponse build() {
        return new PerfDataResponse(this.LIZLLL, this.LJ, buildUnknownFields());
    }
}

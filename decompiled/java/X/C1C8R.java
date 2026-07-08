package X;

import com.bytedance.otis.protos.TimeStampRange;
import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1C8R, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1C8R extends Message.Builder<TimeStampRange, C1C8R> {
    public Long LIZLLL;
    public Long LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final TimeStampRange build() {
        return new TimeStampRange(this.LIZLLL, this.LJ, buildUnknownFields());
    }
}

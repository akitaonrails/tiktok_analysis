package X;

import com.bytedance.scalpel.protos.TimeStampRange;
import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1C96, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1C96 extends Message.Builder<TimeStampRange, C1C96> {
    public Long LIZLLL;
    public Long LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final TimeStampRange build() {
        return new TimeStampRange(this.LIZLLL, this.LJ, buildUnknownFields());
    }
}

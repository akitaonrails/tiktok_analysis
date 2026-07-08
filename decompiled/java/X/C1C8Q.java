package X;

import com.bytedance.otis.protos.TimeInfo;
import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1C8Q, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1C8Q extends Message.Builder<TimeInfo, C1C8Q> {
    public Long LIZLLL;
    public Long LJ;
    public Long LJFF;
    public Long LJI;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final TimeInfo build() {
        return new TimeInfo(this.LIZLLL, this.LJ, this.LJFF, this.LJI, buildUnknownFields());
    }
}

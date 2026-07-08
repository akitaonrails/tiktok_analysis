package X;

import com.bytedance.scalpel.protos.MsgInfo;
import com.bytedance.scalpel.protos.TimeInfo;
import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1C9D, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1C9D extends Message.Builder<MsgInfo, C1C9D> {
    public String LIZLLL;
    public Integer LJ;
    public TimeInfo LJFF;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final MsgInfo build() {
        String str = this.LIZLLL;
        if (str != null && this.LJ != null && this.LJFF != null) {
            return new MsgInfo(this.LIZLLL, this.LJ, this.LJFF, buildUnknownFields());
        }
        C1516540pZE.LJII(str, "name", this.LJ, "what", this.LJFF, "time_info");
        throw null;
    }
}

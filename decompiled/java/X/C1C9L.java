package X;

import com.bytedance.scalpel.protos.LockInfo;
import com.bytedance.scalpel.protos.MethodStack;
import com.bytedance.scalpel.protos.TimeInfo;
import com.bytedance.scalpel.protos.TimeStampRange;
import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1C9L, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1C9L extends Message.Builder<LockInfo, C1C9L> {
    public String LIZLLL;
    public String LJ;
    public String LJFF;
    public TimeInfo LJI;
    public String LJII;
    public MethodStack LJIIIIZZ;
    public TimeStampRange LJIIIZ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final LockInfo build() {
        String str = this.LIZLLL;
        if (str != null && this.LJ != null && this.LJFF != null && this.LJI != null) {
            return new LockInfo(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, buildUnknownFields());
        }
        C1516540pZE.LJII(str, "waiter_stack", this.LJ, "owner_thread", this.LJFF, "owner_stack", this.LJI, "time_info");
        throw null;
    }
}

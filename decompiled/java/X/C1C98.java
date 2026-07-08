package X;

import com.bytedance.scalpel.protos.BinderInfo;
import com.bytedance.scalpel.protos.GCRecord;
import com.bytedance.scalpel.protos.IoInfo;
import com.bytedance.scalpel.protos.LockInfo;
import com.bytedance.scalpel.protos.MsgInfo;
import com.bytedance.scalpel.protos.PerformanceInfo;
import com.bytedance.scalpel.protos.RunnableInfo;
import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.1C98, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1C98 extends Message.Builder<PerformanceInfo, C1C98> {
    public List<GCRecord> LIZLLL = C1516540pZE.LJIIIIZZ();
    public List<BinderInfo> LJ = C1516540pZE.LJIIIIZZ();
    public List<LockInfo> LJFF = C1516540pZE.LJIIIIZZ();
    public List<MsgInfo> LJI = C1516540pZE.LJIIIIZZ();
    public List<RunnableInfo> LJII = C1516540pZE.LJIIIIZZ();
    public List<IoInfo> LJIIIIZZ = C1516540pZE.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final PerformanceInfo build() {
        return new PerformanceInfo(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, buildUnknownFields());
    }
}

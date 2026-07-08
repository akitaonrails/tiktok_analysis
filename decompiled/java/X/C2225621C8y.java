package X;

import com.bytedance.scalpel.protos.BigJankMsg;
import com.bytedance.scalpel.protos.MethodStack;
import com.bytedance.scalpel.protos.PerformanceInfo;
import com.bytedance.scalpel.protos.TimeInfo;
import com.bytedance.scalpel.protos.TimeStampRange;
import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.1C8y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2225621C8y extends Message.Builder<BigJankMsg.MessageDispatch, C2225621C8y> {
    public List<MethodStack> LIZLLL = C1516540pZE.LJIIIIZZ();
    public Long LJ;
    public String LJFF;
    public PerformanceInfo LJI;
    public TimeInfo LJII;
    public String LJIIIIZZ;
    public TimeStampRange LJIIIZ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final BigJankMsg.MessageDispatch build() {
        Long l = this.LJ;
        if (l != null) {
            return new BigJankMsg.MessageDispatch(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, buildUnknownFields());
        }
        C1516540pZE.LJII(l, "interval_time");
        throw null;
    }
}

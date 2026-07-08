package X;

import com.bytedance.scalpel.protos.MethodStack;
import com.bytedance.scalpel.protos.RunnableInfo;
import com.bytedance.scalpel.protos.TimeInfo;
import com.bytedance.scalpel.protos.TimeStampRange;
import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1C9F, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1C9F extends Message.Builder<RunnableInfo, C1C9F> {
    public String LIZLLL;
    public String LJ;
    public TimeInfo LJFF;
    public MethodStack LJI;
    public Integer LJII;
    public Boolean LJIIIIZZ;
    public TimeStampRange LJIIIZ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final RunnableInfo build() {
        String str = this.LIZLLL;
        if (str != null && this.LJ != null && this.LJFF != null) {
            return new RunnableInfo(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, buildUnknownFields());
        }
        C1516540pZE.LJII(str, "name", this.LJ, "thread_name", this.LJFF, "time_info");
        throw null;
    }
}

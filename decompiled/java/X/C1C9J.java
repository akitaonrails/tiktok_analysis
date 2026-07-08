package X;

import com.bytedance.scalpel.protos.BinderInfo;
import com.bytedance.scalpel.protos.MethodStack;
import com.bytedance.scalpel.protos.TimeInfo;
import com.bytedance.scalpel.protos.TimeStampRange;
import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1C9J, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1C9J extends Message.Builder<BinderInfo, C1C9J> {
    public String LIZLLL;
    public Integer LJ;
    public String LJFF;
    public String LJI;
    public TimeInfo LJII;
    public MethodStack LJIIIIZZ;
    public TimeStampRange LJIIIZ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final BinderInfo build() {
        String str = this.LIZLLL;
        if (str != null && this.LJ != null && this.LJI != null && this.LJII != null) {
            return new BinderInfo(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, buildUnknownFields());
        }
        C1516540pZE.LJII(str, "interface_name", this.LJ, "transact_code", this.LJI, "thread_name", this.LJII, "time_info");
        throw null;
    }
}

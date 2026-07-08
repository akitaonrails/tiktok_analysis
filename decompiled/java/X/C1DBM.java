package X;

import com.bytedance.im.core.proto.ConvCountReport;
import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1DBM, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DBM extends Message.Builder<ConvCountReport, C1DBM> {
    public Long LIZLLL;
    public Long LJ;
    public EnumC869400Y8s LJFF;
    public Integer LJI;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final ConvCountReport build() {
        return new ConvCountReport(this.LIZLLL, this.LJ, this.LJFF, this.LJI, buildUnknownFields());
    }
}

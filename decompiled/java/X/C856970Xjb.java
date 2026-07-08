package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Unit;
import kotlin.jvm.internal.AwS558S0100000_14;

/* JADX INFO: renamed from: X.0Xjb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C856970Xjb extends AbstractC857240Xk2<Unit> {
    public final VideoPublishEditModel LLILZ;
    public final InterfaceC856980Xjc LLILZIL = C0CHQ.LIZ().getPublishService().LJJJJZ();

    @Override // X.AbstractC857240Xk2
    public final String LIZJ() {
        return EnumC856470Xin.PUBLISH_HASHTAG_LIMIT_CHECK.getValue().getSecond();
    }

    public C856970Xjb(VideoPublishEditModel videoPublishEditModel) {
        this.LLILZ = videoPublishEditModel;
    }

    @Override // X.AbstractC857240Xk2
    public final void LIZ(C857220Xk0 c857220Xk0) {
        if (!this.LLILZIL.LIZJ()) {
            c857220Xk0.LIZ(this);
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onCheck: current count: ");
        sbLIZ.append(this.LLILZIL.LIZLLL(this.LLILZ));
        sbLIZ.append(", max limit: ");
        sbLIZ.append(this.LLILZIL.LIZ());
        C201955140j.LIZIZ("dzy_hashtag", C2188811AlT.LIZIZ(sbLIZ));
        if (this.LLILZIL.LIZLLL(this.LLILZ) > this.LLILZIL.LIZ()) {
            C0CNO.LIZLLL(0L, new AwS558S0100000_14(this, 1378));
            c857220Xk0.cancel();
        } else {
            c857220Xk0.LIZ(this);
        }
    }
}

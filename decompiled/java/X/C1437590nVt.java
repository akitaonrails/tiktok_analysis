package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Unit;
import kotlin.jvm.internal.AwS601S0100000_22;

/* JADX INFO: renamed from: X.0nVt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1437590nVt extends AbstractC857240Xk2<Unit> {
    public final VideoPublishEditModel LLILZ;

    @Override // X.AbstractC857240Xk2
    public final String LIZJ() {
        return EnumC856470Xin.PUBLISH_FILE_CHECK.getValue().getSecond();
    }

    public C1437590nVt(VideoPublishEditModel videoPublishEditModel) {
        this.LLILZ = videoPublishEditModel;
    }

    @Override // X.AbstractC857240Xk2
    public final void LIZ(C857220Xk0 c857220Xk0) {
        if (!C1428470nHB.LJJZZI(this.LLILZ) && ((Boolean) C280510Az3.LIZ.getValue()).booleanValue()) {
            VideoPublishEditModel videoPublishEditModel = this.LLILZ;
            AwS601S0100000_22 awS601S0100000_22 = new AwS601S0100000_22(this, 654);
            if (C1437580nVs.LIZJ(videoPublishEditModel)) {
                NLEModel nLEModelLJJLIIIJILLIZJL = C1416310mxZ.LJJLIIIJILLIZJL(videoPublishEditModel);
                if (nLEModelLJJLIIIJILLIZJL == null) {
                    awS601S0100000_22.invoke(new C1437600nVu(-1));
                    C1437580nVs.LIZLLL("", "nle model not found");
                } else {
                    C1437600nVu c1437600nVuLIZ = C1437580nVs.LIZ(nLEModelLJJLIIIJILLIZJL);
                    awS601S0100000_22.invoke(c1437600nVuLIZ);
                    if (c1437600nVuLIZ.LIZ == 0) {
                        C823190WQz.LIZ.LIZIZ(videoPublishEditModel.getCreationId(), c1437600nVuLIZ.LIZIZ);
                    }
                }
            }
            c857220Xk0.LIZ(this);
            return;
        }
        c857220Xk0.LIZ(this);
    }
}

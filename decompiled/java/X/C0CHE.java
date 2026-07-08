package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: renamed from: X.0CHE, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CHE {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(4649));

    public static int LIZ() {
        return ((Number) LIZ.getValue()).intValue();
    }

    public static final boolean LIZIZ(VideoPublishEditModel videoPublishEditModel, NLEModel nLEModel) {
        if (!C0CHQ.LIZ().getAccountService().isLogin() || u4.LJJIJIIJI(videoPublishEditModel)) {
            return false;
        }
        if ((nLEModel == null || !(!C377130EqV.LIZIZ(videoPublishEditModel, nLEModel).isEmpty())) && LIZ() == 0) {
            return false;
        }
        return true;
    }
}

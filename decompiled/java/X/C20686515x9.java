package X;

import com.ss.android.ugc.aweme.feed.assem.usercard.VideoUserCardAssem;
import com.ss.android.ugc.aweme.feed.assem.usercard.VideoUserCardVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS276S0000000_31;

/* JADX INFO: renamed from: X.15x9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20686515x9 extends C09AY implements Function2<VideoUserCardAssem, C291001Au<? extends C0R9E>, Unit> {
    public C20686515x9() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(VideoUserCardAssem videoUserCardAssem, C291001Au<? extends C0R9E> c291001Au) {
        Object obj;
        VideoUserCardAssem videoUserCardAssem2 = videoUserCardAssem;
        if (c291001Au != null) {
            VideoUserCardVM videoUserCardVMTp = videoUserCardAssem2.tp();
            if (videoUserCardVMTp.LL) {
                videoUserCardVMTp.setStateImmediate(AFwS276S0000000_31.get$arr$(258));
                videoUserCardVMTp.wQ2(false, EnumC1073720e30.SLIDE);
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onHolderUnSelected, item:");
            C724270Sb3 c724270Sb3 = videoUserCardAssem2.LLJI;
            String aid = null;
            if (c724270Sb3 != null) {
                obj = c724270Sb3.LL;
            } else {
                obj = null;
            }
            Aweme aweme = ((VideoItemParams) obj).getAweme();
            if (aweme != null) {
                aid = aweme.getAid();
            }
            sbLIZ.append(aid);
            C2188811AlT.LIZIZ(sbLIZ);
        }
        return Unit.LIZ;
    }
}

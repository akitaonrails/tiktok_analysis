package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.IDetailFeedSafService;
import com.ss.android.ugc.aweme.feed.assem.desc.TranslationDelegateAbility;
import com.ss.android.ugc.aweme.feed.assem.desc.VideoDescAssem;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0RDP, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RDP extends C09AY implements Function2<VideoDescAssem, C291001Au<? extends String>, Unit> {
    public C0RDP() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(VideoDescAssem videoDescAssem, C291001Au<? extends String> c291001Au) {
        Object obj;
        InterfaceC665370Q7z interfaceC665370Q7zLJI;
        Fragment fragmentLIZLLL;
        VideoDescAssem videoDescAssem2 = videoDescAssem;
        if (((VideoItemParams) C631370Opb.LIZ(videoDescAssem2)).currentPosition == 0) {
            C724270Sb3 c724270Sb3 = videoDescAssem2.LLJI;
            if (c724270Sb3 != null) {
                obj = c724270Sb3.LL;
            } else {
                obj = null;
            }
            if (Intrinsics.LJFF(((VideoItemParams) obj).mEventType, "homepage_hot")) {
                IDetailFeedSafService iDetailFeedSafService = (IDetailFeedSafService) PluggableExtentionKt.pluggableSpi$default(IDetailFeedSafService.class, false, false, false, 14, null);
                if (iDetailFeedSafService != null && (fragmentLIZLLL = iDetailFeedSafService.LIZLLL(C724240Sb0.LJI(videoDescAssem2))) != null) {
                    interfaceC665370Q7zLJI = C1558360qeg.LJFF(fragmentLIZLLL, null);
                } else {
                    C19EG c19egLIZ = C724240Sb0.LIZ(videoDescAssem2);
                    if (c19egLIZ != null) {
                        interfaceC665370Q7zLJI = C1558360qeg.LJI(c19egLIZ, null);
                    }
                }
                if (interfaceC665370Q7zLJI != null && C1558520qew.LIZ(interfaceC665370Q7zLJI, TranslationDelegateAbility.class, null) == null) {
                    C1558520qew.LJII(interfaceC665370Q7zLJI, videoDescAssem2, TranslationDelegateAbility.class, null, null);
                }
            }
        }
        return Unit.LIZ;
    }
}

package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.videoadaption.adaptioncontext.VideoAdaptionManagerContext;
import com.ss.android.ugc.aweme.videoadaption.adaptionparams.VideoAdaptionParams;
import com.ss.android.ugc.aweme.videoadaption.adaptionparams.VideoAdaptionResult;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.AFwS221S0000000_31;
import kotlin.jvm.internal.AwS563S0100000_19;

/* JADX INFO: renamed from: X.15cx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20561315cx extends AbstractC20561515cz<VideoAdaptionParams, VideoAdaptionResult> implements InterfaceC20438714yH {
    public final String LLILZIL;
    public final VideoAdaptionManagerContext LLILZLL;
    public final EnumC1783170wVH LLIZ = EnumC1783170wVH.MANAGER;

    @Override // X.InterfaceC20562615dA
    public final String getName() {
        return this.LLILZIL;
    }

    @Override // X.AbstractC20561515cz, X.InterfaceC20562615dA
    public final EnumC1783170wVH getNodeType() {
        return this.LLIZ;
    }

    @Override // X.InterfaceC20438714yH
    public final void LIZ(VideoAdaptionResult videoAdaptionResult) {
        this.LLILZ = videoAdaptionResult;
        LIZLLL(videoAdaptionResult);
        if (!C20039813b2.LIZIZ) {
            y5(null, null, videoAdaptionResult, AFwS221S0000000_31.get$arr$(357));
        }
    }

    public final void LJI(VideoAdaptionParams videoAdaptionParams) {
        VideoAdaptionResult videoAdaptionResultLIZLLL;
        VideoAdaptionResult videoAdaptionResultCopy;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (!C20039813b2.LIZIZ) {
            LJFF(null, videoAdaptionParams, null, AFwS221S0000000_31.get$arr$(355));
        }
        AbstractC20561415cy adaptionStrategy = this.LLILZLL.getStrategyFactory().getAdaptionStrategy(this.LLILZLL, videoAdaptionParams);
        if (adaptionStrategy == null) {
            Ui(AFwS221S0000000_31.get$arr$(356), videoAdaptionParams, null);
            return;
        }
        List listLIZ = adaptionStrategy.LIZ().getHandlerFactory().LIZ(adaptionStrategy.LIZ());
        if (listLIZ.isEmpty()) {
            adaptionStrategy.Ui(AFwS221S0000000_31.get$arr$(397), null, null);
        } else {
            if (adaptionStrategy.LIZIZ() && listLIZ.size() > 1) {
                if (!C20039813b2.LIZIZ) {
                    adaptionStrategy.em(new AwS563S0100000_19(listLIZ, (List<? extends AbstractC20562115d5>) 2958), null, null);
                }
                List<? extends AbstractC20562115d5> listSingletonList = Collections.singletonList(ListProtector.get(listLIZ, 0));
                List list = (List) ListProtector.remove(C1697810uHb.LJIILJJIL(listLIZ), 0);
                videoAdaptionResultLIZLLL = adaptionStrategy.LIZLLL(listSingletonList, videoAdaptionParams, null);
                if (videoAdaptionResultLIZLLL != null) {
                    videoAdaptionResultCopy = videoAdaptionResultLIZLLL.copy(videoAdaptionResultLIZLLL.width, videoAdaptionResultLIZLLL.height, videoAdaptionResultLIZLLL.translateX, videoAdaptionResultLIZLLL.translateY, videoAdaptionResultLIZLLL.resultOperator);
                } else {
                    videoAdaptionResultCopy = null;
                }
                C23250099c.LIZLLL(adaptionStrategy.LLILLJJLI, null, null, new C20438814yI(adaptionStrategy, list, videoAdaptionParams, videoAdaptionResultCopy, this, null), 3);
            } else {
                if (!C20039813b2.LIZIZ) {
                    adaptionStrategy.ah(new AwS563S0100000_19(listLIZ, (List<? extends AbstractC20562115d5>) 2959), null, null);
                }
                videoAdaptionResultLIZLLL = adaptionStrategy.LIZLLL(listLIZ, videoAdaptionParams, null);
            }
            LIZ(videoAdaptionResultLIZLLL);
        }
        if (!C20039813b2.LIZIZ) {
            ah(new C20561715d1(jCurrentTimeMillis), null, null);
        }
    }

    public C20561315cx(String str, VideoAdaptionManagerContext videoAdaptionManagerContext) {
        this.LLILZIL = str;
        this.LLILZLL = videoAdaptionManagerContext;
    }
}

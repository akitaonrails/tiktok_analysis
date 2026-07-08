package X;

import com.bytedance.android.live.room.CommentSendEvent;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.commentdetector.HighIntentCommentDetector;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.commentdetector.HighIntentCommentDetectorViewModel;
import com.bytedance.android.livesdk.livesetting.subscription.LivePcsIdentifyCommentMethodSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0fJj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1122530fJj extends C09AY implements Function1<AbstractC1103820epY, Unit> {
    public final /* synthetic */ HighIntentCommentDetector LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1122530fJj(HighIntentCommentDetector highIntentCommentDetector) {
        super(1);
        this.LL = highIntentCommentDetector;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(AbstractC1103820epY abstractC1103820epY) {
        AbstractC1103820epY abstractC1103820epY2 = abstractC1103820epY;
        if (abstractC1103820epY2 instanceof C1103810epX) {
            HighIntentCommentDetector highIntentCommentDetector = this.LL;
            C1103810epX c1103810epX = (C1103810epX) abstractC1103820epY2;
            highIntentCommentDetector.getClass();
            highIntentCommentDetector.LL = c1103810epX.LIZ;
            String str = c1103810epX.LIZIZ;
            if (str == null) {
                str = "";
            }
            highIntentCommentDetector.LLILLJJLI = str;
            HighIntentCommentDetector highIntentCommentDetector2 = this.LL;
            if (!highIntentCommentDetector2.LLJI && LivePcsIdentifyCommentMethodSetting.INSTANCE.enable()) {
                DataChannel dataChannel = highIntentCommentDetector2.dataChannel;
                if (dataChannel != null) {
                    dataChannel.BQ2(highIntentCommentDetector2, CommentSendEvent.class, new C1122480fJe(highIntentCommentDetector2));
                }
                highIntentCommentDetector2.LLJI = true;
                HighIntentCommentDetectorViewModel highIntentCommentDetectorViewModelY1 = highIntentCommentDetector2.y1();
                if (highIntentCommentDetectorViewModelY1.LLIZ) {
                    highIntentCommentDetectorViewModelY1.LLILLJJLI.bc2(new C09GK(new C1122900fKK(highIntentCommentDetectorViewModelY1)));
                }
            }
            this.LL.A1();
        }
        return Unit.LIZ;
    }
}

package X;

import com.bytedance.ies.nle.editor_jni.NLECurveSpeedCalculator;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.gamora.editorpro.capabilities.video.speed.common.SpeedViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Dvw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C355020Dvw extends C09AY implements Function0<Unit> {
    public final /* synthetic */ SpeedViewModel LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C355020Dvw(SpeedViewModel speedViewModel, long j, int i) {
        super(0);
        this.LL = speedViewModel;
        this.LLILLJJLI = j;
        this.LLILLL = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C0E48 c0e48;
        NLETrackSlot nLETrackSlotLLLLLLIL;
        SpeedViewModel speedViewModel;
        NLECurveSpeedCalculator nLECurveSpeedCalculator;
        if (this.LL.getAcceptPlayerProgress() && (c0e48 = this.LL.editorContext) != null && (nLETrackSlotLLLLLLIL = c0e48.LLLLLLIL()) != null && (nLECurveSpeedCalculator = (speedViewModel = this.LL).nleCurveSpeedCalculator) != null) {
            long j = this.LLILLJJLI;
            int i = this.LLILLL;
            long startTime = j - nLETrackSlotLLLLLLIL.getStartTime();
            if (startTime >= 0 && (i != 1 || startTime <= speedViewModel.dstDuration())) {
                float fSequenceDelToSegmentDel = nLECurveSpeedCalculator.sequenceDelToSegmentDel(startTime) / speedViewModel.srcDuration();
                if (i == 0) {
                    speedViewModel.getPlayProgress().setValue(Float.valueOf(Math.min(fSequenceDelToSegmentDel, 1.0f)));
                }
            }
        }
        return Unit.LIZ;
    }
}

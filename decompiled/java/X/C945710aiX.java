package X;

import android.os.Handler;
import android.view.View;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.tiktok.kmp.live.socialgamebusinessapi.event.MultiLetsDanceOpenCameraEvent;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0aiX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C945710aiX extends C09AY implements Function2<View, C1391990mKL, Unit> {
    public final /* synthetic */ Handler LL;
    public final /* synthetic */ Runnable LLILLJJLI;
    public final /* synthetic */ C259800zU<Runnable> LLILLL;
    public final /* synthetic */ DataChannel LLILZ;
    public final /* synthetic */ Function0<Unit> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C945710aiX(BPEAHandler bPEAHandler, RunnableC945690aiV runnableC945690aiV, C259800zU c259800zU, DataChannel dataChannel, Function0 function0) {
        super(2);
        this.LL = bPEAHandler;
        this.LLILLJJLI = runnableC945690aiV;
        this.LLILLL = c259800zU;
        this.LLILZ = dataChannel;
        this.LLILZIL = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(View view, C1391990mKL c1391990mKL) {
        this.LL.removeCallbacks(this.LLILLJJLI);
        Runnable runnable = this.LLILLL.element;
        if (runnable != null) {
            this.LL.removeCallbacks(runnable);
        }
        this.LLILZ.FQ2(MultiLetsDanceOpenCameraEvent.class);
        Function0<Unit> function0 = this.LLILZIL;
        if (function0 != null) {
            function0.invoke();
        }
        C945730aiZ c945730aiZ = C945730aiZ.LIZ;
        DataChannel dataChannel = this.LLILZ;
        c945730aiZ.getClass();
        C945730aiZ.LIZIZ(dataChannel, "turn_on");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("action_type", "turn_on_camera");
        C946950akX.LJIIIIZZ("camera_request_result", linkedHashMap);
        return Unit.LIZ;
    }
}

package X;

import android.os.Handler;
import android.view.View;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.tiktok.kmp.live.socialgamebusinessapi.event.MultiLetsDanceNotOpenCameraEvent;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0aiW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C945700aiW extends C09AY implements Function2<View, C1391990mKL, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ Handler LLILLL;
    public final /* synthetic */ Runnable LLILZ;
    public final /* synthetic */ C259800zU<Runnable> LLILZIL;
    public final /* synthetic */ DataChannel LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C945700aiW(String str, String str2, BPEAHandler bPEAHandler, RunnableC945690aiV runnableC945690aiV, C259800zU c259800zU, DataChannel dataChannel) {
        super(2);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = bPEAHandler;
        this.LLILZ = runnableC945690aiV;
        this.LLILZIL = c259800zU;
        this.LLILZLL = dataChannel;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(View view, C1391990mKL c1391990mKL) {
        String str;
        if (Intrinsics.LJFF(this.LL, "click_join")) {
            if (this.LLILLJJLI == null) {
                str = "join";
            } else {
                str = "join_from_fe";
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("action_type", str);
            linkedHashMap.put("client_fail_reason", "camera_off");
            C946950akX.LJIIIIZZ("click_join_fail", linkedHashMap);
        } else {
            String str2 = this.LL;
            if (str2 == null) {
                str2 = "";
            }
            C946950akX.LIZIZ(str2, "fail", "camera_off", 8);
        }
        this.LLILLL.removeCallbacks(this.LLILZ);
        Runnable runnable = this.LLILZIL.element;
        if (runnable != null) {
            this.LLILLL.removeCallbacks(runnable);
        }
        this.LLILZLL.FQ2(MultiLetsDanceNotOpenCameraEvent.class);
        C945730aiZ c945730aiZ = C945730aiZ.LIZ;
        DataChannel dataChannel = this.LLILZLL;
        c945730aiZ.getClass();
        C945730aiZ.LIZIZ(dataChannel, "not_now");
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("action_type", "not_now");
        C946950akX.LJIIIIZZ("camera_request_result", linkedHashMap2);
        return Unit.LIZ;
    }
}

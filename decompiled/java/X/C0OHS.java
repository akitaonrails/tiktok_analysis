package X;

import Y.ARunnableS1S0220000_9;
import android.graphics.Bitmap;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ttve.model.VEFrame;
import com.ss.android.ugc.aweme.tako.camera.record.pageui.TakoRecordUIAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0OHS, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OHS extends C09AY implements Function2<VEFrame, Integer, Unit> {
    public final /* synthetic */ TakoRecordUIAssem LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0OHS(TakoRecordUIAssem takoRecordUIAssem, boolean z, boolean z2) {
        super(2);
        this.LL = takoRecordUIAssem;
        this.LLILLJJLI = z;
        this.LLILLL = z2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(VEFrame vEFrame, Integer num) {
        num.intValue();
        Bitmap bitmap = vEFrame.toBitmap();
        HandlerHook.viewPost(this.LL.getContentView(), new ARunnableS1S0220000_9(this.LL, this.LLILLJJLI, this.LLILLL, bitmap, 1));
        return Unit.LIZ;
    }
}

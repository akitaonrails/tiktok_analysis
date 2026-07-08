package X;

import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Handler;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0k58, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1305680k58 extends C09AY implements Function1<C838040WuA, Unit> {
    public final /* synthetic */ CameraManager LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ CameraDevice.StateCallback LLILLL;
    public final /* synthetic */ Handler LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1305680k58(CameraManager cameraManager, String str, CameraDevice.StateCallback stateCallback, BPEAHandler bPEAHandler) {
        super(1);
        this.LL = cameraManager;
        this.LLILLJJLI = str;
        this.LLILLL = stateCallback;
        this.LLILZ = bPEAHandler;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C838040WuA c838040WuA) throws Throwable {
        C2204961BRm.LJJLIIJ(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, new C0WZX("dzBzEgAjS8/YVFkiQFyGdpIIcIGkM9tlnBcBz8JkU7S83oC39JceYzy+GBSptlI1", null));
        return Unit.LIZ;
    }
}

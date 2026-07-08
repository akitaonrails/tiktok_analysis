package X;

import com.ss.android.ugc.asve.recorder.camera.VECameraController;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0wRH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1780690wRH extends C09AY implements Function0<Unit> {
    public final /* synthetic */ VECameraController LL;
    public final /* synthetic */ float LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ boolean LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1780690wRH(VECameraController vECameraController, float f, int i, boolean z) {
        super(0);
        this.LL = vECameraController;
        this.LLILLJJLI = f;
        this.LLILLL = i;
        this.LLILZ = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        VECameraController vECameraController = this.LL;
        float f = this.LLILLJJLI;
        vECameraController.LLLFF = f;
        List<InterfaceC1780680wRG> list = vECameraController.LLLILZ;
        int i = this.LLILLL;
        boolean z = this.LLILZ;
        Iterator it2 = ((ArrayList) list).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1780680wRG) it2.next()).LIZLLL(f, i, z);
        }
        return Unit.LIZ;
    }
}

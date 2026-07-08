package X;

import android.app.Activity;
import android.content.Intent;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;

/* JADX INFO: renamed from: X.0wzB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1801710wzB {
    public final InterfaceC1801690wz9 LIZ;
    public final CompletionBlock<InterfaceC1801700wzA> LIZIZ;

    public final void LIZ(Activity activity) throws Throwable {
        float fFloatValue;
        Number aspectRatio;
        if (activity == null) {
            return;
        }
        InterfaceC1801660wz6 cameraParams = this.LIZ.getCameraParams();
        if (cameraParams != null && (aspectRatio = cameraParams.getAspectRatio()) != null) {
            fFloatValue = aspectRatio.floatValue();
        } else {
            fFloatValue = 1.0f;
        }
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(activity, "//studio/takephoto");
        smartRouteBuildRoute.withParam("capture", 1);
        Intent intentBuildIntent = smartRouteBuildRoute.buildIntent();
        if (intentBuildIntent == null) {
            C2382909Vj.LIZ(this.LIZIZ, 1, "Route build failed", null, 4);
            return;
        }
        intentBuildIntent.addFlags(3);
        intentBuildIntent.putExtra("aspect", fFloatValue);
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activity, intentBuildIntent, "Activity_startActivityForResult_2");
        C1701330uNH.LIZ(intentBuildIntent, activity);
        C2204961BRm.LJIIZILJ(1, activity, intentBuildIntent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmtd4vH0jV94RXyEcjXch6i+1BXlFkiLhSIQAoixxJ2wQwvyMBFBCexhg==", null));
    }

    public C1801710wzB(InterfaceC1801690wz9 interfaceC1801690wz9, CompletionBlock<InterfaceC1801700wzA> completionBlock) {
        this.LIZ = interfaceC1801690wz9;
        this.LIZIZ = completionBlock;
    }
}

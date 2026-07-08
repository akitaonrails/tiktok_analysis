package X;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.os.PowerManager;
import android.provider.Settings;
import android.view.OrientationEventListener;
import android.view.View;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.multiguestv3.util.MultiGuestDialogManager;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.lynx.spark.schema.model.SparkPopupSchemaParam;
import com.bytedance.lynx.spark.schema.model.SparkSchemaParam;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: X.0Igb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C472910Igb {
    public final Context LIZ;
    public long LIZJ;
    public boolean LJ;
    public boolean LJFF;
    public final C472920Igc LJII;
    public WeakReference<C0IG9> LJIIIIZZ;
    public int LIZIZ = -1;
    public final AtomicInteger LIZLLL = new AtomicInteger(-1);
    public EnumC472930Igd LJI = EnumC472930Igd.IDLE;

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0Igc] */
    public C472910Igb(C19EG c19eg) {
        this.LIZ = c19eg;
        final Context contextLJII = C497740JfY.LJII();
        this.LJII = new OrientationEventListener(contextLJII) { // from class: X.0Igc
            /* JADX WARN: Removed duplicated region for block: B:85:0x011d  */
            @Override // android.view.OrientationEventListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onOrientationChanged(int r11) {
                /*
                    Method dump skipped, instruction units count: 320
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C472920Igc.onOrientationChanged(int):void");
            }
        };
    }

    public final void LIZ(int i) {
        int requestedOrientation;
        Context context;
        PowerManager powerManager;
        WeakReference<C0IG9> weakReference;
        C0IG9 c0ig9;
        C19EG c19egLJ;
        Boolean boolValueOf;
        boolean z;
        C19EG c19egLJ2;
        if (Settings.System.getInt(C497740JfY.LJII().getContentResolver(), "accelerometer_rotation", 0) != 1 || this.LIZLLL.get() == i) {
            return;
        }
        Context context2 = this.LIZ;
        if (context2 != null && (c19egLJ2 = C500260Jjc.LJ(context2)) != null) {
            requestedOrientation = c19egLJ2.getRequestedOrientation();
        } else {
            requestedOrientation = 1;
        }
        if ((requestedOrientation == i || (C500260Jjc.LJJII(i) && requestedOrientation != 1)) && (context = this.LIZ) != null) {
            C0IKH c0ikhLIZJ = C0IKG.LIZJ(context.getClass().getSimpleName());
            if ((c0ikhLIZJ != null && c0ikhLIZJ.mt()) || C464800IKo.LIZ.LJIIJ(false)) {
                return;
            }
            MultiGuestDialogManager multiGuestDialogManagerLIZ = C922410a6x.LIZ();
            if ((multiGuestDialogManagerLIZ != null && ((ArrayList) multiGuestDialogManagerLIZ.LLIZ).size() > 0) || ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).w9()) {
                return;
            }
            C1529870puj.LIZ.getClass();
            Iterator it2 = ((LinkedHashMap) C1529870puj.LIZJ()).entrySet().iterator();
            while (true) {
                SparkSchemaParam sparkSchemaParamLJJJI = null;
                if (it2.hasNext()) {
                    InterfaceC1541990qEH interfaceC1541990qEH = (InterfaceC1541990qEH) ((Reference) ((Map.Entry) it2.next()).getValue()).get();
                    if (interfaceC1541990qEH != null) {
                        View viewE1 = interfaceC1541990qEH.e1();
                        if (viewE1 != null) {
                            if (viewE1.getGlobalVisibleRect(new Rect()) && viewE1.getWidth() > 0 && viewE1.getHeight() > 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            boolValueOf = Boolean.valueOf(z);
                        } else {
                            boolValueOf = null;
                        }
                        if (C500260Jjc.LJJJI(boolValueOf) && (interfaceC1541990qEH.getHybridContext() instanceof SparkContext)) {
                            SparkContext sparkContext = (SparkContext) interfaceC1541990qEH.getHybridContext();
                            if (sparkContext != null) {
                                C1529880puk c1529880puk = SparkContext.Companion;
                                sparkSchemaParamLJJJI = sparkContext.LJJJI(-1);
                            }
                            if (sparkSchemaParamLJJJI instanceof SparkPopupSchemaParam) {
                                return;
                            }
                        }
                    }
                } else {
                    Object objH2 = C786410Ut5.H2(context, "power");
                    if (!(objH2 instanceof PowerManager) || (powerManager = (PowerManager) objH2) == null || !powerManager.isInteractive()) {
                        return;
                    }
                    if ((Build.VERSION.SDK_INT < 24 || (c19egLJ = C500260Jjc.LJ(context)) == null || !c19egLJ.isInPictureInPictureMode()) && (weakReference = this.LJIIIIZZ) != null && (c0ig9 = weakReference.get()) != null) {
                        c0ig9.LIZ(i);
                        return;
                    }
                    return;
                }
            }
        }
    }
}

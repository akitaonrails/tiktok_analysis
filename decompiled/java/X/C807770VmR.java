package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.bytedance.ammt.mmt.impl.GraphicMMTPlugin;
import com.bytedance.ammt.mmt.impl.NativeMMTPlugin;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0VmR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C807770VmR extends BroadcastReceiver {
    public static void LIZ(Context context, Intent intent) {
        String stringExtra;
        GraphicMMTPlugin graphicMMTPluginLIZJ;
        if ("com.bytedance.ammt.mmt.DUMP".equals(intent.getAction())) {
            String stringExtra2 = null;
            try {
                stringExtra = intent.getStringExtra("type");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                stringExtra = null;
            }
            if (stringExtra.equals("native")) {
                if (NativeMMTPlugin.LIZLLL == null) {
                    synchronized (NativeMMTPlugin.class) {
                        try {
                            NativeMMTPlugin.LIZLLL = new NativeMMTPlugin();
                        } finally {
                            TryCatchGuardChecker.doCheck(th);
                        }
                    }
                }
                NativeMMTPlugin nativeMMTPlugin = NativeMMTPlugin.LIZLLL;
                if (nativeMMTPlugin != null && nativeMMTPlugin.LIZ) {
                    C803080Ves.LIZIZ();
                    String strLIZ = C803080Ves.LIZ(context);
                    try {
                        String stringExtra3 = intent.getStringExtra("output");
                        if (stringExtra3 != null) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append(strLIZ);
                            sbLIZ.append(File.separator);
                            sbLIZ.append(NativeMMTPlugin.LJ);
                            nativeMMTPlugin.LIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                            nativeMMTPlugin.LIZJ = stringExtra3;
                        }
                    } catch (Exception th) {
                    }
                    nativeMMTPlugin.LIZ();
                }
            }
            try {
                stringExtra2 = intent.getStringExtra("type");
            } catch (Exception th2) {
            }
            if (stringExtra2.equals("graphic") && (graphicMMTPluginLIZJ = GraphicMMTPlugin.LIZJ()) != null && graphicMMTPluginLIZJ.LIZ) {
                C803080Ves.LIZIZ();
                String strLIZ2 = C803080Ves.LIZ(context);
                try {
                    String stringExtra4 = intent.getStringExtra("output");
                    if (stringExtra4 != null) {
                        graphicMMTPluginLIZJ.LJFF(strLIZ2, stringExtra4);
                    }
                } catch (Exception th22) {
                }
                graphicMMTPluginLIZJ.LIZIZ();
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (!C2214201BlK.LJIIJJI && intent != null) {
            if (!((ArrayList) C788530UwV.LIZ).contains(intent.getAction()) && C788530UwV.LIZ("onBroadcastReceiverReceive")) {
                C2188191AkT.LIZIZ();
            }
        }
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            LIZ(context, intent);
        } else {
            C2408409cA.LIZ();
            LIZ(context, intent);
        }
    }
}

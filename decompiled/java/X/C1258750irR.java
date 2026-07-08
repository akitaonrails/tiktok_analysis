package X;

import android.os.Process;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.common.jato.JatoXL;
import com.bytedance.common.jato.gfx.DoFrameController;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;

/* JADX INFO: renamed from: X.0irR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1258750irR {
    public static boolean LIZLLL;
    public final boolean LIZ;
    public String LIZIZ;
    public final C207293169r LIZJ;

    public final String LIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("profile_");
        String str = this.LIZIZ;
        if (str == null) {
            str = "";
        }
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.0VWC, X.169r] */
    public C1258750irR(boolean z, String str, RecyclerView recyclerView) {
        this.LIZ = z;
        this.LIZIZ = str;
        ?? r2 = new C0VWC() { // from class: X.169r
            @Override // X.C0VWC
            public final void LJIIJ(String str2) {
                C1258750irR.LIZLLL = true;
                if (C1702430uP3.LJFF) {
                    C2187451AjH.LJFF(Mp4ScreenVideoLoadTimeout.CONTROL);
                }
                C2187451AjH.LJII(Mp4ScreenVideoLoadTimeout.CONTROL, true);
                C2187451AjH.LJJI(Mp4ScreenVideoLoadTimeout.CONTROL);
                ((Boolean) C0C3Y.LIZIZ.getValue()).booleanValue();
                if (((Boolean) C0C3Y.LIZJ.getValue()).booleanValue()) {
                    JatoXL.setPriority(Process.myTid(), -20);
                    JatoXL.boostRenderThread(C1BWL.LIZ(), -20);
                }
                if (((Boolean) C0C3Y.LIZLLL.getValue()).booleanValue()) {
                    C2187451AjH.LJ(1000L);
                }
            }

            @Override // X.C0VWC
            public final void onStop(String str2) {
                String str3;
                C1258750irR.LIZLLL = false;
                InterfaceC1602960roc interfaceC1602960rocLIZIZ = C0VWN.LIZIZ(this.LIZ.LIZ());
                if (interfaceC1602960rocLIZIZ != null) {
                    if (this.LIZ.LIZ) {
                        str3 = "personal_homepage";
                    } else {
                        str3 = "others_homepage";
                    }
                    interfaceC1602960rocLIZIZ.LIZ("enter_from", str3);
                }
                if (C1702430uP3.LJFF) {
                    C2187451AjH.LJJIIJZLJL();
                }
                C2187451AjH.LJJIIZ();
                DoFrameController.LIZIZ = 0;
                if (((Boolean) C0C3Y.LIZJ.getValue()).booleanValue()) {
                    JatoXL.resetPriority(Process.myTid());
                    JatoXL.resetRenderThread();
                }
            }
        };
        this.LIZJ = r2;
        InterfaceC1602960roc interfaceC1602960rocLIZ = C0VWN.LIZ(LIZ(), false);
        interfaceC1602960rocLIZ.LJIIJ(r2);
        interfaceC1602960rocLIZ.LIZIZ(recyclerView);
    }
}

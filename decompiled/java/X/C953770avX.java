package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.common.multicanvas.tools.MultiCanvasUtils;
import com.bytedance.android.livesdkapi.host.editor.IHostMultiCanvas;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0avX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C953770avX {
    public static final int LJIILL;
    public long LIZJ;
    public boolean LJIIJJI;
    public String LJIILIIL;
    public boolean LJIILJJIL;
    public int LIZ = 2;
    public String LIZIZ = "";
    public String LIZLLL = "";
    public String LJ = "";
    public boolean LJFF = true;
    public List<C971360bNu> LJI = new ArrayList();
    public String LJII = "";
    public int LJIIIIZZ = 1;
    public String LJIIIZ = "";
    public String LJIIJ = "";
    public Long LJIIL = 0L;

    static {
        Integer num = (Integer) C13LP.LJJJLZIJ(0, C971490bO7.LIZ);
        LJIILL = num != null ? num.intValue() : -1;
    }

    public final String LIZIZ() {
        int i = this.LIZ;
        return i != 1 ? i != 2 ? i != 3 ? this.LIZIZ : this.LIZIZ : this.LIZIZ : "preview_id";
    }

    public final void LIZJ() {
        IHostMultiCanvas iHostMultiCanvas = (IHostMultiCanvas) C1161920gLG.LIZJ(IHostMultiCanvas.class);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LIZIZ());
        sbLIZ.append(File.separator);
        sbLIZ.append("content_image.webp");
        File fileFM2 = iHostMultiCanvas.fM2(C2188811AlT.LIZIZ(sbLIZ), false);
        if (fileFM2.exists()) {
            this.LJ = fileFM2.getAbsolutePath();
        }
    }

    public final String toString() {
        try {
            String strLJIIIIZZ = C2348809Ig.LJIIIIZZ(this);
            return strLJIIIIZZ != null ? strLJIIIIZZ : "";
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return "";
        }
    }

    public final C953770avX LIZ(int i) {
        C953770avX c953770avX = (C953770avX) C2348809Ig.LJ(toString(), C953770avX.class);
        if (c953770avX != null) {
            c953770avX.LIZIZ = C1017903yT.LIZ();
            c953770avX.LIZ = i;
            c953770avX.LIZJ = System.currentTimeMillis();
            if (!a0.LJJJIL(c953770avX.LJ)) {
                C0VSJ c0vsj = new C0VSJ(c953770avX.LJ);
                IHostMultiCanvas iHostMultiCanvas = (IHostMultiCanvas) C1161920gLG.LIZJ(IHostMultiCanvas.class);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(c953770avX.LIZIZ());
                sbLIZ.append(File.separator);
                sbLIZ.append("content_image.");
                sbLIZ.append(C08QA.LJIJ(c0vsj));
                File fileFM2 = iHostMultiCanvas.fM2(C2188811AlT.LIZIZ(sbLIZ), false);
                MultiCanvasUtils.LIZ.getClass();
                MultiCanvasUtils.LJ(c0vsj, fileFM2);
                c953770avX.LJ = fileFM2.getAbsolutePath();
            }
            if (c953770avX.LIZLLL.length() > 0) {
                C0VSJ c0vsj2 = new C0VSJ(c953770avX.LIZLLL);
                IHostMultiCanvas iHostMultiCanvas2 = (IHostMultiCanvas) C1161920gLG.LIZJ(IHostMultiCanvas.class);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(c953770avX.LIZIZ());
                sbLIZ2.append(File.separator);
                sbLIZ2.append("origin_image.");
                sbLIZ2.append(C08QA.LJIJ(c0vsj2));
                File fileFM22 = iHostMultiCanvas2.fM2(C2188811AlT.LIZIZ(sbLIZ2), false);
                MultiCanvasUtils.LIZ.getClass();
                MultiCanvasUtils.LJ(c0vsj2, fileFM22);
                c953770avX.LIZLLL = fileFM22.getAbsolutePath();
            }
            return c953770avX;
        }
        return null;
    }
}

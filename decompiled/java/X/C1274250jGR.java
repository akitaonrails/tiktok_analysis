package X;

import android.content.Context;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.ttlivestreamer.livestreamv2.sdkparams.VPassInteractCfg;
import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: renamed from: X.0jGR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1274250jGR {
    public final String LIZ;
    public String LIZIZ;
    public EnumC1275210jHz LIZJ;
    public final Context LIZLLL;
    public final WeakReference<AbstractC1273900jFs> LJ;
    public final VPassInteractCfg LJFF;
    public final C1266700j4G LJI;

    public final AbstractC1273900jFs LIZ() {
        return this.LJ.get();
    }

    public final void LIZIZ() {
        List<String> listLLIILII;
        if (LIZ() == null || (listLLIILII = LIZ().LLIILII()) == null || listLLIILII.size() < 1) {
            return;
        }
        this.LIZIZ = (String) ListProtector.get(listLLIILII, 0);
    }

    public C1274250jGR(AbstractC1273900jFs abstractC1273900jFs) {
        this.LJ = new WeakReference<>(null);
        this.LJFF = abstractC1273900jFs.LLD().LIZ.mVPassInteractCfg;
        C1269340j8W c1269340j8WLLD = abstractC1273900jFs.LLD();
        this.LJ = new WeakReference<>(abstractC1273900jFs);
        if (abstractC1273900jFs instanceof C1268630j7N) {
            this.LJI = ((C1268630j7N) abstractC1273900jFs).LLJIJIL;
        }
        this.LIZLLL = c1269340j8WLLD.LJLJI.LJIIZILJ;
        c1269340j8WLLD.LJIIJ();
        this.LIZ = abstractC1273900jFs.LLD().LJJI();
        this.LIZIZ = "";
        LIZIZ();
    }
}

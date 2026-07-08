package X;

import android.app.Application;
import ayh.ge;
import com.bef.effectsdk.ResourceFinder;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.asve.context.PreviewSize;
import com.ss.android.ugc.effectmanager.DownloadableModelSupportResourceFinder;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.jvm.internal.AFwS223S0000000_32;
import kotlin.jvm.internal.AFwS224S0000000_33;
import kotlin.jvm.internal.AwS574S0100000_30;

/* JADX INFO: renamed from: X.1Bce, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2208821Bce implements InterfaceC1656380tCm {
    public final Gson LIZ;
    public final C2208671BcP LIZIZ;
    public final ResourceFinder LIZJ;
    public final C2216151BoT LIZLLL;
    public final C01GW LJ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(3834));
    public final ExecutorService LJFF = C2126108Up.LIZ;
    public final C01GW LJI = C452501pT.LIZIZ(new AwS574S0100000_30(this, 339));
    public final C01GW LJII = C452501pT.LIZIZ(AFwS224S0000000_33.get$arr$(578));
    public final C01GW LJIIIIZZ = C452501pT.LIZIZ(AFwS223S0000000_32.get$arr$(201));
    public final C0VSJ LJIIIZ;

    public final InterfaceC2216251Bod LIZIZ() {
        return (InterfaceC2216251Bod) this.LJI.getValue();
    }

    public final boolean LIZJ() {
        return ((Boolean) this.LJ.getValue()).booleanValue();
    }

    public final PreviewSize LIZLLL() {
        Gson gson = this.LIZ;
        String strLIZ = ge.LIZ();
        Object objLJII = null;
        if (!(strLIZ == null || strLIZ.length() == 0)) {
            try {
                objLJII = gson.LJII(strLIZ, PreviewSize.class);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return (PreviewSize) objLJII;
    }

    public final Map<String, Object> LJ() {
        C2208671BcP c2208671BcP = this.LIZIZ;
        if (!c2208671BcP.LIZJ.isEmpty()) {
            return c2208671BcP.LIZJ;
        }
        C0MZY.LIZ.getClass();
        C0MZY.LIZJ();
        return c2208671BcP.LIZJ;
    }

    public static C2189111Alx LIZ(Map map) {
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        int iIntValue4 = 0;
        if (map != null && !map.isEmpty()) {
            Integer num = (Integer) map.get("page_mode");
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = -1;
            }
            Integer num2 = (Integer) map.get("lower_fps_min_side_threshold");
            if (num2 != null) {
                iIntValue2 = num2.intValue();
            } else {
                iIntValue2 = 0;
            }
            Integer num3 = (Integer) map.get("higher_fps_min_side_threshold");
            if (num3 != null) {
                iIntValue3 = num3.intValue();
            } else {
                iIntValue3 = 0;
            }
            Integer num4 = (Integer) map.get("higher_fps_threshold");
            if (num4 != null) {
                iIntValue4 = num4.intValue();
            }
            return new C2189111Alx(iIntValue, iIntValue2, iIntValue3, iIntValue4);
        }
        return null;
    }

    public C2208821Bce(Application application, Gson gson, C2208671BcP c2208671BcP, DownloadableModelSupportResourceFinder downloadableModelSupportResourceFinder, C2216151BoT c2216151BoT) {
        this.LIZ = gson;
        this.LIZIZ = c2208671BcP;
        this.LIZJ = downloadableModelSupportResourceFinder;
        this.LIZLLL = c2216151BoT;
        this.LJIIIZ = new C0VSJ(application.getFilesDir(), "vesdk");
    }
}

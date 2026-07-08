package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.ttvideoengine.fetcher.VideoInfoFetcher;
import fyo.e;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.0oW5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C1476150oW5 {
    public String LIZ;
    public C1470240oMY LIZIZ;
    public long LIZJ;
    public int LIZLLL;
    public VideoInfoFetcher LJFF;
    public C1476380oWS LJI;
    public String LJII;
    public C1476190oW9 LJIIIZ;
    public C1475600oVC LJIIJ;
    public boolean LJIIJJI;
    public String LJIIL;
    public String LJIILIIL;
    public int LJIILL;
    public EnumC2281151EQn LJ = EnumC2281151EQn.Undefine;
    public String LJIIIIZZ = "";
    public int LJIILJJIL = -1;
    public final List<C1476320oWM> LJIILLIIL = new CopyOnWriteArrayList();

    public final InterfaceC1475560oV8 LIZJ() {
        InterfaceC1475560oV8 interfaceC1475560oV8;
        C1475600oVC c1475600oVC = this.LJIIJ;
        if (c1475600oVC != null && (interfaceC1475560oV8 = c1475600oVC.LJIIJ) != null) {
            return interfaceC1475560oV8;
        }
        C1476380oWS c1476380oWS = this.LJI;
        if (c1476380oWS != null) {
            c1476380oWS.getClass();
            return null;
        }
        C1476190oW9 c1476190oW9 = this.LJIIIZ;
        if (c1476190oW9 != null) {
            return c1476190oW9.LJIIJ;
        }
        return null;
    }

    public final void LIZ(int i) {
        if (LIZJ() != null) {
            C1475490oV1 c1475490oV1 = new C1475490oV1(3);
            c1475490oV1.LIZJ = new e("kTTVideoErrorDomainDataLoaderPreload", i);
            LIZJ().LIZ(c1475490oV1);
        }
    }

    public final C1476320oWM LIZIZ(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        C1476320oWM c1476320oWMLIZLLL = LIZLLL(str);
        if (c1476320oWMLIZLLL == null) {
            C1476320oWM c1476320oWM = new C1476320oWM();
            c1476320oWM.LIZ = str;
            ((CopyOnWriteArrayList) this.LJIILLIIL).add(c1476320oWM);
            return c1476320oWM;
        }
        return c1476320oWMLIZLLL;
    }

    public final C1476320oWM LIZLLL(String str) {
        if (((CopyOnWriteArrayList) this.LJIILLIIL).size() > 0) {
            for (int i = 0; i < ((CopyOnWriteArrayList) this.LJIILLIIL).size(); i++) {
                C1476320oWM c1476320oWM = (C1476320oWM) ListProtector.get(this.LJIILLIIL, i);
                if (c1476320oWM.LIZ.equals(str)) {
                    return c1476320oWM;
                }
            }
        }
        return null;
    }

    public final void LJ(String str, EnumC2281151EQn enumC2281151EQn, long j) {
        if (((CopyOnWriteArrayList) this.LJIILLIIL).size() == 0) {
            C1476320oWM c1476320oWM = new C1476320oWM();
            c1476320oWM.LIZ = str;
            c1476320oWM.LIZJ = enumC2281151EQn;
            c1476320oWM.LJIIIZ = j;
            ((CopyOnWriteArrayList) this.LJIILLIIL).add(c1476320oWM);
        } else {
            int i = C2187451AjH.LIZ;
            C1471660oOq.LIZIZ("DataLoaderHelper", "[preload] DataLoaderTaskItem setup fail");
        }
        this.LJ = enumC2281151EQn;
        this.LIZJ = j;
    }
}

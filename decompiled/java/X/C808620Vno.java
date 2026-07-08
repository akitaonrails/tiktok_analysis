package X;

import android.content.Context;
import android.content.Intent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0Vno, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C808620Vno implements InterfaceC808630Vnp {
    public static volatile C808620Vno LIZIZ;
    public List<InterfaceC808630Vnp> LIZ = Collections.emptyList();

    @Override // X.InterfaceC808630Vnp
    public final void LIZLLL() {
    }

    public static C808620Vno LJI() {
        if (LIZIZ == null) {
            synchronized (C808620Vno.class) {
                try {
                    if (LIZIZ == null) {
                        LIZIZ = new C808620Vno();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZIZ;
    }

    @Override // X.InterfaceC808640Vnq
    public final void LIZIZ() {
        List<InterfaceC808630Vnp> list = this.LIZ;
        if (list != null) {
            Iterator<InterfaceC808630Vnp> it2 = list.iterator();
            while (it2.hasNext()) {
                try {
                    it2.next().LIZIZ();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
        }
    }

    @Override // X.InterfaceC808640Vnq
    public final void LJ(Intent intent) {
        List<InterfaceC808630Vnp> list = this.LIZ;
        if (list != null) {
            Iterator<InterfaceC808630Vnp> it2 = list.iterator();
            while (it2.hasNext()) {
                try {
                    it2.next().LJ(intent);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
        }
    }

    @Override // X.InterfaceC808640Vnq
    public final void LJFF(Context context) {
        List<InterfaceC808630Vnp> list = this.LIZ;
        if (list != null) {
            Iterator<InterfaceC808630Vnp> it2 = list.iterator();
            while (it2.hasNext()) {
                try {
                    it2.next().LJFF(context);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
        }
    }

    @Override // X.InterfaceC808630Vnp
    public final void LIZ(Context context, Map<String, String> map) {
        List<InterfaceC808630Vnp> list = this.LIZ;
        if (list != null) {
            Iterator<InterfaceC808630Vnp> it2 = list.iterator();
            while (it2.hasNext()) {
                try {
                    it2.next().LIZ(context, map);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
        }
    }

    @Override // X.InterfaceC808630Vnp
    public final void LIZJ(Context context, C809130Vod c809130Vod) {
        new Object() { // from class: X.0Vnr
        };
        List<InterfaceC808630Vnp> list = this.LIZ;
        if (list != null) {
            for (InterfaceC808630Vnp interfaceC808630Vnp : list) {
                try {
                    interfaceC808630Vnp.LIZLLL();
                    interfaceC808630Vnp.LIZJ(context, c809130Vod);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
        }
    }
}

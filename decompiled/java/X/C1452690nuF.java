package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.vesdk.VEUserConfig;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: renamed from: X.0nuF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1452690nuF {
    public static final LinkedBlockingQueue<C1463670oBx> LIZ = new LinkedBlockingQueue<>();
    public static final LinkedBlockingQueue<C1463670oBx> LIZIZ = new LinkedBlockingQueue<>();

    static {
        C1450870nrJ.LIZIZ();
        C1450870nrJ.LIZIZ();
    }

    public static C1463670oBx LIZ(String str) {
        C00CM c00cm = C00CM.NLEEditorType;
        VEUserConfig vEUserConfig = new VEUserConfig();
        EnumC1463710oC1 enumC1463710oC1 = EnumC1463710oC1.ConfigID_UseImageAllocator;
        Boolean bool = Boolean.TRUE;
        vEUserConfig.addConfig(new VEUserConfig.VEUserConfigItem<>(enumC1463710oC1, bool));
        vEUserConfig.addConfig(new VEUserConfig.VEUserConfigItem<>(EnumC1463710oC1.ConfigID_LoadImageOptimize, bool));
        InterfaceC1452930nud interfaceC1452930nud = C1452830nuT.LIZ;
        if (interfaceC1452930nud == null) {
            interfaceC1452930nud = null;
        }
        C1463670oBx c1463670oBxLIZ = ((C1452950nuf) ((C1452810nuR) interfaceC1452930nud).LIZ).LIZ(null, new C1452970nuh(c00cm, str, 0L, vEUserConfig, C350510Dof.LIZ(), EnumC1441790ncf.DEFAULT.getValue(), false, EnumC1441860ncm.UPLOAD_ONLY_IMAGE.getValue(), 3092));
        c1463670oBxLIZ.df(new InterfaceC1464200oCo() { // from class: X.0nuN
            @Override // X.InterfaceC1464200oCo
            public final void onCallback(int i, int i2, float f, String str2) {
            }
        });
        c1463670oBxLIZ.prepare();
        return c1463670oBxLIZ;
    }

    public static C1463670oBx LIZIZ(LinkedBlockingQueue linkedBlockingQueue, String str) {
        synchronized (linkedBlockingQueue) {
            try {
                if (!linkedBlockingQueue.isEmpty()) {
                    return (C1463670oBx) linkedBlockingQueue.take();
                }
                return LIZ(str);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static void LIZJ(C1463670oBx c1463670oBx, boolean z) {
        LinkedBlockingQueue<C1463670oBx> linkedBlockingQueue = LIZ;
        synchronized (linkedBlockingQueue) {
            try {
                if (z) {
                    LIZIZ.offer(c1463670oBx);
                } else {
                    linkedBlockingQueue.offer(c1463670oBx);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}

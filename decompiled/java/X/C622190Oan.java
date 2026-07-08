package X;

import Y.ARunnableS14S1100000_9;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.bulletin.db.api.IBulletinClientBridge;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.jvm.internal.AFwS195S0000000_9;

/* JADX INFO: renamed from: X.0Oan, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C622190Oan implements InterfaceC622260Oau {
    public static C0CTA LJ;
    public static InterfaceC622540ObM LJIIIZ;
    public static final C622190Oan LIZ = new C622190Oan();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(6017));
    public static final C622290Oax LIZJ = C622290Oax.LIZ;
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(656));
    public static final C01GW LJFF = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(658));
    public static final C01GW LJI = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(6018));
    public static final C01GW LJII = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(659));
    public static final C01GW LJIIIIZZ = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(657));
    public static final AtomicBoolean LJIIJ = new AtomicBoolean(false);

    public static InterfaceC619380ORc LJFF() {
        return (InterfaceC619380ORc) LJIIIIZZ.getValue();
    }

    public static final C0V4D LJI() {
        return (C0V4D) LJFF.getValue();
    }

    public static C0CT6 LJII() {
        return (C0CT6) LJI.getValue();
    }

    @Override // X.InterfaceC622260Oau
    public final IBulletinClientBridge LIZIZ() {
        return (IBulletinClientBridge) LJII.getValue();
    }

    @Override // X.InterfaceC622260Oau
    public final C622070Oab LIZJ() {
        return (C622070Oab) LIZLLL.getValue();
    }

    @Override // X.InterfaceC622260Oau
    public final C622290Oax LIZ() {
        return LIZJ;
    }

    @Override // X.InterfaceC622260Oau
    public final C0CTA LJ() {
        return LJ;
    }

    @Override // X.InterfaceC622260Oau
    public final void LIZLLL(String str) {
        if (LJIIJ.get()) {
            C622210Oap c622210Oap = new C622210Oap("db_repair", this);
            C622070Oab c622070OabLIZJ = LIZJ();
            c622070OabLIZJ.LIZ.LIZ();
            C622290Oax.LJFF("BulletinDBHelper", "onClose db");
            try {
                AbstractC622560ObO abstractC622560ObO = c622070OabLIZJ.LIZJ;
                if (abstractC622560ObO != null) {
                    abstractC622560ObO.close();
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                c622070OabLIZJ.LIZ.LIZ();
                C622290Oax.LIZJ("BulletinDBHelper", "onClose db error", e);
            }
            c622070OabLIZJ.LIZJ = null;
            c622070OabLIZJ.LIZIZ = null;
            ((ExecutorService) LJI().LIZLLL.getValue()).execute(new ARunnableS14S1100000_9(c622210Oap, str, 27));
        }
    }

    public final void LJIIIIZZ(C0CTA c0cta) {
        C622280Oaw c622280OawLIZIZ;
        C622290Oax.LJFF("BulletinClientCenter", "startInit");
        if (LJIIJ.compareAndSet(false, true)) {
            LJ = c0cta;
            IBulletinClientBridge iBulletinClientBridgeLIZIZ = LIZIZ();
            if (iBulletinClientBridgeLIZIZ != null) {
                c622280OawLIZIZ = iBulletinClientBridgeLIZIZ.LIZIZ();
            } else {
                c622280OawLIZIZ = null;
            }
            LJIIIZ = c622280OawLIZIZ;
            C23250099c.LIZLLL((InterfaceC497601wk) LIZIZ.getValue(), null, null, new C622180Oam(c0cta, new C622210Oap("db_init", this), null), 3);
            return;
        }
        C622290Oax.LJFF("BulletinClientCenter", "startInit bulletinClientCenter has been init");
    }
}

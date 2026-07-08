package X;

import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import com.ss.android.ugc.aweme.spi.TabSwitchMetricService;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hR4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1203960hR4 {
    public static C1204010hR9 LJIILLIIL;
    public static long LJIIZILJ;
    public final EnumC1204030hRB LIZ;
    public long LIZJ;
    public long LIZLLL;
    public long LJ;
    public long LJFF;
    public long LJI;
    public volatile boolean LJII;
    public volatile boolean LJIIIIZZ;
    public int LJIIIZ;
    public volatile int LJIIL;
    public volatile int LJIILIIL;
    public volatile long LJIILL;
    public long LIZIZ = SystemClock.elapsedRealtime();
    public String LJIIJ = "default";
    public EnumC1204410hRn LJIIJJI = EnumC1204410hRn.REFRESH;
    public volatile long LJIILJJIL = -1;

    public final void LIZ() {
        String sourceStr;
        if (this.LJIIIIZZ) {
            return;
        }
        this.LJIIIIZZ = true;
        if (this.LIZ.getReportQualityTrack() && LIZLLL(this.LIZ)) {
            LJIILLIIL = new C1204010hR9(this.LIZ, EnumC1203980hR6.REQUEST_FAIL);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("endWhenFailed，loadScene=");
        sbLIZ.append(this.LIZ.getSceneStr());
        C2188811AlT.LIZIZ(sbLIZ);
        C1201620hNI c1201620hNI = C1201620hNI.LIZ;
        String sceneStr = this.LIZ.getSceneStr();
        int i = this.LJIIIZ;
        String str = this.LJIIJ;
        EnumC1204410hRn enumC1204410hRn = this.LJIIJJI;
        c1201620hNI.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("tag", "page_load_end");
        c2344009Gk.LJIIIIZZ("load_scene", sceneStr);
        c2344009Gk.LIZJ(i, "is_cache");
        if (enumC1204410hRn == null || (sourceStr = enumC1204410hRn.getSourceStr()) == null) {
            sourceStr = "";
        }
        c2344009Gk.LJIIIIZZ("data_source", sourceStr);
        c2344009Gk.LIZJ(0, "is_success");
        c2344009Gk.LJIIIIZZ("error_type", str);
        C20684815ws.LJIILLIIL("nearby_experience_track", c2344009Gk.LIZ);
    }

    public final String LIZJ() {
        return this.LIZ.getSceneStr();
    }

    public final void LJI() {
        if (this.LJII) {
            return;
        }
        this.LJII = true;
        if (this.LIZ.getReportQualityTrack()) {
            LJIILLIIL = new C1204010hR9(this.LIZ, EnumC1203980hR6.REQUEST_START);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("start，loadScene=");
            sbLIZ.append(this.LIZ.getSceneStr());
            C2188811AlT.LIZIZ(sbLIZ);
            C1201620hNI c1201620hNI = C1201620hNI.LIZ;
            String sceneStr = this.LIZ.getSceneStr();
            c1201620hNI.getClass();
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("tag", "page_load_start");
            c2344009Gk.LJIIIIZZ("load_scene", sceneStr);
            C20684815ws.LJIILLIIL("nearby_experience_track", c2344009Gk.LIZ);
        }
        C1205260hTA c1205260hTA = C1205260hTA.LIZ;
        String sceneStr2 = this.LIZ.getSceneStr();
        c1205260hTA.getClass();
        C2344009Gk c2344009Gk2 = new C2344009Gk();
        c2344009Gk2.LJIIIIZZ("enter_method", sceneStr2);
        c2344009Gk2.LJIIIIZZ("enable_location", C1204880hSY.LIZ());
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        Map<String, String> map = c2344009Gk2.LIZ;
        c1185040gwY.getClass();
        C1185040gwY.LIZIZ("refresh_homepage_nearby", map, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0205  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ() {
        /*
            Method dump skipped, instruction units count: 537
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1203960hR4.LJ():void");
    }

    public C1203960hR4(EnumC1204030hRB enumC1204030hRB) {
        this.LIZ = enumC1204030hRB;
    }

    public static boolean LIZLLL(EnumC1204030hRB enumC1204030hRB) {
        String sceneStr;
        C1204010hR9 c1204010hR9 = LJIILLIIL;
        if (c1204010hR9 != null) {
            EnumC1204030hRB enumC1204030hRB2 = c1204010hR9.LIZ;
            if (enumC1204030hRB2 != null) {
                sceneStr = enumC1204030hRB2.getSceneStr();
            } else {
                sceneStr = null;
            }
            if (!Intrinsics.LJFF(sceneStr, enumC1204030hRB.getSceneStr())) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static void LJFF(C1203960hR4 c1203960hR4) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        c1203960hR4.LJI = jElapsedRealtime;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setStateReceivedTs: ");
        sbLIZ.append(jElapsedRealtime);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void LIZIZ(final View view, boolean z) {
        if (this.LJIIIIZZ) {
            return;
        }
        int i = C1203990hR7.LIZ[this.LIZ.ordinal()];
        if (i != 1) {
            if (i == 2) {
                TabSwitchMetricService.LIZ.getClass();
                TabSwitchMetricService tabSwitchMetricServiceLIZ = C1204000hR8.LIZ();
                if (tabSwitchMetricServiceLIZ != null) {
                    tabSwitchMetricServiceLIZ.LJIIJ("Nearby", EnumC1593290rZ1.VIEW);
                }
            }
        } else {
            TabSwitchMetricService.LIZ.getClass();
            TabSwitchMetricService tabSwitchMetricServiceLIZ2 = C1204000hR8.LIZ();
            if (tabSwitchMetricServiceLIZ2 != null) {
                tabSwitchMetricServiceLIZ2.LIZIZ("Nearby", EnumC1593290rZ1.VIEW, false);
            }
        }
        this.LJIIIIZZ = true;
        if (this.LIZ.getReportQualityTrack() && LIZLLL(this.LIZ)) {
            LJIILLIIL = new C1204010hR9(this.LIZ, EnumC1203980hR6.REQUEST_SUCCESS);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("endWhenSuccess，loadScene1=");
        sbLIZ.append(this.LIZ.getSceneStr());
        C2188811AlT.LIZIZ(sbLIZ);
        if (!z) {
            LJ();
        } else {
            C786410Ut5.w3(view.getViewTreeObserver(), new ViewTreeObserver.OnDrawListener() { // from class: X.0hR5
                public boolean LL;
                public final long LLILLJJLI = SystemClock.elapsedRealtime();

                /* JADX WARN: Removed duplicated region for block: B:29:0x007f  */
                /* JADX WARN: Removed duplicated region for block: B:30:0x0081  */
                @Override // android.view.ViewTreeObserver.OnDrawListener
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void onDraw() {
                    /*
                        r9 = this;
                        boolean r0 = r9.LL
                        if (r0 == 0) goto L5
                        return
                    L5:
                        long r3 = android.os.SystemClock.elapsedRealtime()
                        long r0 = r9.LLILLJJLI
                        long r3 = r3 - r0
                        r1 = 30000(0x7530, double:1.4822E-319)
                        int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                        r5 = 1
                        if (r0 <= 0) goto Lb1
                        r8 = 1
                    L14:
                        X.01GW r0 = X.C266790Acv.LIZ
                        java.lang.Object r0 = r0.getValue()
                        java.lang.Boolean r0 = (java.lang.Boolean) r0
                        boolean r0 = r0.booleanValue()
                        if (r0 == 0) goto L7f
                        X.0hR4 r7 = r9.LLILLL
                        android.view.View r1 = r4
                        r7.getClass()
                        boolean r0 = r1 instanceof X.ViewOnAttachStateChangeListenerC20604515jv
                        r2 = 0
                        if (r0 == 0) goto L7f
                        X.15jv r1 = (X.ViewOnAttachStateChangeListenerC20604515jv) r1
                        if (r1 == 0) goto L7f
                        java.util.List r0 = r1.getListItems()
                        java.util.Iterator r1 = r0.iterator()
                    L3a:
                        boolean r0 = r1.hasNext()
                        if (r0 == 0) goto Laf
                        java.lang.Object r6 = r1.next()
                        boolean r0 = r6 instanceof X.C1204470hRt
                        if (r0 == 0) goto L3a
                    L48:
                        boolean r0 = r6 instanceof X.C1204470hRt
                        if (r0 == 0) goto Lac
                        X.0hRt r6 = (X.C1204470hRt) r6
                        if (r6 == 0) goto Lac
                        long r3 = r7.LJIILL
                        r1 = 0
                        int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                        if (r0 <= 0) goto L7f
                        java.lang.StringBuilder r2 = X.C2188811AlT.LIZ()
                        java.lang.String r0 = "firstCard.networkReqTime="
                        r2.append(r0)
                        java.lang.Long r0 = r6.LLIZ
                        r2.append(r0)
                        java.lang.String r0 = "，expectedNetReqTime="
                        r2.append(r0)
                        long r0 = r7.LJIILL
                        r2.append(r0)
                        X.C2188811AlT.LIZIZ(r2)
                        java.lang.Long r0 = r6.LLIZ
                        if (r0 == 0) goto L7f
                        long r1 = r0.longValue()
                        int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                        if (r0 < 0) goto Lac
                    L7f:
                        if (r8 == 0) goto L98
                    L81:
                        java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
                        java.lang.String r0 = "endWhenSuccess render timeout(30000ms), report anyway, loadScene="
                        r1.append(r0)
                        X.0hR4 r0 = r9.LLILLL
                        X.0hRB r0 = r0.LIZ
                        java.lang.String r0 = r0.getSceneStr()
                        r1.append(r0)
                        X.C2188811AlT.LIZIZ(r1)
                    L98:
                        r9.LL = r5
                        X.0hR4 r0 = r9.LLILLL
                        r0.LJ()
                        android.view.View r2 = r4
                        Y.ARunnableS81S0200000_12 r1 = new Y.ARunnableS81S0200000_12
                        r0 = 169(0xa9, float:2.37E-43)
                        r1.<init>(r9, r2, r0)
                        com.bytedance.bpea.transmit.hook.HandlerHook.viewPost(r2, r1)
                        return
                    Lac:
                        if (r8 != 0) goto L81
                        return
                    Laf:
                        r6 = r2
                        goto L48
                    Lb1:
                        r8 = 0
                        goto L14
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.ViewTreeObserverOnDrawListenerC1203970hR5.onDraw():void");
                }
            });
        }
    }
}

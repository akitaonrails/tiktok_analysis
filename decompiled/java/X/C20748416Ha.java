package X;

import com.bytedance.android.livesdk.impl.revenue.playcondition.TreasureBoxFinishedAllCondition;
import com.ss.android.ugc.aweme.compliance.protection.timelock.ui.assem.STMLynxOverlayAssem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.16Ha, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public class C20748416Ha implements InterfaceC1141530foN {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        switch (this.$t) {
            case 0:
                mh2$0(this, c262100zr);
                break;
            case 1:
                mh2$1(this, c262100zr);
                break;
            case 2:
                mh2$2(this, c262100zr);
                break;
        }
    }

    public C20748416Ha(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void mh2$0(C20748416Ha c20748416Ha, C262100zr c262100zr) {
        if (Intrinsics.LJFF(c262100zr.LIZ, "liveGoldenEnvelopCloseAll")) {
            ((TreasureBoxFinishedAllCondition) c20748416Ha.l0).LJIIIZ("onJSEvent");
            InterfaceC946300ajU interfaceC946300ajU = ((TreasureBoxFinishedAllCondition) c20748416Ha.l0).LJ;
            if (interfaceC946300ajU != null) {
                interfaceC946300ajU.LIZ(true, false);
            }
        }
    }

    public static final void mh2$1(C20748416Ha c20748416Ha, C262100zr c262100zr) {
        String strLJFF;
        InterfaceC1107590evd interfaceC1107590evd = c262100zr.LIZIZ;
        String str = "jsb";
        if (interfaceC1107590evd != null && (strLJFF = C1871910yoP.LJFF(interfaceC1107590evd, "enter_from", "jsb")) != null) {
            str = strLJFF;
        }
        ((STMLynxOverlayAssem) c20748416Ha.l0).hp(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void mh2$2(X.C20748416Ha r5, X.C262100zr r6) {
        /*
            java.lang.Object r0 = r5.l0
            X.15qQ r0 = (X.C20644815qQ) r0
            X.0qEB r4 = r0.LIZJ
            if (r4 != 0) goto L9
            return
        L9:
            java.lang.String r1 = r6.LIZ
            java.lang.String r0 = "on_pop_appear_receive"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L6e
            X.0evd r0 = r6.LIZIZ
            java.lang.String r2 = "spark_container_id"
            if (r0 == 0) goto L71
            boolean r1 = r0.hasKey(r2)
            r0 = 1
            if (r1 != r0) goto L71
        L20:
            r3 = 0
            if (r0 == 0) goto L6f
            X.0evd r0 = r6.LIZIZ
            if (r0 == 0) goto L6f
            java.lang.String r2 = r0.getString(r2)
        L2b:
            com.bytedance.hybrid.spark.SparkContext r0 = r4.getSparkContext()
            if (r0 == 0) goto L33
            java.lang.String r3 = r0.containerId
        L33:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "receive_event, curId="
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C20589415hU.LIZIZ(r0)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "receive_event, id="
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C20589415hU.LIZIZ(r0)
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r3, r2)
            if (r0 == 0) goto L6e
            java.lang.Object r0 = r5.l0
            X.15qQ r0 = (X.C20644815qQ) r0
            X.15qa r2 = r0.LIZIZ
            if (r2 == 0) goto L6e
            X.15qZ r1 = X.EnumC20645715qZ.SHOW
            X.15qY r0 = X.EnumC20645615qY.ON_POP_APPEAR_RECEIVE
            X.C20645815qa.LIZ(r2, r1, r0)
        L6e:
            return
        L6f:
            r2 = r3
            goto L2b
        L71:
            r0 = 0
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20748416Ha.mh2$2(X.16Ha, X.00zr):void");
    }
}

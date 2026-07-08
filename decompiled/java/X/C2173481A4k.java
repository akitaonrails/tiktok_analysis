package X;

import android.content.Context;
import com.bef.effectsdk.ResourceFinder;
import com.ss.android.ttve.log.TELog2ClientInvoker;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1A4k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2173481A4k {
    public static final C2173481A4k LIZ = new C2173481A4k();
    public static boolean LIZIZ;

    public static Unit LIZ() {
        ResourceFinder resourceFinderLIZIZ;
        ResourceFinder resourceFinderLIZIZ2;
        C844470XAv.LIZ.getClass();
        Context contextLIZ = C844470XAv.LIZ();
        C0VSJ c0vsj = new C0VSJ(C786410Ut5.x2(contextLIZ), "workspace");
        if (!c0vsj.exists()) {
            c0vsj.mkdir();
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        LIZ.getClass();
        if (((Boolean) C0ATJ.LIZ.getValue()).booleanValue()) {
            C0CHQ.LIZ().LJJIZ();
            C13QC<ResourceFinder, C13NJ> c13qcLIZ = C2174321A7q.LIZ();
            if (c13qcLIZ != null && (resourceFinderLIZIZ2 = c13qcLIZ.LIZIZ()) != null) {
                C1A66.LIZLLL(resourceFinderLIZIZ2);
            }
            C1A66.LIZIZ();
        } else {
            C1A66.LIZJ(C786410Ut5.N3(contextLIZ), c0vsj.getAbsolutePath());
            C13QC<ResourceFinder, C13NJ> c13qcLIZ2 = C2174321A7q.LIZ();
            if (c13qcLIZ2 != null && (resourceFinderLIZIZ = c13qcLIZ2.LIZIZ()) != null) {
                C1A66.LIZLLL(resourceFinderLIZIZ);
            }
            C1A66.LIZIZ();
            C1A66.LJ();
            if (Intrinsics.LJFF(C844470XAv.LJIILL, "local_test")) {
                C1A66.LJFF((byte) 15);
                C971740bOW.LIZ = new InterfaceC971750bOX() { // from class: X.1A4l
                    @Override // X.InterfaceC971750bOX
                    public final void LIZ(int i, String str) {
                    }
                };
                TELog2ClientInvoker.nativeInit();
                TELog2ClientInvoker.nativeSetIsToLogcat(true);
            } else {
                C1A66.LJFF((byte) 7);
                C971740bOW.LIZ = new InterfaceC971750bOX() { // from class: X.1A4m
                    @Override // X.InterfaceC971750bOX
                    public final void LIZ(int i, String str) {
                    }
                };
                TELog2ClientInvoker.nativeInit();
                TELog2ClientInvoker.nativeSetIsToLogcat(false);
            }
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        LIZIZ = true;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VESDK init cost: ");
        sbLIZ.append(jCurrentTimeMillis2);
        C1706630uVp.LJFF("AMEVESdkInitLogic", C2188811AlT.LIZIZ(sbLIZ));
        return Unit.LIZ;
    }

    public static Unit LIZIZ() {
        if (LIZIZ) {
            return Unit.LIZ;
        }
        Unit unitLIZ = LIZ();
        return unitLIZ == C099R.LJFF() ? unitLIZ : Unit.LIZ;
    }
}

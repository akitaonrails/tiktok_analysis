package X;

import Y.ARunnableS106S0100000_6;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rBa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1578760rBa {
    public final LinkedHashSet<InterfaceC1578820rBg> LIZ = new LinkedHashSet<>();
    public final BPEAHandler LIZIZ = new BPEAHandler(Looper.getMainLooper());
    public int LIZJ = Integer.MIN_VALUE;
    public EnumC1578740rBY LIZLLL;
    public EnumC1099050ehr LJ;

    public final void LIZ(Function0<Unit> function0) {
        if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            function0.invoke();
        } else {
            C786410Ut5.LJJZZIII(this.LIZIZ, new ARunnableS106S0100000_6((Function0) function0, 191));
        }
    }

    public C1578760rBa(C16GX c16gx, final AwS568S0100000_24 awS568S0100000_24) {
        c16gx.LIZ(new InterfaceC1324370kZH() { // from class: X.0rBZ
            @Override // X.InterfaceC1324380kZI
            public final void LLZZJLIL(C16GX c16gx2, int i) {
                int totalScrollRange;
                EnumC1578740rBY enumC1578740rBY;
                EnumC1099050ehr enumC1099050ehr;
                if (awS568S0100000_24.invoke().booleanValue()) {
                    C1578760rBa c1578760rBa = this;
                    if (!c1578760rBa.LIZ.isEmpty() && c1578760rBa.LIZJ != i && (totalScrollRange = c16gx2.getTotalScrollRange()) > 0) {
                        float fAbs = Math.abs(i) / totalScrollRange;
                        if (i == 0) {
                            enumC1578740rBY = EnumC1578740rBY.EXPANDED;
                        } else if (Math.abs(i) == totalScrollRange) {
                            enumC1578740rBY = EnumC1578740rBY.COLLAPSED;
                        } else {
                            enumC1578740rBY = EnumC1578740rBY.DRAGGING;
                        }
                        int i2 = c1578760rBa.LIZJ;
                        if (i2 != Integer.MIN_VALUE && i < i2) {
                            enumC1099050ehr = EnumC1099050ehr.COLLAPSING;
                        } else {
                            enumC1099050ehr = EnumC1099050ehr.EXPANDING;
                        }
                        if (enumC1578740rBY != c1578760rBa.LIZLLL || enumC1099050ehr != c1578760rBa.LJ) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("stateChange state=");
                            sbLIZ.append(enumC1578740rBY);
                            sbLIZ.append(" lastState=");
                            sbLIZ.append(c1578760rBa.LIZLLL);
                            sbLIZ.append(" direction=");
                            sbLIZ.append(enumC1099050ehr);
                            sbLIZ.append(" lastDirection=");
                            sbLIZ.append(c1578760rBa.LJ);
                            C2188811AlT.LIZIZ(sbLIZ);
                        }
                        EnumC1578740rBY enumC1578740rBY2 = EnumC1578740rBY.DRAGGING;
                        if (enumC1578740rBY == enumC1578740rBY2) {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("dragging offset=");
                            sbLIZ2.append(i);
                            sbLIZ2.append(" total=");
                            sbLIZ2.append(totalScrollRange);
                            sbLIZ2.append(" progress=");
                            sbLIZ2.append(C786410Ut5.j4("%.2f", Arrays.copyOf(new Object[]{Float.valueOf(fAbs)}, 1)));
                            C2188811AlT.LIZIZ(sbLIZ2);
                        }
                        if (enumC1578740rBY != c1578760rBa.LIZLLL || enumC1578740rBY == enumC1578740rBY2) {
                            Iterator<InterfaceC1578820rBg> it2 = c1578760rBa.LIZ.iterator();
                            while (it2.hasNext()) {
                                it2.next().LIZ(totalScrollRange, C13LZ.LIZLLL(1 - fAbs, 0.0f, 1.0f), enumC1578740rBY, enumC1099050ehr);
                            }
                            c1578760rBa.LIZLLL = enumC1578740rBY;
                            c1578760rBa.LJ = enumC1099050ehr;
                        }
                        c1578760rBa.LIZJ = i;
                    }
                }
            }
        });
    }
}

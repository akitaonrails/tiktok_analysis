package Y;

import X.C1C7U;
import X.C351190Dpl;
import X.C351560DqM;
import X.InterfaceC351200Dpm;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public class ARunnableS0S0400010_5 implements Runnable {
    public final int $t;
    public double d4;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public static final void run$0(ARunnableS0S0400010_5 aRunnableS0S0400010_5) {
        boolean zLIZ;
        InterfaceC351200Dpm interfaceC351200Dpm;
        C1C7U.LIZ("VideoCutEditor@7eb2.reversePlay$1$1$onProgressChanged$1$1");
        try {
            if (!Intrinsics.LJFF(((LinkedHashMap) ((C351560DqM) aRunnableS0S0400010_5.l0).LJII).get(((NLETrackSlot) aRunnableS0S0400010_5.l1).getUUID()), Boolean.TRUE) && (interfaceC351200Dpm = (InterfaceC351200Dpm) aRunnableS0S0400010_5.l2) != null) {
                interfaceC351200Dpm.LIZ(aRunnableS0S0400010_5.d4 * ((C351190Dpl) aRunnableS0S0400010_5.l3).LIZ);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("VideoCutEditor@7eb2.reversePlay$1$1$onProgressChanged$1$1");
    }

    public static final void run$1(ARunnableS0S0400010_5 aRunnableS0S0400010_5) {
        boolean zLIZ;
        InterfaceC351200Dpm interfaceC351200Dpm;
        C1C7U.LIZ("VideoCutEditor@7eb2.reversePlay$1$1$magicTaskBlock$1$1$onProgressChanged$1$1");
        try {
            if (!Intrinsics.LJFF(((LinkedHashMap) ((C351560DqM) aRunnableS0S0400010_5.l0).LJII).get(((NLETrackSlot) aRunnableS0S0400010_5.l1).getUUID()), Boolean.TRUE) && (interfaceC351200Dpm = (InterfaceC351200Dpm) aRunnableS0S0400010_5.l2) != null) {
                double d = aRunnableS0S0400010_5.d4;
                C351190Dpl c351190Dpl = (C351190Dpl) aRunnableS0S0400010_5.l3;
                interfaceC351200Dpm.LIZ((d * c351190Dpl.LIZIZ) + c351190Dpl.LIZ);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("VideoCutEditor@7eb2.reversePlay$1$1$magicTaskBlock$1$1$onProgressChanged$1$1");
    }

    public ARunnableS0S0400010_5(C351560DqM c351560DqM, NLETrackSlot nLETrackSlot, InterfaceC351200Dpm interfaceC351200Dpm, double d, C351190Dpl c351190Dpl, int i) {
        this.$t = i;
        this.l0 = c351560DqM;
        this.l1 = nLETrackSlot;
        this.l2 = interfaceC351200Dpm;
        this.d4 = d;
        this.l3 = c351190Dpl;
    }
}

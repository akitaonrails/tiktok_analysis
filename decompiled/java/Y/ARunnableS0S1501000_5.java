package Y;

import X.C1C7U;
import X.C2188811AlT;
import X.C351180Dpk;
import X.C351560DqM;
import X.InterfaceC351200Dpm;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public class ARunnableS0S1501000_5 implements Runnable {
    public final int $t;
    public int i6;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;
    public String s0;

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

    public final void LIZ$0() {
        if (!Intrinsics.LJFF(((LinkedHashMap) ((C351560DqM) this.l1).LJII).get(((NLETrackSlot) this.l2).getUUID()), Boolean.TRUE)) {
            if (this.i6 == 0) {
                ((C351180Dpk) this.l3).LIZ = this.s0;
                ((Function0) this.l4).invoke();
            } else {
                InterfaceC351200Dpm interfaceC351200Dpm = (InterfaceC351200Dpm) this.l5;
                if (interfaceC351200Dpm != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("gen reverse video failed, error code: ");
                    sbLIZ.append(this.i6);
                    C2188811AlT.LIZIZ(sbLIZ);
                    interfaceC351200Dpm.LIZIZ(-1);
                }
                InterfaceC351200Dpm interfaceC351200Dpm2 = (InterfaceC351200Dpm) this.l5;
                if (interfaceC351200Dpm2 != null) {
                    interfaceC351200Dpm2.LIZJ();
                }
            }
        }
        ((C351560DqM) this.l1).LJIIIIZZ.remove(((NLETrackSlot) this.l2).getUUID());
    }

    public final void LIZ$1() {
        if (!Intrinsics.LJFF(((LinkedHashMap) ((C351560DqM) this.l1).LJII).get(((NLETrackSlot) this.l2).getUUID()), Boolean.TRUE)) {
            if (this.i6 == 0) {
                ((C351180Dpk) this.l3).LIZIZ = this.s0;
                ((Function0) this.l4).invoke();
            } else {
                InterfaceC351200Dpm interfaceC351200Dpm = (InterfaceC351200Dpm) this.l5;
                if (interfaceC351200Dpm != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("gen reverse video failed, error code: ");
                    sbLIZ.append(this.i6);
                    C2188811AlT.LIZIZ(sbLIZ);
                    interfaceC351200Dpm.LIZIZ(-1);
                }
                InterfaceC351200Dpm interfaceC351200Dpm2 = (InterfaceC351200Dpm) this.l5;
                if (interfaceC351200Dpm2 != null) {
                    interfaceC351200Dpm2.LIZJ();
                }
            }
        }
        ((C351560DqM) this.l1).LJIIIIZZ.remove(((NLETrackSlot) this.l2).getUUID());
    }

    public static final void run$0(ARunnableS0S1501000_5 aRunnableS0S1501000_5) {
        boolean zLIZ;
        C1C7U.LIZ("VideoCutEditor@7eb2.reversePlay$1$1$onDone$1$1");
        try {
            aRunnableS0S1501000_5.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("VideoCutEditor@7eb2.reversePlay$1$1$onDone$1$1");
    }

    public static final void run$1(ARunnableS0S1501000_5 aRunnableS0S1501000_5) {
        boolean zLIZ;
        C1C7U.LIZ("VideoCutEditor@7eb2.reversePlay$1$1$magicTaskBlock$1$1$onDone$1$1");
        try {
            aRunnableS0S1501000_5.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("VideoCutEditor@7eb2.reversePlay$1$1$magicTaskBlock$1$1$onDone$1$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ARunnableS0S1501000_5(C351560DqM c351560DqM, C351560DqM c351560DqM2, NLETrackSlot nLETrackSlot, int i, C351180Dpk c351180Dpk, String str, Function0<Unit> function0, InterfaceC351200Dpm interfaceC351200Dpm) {
        this.$t = interfaceC351200Dpm;
        this.l1 = c351560DqM;
        this.l2 = c351560DqM2;
        this.i6 = nLETrackSlot;
        this.l3 = i;
        this.s0 = c351180Dpk;
        this.l4 = str;
        this.l5 = function0;
    }
}

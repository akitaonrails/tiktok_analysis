package Y;

import X.AbstractC1683310tuD;
import X.AbstractC1686530tzP;
import X.C05P1;
import X.C118300cf;
import X.C13FE;
import X.C1655760tBm;
import X.C1655800tBq;
import X.C1668650tWZ;
import X.C1669500tXw;
import X.C1675860tiC;
import X.C1677730tlD;
import X.C1677750tlF;
import X.C1685910tyP;
import X.C1692940u9k;
import X.C1698310uIP;
import X.C2188811AlT;
import X.C2219091BtD;
import X.C786410Ut5;
import X.InterfaceC1463990oCT;
import X.InterfaceC1656000tCA;
import X.InterfaceC1669010tX9;
import X.InterfaceC1690500u5o;
import X.InterfaceC1692950u9l;
import X.InterfaceC2254001DKc;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.asve.recorder.RecorderConcatResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes26.dex */
public class AObjectS317S0200000_25 implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AObjectS317S0200000_25 aObjectS317S0200000_25, Object obj) {
        C1655760tBm c1655760tBm = (C1655760tBm) aObjectS317S0200000_25.l0;
        InterfaceC1656000tCA interfaceC1656000tCA = (InterfaceC1656000tCA) aObjectS317S0200000_25.l1;
        RecorderConcatResult recorderConcatResult = (RecorderConcatResult) obj;
        c1655760tBm.getClass();
        InterfaceC1463990oCT interfaceC1463990oCTLIZLLL = C2219091BtD.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CameraVideoRecorder executeAsync concatasync result ");
        sbLIZ.append(recorderConcatResult.ret);
        interfaceC1463990oCTLIZLLL.i(C2188811AlT.LIZIZ(sbLIZ));
        C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS58S0300000_25(c1655760tBm, interfaceC1656000tCA, recorderConcatResult, 0));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AObjectS317S0200000_25 aObjectS317S0200000_25, Object obj) {
        C1655760tBm c1655760tBm = (C1655760tBm) aObjectS317S0200000_25.l0;
        InterfaceC1656000tCA interfaceC1656000tCA = (InterfaceC1656000tCA) aObjectS317S0200000_25.l1;
        RecorderConcatResult recorderConcatResult = (RecorderConcatResult) obj;
        c1655760tBm.getClass();
        InterfaceC1463990oCT interfaceC1463990oCTLIZLLL = C2219091BtD.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CameraVideoRecorder concatWithReleaseGPUResource concatAsync result ");
        sbLIZ.append(recorderConcatResult.ret);
        interfaceC1463990oCTLIZLLL.i(C2188811AlT.LIZIZ(sbLIZ));
        String str = recorderConcatResult.videoPath;
        String str2 = recorderConcatResult.audioPath;
        int i = recorderConcatResult.ret;
        InterfaceC2254001DKc interfaceC2254001DKc = c1655760tBm.LJ;
        if (interfaceC2254001DKc != null) {
            interfaceC2254001DKc.V4(new C1655800tBq(c1655760tBm, interfaceC1656000tCA, str, str2, i));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AObjectS317S0200000_25 aObjectS317S0200000_25, Object obj) {
        C1669500tXw c1669500tXw = (C1669500tXw) aObjectS317S0200000_25.l0;
        C05P1 c05p1 = (C05P1) aObjectS317S0200000_25.l1;
        InterfaceC1669010tX9 interfaceC1669010tX9 = (InterfaceC1669010tX9) obj;
        float f = c1669500tXw.LIZ / 2;
        if (!C1685910tyP.LJ(((C1685910tyP) c05p1.getValue()).LIZ, C1685910tyP.LJIIIZ)) {
            C1675860tiC.LIZLLL(interfaceC1669010tX9, ((C1685910tyP) c05p1.getValue()).LIZ, interfaceC1669010tX9.LJJJJLL(f * (1 - 0.125f)), 0L, 0.0f, null, 124);
        }
        interfaceC1669010tX9.LLIIJLIL();
        return Unit.LIZ;
    }

    public static final Object invoke$3(AObjectS317S0200000_25 aObjectS317S0200000_25, Object obj) {
        C1677750tlF c1677750tlF = (C1677750tlF) aObjectS317S0200000_25.l0;
        C1677730tlD c1677730tlD = (C1677730tlD) aObjectS317S0200000_25.l1;
        c1677750tlF.LIZIZ.LIZLLL(c1677730tlD);
        ((C13FE) c1677750tlF.LIZJ).setValue(Boolean.TRUE);
        return new C1698310uIP(c1677750tlF, c1677730tlD, 0);
    }

    public static final Object invoke$4(AObjectS317S0200000_25 aObjectS317S0200000_25, Object obj) {
        AbstractC1683310tuD.LJFF((AbstractC1683310tuD) obj, (AbstractC1686530tzP) aObjectS317S0200000_25.l0, 0, ((C118300cf) aObjectS317S0200000_25.l1).element);
        return Unit.LIZ;
    }

    public static final Object invoke$5(AObjectS317S0200000_25 aObjectS317S0200000_25, Object obj) {
        ((Function1) aObjectS317S0200000_25.l1).invoke(new C1668650tWZ(((InterfaceC1690500u5o) aObjectS317S0200000_25.l0).LLIIIJ(Float.intBitsToFloat((int) (C1692940u9k.LJ((InterfaceC1692950u9l) obj) & 4294967295L)) + ((int) (r9.LIZ() & 4294967295L)))));
        return Unit.LIZ;
    }

    public AObjectS317S0200000_25(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}

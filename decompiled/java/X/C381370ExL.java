package X;

import Y.ARunnableS14S0400000_5;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.nle.editor_jni.INLEPlayer;
import com.bytedance.ies.nle.editor_jni.NLETemplateModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.AwS47S0000100_5;
import kotlin.jvm.internal.AwS90S1200000_5;

/* JADX INFO: renamed from: X.0ExL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C381370ExL extends AbstractC538070L8j {
    public final Map<String, InterfaceC381510ExZ<C381480ExW, C381330ExH>> LJII = new LinkedHashMap();

    @Override // X.InterfaceC538100L8m
    public final String getTaskName() {
        return "COMBINE_EFFECT";
    }

    @Override // X.AbstractC538070L8j, X.InterfaceC354490Dv5
    public final void cancel() {
        List listLLIIII;
        super.cancel();
        synchronized (this.LJII) {
            try {
                listLLIIII = C13LP.LLIIII(((LinkedHashMap) this.LJII).values());
                ((LinkedHashMap) this.LJII).clear();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        Iterator it2 = listLLIIII.iterator();
        while (it2.hasNext()) {
            ((InterfaceC354490Dv5) it2.next()).cancel();
        }
    }

    @Override // X.AbstractC538070L8j, X.InterfaceC538100L8m
    public final boolean LJIIZILJ(C0FQS c0fqs) {
        Set<Integer> setLIZIZ;
        super.LJIIZILJ(c0fqs);
        NLETemplateModel nLETemplateModel = c0fqs.LJIIJ;
        if (nLETemplateModel != null && (setLIZIZ = C0FPT.LIZIZ(nLETemplateModel)) != null && setLIZIZ.contains(Integer.valueOf(C0CIJ.UGC_I2V_FRAME.getValue()))) {
            LIZJ(c0fqs, null);
            return false;
        }
        if (C358630E4f.LIZ()) {
            if (c0fqs.LJIIJJI == null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("COMBINE_EFFECT");
                sbLIZ.append(": NLETemplateModel is NULL");
                LJJIIZ(new C381350ExJ(10001, C2188811AlT.LIZIZ(sbLIZ), 4));
                return false;
            }
            C0F1S c0f1s = c0fqs.LIZIZ;
            if (c0f1s == null || c0f1s.LIZ.length() <= 0) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("COMBINE_EFFECT");
                sbLIZ2.append(": ");
                sbLIZ2.append(c0fqs.LIZIZ);
                LJJIIZ(new C381350ExJ(10001, C2188811AlT.LIZIZ(sbLIZ2), 4));
                return false;
            }
        }
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C381380ExM(this, c0fqs, null), 3);
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJIJ(X.C0FQS r18, java.util.List<X.C381340ExI> r19, X.InterfaceC1364105Vn<? super kotlin.Unit> r20) {
        /*
            Method dump skipped, instruction units count: 355
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C381370ExL.LJJIJ(X.0FQS, java.util.List, X.05Vn):java.lang.Object");
    }

    public final Object LJJIJIIJI(C0FQS c0fqs, C381340ExI c381340ExI, int i, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(interfaceC1364105Vn));
        c2252611DEt.LJIJJ();
        C118300cf c118300cf = new C118300cf();
        String extra = c381340ExI.LIZ.getExtra("ep_magic_resource_id");
        if (extra == null) {
            extra = c381340ExI.LIZ.getUUID();
        }
        LJJIJIIJIL(this, c0fqs, c381340ExI, extra, c2252611DEt, c118300cf, i, false);
        c2252611DEt.LJJII(new AwS90S1200000_5(this, c381340ExI, extra, 4));
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        if (objLJIJ == C099R.LJFF()) {
            return objLJIJ;
        }
        return Unit.LIZ;
    }

    public static final void LJJIJIIJIL(C381370ExL c381370ExL, C0FQS c0fqs, C381340ExI c381340ExI, String str, InterfaceC20236714Gf<? super Unit> interfaceC20236714Gf, C118300cf c118300cf, int i, boolean z) {
        INLEPlayer iNLEPlayer;
        AwS47S0000100_5 awS47S0000100_5 = new AwS47S0000100_5(System.currentTimeMillis(), 0);
        C381410ExP c381410ExP = c0fqs.LJIJ;
        if (c381410ExP != null) {
            iNLEPlayer = c381410ExP.LIZJ;
        } else {
            iNLEPlayer = null;
        }
        C381290ExD c381290ExD = new C381290ExD(c381340ExI, c0fqs, z, c381370ExL, str, interfaceC20236714Gf, awS47S0000100_5, c118300cf, i);
        c381370ExL.getClass();
        if (iNLEPlayer != null) {
            iNLEPlayer.seekTime(0L);
            BPEAHandler bPEAHandler = new BPEAHandler(Looper.getMainLooper());
            C786410Ut5.LJJZZIII(bPEAHandler, new ARunnableS14S0400000_5(c381370ExL, iNLEPlayer, c381290ExD, bPEAHandler, 11));
        }
    }
}

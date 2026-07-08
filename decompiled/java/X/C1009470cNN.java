package X;

import Y.AUListenerS265S0100000_16;
import android.animation.ValueAnimator;
import android.view.ViewGroup;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.IAnoleManager;
import com.ss.android.ugc.aweme.IAnoleService;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0cNN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1009470cNN {
    public final IAnoleManager LIZ;
    public InterfaceC990750btB LIZIZ;
    public boolean LIZJ;
    public volatile boolean LJ;
    public volatile boolean LJFF;
    public volatile boolean LIZLLL = true;
    public final C01GW LJI = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(21));
    public final C01GW LJII = C452501pT.LIZIZ(new AwS560S0100000_16(this, 29));

    public final void LIZIZ() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("index", 0);
            this.LIZ.LJIIZILJ(new C0SCL(jSONObject));
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("send index =");
            sbLIZ.append(0);
            C1022620cia.LIZIZ("AnoleMultiContentHelper", C2188811AlT.LIZIZ(sbLIZ));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public final void LIZJ() {
        C1009520cNS c1009520cNSLJII;
        ViewGroup viewGroupLIZ;
        IAnoleService iAnoleService = (IAnoleService) this.LJI.getValue();
        if (iAnoleService == null || (c1009520cNSLJII = iAnoleService.LJII()) == null || (viewGroupLIZ = c1009520cNSLJII.LIZ((C1009580cNY) this.LJII.getValue())) == null) {
            return;
        }
        C786410Ut5.LJJJJI(viewGroupLIZ);
        c1009520cNSLJII.LIZIZ(true);
        this.LIZ.mount(viewGroupLIZ, EnumC696280RSw.TT_FEED_ABOVE_CELL.getSlotName(), null);
        this.LIZLLL = true;
        this.LJFF = true;
        C786410Ut5.LJLZ(!this.LJ ? 0 : 8, viewGroupLIZ);
    }

    public final void LIZLLL() {
        C1009520cNS c1009520cNSLJII;
        ViewGroup viewGroupLIZ;
        boolean z;
        IAnoleService iAnoleService = (IAnoleService) this.LJI.getValue();
        if (iAnoleService == null || (c1009520cNSLJII = iAnoleService.LJII()) == null || (viewGroupLIZ = c1009520cNSLJII.LIZ(null)) == null) {
            return;
        }
        int i = 0;
        if (!this.LIZLLL || this.LJ) {
            z = false;
            i = 8;
        } else {
            z = true;
        }
        C786410Ut5.LJLZ(i, viewGroupLIZ);
        if (z) {
            C786410Ut5.R4(0.0f, viewGroupLIZ);
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.setDuration(500L);
            valueAnimatorOfFloat.addUpdateListener(new AUListenerS265S0100000_16(viewGroupLIZ, 12));
            valueAnimatorOfFloat.start();
        }
    }

    public final Float LIZ(int i) {
        boolean z;
        List<InterfaceC1007930cKt> listLJIIJ = this.LIZ.LJIIJ(EnumC696280RSw.TT_FEED_ABOVE_CELL.getSlotName());
        if (listLJIIJ != null && !listLJIIJ.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return null;
        }
        Iterator<InterfaceC1007930cKt> it2 = listLJIIJ.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            InterfaceC1007930cKt next = it2.next();
            C1008990cMb c1008990cMb = EnumC1008920cMU.Companion;
            String type = next.getType();
            c1008990cMb.getClass();
            if (Intrinsics.LJFF(EnumC1008920cMU.PROGRESS_BAR.getType(), type) || Intrinsics.LJFF(EnumC1008920cMU.MULTI_PROGRESS_BAR.getType(), type)) {
                if (next instanceof InterfaceC1003120cD8) {
                    InterfaceC1003120cD8 interfaceC1003120cD8 = (InterfaceC1003120cD8) next;
                    if (interfaceC1003120cD8 != null) {
                        AbstractC1003110cD7 abstractC1003110cD7LIZLLL = interfaceC1003120cD8.LIZLLL(i);
                        if (abstractC1003110cD7LIZLLL instanceof C1003090cD5) {
                            return Float.valueOf(((C1003090cD5) abstractC1003110cD7LIZLLL).LIZ);
                        }
                        if (abstractC1003110cD7LIZLLL instanceof C1003100cD6) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("get progress fail, result=");
                            sbLIZ.append(((C1003100cD6) abstractC1003110cD7LIZLLL).LIZ);
                            C2188811AlT.LIZIZ(sbLIZ);
                            return null;
                        }
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("get progress fail, result=");
                        sbLIZ2.append(abstractC1003110cD7LIZLLL);
                        C2188811AlT.LIZIZ(sbLIZ2);
                        return null;
                    }
                }
            }
        }
        return null;
    }

    public C1009470cNN(IAnoleManager iAnoleManager, InterfaceC990750btB interfaceC990750btB) {
        this.LIZ = iAnoleManager;
        this.LIZIZ = interfaceC990750btB;
    }
}

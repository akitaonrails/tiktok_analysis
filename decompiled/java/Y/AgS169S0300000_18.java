package Y;

import X.AbstractC1156400gCM;
import X.C013C;
import X.C05P0;
import X.C0A5X;
import X.C0PEM;
import X.C1155030gA9;
import X.C1156380gCK;
import X.C1156390gCL;
import X.C1156410gCN;
import X.C1954807lC;
import X.C1DFB;
import X.C2129008Vs;
import X.C2286608xc;
import X.C238400w2;
import X.C676770Qgd;
import X.InterfaceC1364105Vn;
import X.InterfaceC1676320tiw;
import X.InterfaceC346701Wf;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommerce.resource.EcomApiLifecycleManager;
import com.ss.android.ugc.aweme.ecommerce.search.page.ai.EcAISearchViewModel;
import java.util.ArrayList;
import java.util.Collections;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes19.dex */
public class AgS169S0300000_18 implements InterfaceC346701Wf {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.InterfaceC346701Wf
    public final Object emit(Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        switch (this.$t) {
            case 0:
                return emit$0(this, obj, interfaceC1364105Vn);
            case 1:
                return emit$1(this, obj, interfaceC1364105Vn);
            default:
                return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object emit$0(AgS169S0300000_18 agS169S0300000_18, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        int i;
        String str;
        String strOptString;
        String str2;
        AbstractC1156400gCM abstractC1156400gCM = (AbstractC1156400gCM) obj;
        if (abstractC1156400gCM instanceof C1156410gCN) {
            ((C238400w2) agS169S0300000_18.l0).element++;
            C013C c013c = (C013C) agS169S0300000_18.l1;
            if (!c013c.element) {
                c013c.element = true;
                EcAISearchViewModel.yQ2((EcAISearchViewModel) agS169S0300000_18.l2, "net_first_chunk_main", null, 6);
            }
            EcAISearchViewModel ecAISearchViewModel = (EcAISearchViewModel) agS169S0300000_18.l2;
            n nVar = (n) ((C1156410gCN) abstractC1156400gCM).LIZ;
            ecAISearchViewModel.getClass();
            if (nVar != null) {
                try {
                    str2 = ecAISearchViewModel.LLILZLL;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (str2 != null) {
                    strOptString = new JSONObject(str2).optString("content", null);
                } else {
                    strOptString = null;
                }
                if (((Boolean) C0A5X.LIZ.getValue()).booleanValue()) {
                    EcomApiLifecycleManager ecomApiLifecycleManager = EcomApiLifecycleManager.LIZ;
                    C1DFB c1dfb = C0PEM.LIZJ;
                    C2129008Vs c2129008Vs = new C2129008Vs(strOptString, nVar, null);
                    ecomApiLifecycleManager.getClass();
                    EcomApiLifecycleManager.LJIIL(strOptString, c1dfb, c2129008Vs);
                }
                if (Intrinsics.LJFF(ecAISearchViewModel.LLILLL.getValue(), Boolean.TRUE)) {
                    ecAISearchViewModel.LL.postValue(EcAISearchViewModel.vQ2(Collections.singletonList(nVar)));
                } else {
                    ((ArrayList) ecAISearchViewModel.LLILZ).add(nVar);
                }
            }
        } else if (abstractC1156400gCM instanceof C1156380gCK) {
            n nVar2 = new n();
            C1156380gCK c1156380gCK = (C1156380gCK) abstractC1156400gCM;
            C676770Qgd c676770Qgd = c1156380gCK.LIZ;
            if (c676770Qgd != null) {
                i = c676770Qgd.LIZIZ;
            } else {
                i = -1;
            }
            nVar2.LJJIII(C2286608xc.LJ(i), "status_code");
            C676770Qgd c676770Qgd2 = c1156380gCK.LIZ;
            if (c676770Qgd2 == null || (str = c676770Qgd2.LIZ) == null) {
                str = "Unknown error";
            }
            nVar2.LJJIIJ("data", str);
            ((EcAISearchViewModel) agS169S0300000_18.l2).wQ2(nVar2);
        } else if (abstractC1156400gCM instanceof C1156390gCL) {
            ((EcAISearchViewModel) agS169S0300000_18.l2).LLILZIL = null;
        } else {
            throw new C1954807lC();
        }
        return Unit.LIZ;
    }

    public static final Object emit$1(AgS169S0300000_18 agS169S0300000_18, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        C1155030gA9 c1155030gA9 = (C1155030gA9) obj;
        ((C05P0) agS169S0300000_18.l0).setValue(Boolean.valueOf(c1155030gA9.LIZ));
        if (c1155030gA9.LIZIZ == 0) {
            ((InterfaceC1676320tiw) agS169S0300000_18.l1).LJIIJ(c1155030gA9.LIZLLL);
            InterfaceC1676320tiw interfaceC1676320tiw = (InterfaceC1676320tiw) agS169S0300000_18.l2;
            int i = c1155030gA9.LIZJ - c1155030gA9.LIZLLL;
            if (i < 0) {
                i = 0;
            }
            interfaceC1676320tiw.LJIIJ(i);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AgS169S0300000_18(Object obj, C05P0<Boolean> c05p0, InterfaceC1676320tiw interfaceC1676320tiw, InterfaceC1676320tiw interfaceC1676320tiw2) {
        this.$t = interfaceC1676320tiw2;
        this.l0 = obj;
        this.l1 = c05p0;
        this.l2 = interfaceC1676320tiw;
    }
}

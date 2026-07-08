package X;

import Y.AComparatorS32S0000000_13;
import Y.AComparatorS512S0100000_13;
import com.bytedance.pumbaa.hybrid.governance.api.BaseGovernanceModel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: X.0WMH, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WMH extends C0WMA<C0WNZ> {
    public final List<C0WNZ> LIZ = new ArrayList();

    public C0WMH() {
        for (C0WN4 c0wn4 : Collections.singletonList(new C0WNZ() { // from class: X.0WN4
            @Override // X.C0WMB
            public final C0WMF LIZLLL() {
                return new C0WMF("JSInterfaceAction", C0WN8.JSInterface, C0WNE.L3, 0, 24);
            }

            @Override // X.C0WMB
            public final BaseGovernanceModel LIZIZ() {
                return C1EOK.LIZ();
            }

            /* JADX WARN: Removed duplicated region for block: B:116:0x01bf A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:39:0x009d  */
            /* JADX WARN: Removed duplicated region for block: B:49:0x00db  */
            /* JADX WARN: Removed duplicated region for block: B:52:0x00e3  */
            /* JADX WARN: Removed duplicated region for block: B:54:0x0103  */
            /* JADX WARN: Removed duplicated region for block: B:70:0x0157  */
            /* JADX WARN: Removed duplicated region for block: B:76:0x0172  */
            /* JADX WARN: Removed duplicated region for block: B:92:0x01c4  */
            /* JADX WARN: Removed duplicated region for block: B:97:0x00be A[SYNTHETIC] */
            @Override // X.C0WMB
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final X.C0WM1 LJ(X.C0WMD r16) throws org.json.JSONException {
                /*
                    Method dump skipped, instruction units count: 462
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C0WN4.LJ(X.0WMD):X.0WM1");
            }
        })) {
            C0WMA.LIZJ(c0wn4);
            ((ArrayList) this.LIZ).add(c0wn4);
            C08XD.LJJ(this.LIZ, new AComparatorS512S0100000_13(new AComparatorS32S0000000_13(37), 6));
        }
    }

    @Override // X.C0WMA
    public final List<C0WNZ> LIZIZ(C0WMD c0wmd) {
        return C13LP.LLIIII(this.LIZ);
    }
}

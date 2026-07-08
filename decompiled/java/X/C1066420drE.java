package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import com.google.gson.n;
import com.google.gson.p;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.services.external.IAnchorService;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS595S0100000_16;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0drE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1066420drE extends AbstractC1066970ds7 {
    public final C01GW LLJI = C452501pT.LIZIZ(new C1066430drF());

    @Override // X.AbstractC1066890drz
    public final C1400390mXt LJIILL() {
        return null;
    }

    @Override // X.AbstractC1066970ds7
    public final boolean LJJIJIL() {
        return true;
    }

    @Override // X.InterfaceC1393560mMs
    public final InterfaceC1393560mMs clone() {
        return new C1066420drE();
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final int type() {
        C563650M8t c563650M8t = C563650M8t.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MagicAnchorMaker type:");
        EnumC1430380nKG enumC1430380nKG = EnumC1430380nKG.CT_AI_MAGIC_ANCHOR;
        sbLIZ.append(enumC1430380nKG.getTYPE());
        C201955140j.LJII(c563650M8t, C2188811AlT.LIZIZ(sbLIZ));
        return enumC1430380nKG.getTYPE();
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final EnumC1050190dR3 LJJJJLL(List<AnchorCommonStruct> list) {
        Object c098200Yq;
        String strLJIL;
        k kVarLJJIIZ;
        C563650M8t c563650M8t = C563650M8t.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MagicAnchorMaker anchor size:");
        sbLIZ.append(list.size());
        sbLIZ.append(", anchor type");
        sbLIZ.append(((AnchorCommonStruct) ListProtector.get(list, 0)).getType());
        sbLIZ.append(", anchor type");
        sbLIZ.append(((AnchorCommonStruct) ListProtector.get(list, 0)).getDescription());
        C201955140j.LJII(c563650M8t, C2188811AlT.LIZIZ(sbLIZ));
        if (!C290600BaE.LIZ()) {
            C19719612Di.LJJIIJ(list, new AwS595S0100000_16(this, 230), true);
            return EnumC1050190dR3.NOT_FOUND;
        }
        ArrayList<AnchorCommonStruct> arrayList = new ArrayList();
        for (AnchorCommonStruct anchorCommonStruct : list) {
            if (anchorCommonStruct.getType() == type()) {
                arrayList.add(anchorCommonStruct);
            }
        }
        for (AnchorCommonStruct anchorCommonStruct2 : arrayList) {
            try {
                new p();
                String extra = anchorCommonStruct2.getExtra();
                if (extra == null) {
                    extra = "";
                }
                c098200Yq = p.LIZJ(extra).LJIILIIL();
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            n nVar = (n) c098200Yq;
            if (nVar == null || (kVarLJJIIZ = nVar.LJJIIZ("GamePlayResourceSubType")) == null || (strLJIL = kVarLJJIIZ.LJIL()) == null) {
                strLJIL = "";
            }
            if (Intrinsics.LJFF(strLJIL, "I2V") && !((IAnchorService) this.LLJI.getValue()).isMagicAsyncInEditorProEnabled()) {
                list.remove(anchorCommonStruct2);
            }
        }
        return super.LJJJJLL(list);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0063 A[PHI: r12
      0x0063: PHI (r12v4 java.lang.String) = (r12v1 java.lang.String), (r12v5 java.lang.String) binds: [B:29:0x0061, B:27:0x005e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0071 A[PHI: r12
      0x0071: PHI (r12v2 java.lang.String) = (r12v1 java.lang.String), (r12v4 java.lang.String), (r12v4 java.lang.String) binds: [B:29:0x0061, B:31:0x0069, B:33:0x006f] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.AbstractC1066970ds7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIJL(android.view.View r12, X.C2344009Gk r13, java.lang.String r14) {
        /*
            Method dump skipped, instruction units count: 351
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1066420drE.LJJIJL(android.view.View, X.09Gk, java.lang.String):void");
    }
}

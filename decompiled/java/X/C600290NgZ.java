package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0NgZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C600290NgZ implements InterfaceC598990NeT {
    public final /* synthetic */ CompletionBlock<InterfaceC600400Ngk> LIZ;
    public final /* synthetic */ C600370Ngh LIZIZ;
    public final /* synthetic */ InterfaceC600410Ngl LIZJ;

    @Override // X.InterfaceC598990NeT
    public final void LIZ(C599080Nec c599080Nec) {
        C1DFH c1dfh = C0PEM.LIZ;
        Object objPut = null;
        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C600300Nga(this.LIZ, c599080Nec, null), 3);
        InterfaceC600410Ngl interfaceC600410Ngl = this.LIZJ;
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("code", Integer.valueOf(c599080Nec.LIZ)), new Pair("message", c599080Nec.LIZIZ), new Pair("name", interfaceC600410Ngl.getName()));
        try {
            Map<String, Object> data = interfaceC600410Ngl.getData();
            if (data != null) {
                objPut = mapLJIIJ.put("params", C1741890vQh.LJIIIIZZ(data));
            }
            C189200o6.m2constructorimpl(objPut);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        C1018703yb.LJ("rd_tiktokec_sea_content_action_callback", mapLJIIJ);
    }

    @Override // X.InterfaceC598990NeT
    public final void LIZIZ(C599060Nea c599060Nea) {
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C600310Ngb(this.LIZ, this.LIZIZ, c599060Nea, null), 3);
    }

    public C600290NgZ(CompletionBlock<InterfaceC600400Ngk> completionBlock, C600370Ngh c600370Ngh, InterfaceC600410Ngl interfaceC600410Ngl) {
        this.LIZ = completionBlock;
        this.LIZIZ = c600370Ngh;
        this.LIZJ = interfaceC600410Ngl;
    }
}

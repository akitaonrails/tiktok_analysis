package X;

import com.lynx.tasm.LynxView;
import com.lynx.tasm.TemplateData;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Pcg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C648840Pcg extends C648850Pch {
    public C648840Pcg(InterfaceC1541990qEH interfaceC1541990qEH) {
        super(interfaceC1541990qEH);
    }

    @Override // X.C648850Pch
    public final void LIZIZ(TemplateData templateData) {
        C646940PZc c646940PZc = (C646940PZc) this.LIZ.getHybridContext().LJFF(C646940PZc.class);
        if (c646940PZc != null && c646940PZc.LIZ) {
            ((LynxView) this.LIZ).updateData(templateData);
        } else {
            super.LIZIZ(templateData);
        }
    }

    @Override // X.C648850Pch
    public final void LIZJ(DynamicPatch dynamicPatch) {
        C646940PZc c646940PZc = (C646940PZc) this.LIZ.getHybridContext().LJFF(C646940PZc.class);
        if (c646940PZc != null && c646940PZc.LIZ) {
            C1537710q7N c1537710q7N = (C1537710q7N) this.LIZ;
            C647380PaK c647380PaK = C647380PaK.LJIIIIZZ;
            C1537480q70 hybridContext = c1537710q7N.getHybridContext();
            c647380PaK.getClass();
            c1537710q7N.updateData(C647380PaK.LIZLLL(dynamicPatch, null, hybridContext));
            return;
        }
        super.LIZJ(dynamicPatch);
    }

    @Override // X.C648850Pch
    public final void LIZLLL(String str) {
        C646940PZc c646940PZc = (C646940PZc) this.LIZ.getHybridContext().LJFF(C646940PZc.class);
        if (c646940PZc != null && c646940PZc.LIZ) {
            C1537710q7N c1537710q7N = (C1537710q7N) this.LIZ;
            C647380PaK c647380PaK = C647380PaK.LJIIIIZZ;
            String schema = c1537710q7N.getSchema();
            C1537480q70 hybridContext = ((C1537710q7N) this.LIZ).getHybridContext();
            c647380PaK.getClass();
            c1537710q7N.updateData(C647380PaK.LJ(schema, str, null, hybridContext));
            return;
        }
        super.LIZLLL(str);
    }

    @Override // X.C648850Pch
    public final void LIZ(String str, JSONObject jSONObject) {
        super.LIZ(str, jSONObject);
    }
}

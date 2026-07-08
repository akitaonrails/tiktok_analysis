package X;

import com.bytedance.bpea.basics.Cert;
import com.bytedance.pumbaa.bpea.adapter.BPEAMonitorTransform;
import com.bytedance.pumbaa.utility.dfid.AutoDFIDManager;

/* JADX INFO: renamed from: X.0WZG, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WZG extends C0WZL {
    @Override // X.C0WZU
    public final String name() {
        return "CommonContextHandler";
    }

    @Override // X.C0WZL
    public final void LIZIZ(C0WZJ c0wzj) {
        Integer numLIZ;
        String string;
        C825940Wae c825940Wae;
        Cert cert;
        BPEAMonitorTransform.LIZ.getClass();
        C0WZB c0wzb = BPEAMonitorTransform.LIZIZ.get();
        if (c0wzb != null && (c825940Wae = c0wzb.LIZ) != null && (cert = c825940Wae.LIZ) != null) {
            String strCertToken = cert.certToken();
            if (strCertToken != null) {
                c0wzj.LIZ("cert_token", new C0WQ8(EnumC823400WRu.String, strCertToken));
            }
            Integer numLIZ2 = C825920Wac.LIZ(cert);
            if (numLIZ2 != null) {
                c0wzj.LIZ("dfid", new C0WQ8(EnumC823400WRu.String, Integer.valueOf(numLIZ2.intValue())));
            }
        }
        EnumC823400WRu enumC823400WRu = EnumC823400WRu.String;
        c0wzj.LIZ("call_site", new C0WQ8(enumC823400WRu, c0wzj.LJFF.LIZLLL));
        if (AutoDFIDManager.LIZIZ && (numLIZ = AutoDFIDManager.LIZ(8600001)) != null && (string = numLIZ.toString()) != null) {
            c0wzj.LIZ("unidfid", new C0WQ8(enumC823400WRu, string));
        }
        EnumC823400WRu enumC823400WRu2 = EnumC823400WRu.Long;
        c0wzj.LIZ("api_id", new C0WQ8(enumC823400WRu2, Integer.valueOf(c0wzj.LIZ)));
        Object objLIZIZ = c0wzj.LJFF.LIZIZ("origin_api_id");
        if ((objLIZIZ instanceof Integer) && objLIZIZ != null) {
            c0wzj.LIZ("origin_api_id", new C0WQ8(enumC823400WRu2, objLIZIZ));
        }
        c0wzj.LIZ("process_type", new C0WQ8(EnumC823400WRu.Any, c0wzj.LJIIIZ));
    }
}

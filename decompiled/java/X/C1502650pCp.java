package X;

import com.ss.ugc.clientai.core.api.FeatureProducer;
import com.ss.ugc.clientai.core.api.meta.ReturnCode;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pCp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1502650pCp implements InterfaceC1502770pD1<String> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LIZIZ;
    public volatile C1502630pCn LIZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1502650pCp.class, "storage", "getStorage()Lcom/ss/android/ugc/aweme/im/userportrait/impl/storage/standard/StandardKevaStringStorage;", 0);
        C13LE.LIZ.getClass();
        LIZIZ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.InterfaceC1502770pD1
    public final String LJFF() {
        String strLIZJ = C1510700pPo.LIZ().LIZJ(null);
        if (strLIZJ != null) {
            return strLIZJ;
        }
        C1502630pCn c1502630pCn = this.LIZ;
        if (c1502630pCn == null) {
            synchronized (this) {
                c1502630pCn = this.LIZ;
                if (c1502630pCn == null) {
                    c1502630pCn = new C1502630pCn();
                    this.LIZ = c1502630pCn;
                }
            }
        }
        return String.valueOf(FeatureProducer.getFeature$default((FeatureProducer) c1502630pCn.LIZLLL.getValue(), c1502630pCn.LIZ, (JSONObject) null, "im_keva_feature", (ReturnCode) null, 10, (Object) null));
    }
}

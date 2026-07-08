package X;

import android.webkit.WebResourceResponse;
import com.ss.android.ugc.aweme.ad.experiment.AdLandPageResourceOptimizeExperiment;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.structure.api.ICommerceService;
import java.io.InputStream;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.AwS560S0100000_16;

/* JADX INFO: renamed from: X.0dCd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1041250dCd extends AbstractC1043470dGD {
    public final String LIZIZ;
    public final C1043260dFs LIZJ;
    public final InterfaceC1041500dD2 LIZLLL;
    public boolean LJ;
    public final AdLandPageResourceOptimizeExperiment.ResourceOptimizeModel LJFF;
    public final Set<InterfaceC1041350dCn> LJI;
    public final C01GW LJII;

    @Override // X.AbstractC1043470dGD, X.InterfaceC1041260dCe
    public final WebResourceResponse LIZ(String str) {
        return null;
    }

    @Override // X.AbstractC1043470dGD
    public final /* bridge */ /* synthetic */ InputStream LIZIZ(String str) {
        return null;
    }

    @Override // X.AbstractC1043470dGD
    public final String LIZLLL() {
        return "";
    }

    public final boolean LJFF(String str) {
        InterfaceC1042230dED interfaceC1042230dEDJH1;
        InterfaceC1040510dBR interfaceC1040510dBR = (InterfaceC1040510dBR) ((ICommerceService) ServiceManager.get().getService(ICommerceService.class)).LIZ().VW0(InterfaceC1040510dBR.class);
        if (interfaceC1040510dBR != null && (interfaceC1042230dEDJH1 = interfaceC1040510dBR.JH1(this.LIZLLL)) != null) {
            return interfaceC1042230dEDJH1.LIZ(str);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0226 A[Catch: Exception -> 0x031c, TRY_ENTER, TryCatch #0 {Exception -> 0x031c, blocks: (B:24:0x0039, B:30:0x0046, B:139:0x0226, B:145:0x0233, B:150:0x023e, B:152:0x024c, B:154:0x0252, B:156:0x0260, B:158:0x026e, B:161:0x0275, B:164:0x0286, B:166:0x0294, B:169:0x02a1, B:177:0x02bd, B:179:0x02c3, B:188:0x02df, B:190:0x02e5, B:191:0x02e7, B:193:0x02ed, B:194:0x02ef, B:195:0x02f3, B:197:0x02f9, B:199:0x0301, B:201:0x0307, B:182:0x02d0, B:185:0x02d7, B:172:0x02ae, B:176:0x02b9, B:204:0x0316), top: B:208:0x0039 }] */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0325 A[EDGE_INSN: B:207:0x0325->B:36:0x0052 BREAK  A[LOOP:0: B:195:0x02f3->B:213:0x02f3]] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0122  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.webkit.WebResourceResponse LJI(android.webkit.WebView r21, android.webkit.WebResourceRequest r22) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 808
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1041250dCd.LJI(android.webkit.WebView, android.webkit.WebResourceRequest):android.webkit.WebResourceResponse");
    }

    public C1041250dCd(String str, C1043260dFs c1043260dFs, C1035880d3y c1035880d3y) {
        super(true);
        this.LIZIZ = str;
        this.LIZJ = c1043260dFs;
        this.LIZLLL = c1035880d3y;
        this.LJFF = AdLandPageResourceOptimizeExperiment.LIZ();
        this.LJI = new LinkedHashSet();
        this.LJII = C452501pT.LIZIZ(new AwS560S0100000_16(this, 856));
    }
}

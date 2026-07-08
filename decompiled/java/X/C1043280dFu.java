package X;

import com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.io.InputStream;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS50S0100100_16;
import kotlin.jvm.internal.AwS560S0100000_16;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0dFu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1043280dFu extends AbstractC1043470dGD {
    public final Function1<String, Unit> LIZIZ;
    public Map<String, C1043350dG1> LIZJ;
    public JSONObject LIZLLL;
    public final C01GW LJ;
    public final C01GW LJFF;

    @Override // X.AbstractC1043470dGD
    public final InputStream LIZIZ(String str) {
        return null;
    }

    @Override // X.AbstractC1043470dGD
    public final String LIZLLL() {
        return "";
    }

    public final String LJFF() {
        if (ServiceManager.get().getService(IAdLandPagePreloadService.class) != null) {
            return C1552050qUV.LJ((String) this.LJFF.getValue(), "pixel_preload");
        }
        return null;
    }

    public C1043280dFu(AwS50S0100100_16 awS50S0100100_16) {
        super(true);
        this.LIZIZ = awS50S0100100_16;
        this.LJ = C452501pT.LIZIZ(new AwS560S0100000_16(this, 741));
        this.LJFF = C452501pT.LIZIZ(new AwS560S0100000_16(this, 740));
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c1  */
    @Override // X.AbstractC1043470dGD, X.InterfaceC1041260dCe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.webkit.WebResourceResponse LIZ(java.lang.String r9) {
        /*
            Method dump skipped, instruction units count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1043280dFu.LIZ(java.lang.String):android.webkit.WebResourceResponse");
    }
}

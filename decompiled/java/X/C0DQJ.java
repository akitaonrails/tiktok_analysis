package X;

import Y.ARunnableS73S0200000_4;
import android.net.Uri;
import android.webkit.WebView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.amazon.model.AmazonWebMessage;

/* JADX INFO: renamed from: X.0DQJ, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DQJ implements InterfaceC828190WeH {
    public final WebView LIZ;
    public final C0DHD LIZIZ;
    public final InterfaceC1036110d4L LIZJ;
    public final C1035880d3y LIZLLL;

    @Override // X.InterfaceC828190WeH
    public final void LJ() {
        C1440005kM.LIZ(new C0DQL(this.LIZ.hashCode()));
    }

    public static String LJFF(String str) {
        String path;
        Uri uri = UriProtector.parse(str);
        String authority = uri.getAuthority();
        if (authority == null || (path = uri.getPath()) == null) {
            return null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(authority);
        sbLIZ.append(path);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC828190WeH
    public final void LIZ(AmazonWebMessage amazonWebMessage) {
        C0DHD c0dhd;
        String str = amazonWebMessage.url;
        if (str != null && (c0dhd = this.LIZIZ) != null) {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C315280CXm(c0dhd, str, null), 3);
        }
    }

    @Override // X.InterfaceC828190WeH
    public final void LIZIZ(AmazonWebMessage amazonWebMessage) {
        HandlerHook.viewPost(this.LIZ, new ARunnableS73S0200000_4(this, amazonWebMessage, 57));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0058  */
    @Override // X.InterfaceC828190WeH
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(com.ss.android.ugc.aweme.amazon.model.AmazonWebMessage r7) {
        /*
            Method dump skipped, instruction units count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0DQJ.LIZJ(com.ss.android.ugc.aweme.amazon.model.AmazonWebMessage):void");
    }

    @Override // X.InterfaceC828190WeH
    public final void LIZLLL(AmazonWebMessage amazonWebMessage) {
        C0DHD c0dhd = this.LIZIZ;
        if (c0dhd != null) {
            c0dhd.LJ(amazonWebMessage.url);
        }
    }

    public C0DQJ(WebView webView, C0DHD c0dhd, InterfaceC1036110d4L interfaceC1036110d4L, C1035880d3y c1035880d3y) {
        this.LIZ = webView;
        this.LIZIZ = c0dhd;
        this.LIZJ = interfaceC1036110d4L;
        this.LIZLLL = c1035880d3y;
    }
}

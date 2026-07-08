package X;

import com.bytedance.helios.network.NetworkComponent;
import com.bytedance.helios.network.api.config.NetworkConfig;
import java.net.URL;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.0Wxs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C840340Wxs {
    public final URL LIZ;
    public final Map<String, String> LIZIZ;
    public final Map<String, String> LIZJ = new LinkedHashMap();
    public final Set<String> LIZLLL = new LinkedHashSet();
    public final Map<String, String> LJ = new LinkedHashMap();
    public String LJFF;

    public final C840350Wxt LIZ() {
        URL url;
        String string;
        NetworkConfig networkConfigNetworkConfigOrNull = NetworkComponent.INSTANCE.networkConfigOrNull();
        if (networkConfigNetworkConfigOrNull == null || !networkConfigNetworkConfigOrNull.enableNativeRequestInterceptorModifyQuery) {
            this.LJFF = null;
            ((LinkedHashMap) this.LJ).clear();
        }
        if (this.LJFF == null) {
            if (!(!this.LIZJ.isEmpty()) && !(!this.LIZLLL.isEmpty())) {
                return new C840350Wxt(EnumC840370Wxv.NOT_MODIFIED);
            }
            C840350Wxt c840350Wxt = this.LJ.isEmpty() ^ true ? new C840350Wxt(EnumC840370Wxv.BOTH_MODIFIED) : new C840350Wxt(EnumC840370Wxv.HEADER_MODIFIED);
            if (!this.LIZJ.isEmpty()) {
                c840350Wxt.LIZJ = this.LIZJ;
            }
            if (!this.LIZLLL.isEmpty()) {
                c840350Wxt.LIZLLL = this.LIZLLL;
            }
            if ((true ^ this.LJ.isEmpty()) && (url = this.LIZ) != null) {
                C2086108Ff c2086108Ff = C2086108Ff.LIZ;
                Map<String, String> map = this.LJ;
                c2086108Ff.getClass();
                c840350Wxt.LIZIZ = C2086108Ff.LIZJ(url, map).toString();
            }
            return c840350Wxt;
        }
        if (!(!this.LIZJ.isEmpty()) && !(!this.LIZLLL.isEmpty()) && !(!this.LJ.isEmpty())) {
            C840350Wxt c840350Wxt2 = new C840350Wxt(EnumC840370Wxv.URL_MODIFIED);
            c840350Wxt2.LIZIZ = this.LJFF;
            return c840350Wxt2;
        }
        C840350Wxt c840350Wxt3 = new C840350Wxt(EnumC840370Wxv.BOTH_MODIFIED);
        if (!this.LJ.isEmpty()) {
            C2086108Ff c2086108Ff2 = C2086108Ff.LIZ;
            URL url2 = new URL(this.LJFF);
            Map<String, String> map2 = this.LJ;
            c2086108Ff2.getClass();
            string = C2086108Ff.LIZJ(url2, map2).toString();
        } else {
            string = this.LJFF;
        }
        c840350Wxt3.LIZIZ = string;
        if (!this.LIZJ.isEmpty()) {
            c840350Wxt3.LIZJ = this.LIZJ;
        }
        if (true ^ this.LIZLLL.isEmpty()) {
            c840350Wxt3.LIZLLL = this.LIZLLL;
        }
        return c840350Wxt3;
    }

    public C840340Wxs(URL url, Map<String, String> map) {
        this.LIZ = url;
        this.LIZIZ = map;
    }
}

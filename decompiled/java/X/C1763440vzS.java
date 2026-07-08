package X;

import Y.ARunnableS53S0300000_20;
import android.view.View;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS0S1231000_26;

/* JADX INFO: renamed from: X.0vzS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1763440vzS {
    public List<String> LIZ = new ArrayList();
    public final List<String> LIZIZ = new ArrayList();
    public final Map<String, C1763410vzP> LIZJ = new LinkedHashMap();
    public boolean LIZLLL = true;

    public final void LIZ(String str) {
        if (str == null) {
            return;
        }
        if (this.LIZJ.containsKey(str)) {
            C1763410vzP c1763410vzP = (C1763410vzP) C7726030a.LIZ(str, this.LIZJ);
            if (c1763410vzP != null) {
                c1763410vzP.LIZ = false;
                c1763410vzP.LIZIZ = false;
                return;
            }
            return;
        }
        this.LIZJ.put(str, new C1763410vzP(0));
    }

    public final void LIZIZ(final View view, final int i, String str, Image image, final Boolean bool) {
        List<String> urls;
        String str2;
        final boolean z;
        if (str != null && (urls = image.getUrls()) != null && (str2 = (String) C13LP.LJJJLL(urls)) != null) {
            final boolean z2 = false;
            final String str3 = C1326840kdG.LIZ.LIZLLL(str2, false).LIZ;
            if (str3.length() == 0) {
                return;
            }
            final boolean zContains = ((ArrayList) this.LIZIZ).contains(str3);
            ((ArrayList) this.LIZIZ).add(str3);
            Map<String, C1763410vzP> map = this.LIZJ;
            String uri = image.getUri();
            String str4 = "";
            if (uri == null) {
                uri = "";
            }
            C1763410vzP c1763410vzP = (C1763410vzP) ((LinkedHashMap) map).get(uri);
            if (c1763410vzP != null) {
                z = c1763410vzP.LIZ;
            } else {
                C01GW c01gw = C1066190dqr.LIZ;
                if (C1066190dqr.LJIIIIZZ(str, image.getUri()) != null) {
                    z = true;
                } else {
                    z = false;
                }
            }
            Map<String, C1763410vzP> map2 = this.LIZJ;
            String uri2 = image.getUri();
            if (uri2 != null) {
                str4 = uri2;
            }
            C1763410vzP c1763410vzP2 = (C1763410vzP) ((LinkedHashMap) map2).get(str4);
            if (c1763410vzP2 != null) {
                z2 = c1763410vzP2.LIZIZ;
            }
            C1260120ite.LIZ(new ARunnableS53S0300000_20(this, UriProtector.parse(str3), new InterfaceC442640HXi() { // from class: X.0vzZ
                @Override // X.InterfaceC442640HXi
                public final void onResult(Object obj) {
                    C1748720vbi.LIZLLL(view, new C1763520vza(), new AwS0S1231000_26(str3, i, z, z2, (Integer) obj, zContains, bool, 1));
                }
            }, 63));
        }
    }
}

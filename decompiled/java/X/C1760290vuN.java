package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.communication.ISeaPdpCommunicationService;
import java.util.Map;

/* JADX INFO: renamed from: X.0vuN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1760290vuN {
    public final String LIZ;
    public final String LIZIZ;
    public final Map<String, Object> LIZJ;
    public final Map<String, Object> LIZLLL;
    public final ISeaPdpCommunicationService LJ;
    public final Map<String, Object> LJFF;
    public final InterfaceC1760150vu9<?> LJI;

    public /* synthetic */ C1760290vuN(String str, Map map, Map map2, ISeaPdpCommunicationService iSeaPdpCommunicationService, int i) {
        this("product_review", str, (i & 4) != 0 ? null : map, (i & 8) == 0 ? map2 : null, iSeaPdpCommunicationService, null, null);
    }

    public C1760290vuN(String str, String str2, Map<String, ? extends Object> map, Map<String, ? extends Object> map2, ISeaPdpCommunicationService iSeaPdpCommunicationService, Map<String, ? extends Object> map3, InterfaceC1760150vu9<?> interfaceC1760150vu9) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = map;
        this.LIZLLL = map2;
        this.LJ = iSeaPdpCommunicationService;
        this.LJFF = map3;
        this.LJI = interfaceC1760150vu9;
    }
}

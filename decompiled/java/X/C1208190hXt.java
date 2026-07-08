package X;

import com.bytedance.bpea.basics.Cert;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0hXt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1208190hXt {
    public static final C1208190hXt LJIIJ;
    public final C0V0R LIZ;
    public final Map<String, C1208160hXq> LIZIZ;
    public final Map<String, C00R9> LIZJ;
    public final Map<String, C1208180hXs> LIZLLL;
    public final List<C1209840haY> LJ;
    public final String LJFF;
    public final String LJI;
    public final int LJII;
    public final String LJIIIIZZ;
    public final String LJIIIZ;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        new C1208580hYW();
        LJIIJ = new C1208190hXt((C0V0R) null, (Map) new LinkedHashMap(), (Map) new LinkedHashMap(), C2097608Jq.LJ(), (List) new ArrayList(), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), -1, (String) (0 == true ? 1 : 0), 768);
    }

    public final C1208160hXq LIZ(Cert cert) {
        return this.LIZIZ.get(cert.certToken());
    }

    public /* synthetic */ C1208190hXt(C0V0R c0v0r, Map map, Map map2, Map map3, List list, String str, String str2, int i, String str3, int i2) {
        this((i2 & 1) != 0 ? null : c0v0r, (Map<String, C1208160hXq>) map, (Map<String, C00R9>) map2, (Map<String, C1208180hXs>) map3, (List<C1209840haY>) list, (i2 & 32) != 0 ? null : str, str2, i, (String) null, (i2 & 512) != 0 ? "common" : str3);
    }

    public C1208190hXt(C0V0R c0v0r, Map<String, C1208160hXq> map, Map<String, C00R9> map2, Map<String, C1208180hXs> map3, List<C1209840haY> list, String str, String str2, int i, String str3, String str4) {
        this.LIZ = c0v0r;
        this.LIZIZ = map;
        this.LIZJ = map2;
        this.LIZLLL = map3;
        this.LJ = list;
        this.LJFF = str;
        this.LJI = str2;
        this.LJII = i;
        this.LJIIIIZZ = str3;
        this.LJIIIZ = str4;
    }
}

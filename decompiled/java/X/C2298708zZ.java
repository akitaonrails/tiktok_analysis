package X;

import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;

/* JADX INFO: renamed from: X.08zZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2298708zZ {
    public File LIZ;
    public int LIZIZ;
    public final Set<String> LIZJ;
    public String LIZLLL;
    public String LJ;
    public int LJFF;
    public int LJI;
    public boolean LJII;
    public String LJIIIIZZ;
    public String LJIIIZ;
    public final Map<String, String> LJIIJ;

    static {
        new C2298708zZ(0);
    }

    public final String LIZ() {
        String name;
        File file = this.LIZ;
        return (file == null || (name = file.getName()) == null) ? "" : name;
    }

    public final Map<String, String> LIZIZ() {
        String absolutePath;
        Pair[] pairArr = new Pair[9];
        File file = this.LIZ;
        if (file == null || (absolutePath = file.getAbsolutePath()) == null) {
            absolutePath = "";
        }
        pairArr[0] = new Pair("model_path", absolutePath);
        pairArr[1] = new Pair("backend", this.LJ);
        pairArr[2] = new Pair("num_thread", String.valueOf(this.LJFF));
        pairArr[3] = new Pair("gpy_layer", String.valueOf(this.LIZIZ));
        pairArr[4] = new Pair("max_kv_length", String.valueOf(this.LJI));
        pairArr[5] = new Pair("open_profiling", String.valueOf(this.LJII));
        pairArr[6] = new Pair("forward_data_type", this.LJIIIZ);
        pairArr[7] = new Pair("memory", this.LJIIIIZZ);
        pairArr[8] = new Pair("runtime_cache_path", this.LIZLLL);
        return C2097608Jq.LJIIIIZZ(pairArr);
    }

    public C2298708zZ(int i) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.LIZ = null;
        this.LIZIZ = 0;
        this.LIZJ = linkedHashSet;
        this.LIZLLL = "/data/local/tmp/";
        this.LJ = "OpenCL";
        this.LJFF = 2;
        this.LJI = DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL;
        this.LJII = false;
        this.LJIIIIZZ = "high";
        this.LJIIIZ = "";
        this.LJIIJ = linkedHashMap;
    }
}
